package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorkApp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
					
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
			driver.get("https://www.freshworks.com/");
			By linksShop= By.xpath("//div[@class='col-sm-6']//a");
			//clickOnFreshShop(linksShop, "GDPR");			
		
			By footershop= By.xpath("//div[@class='footer-copyrights']//a");
			
			Utility ele= new Utility(driver);
			ele.clickElementAmazon(footershop, "Security");
			

	}
	
	public static void clickOnFreshShop(By locator, String value) {
		List<WebElement> linksFreshWork=driver.findElements(locator);
		System.out.println(linksFreshWork.size());
		for(int i=0; i<linksFreshWork.size();i++) {
			String text= linksFreshWork.get(i).getText();
			if(text.equals(value)) {
				linksFreshWork.get(i).click();
				break;
			}
			
			
			System.out.println(text);
		}

		
	}

	}

