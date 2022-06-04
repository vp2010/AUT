Feature: I want sell a Pre-paid maintenace contract
  As a service advisor
  I want to sell a PPM contract
  so I can redeem or not redeem a product
#------------------------------------------------------------------------------#
  Background: Logged in as a service advisor
    Given <url>
    When I type my <credentials>
    And I click [Log in]
    Then I am logged into the "Service Lane"
#    Examples:
#      | url                                         | credentials                 |
#      | https://knrstn-cas-stg1.pegacloud.net/prweb | uid:Advisor1 pw: $bQMmJg9r- |

#------------------------------------------------------------------------------#
  Scenario: I want to initiate a sell contract
    Given I am logged into the "Service Lane"
    When I search for a customer by "vin" "5XXGT4L37KG367983"
    But no contracts correspond to that VIN
    Then a "Sell Contract" is available renders
    And I can select the following products:
      | AC Delco | BioPledge | AC Delco Synthetic |
#------------------------------------------------------------------------------#
  Scenario Outline: I want to sell a contract for each product offered
    Given I have a sell contract for "vin" "5XXGT4L37KG367983"
    And I have the following customer information:
      #Question 1
#  "John Locke, 123 Test Way, Fairfax, VA, 12345, jl@jl.net, 1234567890"
    |John Locke| 123 Test Way| Fairfax | VA | 12345 | jl@jl.net| 1234567890 |
    When I select a "<Product>"
    And I type a "<RO Number>"
    And I click [sell]
    Then a "Sale Successful" modal pops-up
      #Question 2
    And I can confirm the "<Service Description>" "<Redeemed>" "<Available>" & "<Price>" information
    Examples:
      | Product            | RO Number | Service Description | Redeemed | Available | Price | Response                   |
      | AC Delco           | R1        | Oil Change          | 0        | 3         | 35.00 | redeem post sell        |
      | AC Delco Synthetic | R2        | Oil Change          | 0        | 3         | 45.00 | do not redeem post sell |
      | BioPledge          | R3        | -                   | 0        | 3         | 80.00 | do not redeem post sell |

#------------------------------------------------------------------------------#
  Scenario: I want to redeem a product
    Given I have sold a "AC Delco" contract for "vin" "5XXGT4L37KG367983"
    And the 'Sale Successful' modal currently displays
      #Question 3
    When I select the checkbox for "Oil Change"
    And I click [Redeem]
    Then the "Service Redemption Successful" modal appears
    And I can confirm I have "made X sale this month"
    And I can confirm I am "on track to get X sales this month"
#------------------------------------------------------------------------------#
  Scenario: I do not want to redeem a product after a sell
    Given I have sold a "AC Delco Synthetic" contract for "vin" "5XXGT4L37KG367983"
    And the 'Sale Successful' modal currently displays
    When I select the checkbox for "Oil Change"
    And I click [No, sell contract without redemption]
    Then I am returned to the "Service Lane"
#  Then "Sale Successful" modal appears
#  And I can confirm I have "made X sale this month"
#  And I can confirm I am "on track to get X sales this month"
#------------------------------------------------------------------------------#
  Scenario: I want to clear the Service Redemption Successful Modal
    Given I have redeemed a product
    And the "Service Redemption Successful" modal is displaying
    When I click [OK]
    Then I am returned to the "Service Lane"
#------------------------------------------------------------------------------#