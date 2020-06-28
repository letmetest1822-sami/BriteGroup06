package com.BriteGroup06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsPage extends BasePage {

    @FindBy(css = ".o_pager_limit")
    public WebElement pageLimit;

}
