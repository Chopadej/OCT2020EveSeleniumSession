package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().window().maximize();
		
		By parentMenu= By.className("menulink");
		By subMenuCourses=By.linkText("COURSES");
		
		//WebElement parentMenuLink= driver.findElement(By.className("menulink"));
		
		//Actions action= new Actions(driver);
		
		//action.moveToElement(parentMenuLink).perform();
		//Thread.sleep(2000);
		
		ElementUtil eleUtil= new ElementUtil(driver);
		//eleUtil.doMoveToElement(parentMenu);
		//eleUtil.doActionsClick(subMenuCourses);
		eleUtil.clickOnSubMenu(parentMenu, subMenuCourses);
		//driver.findElement(By.linkText("COURSES")).click();
		

	}

}
