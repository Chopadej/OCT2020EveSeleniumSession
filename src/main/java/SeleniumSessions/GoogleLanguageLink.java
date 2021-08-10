package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLink {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//total number of images on the page
		//you have to print url of each image 
				
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);
		By langLinks=By.xpath("//div[@id='SIvCob']/a");
		
		clickElement(langLinks, "বাংলা");
	}
	
	public static  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void clickElement(By locator, String value) {
		List<WebElement> eleList= getElements(locator);
		System.out.println(eleList.size());//9
		
		for(int i=0; i<eleList.size();i++) {
			String text= eleList.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				eleList.get(i).click();
				break;
			}
			
		}
	}
	

}
