package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfiles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
	
	driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("H:\\New folder\\Gauri Resume\\resume2"

	
		

	}

}
