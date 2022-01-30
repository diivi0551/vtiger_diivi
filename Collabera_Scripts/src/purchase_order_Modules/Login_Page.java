package purchase_order_Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public  Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement usernameTextfield;
	@FindBy(name = "user_password")
	private WebElement passwordTextfield;
	@FindBy(id = "submitButton")
	private WebElement LoginButton;
	
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}

}