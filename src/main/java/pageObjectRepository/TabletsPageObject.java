package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base{

	public TabletsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Tablets'])[2]")
	private WebElement TabletsHome;
	
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement Listview;
	
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement Gridview;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement CompareTotal;
	
	@FindBy(xpath = "//img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement SamsungGalaxyTabImage;
	
	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement SamsungGalaxyTab;
	
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement AddToCartSamsung;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement WishListSamsung;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement CompareSamsung;
	
	
	
}
