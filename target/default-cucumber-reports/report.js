$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US11_CreateDate.feature");
formatter.feature({
  "name": "Date should be created on the time of customer creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US11"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on GMIBank Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_is_on_GMIBank_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid username \"Team5Employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"employeeTeam5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on My Operations",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_My_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Manage Customer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_Manage_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Create a new Customer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_Create_a_new_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC004_User choose a user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US11"
    },
    {
      "name": "@US11_TC004"
    }
  ]
});
formatter.step({
  "name": "user fills in the SSN textbox \"564-98-8768\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_SSN_textbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the Middle Initial textbox with valid credential",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_Middle_Initial_textbox_with_valid_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the Phone Number textbox with valid credential",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_Phone_Number_textbox_with_valid_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the Zip Code text box with valid credential",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_Zip_Code_text_box_with_valid_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates a date \"02.21.2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US11_StepDefinitions.user_creates_a_date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the City textbox with valid credential \"Dakota City\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_City_textbox_with_valid_credential(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a country from Country dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_selects_a_country_from_Country_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the State textbox with valid credential \"North Dakota\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_State_textbox_with_valid_credential(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects a account from Account menu \"SavingT5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_selects_a_account_from_Account_menu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose a user from user dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US11_StepDefinitions.user_choose_a_user_from_user_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_the_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees create a new button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US11_StepDefinitions.user_sees_create_a_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});