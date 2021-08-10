package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//total number of links on the page
		//you have to print text of each link with their index number (ignore the blank text)
		//you have to print the href (url) value of each link (having some text)
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//findElement- returning single WebElement
		//findElements- returning list of WebElements
		
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		System.out.println("Total links:"+linkList.size());
		
		for(int i=0; i<linkList.size();i++) {
			String text= linkList.get(i).getText();
			
			
			if(!text.isEmpty()) {
				System.out.println(i + "-->>" +text);
				String url= linkList.get(i).getAttribute("href");
				System.out.println(url);
			}
			
			//System.out.println(url);
		}

	}

}
