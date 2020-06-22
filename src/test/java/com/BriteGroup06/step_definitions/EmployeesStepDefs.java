package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.EmployeesPage;
import com.BriteGroup06.pages.LoginPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.ConfigurationReader;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EmployeesStepDefs {

    EmployeesPage employeesPage =  new EmployeesPage();
    @Given("the user is logged in with proper credentials")
    public void the_user_is_logged_in_with_proper_credentials() {
        new LoginPage().login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("page should have the title {string}")
    public void page_should_have_the_title(String pageTitle) {
        BrowserUtils.waitFor(1);
        employeesPage.goToEmployeesTab();
        BrowserUtils.waitFor(2);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());

    }


}
