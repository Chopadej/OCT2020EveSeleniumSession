package TestNgSessions;

import org.testng.annotations.Test;

public class InnocationCountTest {

	@Test(invocationCount=10 )
	public void loginTest() {
		System.out.println("Login Test");
	}
}
