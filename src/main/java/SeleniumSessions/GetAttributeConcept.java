package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		/*String fn= driver.findElement(By.id("Form_submitForm_FirstName")).getAttribute("name");
		System.out.println(fn);
		String privacy_policy_url= driver.findElement(By.linkText("Privacy Policy")).getAttribute("href");
		System.out.println(privacy_policy_url);*/
		
		By firstName= By.id("Form_submitForm_FirstName");
		By Policy_url= By.linkText("Privacy Policy");
		
		System.out.println(doGetAttribute(firstName, "name"));
		System.out.println(doGetAttribute(Policy_url, "href"));
		
		}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
}
