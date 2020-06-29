package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.LoginPage;
import com.BriteGroup06.pages.LunchPage;
import com.BriteGroup06.pages.NotesPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.ConfigurationReader;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NotesStepDefs  {
    LunchPage lunchPage = new LunchPage();
    NotesPage notesPage = new NotesPage();

    @Given("the user should be logged in")
    public void theUserShouldBeLoggedIn() {
        new LoginPage().login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

    @Then("the page should have the {string} title")
    public void thePageShouldHaveTheTitle(String pageTitle) {
        lunchPage.waitUntilLoadingDisappear();
        //System.out.println("Actual pageTitle = " + new BasePage().getPageSubTitle());
        Assert.assertEquals("pageTitle should be "+pageTitle, pageTitle, lunchPage.getPageSubTitle());
    }

    @When("the user should clicks on {string} button")
    public void theUserShouldClicksOnButton(String create) throws InterruptedException {
        notesPage.createBtn.click();
        System.out.println("pageSubTitle. = " + lunchPage.pageSubTitle.getText());
    }

    @When("the user writes {string} to Note Pannel")
    public void theUserWritesToNotePannel(String noteBody) {
        BrowserUtils.waitFor(1);
        notesPage.notesPnl.clear();
        notesPage.notesPnl.sendKeys(noteBody);
    }


    @And("the user clicks on {string} button")
    public void theUserClicksOnButton(String save) {
        notesPage.saveBtn.click();
    }

    @Then("the user views {string} button")
    public void theUserViewsButton(String edit) {
        BrowserUtils.waitFor(1);

        Assert.assertTrue(edit+" button is NOT Seen",notesPage.editBtn.isDisplayed());

    }
}
