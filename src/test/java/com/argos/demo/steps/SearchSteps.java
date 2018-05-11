package com.argos.demo.steps;

import com.argos.demo.page_object.HeaderPage;
import com.argos.demo.page_object.SearchResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SearchSteps {

    HeaderPage headerPage = new HeaderPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();


    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String searchTerm) {
        headerPage.doSearch(searchTerm);
    }


    @Then("^I should see related \"([^\"]*)\"$")
    public void iShouldSeeRelated(String prodcut) {
        List<String> actualProductList=searchResultsPage.listOfAllProdcuts();
        assertThat(actualProductList,everyItem(startsWith(prodcut)));
    }
}
