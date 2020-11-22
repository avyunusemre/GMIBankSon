@US_10
Feature: Address of customer
  Background: TC_01 Address of customer should be provided
    Given User is on GMIBank Login page
    And user provide valid username "Team5Employee"
    And user provide valid password "employeeTeam5"
    And user click sign in button
    And user clicks on My Operations
    And user clicks on Manage Accounts
    And user clicks on the Create a new Account
    And user enter the "Team5TestAcount" as Description
    And user enter the 10000 as Balance

    Scenario: The account creation date and time can typed earlier than the real creation date and time
      When user enter the the creation date as "01/01/2020" and creation time as "01:01 AM"
      And user clickc on account Save button
      Then user sees green success message on the screen

      Scenario:The date should be created as any format except of the format which is month,day,year,hour and minute
        When user enter the the creation date as "21/32/2020" and creation time as "32:99 AM"
        Then user sees the date and time which entered format

        Scenario: User can choose a user from the registration bar and it can be blank
          When user clicks Employee box
          And user should not see any option
          And user clicks on account Save button
          Then user sees green success message on the screen

          Scenario: User can not select Zelle Enrolled box
           Then user does not see Zelle Enrolled box
