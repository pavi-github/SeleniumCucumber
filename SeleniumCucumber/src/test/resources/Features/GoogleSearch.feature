Feature: To test Google search functionality

Scenario: Validate Google search working
Given brower is open
And user is on google search
When user enters text in search box
And hits enter   
Then user is navigate to search results