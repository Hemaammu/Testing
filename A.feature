Feature: QCD Testing

Scenario: open Google browser and QCD Home page
Given User is on Home Page
When go to QCD Home page
Then check the Homepage details

Scenario: Successful Login with Valid Credentials
	When User enters UserName and Password
	Then Message displayed Login Successfully

Scenario: Agencymanagement functionality 
When click on AM button
When Click on Agency list the value
Then clcik on search 

Scenario: Agencymanagement functionality on agency value
When click on AMicon button
When Click on Add Agency the value
Then fills all the details and submit

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully