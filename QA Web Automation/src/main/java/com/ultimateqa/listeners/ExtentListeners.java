package com.ultimateqa.listeners;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.ultimateqa.base.BaseClass;
import com.ultimateqa.utilities.ZipUtils;

public class ExtentListeners extends BaseClass implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		printString(result.getTestName() + "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		printString(result.getTestName() + " Test Failed");
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

	@Override
	public void onStart(ISuite suite) {

		try {
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir") + "/reports/"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onFinish(ISuite suite) {
		ZipUtils.generateZipFile();
	}

}
