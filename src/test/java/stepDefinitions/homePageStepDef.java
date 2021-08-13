package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;

public class homePageStepDef extends Base {
	
	HomePageObject home = new HomePageObject();
	
	
	@When("^User click on Currency$")
	public void user_click_on_Currency() throws Throwable {
	  home.clickOnCurrency();
	  logger.info("User clicked on currency");
	}

	@When("^User Chose Euro from dropdown$")
	public void user_Chose_Euro_from_dropdown() throws Throwable {
	    home.clickOnEuro();
	    logger.info("User clicked Euro Currency");
	}

	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() throws Throwable {
	  home.verifyEuroDisplayed();
	  logger.info("User verified Euro is displayed");
	}
	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart() throws Throwable {
	    home.clickOnShoppingCartTotal();
	    logger.info("User clicked on cart total");
	}

	@Then("^\"([^\"]*)\" message should be displayed$")
	public void message_should_be_displayed(String arg1) throws Throwable {
	   home.verifyCartTotalAmountDisplayed();
	   logger.info("User verified cart total message is displayed");
	}



}
