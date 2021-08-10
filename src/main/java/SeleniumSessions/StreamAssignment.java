package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			driver.manage().window().maximize();
			
			By indus_dropdown= By.id("Form_submitForm_Industry");
			
			Select select= new Select(driver.findElement(indus_dropdown));
			
			List<WebElement> dropDwonList= select.getOptions();
			System.out.println(dropDwonList.size());
			
			dropDwonList.stream().forEach(ele->System.out.println(ele.getText()));

	}

}
