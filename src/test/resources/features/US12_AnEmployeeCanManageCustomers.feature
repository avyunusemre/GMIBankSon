@US12
Feature: An Employee can manage Customer

  Background:
    Given User is on GMIBank Login page
    And user provide valid username "Team5Employee"
    And user provide valid password "employeeTeam5"
    And user click sign in button
    And user clicks on My Operations
    And user clicks on Manage Customer

@US12_TC01
  Scenario: Employees should be able to see "First Name, Last Name, Middle Letter, E-mail, Mobile Number, Phone Number, Address, Create Date"
    Given Verify if the first name is showing "Money"
    And Verify if the last name is showing "Father"
    And Verify if the middle initial is showing "."
    And Verify if the email is showing "money@moneymail.com"
    And Verify if the mobile phone number is showing "951-753-1654"
    And Verify if the phone number is showing "951-753-1654"
    And Verify if the address is showing "Test Mahallesi Test Sokak Test Apartman 06100 Alaska"
    Then Verify if the create date is showing "23/11/20 22:00"

@US12_TC02
  Scenario: There should be a View option where customer can be navigated to all customer info and see edit button there
    Given Verify an View button
    And Click on the View button
    Then Verify an Edit button

@US12_TC03
  Scenario: There should be an Edit button where all customer information can be populated
    Given Verify an Edit button from main page
    And Click on the Edit button from main page

@US12_TC04
  Scenario: The Edit portal can allow user to create or update the user info
    Given Click on the Edit button
    And Change first name "Team58"
    And Change last name "Example"
    And Change middle initial "H"
    And Change email "example@gmail.com"
    And Change mobile phone number "078-984-8974"
    And Change phone number "578-984-8974"
    And Change zip code "E58 9PC"
    And Change address "here"
    And Change city "Edinburgh"
    And Change SSN "580-42-0606"
    And Change create date "22/11/2020 23:18"
    And Change country "UNITED KINGDOM"
    And Change state "Edinburgh"
    And Change user "john John Doe"
    And Change account "asd"
    And Click to checkbox
    Then Click on the "Save" button

@US12_TC05
  Scenario: User can delete a customer, but seeing a message if the user is sure about deletion
    Given Click on the Delete button
    And Verify the alert message "Are you sure you want to delete Customer 2574?"
    Then Click on the Delete button from alert page