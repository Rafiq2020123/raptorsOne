

Feature: Login Functionality 



Scenario: Log in into Gru99 website with valid username and password

Given User opens the application   
And User navigates to the login page 	
When Use enters username (username: "mngr554180")
And User entes password   (password: "UravunE")
And User clicks on the Login button
Then User should be able to see the welcome text 
And click on the log out button
Then User should be able clos ethe browser


Scenario: Log in into Gru99 website with multiple  username and password

Given User opens the application   
And User navigates to the login page 	
When Use enters username the belwo username and passwords

|username|password|
|user|pass1|
|user|pass2|
|user|pass3|
|user|pass4|
|user|pass5|
And User clicks on the Login button
Then User should be able to see the welcome text 
And click on the log out button
Then User should be able clos ethe browser



Background:
Given User opens the application   
And User navigates to the login page 



Scenario: Add a South West ticket to the cart 

When User enters for "South West" ticket in the search bar
And User clicks on the "South West" item
Then User sould be landed on the page with the title "We found 2 results for \"southwest"\" 
When User clicks on the Add button
Then User should be able to see only 1 item in the cart 
When User click on the cart button
Then User should be navigated to the check out page


 
 
 
 

