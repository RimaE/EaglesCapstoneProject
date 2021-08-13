package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectRepository.DesktopsPageObject;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopsAndNoteBooks extends Base {

	LaptopsNoteBooksPageObject laptopNotbook = new LaptopsNoteBooksPageObject();
	
	@Given("^User is on retail website$")
	public void user_is_on_retail_website() {
		openBrowser();
		logger.info("Retail Website is opened");
	}
	
	
	@When("^User click on Laptop&NoteBook option$")
	public void user_click_on_Laptop_NoteBook_option()  {
	   laptopNotbook.clickonLaptopAndNoteBookTab();
	   logger.info("user clicked on tab");
	}

	@When("^User click on Show all Laptop&NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option()  {
	    laptopNotbook.clickOnShowAllLaptopsAndNoteBooks();
	    logger.info("User clicked on show all laptops and Notbbooks");
	}

	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item()  {
	  laptopNotbook.clickOnMacBookItem();
	  logger.info("user clicked on item");
	}

	@Then("^User should see a message '(.+)'$")
	public void user_should_see_a_message_Sucess_You_have_added_MacBook_to_your_shopping_cart(String expectedMessage)  {
		String actual = laptopNotbook.SuccessCompareMacBookAir();
		 String expect = expectedMessage.substring(0, 7);
		 Assert.assertEquals(actual, expect);
		 logger.info("User verified message is displayed");
		 WebDriverUtility.screenShot();
	}

	@Then("^User should see '(.+)' showed to the cart$")
	public void user_should_see_item_s_showed_to_the_cart(String message) {
		System.out.println(message.length() + " Expected string length");
		System.out.println(laptopNotbook.verifyCartTotal().length() + " actual string length");
		Assert.assertEquals(message.contains("602.00"), laptopNotbook.verifyCartTotal().contains("602.00"));
		logger.info("actual equals to expected");

	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option()  {
	   laptopNotbook.clickOnCartTotal();
	   logger.info("user clicked on cart total");
	}

	@Then("^User click on red button X to remove the item from cart$")
	public void user_click_on_red_button_X_to_remove_the_item_from_cart()  {
	   laptopNotbook.clickOnRemoveButton();
	   logger.info("User click on X remove button");
	   WebDriverUtility.wait(5000);
	   WebDriverUtility.screenShot();
	}


	@Then("^item should be removed and cart should show '(.+)'$")
	public void item_should_be_removed_and_cart_should_show_item_s(String Message) {
		Assert.assertEquals(Message.substring(0, 1), laptopNotbook.verifyCartTotal().substring(0, 1));
		logger.info("actual equals to expected");
		WebDriverUtility.wait(5000);
		 WebDriverUtility.screenShot();
		
	}
	@When("^User click on product comparison icon on 'MacBook'$")
	public void user_click_on_product_comparison_icon_on_MacBook()  {
	  laptopNotbook.clickOnCompareMacBook();
	  logger.info("user clicked on macbook compare link");
	}

	@When("^User click on product comparison icon on 'MacBook Air'$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air()  {
	    laptopNotbook.clickOnMacBookAirCompare();
	    logger.info("user clicked on macbook air compare");
	}

	
//
//	@Then("^User should see a message 'Success:You have added MacBook Air to your product comparison!'$")
//	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison(String expected) {
//		String actual = laptopNotbook.SuccessCompareMacBookAir();
//		 String expect = expected.substring(0, 7);
//		 Assert.assertEquals(actual, expect);
//		WebDriverUtility.screenShot();
//		logger.info("Message is displayed");
//	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link()  {
	   laptopNotbook.clickOnCompareLink();
	   logger.info("user clicked comparison link");
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart(){
	   laptopNotbook.verifyChartComparison();
		WebDriverUtility.screenShot();
	   logger.info("Chart is displayed");
	}
	@Given("^User click on heart icon to add 'Song VaIo' laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Song_VaIo_laptop_to_wish_list()  {
	   laptopNotbook.clickOnSonyVaioWishList();
	   logger.info("User clicked on Sony Vaio wish list");
	}

	@Then("^User should get a login message '(.+)'$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VaIo_to_your_wish_list(String Expected) {
		String actual = laptopNotbook.LoginMessage();
		 String expect = Expected.substring(0, 3);
		 Assert.assertEquals(actual, expect);
		 WebDriverUtility.screenShot();
		 logger.info("message is displayed");
		
	}
	@Given("^User click on 'MacBook Pro' item$")
	public void user_click_on_MacBook_Pro_item()  {
		laptopNotbook.clickOnMacBookPro();
		logger.info("User clicked on MacBook Pro");
	}

	@Then("^User should see '\\$(\\d+),(\\d+)\\.(\\d+)' price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int num1, int num2, int num3)  {
		laptopNotbook.tagPriceOfMacIsDisplayed();
		WebDriverUtility.screenShot();
		logger.info("User verified that $2000 dollar tag is present");
//		String actualPrice = laptopNotbook.tagPriceOfMacIsDisplayed();
//		System.out.println(actualPrice);
//		Assert.assertEquals(actualPrice, expectedPrice);
	}


}
