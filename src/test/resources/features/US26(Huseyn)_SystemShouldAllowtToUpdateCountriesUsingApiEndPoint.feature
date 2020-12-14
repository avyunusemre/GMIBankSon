@US26_Huseyn
  Feature: US_26 System should allow to update countries using api end point


    Background:
      Given Let's see all data on the screen using GET "https://www.gmibank.com/api/tp-countries/"
      And HTTP Status Code 200
      And Get all countries as De-Serialization

@US26_TC001_Huseyn
    Scenario: Update countries with PUT
      And Let's update the first ID country using PUT endpoint "https://www.gmibank.com/api/tp-countries/"
      Then After creating with PUT, let's verify the country created
