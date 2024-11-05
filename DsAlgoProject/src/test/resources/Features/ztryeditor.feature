Feature: Feature file to test Try Editor

Scenario: To execute the correct Python Statement
Given User is on the Try Editor Page
When User enters the Python statement in the editor
And User clicks on Run button
Then Statement will be executed and Result shown

Scenario: To execute the Incorrect Python Statement
Given User is on the Try Editor Page
When User enters the Python statement in the editor
And User clicks on Run button
Then Popup Window displayed with error msg