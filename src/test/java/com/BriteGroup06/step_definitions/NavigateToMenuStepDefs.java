package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.ContactsPage;
import com.BriteGroup06.pages.LunchPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigateToMenuStepDefs {

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String tab) {

        BrowserUtils.waitFor(2);
        new ContactsPage().navigateToModule(tab);
        BrowserUtils.waitFor(5);
        new LunchPage().waitUntilLoadingDisappear();

        switch (tab) {
            case "Discuss":
                Assert.assertEquals("Subtitle = #Inbox", "#Inbox", new LunchPage().getPageSubTitle());
                break;
            case "Calendar":
                Assert.assertTrue("Subtitle Contains Meeting", new LunchPage().getPageSubTitle().contains("Meeting"));
                break;
            case "Notes":
                Assert.assertEquals("Subtitle = Notes", "Notes", new LunchPage().getPageSubTitle());
                break;
            case "Contacts":
                Assert.assertEquals("Subtitle = Contacts", "Contacts", new LunchPage().getPageSubTitle());
                break;
            case "Events":
                Assert.assertEquals("Subtitle = Events", "Events", new LunchPage().getPageSubTitle());
                break;
            case "Employees":
                Assert.assertEquals("Subtitle = Employees", "Employees", new LunchPage().getPageSubTitle());
                break;
            case "Leaves Summary":
                Assert.assertEquals("Subtitle = Leaves Summary", "Leaves Summary", new LunchPage().getPageSubTitle());
                break;
            case "Expenses":
                Assert.assertEquals("Subtitle = My Expenses to Submit", "My Expenses to Submit", new LunchPage().getPageSubTitle());
                break;
            case "Lunch":
                Driver.get().switchTo().alert().accept();
                Assert.assertEquals("Subtitle = New", "New", new LunchPage().getPageSubTitle());
                break;
            case "Maintenance":

                //for conflict
                Assert.assertEquals("Subtitle = Maintenance Teams", "Maintenance Teams", new LunchPage().getPageSubTitle());
                break;
            case "Dashboards":
                Assert.assertEquals("Title =  My Dashboard - Odoo", "My Dashboard - Odoo", Driver.get().getTitle());
                break;

        }
        System.out.println("You were on the " + tab + " page");
    }

}
