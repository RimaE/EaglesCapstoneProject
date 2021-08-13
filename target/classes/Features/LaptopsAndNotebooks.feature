
Feature: Laptops and NoteBooks


Background:
 Given User is on retail website


@AddAndRemoveMacBook
Scenario: Add and Remove a Mac book from Cart

When User click on Laptop&NoteBook option
And User click on Show all Laptop&NoteBook option
And User click on MacBook item
And User click add to Cart button
Then User should see a message 'Success: You have added MacBook to your shopping cart!'
And User should see '<1 [item(s) - $]602.00>' showed to the cart
And User click on cart option
And User click on red button X to remove the item from cart
Then item should be removed and cart should show '0 item(s)'

@ProductComarison
Scenario: Product Comparison

When User click on Laptop&NoteBook option
And User click on Show all Laptop&NoteBook option
And User click on product comparison icon on 'MacBook'
And User click on product comparison icon on 'MacBook Air'
Then User should see a message 'Success:You have added MacBook Air to your product comparison!'
And User click on Product comparison link
Then User should see Product Comparison Chart

@AddingItemToWishList
Scenario: Adding an item to Wish list
When User click on Laptop&NoteBook option
And User click on Show all Laptop&NoteBook option
And User click on heart icon to add 'Song VaIo' laptop to wish list
Then User should get a message 'You must login or create an account to save Sony VaIo to your wish list!'

@ValidateThePriceOfMacBook
Scenario: Validate the price of MacBook Pro 2000
When User click on Laptop&NoteBook option
And User click on Show all Laptop&NoteBook option
And User click on 'MacBook Pro' item 
Then User should see '$2,000.00' price tag is present on UI.
