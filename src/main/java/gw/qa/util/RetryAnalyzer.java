package gw.qa.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int count =0;
	int retryCount = 1;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("in Retryanalyzer class ");
		if(count <= retryCount) {
			System.out.println("in Retryanalyzer if condition ");
			count++;
			return true;
		}
		return false;
	}

}
