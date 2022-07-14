package mypackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFiles {

	public static void main(String[] args) {
		
		
	String	locations = System.getProperty("user.dir")+"\\downloads";
	
	HashMap preferrences = new HashMap();
	preferrences.put("download.default_directory", locations);
	
	ChromeOptions Options = new ChromeOptions();
	Options.setExperimentalOption("prefs", preferrences);
	
	
	
	
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(Options);
	
	//HashMap preferrences = new HashMap();
	//preferrences.put("download.default_directory", locations);
	
	//EdgeOptions Options = new EdgeOptions();
	//Options.setExperimentalOption("prefs", preferrences);
	
	
	
	
	
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver(Options);
		
		
		
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		

	}

}
