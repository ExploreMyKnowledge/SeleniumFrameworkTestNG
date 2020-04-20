package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchElementsAction;

public class GoogleSearchPage_Test {
	
	private static WebDriver driver =null;
	
	public static void main(String[] args) {
GoogleSearchtest();
		
	}
	public static void GoogleSearchtest() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 GoogleSearchElementsAction Googlesearchobjects =new GoogleSearchElementsAction(driver);
		driver.get("https://www.google.com/");
		Googlesearchobjects.search_text("swedish language sites");
		Googlesearchobjects.Click_Search_Button();
		driver.close();
	}

}
