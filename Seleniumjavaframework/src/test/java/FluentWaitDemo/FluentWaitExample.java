package FluentWaitDemo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample {
	static WebDriver driver =null;
	
	public static void main(String[] args) {
		setUp();
	}
	
	@SuppressWarnings("unchecked")
	public static void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mtrx.travel/sv?gclid=EAIaIQobChMI7Y3cotz06AIVD6aaCh3oEweREAAYASAAEgKtCPD_BwE");
		
		Wait wait = new FluentWait<WebDriver>(driver)
				.withTimeout(25, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		

				WebElement element1=(WebElement) wait.until(new Function<WebDriver, WebElement>() {
				public WebElement applyy(WebDriver driver) {
				WebElement textboxElement = driver.findElement(By.linkText("Logga in"));
				if(textboxElement.isSelected()) {
					System.out.println("element found");
				}
				return textboxElement;
				}
				public WebElement apply(WebDriver arg0) {
					// TODO Auto-generated method stub
					return null;
				}				
				});
				element1.click();			
				driver.quit();	
	}
	
}
