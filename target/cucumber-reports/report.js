$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/discovery.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1617769804,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is Discovery Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User select the two videos from recommended for you as favourite",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User navigate to my video page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the videos should appear with correct show and title and description",
  "keyword": "Then "
});
formatter.match({
  "location": "DiscoverStepDefination.user_is_Discovery_Home_Page()"
});
formatter.result({
  "duration": 10925283344,
  "status": "passed"
});
formatter.match({
  "location": "DiscoverStepDefination.user_select_the_two_videos_from_recommended_for_you_as_favourite()"
});
formatter.result({
  "duration": 8567359730,
  "status": "passed"
});
formatter.match({
  "location": "DiscoverStepDefination.user_navigate_to_my_video_page()"
});
formatter.result({
  "duration": 32538015068,
  "status": "passed"
});
formatter.match({
  "location": "DiscoverStepDefination.the_videos_should_appear_with_correct_show_and_title_and_description()"
});
formatter.result({
  "duration": 10369870248,
  "status": "passed"
});
formatter.after({
  "duration": 221613539,
  "status": "passed"
});
});