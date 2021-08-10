package SeleniumPracticeOrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestOrangeHRM {

	public static void main(String[] args) {
		
		
		WebFactor wf= new WebFactor();
		WebDriver driver= wf.init_driver("chrome");
		
		wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String title= wf.getTitle();
		System.out.println("title is:"+title);
		
		System.out.println(wf.getPageUrl());
		
		
		By url= By.id("Form_submitForm_subdomain");
		By firstName= By.id("Form_submitForm_FirstName");
		By lastName= By.id("Form_submitForm_LastName");
		By email= By.id("Form_submitForm_Email");
		By jobTitle= By.id("Form_submitForm_JobTitle");
		By comapanyName= By.id("Form_submitForm_CompanyName");
		By contact= By.id("Form_submitForm_Contact");
		

		ElementUtil util= new ElementUtil(driver);
		util.doSendKeys(url, "Java Selenium");
		util.doSendKeys(firstName, "Jotiba");
		util.doSendKeys(lastName, "Chopade");
		util.doSendKeys(email, "jotiba21@gmail.com");
		util.doSendKeys(jobTitle, "QA");
		util.doSendKeys(comapanyName, "Expleo");
		util.doSendKeys(contact, "9890964529");
		
	}

}
