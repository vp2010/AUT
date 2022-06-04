Feature: I want to search for a customer
  As a service advisor
  I want to search for a customer
  so I can sell or redeem a product
#------------------------------------------------------------------------------#
  Scenario Outline: I want to search for a customer using various search criteria
    Given the following search criteria:
      | VIN | Name | Phone | Email | Contract Number |
    When I search by "<field>" and "<search string>"
    Then I can locate contracts associated with 'John Locke'
    Examples:
      | field           | search string                            |
      | VIN             | 5XXGT4L37KG367983                        |
      | Name            | John Locke                               |
      | Phone           | number associated with customer          |
      | Email           | email address associated with customer   |
      | Contract Number | contract number associated with customer |

#------------------------------------------------------------------------------#
  Scenario Outline: I want a response when no products are associated with my search
    Given the following search criteria:
      | VIN | Name | Phone | Email | Contract Number |
    When I search by "<field>" and "<search string>"
    But there are no products associated with my search
    Then I will see "<response>"

    Examples:
      | field           | search string        | response                                                                   |
      | VIN             | 5XXGT4L37KG367985    | VIN failed to decode please try to re-enter or contact Kornerstone Support |
      | Name            | Timber Wolfe         | No products are available                                                  |
      | Phone           | 701-878-9999         | No products are available                                                  |
      | Email           | email9999@email.net  | No products are available                                                  |
      | Contract Number | MS01                 | No products are available                                                  |
