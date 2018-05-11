package com.argos.demo.steps;

import com.argos.demo.page_object.SearchResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;

public class FiltersSteps {

    SearchResultsPage searchResultsPage=new SearchResultsPage();

    @When("^I set filter \"([^\"]*)\" is \"([^\"]*)\"$")
    public void i_set_filter_is(String filterType, String filterValue){
        searchResultsPage.selectFilters(filterValue);
    }

    @Then("^I should see products are filtered with \"([^\"]*)\"$")
    public void iShouldSeeProductsAreFilteredWith(Double expected) {
        List<Double> actualRatings= searchResultsPage.getAllStarRatings();
        System.out.println("list"+actualRatings);
        assertThat(actualRatings,everyItem(greaterThan(expected)));
    }
}
