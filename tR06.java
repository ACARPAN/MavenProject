package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tR06 {

	

	@Test()
	@Parameters({ "username", "password" })
	public void testcaseOne(String un, String pwd) {
		System.out.println(un); // admin
		System.out.println(pwd); // admin123
		System.out.println("Test case one");

	}

	@Test()
	public void testcaseTwo() {
		System.out.println("Test case two");
	}
}
