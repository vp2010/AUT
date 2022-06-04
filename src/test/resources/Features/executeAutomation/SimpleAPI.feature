Feature: API testing

  @api1
  Scenario: verify author from services
    And I perform GET for the post number "1"


  @api2
  Scenario: verify author from services
    Then I should see the author name as "Karhik KK"

