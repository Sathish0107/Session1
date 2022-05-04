package com.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class SetupRetry implements IRetryAnalyzer {

	private int retryCount = 0;

	private static final int maxRetryCount = 3;

	public boolean retry(ITestResult result) {

		if (retryCount < maxRetryCount) {

			retryCount++;

			System.out.println("Retrying test method" + result.getName() + "for" + retryCount + "times: ");
			return true;
		}
		return false;
	}

}
