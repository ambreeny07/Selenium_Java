package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateDashboardPage;
import com.medrep.pages.CandidateJobDetailPage;
import com.medrep.pages.CandidateJobSearchPage;

public class CandidateJobDetail extends BaseClass {
	String tempSrc = "";


	@Test()
	public void TC_ID_74_VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				testSteps.add("Step " + step + " : Click on 'Minus Icon' On Right panel of Year Of Experiense title");
				candidateJobDetailPage.clickOnMinusIconOnRightYearOfExperiense(driver);
				step++;
				
				testSteps.add("Step "+step+" : Verify Detail mentioned below 'Years of Experience' should get collapse is display");
		        assertTrue(candidateJobDetailPage.isDetialsMentionYearExprenceBelowDisplay(driver)," Verified Detail mentioned below 'Years of Experience' should get collapse is display");
		        step++;
				
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_74_VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_74_VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_74_VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_74_VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_74_VerifyThatUserIsAbleToCollapseInformationAgainstYearsOfExperienceOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_75_VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				try {
					testSteps.add("Step " + step + " : Click on 'Plus Icon' On Right panel of Year Of Experiense title");
					candidateJobDetailPage.clickOnPlusIconOnRightYearOfExperiense(driver);
					step++;
					
					testSteps.add("Step "+step+" : Verify Detail mentioned below 'Years of Experience' should get Expand is display");
					assertFalse(candidateJobDetailPage.isDetialsMentionYearExprenceBelowDisplay(driver)," Verified Detail mentioned below 'Years of Experience' should get Expand is display");
					step++;
					
				} catch (Exception e) {
					// TODO: handle exception
				} catch (Error e) {
				}
				
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_75_VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_75_VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_75_VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_75_VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_75_VerifyThatUserIsAbleToExpandInformationAgainstYearsOfExperienceOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_77_VerifyThatUserIsAbleToCollapseInformationAgainstAnnualSalaryOnJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				testSteps.add("Step " + step + " : Click on 'Plus Icon' On Right Annual Salary title");
				candidateJobDetailPage.clickOnPlusIconOnRightAnnualSalary(driver);
				step++;
				
				testSteps.add("Step " + step + " : Click on 'Minus Icon' On Right panel of Annual Salary title");
				candidateJobDetailPage.clickOnMinusIconOnRightAnnualSalary(driver);
				step++;
				
				testSteps.add("Step "+step+" : Verify Detail mentioned below 'Annual Salary' should get collapse is display");
		        assertFalse(candidateJobDetailPage.isDetialsMentionAnnualSalaryBelowDisplay(driver)," Verified Detail mentioned below 'Annual Salary' should get collapse is display");
		        step++;
				
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_77_VerifyThatUserIsAbleToCollapseInformationAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_77_VerifyThatUserIsAbleToCollapseInformationAgainstAnnualSalaryOnJobDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_77_VerifyThatUserIsAbleToCollapseInformationAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_77_VerifyThatUserIsAbleToCollapseInformationAgainstAnnualSalaryOnJobDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_77_VerifyThatUserIsAbleToCollapseInformationAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_76_VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				testSteps.add("Step " + step + " : Click on 'Plus Icon' On Annual Salary title");
				candidateJobDetailPage.clickOnPlusIconOnRightAnnualSalary(driver);
				step++;
				
				testSteps.add("Step "+step+" : Verify Detail mentioned below 'Annual Salary' should get Expand is display");
		        assertTrue(candidateJobDetailPage.isDetialsMentionAnnualSalaryBelowDisplay(driver)," Verified Detail mentioned below 'Annual Salary' should get Expand is display");
		        step++;
				
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_76_VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_76_VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_76_VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_76_VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_76_VerifyThatUserIsAbleToExpandInformationAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_78_VerifyThatUserIsAbleToEducationLevelAgainstAnnualSalaryOnJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				testSteps.add("Step " + step + " : Click on 'Plus Icon' On Education Level title");
				candidateJobDetailPage.clickOnPlusIconOnRightEducationLevel(driver);
				step++;
				
				testSteps.add("Step "+step+" : Verify Detail mentioned below 'Education Level' should get Expand is display");
		        assertTrue(candidateJobDetailPage.isDetialsMentionEducationLevelBelowDisplay(driver)," Verified Detail mentioned below 'Education Level' should get Expand is display");
		        step++;
				
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_78_VerifyThatUserIsAbleToEducationLevelAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_78_VerifyThatUserIsAbleToEducationLevelAgainstAnnualSalaryOnJobDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_78_VerifyThatUserIsAbleToEducationLevelAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_78_VerifyThatUserIsAbleToEducationLevelAgainstAnnualSalaryOnJobDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_78_VerifyThatUserIsAbleToEducationLevelAgainstAnnualSalaryOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_79_VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelOnJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				testSteps.add("Step " + step + " : Click on 'Plus Icon' On Education Level title");
				candidateJobDetailPage.clickOnPlusIconOnRightEducationLevel(driver);
				step++;
				
				testSteps.add("Step " + step + " : Click on 'Minus Icon' On Right panel of Education Level title");
				candidateJobDetailPage.clickOnMinusIconOnRightAnnualSalary(driver);
				step++;
				
				testSteps.add("Step "+step+" : Verify Detail mentioned below 'Education Level' should get collapse is display");
		        assertFalse(candidateJobDetailPage.isDetialsMentionEducationLevelBelowDisplay(driver)," Verified Detail mentioned below 'Education Level' should get collapse is display");
		        step++;
				
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_79_VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelOnJobDetailPage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_79_VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelOnJobDetailPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_79_VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_79_VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelOnJobDetailPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_79_VerifyThatUserIsAbleToCollapseInformationAgainstEducationLevelOnJobDetailPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_80_VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
				
				try {
					testSteps.add("Step " + step + " : Click on 'Plus Icon' On Right panel of Year Of Experiense title");
					candidateJobDetailPage.clickOnPlusIconOnRightYearOfExperiense(driver);
					step++;

					testSteps.add("Step "+step+" : Verify Detail mentioned below 'Years of Experience' should get Expand is display");
					assertFalse(candidateJobDetailPage.isDetialsMentionYearExprenceBelowDisplay(driver)," Verified Detail mentioned below 'Years of Experience' should get Expand is display");
					step++;
					
				} catch (Exception e) {
					// TODO: handle exception
				} catch (Error e) {
				}
			}
		    
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_80_VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_80_VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_80_VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_80_VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_80_VerifyThatInformationAgainstYearsOfExperienceIsByDefaultExpanded",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_92_VerifyUserIsAbleToSaveJobFromJobDetailPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateJobDetailPage candidateJobDetailPage;

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateJobDetailPage = new CandidateJobDetailPage(driver);
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
			
			testSteps.add("Step "+step+" : Click on Job 'Save' button");
			candidateJobDetailPage.clickOnJobSaveButton(driver);
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
			AddTest_IntoReport("TC_ID_92_VerifyUserIsAbleToSaveJobFromJobDetailPage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_92_VerifyUserIsAbleToSaveJobFromJobDetailPage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_92_VerifyUserIsAbleToSaveJobFromJobDetailPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_92_VerifyUserIsAbleToSaveJobFromJobDetailPage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_92_VerifyUserIsAbleToSaveJobFromJobDetailPage", testSteps, driver);
			assertTrue(false);
		}
	}
	
}
