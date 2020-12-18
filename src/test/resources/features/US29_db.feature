@US29 @Sprint2
  Feature: US29 : All database validation
    Background: Create connection with DataBase
    @US_29_TC001
    Scenario: Validate all data performing database testing
      Given Create connection with DataBase
        And I can from database all users' info about login withdraw
          Then I can verify login with database data
      @US_29_TC002
      Scenario:All countries' info should be retrieved by database and validated
        Given Create connection with DataBase
        And I can from database all countries' info withdraw
        Then I can verify all countries from database
      @US_29_TC003
      Scenario: All states should related to USA should be  retrieved by database and validated
        Given Create connection with DataBase
        And I can from database all states in USA info withdraw
        Then I can verify all states in USA from database

