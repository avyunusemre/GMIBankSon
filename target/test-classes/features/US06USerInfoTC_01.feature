@US06_TC_01
Feature: User Info being populated

  Scenario Outline: US_006 TC_001
    Given User is on GMIBank Login page
    When  user provide valid username "<username>"
    When  user provide valid password "<password>"
    When  user click sign in button

    Given Click to element with element name
      | accountMenu |
      | userInfo    |
    Then Compare text using element name
      | settingsTitle | User settings | text             |
      | firstName     | <firstname>   | value            |
      | lastName      | <lastname>    | value            |
      | email         | <email>       | value            |
      | languagedropd | English       | selectedDrobdown |

    Examples:
      | username      | password      | firstname | lastname | email                   |
      | Team5Employee | employeeTeam5 | Employee  | Team5    | team5employee@gmail.com |
      | Team5User     | userTeam5     | User12    | Team5    | team5user@gmail.com     |
      | Team5Customer | customerTeam5 | Team5     | Customer | team5cust@gmail.com     |
      | Team5Admin    | adminTeam5    | Admin     | Team5    | team5admink@gmail.com   |
      | Team5Manager  | managerTeam5  | Manager   | Team5    | team5manager@gmail.com  |
