package com.BriteGroup06.pages;

import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login" )
    protected WebElement userName;

    @FindBy(id = "password" )
    protected WebElement password;

    @FindBy(css = ".btn.btn-primary")
    protected WebElement loginBtn;

    @FindBy(css = ".alert.alert-danger" )
    protected WebElement invalidCredentialsMessage;

    public void login(String userNameStr, String passwordStr) {
        BrowserUtils.waitForClickablility(userName,5);
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginBtn.click();
        //verification that we logged
    }

    public boolean isErrorMessageDisplayed() {

        return invalidCredentialsMessage.isDisplayed();
    }

}
