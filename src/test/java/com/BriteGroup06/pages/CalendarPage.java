package com.BriteGroup06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage {
    @FindBy(xpath = "//li[contains(text(),'Meetings')]")
    public WebElement calendarPageTitle;
}
