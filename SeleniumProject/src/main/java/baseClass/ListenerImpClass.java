package baseClass;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImpClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("On Start Suite");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("On Finish Suite");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On TestStart Listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On TestSuccess Listener");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On TestFailure Listener");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On TestSkipped Listener");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On TestFailedButWithinSuccessPercentage Listener");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On TestFailedWithTimeout Listener");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start Listener");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Listener");
	}
	
	

}
