@search
Feature: Search
  As a end user
  I want to search for a product
  So that i can view the respective products

  @smoke
  Scenario Outline: Search for a product
    Given I am on homepage
    When I search for "<product>"
    Then I should see related "<product>"
    Examples:
      | product |
      | nike    |