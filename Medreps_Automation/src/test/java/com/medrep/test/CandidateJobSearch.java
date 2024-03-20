package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateDashboardPage;
import com.medrep.pages.CandidateJobSearchPage;

public class CandidateJobSearch extends BaseClass {
	String tempSrc = "";


	@Test()
	public void TC_ID_52_AsaUserIamAbleToSaveJobSuccessfully() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
	
			testSteps.add("Step " + step + " : Click On 'job Save' button");
			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
			step++;		

			testSteps.add("Step " + step + " : Verify 'Job Saved Successfully Popup' is display");
			assertTrue(candidateJobSearchPage.verifyJobSavedSuccessMsg(driver),
					" Verified 'Job Saved Successfully Popup' is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Saved Button'");
			candidateJobSearchPage.clickOnSavedButton(driver);
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_52_AsaUserIamAbleToSaveJobSuccessfully", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_52_AsaUserIamAbleToSaveJobSuccessfully " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_52_AsaUserIamAbleToSaveJobSuccessfully", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_52_AsaUserIamAbleToSaveJobSuccessfully" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_52_AsaUserIamAbleToSaveJobSuccessfully", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_53_VerifyAsAuserIamAbleToSeeDetailsOfPostedJob() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Job'");
			candidateJobSearchPage.clickFistJobOnPage(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'General' informations is display");
			assertTrue(candidateJobSearchPage.verifyGeneralTextOnJobDescriptionIsDisplaying(driver),
					" Verified 'General' informations is display");
			step++;

			testSteps.add("Step " + step + " : Verify 'Compensation' informations is display");
			assertTrue(candidateJobSearchPage.verifyCompensationTextOnJobDescriptionIsDisplaying(driver),
					" Verified 'Compensation' informations is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_53_VerifyAsAuserIamAbleToSeeDetailsOfPostedJob", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_53_VerifyAsAuserIamAbleToSeeDetailsOfPostedJob " + "<br><b>Exception:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_53_VerifyAsAuserIamAbleToSeeDetailsOfPostedJob", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_53_VerifyAsAuserIamAbleToSeeDetailsOfPostedJob" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_53_VerifyAsAuserIamAbleToSeeDetailsOfPostedJob", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_55_VerifyAsAuserIamAbleToUnsavedJobsSuccessfully() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Click On 'job Save' button");
			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
			step++;		

			testSteps.add("Step " + step + " : Verify 'Job Saved Successfully Popup' is display");
			assertTrue(candidateJobSearchPage.verifyJobSavedSuccessMsg(driver),
					" Verified 'Job Saved Successfully Popup' is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Saved Button'");
			waitTime(2000, driver);
			candidateJobSearchPage.clickOnSavedButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Job UnSaved Successfully Popup' is display");
			assertTrue(candidateJobSearchPage.verifyJobUnSavedSuccessMsg(driver),
					" Verified 'Job UnSaved Successfully Popup' is display");
			step++;
        
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_55_VerifyAsAuserIamAbleToUnsavedJobsSuccessfully", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_55_VerifyAsAuserIamAbleToUnsavedJobsSuccessfully " + "<br><b>Exception:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_55_VerifyAsAuserIamAbleToUnsavedJobsSuccessfully", testSteps, driver);
			e.printStackTrace();
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_55_VerifyAsAuserIamAbleToUnsavedJobsSuccessfully" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_55_VerifyAsAuserIamAbleToUnsavedJobsSuccessfully", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_56_VerifyThatWhenUserEnteredTheKeywordThenJobsShouldHaveAppearedAccordingly() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		String jobName = "SQA Engineer";
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to 'Search Jobs' page");
			assertTrue(candidateJobSearchPage.isPageHeadingSearchJobsDisplay(driver),
					" Verified user is redirected to 'Search Jobs' page");
			step++;

			int listOfJobs = candidateJobSearchPage.getListOfJobs(driver);
			testSteps.add("Step " + step + " :  Number of 'Jobs' showing:" + listOfJobs);
			step++;
			
			jobName = candidateJobSearchPage.getJobName(driver);

			testSteps.add("Step " + step + " : Enter search job 'keyword':" + jobName);
			candidateJobSearchPage.enterSearchJobKeyword(jobName, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Find Jobs' button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  search job is display");
			assertTrue(candidateJobSearchPage.getJobName(jobName, driver), "Search job is not display");
			step++;

			listOfJobs = candidateJobSearchPage.getListOfJobs(driver);
			
			try {
		
			testSteps.add("Step " + step + " : Verify 'You have seen it all.' message is display");
			assertTrue(candidateJobSearchPage.isYouHaveSeenItAllMessageDisplay(driver),
					"Verified 'You have seen it all.' message is display");
			step++;
			} catch (Exception e) {
			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_56_VerifyThatWhenUserEnteredTheKeywordThenJobsShouldHaveAppearedAccordingly", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_56_VerifyThatWhenUserEnteredTheKeywordThenJobsShouldHaveAppearedAccordingly "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_56_VerifyThatWhenUserEnteredTheKeywordThenJobsShouldHaveAppearedAccordingly", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_56_VerifyThatWhenUserEnteredTheKeywordThenJobsShouldHaveAppearedAccordingly"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_56_VerifyThatWhenUserEnteredTheKeywordThenJobsShouldHaveAppearedAccordingly", testSteps,
					driver);
			assertTrue(false);
		}
	}

////	//bug
	@Test()
	public void TC_ID_57_VerifyThatDropdownIconIsClickableAgainstStateFieldOnSearchJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Enter : text State Dropdown");
			candidateJobSearchPage.enterStateDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Verify list of 'State' dropdown options display");
			assertTrue(candidateJobSearchPage.isStateDropdownOptionsDisplay(driver),
					" Verified list of 'State' dropdown options display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_57_VerifyThatDropdownIconIsClickableAgainstStateFieldOnSearchJobsPage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_57_VerifyThatDropdownIconIsClickableAgainstStateFieldOnSearchJobsPage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_57_VerifyThatDropdownIconIsClickableAgainstStateFieldOnSearchJobsPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_57_VerifyThatDropdownIconIsClickableAgainstStateFieldOnSearchJobsPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_57_VerifyThatDropdownIconIsClickableAgainstStateFieldOnSearchJobsPage", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_58_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Primary Function'");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'select all' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionSelectAllOptionDisplay(driver), "Verified primary function 'select all' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Business Development' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionBusinessDevelopmentOptionDisplay(driver), "Verified primary function 'Business Development' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Clinical Consulting' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionClinicalConsultingOptionDisplay(driver), "Verified primary function 'Clinical Consulting' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Independent Representative' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionIndependentRepresentativeOptionDisplay(driver), "Verified primary function 'Independent Representative' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Marketing' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionMarketingOptionDisplay(driver), "Verified primary function 'Marketing' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Account Management' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionAccountManagementOptionDisplay(driver), "Verified primary function 'Account Management' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Sales Management' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionSalesManagementOptionDisplay(driver), "Verified primary function 'Sales Management' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Service Technician' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionServiceTechnicianOptionDisplay(driver), "Verified primary function 'Service Technician' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Other' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionOtherOptionDisplay(driver), "Verified primary function 'Other' option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify primary function 'Sales Support' option is display");
			assertTrue(candidateJobSearchPage.isPrimaryFunctionSalesSupportOptionDisplay(driver), "Verified primary function 'Sales Support' option is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_58_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_58_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_58_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_58_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_58_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_59_VerifyAverageTotalCompensationIsShowingDropdownWithRangeSlider() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'average total compensation' dropdown");
			candidateJobSearchPage.clickAverageTotalCompensation(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify average total 'Range Slider' option is display");
			assertTrue(candidateJobSearchPage.isAverageTotalRangeSliderDisplay(driver), "Verified average total 'Range Slider' option is display");
			step++;			
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_59_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_59_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_59_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_59_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_59_VerifyThatPrimaryFunctionFieldIsShowingTheDropdownOnClicking", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_64_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Salary Only' Checkbox");
			candidateJobSearchPage.clickOnSalaryOnlyCheckbox(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Salary Only' Jobs is display");
			assertTrue(candidateJobSearchPage.isSalaryOnlyJobsDisplay(driver), "Verified 'Salary Only' Jobs is display");
			step++;		
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_64_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_64_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_64_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_64_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_64_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter", testSteps, driver);
			assertTrue(false);
		}
	}
	@Test()
	public void TC_ID_63_VerimfyUserIsAbleToSeeAllFiltersOptionsOnTheSearchJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Keyword' Text Field is display");
			assertTrue(candidateJobSearchPage.isKeywordTextFieldDisplay(driver), "Verified 'Keyword' Text Field is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Location' Dropdown is display");
			assertTrue(candidateJobSearchPage.isLocationDropdownDisplay(driver), "Verified 'Location' Dropdown is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Salary Commission' checkbox is display");
			assertTrue(candidateJobSearchPage.isSalaryCommissionCheckboxDisplay(driver), "Verified 'Salary Commission' checkbox is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Salary Only' Checkbox is display");
			assertTrue(candidateJobSearchPage.isSalaryOnlyCheckboxDisplay(driver), "Verified 'Salary Only' Checkbox  is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Not Specified' Checkbox is display");
			assertTrue(candidateJobSearchPage.isNotSpecifiedCheckboxDisplay(driver), "Verified 'Not Specified' Checkbox  is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Travel Percentage' Dropdown is display");
			assertTrue(candidateJobSearchPage.isTravelPercentageDropdownDisplay(driver), "Verified 'Travel Percentage' Dropdown is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Industry' Dropdown is display");
			assertTrue(candidateJobSearchPage.isIndustryDropdownDisplay(driver), "Verified 'Industry' Checkbox is display");
			step++;		
			
			testSteps.add("Step " + step + " : Verify 'Average Total Compensation' dropdown is display");
			assertTrue(candidateJobSearchPage.isAverageTotalCompensationDisplay(driver), "Verified 'Average Total Compensation' dropdown is display");
			step++;		
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_63_VerimfyUserIsAbleToSeeAllFiltersOptionsOnTheSearchJobsPage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_63_VerimfyUserIsAbleToSeeAllFiltersOptionsOnTheSearchJobsPage"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_63_VerimfyUserIsAbleToSeeAllFiltersOptionsOnTheSearchJobsPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_63_VerimfyUserIsAbleToSeeAllFiltersOptionsOnTheSearchJobsPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_63_VerimfyUserIsAbleToSeeAllFiltersOptionsOnTheSearchJobsPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_60_VerifyThatTravelPercentageIsShowingTheDropdownOnClicking() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Travel Percentage' Dropdown");
			candidateJobSearchPage.clickOnTravelPercentageDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Select All' Option is display");
			assertTrue(candidateJobSearchPage.isSelectAllOptionDisplay(driver),
					" Verified 'Select All' Option is display");
			step++;

			testSteps.add("Step " + step + " : Verify '0-25%' Option is display");
			assertTrue(candidateJobSearchPage.isOption0_25PercentDisplay(driver),
					" Verified '0-25%' Option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify '25-50%' Option is display");
			assertTrue(candidateJobSearchPage.isOption25_50PercentDisplay(driver),
					" Verified '25-50%' Option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify '50-75%' Option is display");
			assertTrue(candidateJobSearchPage.isOption50_75PercentDisplay(driver),
					" Verified '50-75%' Option is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify '75-100%' Option is display");
			assertTrue(candidateJobSearchPage.isOption75_100PercentDisplay(driver),
					" Verified '75-100%' Option is display");
			step++;
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_60_VerifyThatTravelPercentageIsShowingTheDropdownOnClicking", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_60_VerifyThatTravelPercentageIsShowingTheDropdownOnClicking "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_60_VerifyThatTravelPercentageIsShowingTheDropdownOnClicking", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_60_VerifyThatTravelPercentageIsShowingTheDropdownOnClicking"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_60_VerifyThatTravelPercentageIsShowingTheDropdownOnClicking", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_73_VerifyUserIsAbleToRedirectToJobDetailPageFromTheSearchJobPageByClickingOnApplyNowButtonFromAnyJobOnSearchJobPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		String resumeFileName = "Resume.pdf";
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step "+step+" : Click on Job 'Apply Now' button");
		    candidateJobSearchPage.clickOnJobApplyNowButton(driver);
		    step++;

		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
				testSteps.add("Step " + step + " : 'Open External Link' ");
				step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify 'Job' title display");
		        assertTrue(candidateJobSearchPage.isJobTitleDisplay(driver)," Verified 'Job' title display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'General Information' About Job display");
		        assertTrue(candidateJobSearchPage.isGeneralInformationAboutJobDisplay(driver)," Verified 'General Information' About Job display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Job' Description display");
		        assertTrue(candidateJobSearchPage.isJobDescriptionDisplay(driver)," Verified 'Job' Description display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Compensation Information' is display");
		        assertTrue(candidateJobSearchPage.isCompensationInformationDisplay(driver)," Verified 'Compensation Information' is display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Company Information' display");
		        assertTrue(candidateJobSearchPage.isCompanyInformationDisplay(driver)," Verified 'Company Information' display");
		        step++;

		        testSteps.add("Step "+step+" : Verify 'More Jobs From This Company' display");
		        assertTrue(candidateJobSearchPage.isMoreJobsFromThisCompanyDisplay(driver)," Verified 'More Jobs From This Company' display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Apply Now' button On Top And Bottom display");
		        assertTrue(candidateJobSearchPage.isApplyNowButtonDisplayOnTopAndBottom(driver)," Verified 'Apply Now' button On Top And Bottom display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Printer' job button display");
		        assertTrue(candidateJobSearchPage.isPrinterJobBtnDisplay(driver)," Verified 'Printer' job button display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'See How You Compare Section' is display");
		        assertTrue(candidateJobSearchPage.isSeeHowYouCompareSectionDisplay(driver)," Verified 'See How You Compare Section' is display");
		        step++;		        
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_73_VerifyUserIsAbleToRedirectToJobDetailPageFromTheSearchJobPageByClickingOnApplyNowButtonFromAnyJobOnSearchJobPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_73_VerifyUserIsAbleToRedirectToJobDetailPageFromTheSearchJobPageByClickingOnApplyNowButtonFromAnyJobOnSearchJobPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_73_VerifyUserIsAbleToRedirectToJobDetailPageFromTheSearchJobPageByClickingOnApplyNowButtonFromAnyJobOnSearchJobPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_73_VerifyUserIsAbleToRedirectToJobDetailPageFromTheSearchJobPageByClickingOnApplyNowButtonFromAnyJobOnSearchJobPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_73_VerifyUserIsAbleToRedirectToJobDetailPageFromTheSearchJobPageByClickingOnApplyNowButtonFromAnyJobOnSearchJobPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_94_VerifyUserIsAbleToSaveJobFromSearchJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
	
			testSteps.add("Step " + step + " : Click On 'job Save' button");
			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
			step++;		

			testSteps.add("Step " + step + " : Verify 'Job Saved Successfully Popup' is display");
			assertTrue(candidateJobSearchPage.verifyJobSavedSuccessMsg(driver),
					" Verified 'Job Saved Successfully Popup' is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Saved Button'");
			candidateJobSearchPage.clickOnSavedButton(driver);
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_94_VerifyUserIsAbleToSaveJobFromSearchJobsPage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_94_VerifyUserIsAbleToSaveJobFromSearchJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_94_VerifyUserIsAbleToSaveJobFromSearchJobsPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_94_VerifyUserIsAbleToSaveJobFromSearchJobsPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_94_VerifyUserIsAbleToSaveJobFromSearchJobsPage", testSteps, driver);
			assertTrue(false);
		}
	}
	@Test()
	public void TC_ID_96_VerifyAuthenticatedUserIsAbleToSeeLimitedJobDetailsOnTheSearchJobsPageAgainstEachJob() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		String resumeFileName = "Resume.pdf";
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step "+step+" : Click on Job 'Apply Now' button");
		    candidateJobSearchPage.clickOnJobApplyNowButton(driver);
		    step++;

		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
				testSteps.add("Step " + step + " : 'Open External Link' ");
				step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify 'Job' title display");
		        assertTrue(candidateJobSearchPage.isJobTitleDisplay(driver)," Verified 'Job' title display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'General Information' About Job display");
		        assertTrue(candidateJobSearchPage.isGeneralInformationAboutJobDisplay(driver)," Verified 'General Information' About Job display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Job' Description display");
		        assertTrue(candidateJobSearchPage.isJobDescriptionDisplay(driver)," Verified 'Job' Description display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Compensation Information' is display");
		        assertTrue(candidateJobSearchPage.isCompensationInformationDisplay(driver)," Verified 'Compensation Information' is display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Company Information' display");
		        assertTrue(candidateJobSearchPage.isCompanyInformationDisplay(driver)," Verified 'Company Information' display");
		        step++;

		        testSteps.add("Step "+step+" : Verify 'More Jobs From This Company' display");
		        assertTrue(candidateJobSearchPage.isMoreJobsFromThisCompanyDisplay(driver)," Verified 'More Jobs From This Company' display");
		        step++;
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_96_VerifyAuthenticatedUserIsAbleToSeeLimitedJobDetailsOnTheSearchJobsPageAgainstEachJob",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_96_VerifyAuthenticatedUserIsAbleToSeeLimitedJobDetailsOnTheSearchJobsPageAgainstEachJob "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_96_VerifyAuthenticatedUserIsAbleToSeeLimitedJobDetailsOnTheSearchJobsPageAgainstEachJob",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_96_VerifyAuthenticatedUserIsAbleToSeeLimitedJobDetailsOnTheSearchJobsPageAgainstEachJob"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_96_VerifyAuthenticatedUserIsAbleToSeeLimitedJobDetailsOnTheSearchJobsPageAgainstEachJob",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_97_VerifyUserIsAbleToCreateJobAlertByClickingOnCreateAlertForMoreJobLikeThisFromTheSearchJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		String keyword = "Test";
		String location = "USA";
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step " + step + " : enter keywork "+keyword+"");
			candidateJobSearchPage.enterKeyword(keyword,driver);
			step++;

			testSteps.add("Step " + step + " : enter location "+location+"");
			candidateJobSearchPage.enterLocationDropdown(location,driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Enter Search Name "+keyword+"");
			candidateJobSearchPage.enterSearchName(keyword,driver);
			step++;
			
			testSteps.add("Step " + step + " : Select 'Weekly' radio button");
			candidateJobSearchPage.selectWeeklyRadioButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Create Alert' popup button");
			candidateJobSearchPage.clickOnCreateAlertButtonPopup(driver);
			step++;			

			testSteps.add("Step " + step + " : Verify 'Search Saved' popup is Display");
			assertTrue(candidateJobSearchPage.isSearchSavedPopupDisplay(driver),
					" Verified 'Search Saved' popup is Display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_97_VerifyUserIsAbleToCreateJobAlertByClickingOnCreateAlertForMoreJobLikeThisFromTheSearchJobsPage", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_97_VerifyUserIsAbleToCreateJobAlertByClickingOnCreateAlertForMoreJobLikeThisFromTheSearchJobsPage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_97_VerifyUserIsAbleToCreateJobAlertByClickingOnCreateAlertForMoreJobLikeThisFromTheSearchJobsPage", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_97_VerifyUserIsAbleToCreateJobAlertByClickingOnCreateAlertForMoreJobLikeThisFromTheSearchJobsPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_97_VerifyUserIsAbleToCreateJobAlertByClickingOnCreateAlertForMoreJobLikeThisFromTheSearchJobsPage", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_98_VerifyUserIsAbleToSeeSeeHowYouCompareSectionOnTheRightSideOfTheScreenForEachJob() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		String keyword = "Test";
		String location = "USA";
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
			testSteps.add("Step "+step+" : Click on Job 'Apply Now' button");
		    candidateJobSearchPage.clickOnJobApplyNowButton(driver);
		    step++;

		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
				testSteps.add("Step " + step + " : 'Open External Link' ");
				step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify 'Members Applied To This Job' title display");
		        assertTrue(candidateJobSearchPage.isMembersAppliedToThisJobDisplay(driver)," Verified 'Members Applied To This Job' title display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Years Of Experience' display");
		        assertTrue(candidateJobSearchPage.isYearsOfExperienceLblDisplay(driver)," Verified 'Years Of Experience' display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Annual Salary' display");
		        assertTrue(candidateJobSearchPage.isAnnualSalaryLblDisplay(driver)," Verified 'Annual Salary' display");
		        step++;
		        
		        testSteps.add("Step "+step+" : Verify 'Education Level' display");
		        assertTrue(candidateJobSearchPage.isEducationLevelLblDisplay(driver)," Verified 'Education Level' display");
		        step++;
		        }

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_98_VerifyUserIsAbleToSeeSeeHowYouCompareSectionOnTheRightSideOfTheScreenForEachJob", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_98_VerifyUserIsAbleToSeeSeeHowYouCompareSectionOnTheRightSideOfTheScreenForEachJob "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_98_VerifyUserIsAbleToSeeSeeHowYouCompareSectionOnTheRightSideOfTheScreenForEachJob", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_98_VerifyUserIsAbleToSeeSeeHowYouCompareSectionOnTheRightSideOfTheScreenForEachJob"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_98_VerifyUserIsAbleToSeeSeeHowYouCompareSectionOnTheRightSideOfTheScreenForEachJob", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_99_VerifyUserIsAbleToSeeTotalJobCountOnTheSearchJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		String keyword = "Test";
		String location = "USA";
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Total Count Of Job' display");
	        assertTrue(candidateJobSearchPage.isTotalCountOfJobDisplay(driver)," Verified 'Total Count Of Job' display");
	        step++;
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_99_VerifyUserIsAbleToSeeTotalJobCountOnTheSearchJobsPage", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_99_VerifyUserIsAbleToSeeTotalJobCountOnTheSearchJobsPage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_99_VerifyUserIsAbleToSeeTotalJobCountOnTheSearchJobsPage", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_99_VerifyUserIsAbleToSeeTotalJobCountOnTheSearchJobsPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_99_VerifyUserIsAbleToSeeTotalJobCountOnTheSearchJobsPage", testSteps,
					driver);
			assertTrue(false);
		}
	}


	@Test()
	public void TC_ID_145_VerifyUserIsNotAbleToPerformAnySearchFromTheSearchJobPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[1][0].toString();
		String password = dataArr[1][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Salary Only' Checkbox");
			candidateJobSearchPage.clickOnSalaryOnlyCheckbox(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_145_VerifyUserIsNotAbleToPerformAnySearchFromTheSearchJobPage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_145_VerifyUserIsNotAbleToPerformAnySearchFromTheSearchJobPage"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_145_VerifyUserIsNotAbleToPerformAnySearchFromTheSearchJobPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_145_VerifyUserIsNotAbleToPerformAnySearchFromTheSearchJobPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_145_VerifyUserIsNotAbleToPerformAnySearchFromTheSearchJobPage", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_160_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		String filterValue = "Test";
		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[1][0].toString();
		String password = dataArr[1][1].toString();
		String location="USA";
		String averageK ="10";
		
		
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(2000, driver);
			assertTrue(candidateJobSearchPage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateJobSearchPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateJobSearchPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;			
			
//    		Verify keyword filter		
			
			testSteps.add("Step " + step + " : Enter search job <b>'keyword':" + filterValue+"</b>");
			candidateJobSearchPage.enterSearchJobKeyword(filterValue, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify keywork Filter Job results <b>'"+filterValue+"'</b> is display");
			assertTrue(candidateJobSearchPage.verifyKeywordFilterResult(filterValue,driver), "Verified keywork Filter Job results <b>'"+filterValue+"'</b> is display");
			step++;			

			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Salary + Commission filter
			
			testSteps.add("Step " + step + " : Click on <b>'Salary + Commission'</b> Checkbox");
			candidateJobSearchPage.clickOnSalaryCommissionCheckbox(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;						
			
			testSteps.add("Step " + step + " : Verify Salary + Commission checkbox Filter Result is display");
			assertTrue(candidateJobSearchPage.verifySalaryCommissionCheckboxFilterResult(driver), "Verified Salary + Commission Filter Result is  display");
			step++;							
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Commission Only filter
			
			testSteps.add("Step " + step + " : Click on <b>'Commission Only'</b> Checkbox");
			candidateJobSearchPage.clickOnCommissionOnlyCheckbox(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify Commission Only Checkbox Filter Result is display");
			assertTrue(candidateJobSearchPage.verifyCommissionOnlyCheckboxFilterResult(driver), "Verified Commission Only Checkbox Filter Result is display");
			step++;	
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Salary Only filter
			
			testSteps.add("Step " + step + " : Click on 'Salary Only' Checkbox");
			candidateJobSearchPage.clickOnSalaryOnlyCheckbox(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify Compensation Salary Only Checkbox Filter Result is display");
			assertTrue(candidateJobSearchPage.verifyCompensationSalaryOnlyFilterResult(driver), "Verified Compensation Salary Only Checkbox Filter Result Result is display");
			step++;			
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Not Specified filter
			
			testSteps.add("Step " + step + " : Click on 'Not Specified' Checkbox");
			candidateJobSearchPage.clickOnNotSpecifiedCheckbox(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;	
			
			if(candidateJobSearchPage.NoJobsFound(driver) == true) {
				testSteps.add("Step " + step + " : Here is no job for 'Not Specified' Filter");
			}else {				
				testSteps.add("Step " + step + " : Verify Compensation Not Specified Checkbox Filter Result is display");
				assertTrue(candidateJobSearchPage.verifyCompensationNotSpecifiedFilterResult(driver), "Verified Compensation Not Specified Checkbox Filter Result Result is display");
				step++;					
			}
			
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;

//    		Verify Remote filter
			
			testSteps.add("Step " + step + " : Click on 'Remote' Checkbox");
			candidateJobSearchPage.clickOnRemoteCheckbox(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify Compensation Not Specified Checkbox Filter Result is display");
			assertTrue(candidateJobSearchPage.verifyRemoteFilterResult(driver), "Verified Compensation Not Specified Checkbox Filter Result Result is display");
			step++;	
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Primary Function filter
			
			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Click on 'Primary Function 'Business Development' Option");
			candidateJobSearchPage.clickOnPrimaryFunctionBusinessDevelopmentOption(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify Primary Function 'Business development' Filter Result is display");
			assertTrue(candidateJobSearchPage.verifyPrimaryFunctionBusinessDevelopmentFilterResult(driver), "Verified Primary Function 'Business development' Filter Result is display");
			step++;	
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Travel Percentage filter
			
			testSteps.add("Step " + step + " : Click on 'Travel Percentage' dropdown button");
			candidateJobSearchPage.clickOnTravelPercentageDropdown(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Click on 'Travel Percentage 0-25%' Option");
			candidateJobSearchPage.clickOnTravelPercentage0_25PercentOption(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Travel Percentage 0-25%' Filter Result is display");
			assertTrue(candidateJobSearchPage.verifyTravelPercentage0_25PercentFilterResult(driver), "Verified 'Travel Percentage 0-25%' Filter Result is display");
			step++;	
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
//    		Verify Industry filter
			
			testSteps.add("Step " + step + " : Click on 'Industry' dropdown button");
			candidateJobSearchPage.clickOnIndustryDropdown(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Click on Industry 'Biotechnology' Option");
			candidateJobSearchPage.clickOnIndustryBiotechnologyOption(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify Industry 'Biotechnology' Result is display");
			assertTrue(candidateJobSearchPage.verifyIndustryBiotechnologyFilterResult(driver), "Verified Industry 'Biotechnology' Result is display");
			step++;		
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;	
			
			testSteps.add("Step " + step + " : Enter Location : '"+location+"'");
			candidateJobSearchPage.enterLocation(location,driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify Location 'United States' filter Result is display");
			assertTrue(candidateJobSearchPage.verifyLocationUnitedStatesFilterResult(driver), "Verified Industry 'Biotechnology' Result is display");
			step++;		
			
			testSteps.add("Step " + step + " : Click on <b>'Reset'</b> button");
			candidateJobSearchPage.clickOnResetButton(driver);
			waitTime(4000, driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Average Total Compensation' Button");
			candidateJobSearchPage.clickOnAverageTotalCompensationButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Enter Average : '"+averageK+"'");
			candidateJobSearchPage.enterInputAverageK(averageK,driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Find Jobs' Button");
			candidateJobSearchPage.clickOnFindJobsButton(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify Average Total Compensation '"+averageK+"' filter Result is display");
			assertTrue(candidateJobSearchPage.verifyAvgTotalCompFilterResult(driver), "Verify Average Total Compensation '"+averageK+"' filter Result is display");
			step++;				
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_160_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_160_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_160_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_160_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_160_VerifyUserIsAbleToSearchJobsByApplyingAnyFilter", testSteps, driver);
			assertTrue(false);
		}
	}
}
