package com.BriteGroup06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavesPage extends BasePage{
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createLeaves;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement sendNameDescription;

}
