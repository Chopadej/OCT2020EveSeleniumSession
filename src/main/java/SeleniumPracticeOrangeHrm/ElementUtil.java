package SeleniumPracticeOrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public WebElement getELement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getELement(locator).click();
	}
	public void doSendKeys(By locator, String value) {
		getELement(locator).sendKeys(value);
	}
}
