import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By empNo= By.id("Form_submitForm_NoOfEmployees");
		By industry= By.id("Form_submitForm_Industry");
		
		/*Select select_emp= new Select(driver.findElement(empNo));
		
		//select_emp.selectByIndex(4);
		select_emp.selectByVisibleText("26 - 50");
		//select_emp.selectByValue("16 - 20");
		
		Select select_indus= new Select(driver.findElement(industry));
		select_indus.selectByVisibleText("Education");*/
		
		
		doSelectByIndex(industry, 4);
		
		doSelectByValue(empNo, "0 - 10");
		
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select= new Select(getElement(locator));
		select.selectByIndex(4);	
	}
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(text);	
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select= new Select(getElement(locator));
		select.selectByValue(value);	
	}
	
}
