@CompleteTest
Feature: DeskTop Page

Background: 
			Given User is on Retail Website

@VerifyDeskTopTab
Scenario: User verify all items are present in Desktops tab			
When User click on Desktops tab 
And User click on Show all desktops 
Then User should see all items are present in Desktop page

@Test1
Scenario: User add HP LP 3065 from Desktops tab to the cart

When User click on Desktops tab
And User click on Show all desktops
And User click ADD TO CART option on 'HP LP3065' item
And User select quantity 1
And User click add to Cart button
Then User should see a message 'Success: You have added HP LP3065 to your shopping cart!'

@test
Scenario: User add Canon EOS 5D from Desktops tab to the cart

When User click on Desktops tab
And User click on Show all desktops
And User click ADD TO CART option on 'Canon EOS 5D' item
And User select color from dropdown 'Red'
And User select quantity 1
And User click Add to Cart 
Then User should see message 'Success: You have added Canon EOS 5D to your shopping cart!'

@TestReview
Scenario: User add a review to Canon EOS 5D item in Desktops tab

When User click on Desktops tab
And User click on Show all desktops
And User click on Canon 5D item
And User click on write a review link
And User fill the review information with below information
|yourName|yourReview|Rating|
|Rima|My review. This camera is great!  I will refer it to anyone i know. Thank you so much!Very good purchase.|3|
And User click on Continue button
Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'
