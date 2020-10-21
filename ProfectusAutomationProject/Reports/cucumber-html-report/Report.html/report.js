$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LinkedInSignInPage.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to linkedIn Home Page",
  "description": "Description: The purpose of this feature is to test the navigation to linkedInHomePage",
  "id": "navigate-to-linkedin-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Customer lands on linkedInHomePage using the URL",
  "description": "",
  "id": "navigate-to-linkedin-home-page;customer-lands-on-linkedinhomepage-using-the-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on linkedin Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is logged in and on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user search for profectus kamaljeet",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user send message to contact",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_is_on_linkedin_Home_Page()"
});
formatter.result({
  "duration": 7920785200,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 653430700,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_enters_credentials()"
});
formatter.result({
  "duration": 12412166500,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_is_logged_in_and_on_home_page()"
});
formatter.result({
  "duration": 11941200,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_search_for_profectus_kamaljeet()"
});
formatter.result({
  "duration": 457809000,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_send_message_to_contact()"
});
formatter.result({
  "duration": 3577565000,
  "status": "passed"
});
formatter.match({
  "location": "LinkedInSignInPageSteps.user_Logout()"
});
formatter.result({
  "duration": 2525658400,
  "status": "passed"
});
});