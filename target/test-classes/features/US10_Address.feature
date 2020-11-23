@US_10
  Feature: Address of customer
    Background: TC_01 Address of customer should be provided
      Given User is on GMIBank Login page
      And user provide valid username "Team5Employee"
      And user provide valid password "employeeTeam5"
      And user click sign in button
      And user clicks on My Operations
      And user clicks on Manage Customer
      And user clicks on Create a new Customer
      And user clicks on the Search button


      Scenario: TC01 Address should be provided
        And user fills in the SSN textbox with valid credential "123-45-6778"
        And user clicks on the Search button
        And user fills in the Middle Initial textbox with valid credential "-"
        And user fills in the Phone Number textbox with valid credential "212-599-0020"
        And user fills in the Zip Code text box with valid credential "G51 1AG"
        And user fills in the City textbox with valid credential "Glasgow"
        And user selects a country from Country dropdown "5"
        And user fills in the State textbox with valid credential "Glasgow-city"
        And user clicks on the save button
        Then user sees success message
