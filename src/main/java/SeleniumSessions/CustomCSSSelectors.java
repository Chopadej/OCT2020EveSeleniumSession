package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelectors {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://app.hubspot.com/login?");
		
		//CSS selector: Its a locator not an attributes
		//id- #id or tag#id
		//class- .classname  or tag.classname
		//.c1.c2.c3...cn
		//.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email
		//input.login-email
		
		//#username.login-email
		//.login-email#username
		//input.login-email#username
		
		//#username
		// input#username
		//#username.form-control.private-form__control.login-email
		
		By e1= By.cssSelector(".form-control.private-form__control.login-email");// This is valid
		By e2= By.xpath("//input[@class='form-control private-form__control login-email']");// This is also valid
		By e3= By.className("form-control private-form__control login-email");// This is not valid because classname must be unique and should not contain spaces
		
		
		//By e1= By.cssSelector("#username");
		
		//tag[attr= 'value']
		//input[name='username']---css
		//input[@name='username']---xpath 
		
		//tag[attr1= 'value'][attr2= 'value']
		//input[name='username'][type='text'][placeholder='Username']----css
		//input[@name='username' and type='text' and placeholder='Username']---xpath
		
		//parent and child:
		// div.private-form__input-wrapper input#username
		// div.private-form__input-wrapper> input#username
		// ul.navbar-right li a
		
		By footerlink= By.cssSelector("ul.footer-nav li a");
		
		// There is no child to parent : cant do 
		
		//input[id*='user']--- here * means contains
		//input[id*='-origin-airport'] ---here * means contains
		
		//input[id^='user']--- here ^ means starts with
		//input[id$='name']--- here $ means ends with
	
	
		//comma in css selector
		// input#username,button#loginBtn,span.private-checkbox_indicator
		By loginFormLocators= By.cssSelector("input#username,input#password,button#loginBtn, span.private-checkbox_indicator");
	
		int loginElementsCount= driver.findElements(loginFormLocators).size();
	
		if(loginElementsCount==4) {
			System.out.println("My login page dispalyed with all mandatory fields");
			
			// following-siblings in css
			//input[name='username'] + input
			
			//index in css: nth-of-type(9)-- a specific index
			// ul.list-unstyled li:nth-of-type(9)---specific index
			// ul.list-unstyled li:nth-of-type(n)----all the elements
		}
	}

}
