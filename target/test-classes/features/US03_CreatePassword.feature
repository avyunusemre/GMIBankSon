@US03CreateNewPassword
  Feature: NewPassword
   @Enterlowercse
    Scenario: User Enter 1 lowercase letter of at least 4 characters
    Given User is on GMIBank Login page
    And user fills in the New Password textbox with valid
    And verify red messages under the box
    Then verify Password strength

  @Enteruppercase
    Scenario: User Enter 1 uppercase letter of at least 4 characters
    Given User is on GMIBank Login pageGiven
    And user fills in the New Password textbox with valid
    And verify red messages under the box
    Then verify Password strength
    @Enterdigitletter
    Scenario: User Enter  1 digit letter of at least 4 characters
      Given User is on GMIBank Login pageGiven
      And user fills in the New Password textbox with valid
      And verify red messages under the box
      Then verify Password strength
    @Enterspecialchar
    Scenario: User Enter  1 special char of at least 4 characters
        Given User is on GMIBank Login pageGiven
        And user fills in the New Password textbox with valid
        And verify red messages under the box
        Then verify Password strength
    @7chars
    Scenario: User Enter  7 characters
          Given User is on GMIBank Login pageGiven
          And user fills in the New Password textbox with valid
          And verify red messages under the box
          Then verify Password strength
