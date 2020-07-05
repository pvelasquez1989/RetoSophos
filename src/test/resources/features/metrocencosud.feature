
Feature: Sophos Challenge refers to MetroCencosud page
  An user wants to get an item from MetroCencosud home page

@Cencosud @TestCase1
  Scenario Outline: Successful Case
  Narrative: Add an item to the basket

    Given an user enters the MetroCencosud page
    When the user search a product
      | number   | <number>     |
      | article  | <article>   |

    Then the user check the product on basket
      | validation   | <validation>   |

  Examples:
    | number   | article        | validation     |
    | 1        | Lavadora       | Tienes 1 Items |





