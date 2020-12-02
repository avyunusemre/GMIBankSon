@US01
Feature:US01_Register Page
Background:  User is on GMIBank Home page
  Given User is on GMIBank home page
  And user should navigate to registration page
  @US01_TC001
  Scenario Outline:US01_TC001
    And user click the First Name
    And click on SSN box "<SSN>"
    When  I fill the  correct SSN , I should not see the error message
    Examples: Data test
    |SSN|
    |345-34-4567|
    |213-34-6561 |
    |900-12-1231|
    | 555-55-5555|

    |123-000-000 |
  @US01_TC002
  Scenario Outline:US01_TC002

  When I do not enter SSN,I should see the error message
    And click on SSN box "<SSN>"
    And user click the First Name
    Examples: Data TEST
    |      |
    |      |
    @US01_TC003
    Scenario Outline:US01_TC003
      Given  Enter the name with chars without blank "<first name>"
      And click on SSN box "<SSN>"
      And user click the First Name
      When I enter correct name,I should not see any message
      Examples:

     |SSN|first name|
     |345-34-4567|byram|
     |345-34-4567 |BARYRAM|
     |345-34-4567 |Baryram|
     |345-34-4567 |?baryram|
   @US_TC004

   Scenario Outline:US01_TC004
     Given  Enter the name with chars with blank "<first name>"
     And click on SSN box "<SSN>"
     And user click the First Name
     When I enter correct name with blank ,I should  see any message
     Examples:

       |SSN|first name|
       |345-34-4567| george |
     @US01_TC005
     Scenario Outline:US01_TC005
       Given  Enter the name with chars with blank "<first name>"
       And click on SSN box "<SSN>"
       And user click the First Name
       And user click last name box
       And user enter valid last name "<last name>"
       When When I enter my all last name correct, I should not see the error message
       Examples:Data Test
       |SSN|first name|last name|
       |345-34-4567| george |max|
       |345-34-4567| george    |MAX|
       |345-34-4567| george    |Max|
  @US01_TC006
  Scenario Outline:US01_TC006
    Given  Enter the name with chars with blank "<first name>"
    And click on SSN box "<SSN>"
    And user click the First Name
    And user click last name box
    And user enter valid last name "<last name>"
    And user should click address box
    And user should enter the address along with zip code "<address>"
    When user enter valid adress, user should not see any message;
    Examples:Data Test
    |SSN|first name|last name|address|
    | 345-34-4567|george|max |sakarya54|
    |345-34-4567 |george|max |sakarya  |

  @US01_TC007
  Scenario Outline:US01_TC007
    Given  Enter the name with chars with blank "<first name>"
    And click on SSN box "<SSN>"
    And user click the First Name
    And user click last name box
    And user enter valid last name "<last name>"
    And user should click address box
    And user should enter the address along with zip code "<address>"
    And user should click the mobile phone box
    And user should enter valid mobile phone "<mobile phone>"
    When user should not enter valid mobile phone, I should see Invalid Mobile Phone message
    Examples: Data Test
    |SSN|first name|last name|address|mobile phone|
    |345-34-4567|george|max  |sakarya54|111-111-0000|
    |345-34-4567|george|max  |sakarya54|000-000-0000|
  @US01_TC008
  Scenario Outline:US01_TC008
    Given  Enter the name with chars with blank "<first name>"
    And click on SSN box "<SSN>"
    And user click the First Name
    And user click last name box
    And user enter valid last name "<last name>"
    And user should click address box
    And user should enter the address along with zip code "<address>"
    And user should click the mobile phone box
    And user should enter valid mobile phone "<mobile phone>"
    And user should click on Username box
    And user should fill the box user name with any chars without digit "<user name>"
    When user fill not valid username,user should see any message

    Examples: Data Test
      |SSN|first name|last name|address|mobile phone|user name|
      |345-34-4567|george|max  |sakarya54|111-111-0000|Martin|
      |345-34-4567|george|max  |sakarya54|000-000-0000|Martin12|
  @US01_TC009
  Scenario Outline:US01_TC009
    Given  Enter the name with chars with blank "<first name>"
    And click on SSN box "<SSN>"
    And user click the First Name
    And user click last name box
    And user enter valid last name "<last name>"
    And user should click address box
    And user should enter the address along with zip code "<address>"
    And user should click the mobile phone box
    And user should enter valid mobile phone "<mobile phone>"
    And user should click on Username box
    And user should fill the box user name with any chars without digit "<user name>"
    And user should click on e mail box
    And user  should a valid e mail format that contains "@" ,".com" extensions "<e mail>"
    When user fill not valid format for e mail, user should see message



    Examples: Data Test
      |SSN|first name|last name|address|mobile phone|user name|e mail|
      |345-34-4567|george|max  |sakarya54|111-111-0000|Martin| martin54@gmail.com|
      |345-34-4567|george|max  |sakarya54|000-000-0000|Martin| martin54@gmail.net |











