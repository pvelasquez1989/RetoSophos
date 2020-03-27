
Feature: Sophos Challenge refers to MetroCencosud page
  An user wants to get an item from MetroCencosud home page


  Scenario Outline: Successful Case
  Narrative: Add an item to the basket

    Given an user enters the MetroCencosud page
    When the user search a product
    Then the user check the product on basket
    Examples:
      |number | product      |


