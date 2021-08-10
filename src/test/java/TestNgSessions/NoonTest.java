package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoonTest extends BaseTest {

//	WebDriver driver;
//	
//	@BeforeTest
//	public void setUp() {
//		ChromeDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().fullscreen();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.noon.com/uae-en/");
//	}
	
	@Test(priority=1)
	public void noonTitleTest() {
		driver.get("https://www.noon.com/uae-en/");
		String title= driver.getTitle();
		System.out.println("Page title is:"+title);
		Assert.assertTrue(title.contains("Online Shopping"));
	}
	
	@Test(priority=2)
	public void noonLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='btn_logo']/img")).isDisplayed());
		
	}
	
	@Test(priority=3)
	public void noonSignInTest() {
		Assert.assertTrue(driver.findElement(By.id("dd_header_signInOrUp")).isDisplayed());
		
	}

	
	
//	@AfterTest()
//	public void tearDown() {
//		driver.quit();
//	}

}
