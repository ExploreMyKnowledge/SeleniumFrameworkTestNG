package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_TestNG {
	static WebDriver driver = null;
	
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			  
		 }
	
	@Test
	public static void googlesearch (){
		
		//open google site		
		driver.get("https://www.google.com/");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("swedish for beginners");
		
		//click on search button
		driver.findElement(By.name("btnK")).click();		
		
	}
	@AfterTest
	public void teardowntest() {
		driver.close();
	}

}
