package com.BriteGroup06.pages;

import com.BriteGroup06.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsPage extends BasePage{

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement companyInputBox;

    @FindBy(xpath = "//input[@name='street']")
    public List<WebElement> addressTypeDDown;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetBox1;

    @FindBy(xpath = "//input[@name='street2']")
    public WebElement streetBox2;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//*[@name='state_id']")
    public List<WebElement> stateDDown;

    @FindBy(xpath = "//*[@name='zip']")
    public WebElement zipBox;

    @FindBy(xpath = "country_id")
    public List<WebElement> countryDDown;

    @FindBy(xpath = "//li[@id='ui-id-248']//a[contains(text(),'Search More...')]")
    public WebElement searchMoreBtn;

    @FindBy(xpath = "//div[@class='o_searchview']//input[@placeholder='Search...']")
    public WebElement searchCountryBox;

    @FindBy(xpath = "//td[contains(text(),'Turkey')]")
    public WebElement turkeyChoice;

    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement saveContactBtn;

    @FindBy(xpath = "//*[.='Contact created']")
    public WebElement contactCreatedMsg;


    public void createNewContact(String fullname, String address, String city) {
        createBtn.click();
        BrowserUtils.waitFor(5);
        nameInputBox.sendKeys(fullname);
        BrowserUtils.waitFor(2);
        streetBox1.sendKeys(address);
        BrowserUtils.waitFor(2);
        cityBox.sendKeys(city);
        BrowserUtils.waitFor(2);
        saveContactBtn.click();
        BrowserUtils.waitFor(2);
        //BrowserUtils.waitForPageToLoad(3);

    }
}
