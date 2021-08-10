package NumberOfLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		By loginLink= By.className("link");
		By spiceClubMember= By.linkText("SpiceClub Members");
		By memberLogin= By.linkText("Member Login");
		
		
		Utility eleUtil= new Utility(driver);
		eleUtil.clickOnSubMenu(loginLink, spiceClubMember, memberLogin);
		
		
		/*WebElement parentMenuLink= driver.findElement(By.className("link"));
		WebElement subMenuLink= driver.findElement(By.linkText("SpiceClub Members"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(parentMenuLink).perform();
		Thread.sleep(2000);
		
		action.moveToElement(subMenuLink).perform();
*/
	}

}
