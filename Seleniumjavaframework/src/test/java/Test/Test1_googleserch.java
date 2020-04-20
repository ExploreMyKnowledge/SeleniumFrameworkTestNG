package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_googleserch {
	
	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch (){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open google site		
		driver.get("https://www.google.com/");
		
		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("swedish for beginners");
		
		//click on search button
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		
	}

}
