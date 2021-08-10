package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
				
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		By linksCountry= By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//a");
		By navigationalLinks = By.xpath("//div[@class='navFooterLinkCol navAccessibility']//a");
		
		//clickElementAmazon(linksCountry, "Poland");
		
		//clickOnNavigationLinks(navigationalLinks, "Help");
		
		Utility ele= new Utility(driver);
		ele.clickElementAmazon(navigationalLinks, "Help");
		
		
	
	}
	
	
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	/*public static void clickOnNavigationLinks(By locator, String value) {
		List<WebElement> numberOfLinks= driver.findElements(locator);
		System.out.println(numberOfLinks.size());
		
		for(int i=0; i<numberOfLinks.size();i++) {
			String text=numberOfLinks.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				numberOfLinks.get(i).click();
				break;
			}
		}	
	}*/
	
	/*public static void clickElementAmazon(By locator, String value) {
		List<WebElement> langLink=	driver.findElements(locator);
		System.out.println(langLink.size());//19
		
		for(int i=0; i<langLink.size(); i++) {
			String text= langLink.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				langLink.get(i).click();
				break;
			}	
		}
	}
	*/

}
