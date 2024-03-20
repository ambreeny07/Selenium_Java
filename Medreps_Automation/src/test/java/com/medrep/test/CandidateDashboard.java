package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateDashboardPage;
import com.medrep.pages.CandidateJobSearchPage;
import com.medrep.utilities.Waits;

public class CandidateDashboard extends BaseClass {

	String tempSrc = "";

	@Test()
	public void TC_ID_111_VerifyThatUserIsAbleToLandOnDashboardAfterLoginWithValidCrednetials() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
				Waits.wait3s();
			}

			try {
				testSteps.add("Step " + step + " : Click on 'Dashboard' button");
				candidateDashboardPage.clickOnDashboardButton(driver);
				step++;

				String strUrl = "https:uat.medreps.com/member-dashboard/";
				testSteps.add("Step " + step
						+ " : Verify user land on 'https:devicespace.com/member-dashboard/' page successfully");
				assertTrue(candidateDashboardPage.getCurrentUrlAfterClickingDashboardButton(driver, strUrl),
						"Verified  user landed on 'https:devicespace.com/member-dashboard/' page successfully");
				step++;
			} catch (Error e) {
				testSteps.add("Step " + step + " : Verify user land on 'Dashboard' page successfully");
				assertTrue(candidateDashboardPage.verifyDashBoardHeaderIsDisplaying(driver),
						"Verified  user landed on 'Dashboard' page successfully");
				step++;
			}
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_111_VerifyThatUserIsAbleToLandOnDashboardAfterLoginWithValidCrednetials",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_111_VerifyThatUserIsAbleToLandOnDashboardAfterLoginWithValidCrednetials "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_111_VerifyThatUserIsAbleToLandOnDashboardAfterLoginWithValidCrednetials",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_111_VerifyThatUserIsAbleToLandOnDashboardAfterLoginWithValidCrednetials"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_111_VerifyThatUserIsAbleToLandOnDashboardAfterLoginWithValidCrednetials",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_112_VerifyThatUserCanEditProfileByClickingOnEditButtonFromTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			Waits.wait3s();

			testSteps.add("Step " + step + " : Click on 'Edit Profile' button");
			candidateDashboardPage.clickEditProfileBtnOnDashboard(driver);
			step++;

			testSteps.add("Step " + step + " : Change the 'Last Name'");
			candidateDashboardPage.enterLastNameOnProfilePage(driver);
			step++;

			testSteps.add("Step " + step + " : Change the 'General Experience'");
			candidateDashboardPage.enterGenExpOnProfilePage(driver);
			step++;

			testSteps.add("Step " + step + " : Change the 'Medical Experience'");
			candidateDashboardPage.enterMedExpOnProfilePage(driver);
			step++;

			testSteps.add("Step " + step + " :Click on 'Save' button");
			candidateDashboardPage.clickSaveBtnOnProfileEditPage(driver);
			step++;

			try {
				testSteps.add("Step " + step + " : Verify 'Updated Successfully' message displayed");
				assertTrue(candidateDashboardPage.verifyDataUpdatedSuccessfully(driver),
						"Verified 'Updated Successfully' message displayed");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			} catch (Error e) {

			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_112_VerifyThatUserCanEditProfileByClickingOnEditButtonFromTheDashboard",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_112_VerifyThatUserCanEditProfileByClickingOnEditButtonFromTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_112_VerifyThatUserCanEditProfileByClickingOnEditButtonFromTheDashboard",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_112_VerifyThatUserCanEditProfileByClickingOnEditButtonFromTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_112_VerifyThatUserCanEditProfileByClickingOnEditButtonFromTheDashboard",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_113_VerifyThatUserCanApplyForAJobFromYourJobsSectionOnTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

//			testSteps.add("Step " + step + " : Click On 'job Save' button");
//			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
//			candidateDashboardPage.clickOnDashboardButton(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'View All' button");
//			candidateDashboardPage.clickOnViewAllButon(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Click On 'Apply Now' button");
//			candidateDashboardPage.clickApplyNowButton(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : 'Upload Resume' ");
//			candidateDashboardPage.uploadResumeInput(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Click on 'Submit Application' button");
//			candidateDashboardPage.clickSubmitApplicationBtn(driver);
//			step++;
//
//			waitTime(2000);
//			testSteps.add(
//					"Step " + step + " : Verify <b>'You've successfully submitted your application.'</b> message");
//			assertTrue(candidateDashboardPage.verifySucessMessageIsDisplaying(driver),
//					"Verified <b>'You've successfully submitted your application.'</b> message>");
//			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_113_VerifyThatUserCanApplyForAJobFromYourJobsSectionOnTheDashboard", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_113_VerifyThatUserCanApplyForAJobFromYourJobsSectionOnTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_113_VerifyThatUserCanApplyForAJobFromYourJobsSectionOnTheDashboard", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_113_VerifyThatUserCanApplyForAJobFromYourJobsSectionOnTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_113_VerifyThatUserCanApplyForAJobFromYourJobsSectionOnTheDashboard", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_115_VerifyUserIsAbleToSeeAllSavedJobsByClickingOnViewAllButtonAvailableUnderTheYourJobsSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Click on 'View All' button");
			candidateDashboardPage.clickYourJobViewAllButton(driver);
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Verify user is able to see 'Saved Job' is display");
			assertTrue(candidateDashboardPage.isSavedJobDisplay(driver),
					"Verified user is able to see 'Saved Job' is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_115_VerifyUserIsAbleToSeeAllSavedJobsByClickingOnViewAllButtonAvailableUnderTheYourJobsSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_115_VerifyUserIsAbleToSeeAllSavedJobsByClickingOnViewAllButtonAvailableUnderTheYourJobsSection "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_115_VerifyUserIsAbleToSeeAllSavedJobsByClickingOnViewAllButtonAvailableUnderTheYourJobsSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_115_VerifyUserIsAbleToSeeAllSavedJobsByClickingOnViewAllButtonAvailableUnderTheYourJobsSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_115_VerifyUserIsAbleToSeeAllSavedJobsByClickingOnViewAllButtonAvailableUnderTheYourJobsSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_116_VerifyUserIsAbleToApplyForAJobFromViewAllJobPageByClickingOnApplyNowButton() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;
			try {
				testSteps.add("Step " + step + " : Click On 'job Save' button");
				candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Dashboard' button");
				candidateDashboardPage.clickOnDashboardButton(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'View All' button");
				candidateDashboardPage.clickOnViewAllButon(driver);
				step++;

				testSteps.add("Step " + step + " : Click On 'Apply Now' button");
				candidateDashboardPage.clickApplyNowButton(driver);
				step++;

				testSteps.add("Step " + step + " : Text In 'Your Cover Letter' ");
				candidateDashboardPage.enterTextInYourCoverLetter(driver);
				step++;

				testSteps.add("Step " + step + " : 'Upload Resume' ");
				candidateDashboardPage.uploadResumeInput(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Application' button");
				candidateDashboardPage.clickSubmitApplicationBtn(driver);
				step++;

				waitTime(2000);
				testSteps.add(
						"Step " + step + " : Verify <b>'You've successfully submitted your application.'</b> message");
				assertTrue(candidateDashboardPage.verifySucessMessageIsDisplaying(driver),
						"Verified <b>'You've successfully submitted your application.'</b> message>");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_116_VerifyUserIsAbleToApplyForAJobFromViewAllJobPageByClickingOnApplyNowButton",
					testSteps, driver);

		} catch (Exception e) {
			testSteps
					.add("Failed: TC_ID_116_VerifyUserIsAbleToApplyForAJobFromViewAllJobPageByClickingOnApplyNowButton "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_116_VerifyUserIsAbleToApplyForAJobFromViewAllJobPageByClickingOnApplyNowButton",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_116_VerifyUserIsAbleToApplyForAJobFromViewAllJobPageByClickingOnApplyNowButton"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_116_VerifyUserIsAbleToApplyForAJobFromViewAllJobPageByClickingOnApplyNowButton",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_117_VerifyUserIsAbleToUnsaveTheJobFromYourJobsSectionOnTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

//			testSteps.add("Step " + step + " : Click On 'job Save' button");
//			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
//			candidateDashboardPage.clickOnDashboardButton(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'Unsave' button");
//			candidateDashboardPage.clickOnUnsaveButton(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Verify <b>'Job Removed From the List'</b> is display");
//			assertTrue(candidateDashboardPage.isJobRemovedFromListDisplay(driver),
//					"Verified <b>'Job Removed From the List'</b> is display");
//			step++;
//
//			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_117_VerifyUserIsAbleToUnsaveTheJobFromYourJobsSectionOnTheDashboard", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_117_VerifyUserIsAbleToUnsaveTheJobFromYourJobsSectionOnTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_117_VerifyUserIsAbleToUnsaveTheJobFromYourJobsSectionOnTheDashboard", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_117_VerifyUserIsAbleToUnsaveTheJobFromYourJobsSectionOnTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_117_VerifyUserIsAbleToUnsaveTheJobFromYourJobsSectionOnTheDashboard", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_122_VerifyThatUserCanGetTheExactResultAgainstLocationCompanyExpiryDateDateAppliedFilters() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Click on 'View All' button");
			candidateDashboardPage.clickOnViewAllButtonOnJobHistory(driver);
			step++;

			testSteps.add(
					"Step " + step + " : Verify user is able to see 'Jobs List' on application history 'View All' tab");
			assertTrue(candidateDashboardPage.verifyApplicationsInJobHistoryViewAllTabAreDisplaying(driver),
					"Verified user is able to see 'Jobs List' on application history 'View All' tab");
			step++;

			String title = "Title";
			testSteps.add("Step " + step + " : Click on 'Sort By Title' button");
			candidateDashboardPage.clickSortingOnApplicationHistory(title, driver);
			step++;

			ArrayList<String> rawTitleList = candidateDashboardPage.jobTitle(driver);
			ArrayList<String> TitleListFromWeb = rawTitleList;
			testSteps.add("Step " + step + " : <b>Verify job list by 'Title' sorted alphabetically</b>");
			assertEquals(rawTitleList, getSortedList(TitleListFromWeb), "List not sorted alphabetically");
			step++;

			String location = "Location";
			testSteps.add("Step " + step + " : Click on 'Sort By Location' button");
			candidateDashboardPage.clickSortingOnApplicationHistory(location, driver);
			step++;

			ArrayList<String> rawLocationList = candidateDashboardPage.jobLocation(driver);
			ArrayList<String> LocationlistFromWeb = rawLocationList;
			testSteps.add("Step " + step + " : <b>Verify job list by 'Location' sorted alphabetically</b>");
			assertEquals(rawLocationList, getSortedList(LocationlistFromWeb), "List not sorted alphabetically");
			step++;

			String comp = "Company";
			testSteps.add("Step " + step + " : Click on 'Sort By Company' button");
			candidateDashboardPage.clickSortingOnApplicationHistory(comp, driver);
			step++;

			ArrayList<String> rawCompanyList = candidateDashboardPage.jobCompany(driver);
			ArrayList<String> CompanylistFromWeb = rawCompanyList;
			testSteps.add("Step " + step + " : <b>Verify job list by 'Company' sorted alphabetically</b>");
			assertEquals(rawCompanyList, getSortedList(CompanylistFromWeb), "List not sorted alphabetically");
			step++;

			Waits.wait1s();
			String expiry = "Expiry Date";
			testSteps.add("Step " + step + " : Click on 'Sort By Expiry Date' button");
			candidateDashboardPage.clickSortingOnApplicationHistory(expiry, driver);
			step++;

			ArrayList<String> sortedExpiryDateList = getSortedDate(candidateDashboardPage.jobExpiryDate(driver));
			ArrayList<String> rawExpiryDateList = (candidateDashboardPage.jobExpiryDate(driver));

			testSteps.add("Step " + step + " : <b>Verify job list by 'Expiry Date' sorted in ascending order</b>");
			assertEquals(rawExpiryDateList, (sortedExpiryDateList), "List not sorted in ascending order");
			step++;

			Waits.wait1s();
			String applied = "Date Applied";
			testSteps.add("Step " + step + " : Click on 'Sort By Date Applied' button");
			candidateDashboardPage.clickSortingOnApplicationHistory(applied, driver);
			step++;

			ArrayList<String> rawAppliedDateList = candidateDashboardPage.jobAppliedDate(driver);
			ArrayList<String> sortedAppliedDateList = getSortedDate(candidateDashboardPage.jobAppliedDate(driver));
			testSteps.add("Step " + step + " : <b>Verify job list by 'Date Applied' sorted in ascending order</b>");
			assertEquals(rawAppliedDateList, sortedAppliedDateList, "List not sorted in ascending order");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_122_VerifyThatUserCanGetTheExactResultAgainstLocationCompanyExpiryDateDateAppliedFilters",
					testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_122_VerifyThatUserCanGetTheExactResultAgainstLocationCompanyExpiryDateDateAppliedFilters "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_122_VerifyThatUserCanGetTheExactResultAgainstLocationCompanyExpiryDateDateAppliedFilterss",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_122_VerifyThatUserCanGetTheExactResultAgainstLocationCompanyExpiryDateDateAppliedFilters"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_122_VerifyThatUserCanGetTheExactResultAgainstLocationCompanyExpiryDateDateAppliedFilters",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_123_VerifyThatUserCanGetTheExactResultAgainstAllLastMonthLastThreeMonthsLastSixMonthsFilters() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			Waits.wait3s();

			testSteps.add("Step " + step + " : Click on 'View All' button");
			candidateDashboardPage.clickOnViewAllButtonOnJobHistory(driver);
			step++;

			testSteps.add(
					"Step " + step + " : Verify user is able to see 'Jobs List' on application history 'View All' tab");
			assertTrue(candidateDashboardPage.verifyApplicationsInJobHistoryViewAllTabAreDisplaying(driver),
					"Verified user is able to see 'Jobs List' on application history 'View All' tab");
			step++;

			String lastMonth = "Last Month";
			testSteps.add("Step " + step + " : Click on 'Sort By Last Month' button");
			candidateDashboardPage.clickSortByMonth(lastMonth, driver);
			step++;

			testSteps.add("Step " + step + " : Verify job list by <b>'Last Month' </b>");
			assertTrue(candidateDashboardPage.verifySortingByDate(lastMonth, driver),
					"Verified job list by <b>'Last Month' </b>");
			step++;

			String last3Month = "Last 3 Months";
			testSteps.add("Step " + step + " : Click on 'Sort By Last 3 Months' button");
			candidateDashboardPage.clickSortByMonth(last3Month, driver);
			step++;

			testSteps.add("Step " + step + " : Verify job list by <b>'Last 3 Months' </b>");
			assertTrue(candidateDashboardPage.verifySortingByDate(last3Month, driver),
					"Verified job list by <b>'Last 3 Months' </b>");
			step++;

			String last6Month = "Last 6 Months";
			testSteps.add("Step " + step + " : Click on 'Sort By Last 6 Months' button");
			candidateDashboardPage.clickSortByMonth(last6Month, driver);
			step++;

			testSteps.add("Step " + step + " : Verify job list by <b>'Last 6 Months' </b>");
			assertTrue(candidateDashboardPage.verifySortingByDate(last6Month, driver),
					"Verified job list by <b>'Last 6 Months' </b>");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_123_VerifyThatUserCanGetTheExactResultAgainstAllLastMonthLastThreeMonthsLastSixMonthsFilters",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_123_VerifyThatUserCanGetTheExactResultAgainstAllLastMonthLastThreeMonthsLastSixMonthsFilters "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_123_VerifyThatUserCanGetTheExactResultAgainstAllLastMonthLastThreeMonthsLastSixMonthsFilters",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_123_VerifyThatUserCanGetTheExactResultAgainstAllLastMonthLastThreeMonthsLastSixMonthsFilters"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_123_VerifyThatUserCanGetTheExactResultAgainstAllLastMonthLastThreeMonthsLastSixMonthsFilters",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_124_VerifyUserCanSeeTheCoverLetterFromTheApplicationHistoryDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			Waits.wait3s();

			testSteps.add("Step " + step + " : Click on 'View All' button");
			candidateDashboardPage.clickOnViewAllButtonOnJobHistory(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Preview' button");
			candidateDashboardPage.clickOnPreviewButtonWithCoverlatter(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is able to see 'Cover Letter For This Job ' Popup");
			assertTrue(candidateDashboardPage.isCoverLetterForThisJobPopupDisplay(driver),
					"Verified user is able to see 'Cover Letter For This Job ' Popup");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_124_VerifyUserCanSeeTheCoverLetterFromTheApplicationHistoryDetailPage", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_124_VerifyUserCanSeeTheCoverLetterFromTheApplicationHistoryDetailPage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_124_VerifyUserCanSeeTheCoverLetterFromTheApplicationHistoryDetailPage", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_124_VerifyUserCanSeeTheCoverLetterFromTheApplicationHistoryDetailPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_124_VerifyUserCanSeeTheCoverLetterFromTheApplicationHistoryDetailPage", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_130_VerifyUserIsAbleToSeeTheRecentSearchSectionWithTheSearches() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}
			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			Waits.wait3s();

			testSteps.add("Step " + step + " : Verify 'Keyword' Section is display");
			assertTrue(candidateDashboardPage.isKeywordSectionDisplay(driver), "Verified 'Keyword' Section is display");
			step++;

			testSteps.add("Step " + step + " : Verify 'Date' Section is display");
			assertTrue(candidateDashboardPage.isDateSectionDisplay(driver), "Verified 'Date' Section is display");
			step++;

			testSteps.add("Step " + step + " : Verify 'Number Of Search Results' Section is display");
			assertTrue(candidateDashboardPage.isNumberOfSearchResultsSectionDisplay(driver),
					"Verified 'Number Of Search Results' Section is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_130_VerifyUserIsAbleToSeeTheRecentSearchSectionWithTheSearches", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_130_VerifyUserIsAbleToSeeTheRecentSearchSectionWithTheSearches "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_130_VerifyUserIsAbleToSeeTheRecentSearchSectionWithTheSearches", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_130_VerifyUserIsAbleToSeeTheRecentSearchSectionWithTheSearches"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_130_VerifyUserIsAbleToSeeTheRecentSearchSectionWithTheSearches", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_118_VerifyAppliedButtonIsShowingJobDetailPageWithAppliedStatusOnClickingFromYourJobsSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

//			testSteps.add("Step " + step + " : Click On 'job Save' button");
//			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
//			candidateDashboardPage.clickOnDashboardButton(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'View All' button");
//			candidateDashboardPage.clickOnViewAllButon(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Click On 'Apply Now' button");
//			candidateDashboardPage.clickApplyNowButton(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : 'Upload Resume' ");
//			candidateDashboardPage.uploadResumeInput(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Click on 'Submit Application' button");
//			candidateDashboardPage.clickSubmitApplicationBtn(driver);
//			step++;
//
//			waitTime(2000);
//			testSteps.add(
//					"Step " + step + " : Verify <b>'You've successfully submitted your application.'</b> message");
//			assertTrue(candidateDashboardPage.verifySucessMessageIsDisplaying(driver),
//					"Verified <b>'You've successfully submitted your application.'</b> message>");
//			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_118_VerifyAppliedButtonIsShowingJobDetailPageWithAppliedStatusOnClickingFromYourJobsSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_118_VerifyAppliedButtonIsShowingJobDetailPageWithAppliedStatusOnClickingFromYourJobsSection "
							+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_118_VerifyAppliedButtonIsShowingJobDetailPageWithAppliedStatusOnClickingFromYourJobsSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_118_VerifyAppliedButtonIsShowingJobDetailPageWithAppliedStatusOnClickingFromYourJobsSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_118_VerifyAppliedButtonIsShowingJobDetailPageWithAppliedStatusOnClickingFromYourJobsSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_120_VerifyUserIsAbleToSeeAppliedJobsUnderTheApplicationHistoryOnTheCandidateDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Verify <b>'Applicaton History Section'</b> Section");
			assertTrue(candidateDashboardPage.isApplicatonHistorySectionDisplay(driver),
					"Verified <b>Applicaton History Section</b> Section>");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_120_VerifyUserIsAbleToSeeAppliedJobsUnderTheApplicationHistoryOnTheCandidateDashboard",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_120_VerifyUserIsAbleToSeeAppliedJobsUnderTheApplicationHistoryOnTheCandidateDashboard "
							+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_120_VerifyUserIsAbleToSeeAppliedJobsUnderTheApplicationHistoryOnTheCandidateDashboard",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_120_VerifyUserIsAbleToSeeAppliedJobsUnderTheApplicationHistoryOnTheCandidateDashboard"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_120_VerifyUserIsAbleToSeeAppliedJobsUnderTheApplicationHistoryOnTheCandidateDashboard",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_121_VerifyThatUserCanSeeJobsListInApplicationHistoryByClickingOnViewAllButton() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on Applicaton History 'View All' button");
			candidateDashboardPage.clickApplicatonHistoryViewAllButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify <b>'Applicaton History .'</b> Page");
			assertTrue(candidateDashboardPage.isApplicatonHistoryPageDisplay(driver),
					"Verified <b>Applicaton History.</b> Page>");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_121_VerifyThatUserCanSeeJobsListInApplicationHistoryByClickingOnViewAllButton",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_121_VerifyThatUserCanSeeJobsListInApplicationHistoryByClickingOnViewAllButton "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_121_VerifyThatUserCanSeeJobsListInApplicationHistoryByClickingOnViewAllButton",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_121_VerifyThatUserCanSeeJobsListInApplicationHistoryByClickingOnViewAllButton"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_121_VerifyThatUserCanSeeJobsListInApplicationHistoryByClickingOnViewAllButton",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_119_VerifyAppliedButtonIsNotPerformingAnyActionFromTheViewAllPageOfYourJobs() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

//			testSteps.add("Step " + step + " : Click On 'job Save' button");
//			candidateDashboardPage.verifyApplyNowBtnAndClickOnSaveBtn(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
//			candidateDashboardPage.clickOnDashboardButton(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'View All' button");
//			candidateDashboardPage.clickOnViewAllButon(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Click On 'Apply Now' button");
//			candidateDashboardPage.clickApplyNowButton(driver);
//			step++;			
//			
//			testSteps.add("Step " + step + " : 'Upload Resume' ");
//			candidateDashboardPage.uploadResumeInput(driver);
//			step++;
//			
//			testSteps.add("Step " + step + " : Click on 'Submit Application' button");
//			candidateDashboardPage.clickSubmitApplicationBtn(driver);
//			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_119_VerifyAppliedButtonIsNotPerformingAnyActionFromTheViewAllPageOfYourJobs",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_119_VerifyAppliedButtonIsNotPerformingAnyActionFromTheViewAllPageOfYourJobs "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_119_VerifyAppliedButtonIsNotPerformingAnyActionFromTheViewAllPageOfYourJobs",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_119_VerifyAppliedButtonIsNotPerformingAnyActionFromTheViewAllPageOfYourJobs"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_119_VerifyAppliedButtonIsNotPerformingAnyActionFromTheViewAllPageOfYourJobs",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_126_VerifyUserIsAbleToEditAlertFromTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on your alert 'Edit' button");
			candidateDashboardPage.clickYourAlertEditButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click On your alert popup 'update' button");
			candidateDashboardPage.clickYourAlertUpdateButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Search Saved Successfully' Popup is display");
			assertTrue(candidateDashboardPage.isSearchSavedSuccessfullyPopupDisplay(driver),
					"Verified 'Search Saved Successfully' is display");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_126_VerifyUserIsAbleToEditAlertFromTheDashboard", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_126_VerifyUserIsAbleToEditAlertFromTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_126_VerifyUserIsAbleToEditAlertFromTheDashboard", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_126_VerifyUserIsAbleToEditAlertFromTheDashboard" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_126_VerifyUserIsAbleToEditAlertFromTheDashboard", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_127_VerifyUserIsAbleToRunTheSavedAlertFromTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on your alert 'Run' button");
			candidateDashboardPage.clickYourAlertRunButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'jobs relevant to the saved alert'  is display");
			assertTrue(candidateDashboardPage.isJobSaveAlertDisplay(driver),
					"Verified 'jobs relevant to the saved alert'  is display");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_127_VerifyUserIsAbleToRunTheSavedAlertFromTheDashboard", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_127_VerifyUserIsAbleToRunTheSavedAlertFromTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_127_VerifyUserIsAbleToRunTheSavedAlertFromTheDashboard", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_127_VerifyUserIsAbleToRunTheSavedAlertFromTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_127_VerifyUserIsAbleToRunTheSavedAlertFromTheDashboard", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_128_VerifyUserIsAbleToDeleteTheSavedAlertFromTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on your alert 'Delete' button");
			candidateDashboardPage.clickYourAlertDeleteButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Save Job Deleted Successfully' Popup is display");
			assertTrue(candidateDashboardPage.isSaveJobDeletedSuccessfullyPopupDisplay(driver),
					"Verified 'Save Job Deleted Successfully' Popup is display");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_128_VerifyUserIsAbleToDeleteTheSavedAlertFromTheDashboard", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_128_VerifyUserIsAbleToDeleteTheSavedAlertFromTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_128_VerifyUserIsAbleToDeleteTheSavedAlertFromTheDashboard", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_128_VerifyUserIsAbleToDeleteTheSavedAlertFromTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_128_VerifyUserIsAbleToDeleteTheSavedAlertFromTheDashboard", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_129_VerifyUserIsAbleToChangeTheFrequencyOfTheAlertFromTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on weekly or daily Dropdown");
			candidateDashboardPage.selectWeeklyDailyDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Weekly And Daily' Option is display");
			assertTrue(candidateDashboardPage.isWeeklyAndDailyOptionDisplay(driver),
					"Verified 'Weekly And Daily' Option is display");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_129_VerifyUserIsAbleToChangeTheFrequencyOfTheAlertFromTheDashboard", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_129_VerifyUserIsAbleToChangeTheFrequencyOfTheAlertFromTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_129_VerifyUserIsAbleToChangeTheFrequencyOfTheAlertFromTheDashboard", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_129_VerifyUserIsAbleToChangeTheFrequencyOfTheAlertFromTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_129_VerifyUserIsAbleToChangeTheFrequencyOfTheAlertFromTheDashboard", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_125_VerifyUserIsAbleToDownloadAnyResumeAttachedToApplicationFromTheApplicationHistoryDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on Applicaton History View All button");
			candidateDashboardPage.clickOnApplicatonHistoryViewAll(driver);
			step++;

			testSteps.add("Step " + step + " : Click on Resume Pdf Link");
			candidateDashboardPage.clickOnResumePdfLink(driver);
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_125_VerifyUserIsAbleToDownloadAnyResumeAttachedToApplicationFromTheApplicationHistoryDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_125_VerifyUserIsAbleToDownloadAnyResumeAttachedToApplicationFromTheApplicationHistoryDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_125_VerifyUserIsAbleToDownloadAnyResumeAttachedToApplicationFromTheApplicationHistoryDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_125_VerifyUserIsAbleToDownloadAnyResumeAttachedToApplicationFromTheApplicationHistoryDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_125_VerifyUserIsAbleToDownloadAnyResumeAttachedToApplicationFromTheApplicationHistoryDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_143_VerifyUserIsAbleToSeeGetMembershipBannerOnTheDashboard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[1][0].toString();
		String password = dataArr[1][1].toString();
		try {
			int step = 1;
			if (candidateDashboardPage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateDashboardPage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateDashboardPage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateDashboardPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateDashboardPage.clickOnSubmitLoginButton(driver);
				step++;
			}

			testSteps.add("Step " + step + " : Verify <b>'banner on dashboard'</b>");
			assertTrue(candidateDashboardPage.isApplicatonHistorySectionDisplay(driver),
					"Verified <b>'banner on dashboard'</b>");
			step++;

			Waits.wait3s();
			testSteps.add("Step " + step + " : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_143_VerifyUserIsAbleToSeeGetMembershipBannerOnTheDashboard", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_143_VerifyUserIsAbleToSeeGetMembershipBannerOnTheDashboard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_143_VerifyUserIsAbleToSeeGetMembershipBannerOnTheDashboard", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_143_VerifyUserIsAbleToSeeGetMembershipBannerOnTheDashboard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_143_VerifyUserIsAbleToSeeGetMembershipBannerOnTheDashboard", testSteps, driver);
			assertTrue(false);
		}
	}

//	@Test()
	public void TC_ID_159_VerifyUserIsAbleToSeeMaxThreeSuggestedJobsInYourJobdsSectionInDasbhoard() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateDashboardPage candidateDashboardPage;

		driver = initConfiguration();
		candidateDashboardPage = new CandidateDashboardPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "SuggestedJobsEmail", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;
			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateDashboardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(candidateDashboardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			candidateDashboardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateDashboardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			candidateDashboardPage.clickOnSubmitLoginButton(driver);
			step++;
			Waits.wait3s();

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			candidateDashboardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify the size of the Suggested jobs is max Three");
			assertTrue(candidateDashboardPage.lenghtOfSuggestedJobsinYourJobsSection(driver),
					"Verify the size of the Suggested jobs is max Three");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_159_VerifyUserIsAbleToSeeMaxThreeSuggestedJobsInYourJobdsSectionInDasbhoard",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_159_VerifyUserIsAbleToSeeMaxThreeSuggestedJobsInYourJobdsSectionInDasbhoard "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_159_VerifyUserIsAbleToSeeMaxThreeSuggestedJobsInYourJobdsSectionInDasbhoard",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_159_VerifyUserIsAbleToSeeMaxThreeSuggestedJobsInYourJobdsSectionInDasbhoard"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_159_VerifyUserIsAbleToSeeMaxThreeSuggestedJobsInYourJobdsSectionInDasbhoard",
					testSteps, driver);
			assertTrue(false);
		}
	}

}
