Feature:My Time - appointment selection

  @test
  Scenario: MyTime- haircut appointment
      Given user is on homepage
      When user search for "haircut" in "San Francisco, CA"
      Then verify that multiple results are shown - at least 3
      Then user selects business with name "Test - Sabre Cuts"
      And Select "All services" in the services filter from the left panel
      And  Select staff 1 from the staff filter in the left side panel
      Then Click the "Book" button for the "Men's Haircut" service
      When user press "Select Time" in the add-on modal opened
      Then Verify that the user is presented with a list of available time slots with at least 2 entries
      And Service displayed is the one selected in the step before
      And Service price is the same as the one displayed in the step before
      And Staff selected is the staff chosen before