package listeners;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/**
 * To add listener class for 1 class write the following line 
 * @Listeners(listeners.TestNGListeners.class)
 * 
 * If you want to include multiple classes then convert the class file into xml and include it under the suite
 * as demonstrated in testinglistener.xml file
 * 
 * If you want to add it at package lever while creating choose packages. Refer to testinglistener1.xml
 * */

public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	@Test
	public void test2() throws InterruptedException {
		System.out.println("I am inside test2");
		//assert.assertTrue(false);
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://testng.org/doc/documentation-main.html#logging-listeners");
		driver.findElement(By.linkText("Ant")).click();
		String string1 = driver.findElement(By.tagName("tt")).getText();
		Thread.sleep(2000);
		System.out.println(string1);
		driver.close();
	}
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This test is skipped");
	}
	

}
