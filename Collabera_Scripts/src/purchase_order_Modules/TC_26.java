package purchase_order_Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TC_26 {
	private WebElement clickOnMoreButton;

	@Test
	public void selectMoreButton() {
		String testURL = ExcelUtility.readStringData("sheet1", 0, 1);
		String username = ExcelUtility.readStringData("sheet1", 0, 2);
		String password = ExcelUtility.readStringData("sheet1", 0, 3);
		String expectedLoginPageTitle = ExcelUtility.readStringData("sheet1", 0, 4);
		String expectedHomePageTitle = ExcelUtility.readStringData("sheet1", 0, 5);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(testURL);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page displayed successfully");
		}else {
			System.out.println("Login page not displayed succesfully");
		}
		Login_Page loginPage = new Login_Page(driver);
		loginPage.getUsernameTextfield().sendKeys(username);
		loginPage.getPasswordTextfield().sendKeys(password);
		loginPage.getLoginButton().click();
		
		
		Home_Page homePage = new Home_Page(driver);
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home page displayed successfully");
		}else {
			System.out.println("Home page is not displayed");
		}
		homePage.getMoveOnMoreButton(clickOnMoreButton).click();
		
		
		
		
	}

}
