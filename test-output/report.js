$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/usakr/IdeaProjects/cucumberGherkin/src/test/java/com/house/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "customer wants to register",
  "description": "",
  "id": "customer-wants-to-register",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "with Ivalid credentials",
  "description": "",
  "id": "customer-wants-to-register;with-ivalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter \u003cInavlidname\u003e and \u003cpassord1\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I would have registered",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "customer-wants-to-register;with-ivalid-credentials;",
  "rows": [
    {
      "cells": [
        "Inavlidname",
        "passord1"
      ],
      "line": 22,
      "id": "customer-wants-to-register;with-ivalid-credentials;;1"
    },
    {
      "cells": [
        "ndfdf",
        "kris"
      ],
      "line": 23,
      "id": "customer-wants-to-register;with-ivalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "with Ivalid credentials",
  "description": "",
  "id": "customer-wants-to-register;with-ivalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter ndfdf and kris",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I would have registered",
  "keyword": "Then "
});
formatter.match({
  "location": "registration.i_am_on_home_page()"
});
formatter.result({
  "duration": 109239380,
  "status": "passed"
});
formatter.match({
  "location": "registration.i_enter_ndfdf_and_kris()"
});
formatter.result({
  "duration": 61003,
  "status": "passed"
});
formatter.match({
  "location": "registration.i_would_have_registered()"
});
formatter.result({
  "duration": 48308,
  "status": "passed"
});
});