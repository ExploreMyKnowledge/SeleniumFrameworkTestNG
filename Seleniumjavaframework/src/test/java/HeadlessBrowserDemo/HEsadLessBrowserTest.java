package HeadlessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HEsadLessBrowserTest {
	@Test
	public void headlessBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testng.org/doc/");
		WebElement element = driver.findElement(By.linkText("Documentation"));
		
		element.click();
		
		String siteTitle =driver.getTitle();
		System.out.println(siteTitle);	
		
		driver.close();
		System.out.println("testcompleted");
		
	}

}
