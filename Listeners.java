package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners {

	// import org.testng.ITestListener;

	public class Listener implements ITestListener {

		public void onTestStart(ITestResult result) {
			System.out.println("Test case is starting");
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Testcase pass");
		}

		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Testcase failed");

		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("Skip of test cases and its details are : " + result.getName());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			// System.out.println("Failure of test cases and its details are : " +
			// result.getName());
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
		}

	}
}
