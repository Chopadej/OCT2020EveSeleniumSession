package SeleniumSessions;

import java.awt.Choice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By choices= By.xpath("//span[@class='comboTreeItemTitle']");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
		
		
		/*List<WebElement>choiceList= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for(WebElement e:choiceList) {
		String text=e.getText();
		System.out.println(text);
		if(text.equals("choice 2")) {
			e.click();
			break;
		}
		}*/
		
		//1.Single selection
		//selectChoiceFromDropDown(choices, "choice 3");
		//selectChoiceFromDropDown(choices, "choice 6 2 3");
		
		//2.Multi Selection
		//selectChoiceFromDropDown(choices, "choice 2", "choice 3", "choice 6 2 3");
		
		//3. all Selection
		selectChoiceFromDropDown(choices, "ALL");

	}
	
	/**
	 * This function handles three test cases: 1.Single Selection
	 * 2.Multi selection
	 * All Selection : Please pass ALL /all /All
	 * @param locator
	 * @param value
	 */
	public static void selectChoiceFromDropDown(By locator,String... value) {
		List<WebElement>choiceList= driver.findElements(locator);
		if(!value[0].equalsIgnoreCase("ALL")) {
		for(WebElement e:choiceList) {
			String text=e.getText();
			System.out.println(text);
			/*if(text.equals(value)) {
				e.click();
				break;*/
			for(int i=0; i<value.length;i++) {
				if(text.equals(value[i])) {
					e.click();
					break;
				}
			}
		}
	}
		//All Selection:
		else {
			try {
			for(WebElement e:choiceList) {
					e.click();
				}
			}catch(Exception e) {
				
			}
		}
	
	}

}
