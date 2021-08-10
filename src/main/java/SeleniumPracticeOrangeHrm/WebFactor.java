package SeleniumPracticeOrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebFactor {
	
	WebDriver driver;
	public WebDriver init_driver(String browserName) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browserName.equals("safari")) {
			driver= new SafariDriver();
		}
		else {
			System.out.println("Pass the correct browser name:"+browserName);
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
}
