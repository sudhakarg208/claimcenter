package gw.qa.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GWCustomeListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			String successFilePath = "C:\\Users\\Vignesh\\eclipse-workspace\\claimcenter\\test-output\\screenshots\\success";
			TakeScreenShot.screenShot(successFilePath,result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("In custom listener class");
		// TODO Auto-generated method stub
		try {
			String failureFilePath = "C:\\Users\\Vignesh\\eclipse-workspace\\claimcenter\\test-output\\screenshots\\failure";
			TakeScreenShot.screenShot(failureFilePath,result.getMethod().getDescription());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
