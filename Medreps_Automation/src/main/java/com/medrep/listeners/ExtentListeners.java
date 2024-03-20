package com.medrep.listeners;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.utilities.EnvSetup;
import com.medrep.utilities.ModelEnvSetup;
import com.medrep.utilities.SendEmail;
import com.medrep.utilities.UploadFile;
import com.medrep.utilities.ZipUtils;

public class ExtentListeners extends BaseClass implements ITestListener,ISuiteListener {

//	static Date d = new Date();
//	static String fileName = "Web Automation Test Report.html";
//	static Map<Integer,ExtentTest> extentTestMap = new HashMap<Integer,ExtentTest>();
//	private static ExtentReports extent = ExtentManager.createInstance(System.getProperty("user.dir")+"/reports/"+fileName);
//	
//	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
//		ExtentTest test = extent.createTest(result.getMethod().getMethodName());
	//	test = extent.createTest(result.getMethod().getMethodName());
//		testReport.set(test); 
	}

	public static void attachScreenShot(String name) {
//		try {
//
//			ExtentManager.captureScreenshot();
//			testReport.get().pass("<b>" + "<font color=" + "green>" + ""+name+"" + "</font>" + "</b>",
//					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName)
//							.build());
//		} catch (IOException e) {
//
//		}
	}
	public void onTestSuccess(ITestResult result) {
//		try {
//
//			ExtentManager.captureScreenshot();
//			testReport.get().pass("<b>" + "<font color=" + "green>" + "Screenshot of pass" + "</font>" + "</b>",
//					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName)
//							.build());
//		} catch (IOException e) {
//
//		}
//		String methodName=result.getMethod().getMethodName();
//		updateTestData(testSuiteRunnerFileName,testSuiteRunnerSheetName, methodName, "Passed",driver);
//		String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " PASSED"+"</b>";		
//		Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
//		testReport.get().pass(m);
//		if (BaseClass.closeDriver) {
////			BaseClass.driver.close();
//		}
		
	}

	public void onTestFailure(ITestResult result) {
//		String methodName=result.getMethod().getMethodName();
//		updateTestData(testSuiteRunnerFileName,testSuiteRunnerSheetName, methodName, "Failed",driver);
//		JavascriptExecutor executor= (JavascriptExecutor)BaseClass.getDriver();
//		System.out.println("User Agent : "+executor.executeScript("return navigator.userAgent"));
//		String excepionMessage=Arrays.toString(result.getThrowable().getStackTrace());
//		testReport.get().fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
//				+ "</font>" + "</b >" + "</summary>" +excepionMessage.replaceAll(",", "<br>")+"</details>"+" \n");
//		
//		try {
//
//			ExtentManager.captureScreenshot();
//			testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
//					MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName)
//							.build());
//		} catch (IOException e) {
//
//		}
//		
//		String failureLogg="TEST CASE FAILED";
//		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
//		testReport.get().log(Status.FAIL, m);
//		if (BaseClass.closeDriver) {
////			BaseClass.driver.close();
//		}
		
	}

	public void onTestSkipped(ITestResult result) {
//		String methodName=result.getMethod().getMethodName();
//		updateTestData(testSuiteRunnerFileName,testSuiteRunnerSheetName, methodName, "Skipped",driver);
//		String logText="<b>"+"Test Case:- "+ methodName+ " Skipped"+"</b>";		
//		Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
//		testReport.get().skip(m);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
//		if (extent != null) {
//			extent.flush();
//		}
	}
	
//	public static ExtentTest getTest() {
//		return (ExtentTest)extentTestMap.get((int)(long)(Thread.currentThread().getId()));
//	}
	

	@Override
	public void onStart(ISuite suite) {
		
		try {
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir")+"/reports/"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onFinish(ISuite suite) {

 		Map<String, ISuiteResult> getResults = suite.getResults();
 		ISuiteResult iSuiteResult = getResults.get(getResults.keySet().toArray()[0]);
 		ITestContext iTestContext = iSuiteResult.getTestContext();
 		String nameString = iTestContext.getName();
 		int pass = iTestContext.getPassedTests().size();
 		int fail = iTestContext.getFailedTests().size();
 		int total = iTestContext.getAllTestMethods().length;
 		String emailBody = "=============================================================\n"+
 							nameString+"\n"+
 							"Tests Run: "+total+", Passed: "+pass+", Failures: "+fail+"\n"+
 							"=============================================================\n";
 		ZipUtils.generateZipFile();
 		try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			e.printStackTrace();
 		}
 		
 		String link;
 		try {
 			UploadFile uploadFile = new UploadFile();
 	 		link = uploadFile.UploadReportGenerateLink();
 	 		
 	 		try {
 	 			SendEmail.SendEmailNow(emailBody,link); 			
 			}catch (Exception e) {
 				
 			}
		} catch (Exception e) {
			UploadFile uploadFile = new UploadFile();
	 		link = uploadFile.UploadReportGenerateLink();
	 		
	 		try {
	 			SendEmail.SendEmailNow(emailBody,link); 			
			}catch (Exception e1) {
				
			}
		}catch (Error e) {
			UploadFile uploadFile = new UploadFile();
	 		link = uploadFile.UploadReportGenerateLink();
	 		
	 		try {
	 			SendEmail.SendEmailNow(emailBody,link); 			
			}catch (Exception e1) {
				
			}
		}
 		
	}
}