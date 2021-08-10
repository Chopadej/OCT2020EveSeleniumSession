package NumberOfLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
				
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		By footerLinks1= By.xpath("//div[@class='KxwPGc AghGtd']//a");
		By footerLinks2= By.xpath("//div[@class='KxwPGc iTjxkf']/a");
		By footerLinks3= By.id("Mses6b");
		
		Utility ele= new Utility(driver);
		//ele.clickElementAmazon(footerLinks1, "About");
		//ele.clickElementAmazon(footerLinks2, "Terms");
		ele.clickElementAmazon(footerLinks3, "Settings");

	}

}
