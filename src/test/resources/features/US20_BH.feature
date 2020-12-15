@Allcustomer
  Feature: Validate all customer's info
    @US20_TC01
    Scenario: Read all customers
      Given user sets all response using api endpoint "https://www.gmibank.com/api/tp-customers"
      And user deserializers country data as json to java
      Then user validates the data
