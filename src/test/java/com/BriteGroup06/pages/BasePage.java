package com.BriteGroup06.pages;

import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {
=======
public class  BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='o_loading']" )
    @CacheLookup
    protected WebElement loading;

    @FindBy(className = "oe_topbar_name")
    public WebElement userName;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement pageSubTitle;

    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoadingDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loading));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUserName(){
        waitUntilLoadingDisappear();
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }


    /**
     * @return page name, works for only Notes, Contacts, Events, Employees Pages
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoadingDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }
    public void goToMyUser(){
        waitUntilLoadingDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
    }

    /**
     * This method will navigate user to the specific module in BriteERP application.
     * For example: if tab is equals to Contacts,
     * Then method will navigate user to this page: http://app.briteerp.com/web/login
     *
     * @param tab
     */




    public void navigateToModule(String tab) {

        String tabLocator = "//span[contains(text(),'"+ tab +"')]";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();

        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        BrowserUtils.waitFor(2);

    }
}
