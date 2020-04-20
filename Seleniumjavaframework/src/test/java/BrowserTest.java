import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		
		/** 
		 * To only set the webdrivermanager we can use the following command
		 * 
		// WebDriverManager.chromedriver().setup();
		 
		 To setup the webdrivermanager for linux specifically we can use
		 
		// WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
		 
		 To work with any specific version of webdriver we can write the following line
		 
		// WebDriverManager.chromedriver().version("2.0.13").setup();	
		 
		 you can download the dependency from github. you should add the dependency to the porn file to get the jar file. also from maven repository site. If not maven you can  get the jar files and can add.
		 
		 */
			
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.get("https://www.google.com/");
		
         driver.quit();
	}
	

}
