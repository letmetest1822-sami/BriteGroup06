package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.CalendarPage;
import com.BriteGroup06.pages.ContactsPage;
import com.BriteGroup06.pages.EmployeesPage;
import com.BriteGroup06.pages.LoginPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.ConfigurationReader;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {
    @Then("page should contain the title {string}")
    public void page_should_contain_the_title(String tab) {
        BrowserUtils.waitForPageToLoad(10);
        new EmployeesPage().navigateToModule(tab);
        BrowserUtils.waitForPageToLoad(10);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertTrue("verify true",Driver.get().getTitle().contains(tab));

    }


    @When("the user should clicks on {string}")
    public void the_user_should_clicks_on(String str) {
        BrowserUtils.waitFor(5);
        new ContactsPage().navigateToModule(str);
        BrowserUtils.waitFor(5);
        Assert.assertTrue("verify",new ContactsPage().pageSubTitle.getText().contains("Meetings"));
    }



}
