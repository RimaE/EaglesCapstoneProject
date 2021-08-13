$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("retailPage.feature");
formatter.feature({
  "line": 1,
  "name": "Retail Page",
  "description": "",
  "id": "retail-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4105338200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Retail Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on MyAccount",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter username \u0027Saleh@gmail.com\u0027 and password \u0027eagles\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDef.user_is_on_Retail_Website()"
});
formatter.result({
  "duration": 2269428800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 100888700,
  "status": "passed"
});
formatter.match({
  "location": "retailPage.user_click_on_Login()"
});
formatter.result({
  "duration": 340516900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Saleh@gmail.com",
      "offset": 21
    },
    {
      "val": "eagles",
      "offset": 52
    }
  ],
  "location": "retailPage.user_enter_username__and_password(String,String)"
});
formatter.result({
  "duration": 433237800,
  "status": "passed"
});
formatter.match({
  "location": "retailPage.user_click_on_login_button()"
});
formatter.result({
  "duration": 1041877900,
  "status": "passed"
});
formatter.match({
  "location": "retailPage.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "duration": 5176006900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Register as an Affiliate user with Cheque Payment Method",
  "description": "",
  "id": "retail-page;register-as-an-affiliate-user-with-cheque-payment-method",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@RegisterAffiliate"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User click on \u0027Register for an Affiliate Account\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User fill affiliate form with below information",
  "rows": [
    {
      "cells": [
        "company",
        "website",
        "taxID",
        "paymentMethod",
        "ChequePayeeName"
      ],
      "line": 15
    },
    {
      "cells": [
        "TekSchool",
        "https://tekschool.us/",
        "2345",
        "cheque",
        "Rima Elayan"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User check on About Us check box",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on Continue affiliate button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should see a success message \u0027Success: Your account has been successfully updated.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "retailPage.user_click_on_Register_for_an_Affiliate_Account_link()"
});
formatter.result({
  "duration": 10117375200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Register for an affiliate account\u0027]\"}\n  (Session info: chrome\u003d92.0.4515.131)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-1SLODI1E\u0027, ip: \u0027192.168.1.159\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.131, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\rimae\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61568}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: cbab156b9fcef94955dce0732f064b30\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Register for an affiliate account\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat utilites.WebDriverUtility.clickOnElement(WebDriverUtility.java:22)\r\n\tat pageObjectRepository.HomePageObject.clickOnAffiliateLink(HomePageObject.java:278)\r\n\tat stepDefinitions.retailPage.user_click_on_Register_for_an_Affiliate_Account_link(retailPage.java:54)\r\n\tat ✽.When User click on \u0027Register for an Affiliate Account\u0027 link(retailPage.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "retailPage.user_fill_affiliate_form_wih_below_information(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "retailPage.user_click_on_Continue_affiliate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: Your account has been successfully updated.",
      "offset": 35
    }
  ],
  "location": "retailPage.user_should_see_a_success_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 924905900,
  "status": "passed"
});
});