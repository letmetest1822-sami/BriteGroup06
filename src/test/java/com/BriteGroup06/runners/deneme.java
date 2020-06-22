package com.BriteGroup06.runners;

import com.BriteGroup06.pages.BasePage;
import com.BriteGroup06.pages.LoginPage;
import com.BriteGroup06.pages.LunchPage;
import com.BriteGroup06.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deneme {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = Driver.get();
        driver.get("http://app.briteerp.com/web/login");
        new LoginPage().login("expensesmanager85@info.com", "expensesmanager");
        new LunchPage().waitUntilLoadingDisappear();
        new LunchPage().navigateToModule("Calendar");


    }
}
