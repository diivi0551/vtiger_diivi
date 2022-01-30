package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		//TC_026
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys("root");

		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[22]/a")).click();
		driver.findElement(By.name("Purchase Order")).click();
		//TC_027
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[11]/td[2]/textarea")).sendKeys("Rema sky view appartments, 3rd floor, B-31, Murgeshpallya, KR Garden, pin-500017 ");
		//TC_028
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[11]/td[4]/textarea")).sendKeys("Vijayawada, Benzcircle, Gurunanak Colony,Houseno-121,pin-521286");
		//TC_028
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[11]/td[2]/textarea")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[10]/td[2]/input")).click();
		//TC_029
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[11]/td[2]/textarea")).sendKeys("Rema sky view appartments, 3rd floor, B-31, Murgeshpallya, KR Garden, pin-500017");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[11]/td[4]/textarea")).clear();
		Thread.sleep(2000);
		//TC_030
		driver.findElement(By.xpath("//div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[10]/td[3]/input")).click();

	}

}
