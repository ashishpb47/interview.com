package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
	int	rows =	driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr")).size();
			System.out.println("Number of rows:"+rows);
			
			
			
		
		
	}

}
