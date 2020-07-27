Feature: To validate the login functionality in fb application

Background:

Given user has to be there in fb page

@Regression
Scenario: To verify the login with valid username and valid password
When user has to fill username and password
|username|password|
|jothi@gmail.com|jothi|
|shyam@gmail.com|shyamsundar|
And user clicks the login button
Then user navigate into homepage

@Sanity
Scenario: To verify the login with invalid username and invalid password
When user has to fill invalid username and invalid password
Then user should not able to navigate the homepage

@Smoke
Scenario: To verify the search bar
When user has to fill the product and click the search button
Then User should able to see the search results



