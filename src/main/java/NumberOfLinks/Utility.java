package NumberOfLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {
private WebDriver driver;
	
	public Utility(WebDriver driver) {
		this.driver= driver; 
	}
	

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doActionsSendKeys(By locator, String value) {
		Actions action= new Actions(driver);
		//action.sendKeys(getElement(locator), value).perform();	
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}
	
	public void doActionsClick(By locator) {
		Actions action= new Actions(driver);
		//action.click(getElement(locator)).perform();	
		action.moveToElement(getElement(locator)).click().build().perform();

	}
	
	public void doMoveToElement(By locator) {
		Actions action= new Actions(driver);
		action.moveToElement(getElement(locator)).perform();	

	}
	
	public void clickOnSubMenu(By parentMenu, By firstSubMenu) throws InterruptedException {
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doActionsClick(firstSubMenu);
		
	}
	public void clickOnSubMenu(By parentMenu, By firstSubMenu, By secondSubMenu) throws InterruptedException {
		doMoveToElement(parentMenu);
		Thread.sleep(2000);
		doMoveToElement(firstSubMenu);
		Thread.sleep(2000);
		doActionsClick(secondSubMenu);

	}
	
	
	public  void clickElementAmazon(By locator, String value) {
		List<WebElement> langLink=	driver.findElements(locator);
		System.out.println(langLink.size());//19
		
		for(int i=0; i<langLink.size(); i++) {
			String text= langLink.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				langLink.get(i).click();
				break;
			}	
		}
	}
	
}
