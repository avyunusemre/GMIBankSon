@US09UserPageNewCustomer
Feature: Create a new customer


  Background:
    Given User is on GMIBank Login page
    When  user provide valid username "Team5User"
    When  user provide valid password "userTeam5"
    When  user click sign in button
    When  verify  username when user logged in
    And user clicks on My Operations
    And user clicks on Manage Customer
    And user clicks on Create a new Customer
    And user fills in the SSN textbox "012-04-0571"
    And user clicks on the Search button

  @USUserPageNewCustomer_TC001
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    Given Click in the First Name search box
    And Show the text of the First Name search box: Mustafa
    And Click in the Mobile Phone search box
    Then Show the text of the Mobile Phone search box :0122-004-0571

  @USUserPageNewCustomer_TC002
  Scenario: User can search for a new applicant by their SSN and see all their registration info populated
    Given Click in the Last Name search box
    And Show the text of the Last Name search box : Yildirim
    And Click in the Address search box
    Then Show the text of the address search box :Willem Alexander Straat Amterdam
