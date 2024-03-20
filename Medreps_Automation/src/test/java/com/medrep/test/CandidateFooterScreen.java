package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateFooterPage;
import com.medrep.pages.CandidateHomeScreenPage;
import com.medrep.pages.CandidateSignUpPage;

public class CandidateFooterScreen extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_36_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreFromMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Members Login' link");
			candidateFooterPage.clickOnMembersLoginLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Create An Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create An Account ' button display");
			step++;			
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_36_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_36_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreFromMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_36_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_36_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreFromMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_36_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_37_AsAGuestUserVerifyTheMembershipOptionIsWorkingOnTheFooterAreFromMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);	
		Object[][] dataArr = getData("testData", "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData("testData", "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Members Login' link");
			candidateFooterPage.clickOnMembersLoginLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Create An Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create An Account ' button display");
			step++;			
						

			testSteps.add("Step " + step + " : Click on 'Create An Account' button");
			candidateSignUpPage.clickOnCreateAFreeAccount(driver);
			step++;

			testSteps.add("Step " + step + " : Select the membership plan");
			candidateSignUpPage.checkBiAnnualCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName1", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName1", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test1", driver);
			testSteps.add("Step " + step + ": Enter Email : " + email);
			candidateSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step " + step + ": Enter Confirm Email  : " + email);
			candidateSignUpPage.enterConfirmEmail(email, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateSignUpPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Confirm Password':" + password);
			candidateSignUpPage.enterConfirmPassword(password, driver);
			step++;

			try {
			testSteps.add("Step " + step + " : Check 'Marketing Preferences' check box");
			candidateSignUpPage.checkMarketingPreferencesCheckBox(driver);
			step++;}catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnRegisterButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
			candidateSignUpPage.enterCardNumber(cardNumber, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
			candidateSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
			candidateSignUpPage.enterCardCvcNumber(cardCvc, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
			candidateSignUpPage.enterNameOnCard(nameOnCard, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
			candidateSignUpPage.clickOnCountryDropDown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
			candidateSignUpPage.clickOnPakistanOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Subscribe' button.");
			candidateSignUpPage.clickOnPayButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_37_AsAGuestUserVerifyTheMembershipOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_37_AsAGuestUserVerifyTheMembershipOptionIsWorkingOnTheFooterAreFromMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_37_AsAGuestUserVerifyTheMembershipOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_37_AsAGuestUserVerifyTheMembershipOptionIsWorkingOnTheFooterAreFromMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_37_AsAGuestUserVerifyTheMembershipOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_38_AsAGuestUserVerifyTheSearchJobsOptionIsWorkingOnTheFooterAreFromMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Search Job' link");
			candidateFooterPage.clickOnMembersSearchJobLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Search' page");
			assertTrue(candidateHomeScreenPage.isSearchJobBtnOnPage(driver),
					"Verified 'Login' button");
			step++;		
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_38_AsAGuestUserVerifyTheSearchJobsOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_38_AsAGuestUserVerifyTheSearchJobsOptionIsWorkingOnTheFooterAreFromMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_38_AsAGuestUserVerifyTheSearchJobsOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_38_AsAGuestUserVerifyTheSearchJobsOptionIsWorkingOnTheFooterAreFromMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_38_AsAGuestUserVerifyTheSearchJobsOptionIsWorkingOnTheFooterAreFromMember",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_39_AsAGuestUserVerifyTheCareerAdviceOptionIsWorkingOnTheFooterAreaFromMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Members Career Advice' link");
			candidateFooterPage.clickOnMembersCareerAdviceLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Career Advice' page");
			assertTrue(candidateFooterPage.isCareerAdvicePage(driver),
					"Verified 'Login' button");
			step++;		
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_39_AsAGuestUserVerifyTheCareerAdviceOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_39_AsAGuestUserVerifyTheCareerAdviceOptionIsWorkingOnTheFooterAreaFromMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_39_AsAGuestUserVerifyTheCareerAdviceOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_39_AsAGuestUserVerifyTheCareerAdviceOptionIsWorkingOnTheFooterAreaFromMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_39_AsAGuestUserVerifyTheCareerAdviceOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_40_AsAGuestUserVerifyTheMedicalSalesSalariesOptionIsWorkingOnTheFooterAreaFromMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Members Medical Sales Salaries' link");
			candidateFooterPage.clickOnMembersMedicalSalesSalariesLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Medical Sales Salaries' page");
			assertTrue(candidateFooterPage.isMedicalSalesSalariesPage(driver),
					"Verified 'Medical Sales Salaries' page");
			step++;		
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_40_AsAGuestUserVerifyTheMedicalSalesSalariesOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_40_AsAGuestUserVerifyTheMedicalSalesSalariesOptionIsWorkingOnTheFooterAreaFromMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_40_AsAGuestUserVerifyTheMedicalSalesSalariesOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_40_AsAGuestUserVerifyTheMedicalSalesSalariesOptionIsWorkingOnTheFooterAreaFromMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_40_AsAGuestUserVerifyTheMedicalSalesSalariesOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_41_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'FAQ' link");
			candidateFooterPage.clickOnMembersFAQLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'FAQ' page");
			assertTrue(candidateFooterPage.isFrequentlyAskedQuestionsPage(driver),
					"Verified 'FAQ' page");
			step++;		
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_41_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_41_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_41_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_41_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_41_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromMember",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_42_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreaFromJobPosters() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Job Posters Login' link");
			candidateFooterPage.clickOnJobPostersLoginLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Create An Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create An Account ' button display");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_42_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_42_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreaFromJobPosters"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_42_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_42_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreaFromJobPosters"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_42_AsAGuestUserVerifyTheLoginOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_43_AsAGuestUserVerifyTheBuyJobsOptionIsWorkingOnTheFooterAreaFromJobPosters() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Job Posters Buy Jobs' link");
			candidateFooterPage.clickOnJobPostersbuyJobsLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Buy Jobs' page");
			assertTrue(candidateFooterPage.isBuyJobsPage(driver),
					"Verified 'Buy Jobs' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_43_AsAGuestUserVerifyTheBuyJobsOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_43_AsAGuestUserVerifyTheBuyJobsOptionIsWorkingOnTheFooterAreaFromJobPosters"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_43_AsAGuestUserVerifyTheBuyJobsOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_43_AsAGuestUserVerifyTheBuyJobsOptionIsWorkingOnTheFooterAreaFromJobPosters"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_43_AsAGuestUserVerifyTheBuyJobsOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_44_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromJobPosters() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Job Posters FAQ' link");
			candidateFooterPage.clickOnJobPostersFAQLink(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'FAQ' page");
			assertTrue(candidateFooterPage.isFrequentlyAskedQuestionsPage(driver),
					"Verified 'FAQ' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_44_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_44_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromJobPosters"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_44_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_44_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromJobPosters"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_44_AsAGuestUserVerifyTheFAQOptionIsWorkingOnTheFooterAreaFromJobPosters",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_45_AsAGuestUserVerifyTheAboutMedrepsOptionIsWorkingOnTheFooterAreaFromAboutSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on about 'About MedReps' link");
			candidateFooterPage.clickOnAboutAboutMedRepsLinke(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'About MedReps' page");
			assertTrue(candidateFooterPage.isAboutMedRepsPage(driver),
					"Verified 'About MedReps' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_45_AsAGuestUserVerifyTheAboutMedrepsOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_45_AsAGuestUserVerifyTheAboutMedrepsOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_45_AsAGuestUserVerifyTheAboutMedrepsOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_45_AsAGuestUserVerifyTheAboutMedrepsOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_45_AsAGuestUserVerifyTheAboutMedrepsOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_46_AsAGuestUserVerifyTheManageEmailPreferencesOptionIsWorkingOnTheFooterAreaFromAboutSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on about 'Manage Email Preferences' link");
			candidateFooterPage.clickOnAboutManageEmailPreferencesLinke(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Manage Email Preferences' page");
			assertTrue(candidateFooterPage.isManageEmailPreferencesPage(driver),
					"Verified 'Manage Email Preferences' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_46_AsAGuestUserVerifyTheManageEmailPreferencesOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_46_AsAGuestUserVerifyTheManageEmailPreferencesOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_46_AsAGuestUserVerifyTheManageEmailPreferencesOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_46_AsAGuestUserVerifyTheManageEmailPreferencesOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_46_AsAGuestUserVerifyTheManageEmailPreferencesOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_47_AsAGuestUserVerifyTheContactUsOptionIsWorkingOnTheFooterAreaFromAboutSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on about 'Contact Us' link");
			candidateFooterPage.clickOnAboutContactUsLinke(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Contact Us' page");
			assertTrue(candidateFooterPage.isContactUsPage(driver),
					"Verified 'Contact Us' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_47_AsAGuestUserVerifyTheContactUsOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_47_AsAGuestUserVerifyTheContactUsOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_47_AsAGuestUserVerifyTheContactUsOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_47_AsAGuestUserVerifyTheContactUsOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_47_AsAGuestUserVerifyTheContactUsOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_48_AsAGuestUserVerifyThePrivacyPolicyOptionIsWorkingOnTheFooterAreaFromAboutSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on about 'Privacy Policy' link");
			candidateFooterPage.clickOnAboutPrivacyPolicyLinke(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Privacy Policys' page");
			assertTrue(candidateFooterPage.isPrivacyPolicyPage(driver),
					"Verified 'Privacy Policy' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_48_AsAGuestUserVerifyThePrivacyPolicyOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_48_AsAGuestUserVerifyThePrivacyPolicyOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_48_AsAGuestUserVerifyThePrivacyPolicyOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_48_AsAGuestUserVerifyThePrivacyPolicyOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_48_AsAGuestUserVerifyThePrivacyPolicyOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_49_AsAGuestUserVerifyTheTermsOfUseOptionIsWorkingOnTheFooterAreaFromAboutSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on about 'Terms Of Use' link");
			candidateFooterPage.clickOnAboutTermsOfUseLinke(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'Terms Of Use' page");
			assertTrue(candidateFooterPage.isPrivacyPolicyPage(driver),
					"Verified 'Terms Of Use' page");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_49_AsAGuestUserVerifyTheTermsOfUseOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_49_AsAGuestUserVerifyTheTermsOfUseOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_49_AsAGuestUserVerifyTheTermsOfUseOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_49_AsAGuestUserVerifyTheTermsOfUseOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_49_AsAGuestUserVerifyTheTermsOfUseOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_50_AsAGuestUserVerifyTheSitemapOptionIsWorkingOnTheFooterAreaFromAboutSection() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on about 'Sitemap' link");
			candidateFooterPage.clickOnAboutSitemapLinke(driver);
			step++;	
			
			testSteps.add("Step " + step + " : Verify 'sitemap.xml' page url");
			Assert.assertEquals(candidateFooterPage.getUrlOfSitemap(driver),
					"https://uat.medreps.com/sitemap.xml");
			step++;				
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_50_AsAGuestUserVerifyTheSitemapOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_50_AsAGuestUserVerifyTheSitemapOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_50_AsAGuestUserVerifyTheSitemapOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_50_AsAGuestUserVerifyTheSitemapOptionIsWorkingOnTheFooterAreaFromAboutSection"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_50_AsAGuestUserVerifyTheSitemapOptionIsWorkingOnTheFooterAreaFromAboutSection",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_51_AsAGuestUserVerifyTheCopyrightTextIsShownBelowTheFooter() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateFooterPage candidateFooterPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateFooterPage = new CandidateFooterPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);		

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Verify 'copy right' text below the footer");
			assertTrue(candidateHomeScreenPage.isCopyrightTextBelowTheFooter(driver),
					"Verified 'copy right' text below the footer");
			step++;			
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_51_AsAGuestUserVerifyTheCopyrightTextIsShownBelowTheFooter",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_51_AsAGuestUserVerifyTheCopyrightTextIsShownBelowTheFooter"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_51_AsAGuestUserVerifyTheCopyrightTextIsShownBelowTheFooter",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_51_AsAGuestUserVerifyTheCopyrightTextIsShownBelowTheFooter"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_51_AsAGuestUserVerifyTheCopyrightTextIsShownBelowTheFooter",
					testSteps, driver);
			assertTrue(false);
		}
	}

}
