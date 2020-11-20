@US07
Feature: Negative User Info Functionality

  Background:
    Given User is on GMIBank Login page
    When  user provide valid username "Team5User"
    When  user provide valid password "userTeam5"
    When  user click sign in button


  Scenario: US_007 TC_001

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email | team5useromergmail |
    Then Compare text using element name
      | invalidFeedback | This field is invalid | text |


  Scenario: US_007 TC_002

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email | team5useromergmail.com |
    Then Compare text using element name
      | invalidFeedback | This field is invalid | text |


  Scenario: US_007 TC_003

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email | team5useromer@gmail |
    Then Compare text using element name
      | invalidFeedback | This field is invalid | text |


  Scenario: US_007 TC_004

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Check drowdown options
      | languagedropd |