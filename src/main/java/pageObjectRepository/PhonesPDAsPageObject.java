package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	
	
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement HTCTouchImage;
	
	@FindBy(xpath ="//a[text()='HTC Touch HD']")
	private WebElement HTCTouchHD;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement AddToCartHTC;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement HTCWishList;
	
	@FindBy(xpath ="(//i[@class='fa fa-exchange'])[1]" )
	private WebElement HTCCompare;
	
	@FindBy(xpath = "(//img[@title='iPhone'])[1]")
	private WebElement iPhoneImage;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement iPhoneAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement iPhoneWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement iPhoneCompare;
	
	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement PalmTreoProImage;
	
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement PalmTreoPro;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement PalmTreoProAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement PalmTreoProWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement PalmTreoProCompare;
	
	
	
	
}
