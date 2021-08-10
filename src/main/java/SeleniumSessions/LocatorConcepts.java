package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//Open the browser chrome
		
		
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		driver.get("https://classic.crmpro.com/index.html");
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		
		
		//id: always unique
//		Create a WebElement (by using some locators) -> Perform action on it (Click, sendKeys, getText)
//		--------First Approach-----
//		driver.findElement(By.id("input-email")).sendKeys("jotiba@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test123");
		
//		--------Second Approach-----
//		WebElement email= driver.findElement(By.id("input-email"));
//		WebElement password= driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("jotiba@gmail.com");
//		password.sendKeys("test@123");
		
		//-----Third Approach using By Locators or Object Repository-------
//		By emailId= By.id("input-email");
//		By password= By.id("input-password");
//		driver.findElement(emailId).sendKeys("jotiba@gmail.com");
//		driver.findElement(password).sendKeys("test@123");

//		getElement(emailId).sendKeys("jotiba@gmail.com");
//		getElement(password).sendKeys("test@123");
		
//		getElement(url).sendKeys("Testing something");
//		getElement(firstname).sendKeys("Jotiba");
//		getElement(lastname).sendKeys("Chopade");
//		getElement(submit).click();
	
		By url= By.id("Form_submitForm_subdomain");
		By firstname= By.id("Form_submitForm_FirstName");
		By lastname= By.id("Form_submitForm_LastName");
		By submit= By.id("Form_submitForm_action_request");
		
		/*doSendKeys(url, "Testing something");
		doSendKeys(firstname, "Jotiba");
		doSendKeys(lastname, "Chopade");
		doClick(submit);
		*/
		
		//2.name: is not unique
	//	driver.findElement(By.name("username")).sendKeys("batchautomation");
	//	driver.findElement(By.name("password")).sendKeys("test@123");
		
		//3.classname: is not unique
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
	//	driver.findElement(By.className("login-email")).sendKeys("batchautomation");
	//	driver.findElement(By.className("login-password")).sendKeys("test@123");
		
		
		//xpath: is a locator its not a attributes or its not properties also
		
	//	driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("naveen");
	//	driver.findElement(By.xpath("//*[@id=\"Form_submitForm_JobTitle\"]")).sendKeys("QA");
		
		/*By fn= By.xpath("//*[@id=\"Form_submitForm_FirstName\"]");
		By jobTitle= By.xpath("//*[@id=\"Form_submitForm_JobTitle\"]");
		
		doSendKeys(fn, "Naveen");
		doSendKeys(jobTitle, "QA");*/
		
		//5.cssSelector: Cascaded style sheet
		//is a locator, its not an attributes
	//	driver.findElement(By.cssSelector("#Form_submitForm_JobTitle")).sendKeys("QA");
	//	driver.findElement(By.cssSelector("#Form_submitForm_CompanyName")).sendKeys("Google");
		
		//6.link text:only for links (on the basis of the text of the link)
	//	driver.findElement(By.linkText("Privacy Policy")).click();
		
	//	By privacypolicy= By.linkText("Privacy Policy");
	//	doClick(privacypolicy);
		
		//7.partial link text: only for links (on the basis of the partial text of the link )
	//	driver.findElement(By.partialLinkText("Privacy")).click();
		
		
		
		
	}
	
	//---------Fourth Approach using FUnction------------
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	
	
	
	
	

}
