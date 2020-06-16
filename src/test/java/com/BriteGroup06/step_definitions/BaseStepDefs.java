package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.Maintenance;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.When;

public class BaseStepDefs {
    @When("the user navigate to {string} page")
    public void theUserNavigateToPage(String module) {
        new Maintenance().navigateToModule(module);
        System.out.println("title " + Driver.get().getTitle());
    }
}
