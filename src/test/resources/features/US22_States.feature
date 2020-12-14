Feature: US27 Read State

  Background:
    Given Set states to response "https://www.gmibank.com/api/tp-states"
    Then User convert to all states to pojo


  Scenario: US22 TC_01

    When Verify state name with given state id
      | 25390 | Koblenz         |
      | 21564 | Haute-Normandie |
      | 21565 | Ile-de-France   |
      | 21567 | Alsace          |
      | 21569 | Auvergne        |


  Scenario: US22 TC_02

    When Write all States in txt
    Then Read txt file
    And  Verify that the given State id is within the States read from the file
      | 25390 |
      | 21564 |
      | 21565 |
      | 21567 |
      | 21569 |



