package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsWithListAndFilter {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			List<WebElement>linkslist= driver.findElements(By.tagName("a"));
			
			System.out.println(linkslist.size());
			
			/*List<String> collectList= linkslist.stream()
							.filter(ele->!ele.getText().equals(""))
								.map(ele->ele.getText())
									.collect(Collectors.toList());
			
			collectList.stream().forEach(ele->System.out.println(ele));
			 */
			
			//print the text of each link contains Amazon keyword
			
	//	List<String> amazonLinkList=linkslist.stream()
	//						.filter(ele->!ele.getText().equals("") && ele.getText().contains("Amazon") )
	//							.map(ele->ele.getText())
	//								.collect(Collectors.toList());
			
		
		List<String> amazonLinkList=linkslist.stream()
				.filter(ele->!ele.getText().isEmpty())
				.filter(ele->ele.getText().contains("Amazon"))
					.map(ele->ele.getText())
						.collect(Collectors.toList());

		
		
		
		amazonLinkList.stream().forEach(ele->System.out.println(ele));
			
			
	}

}
