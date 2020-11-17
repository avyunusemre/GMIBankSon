@US06
Feature: User Info Functionality

  Background:
    Given User is on GMIBank Login page
    When  user provide valid username "Team5User"
    When  user provide valid password "userTeam5"
    When  user click sign in button
    When  verify  username when user logged in


  Scenario: US_006 TC_001

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Compare text using element name
      | settingsTitle | User settings       | text             |
      | firstName     | User12              | value            |
      | lastName      | Team5               | value            |
      | email         | team5user@gmail.com | value            |
      | languagedropd | English             | selectedDrobdown |


  Scenario: US_006 TC_002
    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Check drowdown options
      | languagedropd |

  Scenario: US_006 TC_003

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | firstName | User12omer |
    Then Click to element with element name
      | saveButton  |
    Then Compare text using element name
      | settingsSaveMessage |Settings saved! | text |
    Then Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Compare text using element name
      | firstName | User12omer | value |


  Scenario: US_006 TC_004

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | lastName | Team5omer |
    Then Click to element with element name
      | saveButton  |
    Then Compare text using element name
      | settingsSaveMessage |Settings saved! | text |
    Then Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Compare text using element name
      | lastName | Team5omer | value |

  Scenario: US_006 TC_005

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email | team5useromer@gmail.com |
    Then Click to element with element name
      | saveButton  |
    Then Compare text using element name
      | settingsSaveMessage |Settings saved! | text |
    Then Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Compare text using element name
      | email | team5useromer@gmail.com | value |



  Scenario: US_007 TC_001

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email |  team5useromergmail |
    Then Compare text using element name
      | invalidFeedback |This field is invalid | text |


  Scenario: US_007 TC_002

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email |  team5useromergmail.com |
    Then Compare text using element name
      | invalidFeedback |This field is invalid | text |


  Scenario: US_007 TC_003

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    And Send text to element with element name
      | email |  team5useromer@gmail |
    Then Compare text using element name
      | invalidFeedback |This field is invalid | text |


  Scenario: US_007 TC_004

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Check drowdown options
      | languagedropd |