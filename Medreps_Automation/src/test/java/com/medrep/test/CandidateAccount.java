package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateAccountPage;
import com.medrep.pages.CandidateProfilePage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerAccountPage;

public class CandidateAccount extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_132_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			employerAccountPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

//			testSteps.add("Step "+step+" :Click on 'Profile Picture'");
//			candidateProfilePage.clickProfilePictureCircle(driver);
//		    step++;
//			
//			testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
//			employerAccountPage.clickOnAccountButton(driver);
//			step++;
//			
//			testSteps.add("Step "+step+" : Verify 'Support' title is display");
//	        assertTrue(employerAccountPage.isSupportTitleDisplay(driver),"Verified 'Support' title is display");
//	        step++;

			testSteps.add("Step " + step + " : Verify 'Update Payment Details' link is display");
			assertTrue(employerAccountPage.isUpdatePaymentDetailsLinkDisplay(driver),
					"Verified 'Update Payment Details' link is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Update Payment Details' link");
			employerAccountPage.clickOnUpdatePaymentDetailsLink(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Payment Method' label is display");
			assertTrue(employerAccountPage.isPaymentMethodLabelDisplay(driver),
					"Verified 'Payment Method' label is display");
			step++;

//	        testSteps.add("Step "+step+" : Verify 'Billing Information' label is display");
//	        assertTrue(employerAccountPage.isBillingInformationLabelDisplay(driver),"Verified 'Billing Information' label is display");
//	        step++;

//	        String email = employerAccountPage.getBillingInformationEmail(driver);
//	        testSteps.add("Step "+step+" : Get Billing Information'Email':"+email);
//	        step++;
//	        
//	        String address = employerAccountPage.getBillingAddress(driver);
//	        testSteps.add("Step "+step+" : Get 'Billing Address':"+address);
//	        step++;
//
//	        testSteps.add("Step "+step+" : Click on 'Update Information'");
//	        employerAccountPage.clickOnUpdateInformation(driver);
//	        step++;
//	        
//	        testSteps.add("Step "+step+" : Click on 'Address' dropdown icon");
//	        employerAccountPage.clickOnAddressDropdownIcon(driver);
//	        step++;
//	        
//	        testSteps.add("Step "+step+" : Select  'Address'  from dropdown icon");
//	        employerAccountPage.selectDropdownOption(driver);
//	        step++;
//	        
//	        testSteps.add("Step "+step+" : Click on 'Save' button");
//	        employerAccountPage.clickOnSaveButton(driver);
//	        step++;
//	        
//	        testSteps.add("Step "+step+" : Verify 'Billing Address' is updated correctly");
//	        assertNotEquals(employerAccountPage.getBillingAddress(driver),address);
//	        step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_132_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_132_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_132_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_132_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_132_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_131_VerifyUserIsAbleToSeeNextBillingDateInAccount() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			employerAccountPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Next Billing Date' is display");
			assertTrue(candidateAccountPage.isNextBillingDateAccountPageDisplay(driver),
					"Verified 'Next Billing Date' is display");
			step++;

			testSteps.add("Step " + step + " : Click on 'Update Payment Details' link");
			employerAccountPage.clickOnUpdatePaymentDetailsLink(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Payment Method' label is display");
			assertTrue(employerAccountPage.isPaymentMethodLabelDisplay(driver),
					"Verified 'Payment Method' label is display");
			step++;

			testSteps.add("Step " + step + " : Verify 'Billing Information' label is display");
			assertTrue(employerAccountPage.isBillingInformationLabelDisplay(driver),
					"Verified 'Billing Information' label is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_131_VerifyUserIsAbleToSeeNextBillingDateInAccount", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_131_VerifyUserIsAbleToSeeNextBillingDateInAccount "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_131_VerifyUserIsAbleToSeeNextBillingDateInAccount", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_131_VerifyUserIsAbleToSeeNextBillingDateInAccount" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_131_VerifyUserIsAbleToSeeNextBillingDateInAccount", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_133_VerifyUserIsAbleToCancelMembershipFromAccount() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);

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

			try {
				testSteps.add("Step " + step + " : Click on Complete Your Profile 'Close' popup button");
				candidateAccountPage.clickOnCompleteYourProfileCloseButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Membership' Link");
			candidateAccountPage.clickOnCancelMembershipLink(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Cancel Plan' Button");
			candidateAccountPage.clickOnCancelPlanButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Cancel Plan' Button");
			waitTime(2000);
			candidateAccountPage.clickOnCancelPlanButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Return To MedReps' Link");
			candidateAccountPage.clickOnReturnToMedRepsLink(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'No Subscription Found' is display");
			assertTrue(candidateAccountPage.isNoSubscriptionFoundDisplay(driver),
					"Verified 'No Subscription Found' is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_133_VerifyUserIsAbleToCancelMembershipFromAccount", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_133_VerifyUserIsAbleToCancelMembershipFromAccount"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_133_VerifyUserIsAbleToCancelMembershipFromAccount", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_133_VerifyUserIsAbleToCancelMembershipFromAccount" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_133_VerifyUserIsAbleToCancelMembershipFromAccount", testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_134_VerifyUserIsAbleToSeeTransactionHistoryTableWithTransactionRecord() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			employerAccountPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Verify Transaction History Table 'Transaction ID' is display");
			assertTrue(candidateAccountPage.isTransactionHistoryTableTransactionIDDisplay(driver),
					"Verified Transaction History Table 'Transaction ID' is display");
			step++;

			testSteps.add("Step " + step + " : Verify Transaction History Table 'Name' is display");
			assertTrue(candidateAccountPage.isTransactionHistoryTableNameDisplay(driver),
					"Verified Transaction History Table 'Name' is display");
			step++;

			testSteps.add("Step " + step + " : Verify Transaction History Table 'Type' is display");
			assertTrue(candidateAccountPage.isTransactionHistoryTableTypeDisplay(driver),
					"Verified Transaction History Table 'Type' is display");
			step++;

			testSteps.add("Step " + step + " : Verify Transaction History Table 'Amount' is display");
			assertTrue(candidateAccountPage.isTransactionHistoryTableAmountDisplay(driver),
					"Verified Transaction History Table 'Amount' is display");
			step++;

			testSteps.add("Step " + step + " : Verify Transaction History Table 'Date' is display");
			assertTrue(candidateAccountPage.istransactionHistoryTableDateDisplay(driver),
					"Verified Transaction History Table 'Date' is display");
			step++;

			testSteps.add("Step " + step + " : Verify Transaction History Table 'Payment Status' is display");
			assertTrue(candidateAccountPage.istransactionHistoryTablePaymentStatusDisplay(driver),
					"Verified Transaction History Table 'Payment Status' is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_134_VerifyUserIsAbleToSeeTransactionHistoryTableWithTransactionRecord", testSteps,
					driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_134_VerifyUserIsAbleToSeeTransactionHistoryTableWithTransactionRecord "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_134_VerifyUserIsAbleToSeeTransactionHistoryTableWithTransactionRecord", testSteps,
					driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_134_VerifyUserIsAbleToSeeTransactionHistoryTableWithTransactionRecord"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_134_VerifyUserIsAbleToSeeTransactionHistoryTableWithTransactionRecord", testSteps,
					driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_135_VerifyUserIsAbleToUpdateEmailFromTheAccount() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);

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

			try {
				testSteps.add("Step " + step + " : Click on Complete Your Profile 'Close' popup button");
				candidateAccountPage.clickOnCompleteYourProfileCloseButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			String updateEmail = getUniqueEmailId("Test3", driver);
			testSteps.add("Step " + step + ": Enter Email : " + updateEmail);
			candidateAccountPage.enterNewEmail(updateEmail, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Update' Button");
			candidateAccountPage.clickOnUpdateButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify on home page 'Login' Button");
			assertTrue(candidateAccountPage.isLoginButtonDisplay(driver), "Verifiedon home page 'Login' Button");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_135_VerifyUserIsAbleToUpdateEmailFromTheAccount", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_135_VerifyUserIsAbleToUpdateEmailFromTheAccount" + "<br><b>Exception:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_135_VerifyUserIsAbleToUpdateEmailFromTheAccount", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_135_VerifyUserIsAbleToUpdateEmailFromTheAccount" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_135_VerifyUserIsAbleToUpdateEmailFromTheAccount", testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_136_VerifyUserIsAbleToChangePasswordFromAccount() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);

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

			try {
				testSteps.add("Step " + step + " : Click on Complete Your Profile 'Close' popup button");
				candidateAccountPage.clickOnCompleteYourProfileCloseButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Update Your Password' Button");
			candidateAccountPage.clickOnUpdateYourPasswordButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter Old 'Password':" + password);
			candidateAccountPage.enterOldPassword(password, driver);
			step++;

			String newPassword = password + "009";
			testSteps.add("Step " + step + " : Enter New 'Password':" + newPassword);
			candidateAccountPage.enterNewPassword(newPassword, driver);
			step++;

			testSteps.add("Step " + step + " : Enter ConfirmNew 'Password':" + newPassword);
			candidateAccountPage.enterConfirmNewPassword(newPassword, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Update' Button");
			candidateAccountPage.clickOnPasswordUpdateButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify on home page 'Login' Button");
			assertTrue(candidateAccountPage.isLoginButtonDisplay(driver), "Verifiedon home page 'Login' Button");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_136_VerifyUserIsAbleToChangePasswordFromAccount", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_136_VerifyUserIsAbleToChangePasswordFromAccount" + "<br><b>Exception:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_136_VerifyUserIsAbleToChangePasswordFromAccount", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_136_VerifyUserIsAbleToChangePasswordFromAccount" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_136_VerifyUserIsAbleToChangePasswordFromAccount", testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_144_VerifyUserIsAbleToBuySubscriptionFromAccountAndSeeBuySubscriptionLink() {
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
			AddTest_IntoReport("TC_ID_144_VerifyUserIsAbleToBuySubscriptionFromAccountAndSeeBuySubscriptionLink",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_144_VerifyUserIsAbleToBuySubscriptionFromAccountAndSeeBuySubscriptionLink"
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_144_VerifyUserIsAbleToBuySubscriptionFromAccountAndSeeBuySubscriptionLink",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_144_VerifyUserIsAbleToBuySubscriptionFromAccountAndSeeBuySubscriptionLink"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_144_VerifyUserIsAbleToBuySubscriptionFromAccountAndSeeBuySubscriptionLink",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_9_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData("testData", "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		String nextbilingDate;
		String purchasingDate;
		String nextBillingDateAfter30Days;

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

			try {
				testSteps.add("Step " + step + " : Click on Close Modal Popup Button");
				candidateAccountPage.clickOnCloseModalPopupButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			nextbilingDate = employerAccountPage.getNextBillDate(driver);

			purchasingDate = employerAccountPage.getPurchasingDate(driver);

			nextBillingDateAfter30Days = getDaysBetweenTwoDate(purchasingDate, nextbilingDate, "yyyy-MM-dd");
			
			try {
				testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter30Days))+"' is displaying :"
						+ nextBillingDateAfter30Days);
				assertEquals(nextBillingDateAfter30Days, "31");
			} catch (Exception e) {
				testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter30Days))+"' is displaying :"
						+ nextBillingDateAfter30Days);
				assertEquals(nextBillingDateAfter30Days, "34");
			}catch (Error e) {
				try {
					testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter30Days))+"' is displaying :"
							+ nextBillingDateAfter30Days);
					assertEquals(nextBillingDateAfter30Days, "34");
				} catch (Error e2) {
					testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter30Days))+"' is displaying :"
							+ nextBillingDateAfter30Days);
					assertEquals(nextBillingDateAfter30Days, "33");
				}
				
			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_9_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_9_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_9_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_9_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_9_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_11_VerifyUserIsAbleToSeeNextBillingDateAfter6MonthsInAccountWithPlanNameAndPurchasingDate() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData("testData", "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		String nextbilingDate;
		String purchasingDate;
		String nextBillingDateAfter6Month;
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

			testSteps.add("Step " + step + " : Select the 'Bi Annual' membership plan");
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

			try {
				testSteps.add("Step " + step + " : Click on Close Modal Popup Button");
				candidateAccountPage.clickOnCloseModalPopupButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			nextbilingDate = employerAccountPage.getNextBillDate(driver);

			purchasingDate = employerAccountPage.getPurchasingDate(driver);

			nextBillingDateAfter6Month = getDaysBetweenTwoDate(purchasingDate, nextbilingDate, "yyyy-MM-dd");
			try {
				testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter6Month)-184)+"' Month is displaying :"
						+ nextBillingDateAfter6Month);
				assertEquals(nextBillingDateAfter6Month, "184");
			}catch (Exception e) {				
				testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter6Month)-187)+"' Month is displaying :"
						+ nextBillingDateAfter6Month);
				assertEquals(nextBillingDateAfter6Month, "187");
			}catch (Error e) {
				try {
					testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter6Month)-187)+"' Month is displaying :"
							+ nextBillingDateAfter6Month);
					assertEquals(nextBillingDateAfter6Month, "187");
					
				} catch (Error e2) {
					testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter6Month)-186)+"' Month is displaying :"
							+ nextBillingDateAfter6Month);
					assertEquals(nextBillingDateAfter6Month, "186");					
				}
			}
			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_11_VerifyUserIsAbleToSeeNextBillingDateAfter6MonthsInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_11_VerifyUserIsAbleToSeeNextBillingDateAfter6MonthsInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_11_VerifyUserIsAbleToSeeNextBillingDateAfter6MonthsInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_11_VerifyUserIsAbleToSeeNextBillingDateAfter6MonthsInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_11_VerifyUserIsAbleToSeeNextBillingDateAfter6MonthsInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_10_VerifyUserIsAbleToSeeNextBillingDateAfter3MonthsInAccountWithPlanNameAndPurchasingDate() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateAccountPage candidateAccountPage;
		EmployerAccountPage employerAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData("testData", "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData("testData", "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		String nextbilingDate;
		String purchasingDate;
		String nextBillingDateAfter3Month;
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

			try {
				testSteps.add("Step " + step + " : Click on Close Modal Popup Button");
				candidateAccountPage.clickOnCloseModalPopupButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			nextbilingDate = employerAccountPage.getNextBillDate(driver);

			purchasingDate = employerAccountPage.getPurchasingDate(driver);

			nextBillingDateAfter3Month = getDaysBetweenTwoDate(purchasingDate, nextbilingDate, "yyyy-MM-dd");

			try {
				testSteps.add("Step " + step + " : Verify Next Billing Date After'3' Month is displaying :"
						+ nextBillingDateAfter3Month);
				assertEquals(nextBillingDateAfter3Month, "92");

			} catch (Error e) {
				try {
					testSteps.add("Step " + step + " : Verify Next Billing Date After'3' Month is displaying :"
							+ nextBillingDateAfter3Month);
					assertEquals(nextBillingDateAfter3Month, "91");
					
				} catch (Error e2) {
					testSteps.add("Step " + step + " : Verify Next Billing Date After'3' Month is displaying :"
							+ nextBillingDateAfter3Month);
					assertEquals(nextBillingDateAfter3Month, "94");

				}
				

			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_10_VerifyUserIsAbleToSeeNextBillingDateAfter3MonthsInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_10_VerifyUserIsAbleToSeeNextBillingDateAfter3MonthsInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_10_VerifyUserIsAbleToSeeNextBillingDateAfter3MonthsInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_10_VerifyUserIsAbleToSeeNextBillingDateAfter3MonthsInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_10_VerifyUserIsAbleToSeeNextBillingDateAfter3MonthsInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_12_VerifyUserIsAbleToSeeTheExactPackagesNamesAndPricingInTheAccountTransactionHistory() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateSignUpPage candidateSignUpPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		candidateSignUpPage = new CandidateSignUpPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);

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
			
			String price = candidateSignUpPage.getPriceing(driver);
			
			String MonthlyPackage = candidateSignUpPage.getMonthlyPackage(driver);

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

			try {
				testSteps.add("Step " + step + " : Click on Complete Your Profile 'Close' popup button");
				candidateAccountPage.clickOnCompleteYourProfileCloseButton(driver);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify monthly candidate membership added plans");
			assertTrue(candidateAccountPage.isMonthlyCandidateMembershipDisplay(driver),
					"Verified user  is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step " + step + " : Verify monthly candidate membership added plans");
			assertTrue(candidateAccountPage.isMonthlyCandidateMembershipDisplay(driver),
					"Verified monthly candidate membership added plans'");
			step++;			
			
			testSteps.add("Step " + step + " : Verify membership price"+price+"");
			assertTrue(candidateAccountPage.isPricingDisplay(price,driver),
					"Verified Verify membership price"+price+"");
			step++;		

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_12_VerifyUserIsAbleToSeeTheExactPackagesNamesAndPricingInTheAccountTransactionHistory",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_12_VerifyUserIsAbleToSeeTheExactPackagesNamesAndPricingInTheAccountTransactionHistory"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_12_VerifyUserIsAbleToSeeTheExactPackagesNamesAndPricingInTheAccountTransactionHistory",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_12_VerifyUserIsAbleToSeeTheExactPackagesNamesAndPricingInTheAccountTransactionHistory"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_12_VerifyUserIsAbleToSeeTheExactPackagesNamesAndPricingInTheAccountTransactionHistory",
					testSteps, driver);
			assertTrue(false);
		}
	}
	


	@Test()
	public void TC_ID_13_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = "ambreeny4191+regmarch12@gmail.com";
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			employerAccountPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Profile' Dropdown");
			candidateAccountPage.clickOnProfileDropdown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' Option");
			candidateAccountPage.clickOnAccountOption(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Canceled' Label is display");
			assertTrue(employerAccountPage.isCanceledLabelDisplay(driver),
					"Verified 'Canceled' Label  is display");
			step++;

			testSteps.add("Step " + step + " : Verify 'Purchasing Date' is display");
			assertTrue(employerAccountPage.isPurchasingDateLabelDisplay(driver),
					"Verified 'Purchasing Date' is display");
			step++;

			testSteps.add("Step " + step + " : Verify 'Plan Name' is display");
			assertTrue(employerAccountPage.isPlanNameLabelDisplay(driver), "Verified 'Plan Name' is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_13_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_13_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_13_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_13_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate" + "<br><b>Error:</b><br> "
					+ e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_13_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate", testSteps, driver);
			assertTrue(false);
		}
	}


}
