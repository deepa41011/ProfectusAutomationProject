Feature: Navigate to linkedIn Home Page
Description: The purpose of this feature is to test the navigation to linkedInHomePage
 
Scenario: Customer lands on linkedInHomePage using the URL
	Given user is on linkedin Home Page
	When user clicks on Sign in button
	Then user enters credentials
	Then user is logged in and on home page
	Then user search for profectus kamaljeet
	And user send message to contact
	Then user Logout

		
