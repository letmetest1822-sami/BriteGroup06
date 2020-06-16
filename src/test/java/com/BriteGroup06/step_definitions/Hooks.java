package com.BriteGroup06.step_definitions;

import com.BriteGroup06.utilities.ConfigurationReader;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        System.out.println(scenario.getName()+ " Scenario is starting ... ");


    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
            System.out.println(Driver.get().getTitle() + " page failed ");
        }
//        Driver.closeDriver();
    }

}