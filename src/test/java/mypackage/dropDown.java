package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
	WebElement drpDownEle =	driver.findElement(By.id("input-country"));
		
			Select drpDown = new Select(drpDownEle);
			//drpDown.selectByVisibleText("Canada");
			//drpDown.selectByValue("11");
			//drpDown.selectByIndex(9);
			
	List<WebElement>allOptions = 	drpDown.getOptions();
			
	for(
			WebElement options: allOptions) {
		
		
		if(options.getText().equals("Norway"))
		{
			
			options.click();
		}
		
		
	}
			
					
				
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
