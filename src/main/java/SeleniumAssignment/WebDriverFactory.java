package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	WebDriver driver;
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup(); 
			driver= new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChopadeJ\\Desktop\\geckodriver-v0.29.0-win64\\geckodriver.exe");
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
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	

}
