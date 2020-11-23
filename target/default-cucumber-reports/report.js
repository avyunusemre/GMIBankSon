$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US14_Negative.feature");
formatter.feature({
  "name": "Address of customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US14_Negative"
    }
  ]
});
formatter.background({
  "name": "TC_01 Address of customer should be provided",
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
  "name": "user clicks on Manage Accounts",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_Manage_Accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Create a new Account",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_the_Create_a_new_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"Team5TestAcount\" as Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the 9999999 as Balance",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Balance(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The account creation date and time can typed earlier than the real creation date and time",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US14_Negative"
    }
  ]
});
formatter.step({
  "name": "user enter the the creation date as \"01/01/2019\" and creation time as \"01:01 AM\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_the_creation_date_as_and_creation_time_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clickc on account Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clickc_on_account_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees green success message on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_sees_green_success_message_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "TC_01 Address of customer should be provided",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027password\u0027]\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-DFPOV6O\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Pc\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:56165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d6ce9d7e93759afbe65a56e909685b0d\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027password\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat stepdefinitions.US16_StepDefinitions.user_provide_valid_password(US16_StepDefinitions.java:39)\r\n\tat ✽.user provide valid password \"employeeTeam5\"(file:///C:/Users/Pc/IdeaProjects/GMIBankTeam5/src/test/resources/features/US14_Negative.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on My Operations",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_My_Operations()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Manage Accounts",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_Manage_Accounts()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the Create a new Account",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_the_Create_a_new_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the \"Team5TestAcount\" as Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Description(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the 9999999 as Balance",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Balance(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "The date should be created as any format except of the format which is month,day,year,hour and minute",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US14_Negative"
    }
  ]
});
formatter.step({
  "name": "user enter the the creation date as \"21/32/2019\" and creation time as \"32:99 AM\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_the_creation_date_as_and_creation_time_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sees the date and time which entered format",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_sees_the_date_and_time_which_entered_format()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "TC_01 Address of customer should be provided",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027password\u0027]\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-DFPOV6O\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Pc\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:56165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d6ce9d7e93759afbe65a56e909685b0d\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027password\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat stepdefinitions.US16_StepDefinitions.user_provide_valid_password(US16_StepDefinitions.java:39)\r\n\tat ✽.user provide valid password \"employeeTeam5\"(file:///C:/Users/Pc/IdeaProjects/GMIBankTeam5/src/test/resources/features/US14_Negative.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_click_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on My Operations",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_My_Operations()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Manage Accounts",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_Manage_Accounts()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the Create a new Account",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_the_Create_a_new_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the \"Team5TestAcount\" as Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Description(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the 9999999 as Balance",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Balance(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User can choose a user from the registration bar and it can be blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US14_Negative"
    }
  ]
});
formatter.step({
  "name": "user clicks Employee box",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_Employee_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should not see any option",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_should_not_see_any_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on account Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_account_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sees green success message on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_sees_green_success_message_on_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "screenshots");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "TC_01 Address of customer should be provided",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//button)[4]\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-DFPOV6O\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Pc\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:56165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d6ce9d7e93759afbe65a56e909685b0d\n*** Element info: {Using\u003dxpath, value\u003d(//button)[4]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat stepdefinitions.US16_StepDefinitions.user_click_sign_in_button(US16_StepDefinitions.java:44)\r\n\tat ✽.user click sign in button(file:///C:/Users/Pc/IdeaProjects/GMIBankTeam5/src/test/resources/features/US14_Negative.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on My Operations",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_My_Operations()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Manage Accounts",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_Manage_Accounts()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on the Create a new Account",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_clicks_on_the_Create_a_new_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the \"Team5TestAcount\" as Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Description(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the 9999999 as Balance",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_enter_the_as_Balance(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User can not select Zelle Enrolled box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US14_Negative"
    }
  ]
});
formatter.step({
  "name": "user does not see Zelle Enrolled box",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US14_Negative.user_does_not_see_Zelle_Enrolled_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png", "screenshots");
formatter.after({
  "status": "passed"
});
});