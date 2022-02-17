$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchase.feature");
formatter.feature({
  "name": "Mobile",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
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
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering crendentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_login_by_entering_crendentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile purchase",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@hardcode"
    }
  ]
});
formatter.step({
  "name": "user search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_click_on_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});