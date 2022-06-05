Feature: complex data verification

  @smoke
  Scenario: Verify GET operation for complex data
    #post 1
    Given I perform authentication operation for "/auth/login" with body
      | email             | password |
      | karthik@email.com | haha123  |
    #get 1
    And I perform GET operation with path parameter for address "/location/"
      | id |
      | 1  |
    #post 2
    Then I should see the street name as "1st street" for "primary"


  @Demo # POST With parameter
  Scenario: verify end to end API test case
    # using map data  - worst approach
    #post 3
    Given I perform Post operation for "/create"
      | id   | name  | salary | age |
      | 31 | Robin | 5000   | 30  |
   #post 4
    #using list data - more flexible no need to define method
    Given I perform Post operation with "body" for "/create"
      | id     | 32    |
      | name   | RobinSing |
      | salary | 80000 |
      | age    | 35    |
    #get 2
    Then I perform Get operation with "pathParam" for "/employee/{id}"
      | id | 1|
    #get 4
    Then I verify employee name displayed as "Tiger Nixon"
    #get 3
    Then I perform Get operation for all employees for "/employees"
    #get 5
    Then I verify list of employees

