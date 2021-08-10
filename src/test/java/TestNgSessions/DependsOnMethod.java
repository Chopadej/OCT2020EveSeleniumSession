package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(priority= 1)
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	@Test(priority=2, dependsOnMethods="loginTest")
	public void homeSearchTest() {
		System.out.println("Home search Test");
	}
	
	@Test(priority=3, dependsOnMethods="loginTest")
	public void homeFilterTest() {
		System.out.println("Home Filter ");
	}
	
	
	
	
	

}
