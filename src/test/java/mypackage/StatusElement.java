package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	 WebElement searchResult = 	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	System.out.println("Displayed Status :"	+searchResult.isDisplayed());
	System.out.println("Enabled  status :"	+searchResult.isEnabled());
	
	WebElement male = 	driver.findElement(By.xpath("//input[@id='gender-male']"));
	
	WebElement female = 	driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	
	
	
	female.click();
	System.out.println(female.isSelected());
	System.out.println(male.isSelected());
	
	
	
	
	
	
	
	
	}

}
