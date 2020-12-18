@US26 @Sprint2
  Feature: US26 : Update each country 1 by 1

    Background:
      Given Send a GET request to REST API endpoint
      And Verify the HTTP Status code
      And get all countries as De-Serialization


    @US26_TC001
    Scenario: US26_TC001 : Update first country with PUT request
      And Send a PUT request to REST API endpoint and update first country "https://www.gmibank.com/api/tp-countries/"
      Then Verify the updated country has been updated


    @US26_TC002
    Scenario: US26_TC002 : Update last country with PUT request
      And Send a PUT request to REST API endpoint and update last country "https://www.gmibank.com/api/tp-countries/"
      Then Verify the updated last country has been updated