package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test cases failed and details are:"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("Test cases skipped and details are:"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test cases started and details are:"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases success and details are:"+result.getName());
	}

	@Override
	public void onFinish(ITestContext result) {
		
		
	}

	@Override
	public void onStart(ITestContext result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

}
