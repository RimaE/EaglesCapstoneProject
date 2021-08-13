$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LaptopsAndNotebooks.feature");
formatter.feature({
  "line": 2,
  "name": "Laptops and NoteBooks",
  "description": "",
  "id": "laptops-and-notebooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3105649800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LaptopsAndNoteBooks.user_is_on_retail_website()"
});
formatter.result({
  "duration": 1687026400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add and Remove a Mac book from Cart",
  "description": "",
  "id": "laptops-and-notebooks;add-and-remove-a-mac-book-from-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@AddAndRemoveMacBook"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User click on Laptop\u0026NoteBook option",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User click on Show all Laptop\u0026NoteBook option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on MacBook item",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should see a message \u0027Success: You have added MacBook to your shopping cart!\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User should see \u0027\u003c1 [item(s) - $]602.00\u003e\u0027 showed to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on cart option",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click on red button X to remove the item from cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "item should be removed and cart should show \u00270 item(s)\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsAndNoteBooks.user_click_on_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 106240100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooks.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 431707100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooks.user_click_on_MacBook_item()"
});
formatter.result({
  "duration": 1066975600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDef.user_click_add_to_Cart_button()"
});
formatter.result({
  "duration": 88117900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: You have added MacBook to your shopping cart!",
      "offset": 27
    }
  ],
  "location": "LaptopsAndNoteBooks.user_should_see_a_message_Sucess_You_have_added_MacBook_to_your_shopping_cart(String)"
});
formatter.result({
  "duration": 629202900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003c1 [item(s) - $]602.00\u003e",
      "offset": 17
    }
  ],
  "location": "LaptopsAndNoteBooks.user_should_see_item_s_showed_to_the_cart(String)"
});
formatter.result({
  "duration": 54555500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooks.user_click_on_cart_option()"
});
formatter.result({
  "duration": 69258000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNoteBooks.user_click_on_red_button_X_to_remove_the_item_from_cart()"
});
formatter.result({
  "duration": 5274428600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0 item(s)",
      "offset": 45
    }
  ],
  "location": "LaptopsAndNoteBooks.item_should_be_removed_and_cart_should_show_item_s(String)"
});
formatter.result({
  "duration": 5235559800,
  "status": "passed"
});
formatter.after({
  "duration": 4761605700,
  "status": "passed"
});
});