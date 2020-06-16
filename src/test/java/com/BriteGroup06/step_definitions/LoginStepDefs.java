package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.LoginPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
        @Then("the user should be able to login with valid credentials {string} {string}")
        public void the_user_should_be_able_to_login_with_valid_credentials(String username, String password) {
            loginPage.login(username, password);

            BrowserUtils.waitFor(2);
            Assert.assertEquals("Verify that user is on the Inbox page",
                    "Odoo", Driver.get().getTitle());
            System.out.println("Your positive login test was successful");
        }

        @Then("the user should NOT be able to login with invalid credentials {string} {string}")
        public void the_user_should_NOT_be_able_to_login_with_invalid_credentials(String username, String password) {
            loginPage.login(username, password);
            Assert.assertTrue("Verify invalid credentials message is displayed",
                    loginPage.isErrorMessageDisplayed());
            System.out.println("Your negative login test was successful");

        }







}
