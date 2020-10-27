Feature: Login Functionality test

Scenario Outline: Check the login functionality with valid credentials
Given browser is open
And user is on login page
When user enters <username> and <password>
And user clicks on login
Then user navigated to the home page

Examples: 
|username|password|
|pavi|12345|
|sasi|12345|