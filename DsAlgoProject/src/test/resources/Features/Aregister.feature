Feature: Testing the Registration File

Scenario: Test the Registration Page
  
    Given I go to the Registration page
    When user enters the username, password and confirm password
    And Clicks on Submit button
    Then user  navigated to the home page
    
    