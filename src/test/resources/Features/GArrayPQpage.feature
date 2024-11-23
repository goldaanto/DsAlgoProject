Feature: Feature to test the array practice questions page

Scenario: Check the Search the array page

Given User is on practice questions page	
When User clicks on Search the array Link	
Then User navigated to Search the array Page

Scenario Outline: Check Assessment page of search the array page
Given User is on Search the array Link	
When  User gives the input from "<SheetName>" and <RowNumber>
Then User clicks the Run button and submit button

Examples:
|SheetName|RowNumber|
|SearchArray|0|

Scenario Outline: Check Assessment page with invalid input of search the array page
Given User is on Search the array Link	
When  User gives the input from "<SheetName>" and <RowNumber>
Then User clicks the Run button and submit button

Examples:
|SheetName|RowNumber|
|SearchArray|1|

Scenario: Check the Max Consecutive Ones page	

Given User is on practice questions page	
When User clicks on Max Consecutive Ones Link	
Then User navigated to Max Consecutive Ones Page


Scenario Outline: Check Assessment page of Max Consecutive Ones page
Given User is on Max Consecutive Ones Link	
When  User gives the input from "<SheetName>" and <RowNumber>
Then User clicks the Run button and submit button

Examples:
|SheetName|RowNumber|
|Max|0|

Scenario: Check the Find Numbers with Even Number of Digits page	

Given User is on practice questions page	
When User clicks on Find Numbers with Even Number of Digits Link	
Then User navigated to Find Numbers with Even Number of Digits Page

Scenario Outline: Check Assessment page of Find Numbers with Even Number of Digits page
Given User is on Find Numbers with Even Number of Digits Link	
When  User gives the input from "<SheetName>" and <RowNumber>
Then User clicks the Run button and submit button


Examples:
|SheetName|RowNumber|
|Even|0|

Scenario: Check the Squares of  a Sorted Array page

Given User is on practice questions page	
When User clicks on Squares of  a Sorted Array Link	
Then User navigated to Squares of  a Sorted Array Page

Scenario Outline: Check Assessment page of Find Numbers with Even Number of Digits page
Given User is on Find Numbers with Even Number of Digits Link	
When  User gives the input from "<SheetName>" and <RowNumber>
Then User clicks the Run button and submit button


Examples:
|SheetName|RowNumber|
|Square|0|
