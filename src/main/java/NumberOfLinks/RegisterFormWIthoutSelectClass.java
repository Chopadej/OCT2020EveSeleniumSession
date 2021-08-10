package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterFormWIthoutSelectClass {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.kluniversity.in/alumni/RegForm.aspx");
		driver.manage().window().maximize();	
		
		By branch= By.xpath("//select[@id='ddlBranch']/option");
		By country= By.xpath("//select[@id='ddlCountry']/option");
	
		/*List<WebElement>branch_List=driver.findElements(branch);
		
		System.out.println(branch_List.size());
		
		for(WebElement e:branch_List) {
			String text=e.getText();
			System.out.println(text);
		}*/
	
		selectDropDownValue(branch, "Civil Engineering");
		selectDropDownValue(country, "India");
		
		
	}
	
	public static void selectDropDownValue(By locator, String value) {
		
		List<WebElement>optionList=driver.findElements(locator);
		
		System.out.println(optionList.size());
		
		for(WebElement e:optionList) {
			String text=e.getText();
			
			if(text.equals(value)) {
				e.click();
				break;
			}
			
		}
		
		
		
	}
	
	
	
	

}
