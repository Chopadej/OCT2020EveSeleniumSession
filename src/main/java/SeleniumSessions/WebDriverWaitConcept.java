package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
	
		//wait- Functional Interface--> is having SAM (Single Abstract Method)
		
		//1.WebDriverWait (c)---extends --->2.FluentWait(c)
		//Explicit wait
		// can be applied for any specific WebElement (Its not a global wait)
		//can be applied for non WebElement also ---alert, urls, title
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("http://classic.freecrm.com/");
		
		By username= By.name("username");
		By password= By.name("password");
		By loginBtn= By.xpath("//input[@type='submit']");
		
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//WebElement username_ele= wait.until(ExpectedConditions.presenceOfElementLocated(username));
		//username_ele.sendKeys("batchAutomation");
		
		waitForElementPresent(username, 10).sendKeys("batchAutomation");
		
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginBtn).click();
		
		
	}
		
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**presenceOfElementLocated
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible 
	 */
	public static WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	/**
	 * An expectation for checking that an element known to be present on the DOM of the page, is visible
	 * Visibility means that the element is not only displayed but also has a height and width 
	 * that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

}
