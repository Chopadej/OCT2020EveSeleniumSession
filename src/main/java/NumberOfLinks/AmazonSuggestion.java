package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSuggestion {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		Thread.sleep(3000);
		
		List<WebElement> suggestion=driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(suggestion.size());
		
		for(WebElement e: suggestion) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("watch")) {
				e.click();
				break;
			}
		}
	}

}
