$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality in fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be there in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_has_to_be_there_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has to fill username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "jothi@gmail.com",
        "jothi"
      ]
    },
    {
      "cells": [
        "shyam@gmail.com",
        "shyamsundar"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_has_to_fill_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate into homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_navigate_into_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be there in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_has_to_be_there_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has to fill invalid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_has_to_fill_invalid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to navigate the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_should_not_able_to_navigate_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be there in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "POMStepDefinitionClass.user_has_to_be_there_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the search bar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user has to fill the product and click the search button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should able to see the search results",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});