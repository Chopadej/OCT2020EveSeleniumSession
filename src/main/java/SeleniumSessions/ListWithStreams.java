package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {
	
	//Java 8: Streams: will be applied on list

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			List<WebElement>linkslist= driver.findElements(By.tagName("a"));
			
			System.out.println(linkslist.size());
			
			long stTime= System.currentTimeMillis();
			
			//Sequential streams
			//linkslist.stream().forEach(ele->System.out.println(ele.getText()) );

			//parallel Stream
			linkslist.parallelStream().forEach(ele->System.out.println(ele.getText()));
			
			long endTime= System.currentTimeMillis();
			System.out.println("total time: "+ (endTime-stTime)); //5062 //4449
			
	}

}
