package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.LeavesPage;
import com.BriteGroup06.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.BrowserType;

public class LeavesStepDefs {

    @Given("the user should be able to be enter {string}")
    public void the_user_should_be_able_to_be_enter(String string) {
        new LeavesPage().navigateToModule("Leaves");
        BrowserUtils.waitForPageToLoad(3);

    }
    @Then("page title should have the title {string}")
    public void page_title_should_have_the_title(String expected) {
       BrowserUtils.waitFor(3);
       String actual=new LeavesPage().getPageSubTitle();
       Assert.assertEquals("verification is Ok",expected,actual);
    }
    @Then("the user should create a new request by clicking on Create button")
    public void the_user_should_create_a_new_request_by_clicking_on_button() {
        BrowserUtils.waitFor(3);
        new LeavesPage().createLeaves.click();

    }
    @Then("the user should create with {string} Description")
    public void the_user_should_create_with_Description(String string) {
        BrowserUtils.waitFor(3);
        new LeavesPage().sendNameDescription.sendKeys(string);
    }
}
