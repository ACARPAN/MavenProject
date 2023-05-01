package Test;

import org.testng.annotations.Test;

public class tR4 {

	@Test(priority = 2)
	public void Alpha() {
		System.out.println("Alpha executed ");
	}

	@Test(priority = 1)
	public void Beta() {
		System.out.println("Beta Executed ");
	}

	@Test(priority = 0)
	public void Gamma() {
		System.out.println("Gamma Executed ");
	}

	@Test(priority = 3)
	public void Delta() {
		System.out.println("Delta Executed ");
	}	
	
}
