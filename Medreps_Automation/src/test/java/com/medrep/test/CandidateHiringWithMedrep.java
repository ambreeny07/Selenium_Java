package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateAccountPage;
import com.medrep.pages.CandidateHiringWithMedrepPage;
import com.medrep.pages.CandidateProfilePage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerAccountPage;
import com.medrep.pages.EmployerPostedJobsPage;

public class CandidateHiringWithMedrep extends BaseClass{
	String tempSrc = "";

		@Test()
		public void TC_ID_146_VerifyAsAGuestUserIAmAbleToRedirectedHiringWithMedrepPageByClickingOnPostJobFromNavigationPanel() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	    try {
	     	int step=1;
			
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
					
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_146_VerifyAsAGuestUserIAmAbleToRedirectedHiringWithMedrepPageByClickingOnPostJobFromNavigationPanel", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_146_VerifyAsAGuestUserIAmAbleToRedirectedHiringWithMedrepPageByClickingOnPostJobFromNavigationPanel " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_146_VerifyAsAGuestUserIAmAbleToRedirectedHiringWithMedrepPageByClickingOnPostJobFromNavigationPanel", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_146_VerifyAsAGuestUserIAmAbleToRedirectedHiringWithMedrepPageByClickingOnPostJobFromNavigationPanel" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_146_VerifyAsAGuestUserIAmAbleToRedirectedHiringWithMedrepPageByClickingOnPostJobFromNavigationPanel", testSteps, driver);
			assertTrue(false);
		  }
	    }

		@Test()
		public void TC_ID_147_VerifyAsAGuestUserIAmAbleToPurchaseMonthlyPlanFromHiringWithMedrepPage() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			CandidateSignUpPage candidateSignUpPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        candidateSignUpPage = new CandidateSignUpPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
	        
	    try {
	     	int step=1;
			
	     	navigateToURL(memberurl, driver);
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Get Monthly Plan'Button");
			candidateHiringWithMedrepPage.clickOnGetMonthlyPlanButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Monthly Day Single Job Posting' checkbox");
			candidateHiringWithMedrepPage.clickOnMonthlyDaySingleJobPostingCheckbox(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Add Ons' checkbox");
			candidateHiringWithMedrepPage.clickOnAddOnsCheckbox(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Checkout' button");
			candidateHiringWithMedrepPage.clickOnCheckoutButton(driver);
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
					
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_147_VerifyAsAGuestUserIAmAbleToPurchaseMonthlyPlanFromHiringWithMedrepPage", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_147_VerifyAsAGuestUserIAmAbleToPurchaseMonthlyPlanFromHiringWithMedrepPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_147_VerifyAsAGuestUserIAmAbleToPurchaseMonthlyPlanFromHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_147_VerifyAsAGuestUserIAmAbleToPurchaseMonthlyPlanFromHiringWithMedrepPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_147_VerifyAsAGuestUserIAmAbleToPurchaseMonthlyPlanFromHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		  }
	    }
		
		@Test()
		public void TC_ID_148_VerifyAsAGuestUserIAmAbleToPurchaseAnnualPlanFromHiringWithMedrepPage() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			CandidateSignUpPage candidateSignUpPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        candidateSignUpPage = new CandidateSignUpPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
	        
	    try {
	     	int step=1;
			
	     	navigateToURL(memberurl, driver);
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Get Annual Plan'Button");
			candidateHiringWithMedrepPage.clickOnGetAnnualPlanButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Monthly Day Single Job Posting' checkbox");
			candidateHiringWithMedrepPage.clickOnMonthlyDaySingleJobPostingCheckbox(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Add Ons' checkbox");
			candidateHiringWithMedrepPage.clickOnAddOnsCheckbox(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Checkout' button");
			candidateHiringWithMedrepPage.clickOnCheckoutButton(driver);
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
			
					
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_148_VerifyAsAGuestUserIAmAbleToPurchaseAnnualPlanFromHiringWithMedrepPage", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_148_VerifyAsAGuestUserIAmAbleToPurchaseAnnualPlanFromHiringWithMedrepPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_148_VerifyAsAGuestUserIAmAbleToPurchaseAnnualPlanFromHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_148_VerifyAsAGuestUserIAmAbleToPurchaseAnnualPlanFromHiringWithMedrepPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_148_VerifyAsAGuestUserIAmAbleToPurchaseAnnualPlanFromHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		  }
	    }
		
		@Test()
		public void TC_ID_149_VerifyUserIsAbleToBuyAddOnByClickingOnThePostNowButtonAvailableOnTheMiddleOfHiringWithMedrepScreen() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			CandidateSignUpPage candidateSignUpPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        candidateSignUpPage = new CandidateSignUpPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
	        
	    try {
	     	int step=1;
			
	     	navigateToURL(memberurl, driver);
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Post Now' Button");
			candidateHiringWithMedrepPage.clickOnPostNowButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Monthly Day Single Job Posting' checkbox");
			candidateHiringWithMedrepPage.clickOnMonthlyDaySingleJobPostingCheckbox(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Add Ons' checkbox");
			candidateHiringWithMedrepPage.clickOnAddOnsCheckbox(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Checkout' button");
			candidateHiringWithMedrepPage.clickOnCheckoutButton(driver);
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
			
					
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_149_VerifyUserIsAbleToBuyAddOnByClickingOnThePostNowButtonAvailableOnTheMiddleOfHiringWithMedrepScreen", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_149_VerifyUserIsAbleToBuyAddOnByClickingOnThePostNowButtonAvailableOnTheMiddleOfHiringWithMedrepScreen " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_149_VerifyUserIsAbleToBuyAddOnByClickingOnThePostNowButtonAvailableOnTheMiddleOfHiringWithMedrepScreen", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_149_VerifyUserIsAbleToBuyAddOnByClickingOnThePostNowButtonAvailableOnTheMiddleOfHiringWithMedrepScreen" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_149_VerifyUserIsAbleToBuyAddOnByClickingOnThePostNowButtonAvailableOnTheMiddleOfHiringWithMedrepScreen", testSteps, driver);
			assertTrue(false);
		  }
	    }
		
		@Test()
		public void TC_ID_150_VerifyUserIsAbleToSignupToTheMedrepsFromTheSignupSectionAvailableOnTheHiringWithMedrepScreen() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			CandidateSignUpPage candidateSignUpPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        candidateSignUpPage = new CandidateSignUpPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
	        
	    try {
	     	int step=1;
			
	     	navigateToURL(memberurl, driver);
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Sign Up' Button");
			candidateHiringWithMedrepPage.clickOnSignUpButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Monthly Day Single Job Posting' checkbox");
			candidateHiringWithMedrepPage.clickOnMonthlyDaySingleJobPostingCheckbox(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
			step++;			
			
			testSteps.add("Step "+step+" : Click on 'Add Ons' checkbox");
			candidateHiringWithMedrepPage.clickOnAddOnsCheckbox(driver);
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Next' checkbox");
			candidateHiringWithMedrepPage.clickOnNextButton(driver);
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

			testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
			candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Checkout' button");
			candidateHiringWithMedrepPage.clickOnCheckoutButton(driver);
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
			
					
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_150_VerifyUserIsAbleToSignupToTheMedrepsFromTheSignupSectionAvailableOnTheHiringWithMedrepScreen", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_150_VerifyUserIsAbleToSignupToTheMedrepsFromTheSignupSectionAvailableOnTheHiringWithMedrepScreen " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_150_VerifyUserIsAbleToSignupToTheMedrepsFromTheSignupSectionAvailableOnTheHiringWithMedrepScreen", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_150_VerifyUserIsAbleToSignupToTheMedrepsFromTheSignupSectionAvailableOnTheHiringWithMedrepScreen" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_150_VerifyUserIsAbleToSignupToTheMedrepsFromTheSignupSectionAvailableOnTheHiringWithMedrepScreen", testSteps, driver);
			assertTrue(false);
		  }
	    }
		
		@Test()
		public void TC_ID_151_VerifyUserIsAbleToSeeFAQSectionOnTheHiringWithMedrepPage() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			CandidateSignUpPage candidateSignUpPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        candidateSignUpPage = new CandidateSignUpPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
	        
	    try {
	     	int step=1;
			
	     	navigateToURL(memberurl, driver);
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
			
			testSteps.add("Step "+step+" : Verify 'FAQ' Section is display");
			assertTrue(candidateHiringWithMedrepPage.isSectionFAQDisplay(driver),"Verified 'FAQ' Section is display");
			step++;			
					
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_151_VerifyUserIsAbleToSeeFAQSectionOnTheHiringWithMedrepPage", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_151_VerifyUserIsAbleToSeeFAQSectionOnTheHiringWithMedrepPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_151_VerifyUserIsAbleToSeeFAQSectionOnTheHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_151_VerifyUserIsAbleToSeeFAQSectionOnTheHiringWithMedrepPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_151_VerifyUserIsAbleToSeeFAQSectionOnTheHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		  }
	    }

		@Test()
		public void TC_ID_152_VerifyUserIsAbleToSendAnyQueryUsingContactFormAvailableOnTheHiringWithMedrepPage() {
	
			WebDriver driver = null;
		    ArrayList<String> testSteps = new ArrayList<>();
			EmployerPostedJobsPage employerPostedJobsPage;
			CandidateHiringWithMedrepPage candidateHiringWithMedrepPage;
			CandidateSignUpPage candidateSignUpPage;
			
			driver = initConfiguration();
	        employerPostedJobsPage = new EmployerPostedJobsPage(driver);
	        candidateHiringWithMedrepPage = new CandidateHiringWithMedrepPage(driver);
	        candidateSignUpPage = new CandidateSignUpPage(driver);
	        
	        navigateToURL(appurl, driver);
			
			Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	        String emailAddress=dataArr[0][0].toString();
	        String password=dataArr[0][1].toString(); 
	        String firstName="Test";
	        String lastName="User";
	        String CompanyName="Test Company";
	        String jobTitle="Test Company";
	        String phoneNumber="+923488188884";
	        String message="Test";
	        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
	        
	    try {
	     	int step=1;
			
	     	navigateToURL(memberurl, driver);
			testSteps.add("Step "+step+" : Click on 'Posted Jobs' button");
			candidateHiringWithMedrepPage.clickOnPostjobsNavigationButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Hiring With Medreps' page");
			assertTrue(candidateHiringWithMedrepPage.isHiringWithMedrepsPageDisplay(driver),"Verified 'Hiring With Medreps' page");
			step++;
			
			testSteps.add("Step " + step + ": Enter First Name  : " + firstName);
			candidateHiringWithMedrepPage.enterFirstName(firstName, driver);
			step++;
			
			testSteps.add("Step " + step + ": Enter Last Name  : " + lastName);
			candidateHiringWithMedrepPage.enterLastName(lastName, driver);
			step++;
			
			String email = getUniqueEmailGmailId("Test1", driver);
			createdUsers.add(email);
			testSteps.add("Step " + step + ": Enter Email : " + email);
			candidateHiringWithMedrepPage.enterEmail(email, driver);
			step++;
			
			testSteps.add("Step " + step + ": Enter Company Name  : " + CompanyName);
			candidateHiringWithMedrepPage.enterCompany(CompanyName, driver);
			step++;
			
			testSteps.add("Step " + step + ": Enter Job Title : " + lastName);
			candidateHiringWithMedrepPage.enterJobTitle(lastName, driver);
			step++;			
			
			testSteps.add("Step " + step + ": Enter Phone : " + phoneNumber);
			candidateHiringWithMedrepPage.enterPhone(phoneNumber, driver);
			step++;	

			testSteps.add("Step " + step + ": Enter Message : " + message);
			candidateHiringWithMedrepPage.enterMessage(message, driver);
			step++;	
			
			testSteps.add("Step "+step+" : Click on 'Submit' button");
			candidateHiringWithMedrepPage.clickOnSubmitButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify 'Thanks For Submitting The Form' message");
			assertTrue(candidateHiringWithMedrepPage.isThanksForSubmittingTheFormLblDisplay(driver),"Verified 'Thanks For Submitting The Form' message");
			step++;			
			
			testSteps.add("Step "+step+" : Close the Browser");
			
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_152_VerifyUserIsAbleToSendAnyQueryUsingContactFormAvailableOnTheHiringWithMedrepPage", testSteps, driver);
	
		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_152_VerifyUserIsAbleToSendAnyQueryUsingContactFormAvailableOnTheHiringWithMedrepPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_152_VerifyUserIsAbleToSendAnyQueryUsingContactFormAvailableOnTheHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_152_VerifyUserIsAbleToSendAnyQueryUsingContactFormAvailableOnTheHiringWithMedrepPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_152_VerifyUserIsAbleToSendAnyQueryUsingContactFormAvailableOnTheHiringWithMedrepPage", testSteps, driver);
			assertTrue(false);
		  }
	    }
	
}
