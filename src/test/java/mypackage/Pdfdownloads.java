package mypackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pdfdownloads {

	public static void main(String[] args) {
	
		String	locations = System.getProperty("user.dir")+"\\downloads";
		
		HashMap preferrences = new HashMap();
		preferrences.put("plugins.always_open_pdf_externally", true);
		preferrences.put("download.default_directory", locations);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferrences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		

	}

}
