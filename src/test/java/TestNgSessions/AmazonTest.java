package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("create DB Connection");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("create test user in DB");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("launch the browser");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login to the app");
	}
	
	@Test(priority=1)
	public void amazonTitleTest() {
		System.out.println("Amazon Title Test ");
	}
	
	@Test(priority= 3)
	public void amazonSearchTest() {
		System.out.println("Amazon search Test ");
	}
	
	@Test(priority=2)
	public void amazonFilterTest() {
		System.out.println("Amazon Filter Test  ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("close the browser");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Delete the test user from DB");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Disconnect with DB");
	}

}
