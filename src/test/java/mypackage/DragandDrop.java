package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
	WebElement madrid = 	driver.findElement(By.id("box7"));
		WebElement italy = 	driver.findElement(By.id("box106"));
	Actions act = new Actions(driver);
	act.dragAndDrop(madrid, italy).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
