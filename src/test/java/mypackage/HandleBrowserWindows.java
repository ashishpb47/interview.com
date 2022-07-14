package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String	windowID =	driver.getWindowHandle();
		//System.out.println(windowID);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String>	windowsID = 	driver.getWindowHandles();
		//Iterator<String>	id =	windowsID.iterator();
				//String	parentWindowID = 	id.next();
				//String		childWindowID = id.next();
				
				//System.out.println("Parent Window ID is:"+parentWindowID);
				//System.out.println("Child window ID is:"+childWindowID);
				
		List<String>WindowsIDList = new ArrayList(windowsID);
		/*String	parentWindowID = WindowsIDList.get(0);
		String childWindowID =	WindowsIDList.get(1);
	
		System.out.println("Parent Window ID is:"+parentWindowID);
		System.out.println("Child window ID is:"+childWindowID);
	
	driver.switchTo().window(parentWindowID);
	System.out.println("ParentTitle of the page is:" +driver.getTitle());
	
	driver.switchTo().window(childWindowID);
	System.out.println("Child Title of the page is :"+driver.getTitle());
	*/
	
	
		for(String winID:WindowsIDList) {
			//System.out.println(winID);
			
			String id = driver.switchTo().window(winID).getTitle();
			if(id.equals("OrangeHRM")) {
			driver.close();
			
			
			}
			
			//System.out.println(id);
			
			
			//driver.quit();
			
			
		}
		
	}

}
