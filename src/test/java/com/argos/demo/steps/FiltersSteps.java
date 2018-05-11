package com.argos.demo.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FiltersSteps {

    @When("^I set filter \"([^\"]*)\" is \"([^\"]*)\"$")
    public void i_set_filter_is(String filterType, String filterValue){
    }

    @Then("^I should see products are filtered$")
    public void i_should_see_products_are_filtered() {
    }

}
