package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LoginPageObject;
import utilites.WebDriverUtility;

public class LoginTestStepDef extends Base{
	
	LoginPageObject login = new LoginPageObject();
	
	@Given("^User is on Retail Website$")
	public void user_is_on_Retail_Website() {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
	}
	
	@When("^User click on MyAccount$")
	public void user_click_on_MyAccount()  {
		login.clickOnMyAccount();
		logger.info("User clicked on MyAccount");

	    
	}

	@When("^User click on Register option$")
	public void user_click_on_Register_option() {
		login.clickOnRegisterOption();
		logger.info("user clicked on Register option");

	    
	}

	@When("^User fill the Registration form with below information$")
	public void user_fill_the_Registration_form_with_below_information(DataTable info)  {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		login.enterFirstName(dataValues.get(0).get("firstName"));
		login.enterLastName(dataValues.get(0).get("lastName"));
		login.enterRegistrationEmail(dataValues.get(0).get("eMail"));
		login.enterTelephone(dataValues.get(0).get("telephone"));
		login.enterRegistrationPassword(dataValues.get(0).get("password"));
		login.enterConfirmPassword(dataValues.get(0).get("passwordConfirm"));
		login.subscribe(dataValues.get(0).get("Subscribe"));
		logger.info("User filled the information form");
		

	    
	}

	@When("^User Accept the privacy and policy$")
	public void user_Accept_the_privacy_and_policy() {
		login.clickOnPrivacyPolicy();
	    logger.info("user accepted privacy and policy");
	    WebDriverUtility.screenShot();

	    
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button()  {
		login.clickOnContinueButton();
		   logger.info("user clicked on continue button");

	    
	}

	@Then("^User should be registered in Retail Website$")
	public void user_should_be_registered_in_Retail_Website()  {
		  String expectedMessage = "Your Account Has Been Created!";
		  String actualMessage = login.accountCreationMessage();
		  Assert.assertEquals(expectedMessage, actualMessage);
		  logger.info("user Account has been created");
		  WebDriverUtility.screenShot();

	    
	}


	
}
