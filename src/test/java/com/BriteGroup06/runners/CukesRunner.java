package com.BriteGroup06.runners;


import com.BriteGroup06.pages.LoginPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/BriteGroup06/step_definitions",
        dryRun =false,
        tags = "@smoke"

        )
public class CukesRunner {
}
