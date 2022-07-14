package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		


		List<WebElement>checkBoxes =	driver.findElements(By.xpath("//input[@type ='checkbox' and contains(@id,'day')]"));
		

		
		System.out.println("Total No. of CheckBoxes:" +checkBoxes.size());
		
		//for(int i=0;i<checkBoxes.size();i++) {
			
		//checkBoxes.get(i).click();
		
		
		
			
		//}

		
		//for(WebElement chbox: checkBoxes) {
			
			//chbox.click();
			
		//}
		
		for(WebElement chbox:checkBoxes) {
			
	String	checkboxname =	chbox.getAttribute("id");
			
	if(checkboxname.equals("sunday") || checkboxname.equals("friday")  ) {
	
		chbox.click();
		
		
		
		
		
	}
			
			
		}
	}

}
