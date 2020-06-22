package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.LunchPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigateToMenuStepDefs {

    @When("the user click on the {string} tab")
    public void the_user_click_on_the_tab(String tab) {
        new BasePage().navigateToModule(tab);

    }
    @Then("{string} menu subTitle should be {string}")
    public void menu_subTitle_should_be(String tabName, String expectedTitle) {
        new LunchPage().waitUntilLoadingDisappear();
        BrowserUtils.waitFor(4);
        switch (tabName){
            case "Discuss":
                Assert.assertEquals("Subtitle = #Inbox",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Calendar":
                Assert.assertTrue("Subtitle Contains Meeting",new LunchPage().getPageSubTitle().contains(expectedTitle));
                break;
            case "Notes":
                Assert.assertEquals("Subtitle = Notes",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Contacts":
                Assert.assertEquals("Subtitle = Contacts",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Events":
                Assert.assertEquals("Subtitle = Events",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Employees":
                Assert.assertEquals("Subtitle = Employees",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Leaves Summary":
                Assert.assertEquals("Subtitle = Leaves Summary",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Expenses":
                Assert.assertEquals("Subtitle = My Expenses to Submit",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Lunch":
                Driver.get().switchTo().alert().accept();
                Assert.assertEquals("Subtitle = New",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Maintenance":
                Assert.assertEquals("Subtitle = Maintenance Teams",expectedTitle,new LunchPage().getPageSubTitle());
                break;
            case "Dashboards":
                Assert.assertEquals("Title =  My Dashboard - Odoo",expectedTitle,Driver.get().getTitle());
                break;
        }
    }


}
