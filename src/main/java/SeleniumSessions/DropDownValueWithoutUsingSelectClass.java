package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry= By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By country= By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		//Dont use Select class
		//but there is a select tag
		//and select the value from the drop down
		
		/*List<WebElement> indus_List= driver.findElements(industry);
		System.out.println(indus_List.size());
		
		for(WebElement e:indus_List) {
			String text=e.getText();
			System.out.println(text);
		}*/
		selectDropDownValue(industry, "Education");
		selectDropDownValue(country, "India");
	}

		public static void selectDropDownValue(By locator, String value) {
			List<WebElement> optionsList= driver.findElements(locator);
			System.out.println(optionsList.size());
			
			for(WebElement e:optionsList) {
				String text=e.getText();
				
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
		}
}
