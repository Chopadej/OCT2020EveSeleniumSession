package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	public static void main(String[] args) {
		
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver = wf.init_driver("chrome");
		wf.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		String title= wf.getTitle();
		System.out.println("Title of the page is:"+ title);
		
		System.out.println(wf.getPageUrl());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		
		ElementUtility eleUtil= new ElementUtility(driver);
		eleUtil.doSendkeys(firstName, "Jotiba");
		eleUtil.doSendkeys(lastName, "Chopade");
		eleUtil.doSendkeys(email, "jotiba21@gmail.com");
		eleUtil.doSendkeys(telephone, "9890964529");
		eleUtil.doSendkeys(password, "test@123");
		eleUtil.doSendkeys(confirmPwd, "test@123");
		
		
		

	}

}
