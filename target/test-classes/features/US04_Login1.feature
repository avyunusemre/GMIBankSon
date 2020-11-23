@US04
  Feature: Login page should accessible with valid credentials
    Background:
      Given User is on GMIBank Login page
      And user provide valid username "Team5User"
      And user provide valid password "userTeam5"


      @US04_TC001
      Scenario: US04_TC001
       Given The Sign in button must be clicked
        And Valid usurname and password must be entered.

      @US04_TC002
      Scenario: US04_TC002
        Given Valid usurname and password must be entered2.
        Then click on the cansel






