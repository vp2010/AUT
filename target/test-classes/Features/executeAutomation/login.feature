Feature: Login page feature


  Scenario: Login page title
    Given user navigates to login page
    When user verify page title
    Then page title should be "Login - My Store"

  Scenario: Forgot Password Link
    Given user navigates to login page
    Then forgot password link should be displayed

  Scenario: Login with valid credentials
    Given user navigates to login page
    When user login to account
      | username      | password    |
      | xyz@gmail.com | selenium123 |
    When user verify page title
    Then page title should not be "My Account - My Store"

  Scenario: new feature of cucumber5
    Then I read data using pojo
      | name | city |
      | John | Lake |
    Then I have few books in hand such as java,cs,csharp
    Then I read multiple data using pojo
      | name | city | age |
      | John | Lake | 34  |
      | Mira | Palm | 45  |