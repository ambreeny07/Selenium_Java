package com.ultimateqa.listeners;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.ultimateqa.base.BaseClass;

public class RetryListener implements IRetryAnalyzer {
	// Maximum retry count
    public static int maxRetryCnt = 0;

    /**
     * This method will be called every time a test fails.
     * It returns TRUE if a test fails and needs to be retried, else it returns FALSE.
     *
     * @param result The test result.
     * @return TRUE if the test needs to be retried, FALSE otherwise.
     */
    public boolean retry(ITestResult result) {

        // Check if the test has not reached the maximum retry count
        if (BaseClass.methodNamelist.get(result.getName()) < maxRetryCnt) {
            System.out.println("Retrying " + result.getName() + " again, and the count is " + (BaseClass.methodNamelist.get(result.getName()) + 1));

            // Increment the retry count for the specific test method
            BaseClass.methodNamelist.put(result.getName(), BaseClass.methodNamelist.get(result.getName()) + 1);

            // Return true to indicate that the test should be retried
            return true;
        }

        // Return false if the maximum retry count is reached
        return false;
    }
}
