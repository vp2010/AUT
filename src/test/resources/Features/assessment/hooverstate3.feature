Feature: I want to review contract details and redeem add-on product only
  As a service advisor
  I want to be able to review "Contract Details"
  so I can sell or redeem a product
#------------------------------------------------------------------------------#
  Scenario: I want to confirm John Locke's prepaid services for AC Delco Synthetic product
    Given I searched for "name" "John Locke"
    And I confirm 3 contracts have been found
    When I select the 'AC Delco Synthetic' contract
    Then "Contract Details" display
      #Question 5
    And I can confirm 'AC Delco Synthetic' and 'Car Wash' are available for redemption
      #Question 6
    And I can confirm "AC Delco Synthetic" has 0 Redeemed and 3 Available
    And I can confirm "Car Wash" has 0 Redeemed and 3 Available
#------------------------------------------------------------------------------#
  Scenario: I want to redeem Car Wash
    Given I have selected 'AC Delco Synthetic'
    And "Contract Details" is displaying
    When I select 'Car Wash' as a "Prepaid Service" to redeem
      #Question 7
    And I type RO number as "R4"
    And I click [Redeem]
    Then I can confirm 'Service Redeemed' has replaced the [redeem] button
    And I can confirm "Car Wash" now shows 1 has been Redeemed
    And I can confirm "Car Wash" now shows 2 are Available
    And I can confirm "Car Wash" now shows in Redemption History with RO Number as "R4"
