package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.ContactsPage;
import com.BriteGroup06.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactsStepDefs {

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String tab) {
        BrowserUtils.waitFor(5);
        new ContactsPage().navigateToModule(tab);
        BrowserUtils.waitFor(5);
        System.out.println(new ContactsPage().pageSubTitle.getText());
       Assert.assertTrue("Verify the User navigates to "+ tab +" successfully", new ContactsPage().pageSubTitle.getText().contains(tab));

    }
    @When("the user creates new contact")
    public void the_user_creates_new_contact() {
        new ContactsPage().createNewContact("Osman Osman","Ataturk Mh 1938 sk no:23","Selanik");
        Assert.assertTrue("Verify Contact is created", new ContactsPage().contactCreatedMsg.isDisplayed());
    }

}
