package pageObjectRepository;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base{

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement Currency;
	
	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement PhoneNumber;
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement MyAccountLogin;
	
	@FindBy(xpath = "//span[contains(text(),'Wish List (0)')]")
	private WebElement WishList;
	
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement ShoppingCart;
	
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement CheckOut;
	
	@FindBy(id = "logo")
	private WebElement logo;
	
	@FindBy(id = "cart-total")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement deskTops;
	
	@FindBy(xpath="//a[contains(text(),'Show All Desktops')]")
	private WebElement ShowAllDesktops;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooks;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptopsAndNotebooks;
	
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement ShowAllComponents;

	
	@FindBy(xpath = "(//a[text()='Tablets'])[1]")
	private WebElement Tablets;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Cameras')]")
	private WebElement ShowAllCameras;
	
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement Software;
	
	@FindBy(xpath ="//a[contains(text(),'Phones & PDAs')]")
	private WebElement PhonesAndPDAs;
	
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement Cameras;
	
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement Mp3Players;
	@FindBy(xpath = "//a[contains(text(),'Show All MP3 Players')]")
	private WebElement ShowAllMp3Players;
	
	@FindBy(id = "slideshow0")
	private WebElement slideshow;
	
	@FindBy(id="search")
	private WebElement search;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchIcon;
	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement MacBookImage;
	
	@FindBy(xpath ="//a[text()='MacBook']")
	private WebElement mackBook;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;
	
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement AppleImage;
	
	@FindBy(xpath="//a[text()='Apple Cinema 30\"']")
	private WebElement Apple;
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement CanonImage;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement Canon;
	
	@FindBy(id = "carousel0")
	private WebElement Carousel;
	
	@FindBy(xpath = "//h5[contains(text(),'Information')]")
	private WebElement Information;
	
	@FindBy(linkText ="About Us")
	private WebElement AboutUs;
	
	@FindBy(linkText = "Delivery Information")
	private WebElement DeliveryInfo;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement PrivacyPolicy;
	
	@FindBy(linkText = "Terms & Conditions")
	private WebElement TermsAndConditions;
	
	@FindBy(xpath = "//h5[contains(text(),'Customer Service')]")
	private WebElement CustomerService;
	
	@FindBy(xpath ="//a[contains(text(),'Contact Us')]" )
	private WebElement ContactUs;
	
	@FindBy(linkText = "Returns")
	private WebElement Returns;
	
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement CartMessageTotal;
	
	@FindBy(linkText = "Site Map")
	private WebElement SiteMap;
	
	@FindBy(xpath = "//h5[text() ='Extras']")
	private WebElement Extras;
	
	@FindBy(linkText = "Brands")
	private WebElement Brands;
	
	@FindBy(xpath = "//a[contains(text(),'Gift Certificates')]")
	private WebElement GiftCertificates;
	
	@FindBy(linkText="Affiliate")
	private WebElement Affiliate;
	
	@FindBy(linkText = "Specials")
	private WebElement Specials;
	
	@FindBy(xpath = "//h5[contains(text(),'My Account')]")
	private WebElement myAccountHeader;
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement MyAccount;
	
	@FindBy(xpath = "//a[contains(text(),'Order History')]")
	private WebElement OrderHistory;
	
	@FindBy(xpath = "//a[contains(text(),'Wish List')]")
	private WebElement wishListBottomFooter;
	
	@FindBy(xpath = "//a[contains(text(),'Newsletter')]")
	private WebElement Newsletter;
	
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement EuroCurrency;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditAffiiate;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement AffiliateLink;
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement diplayEuro;
	
	@FindBy(id = "input-company")
	private WebElement CompanyName;
	
	@FindBy(id = "input-website")
	private WebElement WebsiteName;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement AgreeAboutUs;
	
	@FindBy(xpath = "//input[@value='cheque'][1]")
	private WebElement cheque;
	
	@FindBy(id = "input-tax")
	private WebElement taxID;
	
	@FindBy(id = "input-paypal")
	private WebElement payPalAccount;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessage;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement BankTransfer;
	
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement BankName;
	
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement SwiftCode;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement AccountName;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement AccountNumber;
	
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement EditAccountInfo;
	
	@FindBy(id = "input-cheque")
	private WebElement ChequeePayeeName;
	
	public void enterChequeePayeeName(String name) {
		WebDriverUtility.enterValue(ChequeePayeeName, name);
	}
	public void clickOnSearchBar() {
		WebDriverUtility.clickOnElement(search);
	}
	public void clickonLogin() {
		WebDriverUtility.clickOnElement(login);
	}
	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);

}
	public void clickOnEditYourAffiliate() {
		WebDriverUtility.clickOnElement(EditAffiiate);
	}
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);

}
	public void enterAccountName(String accountName) {
		WebDriverUtility.clearText(AccountName);
		WebDriverUtility.enterValue(AccountName, accountName);
	}
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	public void clickOnAffiliateLink() {
		WebDriverUtility.clickOnElement(AffiliateLink);
	}
	public void clickOnAgreeAboutUs() {
		WebDriverUtility.clickOnElement(AgreeAboutUs);
	}
	public void enterValueWebSiteName(String WebSiteName) {
		WebDriverUtility.clearText(WebsiteName);
		WebDriverUtility.enterValue(WebsiteName, WebSiteName);
	}
	public void enterValueCompanyName(String companyName) {
		WebDriverUtility.clearText(CompanyName);
		WebDriverUtility.enterValue(CompanyName,companyName );
	}
	public void clickOnPaymentMethod(String payment) {
		WebDriverUtility.clickOnElement(cheque);
	}
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	public void enterValueTaxID(String TaxID) {
		WebDriverUtility.enterValue(taxID, TaxID);
	}
	public String Success() {
		String actual = SuccessMessage.getText().substring(0, 7);
		return actual;
	}
	public void clickOnCurrency() {
		WebDriverUtility.clickOnElement(Currency);
		
	}
	public void clickOnEuro() {
		WebDriverUtility.clickOnElement(EuroCurrency);
	}
	public void verifyEuroDisplayed() {
		WebDriverUtility.isElementDisplayed(diplayEuro);
	}
	public void clickOnShoppingCartTotal() {
		WebDriverUtility.clickOnElement(cartTotal);
	}
	public void verifyCartTotalAmountDisplayed() {
		WebDriverUtility.isElementDisplayed(CartMessageTotal);
	}
	public void clickOnBankTransfer() {
		WebDriverUtility.clickOnElement(BankTransfer);
	}
	public void enterBankName(String bankName) {
		WebDriverUtility.clearText(BankName);
		WebDriverUtility.enterValue(BankName, bankName);
	}
	public void enterbranchNumber(String BranchNumber) {
		WebDriverUtility.clearText(branchNumber);
		WebDriverUtility.enterValue(branchNumber, BranchNumber);
		
	}
	public void clickOnEditAccountInfo() {
		WebDriverUtility.clickOnElement(EditAccountInfo);
	}
	public void enterSwiftCode(String Swift) {
		WebDriverUtility.clearText(SwiftCode);
		WebDriverUtility.enterValue(SwiftCode, Swift);
	}
	public void enterAccountNumber(String accountNumber) {
		WebDriverUtility.clearText(AccountNumber);
		WebDriverUtility.enterValue(AccountNumber, accountNumber);
	}
}