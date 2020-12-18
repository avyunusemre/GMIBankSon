@Allcustomer @Sprint2
  Feature: US20 : Validate all customer's info
    @US20_TC01
    Scenario: TC001 : Read all customers
      Given user sets all response using api endpoint "https://www.gmibank.com/api/tp-customers"
      And user deserializers country data as json to java
      Then user validates the data
      @US20_TC02
      Scenario: TC002 : Read all customers
        Given user sets all response using api endpoint "https://www.gmibank.com/api/tp-customers"
        And user deserializers country data as json to java
        Then user validates all data one by one