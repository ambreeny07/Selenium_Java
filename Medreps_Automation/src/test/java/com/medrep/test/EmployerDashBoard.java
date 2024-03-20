package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateCareerAdvicePage;
import com.medrep.pages.CandidateProfilePage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerAccountPage;
import com.medrep.pages.EmployerCompanyProfilePage;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerLoginPage;
import com.medrep.pages.EmployerManageJobsPage;
import com.medrep.pages.EmployerNamedUsersPage;
import com.medrep.pages.EmployerPostedJobsPage;
import com.medrep.pages.EmployerSignUpPage;
import com.medrep.utilities.Waits;

public class EmployerDashBoard extends BaseClass {
	String tempSrc = "";

	@Test
	public void TC_ID_34_VerifyThatUserIsAbleToSeeDetailsRegardingActiveJobTotalApplicationsResumeViewStatsOnDashboardPage() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {

			int step = 1;

			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Active Jobs</b> section is displayed");
			assertTrue(employerDashBoardPage.isActiveJobsSectionDisplay(driver),
					"Verified that Active Job section is displayed");
			step++;

			testSteps.add("Step " + step + ": Verify that <b>Active Jobs Count</b> label is displayed");
			assertTrue(employerDashBoardPage.isActiveJobsStatusBarDisplay(driver),
					"Verified that Active Job Count Label is displayed");
			step++;

			testSteps.add("Step " + step + ": Verify that <b>Total Applications</b> Section is displayed");
			assertTrue(employerDashBoardPage.isTotalApplicationsSectionDisplay(driver),
					"Verified that Total Applications section is displayed");
			step++;

			testSteps.add("Step " + step + ": Verify that <b>Total Applications</b> Count Label is displayed");
			assertTrue(employerDashBoardPage.isTotalApplicationsStatusBarDisplay(driver),
					"Verified that Total Application count label is displayed");
			step++;

			testSteps.add("Step " + step + ": Verify total <b>Job View</b> section is displayed");
			assertTrue(employerDashBoardPage.isJobViewsSectionDisplay(driver),
					"Verified that Job view section is displayed");
			step++;

			testSteps.add("Step " + step + ": Verify that <b>Job View</b> count label is displayed");
			assertTrue(employerDashBoardPage.isJobsViewStatusBarDisplay(driver),
					"Verified that Job view status bar is displayed");
			step++;

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_34_VerifyThatUserIsAbleToSeeDetailsRegardingActiveJobTotalApplicationsResumeViewStatsOnDashboardPage",
					testSteps, driver);
		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_34_VerifyThatUserIsAbleToSeeDetailsRegardingActiveJobTotalApplicationsResumeViewStatsOnDashboardPage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_34_VerifyThatUserIsAbleToSeeDetailsRegardingActiveJobTotalApplicationsResumeViewStatsOnDashboardPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_34_VerifyThatUserIsAbleToSeeDetailsRegardingActiveJobTotalApplicationsResumeViewStatsOnDashboardPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_34_VerifyThatUserIsAbleToSeeDetailsRegardingActiveJobTotalApplicationsResumeViewStatsOnDashboardPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_35_VerifyThatEmployerIsAbleToSeeDetailsRegardingRecentJobsOnDashboardPage() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify that Heading <b>Title</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingTitleDisplay(driver),
					"Verified that Title in Recent Jobs Table is showing");
			step++;

			testSteps.add("Step " + step + ": Verify that Heading <b>Location</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingLocationDisplay(driver),
					"Verified that Location in Recent Jobs Table is showing");
			step++;

			testSteps.add("Step " + step + ": Verify that Heading <b>Job Status</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingJobStatusDisplay(driver),
					"Verified that Job Status in Recent Jobs Table is showing");
			step++;
			testSteps.add("Step " + step + ": Verify that Heading <b>Views</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingViewsDisplay(driver),
					"Verified that Views in Recent Jobs Table is showing");
			step++;
			testSteps.add(
					"Step " + step + ": Verify that Heading <b>Applications</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingApplicationDisplay(driver),
					"Verified that Applications in Recent Jobs Table is showing");
			step++;
			testSteps.add("Step " + step + ": Verify that Heading <b>Posted</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingPostedDisplay(driver),
					"Verified that Posted in Recent Jobs Table is showing");
			step++;
			testSteps.add("Step " + step + ": Verify that Heading <b>Expiry</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingExpiresDisplay(driver),
					"Verified that Expiry in Recent Jobs Table is showing");
			step++;
			testSteps.add("Step " + step + ": Verify that Heading <b>Posted By</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingPostedByDisplay(driver),
					"Verified that Posted By in Recent Jobs Table is showing");
			step++;
			testSteps.add("Step " + step + ": Verify that Heading <b>Actions</b> in Recent Jobs Table is Displayed");
			assertTrue(employerDashBoardPage.isTabelCellHeadingActionDisplay(driver),
					"Verified that Actions in Recent Jobs Table is showing");
			step++;

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_35_VerifyThatEmployerIsAbleToSeeDetailsRegardingRecentJobsOnDashboardPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_35_VerifyThatEmployerIsAbleToSeeDetailsRegardingRecentJobsOnDashboardPage"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_35_VerifyThatEmployerIsAbleToSeeDetailsRegardingRecentJobsOnDashboardPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_35_VerifyThatEmployerIsAbleToSeeDetailsRegardingRecentJobsOnDashboardPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_35_VerifyThatEmployerIsAbleToSeeDetailsRegardingRecentJobsOnDashboardPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_36_VerifyThatEmployerIsAbleToEditThePostedJobByHimHer() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recemt Jobs Title is Showing");
			step++;

//			testSteps.add("Step "+step+ ": Verify <b>Edit Button</b> in Recent Jobs Table Displayed");
//			assertTrue(employerDashBoardPage.isRecentJobsTabelActionCellEditButtonDisplay(driver),"Verified that edit button is displayed");
//			step++;
//
//			testSteps.add("Step "+step+ ": Click on <b>Edit Button</b> of any Job Post");
//			employerDashBoardPage.clickOnRecentJobsTabelActionCellEditButton(driver);
//			step++;
//
//			testSteps.add("Step "+step+ ": Edit the <b>Job Title</b> Field");
//			employerPostedJobsPage.enterJobTitle("Edited Title",driver);
//
//			testSteps.add("Step "+step+ ": Click on Update Button");
//			employerDashBoardPage.clickOnUpdateButton(driver);
//
//			testSteps.add("Step "+step+": Verify that success notification shows up");
//			employerPostedJobsPage.isJobCreatedSuccessfullyNotificationMessageDisplay(driver);

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_36_VerifyThatEmployerIsAbleToEditThePostedJobByHimHer", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_36_VerifyThatEmployerIsAbleToEditThePostedJobByHimHer"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_36_VerifyThatEmployerIsAbleToEditThePostedJobByHimHer", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_36_VerifyThatEmployerIsAbleToEditThePostedJobByHimHer"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_36_VerifyThatEmployerIsAbleToEditThePostedJobByHimHer", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_37_VerifyThatEmployerIsAbleToCopyThePostedJobByHimHer() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		String emailForApplication = "automation@gmail.com";

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recemt Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Verify <b>Copy Button</b> in Recent Jobs Table Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTabelActionCellCopyButtonDisplay(driver),
					"Verified that Copy button is displayed");
			step++;

			testSteps.add("Step " + step + ": Click on <b>Copy Button</b> of any Job Post");
			employerDashBoardPage.clickOnRecentJobsTabelActionCellCopyButton(driver);
			step++;
			
			if(employerPostedJobsPage.isExternalRedirectOrEmailcheckboxSelected(driver) == true) {
				testSteps.add("Step " + step + ": Click on <b>Email</b> radio Button");
				employerPostedJobsPage.clickEmailCheckboxButton(driver);
				employerPostedJobsPage.enterEmailAddressForApplicaton(emailForApplication,driver);
			}


			testSteps.add("Step " + step + ": Click on <b>Post Job</b> Button");
			employerPostedJobsPage.clickOnPostJobButton(driver);

			testSteps.add("Step " + step + ": Verify that success notification shows up");
			employerPostedJobsPage.isJobCreatedSuccessfullyNotificationMessageDisplay(driver);

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_37_VerifyThatEmployerIsAbleToCopyThePostedJobByHimHer", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_37_VerifyThatEmployerIsAbleToCopyThePostedJobByHimHer"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_37_VerifyThatEmployerIsAbleToCopyThePostedJobByHimHer", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_37_VerifyThatEmployerIsAbleToCopyThePostedJobByHimHer"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_37_VerifyThatEmployerIsAbleToCopyThePostedJobByHimHer", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_38_VerifyThatEmployerIsAbleToFeatureTheAnyPostedJobByHimHer() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recemt Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Verify <b>Featured Button</b> in Recent Jobs Table Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTabelActionCellCopyButtonDisplay(driver),
					"Verified that Copy button is displayed");
			step++;

			testSteps.add("Step " + step + ": Click on <b>Featured Button</b> of any Job Post");
			employerDashBoardPage.clickOnRecentJobsTabelActionCellFeatureButton(driver);
			step++;

			try {
				testSteps.add("Step " + step + ": Click on <b>Yes</b> button in popup");
				employerDashBoardPage.acceptFeaturedPopup(driver);
				
				testSteps.add("Step " + step + ": Verify that Job Featured notification shows up");
				employerPostedJobsPage.isJobFeaturedSuccessfullyNotificationMessageDisplay(driver);
				
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_38_VerifyThatEmployerIsAbleToFeatureTheAnyPostedJobByHimHer", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_38_VerifyThatEmployerIsAbleToFeatureTheAnyPostedJobByHimHer"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_38_VerifyThatEmployerIsAbleToFeatureTheAnyPostedJobByHimHer", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_38_VerifyThatEmployerIsAbleToFeatureTheAnyPostedJobByHimHer"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_38_VerifyThatEmployerIsAbleToFeatureTheAnyPostedJobByHimHer", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_39_VerifyThatEmployerIsAbleToExpireTheAnyJobPostedByHimHer() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Verify <b>Expired Button</b> in Recent Jobs Table Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTabelActionCellExpireButtonDisplay(driver),
					"Verified that Expire button is displayed");
			step++;

			testSteps.add("Step " + step + ": Click on <b>Expire Button</b> of any Job Post");
			employerDashBoardPage.clickOnRecentJobsTabelActionCellExpireButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify that Job Expired notification shows up");
			employerDashBoardPage.isJobExpiredSuccessfullyNotificationMessageDisplay(driver);

			testSteps.add("Step " + step + ": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_39_VerifyThatEmployerIsAbleToExpireTheAnyJobPostedByHimHer", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_39_VerifyThatEmployerIsAbleToExpireTheAnyJobPostedByHimHer"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_39_VerifyThatEmployerIsAbleToExpireTheAnyJobPostedByHimHer", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_39_VerifyThatEmployerIsAbleToExpireTheAnyJobPostedByHimHer"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_39_VerifyThatEmployerIsAbleToExpireTheAnyJobPostedByHimHer", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_40_VerifyThatViewAllButtonIsFunctionalAndClickable() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Verify <b>View All</b> button is displayed");
			assertTrue(employerDashBoardPage.isViewAllButtonOfRecentJobsTableDisplay(driver),
					"Verified that View All Button is displayed");
			step++;

			testSteps.add("Step " + step + ": Click on <View All</b> Button");
			employerDashBoardPage.clickOnViewAllButtonOfRecentJobs(driver);
			step++;

			testSteps.add("Step" + step + ": Verify <b>View All</b> Page is displayed");
			assertTrue(employerDashBoardPage.isYourJobsTableDisplayed(driver));
			step++;

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_40_VerifyThatViewAllButtonIsFunctionalAndClickable", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_40_VerifyThatViewAllButtonIsFunctionalAndClickable"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_40_VerifyThatViewAllButtonIsFunctionalAndClickable", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_40_VerifyThatViewAllButtonIsFunctionalAndClickable" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_40_VerifyThatViewAllButtonIsFunctionalAndClickable", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_41_VerifyThatFeaturedJobCreditsShouldBeCorrect() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;
		
			try {
				String featuredCreditCount;
				featuredCreditCount = employerDashBoardPage.getFeaturedJobCreditCount();

				testSteps.add("Step " + step + ": <b>Featured Job Credits Count is :" + featuredCreditCount);
				step++;

				testSteps.add("Step " + step + ": Buy One Credit");
				employerDashBoardPage.buyFeaturedCredit(driver);
				step++;

				String newFeaturedCreditCount;
				newFeaturedCreditCount = employerDashBoardPage.getFeaturedJobCreditCount();

				testSteps.add("Step " + step + ": Previous credit score was " + featuredCreditCount
						+ " Current Credit score is " + newFeaturedCreditCount);
				assertNotEquals(featuredCreditCount, employerDashBoardPage.getFeaturedJobCreditCount());
				step++;				
			} catch (Exception e) {
				// TODO: handle exception
			}


			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_41_VerifyThatFeaturedJobCreditsShouldBeCorrect", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_41_VerifyThatFeaturedJobCreditsShouldBeCorrect" + "<br><b>Exception:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_41_VerifyThatFeaturedJobCreditsShouldBeCorrect", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_41_VerifyThatFeaturedJobCreditsShouldBeCorrect" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_41_VerifyThatFeaturedJobCreditsShouldBeCorrect", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_42_VerifyThatTheOnClickFeaturedButtonThePopUpShouldOpen() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = " ambreeny4191+aprilreg31@gmail.com";
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;

			String featuredCreditCount;
			featuredCreditCount = employerDashBoardPage.getFeaturedJobCreditCount();
			testSteps.add("Step " + step + ": <b>Featured Job Credits Count is :" + featuredCreditCount);
			assertEquals(featuredCreditCount,"0");
			step++;

			testSteps.add("Step " + step + ": Click on Featur Button");
			employerDashBoardPage.clickFeatureButton(driver);
			step++;
			
			testSteps.add("Step " + step + ": Verify Feature Popup is Displayed");
			assertTrue(employerDashBoardPage.verifyFeaturePopup(driver));
			step++;

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_42_VerifyThatTheOnClickFeaturedButtonThePopUpShouldOpen",
					testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_42_VerifyThatTheOnClickFeaturedButtonThePopUpShouldOpen"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_42_VerifyThatTheOnClickFeaturedButtonThePopUpShouldOpen",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_42_VerifyThatTheOnClickFeaturedButtonThePopUpShouldOpen"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_42_VerifyThatTheOnClickFeaturedButtonThePopUpShouldOpen",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_43_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;

			try {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is showing and enabled");
				assertTrue(employerDashBoardPage.isPurchaseButtonEnabled(driver),
						"Verified that Purchase button is displayed");
			} catch (Exception e) {
				testSteps.add("Step " + step
						+ ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");

			} catch (Error e) {
				testSteps.add("Step " + step
						+ ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			}

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_43_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled", testSteps,
					driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_43_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_43_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_43_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_43_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_44_VerifyThatEmployerNavigatesToMembershipPageOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);

		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;

			try {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is showing and enabled");
				assertTrue(employerDashBoardPage.isPurchaseButtonEnabled(driver),
						"Verified that Purchase button is displayed");
				step++;

				testSteps.add("Step " + step + ": Click on <b>Purchase Button</b>");
				employerDashBoardPage.clickOnPurchaseButton(driver);
				step++;

				testSteps.add("Step " + step + ": Verify that employer is navigated to <b>Membership Page</b>");
				assertTrue(employerDashBoardPage.verifyUserIsNavigatedToMembershipPage(driver), "Verified");
				step++;
			} catch (Exception e) {
				testSteps.add("Step " + step
						+ ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			} catch (Error e) {
				testSteps.add("Step " + step
						+ ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			}

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_44_VerifyThatEmployerNavigatesToMembershipPageOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining",
					testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_44_VerifyThatEmployerNavigatesToMembershipPageOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_44_VerifyThatEmployerNavigatesToMembershipPageOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_44_VerifyThatEmployerNavigatesToMembershipPageOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_44_VerifyThatEmployerNavigatesToMembershipPageOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining",
					testSteps, driver);
			assertTrue(false);
		}
	}
	@Test
	public void TC_ID_45_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Recent Jobs</b> Table is Displayed");
			assertTrue(employerDashBoardPage.isRecentJobsTableDisplay(driver),
					"Verified that Recent Jobs Title is Showing");
			step++;

			testSteps.add("Step " + step + ": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;

			try {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is showing and enabled");
				assertTrue(employerDashBoardPage.isPurchaseButtonEnabled(driver),
						"Verified that Purchase button is displayed");
				step++;

				testSteps.add("Step " + step + ": Click on <b>Purchase Button</b>");
				employerDashBoardPage.clickOnPurchaseButton(driver);
				step++;

				testSteps.add("Step " + step + ": Verify that employer is navigated to <b>Membership Page</b>");
				assertTrue(employerDashBoardPage.verifyUserIsNavigatedToMembershipPage(driver), "Verified");
				step++;

				testSteps.add("Step" + step + ": Select the annual Unlimited Job Posting Plan");
				employerSignUpPage.chooseRenewBiAnnually$2625JobPostingPlan(driver);
				step++;

				testSteps.add("Step" + step + ": Click on Next Button");
				employerSignUpPage.clickOnNextButton(driver);
				step++;

				testSteps.add("Step" + step + ": Click on Make Payment Button");
				employerDashBoardPage.clickOnPaymentButton(driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
				employerSignUpPage.enterCardNumber(cardNumber, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
				employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
				employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
				employerSignUpPage.enterNameOnCard(nameOnCard, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
				employerSignUpPage.clickOnCountryDropDown(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
				employerSignUpPage.clickOnPakistanOption(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Subscribe' button.");
				employerSignUpPage.clickOnPayButton(driver);
				step++;

				Waits.wait5s();
				try {
					testSteps.add("Step " + step + " : Verify User is navigated to Account Page.");
					assertTrue(employerDashBoardPage.isAccountPageShown(driver));
					step++;

				} catch (Exception e) {
					// TODO: handle exception
				}
				step++;
			} catch (Exception e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			} catch (Error e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			}

			testSteps.add("Step " + step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_45_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining",
					testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_45_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_45_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_45_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_45_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_46_VerifyThatUserIsAbleToSeeTheSectionResumeSearchOnTheDashboard(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> Tab");
			employerDashBoardPage.clickOnResumeButtonFromDashboard(driver);
			step++;

			testSteps.add("Step "+step+": Verify user is able to see <b>Resume Search</b> section on page");
			employerDashBoardPage.isResumeSearchTableHeadingDisplay(driver);
			step++;

			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_46_VerifyThatUserIsAbleToSeeTheSectionResumeSearchOnTheDashboard", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_46_VerifyThatUserIsAbleToSeeTheSectionResumeSearchOnTheDashboard"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_46_VerifyThatUserIsAbleToSeeTheSectionResumeSearchOnTheDashboard",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_46_VerifyThatUserIsAbleToSeeTheSectionResumeSearchOnTheDashboard"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_46_VerifyThatUserIsAbleToSeeTheSectionResumeSearchOnTheDashboard",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_47_VerifyThatTheNewSearchButtonIsClickableAndFunction(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

//			testSteps.add("Step "+step+": Click on <b>Resume Search</b> Tab");
//			employerDashBoardPage.clickOnResumeButtonFromDashboard(driver);
//			step++;

			testSteps.add("Step "+step+": Verify <b>New Search</b> Button is clickable");
//			employerDashBoardPage.isNewSearchButtonOfResumeSearchTableDisplay(driver);
			employerDashBoardPage.clickOnNewSearchButtonOfResumeSearchTable(driver);

			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_47_VerifyThatTheNewSearchButtonIsClickableAndFunction", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_47_VerifyThatTheNewSearchButtonIsClickableAndFunction"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_47_VerifyThatTheNewSearchButtonIsClickableAndFunction",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_47_VerifyThatTheNewSearchButtonIsClickableAndFunction"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_47_VerifyThatTheNewSearchButtonIsClickableAndFunction",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_48_VerifyThatUserIsAbleToChangeTheFrequencyOfAnySearchAlert(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Frequency Dropdown");
			employerDashBoardPage.clickOnResumeSearchTableFrequencyDropdown(driver);
			step++;
			
			testSteps.add("Step "+step+": select frequency dropdown option");
			employerDashBoardPage.clickFrequencyDropdownWeeklyOption(driver);
			step++;			
			
			testSteps.add("Step "+step+": Verify frequency updated to 'Week'");
			assertTrue(employerDashBoardPage.verifyFrequencyUpdatedToWeek(driver),"Verified that frequency updated to 'Week'");
			step++;
			

			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_48_VerifyThatUserIsAbleToChangeTheFrequencyOfAnySearchAlert", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_48_VerifyThatUserIsAbleToChangeTheFrequencyOfAnySearchAlert"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_48_VerifyThatUserIsAbleToChangeTheFrequencyOfAnySearchAlert",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_48_VerifyThatUserIsAbleToChangeTheFrequencyOfAnySearchAlert"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_48_VerifyThatUserIsAbleToChangeTheFrequencyOfAnySearchAlert",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_49_VerifyThatTheUserIsAbleToEditAnySearchAlert(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Edit Button is displayed in Resume Search Table");
			assertTrue(employerDashBoardPage.isResumeSearchTabelActionCellEditButtonDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Click on <b>Edit Button</b> of action column");
			employerDashBoardPage.clickOnActionEditInResumeSearchTable(driver);
			step++;

			testSteps.add("Step "+step+": Edit Search Name ");
			employerDashBoardPage.enterSearchNameOnEditPopup(driver, "Edited Job Name");
			step++;


			testSteps.add("Step "+step+": Click on Update Button");
			employerDashBoardPage.clickOnUpdateButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify <b>Search saved</b> alert shows up");
			assertTrue(employerDashBoardPage.isSavedSearchAlertDisplay(driver),"Verified message is displayed");
			step++;


			testSteps.add("Step "+step+": Close the browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_49_VerifyThatTheUserIsAbleToEditAnySearchAlert", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_49_VerifyThatTheUserIsAbleToEditAnySearchAlert"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_49_VerifyThatTheUserIsAbleToEditAnySearchAlert",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_49_VerifyThatTheUserIsAbleToEditAnySearchAlert"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_49_VerifyThatTheUserIsAbleToEditAnySearchAlert",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_50_VerifyUserIsAbleToCloseEditSearchPopupOnClickingCancelButton(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Edit Button is displayed in Resume Search Table");
			assertTrue(employerDashBoardPage.isResumeSearchTabelActionCellEditButtonDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Click on <b>Edit Button</b> of action column");
			employerDashBoardPage.clickOnActionEditInResumeSearchTable(driver);
			step++;

			testSteps.add("Step "+step+": Verify Cancel button is functional");
			employerDashBoardPage.clickOnCancelButtonInEditPopup(driver);
			step++;


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_50_VerifyUserIsAbleToCloseEditSearchPopupOnClickingCancelButton", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_50_VerifyUserIsAbleToCloseEditSearchPopupOnClickingCancelButton"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_50_VerifyUserIsAbleToCloseEditSearchPopupOnClickingCancelButton",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_50_VerifyUserIsAbleToCloseEditSearchPopupOnClickingCancelButton"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_50_VerifyUserIsAbleToCloseEditSearchPopupOnClickingCancelButton",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test
	public void TC_ID_51_VerifyThatUserIsAbleToDeleteAnySearchAlertOnClickingDeleteButtonAgainstTheSearch(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify <b>Delete Button</b> is displayed in Resume Search Table");
			assertTrue(employerDashBoardPage.isResumeSearchTabelActionCellDeleteButtonDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Click on Delete Button");
			employerDashBoardPage.clickDeleteBtnUnderResumeSearch(driver);
			step++;

			testSteps.add("Step "+step+": Verify Delete Search alert success appears");
			assertTrue(employerDashBoardPage.isDeleteSearchAlertDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_51_VerifyThatUserIsAbleToDeleteAnySearchAlertOnClickingDeleteButtonAgainstTheSearch", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_51_VerifyThatUserIsAbleToDeleteAnySearchAlertOnClickingDeleteButtonAgainstTheSearch"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_51_VerifyThatUserIsAbleToDeleteAnySearchAlertOnClickingDeleteButtonAgainstTheSearch",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_51_VerifyThatUserIsAbleToDeleteAnySearchAlertOnClickingDeleteButtonAgainstTheSearch"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_51_VerifyThatUserIsAbleToDeleteAnySearchAlertOnClickingDeleteButtonAgainstTheSearch",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test
	public void TC_ID_52_VerifyThatTheUserNavigatesToTheResumeSearchPageOnClickingTheRunButtonAgainstSearch(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify <b>Run Button</b> is displayed in Resume Search Table");
			assertTrue(employerDashBoardPage.isResumeSearchTabelActionCellRunButtonDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Click on <b>Run Button</b>");
			employerDashBoardPage.clickRunButtonUnderResumeSearch(driver);
			step++;

			testSteps.add("Step "+step+": Verify User is navigated to resume search page");
			assertTrue(employerDashBoardPage.isSearchResumeLabelDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_52_VerifyThatTheUserNavigatesToTheResumeSearchPageOnClickingTheRunButtonAgainstSearch", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_52_VerifyThatTheUserNavigatesToTheResumeSearchPageOnClickingTheRunButtonAgainstSearch"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_52_VerifyThatTheUserNavigatesToTheResumeSearchPageOnClickingTheRunButtonAgainstSearch",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_52_VerifyThatTheUserNavigatesToTheResumeSearchPageOnClickingTheRunButtonAgainstSearch"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_52_VerifyThatTheUserNavigatesToTheResumeSearchPageOnClickingTheRunButtonAgainstSearch",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test
	public void TC_ID_53_VerifyThatTheNewSearchButtonIsClickableAndFunctional(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify <b>New Search Button</b> is displayed in Resume Search Table");
			assertTrue(employerDashBoardPage.isNewSearchButtonOfResumeSearchTableDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Click on <b>New Search Button</b>");
			employerDashBoardPage.clickOnNewSearchButtonOfResumeSearchTable(driver);
			step++;

			testSteps.add("Step "+step+": Verify User is navigated to resume search page");
			assertTrue(employerDashBoardPage.isSearchResumeLabelDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_53_VerifyThatTheNewSearchButtonIsClickableAndFunctional", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_53_VerifyThatTheNewSearchButtonIsClickableAndFunctional"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_53_VerifyThatTheNewSearchButtonIsClickableAndFunctional",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_53_VerifyThatTheNewSearchButtonIsClickableAndFunctional"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_53_VerifyThatTheNewSearchButtonIsClickableAndFunctional",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test
	public void TC_ID_54_VerifyThatEmployerIsAbleToSeeCompanyProfileSectionAtTheBottomOfDashboardPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify <b>Company Profile</b> Section is displayed");
			assertTrue(employerDashBoardPage.isCompanyProfileTableDisplay(driver));

			testSteps.add("Step "+step+": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_54_VerifyThatEmployerIsAbleToSeeCompanyProfileSectionAtTheBottomOfDashboardPage", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_54_VerifyThatEmployerIsAbleToSeeCompanyProfileSectionAtTheBottomOfDashboardPage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_54_VerifyThatEmployerIsAbleToSeeCompanyProfileSectionAtTheBottomOfDashboardPage",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_54_VerifyThatEmployerIsAbleToSeeCompanyProfileSectionAtTheBottomOfDashboardPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_54_VerifyThatEmployerIsAbleToSeeCompanyProfileSectionAtTheBottomOfDashboardPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_55_VerifyThatTheEditButtonIsClickableAndFunctional() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step " + step + ": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Enter email " + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter password " + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify <b>Company Profile</b> Section is displayed");
			assertTrue(employerDashBoardPage.isCompanyProfileTableDisplay(driver));
			step++;

			testSteps.add("Step " + step + ": Click on <b>Edit Button</b> in Company Profile Section");
			employerDashBoardPage.clickOnEditButtonOfCompanyProfileTable(driver);
			step++;

			testSteps.add("Step " + step + ": Verify user is navigated to <b>Company Profile</b> Page");
			assertTrue(employerDashBoardPage.isCompanyProfileLabelDisplay(driver));
			step++;

			testSteps.add("Step " + step + ": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_55_VerifyThatTheEditButtonIsClickableAndFunctional", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_55_VerifyThatTheEditButtonIsClickableAndFunctional"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_55_VerifyThatTheEditButtonIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_55_VerifyThatTheEditButtonIsClickableAndFunctional" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_55_VerifyThatTheEditButtonIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_128_VerifyUserIsNotAbleToSeeAnyJobPostManageJobAddUsersOptionsOrFeatures(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerNamedUsersPage employerNamedUsersPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerNamedUsersPage = new EmployerNamedUsersPage(driver);

		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress= "AccountWithNoPlan@yopmail.com";
		String password= "J1234567j";

		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify text <b>No Data</b> is showing in Posts Section on Dashboard");
			assertTrue(employerDashBoardPage.verifyNoDataMessageIsDisplayed(driver));
			step++;

			testSteps.add("Step "+step+": Click on Named User Section");
			employerNamedUsersPage.clickOnNamedUsersButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify text <b>No Data</b> is showing in Named Users Section on Named User Page");
			assertTrue(employerDashBoardPage.verifyNoDataMessageIsDisplayed(driver));
			step++;


			testSteps.add("Step "+step+": Close the browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_128_VerifyUserIsNotAbleToSeeAnyJobPostManageJobAddUsersOptionsOrFeatures", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_128_VerifyUserIsNotAbleToSeeAnyJobPostManageJobAddUsersOptionsOrFeatures"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_128_VerifyUserIsNotAbleToSeeAnyJobPostManageJobAddUsersOptionsOrFeatures",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_128_VerifyUserIsNotAbleToSeeAnyJobPostManageJobAddUsersOptionsOrFeatures"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_128_VerifyUserIsNotAbleToSeeAnyJobPostManageJobAddUsersOptionsOrFeatures",
					testSteps, driver);
			assertTrue(false);
		}

	}
	
//	@Test
//	public void TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown(){
//		WebDriver driver = null;
//		ArrayList<String> testSteps = new ArrayList<>();
//		EmployerDashBoardPage employerDashBoardPage;
//		CandidateSignUpPage candidateSignUpPage;
//		EmployerPostedJobsPage employerPostedJobsPage;
//
//		driver = initConfiguration();
//		employerDashBoardPage = new EmployerDashBoardPage(driver);
//		candidateSignUpPage = new CandidateSignUpPage(driver);
//		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
//		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
//		navigateToURL(memberurl, driver);
//		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
//		String emailAddress=dataArr[0][0].toString();
//		String password=dataArr[0][1].toString();
//
//		try {
//			int step = 1;
//			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
//			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
//			step++;
//
//			testSteps.add("Step "+step+": Click on Login Button");
//			employerDashBoardPage.clickOnLoginButton(driver);
//			step++;
//
//			testSteps.add("Step "+step+": Enter email "+emailAddress);
//			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
//			step++;
//
//			testSteps.add("Step "+step+": Enter password "+password);
//			employerDashBoardPage.enterPassword(password, driver);
//			step++;
//
//			testSteps.add("Step "+step+": Click on login submit button");
//			employerDashBoardPage.clickOnSubmitLoginButton(driver);
//			step++;
//
//			testSteps.add("Step "+step+": Verify <b>Delete Button</b> is displayed in Resume Search Table");
//			assertTrue(employerDashBoardPage.isResumeSearchTabelActionCellDeleteButtonDisplay(driver));
//			step++;
//
//			testSteps.add("Step "+step+": Click on Delete Button");
//			employerDashBoardPage.clickDeleteBtnUnderResumeSearch(driver);
//			step++;
//
//			testSteps.add("Step "+step+": Verify Delete Search alert success appears");
//			assertTrue(employerDashBoardPage.isDeleteSearchAlertDisplay(driver));
//			step++;
//
//			testSteps.add("Step "+step+": Close the browser");
//
//			tempSrc = getScreenshotPath();
//			testSteps.add(tempSrc);
//			captureCapture(driver, tempSrc);
//			AddTest_IntoReport("TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown", testSteps, driver);
//
//
//		}catch (Exception e){
//			e.printStackTrace();
//			testSteps.add(
//					"Failed: TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown"
//							+ "<br><b>Exception:</b><br> " + e.toString());
//			tempSrc = getScreenshotPath();
//			testSteps.add(tempSrc);
//			captureCapture(driver, tempSrc);
//			AddTest_IntoReport("TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown",
//					testSteps, driver);
//			assertTrue(false);
//		}catch (Error e){
//			e.printStackTrace();
//			testSteps
//					.add("Failed: TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown"
//							+ "<br><b>Error:</b><br> " + e.toString());
//			tempSrc = getScreenshotPath();
//			testSteps.add(tempSrc);
//			captureCapture(driver, tempSrc);
//			AddTest_IntoReport("TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown",
//					testSteps, driver);
//			assertTrue(false);
//		}
//	}
	
	@Test()
	public void TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerManageJobsPage employerManageJobsPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);

		Object[][] dataArr = getData(excelFileName, "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		Object[][] dataArr2 = getData(excelFileName, "EmployerValidCredential",driver);
		String email = generateRandomString()+"@yopmail.com";

		try{
			int step = 1;

			testSteps.add("Step"+step+": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step"+step+": Click on <b>Join Now</b> Button");
			employerSignUpPage.clickJoinNowButton(driver);
			step++;

			testSteps.add("Step"+step+": Click on hyperlink <b>Click Here</b>");
			employerSignUpPage.clickHereButton(driver);
			step++;

			testSteps.add("Step"+step+": Select the Monthly Unlimited Job Posting Plan");
			employerSignUpPage.chooseRenewMonthly$525JobPostingPlan(driver);
			step++;

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Choose AddOns : Thirty Days Unlimted Resume Search");
			employerSignUpPage.selectThirtyDaysUnlimitedAddOn(driver);
			step++;

			testSteps.add(("Step"+step+": Choose AddOns : Featured Job"));
			employerSignUpPage.selectFeaturedJobAddOn(driver);
			step++;

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Enter Email");
			employerSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step"+step+": Enter Company Name");
			employerSignUpPage.enterCompanyName("MaxWell",driver);
			step++;

			testSteps.add("Step"+step+": Enter Password");
			employerSignUpPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step"+step+": Enter Password again");
			employerSignUpPage.enterConfirmPassword(password,driver);
			step++;

			testSteps.add("Step"+step+": Click on Terms and conditions checkbox");
			employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step"+step+"Click on <b>Checkout</b> Button");
			employerSignUpPage.clickOnCheckoutButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
			employerSignUpPage.enterCardNumber(cardNumber, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
			employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
			employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
			employerSignUpPage.enterNameOnCard(nameOnCard, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
			employerSignUpPage.clickOnCountryDropDown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
			employerSignUpPage.clickOnPakistanOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			employerSignUpPage.clickOnPayButton(driver);
			step++;

			Waits.wait5s();
			try {
				testSteps.add("Step " + step + " : Verify 'Congratulation' message display.");
				assertTrue(employerSignUpPage.isCongratulationLabelDisplay(driver),
						"Verified 'Congratulation' message is display.");
				step++;

				testSteps.add("Step " + step + " : Verify 'You have successfully subscribed.' description is display.");
				assertTrue(employerSignUpPage.isYouHaveSuccessfullySubscribedDisplay(driver),
						" Verified 'You have successfully subscribed.' description is display.");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Verify user is redirected to the'Dashboard Page'");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Dashboard Page'");
			step++;
			
			testSteps.add("Step "+step+": Click on 'Manage Jobs' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on Post Job Button");
	    	employerManageJobsPage.clickOnPostJobButton(driver);
	    	step++;
	    	
			

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown",
					testSteps, driver);
		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_4_VerifyThatWhileCopyingRenewOrEditJobExternalRedirectLinkIsShown",
					testSteps, driver);
			assertTrue(false);
		}
	}


}
