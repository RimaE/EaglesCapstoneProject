package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {

	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement ShowAllComponents;
	
	@FindBy(xpath = "//a[contains(text(),'- Mice and Trackballs (0)')]")
	private WebElement MiceAndTrackBallsItemList;
	
	@FindBy(xpath ="//a[contains(text(),'- Monitors (2)')]" )
	private WebElement MonitorsItemList;
	
	@FindBy(xpath = "//a[contains(text(),'- Printers (0)')]")
	private WebElement PrintersItemList;
	
	@FindBy(xpath = "//a[contains(text(),'- Scanners (0)')]")
	private WebElement ScannersItemList;
	
	@FindBy(xpath ="//a[contains(text(),'- Web Cameras (0)')]" )
	private WebElement WebCamerasItemList;
	
	@FindBy(xpath = "(//a[text()='Mice and Trackballs (0)'])[2]")
	private WebElement MiceAndTrackballsRefineSearch;
	
	@FindBy(xpath = "(//a[text()='Monitors (2)'])[2]")
	private WebElement MonitorsRefineSearch;
	
	@FindBy(xpath = "(//a[text()='Printers (0)'])[2]")
	private WebElement PrintersRefineSearch;
	
	@FindBy(xpath = "(//a[text()='Scanners (0)'])[2]")
	private WebElement ScannersRefineSearch;
	
	@FindBy(xpath = "(//a[text()='Web Cameras (0)'])[2]")
	private WebElement WebCamerasRefineSearch;
	
	
	
	
}
