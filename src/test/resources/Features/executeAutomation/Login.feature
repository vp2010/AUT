Feature: Login feature

  Background:
    Given I launch app

  @First
  Scenario: valid login
    Given I start application
    When I login with username and password
    Then I verify page title

# surefire plugin failure handling

  @First
  Scenario: valid login
    Given I start application
    When I login with username and password
    Then I verify page not exist



#    Cucumber variation

  @Parameter
  Scenario: login with valid username and password as "iPass123"
    Given I start application
    Then I login with username as "iUsername" and password as "iPass123"
    Then I verify page title

  @DataTable
  Scenario: login scenario using Datatable
    Given I start application
    Then I login using following information
      | id | name | city    | dob  |
      | s1 | sam  | chicago | s123 |
    Then I verify page title

  @DataTable_pojo
  Scenario: login scenario using Datatable_pojo
    Given I start application
    Then I print following information
      | firstName | lastName | city      | state    | country |
      | Abhay     | Shah     | Ahmedabad | Gujarat  | India   |
      | Sam       | Milind   | Chicago   | Illinois | USA     |
      | Nancy     | Cruz     | Brisbane  | London   | U.K.    |
    Then I verify page title


  @Example
  Scenario Outline: login scenario with multiple user
    Given I start application
    Then I login with username as "<user>"
    Then I verify page title

    Examples:
      | user |
      | mike |
      | tim  |
      | sam  |





