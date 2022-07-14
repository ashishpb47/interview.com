package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
	//WebElement	searchbox =	driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		//searchbox.sendKeys("xyz");
		
			//WebElement	ele =	driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
			//System.out.println(ele.getText());
			
			
	//WebElement	searchButton = 	driver.findElement(By.xpath("//button[@type='login']"));
	

	
	List<WebElement>links =	driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	System.out.println("Number of elements Captured :" +links.size());
	
	
	for(WebElement ele:links)
	
	{
		System.out.println(ele.getText());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}

}
