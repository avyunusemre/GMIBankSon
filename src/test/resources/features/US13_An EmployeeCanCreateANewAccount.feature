@US13
Feature: An Employee can create a new Account

  Background:
    Given User is on GMIBank Login page
    And user provide valid username "Team5Employee"
    And user provide valid password "employeeTeam5"
    And user click sign in button
    And user clicks on My Operations
    And user clicks on Manage Account
    And user clicks on Create a new Account


@US13_TC01
  Scenario: User should create a description for the new account and it cannot be blank
    Given user create a description "Sample Account"

@US13_TC02
  Scenario: User should provide a balance for the first time account creation as Dollar.
    Given user fills the balance box "$555"

@US13_TC03
  Scenario: User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    Given user selects a valid account type from Account Type Drop-down "CREDIT_CARD"

@US13_TC04
  Scenario: Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    Given user selects a valid account status type from Account Status Type Drop-down "ACTIVE"

@US13_TC05
  Scenario: User can select an employee from the drop-down and click save button
    Given user selects a valid employee from Employee Drop-down
    And user clicks on the Save button






