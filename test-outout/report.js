$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("weightwatchers.feature");
formatter.feature({
  "line": 1,
  "name": "Weightwatchers Website Functions",
  "description": "",
  "id": "weightwatchers-website-functions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Weightwatchers Login Test",
  "description": "",
  "id": "weightwatchers-website-functions;weightwatchers-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of landing page contains Weight Loss Program, Recipes \u0026 Help | Weight Watchers",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Find A Meeting",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user verifies web page contains Get Schedules \u0026 Times Near You",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters text in the search field and clicks search",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "print result title and distance and verify",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "print TODAY’s hours of operation",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FindAMeetingSteps.user_already_on_landing_page()"
});
formatter.result({
  "duration": 6455097571,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.verify_title_tag()"
});
formatter.result({
  "duration": 28598099,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.user_clicks_on_Find_A_Meeting()"
});
formatter.result({
  "duration": 1608574150,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.user_verifies_web_page_contains_Get_Schedules_Times_Near_You()"
});
formatter.result({
  "duration": 8574406,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.user_enters_text_in_the_search_field_and_clicks_search()"
});
formatter.result({
  "duration": 313840841,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.print_result_title_and_distance_and_verify()"
});
formatter.result({
  "duration": 1023527375,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.print_TODAY_s_hours_of_operation()"
});
formatter.result({
  "duration": 93073019,
  "status": "passed"
});
formatter.match({
  "location": "FindAMeetingSteps.close_the_browser()"
});
formatter.result({
  "duration": 709001094,
  "status": "passed"
});
});