Feature: Login Functionality
Description: Login functionality with valid data

Scenario: Login functionality with valid input data
Given User opens chrome browser
When User enter the url as "http://admin-demo.nopcommerce.com/login"
And User enter the username as "admin@yourstore.com" and password as "admin"
And Click on login button
Then Login should be successful
When Click on logout button
Then Logout should be successful