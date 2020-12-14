@US26
  Feature: Update each country 1 by 1

    Background:
      Given Send a GET request to REST API endpoint
      And Verify the HTTP Status code
      And get all countries as De-Serialization


    @US26_TC001
    Scenario: TC_001 : Update first country with PUT request
      And Send a PUT request to REST API endpoint and update first country
      Then Verify the updated country has been updated


    @US26_TC002
    Scenario: US26_TC002 : Update last country with PATCH request
      And Send a PATCH request to REST API endpoint and update last country
      Then Verify the updated country has been updated