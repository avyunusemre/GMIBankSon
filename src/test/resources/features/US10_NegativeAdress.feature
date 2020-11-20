@US10Negative
Feature: Address of customer can be created

  Background:
    Given User is on GMIBank Login page
    And user provide valid username "Team5Employee"
    And user provide valid password "employeeTeam5"
    And user click sign in button
    And user clicks on My Operations
    And user clicks on Manage Customer
    And user clicks on Create a new Customer


    @US10Negative_TC001
    Scenario: Address only as street should be provided
      Given user fills in the SSN textbox "352-34-4678"
      And user clicks on the Search button
      And user fills in the Middle Initial textbox with valid credential
      And user fills in the Phone Number textbox with valid credential
      And user fills in the Zip Code text box with valid credential
      And Address only as street should be provided
      And user fills in the City textbox with valid credential "Dakota City"
      And user selects a country from Country dropdown
      And user fills in the State textbox with valid credential "North Dakota"
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees redframe around the adress box and feedback message


    @US10Negative_TC002
    Scenario: Leave the "Address" text box empty
      Given user fills in the SSN textbox "564-98-8768"
      And user clicks on the Search button
      And user fills in the Middle Initial textbox with valid credential
      And user fills in the Phone Number textbox with valid credential
      And user fills in the Zip Code text box with valid credential
      And user clears in the Address textbox
      And user fills in the City textbox with valid credential "Dakota City"
      And user selects a country from Country dropdown
      And user fills in the State textbox with valid credential "North Dakota"
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees redframe around the adress box and feedback message

    @US10Negative_TC003
    Scenario: Leave the "City" text box empty
      Given user fills in the SSN textbox "564-98-8768"
      And user clicks on the Search button
      And user fills in the Middle Initial textbox with valid credential
      And user fills in the Phone Number textbox with valid credential
      And user fills in the Zip Code text box with valid credential
      And user selects a country from Country dropdown
      And user fills in the State textbox with valid credential "North Dakota"
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees redframe around the citybox and feedback message


    @US10Negative_TC004
    Scenario: Don't select a country from country dropdown
      Given user fills in the SSN textbox "564-98-8768"
      And user clicks on the Search button
      And user fills in the Middle Initial textbox with valid credential
      And user fills in the Phone Number textbox with valid credential
      And user fills in the Zip Code text box with valid credential
      And user fills in the City textbox with valid credential "Dakota City"
      And user fills in the State textbox with valid credential "North Dakota"
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees the error message

    @US10Negative_TC005
    Scenario: Fill in the "State" text box, but not as US state
      Given user fills in the SSN textbox "342-21-2352"
      And user clicks on the Search button
      And user fills in the Middle Initial textbox with valid credential
      And user fills in the Phone Number textbox with valid credential
      And user fills in the Zip Code text box with valid credential
      And user fills in the City textbox with valid credential "Dakota City"
      And user selects a country from Country dropdown
      And user fills in the State textbox with valid credential "Baden-Württemberg"
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees the error message

    @US10Negative_TC006
    Scenario: Leave the State textbox empty
      Given user fills in the SSN textbox "342-23-5645"
      And user clicks on the Search button
      And user fills in the Middle Initial textbox with valid credential
      And user fills in the Phone Number textbox with valid credential
      And user fills in the Zip Code text box with valid credential
      And user fills in the City textbox with valid credential "Dakota City"
      And user selects a country from Country dropdown
      And user selects a account from Account menu "SavingT5"
      And user clicks on the save button
      Then user sees the error message










