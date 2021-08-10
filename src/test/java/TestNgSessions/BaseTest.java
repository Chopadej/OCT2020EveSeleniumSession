package TestNgSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseTest {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browserName) {
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "safari":
			driver= new SafariDriver();
			break;
		default:
			System.out.println("please pass the correct browser");
			break;
		}
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.noon.com/uae-en/");
	}
	
	@AfterTest()
	public void tearDown() {
		driver.quit();
	}


}
