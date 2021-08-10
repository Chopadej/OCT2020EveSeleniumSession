package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		//This one is latest version of firefox.exe "88.0.1 "
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChopadeJ\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

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
