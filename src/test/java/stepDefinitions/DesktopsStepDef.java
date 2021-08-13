package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopsPageObject;
import utilites.WebDriverUtility;

public class DesktopsStepDef extends Base {

	 DesktopsPageObject desktop = new DesktopsPageObject();
		
	 
	 
	 
	 @When("^User click on Desktops tab$")
	 public void user_click_on_Desktops_tab() {
	   desktop.clickOnDeskTopsTab();
	  logger.info("User clicked on Desktop tab");
		
	 }

	 
	 @When("^User click on Show all desktops$")	 public void user_click_on_Show_all_desktops() {
	   desktop.clickOnShowAllDesktop();
	   logger.info("user click on Show All desktops");
		 
	 }
	 

	 @Then("^User should see all items are present in Desktop page$")
	 public void user_should_see_all_items_are_present_in_Desktop_page() {
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		logger.info("User should see all items present in Desktop page");
		 
	 }	 @When("^User click ADD TO CART option on 'HP LP3065' item$")
	 public void user_click_ADD_TO_CART_option_on_HP_LP_item()  {
     desktop.clickOnHPLP3065ADDTOCART();
	     logger.info("User clicked on HPLP add to cart");
	 }

	 @When("^User select quantity (\\d+)$")
	 public void user_select_quantity(String inputQuantity) {
		 desktop.enterquantity(inputQuantity);
		 logger.info("User select 1 quantity");
	 }

	 @When("^User click add to Cart button$")
	 public void user_click_add_to_Cart_button() {
		 desktop.clickonAddToCart();
	    logger.info("user added item to cart");
	 }

	 @Then("^User should see a message 'Success: You have added HP LP3065 to your shopping cart!'$")
	 public void user_should_see_a_message_Success_You_have_added_HP_LP_to_your_shopping_cart(String expectedMess){
		 String actual = desktop.SuccessMessageDisplayed();
		 String expect = expectedMess.substring(0, 7);
		 Assert.assertEquals(actual, expect);
		 logger.info("user added item to cart");
		 WebDriverUtility.screenShot();
		  
	 }

	 @When("^User click ADD TO CART option on 'Canon EOS 5D' item$")
	 public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item()  {
	   desktop.clickOnCanonEOS5D();
	   logger.info("User clicked add to cart");
	 }

	 @When("^User select color from dropdown 'Red'$")
	 public void user_select_color_from_dropdown_Red() {
	     desktop.clickOnRed();
	     logger.info("User chose Red color");
	 }
	 @When("^User click Add to Cart$")
	 public void user_click_add_to_Cart() {
    desktop.clickonAddToCart();
    logger.info("user added item to cart");
	 }
	 @Then("^User should see message 'Success: You have added Canon EOS 5D to your shopping cart!'$")
	 public void User_should_see_message_Success_You_have_added_Canon_EOS_5D_to_your_shopping_cart(String Expected)  {
		 String actual = desktop.SuccessMessageDisplayed();
		 String expect = Expected.substring(0, 7);
		 Assert.assertEquals(actual, expect);
		 logger.info("user added item with success");
		 WebDriverUtility.screenShot();

	 }

	 @When("^User click on Canon 5D item$")
	 public void user_click_on_Canon_D_item() {
		 desktop.clickOnCanonItem();
		 logger.info("User clicked on item");
	 }

	 @When("^User click on write a review link$")
	 public void user_click_on_write_a_review_link()  {
		 desktop.clickOnWiteAReview();
		 logger.info("User clicked on Write a Review");
	 }

	 @When("^User fill the review information with below information$")
	 public void user_fill_the_review_information_with_below_information(DataTable review)  {
		 List<Map<String, String>> dataValues = review.asMaps(String.class, String.class);
		 desktop.enterName(dataValues.get(0).get("yourName"));
		 desktop.enterReview(dataValues.get(0).get("yourReview"));
		 desktop.clickOnRatingChoice(dataValues.get(0).get("Rating"));
		 logger.info("User filled in review info");
	 }

	 @When("^User click on Continue button$")
	 public void user_click_on_Continue_button()  {
	    desktop.clickOnContinueButton();
	    logger.info("user clicked continue button");
	 }

	 @Then("^User should see a message with 'Thank you for your review\\. It has been submitted to the webmaster for approval\\.'$")
	 public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval(String expected) throws Throwable {
		 String actual = desktop.SuccessMessageDisplayed();
		 String expect = expected.substring(0, 7);
		 Assert.assertEquals(actual, expect);
	    logger.info("verify message is displayed");
	    WebDriverUtility.screenShot();
	 }



}
