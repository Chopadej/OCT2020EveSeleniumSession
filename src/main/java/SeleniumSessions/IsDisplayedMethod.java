package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//To check a specific WebElement displayed on the page or not
public class IsDisplayedMethod {
	static WebDriver driver;
	
		public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By url= By.id("Form_submitForm_subdomain");
		By firstname= By.id("Form_submitForm_FirstName");
		By lastname= By.id("Form_submitForm_LastName");
		By submit= By.id("Form_submitForm_action_request");
		
		/*System.out.println(driver.findElement(url).isDisplayed());
		System.out.println(driver.findElement(firstname).isDisplayed());
		System.out.println(driver.findElement(lastname).isDisplayed());
		System.out.println(driver.findElement(submit).isDisplayed());*/
		
		if(doIsDisplayed(url)) {
			System.out.println("url field is dispalyed");
		}
		else {
			System.out.println("Url field is not displayed");
		}
			


	}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static boolean doIsDisplayed(By locator) {
			return getElement(locator).isDisplayed();
		}

}
