$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("codingchallenge.feature");
formatter.feature({
  "line": 1,
  "name": "Tesltra Belong Coding Challenge",
  "description": "",
  "id": "tesltra-belong-coding-challenge",
  "keyword": "Feature"
});
formatter.before({
  "duration": 507026,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "While registering, if the email address is incorrect. User should see an error message",
  "description": "",
  "id": "tesltra-belong-coding-challenge;while-registering,-if-the-email-address-is-incorrect.-user-should-see-an-error-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicked on Signin button and enter incorrect  email address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should see an error message \"Invalid email address.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Home_page()"
});
formatter.result({
  "duration": 18142938886,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicked_on_Signin_button_and_enter_incorrect_email_address()"
});
formatter.result({
  "duration": 22690939621,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email address.",
      "offset": 34
    }
  ],
  "location": "StepDefinitions.user_should_see_an_error_message_something(String)"
});
formatter.result({
  "duration": 114303691,
  "status": "passed"
});
formatter.after({
  "duration": 845580658,
  "status": "passed"
});
formatter.before({
  "duration": 121111,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should be able to register using a valid email address",
  "description": "",
  "id": "tesltra-belong-coding-challenge;user-should-be-able-to-register-using-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User clicked on Signin button and enter correct email address \"abcpotnuru233@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Enter all following mandatory fields",
  "rows": [
    {
      "cells": [
        "cfirstname",
        "clastname",
        "password",
        "fName",
        "Lname",
        "addr1",
        "city",
        "state",
        "postcode",
        "country",
        "mobile",
        "ref"
      ],
      "line": 13
    },
    {
      "cells": [
        "Naveen",
        "Potnuru",
        "abc@123",
        "Naveen",
        "Potnuru",
        "2, tarneit Road, Tarneit",
        "Melbourne",
        "Virginia",
        "20102",
        "United States",
        "0449150984",
        "test"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should be able to register using a valid email address",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abcpotnuru233@gmail.com",
      "offset": 63
    }
  ],
  "location": "StepDefinitions.user_clicked_on_signin_button_and_enter_correct_email_address_something(String)"
});
formatter.result({
  "duration": 2365268,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat TelstraPages.LandingPage.Click_SignIn(LandingPage.java:22)\r\n\tat stepDefinitions.StepDefinitions.user_clicked_on_signin_button_and_enter_correct_email_address_something(StepDefinitions.java:97)\r\n\tat ✽.When User clicked on Signin button and enter correct email address \"abcpotnuru233@gmail.com\"(codingchallenge.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.enter_all_the_mandatory_fields(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.click_on_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_should_be_able_to_register_using_a_valid_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 413114,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.StepDefinitions.teardown(StepDefinitions.java:41)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:483)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:138)\r\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:82)\r\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:70)\r\n\tat org.testng.TestRunner$1.run(TestRunner.java:570)\r\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:717)\r\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:601)\r\n\tat org.testng.TestRunner.run(TestRunner.java:502)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeMulti(TestNGDirectoryTestSuite.java:198)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:94)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 159600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Check whether Megamenu works (Dresses -\u003e Summer dresses)",
  "description": "",
  "id": "tesltra-belong-coding-challenge;check-whether-megamenu-works-(dresses--\u003e-summer-dresses)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "megamenu Dresses\u003eSummer Dresses clicked",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User navigated to Summer dresses page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Home_page()"
});
formatter.result({
  "duration": 12544406389,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.megamenu_Dresses_Summer_Dresses_clicked()"
});
formatter.result({
  "duration": 3721842067,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_navigated_to_Summer_dresses_page()"
});
formatter.result({
  "duration": 10016532759,
  "status": "passed"
});
formatter.after({
  "duration": 889253193,
  "status": "passed"
});
formatter.before({
  "duration": 117006,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Select a dress and then add them item to cart, Validate whether same product name, colour and quantity are displayed in Cart Summary page.",
  "description": "",
  "id": "tesltra-belong-coding-challenge;select-a-dress-and-then-add-them-item-to-cart,-validate-whether-same-product-name,-colour-and-quantity-are-displayed-in-cart-summary-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "megamenu Dresses\u003eSummer Dresses clicked",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Select a dress by adding in cart",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User should see the same product added with name, colour, and quantity in cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Home_page()"
});
formatter.result({
  "duration": 12630656835,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.megamenu_Dresses_Summer_Dresses_clicked()"
});
formatter.result({
  "duration": 3725058708,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.select_a_dress_by_adding_in_cart()"
});
formatter.result({
  "duration": 15508361833,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"span[@id\u003d\u0027layer_cart_product_attributes\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.142)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HARISHGARG\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.142, chrome: {chromedriverVersion: 75.0.3770.140 (2d9f97485c7b..., userDataDir: C:\\Users\\HARISH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:49596}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9f80fd804b06d0aee5cf9573f0729d30\n*** Element info: {Using\u003dxpath, value\u003dspan[@id\u003d\u0027layer_cart_product_attributes\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:408)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat TelstraPages.ShoppingCart.Product_GetDetails(ShoppingCart.java:56)\r\n\tat stepDefinitions.StepDefinitions.select_a_dress_by_adding_in_cart(StepDefinitions.java:175)\r\n\tat ✽.And Select a dress by adding in cart(codingchallenge.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_should_see_the_same_product_added_with_name_colour_and_quantity_in_cart_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 890994429,
  "status": "passed"
});
});