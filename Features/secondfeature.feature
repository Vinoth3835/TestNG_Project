@Login
Feature: validating gmail in google web application

Background:
Given open an browser
And load the google Url 
When click gmail link 

@Smoke
Scenario: Validating with valid username and Valid password in Gmail
Then verify the gmail dashboard

@Unit
Scenario: Validating with Invalid username and Valid password in Gmail
And in login provide Invalid username and valid password and click login button
Then verify the gmail dashboard

@Smoke
Scenario: Validating with Invalid username and InValid password in Gmail
And in login provide Invalid username and Invalid password and click login button
Then verify the gmail dashboard

@Regression
Scenario: Validating with Blank username and Valid password in Gmail
And in login provide Invalid username and valid password and click login button
Then verify the gmail dashboard

