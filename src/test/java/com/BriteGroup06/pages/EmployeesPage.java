package com.BriteGroup06.pages;

import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends BasePage{

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[4]" )
    protected WebElement employeesPageTab;

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Employees')]" )
    protected WebElement employeesPageTab2;

    @FindBy(className = "active" )
    protected WebElement getEmployeesPageSubtitle;

    @FindBy(className = "o_searchview_input" )
    protected WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-list-ul o_cp_switch_list active']" )
    protected WebElement listBtn;

    @FindBy(xpath = "//button[@data-original-title='Kanban']" )
    protected WebElement kanbanBtn;

    @FindBy(xpath = "(//button[@aria-label='Previous'])[1]" )
    protected WebElement previousBtn;

    @FindBy(xpath = "(//button[@aria-label='Next'])[1]" )
    protected WebElement nextBtn;

    //span[contains(text(),'Antoine Langlais')]
    //li[contains(text(),'Antoine Langlais')]


    public void goToEmployeeDetails(String empName) {
        String xpathEmpName = "//span[contains(text(),'" + empName + "')]";
        WebElement empNameButton = Driver.get().findElement(By.xpath(xpathEmpName));
        BrowserUtils.waitForPageToLoad(10);
        empNameButton.click();
    }
    public Boolean checkEmployeeDetails(String empName) {
        String xpathEmpTitle = "//li[contains(text(),'" + empName + "')]";
        System.out.println(Driver.get().findElement(By.xpath(xpathEmpTitle)).isDisplayed());
        BrowserUtils.waitForPageToLoad(10);
        return Driver.get().findElement(By.xpath(xpathEmpTitle)).isDisplayed();

    }





}
