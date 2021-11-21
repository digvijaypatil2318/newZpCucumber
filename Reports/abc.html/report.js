$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/hanuman.feature");
formatter.feature({
  "name": "Orange Hrm function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "End to End Testing",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "userIsOnLoginPage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "userEnterValidUserName",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "UserEnterValidPassword",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "UserClickOnLoginButton",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "UserIsOnHomePage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});