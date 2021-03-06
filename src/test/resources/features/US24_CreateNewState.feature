@Sprint2
  Feature: US24 : Data Creations
    Scenario Outline: System allow the user to create a state using valid endpoint
      Given user get data with valid token and "endpoint"
      When user verify status code 200 and content type JSon
      When user create a new "<state>" one by one if it is not created already
      Then validate "<state>" is created
     Examples: data
       | state |
       | NY    |
       | NJ    |
       | FL    |
