package com.medrep.listeners;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.utilities.ModelTests;
import com.medrep.utilities.TestsDataConverter;

public class TestFilterListener extends BaseClass implements IMethodInterceptor {
	public static ModelTests[] tests;

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		ArrayList<String> testsToRun = new ArrayList<>();

		testsToRun.add("VerifyThatUserCanApplyForAJobFromYourJobsSection");
		testsToRun.add("VerifyThatUserIsAbleToSeeAddOnsSectionOnAccountPage");
		testsToRun.add("VerifyThatAddToPlanButtonIsClickableForFeaturedJobAgainstAddOnsSectionOnAccountPage");
		testsToRun.add("VerifyThatViewMoreIsClickableOnApplyPopupWindow");
		testsToRun.add("VerifyThatViewLessIsClickableOnApplyPopupWindow");
		testsToRun.add(
				"VerifyThatUserIsAbleToSuccessfullyReachApplyPopupWindowByClickingOnApplyNowButtonBelowJobDescription");
		testsToRun.add("VerifyThatUserIsAbleToSuccessfullyReachApplyPopupWindowAgainstAnyJobDescription");
		testsToRun.add("VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded");
		testsToRun
				.add("VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow");
		testsToRun.add("VerifyThatUserIsAbleToCloseApplyPopupWindowOnClickingCancelButton");
		// testsToRun.add("VerifyThatUserIsAbleToCloseDailogueBoxYouHaveSuccessfullySubmittedYourApplication");
		testsToRun.add("VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelyOnJobDetailPage");
		testsToRun.add("VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage");
		testsToRun.add("VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage");
		testsToRun.add("VerifyThatUserIsAbleToExpandInformationAgainstEducationLevelyOnJobDetailPage");
		testsToRun.add("VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage");
		testsToRun
				.add("VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection");
		testsToRun.add("VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation");
		//testsToRun.add("VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob");
		testsToRun.add("VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume");
		//testsToRun.add("VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully");



    	printString("Running " + methods.size() + " Tests");
		for (IMethodInstance method : methods) {
			printString(method.getMethod().getMethodName());
			methodNamelist.put(method.getMethod().getMethodName(), 0);
		}
		return methods;

//		List<IMethodInstance> methodsToRun = new ArrayList<>();
//		for (IMethodInstance method : methods) {
//			printString(method.getMethod().getMethodName());
//			if (testsToRun.contains(method.getMethod().getMethodName())) {
//				methodsToRun.add(method);
//				methodNamelist.put(method.getMethod().getMethodName(), 0);
//			}
//		}
//		printString("Running " + methodsToRun.size() + " Tests");
//		return methodsToRun;
	}

}