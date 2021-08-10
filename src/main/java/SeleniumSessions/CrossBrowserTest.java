package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChopadeJ\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass correct browser name:"+ browser);
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		
		//Verification point: checkpoint (actual vs expected result)
		if(title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else 
		{
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();// close the browser
	}

}
