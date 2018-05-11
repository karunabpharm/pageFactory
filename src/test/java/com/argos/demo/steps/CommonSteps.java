package com.argos.demo.steps;

import com.argos.demo.page_object.HomePage;
import cucumber.api.java.en.Given;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class CommonSteps {
    private HomePage homePage=new HomePage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
     String actual=   homePage.isOnHomePage();
     assertThat(actual,endsWith("co.uk/"));
    }
}
