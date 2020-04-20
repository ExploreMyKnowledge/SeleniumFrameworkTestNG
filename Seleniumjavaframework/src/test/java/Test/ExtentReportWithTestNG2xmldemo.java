package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportWithTestNG2xmldemo {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	ExtentTest test2;
	
	static WebDriver driver = null;
	
	
	@BeforeSuite
	public void setUp() {
				
		htmlReporter = new ExtentHtmlReporter("HTMLTestNGreport1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);		
			  
	}
	@BeforeTest
	public void setUpTest(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void test() {
		 test = extent.createTest("Google search page test first");
		
		test.log(Status.INFO, "starting test");
		driver.get("https://www.google.com/");
		test.pass("Page opened");
		
		//test.log(Status.INFO, "entering the search text");
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("swedish for beginners");
		test.pass("the text got types");
		
		//test.log(Status.INFO, "clicking the button");
		//click on search button	
		driver.findElement(By.name("btnK")).click();
		test.pass("the search button is cliked");
	/**	
		//test.log(Status.INFO, "closing the test");
		driver.close();
		driver.quit();
		//test.pass("the driver is closed");
		test.pass("browser closed");
		test.log(Status.INFO, "test completed");  */
		
	}
	
	@Test
	public void Test2() {
		
		test2 = extent.createTest("Google search page test second");
		test2.log(Status.INFO, "starting test");
		driver.get("https://www.google.com/");
		test2.pass("Page opened");
		
		driver.findElement(By.name("q")).sendKeys("search for tigers");
		test2.pass("the text for tigers got typed");
		
		
		driver.findElement(By.name("btnK")).click();
		test2.pass("the search button is cliked for tigers");	
		
	}
	
	@AfterTest
	public void TearDownTest() {
		driver.close();
		driver.quit();
		
		test.pass("browser closed");
		test.log(Status.INFO, "test completed"); 
		test2.pass("browser closed");
		test2.log(Status.INFO, "test completed");
	}
	
	@AfterSuite
	public void tearDown() {		
		extent.flush();
	}
	

}
