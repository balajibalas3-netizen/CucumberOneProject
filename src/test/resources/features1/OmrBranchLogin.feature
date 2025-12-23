Feature: Verifying omrbranch login page

Scenario Outline:Verifying omrbranch credentials

Given user is on the omrbranch login page
When user enter "<userName>" and "<password>"
And user clicks the login button
Then user should verify after login sucess message

Examples:
|userName|password|
|balaji@gmail.com|Bala@123|


Scenario Outline:Verifying instagram credentials

Given user is on the omrbranch login page
When user enter "<userName>" and "<password>"
And user clicks the login button
Then user should verify after login sucess message

Examples:
|userName|password|
|amalnath@gmail.com|Amal@123|
|suriya@gmail.com|Suriya@123|
