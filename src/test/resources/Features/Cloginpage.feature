Feature: feature to test the welcome page
@login
   Scenario: Check login is successful with valid credentials.
    Given I go to the login page
    When user enters the username and password
    And Clicks on login button
    Then user is navigated to the home page