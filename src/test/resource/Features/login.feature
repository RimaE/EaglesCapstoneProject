
Feature: Login to Retail website
# In feature file hashtag will be used as a comment
#Every feature file starts with Feature: <Name of Feature>
Background: 
	Given User is on Retail Website


@login @Regression @SmokeTest
Scenario: Login to MyAccount

Given User is on Retail Website
When User click on MyAccount
And User click on Login
And User enter userName 'eagles@tekschool.us' and password 'eagles'
And User click on Login button
Then User should be logged in to myAccount DashBoard


Scenario Outline: Login to MyAccount with Multiple users
	Given User is on Retail Website
	When User click on MyAccount
	And  User click on Login
	And User enter userName '<userName>' and password '<password>'
	And User click on Login button
	Then User should be logged in to myAccount Dashboard
	
	Examples:
	|userName|password|
	|eagles@tekschool.us|eagles|
	|hawks@tekschool.us|hawks|
	|falcons@tekschool.us|falcons|
	
@RegisterTestCase
	Scenario: Register new user Retail Website
	
	When User click on MyAccount
	And User click on Register option
	And User fill the Registration form with below information
	|firstName|lastName|eMail|telephone|password|passwordConfirm|Subscribe|
	|reema|Elian|RElian@tekschool.us|2020120099|bond007|bond007|no|
	And User Accept the privacy and policy
	And User click on continue button
	Then User should be registered in Retail Website
	
	
		
	