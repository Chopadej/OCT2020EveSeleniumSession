package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		Thread.sleep(4000);
		//String header= driver.findElement(By.tagName("h1")).getText();
		//System.out.println(header);
		/*String h2= driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/h1")).getText();
		System.out.println(h2);
		
		String header1= driver.findElement(By.tagName("h2")).getText();
		System.out.println(header1);
		
		String cust_name= driver.findElement(By.linkText("Customers")).getText();
		System.out.println(cust_name);*/
		
		By h1= By.tagName("h1");
		By header2= By.xpath("/html/body/section[1]/div/div/div[1]/h1");
		By customer= By.linkText("Customers");
		
		System.out.println(doGetText(h1));
		System.out.println(doGetText(header2));
		System.out.println(doGetText(customer));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}


}
