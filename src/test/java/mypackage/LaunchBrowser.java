package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devgan\\chromedriver_win32\\chromedriver.exe");
	
	//WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.youtube.com/watch?v=OdvgWRLP3CE&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=3");
	
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
	System.out.println("Title of the webpage is:" +driver.getTitle());
	System.out.println("Title of the webpage is:" +driver.getCurrentUrl());


		
		
	
		
		
		
		

	}

}
