package pages;

/**
 * This is to ignore tests at package leveladd the following lines after creating package-info file
 * 
@org.testng.annotations.Ignore
package listeners; */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class GoogleSearchElementsAction {

	 WebDriver driver =null;

	By Search_Test_Box = By.name("q");
	By Click_Button = By.name("btnK");
	
	public GoogleSearchElementsAction(WebDriver driver){
		this.driver =driver;		
	}

	public void search_text(String text) {
		driver.findElement(Search_Test_Box).sendKeys(text);
	}
	public void Click_Search_Button() {
		driver.findElement(Click_Button).click();
	}
}
