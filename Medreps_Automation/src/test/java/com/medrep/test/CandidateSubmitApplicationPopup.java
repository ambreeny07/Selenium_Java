package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateDashboardPage;
import com.medrep.pages.CandidateJobDetailPage;
import com.medrep.pages.CandidateJobSearchPage;

public class CandidateSubmitApplicationPopup extends BaseClass {
	String tempSrc = "";


	@Test()
	public void TC_ID_81_VerifySubmitApplicationPopupAppearsOnClickingApplyNowButtonFromJobDetailPage() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
		}
		else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
		}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_81_VerifySubmitApplicationPopupAppearsOnClickingApplyNowButtonFromJobDetailPage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_81_VerifySubmitApplicationPopupAppearsOnClickingApplyNowButtonFromJobDetailPage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_81_VerifySubmitApplicationPopupAppearsOnClickingApplyNowButtonFromJobDetailPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_81_VerifySubmitApplicationPopupAppearsOnClickingApplyNowButtonFromJobDetailPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_81_VerifySubmitApplicationPopupAppearsOnClickingApplyNowButtonFromJobDetailPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_82_VerifyThatUserIsAbleToCloseSubmitApplicationPopupWindowOnClickingCancelButton() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
		}
		else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Cancel' button");
			candidateJobSearchPage.clickOnCancelButton(driver);
			step++;
		}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_82_VerifyThatUserIsAbleToCloseSubmitApplicationPopupWindowOnClickingCancelButton", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_82_VerifyThatUserIsAbleToCloseSubmitApplicationPopupWindowOnClickingCancelButton "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_82_VerifyThatUserIsAbleToCloseSubmitApplicationPopupWindowOnClickingCancelButton", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_82_VerifyThatUserIsAbleToCloseSubmitApplicationPopupWindowOnClickingCancelButton"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_82_VerifyThatUserIsAbleToCloseSubmitApplicationPopupWindowOnClickingCancelButton", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_83_VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
			
	        testSteps.add("Step "+step+" : Click on 'Remove' button");
		    candidateJobSearchPage.clickOnRemoveButton(driver);
		    step++;

			testSteps.add("Step " + step + " : Upload candidate 'Resume' ");
			candidateJobSearchPage.uploadResume(driver);
			step++;
			
			testSteps.add("Step " + step + " : Text In 'Your Cover Letter' ");
			candidateDashboardPage.enterTextInYourCoverLetter(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Resume File' upload");
			assertEquals(candidateJobSearchPage.getUploadResumeFileName(driver), resumeFileName,
					"Resume is not upload");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Submit Application' button.");
			candidateJobSearchPage.clickOnSubmitApplicationButton(driver);
			step++;

			waitTime(3000);
			testSteps.add("Step " + step
					+ " : Verify  'You have Successfully Submitted Your Job Application' Popup is display");
			assertTrue(candidateJobSearchPage.isYouhaveSuccessfullySubmittedYourApplicationPopupDisplay(driver),
					"Verified 'You have Successfully Submitted Your Job Application' Popup is display");
			step++;		
		}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_83_VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_83_VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_83_VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_83_VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_83_VerifyThatUserIsAbleToSubmitApplicationSuccessfullyAgainstAnyJob", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_84_VerifyThatUserIsAbleToCloseDialogBoxYouveSuccessfullySubmittedYourApplication() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
			
	        testSteps.add("Step "+step+" : Click on 'Remove' button");
		    candidateJobSearchPage.clickOnRemoveButton(driver);
		    step++;

			testSteps.add("Step " + step + " : Upload candidate 'Resume' ");
			candidateJobSearchPage.uploadResume(driver);
			step++;
			
			testSteps.add("Step " + step + " : Text In 'Your Cover Letter' ");
			candidateDashboardPage.enterTextInYourCoverLetter(driver);
			step++;						

			testSteps.add("Step " + step + " : Verify 'Resume File' upload");
			assertEquals(candidateJobSearchPage.getUploadResumeFileName(driver), resumeFileName,
					"Resume is not upload");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Submit Application' button.");
			candidateJobSearchPage.clickOnSubmitApplicationButton(driver);
			step++;
			
			try {
				waitTime(3000);
				testSteps.add("Step " + step
						+ " : Verify  'You have Successfully Submitted Your Job Application' Popup is display");
				assertTrue(candidateJobSearchPage.isYouhaveSuccessfullySubmittedYourApplicationPopupDisplay(driver),
						"Verified 'You have Successfully Submitted Your Job Application' Popup is display");
				step++;
				
				waitTime(3000);
				testSteps.add("Step " + step + " : Click on popup 'X' button.");
				candidateJobSearchPage.clickOnCancelBtn(driver);
				step++;
				
				testSteps.add("Step " + step
						+ " : Verify 'You have Successfully Submitted Your Job Application' Popup is closed");
				assertFalse(candidateJobSearchPage.isYouhaveSuccessfullySubmittedYourApplicationPopupDisplay(driver),
						"Verified 'You have Successfully Submitted Your Job Application' Popup is closed");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}			
		}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_84_VerifyThatUserIsAbleToCloseDialogBoxYouveSuccessfullySubmittedYourApplication", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_84_VerifyThatUserIsAbleToCloseDialogBoxYouveSuccessfullySubmittedYourApplication "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_84_VerifyThatUserIsAbleToCloseDialogBoxYouveSuccessfullySubmittedYourApplication", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_84_VerifyThatUserIsAbleToCloseDialogBoxYouveSuccessfullySubmittedYourApplication"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_84_VerifyThatUserIsAbleToCloseDialogBoxYouveSuccessfullySubmittedYourApplication", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_85_VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
			
	        testSteps.add("Step "+step+" : Click on 'Remove' button");
		    candidateJobSearchPage.clickOnRemoveButton(driver);
		    step++;

			testSteps.add("Step " + step + " : Upload candidate 'Resume' ");
			candidateJobSearchPage.uploadResume(driver);
			step++;
			
			testSteps.add("Step " + step + " : Text In 'Your Cover Letter' ");
			candidateDashboardPage.enterTextInYourCoverLetter(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Resume File' upload");
			assertEquals(candidateJobSearchPage.getUploadResumeFileName(driver), resumeFileName,
					"Resume is not upload");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Submit Application' button.");
			candidateJobSearchPage.clickOnSubmitApplicationButton(driver);
			step++;
			
			try {
				waitTime(3000);
				testSteps.add("Step " + step
						+ " : Verify  'You have Successfully Submitted Your Job Application' Popup is display");
				assertTrue(candidateJobSearchPage.isYouhaveSuccessfullySubmittedYourApplicationPopupDisplay(driver),
						"Verified 'You have Successfully Submitted Your Job Application' Popup is display");
				step++;
				
				waitTime(3000);
				testSteps.add("Step " + step + " : Click on popup 'X' button.");
				candidateJobSearchPage.clickOnCancelBtn(driver);
				step++;
				
				testSteps.add("Step " + step
						+ " : Verify 'You have Successfully Submitted Your Job Application' Popup is closed");
				assertFalse(candidateJobSearchPage.isYouhaveSuccessfullySubmittedYourApplicationPopupDisplay(driver),
						"Verified 'You have Successfully Submitted Your Job Application' Popup is closed");
				step++;
				
				testSteps.add("Step " + step + " : Verify  'Applied' label is display");
				assertTrue(candidateJobSearchPage.verifyAppliedLblIsDisplaying(driver),
						"Verified 'Applied' label is display");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}catch (Error e) {
				// TODO: handle exception
			}
			
			
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_85_VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_85_VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_85_VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_85_VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_85_VerifyThatUserIsAbleToSeeStatusAppliedAfterSubmittingApplicationSuccessfully", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_86_VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
			
	        testSteps.add("Step "+step+" : Click on 'Remove' button");
		    candidateJobSearchPage.clickOnRemoveButton(driver);
		    step++;

			testSteps.add("Step " + step + " : Upload candidate 'Resume' ");
			candidateJobSearchPage.uploadResume(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Resume File' upload");
			assertEquals(candidateJobSearchPage.getUploadResumeFileName(driver), resumeFileName,
					"Resume is not upload");
			step++;	
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_86_VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_86_VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_86_VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_86_VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_86_VerifyThatUserIsAbleToAttachANewResumeByClickingOnDragOrUploadResumeFileAgainstApplyPopupWindow", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_87_VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
		    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
			assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
			step++;
			
	        testSteps.add("Step "+step+" : Click on 'Remove' button");
		    candidateJobSearchPage.clickOnRemoveButton(driver);
		    step++;

		    testSteps.add("Step " + step + " : Verify 'Resume' removed is display");
			assertTrue(candidateJobSearchPage.isResumeRemovedDisplay(driver),
					"Verified 'Resume' removed is display");
			step++;
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_87_VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_87_VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_87_VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_87_VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_87_VerifyThatUserIsAbleToRemoveUploadedResumeFileByClickingOnRemoveAgainstAttachANewResumeSection", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_88_VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify  'Apply Job' Popup is display");
				assertTrue(candidateJobSearchPage.isApplyJobPopupDisplay(driver),"Verified 'Apply Job' Popup is display");
				step++;
				
		        testSteps.add("Step "+step+" : Click on 'Remove' button");
			    candidateJobSearchPage.clickOnRemoveButton(driver);
			    step++;

				testSteps.add("Step " + step + " : Upload candidate 'Resume' ");
				candidateJobSearchPage.uploadResume(driver);
				step++;

				testSteps.add("Step " + step + " : Verify 'Resume File' upload");
				assertEquals(candidateJobSearchPage.getUploadResumeFileName(driver), resumeFileName,
						"Resume is not upload");
				step++;
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_88_VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_88_VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_88_VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_88_VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_88_VerifyThatUserIsAbleToUploadResumeAgainstAttachANewResumeSectionByPerformingDragOperation", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_89_VerifyThatViewMoreIsClickableOnSubmitApplicationPopup() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify 'Apply' popup window display");
		        assertTrue(candidateJobSearchPage.isApplyLabelDisplay(driver)," Verified 'Apply' popup window display");
		        step++;

				testSteps.add("Step " + step + " : Click on 'View More' button");
				candidateJobSearchPage.clickOnViewMoreButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify 'View Less' button display");
				assertTrue(candidateJobSearchPage.isViewLessButtonDisplay(driver), "Verified 'View Less' button display");
				step++;
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_89_VerifyThatViewMoreIsClickableOnSubmitApplicationPopup", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_89_VerifyThatViewMoreIsClickableOnSubmitApplicationPopup "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_89_VerifyThatViewMoreIsClickableOnSubmitApplicationPopup", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_89_VerifyThatViewMoreIsClickableOnSubmitApplicationPopup"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_89_VerifyThatViewMoreIsClickableOnSubmitApplicationPopup", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_90_VerifyThatViewLessIsClickableOnSubmitApplicationPopup() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify 'Apply' popup window display");
			    assertTrue(candidateJobSearchPage.isApplyLabelDisplay(driver)," Verified 'Apply' popup window display");
			    step++;
			
				testSteps.add("Step " + step + " : Click on 'View More' button");
				candidateJobSearchPage.clickOnViewMoreButton(driver);
				step++;
			
				testSteps.add("Step " + step + " : Verify 'View Less' button display");
				assertTrue(candidateJobSearchPage.isViewLessButtonDisplay(driver), "Verified 'View Less' button display");
				step++;
			
				testSteps.add("Step " + step + " : Click on 'View Less' button");
				candidateJobSearchPage.clickOnViewLessButton(driver);
				step++;
			
				testSteps.add("Step " + step + " : Verify 'View More' button display");
				assertTrue(candidateJobSearchPage.isViewMoreButtonDisplay(driver), "Verified 'View More' button display");
				step++;
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_90_VerifyThatViewLessIsClickableOnSubmitApplicationPopup", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_90_VerifyThatViewLessIsClickableOnSubmitApplicationPopup "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_90_VerifyThatViewLessIsClickableOnSubmitApplicationPopup", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_90_VerifyThatViewLessIsClickableOnSubmitApplicationPopup"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_90_VerifyThatViewLessIsClickableOnSubmitApplicationPopup", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_91_VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume() {

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

			testSteps.add("Step " + step + " : Click on Job 'Apply Now' button");
			candidateJobSearchPage.clickOnJobApplyNowButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Apply Now' button");
			candidateJobSearchPage.clickOnApplyNowButton(driver);
			step++;
	    
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
			testSteps.add("Step " + step + " : 'Open External Link' ");
			step++;
			}
			else {
			    testSteps.add("Step "+step+" : Verify 'Apply' popup window display");
			    assertTrue(candidateJobSearchPage.isApplyLabelDisplay(driver)," Verified 'Apply' popup window display");
			    step++;
			    
			    testSteps.add("Step " + step + " : Text In 'Your Cover Letter' ");
				candidateDashboardPage.enterTextInYourCoverLetter(driver);
				step++;
			
			    testSteps.add("Step "+step+" : Click on 'Remove' button");
			    candidateJobSearchPage.clickOnRemoveButton(driver);
			    step++;

			    testSteps.add("Step " + step + " : Verify 'Resume' removed is display");
				assertTrue(candidateJobSearchPage.isResumeRemovedDisplay(driver),
						"Verified 'Resume' removed is display");
				step++;
				
				testSteps.add("Step " + step + " : Click on 'Submit Application' button.");
				candidateJobSearchPage.clickOnSubmitApplicationButton(driver);
				step++;
				
				testSteps.add("Step " + step + " : Verify 'Please attach a resume' popup  warning message display");
				assertTrue(candidateJobSearchPage.isPleaseAttachAResumePopupMessageDisplay(driver),
						" Verified 'Please attach a resume' popup  warning message display");
				step++;
		}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_91_VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_91_VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_91_VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_91_VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_91_VerifyThatUserIsAbleToSeeWarningMessageOnSubmittingApplicationWithoutResume", testSteps, driver);
			assertTrue(false);
		}
	}

	
}
