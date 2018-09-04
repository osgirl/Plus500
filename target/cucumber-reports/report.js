$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sell.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: giedre.olseviciute@gmail.com"
    }
  ],
  "line": 3,
  "name": "app.plus500.com \u003e Trade \u003e Sell feature testing",
  "description": "I want to create, update and delete Sell feature in the system",
  "id": "app.plus500.com-\u003e-trade-\u003e-sell-feature-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@sell"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Create new sell in the plus500",
  "description": "",
  "id": "app.plus500.com-\u003e-trade-\u003e-sell-feature-testing;create-new-sell-in-the-plus500",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I want to login to the system with random account name",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select Sell action in the first row or the table",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "confirm action",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I validate that position \"Parduoti\" displayed in the bottom of the row",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Delete sell in the plus500",
  "description": "",
  "id": "app.plus500.com-\u003e-trade-\u003e-sell-feature-testing;delete-sell-in-the-plus500",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I want to login to the system with random account name",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "create new sell",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select Close action for created sell",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "confirm Close action",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I validate that position \"Parduoti\" not displayed in the bottom of the row",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Update sell in the plus500",
  "description": "",
  "id": "app.plus500.com-\u003e-trade-\u003e-sell-feature-testing;update-sell-in-the-plus500",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I want to login to the system with random account name",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "create new sell",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select Edit action for created sell",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "select Close At Profit checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I validate that checkox is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "confirm action",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I validate that Edit sidebar is not visible",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});