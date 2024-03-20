package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateHomeScreenPage;
import com.medrep.pages.CandidateSignUpPage;

public class CandidateHomeScreen extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_24_AsAGuestUserVeriyTheHomeScreenIsShowingInformationAsExpected() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateHomeScreenPage candidateHomeScreenPage;
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Join Now' button");
			assertTrue(candidateHomeScreenPage.isJoinNowButton(driver),
					"Verified 'Join Now' button");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Navigation bar with four' options");
			assertTrue(candidateHomeScreenPage.isNavigationBarWithFourOption(driver),
					"Verified 'Navigation bar with four' options");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'hiring Now On MedReps' Text and 'MedReps Logos'");
			assertTrue(candidateHomeScreenPage.ishiringNowOnMedRepsTextWithLogos(driver),
					"Verified 'hiring Now On MedReps' Text and 'MedReps Logos'");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Image Binner' Text and 'Search' button");
			assertTrue(candidateHomeScreenPage.isImageBinnerWithTextAndSearchButton(driver),
					"Verified 'Image Binner' Text and 'Search' button");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'The Go To Site For Medical Sales Reps' Text and three cards");
			assertTrue(candidateHomeScreenPage.isTheGoToSiteForMedicalSalesRepsTextWith3Card(driver),
					"Verified 'The Go To Site For Medical Sales Reps' Text and three cards");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Section Along An Image' and 'Search Jobs' button");
			assertTrue(candidateHomeScreenPage.isSectionAlongAnImageAndSearchJobsButton(driver),
					"Verified 'Section Along An Image' and 'Search Jobs' button");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Become An Member Section' and 'Join Now' button");
			assertTrue(candidateHomeScreenPage.isBecomeAnMemberSectionWithJoinNowButton(driver),
					"Verified 'Become An Member Section' and 'Join Now' button");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'copy right' text below the footer");
			assertTrue(candidateHomeScreenPage.isCopyrightTextBelowTheFooter(driver),
					"Verified 'copy right' text below the footer");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_24_AsAGuestUserVeriyTheHomeScreenIsShowingInformationAsExpected",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_24_AsAGuestUserVeriyTheHomeScreenIsShowingInformationAsExpected"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_24_AsAGuestUserVeriyTheHomeScreenIsShowingInformationAsExpected",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_24_AsAGuestUserVeriyTheHomeScreenIsShowingInformationAsExpected"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_24_AsAGuestUserVeriyTheHomeScreenIsShowingInformationAsExpected",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_26_AsAGuestUserVerifyTheJoinNowButtonIsFuncationalInTheSliderOnTheHomePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Join Now' button");
			assertTrue(candidateHomeScreenPage.isJoinNowButton(driver),
					"Verified 'Join Now' button");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Join Now' button");
			candidateSignUpPage.clickOnJoinNowButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify 'Register For A MedReps Membership' Popup is displaying");
			assertTrue(candidateHomeScreenPage.isRegisterForAMedRepsMembershipPopup(driver),
					"Verified 'Register For A MedReps Membership' Popup is displayed");
			step++;
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_26_AsAGuestUserVerifyTheJoinNowButtonIsFuncationalInTheSliderOnTheHomePage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_26_AsAGuestUserVerifyTheJoinNowButtonIsFuncationalInTheSliderOnTheHomePage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_26_AsAGuestUserVerifyTheJoinNowButtonIsFuncationalInTheSliderOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_26_AsAGuestUserVerifyTheJoinNowButtonIsFuncationalInTheSliderOnTheHomePage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_26_AsAGuestUserVerifyTheJoinNowButtonIsFuncationalInTheSliderOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_27_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Slide One' button");
			candidateHomeScreenPage.clickOnGoToSlideOne(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
			candidateHomeScreenPage.clickOnSlideJoinNowButton("5",driver);
			
			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test3", driver);
			createdUsers.add(email);
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

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
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
			AddTest_IntoReport("TC_ID_27_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomePage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_27_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomePage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_27_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_27_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomePage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_27_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_28_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Slide Two' button");
			candidateHomeScreenPage.clickOnGoToSlideTwo(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
			candidateHomeScreenPage.clickOnSlideJoinNowButton("6",driver);
			
			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test3", driver);
			createdUsers.add(email);
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

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
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
			AddTest_IntoReport("TC_ID_28_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomePage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_28_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomePage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_28_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_28_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomePage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_28_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_29_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Slide Three' button");
			candidateHomeScreenPage.clickOnGoToSlideThree(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
			candidateHomeScreenPage.clickOnSlideJoinNowButton("8",driver);
			
			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test3", driver);
			createdUsers.add(email);
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

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
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
			AddTest_IntoReport("TC_ID_29_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomePage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_29_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomePage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_29_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_29_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomePage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_29_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_30_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Slide Four' button");
			candidateHomeScreenPage.clickOnGoToSlideFour(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
			candidateHomeScreenPage.clickOnSlideJoinNowButton("9",driver);
			
			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test3", driver);
			createdUsers.add(email);
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

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
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
			AddTest_IntoReport("TC_ID_30_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomePage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_30_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomePage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_30_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_30_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomePage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_30_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_31_AsAGuestUserVerifyTheGetMembershipButtonIsWorking() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Become An Member Join Now' button");
			candidateHomeScreenPage.clickOnBecomeAMemberWithJoinNowButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test3", driver);
			createdUsers.add(email);
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

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
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
			AddTest_IntoReport("TC_ID_31_AsAGuestUserVerifyTheGetMembershipButtonIsWorking",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_31_AsAGuestUserVerifyTheGetMembershipButtonIsWorking"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_31_AsAGuestUserVerifyTheGetMembershipButtonIsWorking",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_31_AsAGuestUserVerifyTheGetMembershipButtonIsWorking"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_31_AsAGuestUserVerifyTheGetMembershipButtonIsWorking",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_32_AsAGuestUserVerifyTheSearchJobButtonOnTheHomePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
	
			testSteps.add("Step " + step + " : Click on 'Search' button");
			candidateHomeScreenPage.clickOnSearchButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Search' page");
			assertTrue(candidateHomeScreenPage.isSearchJobBtnOnPage(driver),
					"Verified 'Login' button");
			step++;			
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_32_AsAGuestUserVerifyTheSearchJobButtonOnTheHomePage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_32_AsAGuestUserVerifyTheSearchJobButtonOnTheHomePage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_32_AsAGuestUserVerifyTheSearchJobButtonOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_32_AsAGuestUserVerifyTheSearchJobButtonOnTheHomePage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_32_AsAGuestUserVerifyTheSearchJobButtonOnTheHomePage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_33_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle1Text() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
	
			testSteps.add("Step " + step + " : Click on first article 'Read More' button");
			candidateHomeScreenPage.clickOnFirstArticleReadMore(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Search' page");
			assertTrue(candidateHomeScreenPage.isSearchJobBtnOnPage(driver),
					"Verified 'Login' button");
			step++;			
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_33_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle1Text",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_33_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle1Text"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_33_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle1Text",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_33_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle1Text"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_33_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle1Text",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_34_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle2Text() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified  'Logo' on Home Page'");
			step++;

			testSteps.add("Step " + step + " : Verify 'Login' button");
			assertTrue(candidateHomeScreenPage.isLoginButton(driver),
					"Verified 'Login' button");
			step++;
	
			testSteps.add("Step " + step + " : Click on second article 'Read More' button");
			candidateHomeScreenPage.clickOnSecondArticleReadMore(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Search' page");
			assertTrue(candidateHomeScreenPage.isSearchJobBtnOnPage(driver),
					"Verified 'Login' button");
			step++;			
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_34_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle2Text",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_34_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle2Text"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_34_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle2Text",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_34_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle2Text"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_34_AsAGuestUserVerifyTheReadMoreLinkOnTheHomeScreenBelowTheArticle2Text",
					testSteps, driver);
			assertTrue(false);
		}
	}

		
	@Test()
	public void TC_ID_35_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithJoinNowButtonOnPopUpBecomeAMedrepsMember() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateHomeScreenPage candidateHomeScreenPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
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

			testSteps.add("Step " + step + " : Verify 'Join Now' button");
			assertTrue(candidateHomeScreenPage.isJoinNowButton(driver),
					"Verified 'Join Now' button");
			
			testSteps.add("Step " + step + " : Click on 'Join Now' button");
			candidateHomeScreenPage.clickOnJoinNowButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName3", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test3", driver);
			createdUsers.add(email);
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

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
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
			AddTest_IntoReport("TC_ID_35_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithJoinNowButtonOnPopUpBecomeAMedrepsMember",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_35_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithJoinNowButtonOnPopUpBecomeAMedrepsMember"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_35_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithJoinNowButtonOnPopUpBecomeAMedrepsMember",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_35_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithJoinNowButtonOnPopUpBecomeAMedrepsMember"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_35_AsAGuestUserVerifyThatTheCandidateUserIsAbleToRegisterHerHimselfWithJoinNowButtonOnPopUpBecomeAMedrepsMember",
					testSteps, driver);
			assertTrue(false);
		}
	}
 
}
