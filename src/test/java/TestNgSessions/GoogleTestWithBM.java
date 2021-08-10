package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class GoogleTestWithBM {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		ChromeDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println("Page title is:"+title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
		
	}
	
	@Test
	public void googleSearchButtonTest() {
		Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
