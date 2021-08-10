package SeleniumSessions;

import org.openqa.selenium.By;

public class Custom_Xpath_1 {

	public static void main(String[] args) {
		
		//xpath: is a locator
		//Two Types of Xpath
			//1.absolute xpath: from the parent to child via hierachy
				///html/body/header/nav/div/div/ul/li[5]/a--- riskly xpath
		
		//2.relative Xpath: xpath using xpath functions and attributes.
		//custom xpath
		
		//formula is: //htmltag[@attr='value']
		//input[@id='username']
		//input[@type='email']
		
		//htmltag[@attr='value1' and @attr='value2']
		//input[@id='username' and @type='email']
		
		//input[@id and @type]
		//input
		//a
		
		//contains():
		//dynamic id:
		//<input "id"= "test_123">
		//<input "id"= "test_133">
		//<input "id"= "test_143">
		
		//tag[contains(@attr, 'value')]
		//input[contains(@id, 'username')]
		//input[contains(@id, 'user')]
		//input[contains(@id, 'test_')]
		
		//aygi-origin-airport
		//cw57p-origin-airport
		//kgrp-origin-airport
		
		//input[contains(@id, '-origin-airport')]
		//input[contains(@id, 'username') and @type ='email']
		//input[contains(@id, 'username') and (@type, 'email')]
		
		//contains() with text():
		//tag[contains(text(), 'Companies & Contacts')]
		//tag[contains(text(), 'Companies')]
		//h3[text()= 'Companies & Contacts']
		//a[text()='Pricing']
		
		//Starts-with():
		//h3[starts-with(text(),'Contact')]
		//input[starts-with(@name, 'user')]
		
		//Parent to Child
		////ul[@class='nav navbar-nav navbar-right']/li/a
		// //ul[@class='list-unstyled']/li
		// //ul[@class='list-unstyled']//child::li
		// //ul[@class='list-unstyled']//child::li//child::a
		//ul[@class='footer-nav']//a
		
		
		//By ele= By.xpath("////ul[@class='nav navbar-nav navbar-right']/li/a");----->Correct
		//By ele1= By.className("nav navbar-nav navbar-right");---->Wrong
		
		//Both are same 
		// (//ul[@class='list-unstyled']/li/a)[4]
		// (//ul[@class='list-unstyled']/li/a)[position()=4]  
		// (//h3)[3]
		
		//Child to Parent
		//Backward traversing in xpath using /..
		// //a[text()='Customers']/../../..
		// //input[@id='username']//parent::div
		// //input[@id='username']//ancestor::div
		
		
	}

}
