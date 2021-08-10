package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) {
		
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver = wf.init_driver("chrome");
		wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String title= wf.getPageTitle();
		System.out.println("page title is:"+title);
		
		System.out.println(wf.getPageUrl());

		By url= By.id("Form_submitForm_subdomain");
		By firstname= By.id("Form_submitForm_FirstName");
		By lastname= By.id("Form_submitForm_LastName");
		By submit= By.id("Form_submitForm_action_request");
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChopadeJ\\Desktop\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();//Open the browser chrome		
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(url, "test Automation");
		eleUtil.doSendKeys(firstname, "Jotiba");
		eleUtil.doSendKeys(lastname, "Chopade");
		eleUtil.doClick(submit);
		
		wf.quitBrowser();

	}	

}
