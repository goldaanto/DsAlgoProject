
Feature: feature to test the home page
    @login 
   Scenario: Check the Data Structure Drop down
    Given the user is in the Home page
    When the user clicks on the Data Structure Dropdown icon
    Then User will view six different types of data structures lists
   
  Scenario: Check get started button of Data Structure - intro tab.
    Given User is in the home page 
    When user clicks the Get Started button
    Then user receives a error message
    
   