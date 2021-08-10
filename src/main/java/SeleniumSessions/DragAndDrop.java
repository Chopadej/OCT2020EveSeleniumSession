package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		
		WebElement srcElement= driver.findElement(By.id("draggable"));
		WebElement targetElement= driver.findElement(By.id("droppable"));
		
		//When we have more than one actions then we have to write .build().perform()
		//action.clickAndHold(srcElement).moveToElement(targetElement).release().build().perform();
		
		//when we have single action then only write .perform()
		action.dragAndDrop(srcElement, targetElement).perform();
	}

}
