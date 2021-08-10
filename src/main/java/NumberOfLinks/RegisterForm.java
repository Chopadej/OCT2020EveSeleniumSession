package NumberOfLinks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterForm {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.kluniversity.in/alumni/RegForm.aspx");
		driver.manage().window().maximize();
		
		By yearOfJoin= By.id("ddlBatch");
		By branch= By.id("ddlBranch");
		By country= By.id("ddlCountry");
		By higherStudies= By.id("ddlHStudies");
		By countryName= By.id("ddlHCountry");
		
	//	doSelectByIndex(yearOfJoin, 4);
	//	doSelectByVisibleText(branch, "Civil Engineering");
	//	doSelectByIndex(country, 5);
	//	doSelectByVisibleText(higherStudies, "MS");
	//	doSelectByIndex(countryName, 8);
		
		List<String>countryNameList= getDropDownOptionValues(countryName);
		System.out.println(countryNameList.size());
		System.out.println(countryNameList);
		
		if(countryNameList.contains("India")) {
			System.out.println("pass");
		}
		

	}
	
	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void doSelectByVisibleText(By locator, String text) {
			Select select= new Select(getElement(locator));
			select.selectByVisibleText(text);
		}
		
		public static void doSelectByIndex(By locator, int index) {
			Select select= new Select(getElement(locator));
			select.selectByIndex(index);
		}
		
		public static void doSelectByValue(By locator, String value) {
			Select select= new Select(getElement(locator));
			select.selectByValue(value);
		}
		
		public static List<String> getDropDownOptionValues(By locator) {
			List<String> optionValList= new ArrayList<String>();
			Select select= new Select(getElement(locator));
			
			List<WebElement> optionList= select.getOptions();
			
			for(WebElement e:optionList ) {
				String text=e.getText();
				System.out.println(text);
				optionValList.add(text);
			}
			return optionValList;
		}
		
		
		
		
		
		
		
		
		

}
