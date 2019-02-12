$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/gooleSearch.feature");
formatter.feature({
  "name": "Customer info",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "As A manager could see all orders- POSITIVE",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user goes to url",
  "keyword": "Given "
});
formatter.match({
  "location": "UserOrderTable.user_goes_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be loggin",
  "keyword": "When "
});
formatter.match({
  "location": "UserOrderTable.user_should_be_loggin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be check orders",
  "keyword": "Then "
});
formatter.match({
  "location": "UserOrderTable.user_should_be_check_orders()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see order tables",
  "keyword": "Given "
});
formatter.match({
  "location": "UserOrderTable.user_should_see_order_tables()"
});
formatter.result({
  "status": "passed"
});
});