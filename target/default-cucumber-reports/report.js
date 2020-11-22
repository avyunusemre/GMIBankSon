$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US16_money_can_be_transfarable.feature");
formatter.feature({
  "name": "US16_money_can_transferable_between_accounts",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US16TCs"
    }
  ]
});
formatter.background({
  "name": "US16_money_transfer_between_accounts",
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
  "name": "user provide valid username \"Team5Customer\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"customerTeam5\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify  username when user logged in",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.verify_username_when_user_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to Transfer Money under My Operation",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_goes_to_Transfer_Money_under_My_Operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on Customer Accounts page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.verify_user_is_on_Customer_Accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should provide a description for that transfer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US16TCs"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user select an account from FROM box \"5778\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_select_an_account_from_FROM_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select an account from TO box \"5776\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_select_an_account_from_TO_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide an amount that user want to transfer \"100\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_an_amount_that_user_want_to_transfer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide description to the box \"Transfer\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_description_to_the_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the description is visible int the box \"Transfer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.verify_the_description_is_visible_int_the_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});