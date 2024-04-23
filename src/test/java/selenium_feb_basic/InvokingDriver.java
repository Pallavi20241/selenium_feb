package selenium_feb_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokingDriver {

	public static void main(String[] args) {
		
		//open automation
 WebDriverManager.chromedriver().setup();
 
 WebDriver driver= new ChromeDriver();
 
 // how to open any website in driver
 driver.get("http:www.google.com");
	}

}
