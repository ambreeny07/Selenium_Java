package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateDashboardPage;
import com.medrep.pages.CandidateJobSearchPage;

public class CreateAlert extends BaseClass {
	String tempSrc = "";


	@Test()
	public void TC_ID_65_VerifyThatUseIsNotAbleToCreateAlertWithoutSelectingSearchFilters() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Please use search filters to create' alert is display");
			assertTrue(candidateJobSearchPage.isAlretWarningMessageDisplay(driver),
					" Verified 'Please use search filters to create' alert is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_65_VerifyThatUseIsNotAbleToCreateAlertWithoutSelectingSearchFilters", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_65_VerifyThatUseIsNotAbleToCreateAlertWithoutSelectingSearchFilters"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_65_VerifyThatUseIsNotAbleToCreateAlertWithoutSelectingSearchFilters", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_65_VerifyThatUseIsNotAbleToCreateAlertWithoutSelectingSearchFilters"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_65_VerifyThatUseIsNotAbleToCreateAlertWithoutSelectingSearchFilters", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_69_VerifyThatUserIsAbleToSelectOneOptionAtATimeFromDailyAndWeekly() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Check 'Primary Function' dropdown check box");
			candidateJobSearchPage.checkDropdownCheckbox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is display");
			assertTrue(candidateJobSearchPage.isCreateJobAlertPopupDisplay(driver),
					" Verified 'Create Job Alert' popup is display");
			step++;

			testSteps.add("Step " + step + " : Select 'Daily' radio button");
			candidateJobSearchPage.selectDailyRadioButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Daily' radio button is selected");
			assertTrue(candidateJobSearchPage.isDailyRadioButtonSelected(driver),
					" Verified 'Daily' radio button is selected");
			step++;

			testSteps.add("Step " + step + " : Verify 'Weekly' radio button is not selected");
			assertFalse(candidateJobSearchPage.isWeeklyRadioButtonSelected(driver),
					" Verified 'Weekly' radio button is not selected");
			step++;

			testSteps.add("Step " + step + " : Select 'Weekly' radio button");
			candidateJobSearchPage.selectWeeklyRadioButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Weekly' radio button is selected");
			assertTrue(candidateJobSearchPage.isWeeklyRadioButtonSelected(driver),
					" Verified 'Weekly' radio button is selected");
			step++;

			testSteps.add("Step " + step + " : Verify 'Daily' radio button is not selected");
			assertFalse(candidateJobSearchPage.isDailyRadioButtonSelected(driver),
					" Verified 'Daily' radio button is not selected");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_69_VerifyThatUserIsAbleToSelectOneOptionAtATimeFromDailyAndWeekly", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_69_VerifyThatUserIsAbleToSelectOneOptionAtATimeFromDailyAndWeekly "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_69_VerifyThatUserIsAbleToSelectOneOptionAtATimeFromDailyAndWeekly", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_69_VerifyThatUserIsAbleToSelectOneOptionAtATimeFromDailyAndWeekly"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_69_VerifyThatUserIsAbleToSelectOneOptionAtATimeFromDailyAndWeekly", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_70_VerifyThatUserIsAbleToSelectDailyOptionOnCreateJobAlertPopup() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Check 'Primary Function' dropdown check box");
			candidateJobSearchPage.checkDropdownCheckbox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is display");
			assertTrue(candidateJobSearchPage.isCreateJobAlertPopupDisplay(driver),
					" Verified 'Create Job Alert' popup is display");
			step++;

			testSteps.add("Step " + step + " : Select 'Daily' radio button");
			candidateJobSearchPage.selectDailyRadioButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Daily' radio button is selected");
			assertTrue(candidateJobSearchPage.isDailyRadioButtonSelected(driver),
					" Verified 'Daily' radio button is selected");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_70_VerifyThatUserIsAbleToSelectDailyOptionOnCreateJobAlertPopup", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_70_VerifyThatUserIsAbleToSelectDailyOptionOnCreateJobAlertPopup "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_70_VerifyThatUserIsAbleToSelectDailyOptionOnCreateJobAlertPopup", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_70_VerifyThatUserIsAbleToSelectDailyOptionOnCreateJobAlertPopup"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_70_VerifyThatUserIsAbleToSelectDailyOptionOnCreateJobAlertPopup", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_71_VerifyThatUserIsAbleToSelectWeeklyOptionOnCreateJobAlertPopup() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Check 'Primary Function' dropdown check box");
			candidateJobSearchPage.checkDropdownCheckbox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is display");
			assertTrue(candidateJobSearchPage.isCreateJobAlertPopupDisplay(driver),
					" Verified 'Create Job Alert' popup is display");
			step++;

			testSteps.add("Step " + step + " : Select 'Weekly' radio button");
			candidateJobSearchPage.selectWeeklyRadioButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Weekly' radio button is selected");
			assertTrue(candidateJobSearchPage.isWeeklyRadioButtonSelected(driver),
					" Verified 'Weekly' radio button is selected");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_71_VerifyThatUserIsAbleToSelectWeeklyOptionOnCreateJobAlertPopup", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_71_VerifyThatUserIsAbleToSelectWeeklyOptionOnCreateJobAlertPopup "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_71_VerifyThatUserIsAbleToSelectWeeklyOptionOnCreateJobAlertPopup", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_71_VerifyThatUserIsAbleToSelectWeeklyOptionOnCreateJobAlertPopup"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_71_VerifyThatUserIsAbleToSelectWeeklyOptionOnCreateJobAlertPopup", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_68_VerifyThatUserIsAbleToLandTermsAndConditionPageWhenItsClickOnTermsAndConditionsAndPrivacyPolicyLinkBelowCreatAlertButton() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Check 'Primary Function' dropdown check box");
			candidateJobSearchPage.checkDropdownCheckbox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is display");
			assertTrue(candidateJobSearchPage.isCreateJobAlertPopupDisplay(driver),
					" Verified 'Create Job Alert' popup is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Our Terms and Conditions and Privacy Policy' link");
			candidateJobSearchPage.clickOnTermsAndConditionLink(driver);
			step++;

			testSteps.add("Step " + step + ": Switch to second tab");
			switchtoSecondTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to 'Privacy Policy'");
			assertTrue(candidateJobSearchPage.isPageHeadingPrivacyPolicyDisplay(driver),
					" Verified user is redirected to 'Privacy Policy'");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");
//			closeBrowser(driver);

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_68_VerifyThatUserIsAbleToLandTermsAndConditionPageWhenItsClickOnTermsAndConditionsAndPrivacyPolicyLinkBelowCreatAlertButton",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_68_VerifyThatUserIsAbleToLandTermsAndConditionPageWhenItsClickOnTermsAndConditionsAndPrivacyPolicyLinkBelowCreatAlertButton "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_68_VerifyThatUserIsAbleToLandTermsAndConditionPageWhenItsClickOnTermsAndConditionsAndPrivacyPolicyLinkBelowCreatAlertButton",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_68_VerifyThatUserIsAbleToLandTermsAndConditionPageWhenItsClickOnTermsAndConditionsAndPrivacyPolicyLinkBelowCreatAlertButton"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_68_VerifyThatUserIsAbleToLandTermsAndConditionPageWhenItsClickOnTermsAndConditionsAndPrivacyPolicyLinkBelowCreatAlertButton",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_67_VerifyThatUserIsAbleToCloseCreateJobAlertPopupOnClickingCancelButton() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Check 'Primary Function' dropdown check box");
			candidateJobSearchPage.checkDropdownCheckbox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is display");
			assertTrue(candidateJobSearchPage.isCreateJobAlertPopupDisplay(driver),
					" Verified 'Create Job Alert' popup is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Cancel' button");
			candidateJobSearchPage.clickOnCancelButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is close");
			assertFalse(candidateJobSearchPage.isCreateJobAlertPopupClose(driver),
					" Verified 'Create Job Alert' popup is close");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_67_VerifyThatUserIsAbleToCloseCreateJobAlertPopupOnClickingCancelButton", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_67_VerifyThatUserIsAbleToCloseCreateJobAlertPopupOnClickingCancelButton "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_67_VerifyThatUserIsAbleToCloseCreateJobAlertPopupOnClickingCancelButton", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_67_VerifyThatUserIsAbleToCloseCreateJobAlertPopupOnClickingCancelButton"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_67_VerifyThatUserIsAbleToCloseCreateJobAlertPopupOnClickingCancelButton", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_72_VerifyUserIsAbleToCreateAlertSuccessfully() {

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
			AddTest_IntoReport("TC_ID_72_VerifyUserIsAbleToCreateAlertSuccessfully", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_72_VerifyUserIsAbleToCreateAlertSuccessfully "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_72_VerifyUserIsAbleToCreateAlertSuccessfully", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_72_VerifyUserIsAbleToCreateAlertSuccessfully"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_72_VerifyUserIsAbleToCreateAlertSuccessfully", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_66_VerifyThatUserIsAbleToCreateAlertAfterSelectingSearchFilters() {

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

			testSteps.add("Step " + step + " : Click on 'Primary Function' dropdown button");
			candidateJobSearchPage.clickOnPrimaryFunctionDropdownButton(driver);
			step++;

			testSteps.add("Step " + step + " : Check 'Primary Function' dropdown check box");
			candidateJobSearchPage.checkDropdownCheckbox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Create Alert' button");
			candidateJobSearchPage.clickOnCreateAlertButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create Job Alert' popup is display");
			assertTrue(candidateJobSearchPage.isCreateJobAlertPopupDisplay(driver),
					" Verified 'Create Job Alert' popup is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_66_VerifyThatUserIsAbleToCreateAlertAfterSelectingSearchFilters", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_66_VerifyThatUserIsAbleToCreateAlertAfterSelectingSearchFilters"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_66_VerifyThatUserIsAbleToCreateAlertAfterSelectingSearchFilters", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_66_VerifyThatUserIsAbleToCreateAlertAfterSelectingSearchFilters"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_66_VerifyThatUserIsAbleToCreateAlertAfterSelectingSearchFilters", testSteps, driver);
			assertTrue(false);
		}
	}


}
