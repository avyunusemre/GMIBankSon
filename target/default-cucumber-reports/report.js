<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US10_Address.feature");
formatter.feature({
  "name": "Address of customer",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US06USerInfoTC_01.feature");
formatter.feature({
  "name": "User Info being populated",
>>>>>>> main
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@US_10"
    }
  ]
});
formatter.background({
  "name": "TC_01 Address of customer should be provided",
=======
      "name": "@US06_TC_01"
    }
  ]
});
formatter.scenarioOutline({
  "name": "US_006 TC_001",
>>>>>>> main
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on GMIBank Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user provide valid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user provide valid password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "Click to element with element name",
  "keyword": "Given ",
  "rows": [
    {
      "cells": [
        "accountMenu"
      ]
    },
    {
      "cells": [
        "userInfo"
      ]
    }
  ]
});
formatter.step({
  "name": "Compare text using element name",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "settingsTitle",
        "User settings",
        "text"
      ]
    },
    {
      "cells": [
        "firstName",
        "\u003cfirstname\u003e",
        "value"
      ]
    },
    {
      "cells": [
        "lastName",
        "\u003clastname\u003e",
        "value"
      ]
    },
    {
      "cells": [
        "email",
        "\u003cemail\u003e",
        "value"
      ]
    },
    {
      "cells": [
        "languagedropd",
        "English",
        "selectedDrobdown"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "email"
      ]
    },
    {
      "cells": [
        "Team5Employee",
        "employeeTeam5",
        "Employee",
        "Team5",
        "team5employee@gmail.com"
      ]
    },
    {
      "cells": [
        "Team5User",
        "userTeam5",
        "User12",
        "Team5",
        "team5user@gmail.com"
      ]
    },
    {
      "cells": [
        "Team5Customer",
        "customerTeam5",
        "Team5",
        "Customer",
        "team5cust@gmail.com"
      ]
    },
    {
      "cells": [
        "Team5Admin",
        "adminTeam5",
        "Admin",
        "Team5",
        "team5admink@gmail.com"
      ]
    },
    {
      "cells": [
        "Team5Manager",
        "managerTeam5",
        "Manager",
        "Team5",
        "team5manager@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "US_006 TC_001",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US06_TC_01"
    }
  ]
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
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"employeeTeam5\"",
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
  "name": "Click to element with element name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.clickToElementWithElementName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Compare text using element name",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.compareTextUsingElementName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "US_006 TC_001",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US06_TC_01"
    }
  ]
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
<<<<<<< HEAD
  "name": "user clicks on the Search button",
  "keyword": "And "
=======
  "name": "user provide valid username \"Team5User\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"userTeam5\"",
  "keyword": "When "
>>>>>>> main
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01 Address should be provided",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US_10"
    }
  ]
});
formatter.step({
<<<<<<< HEAD
  "name": "user fills in the SSN textbox with valid credential \"123-45-6778\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10_StepDefinitons.user_fills_in_the_SSN_textbox_with_valid_credential(java.lang.String)"
=======
  "name": "user click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_click_sign_in_button()"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user clicks on the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_clicks_on_the_Search_button()"
=======
  "name": "Click to element with element name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.clickToElementWithElementName(io.cucumber.datatable.DataTable)"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user fills in the Middle Initial textbox with valid credential \"-\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10_StepDefinitons.user_fills_in_the_Middle_Initial_textbox_with_valid_credential(java.lang.String)"
=======
  "name": "Compare text using element name",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.compareTextUsingElementName(io.cucumber.datatable.DataTable)"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
<<<<<<< HEAD
formatter.step({
  "name": "user fills in the Phone Number textbox with valid credential \"212-599-0020\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10_StepDefinitons.user_fills_in_the_Phone_Number_textbox_with_valid_credential(java.lang.String)"
=======
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "US_006 TC_001",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US06_TC_01"
    }
  ]
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
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user fills in the Zip Code text box with valid credential \"G51 1AG\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10_StepDefinitons.user_fills_in_the_Zip_Code_text_box_with_valid_credential(java.lang.String)"
=======
  "name": "user provide valid password \"customerTeam5\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_password(java.lang.String)"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user fills in the City textbox with valid credential \"Glasgow\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_City_textbox_with_valid_credential(java.lang.String)"
=======
  "name": "user click sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_click_sign_in_button()"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user selects a country from Country dropdown \"5\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10_StepDefinitons.user_selects_a_country_from_Country_dropdown(java.lang.String)"
=======
  "name": "Click to element with element name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.clickToElementWithElementName(io.cucumber.datatable.DataTable)"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user fills in the State textbox with valid credential \"Glasgow-city\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US10Negative_StepDefinitions.user_fills_in_the_State_textbox_with_valid_credential(java.lang.String)"
=======
  "name": "Compare text using element name",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.compareTextUsingElementName(io.cucumber.datatable.DataTable)"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "US_006 TC_001",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US06_TC_01"
    }
  ]
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
  "name": "user provide valid username \"Team5Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"adminTeam5\"",
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
  "name": "Click to element with element name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.clickToElementWithElementName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Compare text using element name",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.compareTextUsingElementName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "US_006 TC_001",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US06_TC_01"
    }
  ]
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
  "name": "user provide valid username \"Team5Manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US16_StepDefinitions.user_provide_valid_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide valid password \"managerTeam5\"",
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
  "name": "Click to element with element name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.clickToElementWithElementName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user sees success message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US10_StepDefinitons.user_sees_success_message()"
=======
  "name": "Compare text using element name",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US06_StepDefinitions.compareTextUsingElementName(io.cucumber.datatable.DataTable)"
>>>>>>> main
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});