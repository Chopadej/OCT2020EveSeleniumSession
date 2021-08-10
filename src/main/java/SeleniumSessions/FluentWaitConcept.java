package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	//Interview questions: How do we handle synchronization in selenium 
	// Yes, we do have a synchronization issues for every web page
	//Synchronization means sync between selenium script and the web page
	//might be possible element is taking some time to be displayed on the page and taking some
	//time to loading on the page so selenium is not going to wait for that perticular element and selenium will 
	//throw an exceptions according to the behavior of the selenium like this only selenium will through 
	//NoSuchElementException or may be staleElementRefrenceExceptions so we have to sync between two entities
	// one is script and second is web Page so to provide the sync these two entities we have to use the concept of
	// synchrinization wait

	//Two types of wait
	//1.static wait: Thread.sleep(1000);--> disadvantage is it is not coming from selenium ie.Thread is a class in java and sleep is a static method of Thread
	// just need to pass the second and then it will pause the script and it is a static wait and if element is found within a
	// 2 second then but still it is wait for specified second only. we dont have any logic to break this series because its a static wait thats why
	//Dynamic wait is comes in to picture to handle the dynamic application and dynamic web element, if the element is found within 
	// 2 second and timeout given like 10 second then rest of the 8 seconds will be ignored
	//2.Dynamic wait: Implicit wait is a global wait only applicable for webElement whenever we are creating driver.findelement
	//or driver.findelements and its global wait so through out the driver instanace the wait will be maintained, so we can
	//override or nullify the implicit wait 
	//Explicit wait-> a. WebDriverWait  b.FluentWait -> both these classes implements wait interface according to the java api
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		By forgotPwd= By.linkText("Forgot Password?");
		
		waitForElementWithFluentWait(forgotPwd, 10, 1).click();
		
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		//						.withTimeout(Duration.ofSeconds(10))
		//						.pollingEvery(Duration.ofSeconds(2))
		//						.ignoring(NoSuchElementException.class)
		//						.ignoring(StaleElementReferenceException.class);
		
		//WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
		//ele.click();
	}

	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
}

