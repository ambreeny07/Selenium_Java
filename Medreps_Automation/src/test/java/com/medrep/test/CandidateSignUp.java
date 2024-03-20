package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateSignUpPage;

public class CandidateSignUp extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_13_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionPackage() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
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
				step++;
			} catch (Exception e) {
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
			AddTest_IntoReport(
					"TC_ID_13_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionPackage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_13_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionPackage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_13_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_13_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionPackage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_13_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_14_VerifyThatUserIsAbleToCreateNewCandidateAccountForQuarterly$2999SubscriptionPackage() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create an Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create A free Account ' button display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Create an Account' button");
			candidateSignUpPage.clickOnCreateAFreeAccount(driver);
			step++;

			testSteps.add("Step " + step + " : Check on 'Quarterly' check box");
			candidateSignUpPage.checkEveryThreeMonthsCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName2", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName2", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test2", driver);
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
				step++;
			} catch (Exception e) {
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
			AddTest_IntoReport(
					"TC_ID_14_VerifyThatUserIsAbleToCreateNewCandidateAccountForQuarterly$2999SubscriptionPackage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_14_VerifyThatUserIsAbleToCreateNewCandidateAccountForQuarterly$2999SubscriptionPackage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_14_VerifyThatUserIsAbleToCreateNewCandidateAccountForQuarterly$2999SubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_14_VerifyThatUserIsAbleToCreateNewCandidateAccountForQuarterly$2999SubscriptionPackage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_14_VerifyThatUserIsAbleToCreateNewCandidateAccountForQuarterly$2999SubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_15_VerifyThatUserIsAbleToCreateNewCandidateAccountForMonthly$1999SubscriptionPackage() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create A free Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create A free Account ' button display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Create A free Account' button");
			candidateSignUpPage.clickOnCreateAFreeAccount(driver);
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
				step++;
			} catch (Exception e) {
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
			AddTest_IntoReport(
					"TC_ID_15_VerifyThatUserIsAbleToCreateNewCandidateAccountForMonthly$1999SubscriptionPackage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_15_VerifyThatUserIsAbleToCreateNewCandidateAccountForMonthly$1999SubscriptionPackage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_15_VerifyThatUserIsAbleToCreateNewCandidateAccountForMonthly$1999SubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_15_VerifyThatUserIsAbleToCreateNewCandidateAccountForMonthly$1999SubscriptionPackage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_15_VerifyThatUserIsAbleToCreateNewCandidateAccountForMonthly$1999SubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_11_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithMembership() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
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
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnRegisterButton(driver);
			step++;

//			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
//			waitTime(5000, driver);
//			candidateSignUpPage.enterCardNumber(cardNumber, driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
//			candidateSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
//			candidateSignUpPage.enterCardCvcNumber(cardCvc, driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
//			candidateSignUpPage.enterNameOnCard(nameOnCard, driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
//			candidateSignUpPage.clickOnCountryDropDown(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
//			candidateSignUpPage.clickOnPakistanOption(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Click on 'Subscribe' button.");
//			candidateSignUpPage.clickOnPayButton(driver);
//			step++;
//
//			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
//			waitTime(4000, driver);
//			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
//					"Verified user  is redirected to the'Home Page'");
//			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_11_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithMembership",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_11_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithMembership"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_11_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithMembership",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_11_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithMembership"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_11_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithMembership",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_16_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionCycle() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
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
				step++;
			} catch (Exception e) {
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
			AddTest_IntoReport(
					"TC_ID_16_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionCycle",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_16_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionCycle"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_16_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionCycle",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_16_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionCycle"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_16_VerifyThatUserIsAbleToCreateNewCandidateAccountForBiAnnual$5299SubscriptionCycle",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_12_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithoutMembership() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
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
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnRegisterButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Back' button");
			candidateSignUpPage.clickOnBackButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_12_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithoutMembership",
					testSteps, driver);

		} catch (Exception e) {
			testSteps
					.add("Failed: TC_ID_12_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithoutMembership"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_12_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithoutMembership",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps
					.add("Failed: TC_ID_12_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithoutMembership"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_12_VerifyUserShouldBeAbleSignupForCandidateAccountSuccessfullyWithoutMembership",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_17_VerifyThatUserIsAbleToDoMemberSignUpForQuarterly$2999MembershipCycle() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create an Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create A free Account ' button display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Create an Account' button");
			candidateSignUpPage.clickOnCreateAFreeAccount(driver);
			step++;

			testSteps.add("Step " + step + " : Check on 'Quarterly' check box");
			candidateSignUpPage.checkEveryThreeMonthsCheckBox(driver);
			step++;

			String firstName = getUniqueData("TestName2", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName2", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test2", driver);
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
				step++;
			} catch (Exception e) {
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
			AddTest_IntoReport("TC_ID_17_VerifyThatUserIsAbleToDoMemberSignUpForQuarterly$2999MembershipCycle",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_17_VerifyThatUserIsAbleToDoMemberSignUpForQuarterly$2999MembershipCycle"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_17_VerifyThatUserIsAbleToDoMemberSignUpForQuarterly$2999MembershipCycle",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_17_VerifyThatUserIsAbleToDoMemberSignUpForQuarterly$2999MembershipCycle"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_17_VerifyThatUserIsAbleToDoMemberSignUpForQuarterly$2999MembershipCycle",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_18_VerifyThatUserIsAbletoDoMemberSignUpForMonthly$1999MembershipCycle() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
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

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create A free Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create A free Account ' button display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Create A free Account' button");
			candidateSignUpPage.clickOnCreateAFreeAccount(driver);
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
				step++;
			} catch (Exception e) {
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
			AddTest_IntoReport("TC_ID_18_VerifyThatUserIsAbletoDoMemberSignUpForMonthly$1999MembershipCycle", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_18_VerifyThatUserIsAbletoDoMemberSignUpForMonthly$1999MembershipCycle"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_18_VerifyThatUserIsAbletoDoMemberSignUpForMonthly$1999MembershipCycle", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_18_VerifyThatUserIsAbletoDoMemberSignUpForMonthly$1999MembershipCycle"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_18_VerifyThatUserIsAbletoDoMemberSignUpForMonthly$1999MembershipCycle", testSteps,
					driver);
			assertTrue(false);
		}

	}

//	@Test()
	public void TC_ID_19_VerifyThatUserIsAbleToDoMemberSignUpBySkippingMembershipCycle() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		String password = dataArr[0][0].toString();

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Join Now' button");
			candidateSignUpPage.clickOnJoinNowButton(driver);
			step++;

			String email = getUniqueEmailId("Test7", driver);
			createdUsers.add(email);
			testSteps.add("Step " + step + ": Enter Email : " + email);
			candidateSignUpPage.enterCandidateEmail(email, driver);
			step++;

			testSteps.add("Step " + step + ": Enter Confirm Email  : " + email);
			candidateSignUpPage.enterConfirmEmail(email, driver);
			step++;

			String firstName = getUniqueData("TestName7", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterCandidateFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName7", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterCandidateLastName(lastName, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			candidateSignUpPage.enterCandidatePassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Confirm Password':" + password);
			candidateSignUpPage.enterCandidateComfirmPassword(password, driver);
			step++;

			try {
				testSteps.add("Step " + step + " : Check 'Marketing Preferences' check box");
				candidateSignUpPage.checkMarketingPreferencesCheckBox(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Check 'Agree to the Term & Conditions' check box");
			candidateSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'SignUp' button");
			candidateSignUpPage.clickOnSignUpButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(4000, driver);
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_19_VerifyThatUserIsAbleToDoMemberSignUpBySkippingMembershipCycle", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_19_VerifyThatUserIsAbleToDoMemberSignUpBySkippingMembershipCycle"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_19_VerifyThatUserIsAbleToDoMemberSignUpBySkippingMembershipCycle", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_19_VerifyThatUserIsAbleToDoMemberSignUpBySkippingMembershipCycle"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_19_VerifyThatUserIsAbleToDoMemberSignUpBySkippingMembershipCycle", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_20_VerifyThatUserIsAbleToCreateNewCandidateAccountWithoutSelectingAnySubscriptionPackage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		String password = dataArr[0][0].toString();

		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			candidateSignUpPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Create A free Account ' button display");
			assertTrue(candidateSignUpPage.isCreateAFreeAccountButtonDisplay(driver),
					"Verified 'Create A free Account ' button display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Create A free Account' button");
			candidateSignUpPage.clickOnCreateAFreeAccount(driver);
			step++;

			String firstName = getUniqueData("TestName9", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
			candidateSignUpPage.enterFirstName(firstName, driver);
			step++;

			String lastName = getUniqueData("TestName9", driver);
			testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
			candidateSignUpPage.enterLastName(lastName, driver);
			step++;

			String email = getUniqueEmailId("Test9", driver);
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
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Check 'Agree to the Term & Conditions' check box");
			candidateSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnSignUpButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			waitTime(4000, driver);
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_20_VerifyThatUserIsAbleToCreateNewCandidateAccountWithoutSelectingAnySubscriptionPackage",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_20_VerifyThatUserIsAbleToCreateNewCandidateAccountWithoutSelectingAnySubscriptionPackage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_20_VerifyThatUserIsAbleToCreateNewCandidateAccountWithoutSelectingAnySubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_20_VerifyThatUserIsAbleToCreateNewCandidateAccountWithoutSelectingAnySubscriptionPackage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_20_VerifyThatUserIsAbleToCreateNewCandidateAccountWithoutSelectingAnySubscriptionPackage",
					testSteps, driver);
			assertTrue(false);
		}
	}

}
