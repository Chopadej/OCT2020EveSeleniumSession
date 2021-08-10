package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {

		static WebDriver driver;
		public static void main(String[] args)  {
			
					
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			List<WebElement> eleList=driver.findElements(By.linkText("Images"));
			System.out.println(eleList.size());
			
			if(eleList.size()>0) {
				System.out.println("Element is displayed");
			}
			else {
				System.out.println("Element is not displayed");
			}

	}

}
