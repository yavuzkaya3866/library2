$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Book.feature");
formatter.feature({
  "name": "Book management",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should able to see Book Categories",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login as a \"student\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library2.stepDefs.LoginStepDefs.user_login_as_a(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click book_categories \"ALL\" selected by default",
  "keyword": "When "
});
formatter.match({
  "location": "com.library2.stepDefs.BookStepDefs.user_click_book_categories_selected_by_default(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see categories following below",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.library2.stepDefs.BookStepDefs.user_should_see_categories_following_below(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});