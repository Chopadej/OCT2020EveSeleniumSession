package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	WebDriver driver;
	/**
	 * This method is used to initilize the webdriver on the basis of given browser name
	 * @param browserName
	 * @return it return the webdriver
	 */
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Desktop\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChopadeJ\\Desktop\\geckodriver-v0.28.0-win64 (1)\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else if (browserName.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass correct browser name:"+ browserName);
		}
		return driver;
	}
	
	
	public void launchUrl(String url) {
		driver.get(url);
	}
		
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	public void close() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
