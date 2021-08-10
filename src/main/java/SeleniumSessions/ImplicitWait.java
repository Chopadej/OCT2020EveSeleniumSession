package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Global wait- by default it will for all the WebElements
		//applicable only for WebElement and WebElements 
		//whenever you are using driver.findElement and driver.findElements then implicit wait can be applied
		//not applicable for non webelements ->alerts, pop up , url, titles
		
		driver.get("http://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//home page:
		//override the implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//e4
		//e5
		
		//nullify the implicit wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//e6
		//e7

	}

}
