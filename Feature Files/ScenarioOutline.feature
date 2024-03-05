Feature: Login Functionality with Scenario Outline 


Scenario Outline: Login to Grue99 Site with multiple users 


	When User click on Login 
	And  User enter username '<userName>' and password '<password>' 
	And  User click on Login button 
	Then User should be logged in to Grue99 dashboard 
	
	Examples: 
		|userName|password|
		|user@123.com|raptor|
		|consumer@home.us|Olman|
		|mikan@work.us|Palbin|