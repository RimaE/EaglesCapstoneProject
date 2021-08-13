package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base{
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement iPodClassic;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement iPodClassicAddToCart;
	
	@FindBy(xpath ="(//i[@class='fa fa-heart'])[2]" )
	private WebElement iPodClassicWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement iPodClassicCompare;
	
	@FindBy(xpath = "//img[@title='iPod Nano']")
	private WebElement iPodNanoImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Nano')]")
	private WebElement iPodNano;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement iPodNanoAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement iPodNanoWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement iPodNanoCompare;
	
	@FindBy(xpath = "//img[@title='iPod Shuffle']")
	private WebElement iPodShuffleImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]")
	private WebElement iPodShuffle;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement iPodShuffleAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement iPodShuffleWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement iPodShuffleCompare;
	
	@FindBy(xpath = "//img[@title='iPod Touch'] ")
	private WebElement iPodTouchImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Touch')]")
	private WebElement iPodTouch;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement iPodTouchAddToCart;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement iPodTouchWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement iPodTouchCompare;
	
	
}
