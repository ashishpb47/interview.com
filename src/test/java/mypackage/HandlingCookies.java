package mypackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies = 		 driver.manage().getCookies();
		System.out.println("Size of the Cookies:"+cookies.size());
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+" :"+cookie.getValue());
			
		}
		

		
		Cookie cokieobj = new Cookie("Mycookie123","123456");
		driver.manage().addCookie(cokieobj);
		
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Size of the cookies:"+cookies.size());
		
		
		driver.manage().deleteCookie(cokieobj);
		cookies = driver.manage().getCookies();
		
		System.out.println("Size of the cookies:"+cookies.size());
		
		
		
		
		
		
		
		
		
		
	}

}
