package com.BriteGroup06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EventsPage extends BasePage {

    @FindBy(xpath = "//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']/div[1]/div[2]/div")
    public List<WebElement> dateInfo;

    @FindBy(xpath = "//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']/div")
    public List<WebElement> events;

    @FindBy(css = ".o_pager_limit")
    public WebElement pageLimit;

}
