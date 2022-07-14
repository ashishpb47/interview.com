package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("div[class='drp1'] a[class='btn-primary dropdown-toggle btn-block']")).click();
	List<WebElement>	 productOptions = (List<WebElement>) driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
	System.out.println("Number of Options:"	+productOptions.size());

	}

}
