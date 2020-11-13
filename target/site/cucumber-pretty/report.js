$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "home page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verification the financing page",
  "description": "",
  "id": "home-page;verification-the-financing-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@T"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Lanuch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mouse over to financing link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on For Business Purchases",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Apply For Dell Business Credit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "homePageStepDep.lanuch(String)"
});
formatter.result({
  "duration": 6182979500,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.mouse_over_to_financing_link()"
});
formatter.result({
  "duration": 294711600,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_For_Business_Purchases()"
});
formatter.result({
  "duration": 874186500,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Apply_For_Dell_Business_Credit()"
});
formatter.result({
  "duration": 668082800,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_the_page()"
});
formatter.result({
  "duration": 4644274700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verification if user can create an account",
  "description": "",
  "id": "home-page;verification-if-user-can-create-an-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@T"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Lanuch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Create Account",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter \"\u003cFirst Name\u003e\",\"\u003cLast Name\u003e\", \"\u003cE-Mail\u003e\",\"\u003cNewPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click create AccountTwo",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "home-page;verification-if-user-can-create-an-account;",
  "rows": [
    {
      "cells": [
        "First Name",
        "",
        "Last Name",
        "",
        "E-Mail",
        "",
        "NewPassword"
      ],
      "line": 22,
      "id": "home-page;verification-if-user-can-create-an-account;;1"
    },
    {
      "cells": [
        "Tuhel",
        "",
        "Haque",
        "",
        "TuhelHaque20@gmail.com",
        "",
        "Tuhel12345"
      ],
      "line": 23,
      "id": "home-page;verification-if-user-can-create-an-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Verification if user can create an account",
  "description": "",
  "id": "home-page;verification-if-user-can-create-an-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@T"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Lanuch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Create Account",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter \"Tuhel\",\"Haque\", \"TuhelHaque20@gmail.com\",\"Tuhel12345\"",
  "matchedColumns": [
    0,
    2,
    4,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click create AccountTwo",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "homePageStepDep.lanuch(String)"
});
formatter.result({
  "duration": 3348506800,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Sign_in()"
});
formatter.result({
  "duration": 471665900,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_on_Create_Account()"
});
formatter.result({
  "duration": 1058224000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tuhel",
      "offset": 7
    },
    {
      "val": "Haque",
      "offset": 15
    },
    {
      "val": "TuhelHaque20@gmail.com",
      "offset": 24
    },
    {
      "val": "Tuhel12345",
      "offset": 49
    }
  ],
  "location": "homePageStepDep.enter(String,String,String,String)"
});
formatter.result({
  "duration": 6475844200,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.click_create_AccountTwo()"
});
formatter.result({
  "duration": 369343900,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verification",
  "description": "",
  "id": "home-page;verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@T"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "Lanuch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "verify title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "homePageStepDep.lanuch(String)"
});
formatter.result({
  "duration": 3210825100,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDep.verify_title()"
});
formatter.result({
  "duration": 11921900,
  "status": "passed"
});
});