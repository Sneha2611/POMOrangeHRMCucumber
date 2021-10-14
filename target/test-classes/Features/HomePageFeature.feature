Feature:
OrangeHRM Home page feature

Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|



Scenario:
Home page header

Then User gets home page header and homepage header should be "Dashboard"

Scenario:
Then User gets main menu list

|Admin|
|PIM|
|Leave|
|Time|
|Recruitment|
|My Info|
|Performance|
|Dashboard|
|Directory|
|Maintenance|
|Buzz|

