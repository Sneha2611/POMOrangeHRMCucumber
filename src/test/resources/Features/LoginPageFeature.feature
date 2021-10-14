Feature: OrangeHRM Login Page feature

Background:
Given User is on login page

Scenario:
Login Page header

When User gets the header of the login page
Then Login page header should be "LOGIN Panel"



Scenario:
Login with correct credentials

When User enters username "Admin"
And User enters password "admin123"
Then User clicks on login button
