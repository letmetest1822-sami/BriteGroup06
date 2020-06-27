package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.EmployeesPage;
import com.BriteGroup06.pages.LoginPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.ConfigurationReader;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EmployeesStepDefs {

    EmployeesPage employeesPage =  new EmployeesPage();
    @Given("the user is logged in with proper credentials")
    public void the_user_is_logged_in_with_proper_credentials() {
        new LoginPage().login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("page should have the title {string}")
    public void page_should_have_the_title(String tab) {
        BrowserUtils.waitForPageToLoad(10);
        new EmployeesPage().navigateToModule(tab);
        BrowserUtils.waitForPageToLoad(10);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());

        String expectedResult = Driver.get().getTitle();
        String actualResult = tab+" - Odoo";
        Assert.assertEquals("Verify that the page title is correct", expectedResult, actualResult);


    }

    @When("user click on {string} name")
    public void user_click_on_name(String empName) {
        BrowserUtils.waitFor(5);
        BrowserUtils.waitForPageToLoad(10);

        employeesPage.goToEmployeeDetails(empName);

        System.out.println("empName = " + empName);

        BrowserUtils.waitForPageToLoad(10);
    }

    @Then("the details of {string} should be displayed")
    public void the_details_of_should_be_displayed(String empName2) {
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertTrue("Details of the employee is displayed", employeesPage.checkEmployeeDetails(empName2));

    }


}
