package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name="Tom";
	
	@Test(expectedExceptions= {ArithmeticException.class, NullPointerException.class})
	public void divTest() {
	
		System.out.println(" div test");
		int i = 9/0;
		ExpectedExceptionConcept obj= new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name);
		System.out.println("finish div test");
	}
	
	

}
