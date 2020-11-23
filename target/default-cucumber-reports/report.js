$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US15_System_should_allow_user_to_manage_their_account.feature");
formatter.feature({
  "name": "US15_System_should_allow_user_to_manage_their_account",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "US16_TC01_money_transfer_between_accounts",
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
  "name": "user goes to My Accounts under My Operation",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US15TCs.user_goes_to_My_Accounts_under_My_Operation()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can view transaction",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US15TCs"
    }
  ]
});
formatter.step({
  "name": "user clicks on the View Transaction",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US15TCs.user_clicks_on_the_View_Transaction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the transactions",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US15TCs.user_sees_the_transactions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});