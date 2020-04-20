package utils;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.htmlunit.corejs.javascript.ObjArray;

public class ExcelDataProviderFuncTestNG {

	WebDriver driver =null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void  setUPTest() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();		
		htmlReporter = new ExtentHtmlReporter("HTMLTestNGreport1ForExcelData.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	
		
	}

	@Test(dataProvider = "test1data" )
	public void test1(String username,String password) throws Throwable{
		
		test = extent.createTest("Excel data testNG");
		System.out.println(username+ " | " + password);	
		test.log(Status.INFO, "starting test");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		test.pass("opening the website");
		
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		test.fail("Not passing the user name values");
		
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		test.fail("Not passing the password values");
		
		Thread.sleep(2000);
	}

	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String ExcelPath = "/home/sarada/eclipse-workspace/Seleniumjavaframework/excel/demo_datafile_selenium.xlsx/";
		Object data[][] = TestData(ExcelPath, "Sheet1");
		return data;
	}

	public static Object[][] TestData(String ExcelPath, String WorkSheet) {
		ExcelUtils eu1 = new ExcelUtils(ExcelPath, WorkSheet);
		int rowcount = eu1.getRowCount();
		int colcount = eu1.getColCount();

		Object data[][] = new Object[rowcount-1][colcount];

		for(int i= 2; i<=rowcount; i++) {
			for(int j=0; j<colcount; j++) {
				String cellData = eu1.getRowDataString(i,j);
				System.out.print(cellData + " | ");
				data[i-2][j] = cellData;
			}
			System.out.println();
		}
		return data;	
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		test.pass("closing the browser");
		extent.flush();
	}
}
