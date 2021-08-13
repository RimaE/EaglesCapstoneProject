package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectRepository.DesktopsPageObject;
import pageObjectRepository.HomePageObject;
import pageObjectRepository.LoginPageObject;
import utilites.WebDriverUtility;

public class retailPage extends Base{
	
	HomePageObject homePage = new HomePageObject();
	LoginPageObject login = new LoginPageObject();
	
	
	@When("^User click on Login$")
	public void user_click_on_Login()  {
	   homePage.clickonLogin();
	   logger.info("User clicked on login");
	}

	@When("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username__and_password(String username, String password) {
	    homePage.enterEmail(username);
	    logger.info("User entered email");
	    homePage.enterPassword(password);
	    logger.info("User entered password");
	    WebDriverUtility.screenShot();
	}

	@When("^User click on Login button$")
	public void user_click_on_login_button()  {
		homePage.clickOnLoginButton();
		logger.info("User clicked on login button");
	}

	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard()  {
		WebDriverUtility.wait(5000);
		WebDriverUtility.screenShot();
		logger.info("user logged to myAccount Dashboard");
		
	}
		
	@When("^User click on 'Register for an Affiliate Account' link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link()  {
	    homePage.clickOnAffiliateLink();
	    logger.info("User clicked on affiliate Link");
	    
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_wih_below_information(DataTable register)throws Throwable {
		List<Map<String, String>>dataValues = register.asMaps(String.class, String.class);
		 homePage.enterValueCompanyName(dataValues.get(0).get("company"));
		 homePage.enterValueWebSiteName(dataValues.get(0).get("website"));
		 homePage.enterValueTaxID(dataValues.get(0).get("taxID"));
		 homePage.clickOnPaymentMethod(dataValues.get(0).get("paymentMethod"));
		 homePage.enterChequeePayeeName(dataValues.get(0).get("ChequePayeeName"));
		 logger.info("User filled in review info");
	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box()  {
	    homePage.clickOnAgreeAboutUs();
	    logger.info("User clicked on Agree About us check box");
	    
	}
	 @And("^User click on Continue affiliate button$")
	 public void user_click_on_Continue_affiliate_button() {
		 homePage.clickOnContinueButton();
		 logger.info("User clicked on continue button");
	 }
	@Then("^User should see a success message '(.+)'$")
	public void user_should_see_a_success_message(String expectedMessage)  {
	   String expected = expectedMessage.substring(0, 7);
	   String actual = homePage.Success();
	   Assert.assertEquals(expected, actual);
	   logger.info("Success message is displayed");
	   WebDriverUtility.screenShot();
	}
 		@When("^User click on 'Edit your affiliate information' link$")
 		public void user_click_on_edit_your_affiliate_information_link(){
 			homePage.clickOnEditYourAffiliate();
 			logger.info("User clicked on edit affiliate");
 	}
 		@Then("^User click on Bank Transfer radio button$")
 		public void user_click_on_Bank_Transfer_radio_button()  {
	    homePage.clickOnBankTransfer();
	    logger.info("User click on bank transfer");
	}

	@And("^User fill bank information with below information$")
	public void user_fill_bank_information_with_below_information(DataTable editAffiliate) throws Throwable {
		List<Map<String, String>>dataValues = editAffiliate.asMaps(String.class, String.class);
		 homePage.enterBankName(dataValues.get(0).get("bankName"));
		 homePage.enterbranchNumber(dataValues.get(0).get("abaNumber"));
		 homePage.enterSwiftCode(dataValues.get(0).get("swiftCode"));
		 homePage.enterAccountName(dataValues.get(0).get("accountName"));
		 homePage.enterAccountNumber(dataValues.get(0).get("accountNumber"));
		 logger.info("User edited affiliate info");
	}

	@When("^User click on 'Edit your account information' link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		homePage.clickOnEditAccountInfo();
		logger.info("User clicked on edit account");
		
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable EditAccount) throws Throwable {
		List<Map<String, String>>dataValues = EditAccount.asMaps(String.class, String.class);
		login.enterFirstName(dataValues.get(0).get("firstName"));
		login.enterLastName(dataValues.get(0).get("lastName"));
		login.enterEmail(dataValues.get(0).get("email"));
		login.enterTelephone(dataValues.get(0).get("telephone"));
		logger.info("User updated account info");
	}

//	@Then("^User should see a message '(.+)'$")
//	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated(String expectedMessage)  {
//		String expected = expectedMessage.substring(0, 7);
//		   String actual = homePage.Success();
//		   Assert.assertEquals(expected, actual);
//		   logger.info("Success message is displayed");
//		   WebDriverUtility.screenShot();
	


}
