@Countries_Update
  Feature: Update each country 1 by 1

    @US26_TC001
    Scenario: TC_001 : Update first country with PUT request
      Given Send a PUT request to REST API endpoint and update first country
      And Verify the HTTP Status code
      And get all countries as De-Serialization
      And Verify the updated country has been updated


    @US26_TC002
    Scenario: US26_TC002 : Update last country with PATCH request
      Given Send a PATCH request to REST API endpoint and update first country
      And Verify the HTTP Status code
      And get all countries as De-Serialization
      And Verify the updated country has been updated