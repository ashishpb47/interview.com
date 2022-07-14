package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaits {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		By eleLocator = By.xpath("//h3[normalize-space()='Selenium']");
		waitForElementPresent(driver,eleLocator,10);
		
		
		
WebElement	element=	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
		element.click();
		
		

	}

	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		
		
		return driver.findElement(locator);
		
		
		
	}

}
