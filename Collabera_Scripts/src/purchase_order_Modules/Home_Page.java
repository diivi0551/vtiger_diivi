package purchase_order_Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public  Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="(//a[text()='More']")
	private WebElement clickOnMoreButton;

	@FindBy(xpath = "//a[text()='Purchase Order']")
	private WebElement clickOnPurchaseOrder;

	public WebElement getMoveOnMoreButton(WebElement clickOnMoreButton) {
		return clickOnMoreButton;
	}

	public WebElement getClickOnPurchaseOrder(WebElement clickOnPurchseOrder) {
		return clickOnPurchseOrder;
	}

	

}
