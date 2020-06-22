package com.BriteGroup06.pages;

import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
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



   /* public void goToEmployeesTab() {
        BrowserUtils.waitFor(5);
        employeesPageTab2.click();
    }*/
}
