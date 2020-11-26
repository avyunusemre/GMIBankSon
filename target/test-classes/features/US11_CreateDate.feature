@US11
  Feature: Date should be created on the time of customer creation

    Background:
      Given User is on GMIBank Login page
      And user provide valid username "Team5Employee"
      And user provide valid password "employeeTeam5"
      And user click sign in button
      And user clicks on My Operations
      And user clicks on Manage Customer
      And user clicks on Create a new Customer

      @US11_TC001
      Scenario: TC001_The date be typed in the future
        Given user fills in the SSN textbox "352-34-4678"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential
        And user fills in the Phone Number textbox with valid credential
        And user fills in the Zip Code text box with valid credential
        And user creates a date "02.21.2021"
        And user fills in the City textbox with valid credential "Dakota City"
        And user selects a country from Country dropdown
        And user fills in the State textbox with valid credential "North Dakota"
        And user selects a account from Account menu "SavingT5"
        And user clicks on the save button
        Then user sees create a new button

      @US11_TC002
      Scenario: TC002_The date be typed in the past time
        Given user fills in the SSN textbox "342-23-5646"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential
        And user fills in the Phone Number textbox with valid credential
        And user fills in the Zip Code text box with valid credential
        And user creates a date "11.18.2020"
        And user fills in the City textbox with valid credential "Dakota City"
        And user selects a country from Country dropdown
        And user fills in the State textbox with valid credential "North Dakota"
        And user selects a account from Account menu "SavingT5"
        And user clicks on the save button
        Then user don't see the create a new customer button

      @US11_TC003
      Scenario: TC003_User create a invalid date format
        Given user fills in the SSN textbox "564-98-8768"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential
        And user fills in the Phone Number textbox with valid credential
        And user fills in the Zip Code text box with valid credential
        And user creates a date "23.01.2021"
        And user fills in the City textbox with valid credential "Dakota City"
        And user selects a country from Country dropdown
        And user fills in the State textbox with valid credential "North Dakota"
        And user selects a account from Account menu "SavingT5"
        And user clicks on the save button
        Then user don't see the create a new customer button

      @US11_TC004
      Scenario: TC004_User choose a user
        Given user fills in the SSN textbox "564-98-8768"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential
        And user fills in the Phone Number textbox with valid credential
        And user fills in the Zip Code text box with valid credential
        And user creates a date "02.21.2021"
        And user fills in the City textbox with valid credential "Dakota City"
        And user selects a country from Country dropdown
        And user fills in the State textbox with valid credential "North Dakota"
        And user selects a account from Account menu "SavingT5"
        And user choose a user from user dropdown
        And user clicks on the save button
        Then user sees create a new button

      @US11_TC005
      Scenario: User can choose a manager account
        Given user fills in the SSN textbox "423-23-3467"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential
        And user fills in the Phone Number textbox with valid credential
        And user fills in the Zip Code text box with valid credential
        And user creates a date "02.21.2021"
        And user fills in the City textbox with valid credential "Las Vegas"
        And user selects a country from Country dropdown
        And user fills in the State textbox with valid credential "California"
        And user selects a account from Account menu "SavingT5"
        And user choose a user from user dropdown
        And user clicks on the save button
        Then user sees create a new button

      @US11_TC006
      Scenario: User can select Zelle Enrolled optionally
        Given user fills in the SSN textbox "342-21-2352"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential
        And user fills in the Phone Number textbox with valid credential
        And user fills in the Zip Code text box with valid credential
        And user creates a date "02.21.2021"
        And user fills in the City textbox with valid credential "Las Vegas"
        And user selects a country from Country dropdown
        And user fills in the State textbox with valid credential "California"
        And user selects a account from Account menu "SavingT5"
        And user choose a user from user dropdown
        And user click on the zelle enrolled
        And user clicks on the save button
        Then user sees create a new button





