package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.EventsPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;


public class EventsStepDefs {

    EventsPage eventsPage = new EventsPage();

    @Given("the user should be able to be in the {string} page")
    public void the_user_should_be_able_to_be_in_the_page(String moduleName) {
        eventsPage.navigateToModule("Events");
        BrowserUtils.waitForPageToLoad(10);

        String expectedResult = Driver.get().getTitle();
        String actualResult = "Events - Odoo";
        Assert.assertEquals("Verify that the page title is correct", expectedResult, actualResult);
    }

}
