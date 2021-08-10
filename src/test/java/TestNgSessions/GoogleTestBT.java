package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTestBT extends BaseTest {
	
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setUp() {
//		ChromeDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().fullscreen();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.google.com/");
//	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		driver.get("https://www.google.com/");
		String title= driver.getTitle();
		System.out.println("Page title is:"+title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());
		
	}
	
	@Test(priority=3)
	public void googleSearchButtonTest() {
		Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
	}
	
//	@AfterTest()
//	public void tearDown() {
//		driver.quit();
//	}

}
