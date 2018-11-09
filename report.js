$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testRunners/resource.feature");
formatter.feature({
  "line": 1,
  "name": "Google Homepage",
  "description": "This feature verifies the functionality on Google Homepage",
  "id": "google-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check that main elements on Google Homepage are displayed",
  "description": "",
  "id": "google-homepage;check-that-main-elements-on-google-homepage-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I open Google Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the page displays search text box",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the page displays Google Search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the page displays Im Feeling Lucky button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_GoogleHomepage.i_launch_chrome_browser()"
});
formatter.result({
  "duration": 162329494,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_GoogleHomepage.I_open_Google_Homepage()"
});
formatter.result({
  "duration": 6544291799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_GoogleHomepage.I_verify_that_the_page_displays_search_text_box()"
});
formatter.result({
  "duration": 9452968,
  "error_message": "java.lang.NullPointerException\r\n\tat testRunners.StepDefs_GoogleHomepage.I_verify_that_the_page_displays_search_text_box(StepDefs_GoogleHomepage.java:47)\r\n\tat ✽.Then I verify that the page displays search text box(testRunners/resource.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefs_GoogleHomepage.the_page_displays_Google_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefs_GoogleHomepage.the_page_displays_Im_Feeling_Lucky_button()"
});
formatter.result({
  "status": "skipped"
});
});