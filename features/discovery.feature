Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is Discovery Home Page
	When User select the two videos from recommended for you as favourite 
	And User navigate to my video page
	Then  the videos should appear with correct show and title and description 
