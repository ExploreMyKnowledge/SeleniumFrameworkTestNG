package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTest {
	
	
	public static void main(String[] args) {
				
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("HTMLreport1.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google search page test");
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//test.log(Status.INFO, "opening the page");
		//open google site		
		
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
		
		//test.log(Status.INFO, "closing the test");
		driver.close();
		driver.quit();
		//test.pass("the driver is closed");
		test.pass("browser closed");
		test.log(Status.INFO, "test completed");
		
		extent.flush();
		
		
	}

}
