package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {
	static WebDriver driver;
	public static void main(String[] args) {
		// a[text()='Ali Baba']//parent::td//preceding-sibling::td/input[@type='checkbox']
		// a[text()='Anand Reddy']//parent::td//preceding-sibling::td/input[@type='checkbox']

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sri-lanka-in-england-2021-1239532/england-vs-sri-lanka-3rd-odi-1239536/full-scorecard");
		driver.manage().window().maximize();
		
		//String text= driver.findElement(By.xpath("//a[text()='Oshada Fernando']//parent::td//following-sibling::td/span")).getText();
		//System.out.println(text);
		
		//System.out.println(getWicketTakerName("Dhananjaya de Silva"));
		
		//List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='Dhananjaya de Silva']//parent::td//following-sibling::td"));
		
		//for(int i=1; i<scoreList.size(); i++) {
		//	String text=scoreList.get(i).getText();
		//	System.out.print(text+ " ");
		//}
		
		getPlayerScoreCard("Avishka Fernando").stream().forEach(ele->System.out.print(ele+ " "));
		getPlayerScoreCard("Pathum Nissanka").stream().forEach(ele->System.out.print(ele+ " "));
		
		
		//getPlayerScoreCard("Dhananjaya de Silva");
		
	}
	
	
	public static String getWicketTakerName(String playerName) {
		String text= driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td/span")).getText();
		return text;
	}
	
	public static List<String> getPlayerScoreCard(String playerName) {
		System.out.println();
		System.out.print(playerName+ " --->");
		List<String> scoreCardList= new ArrayList<String>();
		List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));
		for(int i=1; i<scoreList.size(); i++) {
			String text=scoreList.get(i).getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}

}
