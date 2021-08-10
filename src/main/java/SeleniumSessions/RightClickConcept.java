package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action= new Actions(driver);
		
		action.contextClick(rightClick).perform();
		
		List<WebElement> optionList= driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		
		System.out.println(optionList.size());
		
		for(WebElement e: optionList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
		
		
	}

}
