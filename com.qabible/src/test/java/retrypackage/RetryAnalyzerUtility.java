package retrypackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerUtility implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult result) { // ITestResult is a listener interface which represents the result of a
												// test method execution,
												// providing access to details like method name, status, and execution
												// time.

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
