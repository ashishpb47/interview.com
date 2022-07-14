package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getText {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	WebElement	emailBox = driver.findElement(By.id("Email"));
	//emailBox.clear();
	//emailBox.sendKeys("admin123@gmail.com");
	
	//WebElement	passBox = 	driver.findElement(By.id("Password"));
	
	//passBox.clear();
	//passBox.sendKeys("admin");
	

	
		//WebElement	buttonClick =	driver.findElement(By.xpath("//button[@type='submit']"));
		//buttonClick.click();
		
		System.out.println("Result Display from getattribute:"+emailBox.getAttribute("value"));
		WebElement	buttonClick =	driver.findElement(By.xpath("//button[@type='submit']"));
System.out.println("Result from getText is:"+buttonClick.getText());


		WebElement	headerOne =	driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']"));
				System.out.println("Result from Header is:"	+headerOne.getText());
				
					
	}

}
