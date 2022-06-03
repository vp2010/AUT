Feature: shopping cart Steps

  @smoke
  Scenario: shopping cart checkout verification
    Given set web url as "www.saucedemo.com"
    And user login to web with following credentials
      | username      | password     |
      | standard_user | secret_sauce |
    And  product page is displayed
    Then user short item based on "price low to high"
    And user selects following items to cart
      | item 0 |
      | item 1 |
    Then user navigates to checkout page
    And  checkout page displays
    Then user verifies item in cart
    Then user removes following items from cart
      | items to remove |
    Then user continue shopping
    And user selects following items to cart
      | items to add |
      | item2        |
    Then user verifies item in cart
    And  user proceed to checkout
    Then user fills user information
    And  user verifies total price
    Then user click finish