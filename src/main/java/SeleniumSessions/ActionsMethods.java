package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethods {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By email= By.id("input-email");
		By password= By.id("input-password");
		By login= By.xpath("//input[@value='Login']");
		By frgPass= By.linkText("Forgotten Password");
		
		/*Actions action= new Actions(driver);

		action.sendKeys(driver.findElement(email), "jotiba21@gmail.com").perform();;
		action.sendKeys(driver.findElement(password), "jotiba@113").perform();;
		action.click(driver.findElement(login)).perform();;
		action.click(driver.findElement(frgPass)).perform();;
*/
		
		
		doActionsSendKeys(email, "jotiba21@gmail.com");
		doActionsSendKeys(password, "Abc123");
		doActionsClick(login);
		doActionsClick(frgPass);
	}
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
	
		public static void doActionsSendKeys(By locator, String value) {
			Actions action= new Actions(driver);
			action.sendKeys(getElement(locator), value).perform();	
		}
		
		public static void doActionsClick(By locator) {
			Actions action= new Actions(driver);
			action.click(getElement(locator)).perform();	
		}
	
		
	
}
