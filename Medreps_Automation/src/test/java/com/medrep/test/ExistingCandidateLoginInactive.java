package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateSignUpPage;

public class ExistingCandidateLoginInactive extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_21_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMembershipBiAnnual$5299Plan() {

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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnRegisterButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' dropdown");
			waitTime(4000, driver);
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateSignUpPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'BuySubscription' Link");
			candidateSignUpPage.clickOnBuySubscriptionLink(driver);
			step++;

			testSteps.add("Step " + step + " : Select the 'Bi Annual' plan");
			candidateSignUpPage.checkBiAnnualCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			candidateSignUpPage.clickOnPayButton(driver);
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
					"TC_ID_21_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMembershipBiAnnual$5299Plan",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_21_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMembershipBiAnnual$5299Plan"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_21_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMembershipBiAnnual$5299Plan",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_21_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMembershipBiAnnual$5299Plan"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_21_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMembershipBiAnnual$5299Plan",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_22_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForQuarterly$2999Plan() {

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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnRegisterButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' dropdown");
			waitTime(4000, driver);
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateSignUpPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'BuySubscription' Link");
			candidateSignUpPage.clickOnBuySubscriptionLink(driver);
			step++;

			testSteps.add("Step " + step + " : Check on 'Quarterly' check box");
			candidateSignUpPage.checkEveryThreeMonthsCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			candidateSignUpPage.clickOnPayButton(driver);
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
					"TC_ID_22_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForQuarterly$2999Plan",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_22_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForQuarterly$2999Plan"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_22_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForQuarterly$2999Plan",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_22_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForQuarterly$2999Plan"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_22_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForQuarterly$2999Plan",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_23_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthly$1999Plan() {

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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Register' button");
			candidateSignUpPage.clickOnRegisterButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' dropdown");
			waitTime(4000, driver);
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateSignUpPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'BuySubscription' Link");
			candidateSignUpPage.clickOnBuySubscriptionLink(driver);
			step++;

			testSteps.add("Step " + step + " : Check on 'Monthly' check box");
			candidateSignUpPage.checkEveryMonthCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			candidateSignUpPage.clickOnPayButton(driver);
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
					"TC_ID_23_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthly$1999Plan",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_23_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthly$1999Plan"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_23_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthly$1999Plan",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_23_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthly$1999Plan"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_23_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthly$1999Plan",
					testSteps, driver);
			assertTrue(false);
		}
	}

}
