package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testR14 {

	@Test()
	public void A() {
		System.out.println("A Executed");
		// Assert.assertEquals(false, true);
	}

	@Test(dependsOnMethods = { "A" })
	public void B() {
		System.out.println("B Executed");

	}

	@Test(dependsOnMethods = { "B" })
	public void C() {
		System.out.println("C Exectured");

		Assert.assertEquals(false, true);
	}
//	@Test(dependsOnMethods = {"C"})
//	public void D() {
//		System.out.println("D executed ");
//	}

	@Test(dependsOnMethods = { "C", "B" })
	public void E() {
		System.out.println("D executed ");
	}

}
