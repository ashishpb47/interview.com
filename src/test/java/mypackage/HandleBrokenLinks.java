package mypackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links =	driver.findElements(By.tagName("a"));
		
		for(WebElement linked:links) {
			
		String	url =  linked.getAttribute("href");
		
		if(url==null || url.isEmpty()) {
			System.out.println("Url is empty");
			continue;
			
		}
		
		 URL link = null;
		try {
			link = new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
		 
		 
		
		}

	}

}
