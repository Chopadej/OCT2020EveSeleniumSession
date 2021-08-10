package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		By forgotPwd= By.linkText("Forgot Password?");
		
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//WebElement element= wait.until(ExpectedConditions.elementToBeClickable(forgotPwd));
		//element.click();
		
		ElementUtil ele= new ElementUtil(driver);
		ele.clickWhenReady(forgotPwd, 10);
	}

}
