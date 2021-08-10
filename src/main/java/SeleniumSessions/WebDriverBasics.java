package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//While launching the google.com
		//1.Open the browser: Google Chrome
		//2.Enter the URL
		//3. Get the title of the page
		//4.check the title or verify the title
		//5.close the browser
	
		
		//This one is latest version of chrome .exe "Version 90.0.4430.212 "
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		//WebDriver driver= new WebDriver(); //Can not create object of WebDriver because its an interface
		WebDriver driver= new ChromeDriver();//1.Open the browser chrome
		
		//driver.manage().window().fullscreen();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com"); //2.Enter the URL
		String title = driver.getTitle();//3. Get the title of the page
		System.out.println("Title of the page: " + title);
		
		//Verification point: checkpoint (actual vs expected result)
		if(title.equals("Google")){
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//tear down method
		driver.quit();// close the browser
		
		//driver.close();
	}

}
