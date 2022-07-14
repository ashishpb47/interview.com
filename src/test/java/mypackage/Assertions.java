package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		@BeforeClass
		void login()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://opensource-demo.orangehrmlive.com/");
		driver1.manage().window().maximize();
		}
		@test
		WebElement	logo =	driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		Assert.assertTrue(logo.isDisplayed());
		
	}

	

}
