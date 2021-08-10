package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			
			driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
			
			//type= 'file' should be there
			
			driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\ChopadeJ\\Downloads\\IMG-20190506-WA0015.JPG");
			driver.findElement(By.xpath("//input[@type='submit']"));
	}

}
