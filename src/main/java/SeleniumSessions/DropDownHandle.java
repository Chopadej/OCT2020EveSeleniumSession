package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry= By.id("Form_submitForm_Industry");
		By country= By.id("Form_submitForm_Country");
		
		/*Select select_indus= new Select(driver.findElement(industry));
		select_indus.selectByIndex(4);
		//select_indus.selectByVisibleText("Education");
		//select_indus.selectByValue("health");
		
		Select select_country= new Select(driver.findElement(country));
		select_country.selectByVisibleText("India");*/
		
		//doSelectByIndex(industry, 4);
		//doSelectByVisibleText(country, "India");
		
		/*Select select_indus= new Select(driver.findElement(industry));
		List<WebElement>indus_List= select_indus.getOptions();
		System.out.println("total industry options:"+indus_List.size());
		
		for(WebElement e :indus_List ) {
			String text= e.getText();
			System.out.println(text);
		}*/
		
		List<String> countryList= getDropDownOptionsValues(country);
		System.out.println(countryList.size());
		System.out.println(countryList);
		
		if(countryList.contains("India")){
			System.out.println("Pass");
		}
		
	}
	
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void doSelectByIndex(By locator, int index) {
			Select select= new Select(getElement(locator));
			select.selectByIndex(index);
		}
		public static void doSelectByVisibleText(By locator, String text) {
			Select select= new Select(getElement(locator));
			select.selectByVisibleText(text);
		}
		public static void doSelectByValue(By locator, String value) {
			Select select= new Select(getElement(locator));
			select.deselectByValue(value);
		}
		
		public static List<String> getDropDownOptionsValues(By locator) {
			List<String> optionsValList= new ArrayList<String>();
			Select select= new Select(getElement(locator));
			List<WebElement>optionsList= select.getOptions();
			for(WebElement e :optionsList ) {
				String text= e.getText();
				optionsValList.add(text);
			}
			return optionsValList;
		}
		
		
		

}
