package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
				
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By fgtPwd= By.linkText("Forgotten Password");
		By contbtn=By.linkText("Continue");
		
		System.out.println(checkElementPresent(fgtPwd));
		System.out.println(checkElementPresent(contbtn));
		
	/*	List<WebElement> eleList= driver.findElements(By.linkText("Forgotten Password"));
		System.out.println(eleList.size());//2
		
		if(eleList.size()>0) {
			System.out.println("Element is displayed and found...");
		}
		else {
			System.out.println("Element is not displayed and not found...");
		}*/
	}
	
	public static boolean checkElementPresent(By locator) {
		
		List<WebElement> eleList= driver.findElements(locator);
		if (eleList.size()>0) {
			return true;
		}
		return false;
	}

}
