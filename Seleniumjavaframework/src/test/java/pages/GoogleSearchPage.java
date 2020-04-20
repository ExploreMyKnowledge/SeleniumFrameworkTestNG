package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element =null;
	
	public static WebElement Textbox_Search(WebDriver driver){
		element = driver.findElement(By.name("q"));
		return element;		
	}
	public static WebElement Search_Button(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}

}
