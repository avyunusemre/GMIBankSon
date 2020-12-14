Feature: Delete State

  Background:
    Given Set states to response "https://www.gmibank.com/api/tp-states"
    Given User convert to all states to pojo


  Scenario Outline: US27 TC01 delete states

    Then  Delete states with "<id>" and verify status code as "<statusCode>"
    And Verify the state has been deleted

    Examples:
      | id    | statusCode |
      | 31052 | 204        |
      | 29449 | 204        |

