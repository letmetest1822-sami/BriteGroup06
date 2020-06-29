package com.BriteGroup06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsideEventPage extends BasePage{

    @FindBy(xpath = "//span[@name='date_begin']")
    public WebElement beginDate;

}
