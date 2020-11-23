@US05
  Feature: Login page should not be accessible with invalid credentials
    Background:
      Given User is on GMIBank Login page


    @US05_TC001
    Scenario: US05_TC001
      Given  Invalid username must be entered.
      And The Sign in button must be clicked.
      Then The user should get an error message on the screen.

    @US05_TC002
    Scenario: US05_TC002
      Given  Invalid password must be entered.
      And The Sign in button must be clicked.
      Then The user should get an error message on the screen.

    @US05_TC003
    Scenario: US05_TC003
      Given  Invalid usurname and password must be entered.
      And The Sign in button must be clicked.
      Then The user should get an error message on the screen.

    @US05_TC004
    Scenario: US05_TC004
      Given  Did you forget your password? button should be clickable
      And User must enter their e-mail address
      Then User should be able to click the password reset button

    @US05_TC005
    Scenario: US05_TC005
      Given  User should be able to click the "Create a new account" button
