package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {
	// How to execute javascript code using selenium java
	// because selenium can not provide everything for example scrolling, highlight specific element
	//or create a runtime boarder for a specific webelement, so we have to take help from java script 
	// but java script is written in javascript then we have to use javascript code in our selenium script 
	//So, selenium provides one library so using that library we can execute the java script code
	//and we can perform different type of actions on a webpage
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.get("http://classic.crmpro.com/");
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.makemytrip.com/");
		
		
		JavaScriptUtil jsUtil= new JavaScriptUtil(driver);
		
//		String title= jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		String pageText=jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Deals & Sales Pipeline")) {
//			System.out.println("PASS");
//		}
		
//		jsUtil.refreshBrowserByJS();
		
//		jsUtil.drawBorder(loginBtn);
		
//		jsUtil.generateAlert("App is launched...");
		
//		WebElement username= driver.findElement(By.name("username"));
//		WebElement password= driver.findElement(By.name("password"));
//		WebElement loginBtn= driver.findElement(By.xpath("//input[@value='Login']"));
//		
//		jsUtil.flash(username);
//		username.sendKeys("batchautomation");
//		
//		jsUtil.flash(password);
//		password.sendKeys("Test@12345");
//		
//		jsUtil.flash(loginBtn);
//		loginBtn.click();
		
//		String browserInfo= jsUtil.getBrowserInfo();
//		System.out.println(browserInfo);
		
		
//		jsUtil.scrollPageDown();
//		jsUtil.scrollPageUp();
		
//		WebElement h2Element= driver.findElement(By.xpath("//span[text()='Amazon Top Sellers']"));
//		jsUtil.scrollIntoView(h2Element);
	
		WebElement hotelLink= driver.findElement(By.linkText("Hotels"));
		jsUtil.clickElementByJS(hotelLink);
		
		
		
}

}
