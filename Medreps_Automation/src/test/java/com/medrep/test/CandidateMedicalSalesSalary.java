package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateDashboardPage;
import com.medrep.pages.CandidateJobDetailPage;
import com.medrep.pages.CandidateJobSearchPage;
import com.medrep.pages.CandidateMedicalSalesSalaryPage;

public class CandidateMedicalSalesSalary extends BaseClass {
	String tempSrc = "";


	@Test()
	public void TC_ID_107_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromTheNavigationPanel() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateMedicalSalesSalaryPage candidateMedicalSalesSalaryPage;
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateMedicalSalesSalaryPage = new CandidateMedicalSalesSalaryPage(driver);
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

			testSteps.add("Step " + step + " : Click on 'Medical Sales Salaries' navigation bar");
			candidateMedicalSalesSalaryPage.clickOnMedicalSalesSalariesNavigationBar(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Medical Sales Salaries' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalSalesSalariesPageDisplay(driver)," Verified 'Medical Sales Salaries' Page is display");
	        step++;			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_107_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromTheNavigationPanel", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_107_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromTheNavigationPanel "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_107_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromTheNavigationPanel", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_107_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromTheNavigationPanel"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_107_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromTheNavigationPanel", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_108_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateMedicalSalesSalaryPage candidateMedicalSalesSalaryPage;
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateMedicalSalesSalaryPage = new CandidateMedicalSalesSalaryPage(driver);
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

			testSteps.add("Step " + step + " : Click on 'Medical Sales Salaries' navigation bar");
			candidateMedicalSalesSalaryPage.clickOnMedicalSalesSalariesNavigationBar(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Medical Sales Salaries' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalSalesSalariesPageDisplay(driver)," Verified 'Medical Sales Salaries' Page is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Medical' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMarketLinkDisplay(driver)," Verified 'Medical' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Job Title' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isJobTitleLinkDisplay(driver)," Verified 'Job Title' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Company Size' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isCompanySizeLinkDisplay(driver)," Verified 'Company Size' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Age And Experience' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isAgeAndExperienceLinkDisplay(driver)," Verified 'Age And Experience' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Region' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isRegionLinkDisplay(driver)," Verified 'Region' Link is display");
	        step++;
	        
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_108_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_108_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_108_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_108_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_108_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_109_VerifyUserIsAbleToSeeDifferentReportsUnderTheMoreMedicalSalesSalaryInformationSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateMedicalSalesSalaryPage candidateMedicalSalesSalaryPage;
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateMedicalSalesSalaryPage = new CandidateMedicalSalesSalaryPage(driver);
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

			testSteps.add("Step " + step + " : Click on 'Medical Sales Salaries' navigation bar");
			candidateMedicalSalesSalaryPage.clickOnMedicalSalesSalariesNavigationBar(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Medical Sales Salaries' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalSalesSalariesPageDisplay(driver)," Verified 'Medical Sales Salaries' Page is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Biotech Sales Salary Report' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isBiotechSalesSalaryReportLinkDisplay(driver)," Verified 'Biotech Sales Salary Report' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Surgical Sales Salary Report' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isSurgicalSalesSalaryReportLinkDisplay(driver)," Verified 'Surgical Sales Salary Report' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Medical Device Sales Salary Report' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalDeviceSalesSalaryReportLinkDisplay(driver)," Verified 'Medical Device Sales Salary Report' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Medical Equipment Sales Salary Report' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalEquipmentSalesSalaryReportLinkDisplay(driver)," Verified 'Medical Equipment Sales Salary Report' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Pharmaceutical Sales Salary Report' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isPharmaceuticalSalesSalaryReportLinkDisplay(driver)," Verified 'Pharmaceutical Sales Salary Report' Link is display");
	        step++;
	        
	        testSteps.add("Step "+step+" : Verify 'Medical Sales Salary Report' Link is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalSalesSalaryReportLinkDisplay(driver)," Verified 'Medical Sales Salary Report' Link is display");
	        step++;
	        
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_109_VerifyUserIsAbleToSeeDifferentReportsUnderTheMoreMedicalSalesSalaryInformationSection", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_109_VerifyUserIsAbleToSeeDifferentReportsUnderTheMoreMedicalSalesSalaryInformationSection "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_109_VerifyUserIsAbleToSeeDifferentReportsUnderTheMoreMedicalSalesSalaryInformationSection", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_109_VerifyUserIsAbleToSeeDifferentReportsUnderTheMoreMedicalSalesSalaryInformationSection"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_109_VerifyUserIsAbleToSeeDifferentReportsUnderTheMoreMedicalSalesSalaryInformationSection", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_110_VerifyUserIsRedirectedToTheReportPageByClickingOnAnyReportUnderTheSectionMoreMedicalSalesSalaryInformation() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateMedicalSalesSalaryPage candidateMedicalSalesSalaryPage;
		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateMedicalSalesSalaryPage = new CandidateMedicalSalesSalaryPage(driver);
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

			testSteps.add("Step " + step + " : Click on 'Medical Sales Salaries' navigation bar");
			candidateMedicalSalesSalaryPage.clickOnMedicalSalesSalariesNavigationBar(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Medical Sales Salaries' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalSalesSalariesPageDisplay(driver)," Verified 'Medical Sales Salaries' Page is display");
	        step++;
	        
	        testSteps.add("Step " + step + " : Click on 'Biotech Sales Salary Report' Link");
			candidateMedicalSalesSalaryPage.clickOnBiotechSalesSalaryReportLink(driver);
			step++;
			
	        testSteps.add("Step "+step+" : Verify 'Biotech Sales Salary Report' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isBiotechSalesSalaryReportPageDisplay(driver)," Verified 'Biotech Sales Salary Report' Page is display");
	        step++;
	        	        
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_110_VerifyUserIsRedirectedToTheReportPageByClickingOnAnyReportUnderTheSectionMoreMedicalSalesSalaryInformation", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_110_VerifyUserIsRedirectedToTheReportPageByClickingOnAnyReportUnderTheSectionMoreMedicalSalesSalaryInformation "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_110_VerifyUserIsRedirectedToTheReportPageByClickingOnAnyReportUnderTheSectionMoreMedicalSalesSalaryInformation", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_110_VerifyUserIsRedirectedToTheReportPageByClickingOnAnyReportUnderTheSectionMoreMedicalSalesSalaryInformation"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_110_VerifyUserIsRedirectedToTheReportPageByClickingOnAnyReportUnderTheSectionMoreMedicalSalesSalaryInformation", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_158_VerifyAsAGuestUserIsNotAbleToSeeAnyMedicalalesSalaryInformationAndSeeJoinNowBanner() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateJobSearchPage candidateJobSearchPage;
		CandidateMedicalSalesSalaryPage candidateMedicalSalesSalaryPage;		

		driver = initConfiguration();
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
		candidateMedicalSalesSalaryPage = new CandidateMedicalSalesSalaryPage(driver);
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

//			testSteps.add("Step " + step + " : Click on 'Login' button");
//			candidateJobSearchPage.clickOnLoginButton(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Verify  'Email' field is display");
//			assertTrue(candidateJobSearchPage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
//			step++;
//
//			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
//			candidateJobSearchPage.enterEmailAddress(emailAddress, driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Enter 'Password':" + password);
//			candidateJobSearchPage.enterPassword(password, driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
//			candidateJobSearchPage.clickOnSubmitLoginButton(driver);
//			step++;

			testSteps.add("Step " + step + " : Click on 'Medical Sales Salaries' navigation bar");
			candidateMedicalSalesSalaryPage.clickOnMedicalSalesSalariesNavigationBar(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Medical Sales Salaries' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isMedicalSalesSalariesPageDisplay(driver)," Verified 'Medical Sales Salaries' Page is display");
	        step++;
	        
	        testSteps.add("Step " + step + " : Click on 'Biotech Sales Salary Report' Link");
			candidateMedicalSalesSalaryPage.clickOnBiotechSalesSalaryReportLink(driver);
			step++;
			
	        testSteps.add("Step "+step+" : Verify 'Biotech Sales Salary Report' Page is display");
	        assertTrue(candidateMedicalSalesSalaryPage.isBiotechSalesSalaryReportPageDisplay(driver)," Verified 'Biotech Sales Salary Report' Page is display");
	        step++;
	        	        
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_158_VerifyAsAGuestUserIsNotAbleToSeeAnyMedicalalesSalaryInformationAndSeeJoinNowBanner", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_158_VerifyAsAGuestUserIsNotAbleToSeeAnyMedicalalesSalaryInformationAndSeeJoinNowBanner "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_158_VerifyAsAGuestUserIsNotAbleToSeeAnyMedicalalesSalaryInformationAndSeeJoinNowBanner", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_158_VerifyAsAGuestUserIsNotAbleToSeeAnyMedicalalesSalaryInformationAndSeeJoinNowBanner"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_158_VerifyAsAGuestUserIsNotAbleToSeeAnyMedicalalesSalaryInformationAndSeeJoinNowBanner", testSteps, driver);
			assertTrue(false);
		}
	}
	
}
