package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test start");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test pass");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Fail");
		
	}

	public void onTestSkipped(ITestResult result) {

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("On TestNG start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("On TestNG Finish");
		
	}

}
