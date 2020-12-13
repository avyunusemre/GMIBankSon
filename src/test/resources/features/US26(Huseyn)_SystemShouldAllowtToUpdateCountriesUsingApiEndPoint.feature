@US26_Huseyn
  Feature: US_26 System should allow to update countries using api end point

    Scenario: Read all country
      Given Let's see all data on the screen using GET "https://www.gmibank.com/api/tp-countries"
      And HTTP Status Code 200

      Scenario: update countries with PUT
        Given Let's update the country "UNITED KINGDOM" using PUT endpoint "https://www.gmibank.com/api/tp-countries" id 18919
        And After creating with PUT, let's verify the country created "UNITED KINGDOM"

      Scenario: update countries with PATCH
        Given Let's update the country "Germany" using PATCH endpoint "https://www.gmibank.com/api/tp-countries" id 18919
        And After creating with PATCH, let's verify the country created "Germany"
