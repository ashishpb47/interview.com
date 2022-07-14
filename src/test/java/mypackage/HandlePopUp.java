package mypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert	alertWindow =	driver.switchTo().alert();
			System.out.println("Display text :"	+alertWindow.getText());
			alertWindow.sendKeys("Done");
			alertWindow.accept();
			
				
	}

}
