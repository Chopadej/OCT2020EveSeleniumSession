package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {


static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(3000);
		
	List<WebElement> suggestionList=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
		System.out.println(suggestionList.size());
		
		for(WebElement e:suggestionList) {
		String text=e.getText();
		System.out.println(text);
		
		if(text.equals("Summer Dresses > Printed Summer Dress")) {
			e.click();
			break;
		}
		}
		
	}

}
