package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		//TODO Auto-generated method stub
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		//TODO Auto-generated method stub
		//System.out.println("I Successfully eecuted Listeners pass code");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		//TODO Auto-generated method stub
		//screenshot code
		//response if API is failed
		System.out.println("I failed executes Listeners pass code"+ result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		//TODO Auto-generated method stub
	}
	public void onTestFailedButWithSuccessPercentage(ITestResult result) {
		//TODO Auto-generated method stub
	}
	@Override
	public void onStart(ITestContext context) {
		//TODO Auto-generated method stub
	}
	@Override
	public void onFinish(ITestContext context) {
		//TODO Auto-generated method stub
	}





}

