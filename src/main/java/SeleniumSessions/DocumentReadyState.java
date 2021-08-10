package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentReadyState {

static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		//JavascriptExecutor jse=((JavascriptExecutor)driver);
		//String jsCommand= "return document.readyState";
		//if (jse.executeScript(jsCommand).toString().equals("complete")) {
		//	System.out.println("page is fully loaded");
		//}
		
		jsWaitForPageLoad(20);
	}
	
	public static void jsWaitForPageLoad(int timeOut) {
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		String jsCommand= "return document.readyState";
		if (jse.executeScript(jsCommand).toString().equals("complete")) {
			System.out.println("page is fully loaded");
			return ;
		}
		for (int i=0; i<timeOut; i++) {
			try {
				Thread.sleep(1000);
				if (jse.executeScript(jsCommand).toString().equals("complete")) {
					System.out.println("page is fully loaded");
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
