package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tR2 {

	// Login testcases

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("It will run before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("It will run after every method");
	}

	@Test(priority = 1)
	public void loginTest1() {
		System.out.println("Login successful for number one ");
	}

	@Test(priority = 2)
	public void loginTest2() {
		System.out.println("Login successful for number two ");
	}
}
