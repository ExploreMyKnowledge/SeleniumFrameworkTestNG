package TestNGmultibrowsertesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.xalan.xsltc.runtime.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.ChromiumDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {
	WebDriver driver =null;
	
	/**The BrowserName value could be passed in the .xml file with the following line with parameter tag
	 * This is if you want browser after browser.
	 * <parameter name ="BrowserName" value = "chrome"></parameter> *********for chrome
	 * <parameter name ="BrowserName" value = "firefox"></parameter> *********for firefox
	 *  
	 * */
	
	@Parameters("BrowserName")
	@BeforeTest
	public void setUp(String BrowserName) {
		System.out.println("browser name :" + BrowserName);
		System.out.println("Thread id is :" + Thread.currentThread().getId());
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			}
	@Test	
	public void test1() {
		driver.get("https://testng.org/doc/documentation-main.html#logging-listeners");
		driver.findElement(By.linkText("Ant")).click();
	}

	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("test completed");
	}
}
