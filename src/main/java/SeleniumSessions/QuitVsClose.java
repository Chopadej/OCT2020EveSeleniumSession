package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		

		//driver.quit();// close the browser
		driver.close();// close the browser
		
		System.out.println(driver.getTitle());
		
		//For Quit(): The session Id becomes Null after the quit()
		//So, any statement after quit() should get the NoSuchSessionException: Session ID is null exception 
		
		//For Close(): The session Id  remains same but it will be Invalid/expired after the Close()
		//and any statement after the close() will get NoSuchSessionException:Invalid Session ID 
		
		
		
	}
	}


