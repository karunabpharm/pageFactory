@filters
Feature: Filters
  As A end user
  I want to filter my search results
  So that i can view applied filters product

  @regression
  Scenario: Filter by review
    Given I am on homepage
    When I search for "<nike>"
    And I set filter "customer rating" is "5"
    Then I should see products are filtered

  @regression
  Scenario: Filter by price
    Given I am on homepage
    When I search for "<puma>"
    And I set filter "price" is "£5-£10"
    Then I should see products are filtered

