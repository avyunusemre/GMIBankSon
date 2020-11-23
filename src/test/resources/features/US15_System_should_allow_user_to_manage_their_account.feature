
Feature: US15_System_should_allow_user_to_manage_their_account

  Background: US16_TC01_money_transfer_between_accounts
    Given User is on GMIBank Login page
    When  user provide valid username "Team5Customer"
    When  user provide valid password "customerTeam5"
    When  user click sign in button
    When  verify  username when user logged in
    When  user goes to My Accounts under My Operation


  Scenario Outline: User should see all account types and balace populated
    When  user sees all account types "<Account_Type>"
    Then user sees the all populated balances
   Examples:
      | Account_Type |
      | 5778         |


  @US15TCs
    Scenario: User can view transaction
      When user clicks on the View Transaction
      Then user sees the transactions
