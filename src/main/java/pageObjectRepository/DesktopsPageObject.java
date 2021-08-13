package pageObjectRepository;

import java.util.List;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObject extends Base {
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement DesktopsTab;
	
	@FindBy(xpath="//a[contains(text(),'Show All Desktops')]")
	private WebElement ShowAllDesktops;
	
	
	@FindBy(xpath = "//img[@class='img-thumbnail']")
	private WebElement imageDesktops;
	
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement DeskTopTotal;
	
	@FindBy(xpath = "//a[@class='list-group-item'] [1]")
	private WebElement PCListItem;
	
	@FindBy(xpath = "//a[contains(text(),'- Mac (1)')]")
	private WebElement MacListItem;
	
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement LaptopsAndNoteBooksItemList;
	
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement ComponentsListItem;
	
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement TabletListItem;
	
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement SoftwareListItem;
	
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement PhonesAndPDASListItem;
	
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement CamerasListItem;
	
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement Mp3PlayersListItem;
	
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement HpBanner;
	
	@FindBy(id = "list-view")
	private WebElement listView;
	
	@FindBy(id = "grid-view")
	private WebElement gridView;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement compareTotal;
	
	@FindBy(id = "input-sort")
	private WebElement inputSort;
	
	@FindBy(id = "input-limit")
	private WebElement inputLimit;
	
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement AppleCinemaImage;
	
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement AppleCinema;
	
	@FindBy(xpath ="(//span[text()='Add to Cart'])[1]")
	private WebElement AppleAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement AppleWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement AppleCompareProduct;
	
	@FindBy(xpath ="(//a[text()='PC (0)'])[1]" )
	private WebElement PCSearch;
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement CanonEOS5DImage;
	
	@FindBy(xpath ="//a[contains(text(),'Canon EOS 5D')]" )
	private WebElement CanonEOS5D;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement CanonEOSAddToCart;
	
	@FindBy(id ="button-cart")
	private WebElement CanonEOSCartButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement CanonEOSWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement CanonEOSCompare;
	
	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement HPLP36065Image;
	
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement HPLP3065;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement HPLP3065AddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement HPLP3065WishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement HPLP3065Compare;
	
	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement HTCTouchHDImage;
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement HTCTouchHD;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement HTCTouchAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement HTCWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement HTCCompare;
	
	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement iPodClassic;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[6]")
	private WebElement iPodAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[7]")
	private WebElement iPodWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[6]")
	private WebElement iPodCompare;
	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement MacBookImage;
	
	@FindBy(linkText = "MacBook")
	private WebElement MacBook;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
	private WebElement MacBookAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[8]")
	private WebElement MacBookWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[7]")
	private WebElement MacBookCompare;
	
	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement MacBookAirImage;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement MacBookAir;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[8]")
	private WebElement MacBookAirAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[9]")
	private WebElement MacBookAirWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[8]")
	private WebElement MacBookAirCompare;
	
	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement PalmTreoProImage;
	
	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
	private WebElement PalmTreoPro;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[9]")
	private WebElement PalmTreoAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[10]")
	private WebElement PalmTreoWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[9]")
	private WebElement PalmTreoCompare;
	
	@FindBy(xpath = "//img[@title='Product 8']")
	private WebElement Product8Image;
	
	@FindBy(xpath = "//a[contains(text(),'Product 8')]")
	private WebElement Product8;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[10]")
	private WebElement Product8AddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[11]")
	private WebElement Product8WishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[10]")
	private WebElement Product8Compre;
	
	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement SamsungSyncMasterImage;
	
	@FindBy(xpath = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
	private WebElement SamsungSyncMaster;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[11]")
	private WebElement SamsungAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[12]")
	private WebElement SamsungWishList;
	
	@FindBy(xpath ="(//i[@class='fa fa-exchange'])[11]" )
	private WebElement SamsungCompare;
	
	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement SonyVaioImage;
	
	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
	private WebElement SonyVaio;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
	private WebElement SonyAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[11]")
	private WebElement SonyWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[12]")
	private WebElement SonyCompare;
	
	
	@FindBy(xpath = "//a[contains(text(),'Wish List')]")
	private WebElement wishListBottomFooter;
	
	@FindBy(id="input-quantity")
	private WebElement InputQuantity;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement CartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement AddToShopCartMessage;
	
	@FindBy(id = "input-option226")
	private WebElement inputDropdown;
	
	@FindBy(xpath = "//option[@value='15']")
	private WebElement Red;
	
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement WriteAReview;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement InputName;
	
	@FindBy(id = "input-review")
	private WebElement InputReview;
	
	@FindBy(xpath = "//input[@name='rating'][3]")
	private WebElement RatingChoice;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement ConintueButtonReview;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement formReview;
	
	public void clickOnDeskTopsTab() {
		WebDriverUtility.clickOnElement(DesktopsTab);
		
	}
	public void clickOnShowAllDesktop() {
		WebDriverUtility.clickOnElement(ShowAllDesktops);
	}
	
	public void clickOnHPLP3065ADDTOCART() {
		WebDriverUtility.clickOnElement(HPLP3065AddToCart);
	}
	public void enterquantity(String quantity) {
		WebDriverUtility.clearText(InputQuantity);
		WebDriverUtility.enterValue(InputQuantity, quantity);
		
	}
	public void clickonAddToCart() {
		WebDriverUtility.clickOnElement(CartButton);
	}
	public String SuccessMessageDisplayed() {
		 String actual = AddToShopCartMessage.getText().substring(0, 7);
		 return actual;
		 
		 
	}
	
	public void clickOnCanonEOS5D() {
		WebDriverUtility.clickOnElement(CanonEOSAddToCart);
	}
	public void clickOnSelectDropDown() {
		WebDriverUtility.clickOnElement(inputDropdown);
	}
	public void clickOnRed() {
		WebDriverUtility.clickOnElement(Red);
	}
	public void clickOnCanonItem() {
		WebDriverUtility.clickOnElement(CanonEOS5D);
	}
	
	public void clickOnWiteAReview() {
		WebDriverUtility.clickOnElement(WriteAReview);
	}
	public void enterName(String name) {
		WebDriverUtility.enterValue(InputName, name);
	}
	public void enterReview(String review) {
		
		WebDriverUtility.enterValue(InputReview, review);
	}
	public void clickOnRatingChoice(String rating) {
		WebDriverUtility.clickOnElement(RatingChoice);
	}
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(ConintueButtonReview);
	}
	public void verifyReviewFormIsDisplayed() {
		WebDriverUtility.isElementDisplayed(formReview);
	}
}

