@Sprint2
Feature:US23

  @US23
  Scenario: US23_TC01 :Read all customers you created and validate them from your data set

    Given Send a GET request to REST API endpoint "https://www.gmibank.com/api/tp-account-registrations"
    And Verify the Status Code
    And Get all Applicant's info as De Serialization
    Then Verify all customers you created