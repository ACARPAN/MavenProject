package Test;

import org.testng.annotations.Test;

public class tR07 {

	@Test(priority = 3)
	public void loginTest() {
		System.out.println("Login successful");
	}

	@Test(priority = 2)
	public void passwordIn() {
		System.out.println("Password successful");
	}

}
