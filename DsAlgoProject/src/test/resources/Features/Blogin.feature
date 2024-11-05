Feature: feature to test DsAlgo logim page

@login
 Scenario: Check login is successful with invalid credentials.
    Given I go to the login page

    When user enters the username and password
    And Clicks on login button
    Then user is navigated to the home page
	

	
	Scenario: Check login  with valid credentials.
    Given I go to the login page

    When user enters the username and password
    And Clicks on login button
    Then user is navigated to the home page



 