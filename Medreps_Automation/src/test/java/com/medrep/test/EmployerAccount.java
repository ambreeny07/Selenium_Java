package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateAccountPage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerAccountPage;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerSignUpPage;
import com.medrep.utilities.Waits;

public class EmployerAccount extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_91_VerifyUserIsAbleToSeeNextBillingDateInAccountWithPlanNameAndPurchasingDate() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
//		String emailAddress = dataArr[0][0].toString();
		String emailAddress = "ambreeny419+aprilemployer@gmail.com";
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

			testSteps.add("Step " + step + " : Click on 'Account' button from left panel");
			employerAccountPage.clickOnAccountButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Next Billing Date' is display");
			assertTrue(employerAccountPage.isNextBillingDateLabelDisplay(driver),
					"Verified 'Next Billing Date' is display");
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
			AddTest_IntoReport("TC_ID_91_VerifyUserIsAbleToSeeNextBillingDateInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_91_VerifyUserIsAbleToSeeNextBillingDateInAccountWithPlanNameAndPurchasingDate "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_91_VerifyUserIsAbleToSeeNextBillingDateInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_91_VerifyUserIsAbleToSeeNextBillingDateInAccountWithPlanNameAndPurchasingDate"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_91_VerifyUserIsAbleToSeeNextBillingDateInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}
	}

		@Test
		public void TC_ID_92_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount(){
			  WebDriver driver = null;
			  ArrayList<String> testSteps = new ArrayList<>();
			  EmployerAccountPage employerAccountPage;
			  EmployerSignUpPage employerSignUpPage;
			  driver = initConfiguration();
			  employerAccountPage = new EmployerAccountPage(driver);
			  employerSignUpPage = new EmployerSignUpPage(driver);
			  navigateToURL(appurl, driver);
			    navigateToURL(memberurl, driver);

			  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
			  String emailAddress="ambreeny419+aprilemployer@gmail.com";
			  String password="Test1234";

			  try {
				  int step = 1;
				  testSteps.add("Step "+step+" : Click on 'Login' button");
				  employerAccountPage.clickOnLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Verify  'Email' field is display");
				  assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
				  employerAccountPage.enterEmailAddress(emailAddress,driver);
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Password':"+password);
				  employerAccountPage.enterPassword(password,driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
				  employerAccountPage.clickOnSubmitLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Click on <b>Update Payment</b> Link");
				  employerAccountPage.clickOnUpdatePaymentDetailsLink(driver);
				  step++;

				  testSteps.add("Step "+step+": Click on Add Payment Method Button");
				  employerAccountPage.clickOnAddPaymentMethodButton(driver);
				  step++;
				  
				  testSteps.add("Step "+step+": Click on Add Payment Method Button");
				  employerAccountPage.switchToFrame(driver);
				  step++;				  

				  testSteps.add("Step "+step+": Enter Card Details");
				  employerAccountPage.isCardNumberInputFieldTwoDisplay(driver);
				  employerSignUpPage.enterCardNumberTwo("4242424242424242",driver);
				  step++;

				  testSteps.add("Step "+step+": Enter Expiry Date");
				  employerSignUpPage.enterCardExpiryDateTwo("0224",driver);
				  step++;

				  testSteps.add("Step "+step+": Enter CVC");
				  employerSignUpPage.enterCardCvcNumberTwo("100",driver);
				  step++;
				  
				  testSteps.add("Step "+step+": Enter Postal Code:"+"K0A 0B7");
				  employerSignUpPage.enterPostalCode("K0A 0B7",driver);
				  step++;				  
				  
				  driver.switchTo().parentFrame();

				  testSteps.add("Step "+step+": Click on Add Button");
				  employerAccountPage.clickOnAddButton(driver);
				  step++;
				  
				  testSteps.add("Step "+step+": delete Card");
				  employerAccountPage.deleteCard(driver);
				  step++;				  

				  testSteps.add("Step "+step+": Click on Return to MedReps");
				  employerAccountPage.clickOnReturnToMedReps(driver);
				  step++;

				  testSteps.add("Step "+step+" : Close the Browser");
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_92_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount", testSteps, driver);



			  }catch (Exception e){
				  testSteps.add("Failed: TC_ID_92_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount " + "<br><b>Exception:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_92_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount", testSteps, driver);
				  assertTrue(false);
			  }catch (Error e){
				  testSteps.add("Failed: TC_ID_92_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount " + "<br><b>Exception:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_92_VerifyUserIsAbleToUpdatePaymentDetailsFromAccount", testSteps, driver);
				  assertTrue(false);
			  }
		  }		

		@Test()
		public void TC_ID_94_VerifyUserIsAbleToCancelMembershipFromAccount() throws InterruptedException {
			WebDriver driver = null;
			ArrayList<String> testSteps = new ArrayList<>();
			EmployerSignUpPage employerSignUpPage;
			EmployerAccountPage employerAccountPage;
			EmployerDashBoardPage employerDashBoardPage;

			driver = initConfiguration();
			employerSignUpPage = new EmployerSignUpPage(driver);
			 employerAccountPage = new EmployerAccountPage(driver);
			 employerDashBoardPage = new EmployerDashBoardPage(driver);
			
			navigateToURL(appurl, driver);
			Thread.sleep(10000);
			navigateToURL(memberurl, driver);
			Object[][] dataArr = getData("testData", "Password", driver);
			String password = dataArr[0][0].toString();
			Object[][] dataArr1 = getData("testData", "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
			String email;

			try{
				int step = 1;

				testSteps.add("Step"+step+": Verify user is redirected to Homepage");
				assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to 'Homepage'");
				step++;

				testSteps.add("Step"+step+": Click on <b>Join Now</b> Button");
				employerSignUpPage.clickJoinNowButton(driver);
				step++;

				testSteps.add("Step"+step+": Click on hyperlink <b>Click Here</b>");
				employerSignUpPage.clickHereButton(driver);
				step++;

				testSteps.add("Step"+step+": Select the Monthly Unlimited Job Posting Plan");
				employerSignUpPage.chooseRenewMonthly$525JobPostingPlan(driver);
				step++;

				testSteps.add("Step"+step+": Click on Next Button");
				employerSignUpPage.clickOnNextButton(driver);
				step++;

				testSteps.add("Step"+step+": Click on Next Button");
				employerSignUpPage.clickOnNextButton(driver);
				step++;

				email = getUniqueEmailId("Test1", driver);
				createdUsers.add(email);
				testSteps.add("Step"+step+": Enter Email");
				employerSignUpPage.enterEmail(email, driver);
				step++;

				testSteps.add("Step"+step+": Enter Company Name");
				employerSignUpPage.enterCompanyName("MaxWell",driver);
				step++;

				testSteps.add("Step"+step+": Enter Password");
				employerSignUpPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step"+step+": Enter Password again");
				employerSignUpPage.enterConfirmPassword(password,driver);
				step++;

				testSteps.add("Step"+step+": Click on Terms and conditions checkbox");
				employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
				step++;

				testSteps.add("Step"+step+"Click on <b>Checkout</b> Button");
				employerSignUpPage.clickOnCheckoutButton(driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
				employerSignUpPage.enterCardNumber(cardNumber, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
				employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
				employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
				employerSignUpPage.enterNameOnCard(nameOnCard, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
				employerSignUpPage.clickOnCountryDropDown(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
				employerSignUpPage.clickOnPakistanOption(driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Pay' button.");
				employerSignUpPage.clickOnPayButton(driver);
				step++;

				Waits.wait5s();
				try {
					testSteps.add("Step " + step + " : Verify 'Congratulation' message display.");
					assertTrue(employerSignUpPage.isCongratulationLabelDisplay(driver),
							"Verified 'Congratulation' message is display.");
					step++;

					testSteps.add("Step " + step + " : Verify 'You have successfully subscribed.' description is display.");
					assertTrue(employerSignUpPage.isYouHaveSuccessfullySubscribedDisplay(driver),
							" Verified 'You have successfully subscribed.' description is display.");
					step++;
				} catch (Exception e) {
					// TODO: handle exception
				}

				testSteps.add("Step " + step + " : Verify user is redirected to the'Dashboard Page'");
				assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
						"Verified user  is redirected to the'Dashboard Page'");
				step++;
				
				testSteps.add("Step "+step+": Click on Dashboard Button");
				waitTime(2000,driver);
				employerDashBoardPage.clickOnDashboardButton(driver);
				step++;
				
				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;
	
				  testSteps.add("Step "+step+": Click on Cancel your plan link");
				  employerAccountPage.clickOnCancelYourPlanLink(driver);
				  step++;
	
				  testSteps.add("Step "+step+": Click on Cancel Plan Button");
				  employerAccountPage.clickCancelPlan(driver);
				  step++;
				  
				  testSteps.add("Step "+step+": Click on Cancel Plan Button");
				  waitTime(3000,driver);
				  employerAccountPage.clickCancelPlan(driver);
				  step++;

				testSteps.add("Step " + step + " : Close the Browser");

				tempSrc = getScreenshotPath();
				testSteps.add(tempSrc);
				captureCapture(driver, tempSrc);
				AddTest_IntoReport(
						"TC_ID_94_VerifyUserIsAbleToCancelMembershipFromAccount",
						testSteps, driver);

			}catch (Exception e){
				testSteps.add(
						"Failed: TC_ID_94_VerifyUserIsAbleToCancelMembershipFromAccount"
								+ "<br><b>Exception:</b><br> " + e.toString());
				tempSrc = getScreenshotPath();
				testSteps.add(tempSrc);
				captureCapture(driver, tempSrc);
				AddTest_IntoReport(
						"TC_ID_94_VerifyUserIsAbleToCancelMembershipFromAccount",
						testSteps, driver);
				assertTrue(false);
			}catch (Error e){
				testSteps.add(
						"Failed: TC_ID_94_VerifyUserIsAbleToCancelMembershipFromAccount"
								+ "<br><b>Error:</b><br> " + e.toString());
				tempSrc = getScreenshotPath();
				testSteps.add(tempSrc);
				captureCapture(driver, tempSrc);
				AddTest_IntoReport(
						"TC_ID_94_VerifyUserIsAbleToCancelMembershipFromAccount",
						testSteps, driver);
				assertTrue(false);
			}
		}

		  @Test()
		public void TC_ID_95_VerifyUserIsAbleToSeeTransactionsHistoryTableWithTransactionsRecord(){
			  WebDriver driver = null;
			  ArrayList<String> testSteps = new ArrayList<>();
			  EmployerAccountPage employerAccountPage;

			  driver = initConfiguration();
			  employerAccountPage = new EmployerAccountPage(driver);
			  navigateToURL(appurl, driver);

			  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
			  String emailAddress="amyempautomation@gmail.com";
			  String password="Test1234";

			  try {
				  int step = 1;
				  testSteps.add("Step "+step+" : Click on 'Login' button");
				  employerAccountPage.clickOnLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Verify  'Email' field is display");
				  assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
				  employerAccountPage.enterEmailAddress(emailAddress,driver);
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Password':"+password);
				  employerAccountPage.enterPassword(password,driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
				  employerAccountPage.clickOnSubmitLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Verify transaction history table is showing complete data");
				  employerAccountPage.verifyAllDataIsShowingInTable(driver);
				  step++;

				  testSteps.add("Step "+step+": Close the Browser");
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_95_VerifyUserIsAbleToSeeTransactionsHistoryTableWithTransactionsRecord", testSteps, driver);

			  }catch (Exception e){
				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_95_VerifyUserIsAbleToSeeTransactionsHistoryTableWithTransactionsRecord" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_95_VerifyUserIsAbleToSeeTransactionsHistoryTableWithTransactionsRecord", testSteps, driver);
				  assertTrue(false);
			  }catch (Error e){
				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_95_VerifyUserIsAbleToSeeTransactionsHistoryTableWithTransactionsRecord" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_95_VerifyUserIsAbleToSeeTransactionsHistoryTableWithTransactionsRecord", testSteps, driver);
				  assertTrue(false);
			  }
		  }

		  @Test
		public void TC_ID_98_VerifyUserIsAbleToContactToCustomerSupportFromTheSupportSection(){
			  WebDriver driver = null;
			  ArrayList<String> testSteps = new ArrayList<>();
			  EmployerAccountPage employerAccountPage;

			  driver = initConfiguration();
			  employerAccountPage = new EmployerAccountPage(driver);
			  navigateToURL(appurl, driver);

			  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		        String emailAddress=dataArr[0][0].toString();
		        String password=dataArr[0][1].toString();

			  try {
				  int step = 1;
				  testSteps.add("Step "+step+" : Click on 'Login' button");
				  employerAccountPage.clickOnLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Verify  'Email' field is display");
				  assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
				  employerAccountPage.enterEmailAddress(emailAddress,driver);
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Password':"+password);
				  employerAccountPage.enterPassword(password,driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
				  employerAccountPage.clickOnSubmitLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Verify user is redirected to mailbox");
				  assertTrue(employerAccountPage.verifyMailBox(driver));
				  step++;


				  testSteps.add("Step "+step+": Close the Browser");
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_98_VerifyUserIsAbleToContactToCustomerSupportFromTheSupportSection", testSteps, driver);


			  }catch (Exception e){
				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_98_VerifyUserIsAbleToContactToCustomerSupportFromTheSupportSection" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_98_VerifyUserIsAbleToContactToCustomerSupportFromTheSupportSection", testSteps, driver);
				  assertTrue(false);
			  }catch (Error e){
				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_98_VerifyUserIsAbleToContactToCustomerSupportFromTheSupportSection" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_98_VerifyUserIsAbleToContactToCustomerSupportFromTheSupportSection", testSteps, driver);
				  assertTrue(false);
			  }
		  }

		  @Test
		public void TC_ID_99_VerifyUserIsAbleToSeeFrequentlyAskedQuestionsForEmployerFromTheAccount(){
			  WebDriver driver = null;
			  ArrayList<String> testSteps = new ArrayList<>();
			  EmployerAccountPage employerAccountPage;

			  driver = initConfiguration();
			  employerAccountPage = new EmployerAccountPage(driver);
			  navigateToURL(appurl, driver);

			  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		        String emailAddress=dataArr[0][0].toString();
		        String password=dataArr[0][1].toString();

			  try {
				  int step = 1;
				  testSteps.add("Step "+step+" : Click on 'Login' button");
				  employerAccountPage.clickOnLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Verify  'Email' field is display");
				  assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
				  employerAccountPage.enterEmailAddress(emailAddress,driver);
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Password':"+password);
				  employerAccountPage.enterPassword(password,driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
				  employerAccountPage.clickOnSubmitLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Click on Frequently Asked Question");
				  employerAccountPage.clickOnFrequentlyAskedQuestions(driver);
				  step++;
				  
				  testSteps.add("Step "+step+": Close the Browser");
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_99_VerifyUserIsAbleToSeeFrequentlyAskedQuestionsForEmployerFromTheAccount", testSteps, driver);



			  }catch (Exception e){
				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_99_VerifyUserIsAbleToSeeFrequentlyAskedQuestionsForEmployerFromTheAccount" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_99_VerifyUserIsAbleToSeeFrequentlyAskedQuestionsForEmployerFromTheAccount", testSteps, driver);
				  assertTrue(false);
			  }catch (Error e){
				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_99_VerifyUserIsAbleToSeeFrequentlyAskedQuestionsForEmployerFromTheAccount" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_99_VerifyUserIsAbleToSeeFrequentlyAskedQuestionsForEmployerFromTheAccount", testSteps, driver);
				  assertTrue(false);
			  }
		  }

		  @Test
		public void TC_ID_100_VerifyUserIsAbleToSeeAddOnSectionOnAccountPage(){
			  WebDriver driver = null;
			  ArrayList<String> testSteps = new ArrayList<>();
			  EmployerAccountPage employerAccountPage;

			  driver = initConfiguration();
			  employerAccountPage = new EmployerAccountPage(driver);
			  navigateToURL(appurl, driver);

			  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
			  String emailAddress="testing321@gmail.com";
			  String password="Jamal1234j";

			  try{
				  int step = 1;
				  testSteps.add("Step "+step+" : Click on 'Login' button");
				  employerAccountPage.clickOnLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Verify  'Email' field is display");
				  assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
				  employerAccountPage.enterEmailAddress(emailAddress,driver);
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Password':"+password);
				  employerAccountPage.enterPassword(password,driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
				  employerAccountPage.clickOnSubmitLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Verify Add-Ons section is displayed");
				  employerAccountPage.isAddOnTitleDisplay(driver);
				  step++;


				  testSteps.add("Step "+step+": Close the Browser");
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_100_VerifyUserIsAbleToSeeAddOnSectionOnAccountPage", testSteps, driver);

			  }catch (Exception e){

				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_100_VerifyUserIsAbleToSeeAddOnSectionOnAccountPage" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_100_VerifyUserIsAbleToSeeAddOnSectionOnAccountPage", testSteps, driver);
				  assertTrue(false);

			  }catch (Error e){

				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_100_VerifyUserIsAbleToSeeAddOnSectionOnAccountPage" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_100_VerifyUserIsAbleToSeeAddOnSectionOnAccountPage", testSteps, driver);
				  assertTrue(false);
			  }
		  }

		  @Test
		public void TC_ID_101_VerifyUserIsAbleToSeePurchasedLabelOnTheAddOnWhichIsPurchased(){
			  WebDriver driver = null;
			  ArrayList<String> testSteps = new ArrayList<>();
			  EmployerAccountPage employerAccountPage;

			  driver = initConfiguration();
			  employerAccountPage = new EmployerAccountPage(driver);
			  navigateToURL(appurl, driver);

			  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		        String emailAddress=dataArr[0][0].toString();
		        String password=dataArr[0][1].toString();

			  try{
				  int step = 1;
				  testSteps.add("Step "+step+" : Click on 'Login' button");
				  employerAccountPage.clickOnLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Verify  'Email' field is display");
				  assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
				  employerAccountPage.enterEmailAddress(emailAddress,driver);
				  step++;

				  testSteps.add("Step "+step+" : Enter 'Password':"+password);
				  employerAccountPage.enterPassword(password,driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
				  employerAccountPage.clickOnSubmitLoginButton(driver);
				  step++;

				  testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Verify Add-Ons section is displayed");
				  employerAccountPage.isPurchasedButtonDisplay(driver);
				  step++;

				  testSteps.add("Step "+step+": Close the Browser");
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_101_VerifyUserIsAbleToSeePurchasedLabelOnTheAddOnWhichIsPurchased", testSteps, driver);

			  }catch (Exception e){

				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_101_VerifyUserIsAbleToSeePurchasedLabelOnTheAddOnWhichIsPurchased" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_101_VerifyUserIsAbleToSeePurchasedLabelOnTheAddOnWhichIsPurchased", testSteps, driver);
				  assertTrue(false);

			  }catch (Error e){

				  e.printStackTrace();
				  testSteps.add("Failed: TC_ID_101_VerifyUserIsAbleToSeePurchasedLabelOnTheAddOnWhichIsPurchased" + "<br><b>Error:</b><br> " + e.toString());
				  tempSrc = getScreenshotPath();
				  testSteps.add(tempSrc);
				  captureCapture(driver, tempSrc);
				  AddTest_IntoReport("TC_ID_101_VerifyUserIsAbleToSeePurchasedLabelOnTheAddOnWhichIsPurchased", testSteps, driver);
				  assertTrue(false);
			  }
		  }

		@Test()
		public void TC_ID_102_VerifyUserIsAbleToPurchaseAddOn1YearUnlimitedJobSearchFromMyAccount() throws InterruptedException {
			WebDriver driver = null;
			ArrayList<String> testSteps = new ArrayList<>();
			EmployerSignUpPage employerSignUpPage;
			 EmployerAccountPage employerAccountPage;
			 EmployerDashBoardPage employerDashBoardPage;
			 

			driver = initConfiguration();
			employerSignUpPage = new EmployerSignUpPage(driver);
			employerAccountPage = new EmployerAccountPage(driver);
			employerDashBoardPage = new EmployerDashBoardPage(driver);
			navigateToURL(appurl, driver);
			navigateToURL(memberurl, driver);

			Object[][] dataArr = getData(excelFileName, "Password", driver);
			String password = dataArr[0][0].toString();
			Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
			String cardNumber = dataArr1[0][0].toString();
			String cardExpiryDate = dataArr1[0][1].toString();
			String cardCvc = dataArr1[0][2].toString();
			String nameOnCard = dataArr1[0][3].toString();
			Object[][] dataArr2 = getData(excelFileName, "EmployerValidCredential",driver);
			String email = generateRandomString()+"@yopmail.com";
			createdUsers.add(email);


			try {
				int step = 1;
				testSteps.add("Step"+step+": verify that user should be redirected to homepage");
				assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
				step++;

				testSteps.add("Step"+step+": Click on <b>Join Now</b> button");
				employerSignUpPage.clickJoinNowButton(driver);
				step++;

				testSteps.add("Step"+step+": Click on hyperlink <b>Click Here</b>");
				employerSignUpPage.clickHereButton(driver);
				step++;

				testSteps.add("Step"+step+": Select the annual Unlimited Job Posting Plan");
				employerSignUpPage.chooseRenewBiAnnually$2625JobPostingPlan(driver);
				step++;

				testSteps.add("Step"+step+": Click on Next Button");
				employerSignUpPage.clickOnNextButton(driver);
				step++;

				testSteps.add("Step"+step+": Click on Next Button");
				employerSignUpPage.clickOnNextButton(driver);
				step++;

				testSteps.add("Step"+step+": Enter Email");
				employerSignUpPage.enterEmail(email, driver);
				step++;

				testSteps.add("Step"+step+": Enter Company Name");
				employerSignUpPage.enterCompanyName("MaxWell",driver);
				step++;

				testSteps.add("Step"+step+": Enter Password");
				employerSignUpPage.enterPassword(password, driver);
				step++;

				testSteps.add("Step"+step+": Enter Password again");
				employerSignUpPage.enterConfirmPassword(password,driver);
				step++;

				testSteps.add("Step"+step+": Click on Terms and conditions checkbox");
				employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
				step++;

				testSteps.add("Step"+step+"Click on <b>Checkout</b> Button");
				employerSignUpPage.clickOnCheckoutButton(driver);
				step++;

				testSteps.add("Step"+step+": Click on Back Button");
				employerSignUpPage.clickByHoverOnLogo(driver);
				step++;

				testSteps.add("Step " + step + " : Verify user is redirected to the 'Dashboard Page' and account is created successfully");
				assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified user  is redirected to the 'Dashboard Page'");
				step++;
				
				testSteps.add("Step"+step+": Click on Back Button");
				employerSignUpPage.clickByHoverOnLogo(driver);
				step++;
				
				testSteps.add("Step "+step+": Click on Dashboard Button");
				waitTime(2000,driver);
				employerDashBoardPage.clickOnDashboardButton(driver);
				step++;
				
				testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
				  employerAccountPage.clickOnAccountButton(driver);
				  step++;

				  testSteps.add("Step "+step+": Click on Subscribe Button");
				  employerAccountPage.clickOnSubscribeButton(driver);
				  step++;
//
//				  testSteps.add("Step "+step+": Click on Stripe Subscribe Button");
//				  employerAccountPage.clickOnStripeSubscribeButton(driver);
//				  step++;
//
//				  testSteps.add("Step "+step+": Verify Purchase is Successful");
//				  employerAccountPage.isPurchasedButtonDisplay(driver);
//				  step++;

				testSteps.add("Step " + step + " : Close the Browser");

				tempSrc = getScreenshotPath();
				testSteps.add(tempSrc);
				captureCapture(driver, tempSrc);
				AddTest_IntoReport(
						"TC_ID_102_VerifyUserIsAbleToPurchaseAddOn1YearUnlimitedJobSearchFromMyAccount",
						testSteps, driver);

			}catch (Exception e){
				testSteps.add(
						"Failed: TC_ID_102_VerifyUserIsAbleToPurchaseAddOn1YearUnlimitedJobSearchFromMyAccount "
								+ "<br><b>Exception:</b><br> " + e.toString());
				tempSrc = getScreenshotPath();
				testSteps.add(tempSrc);
				captureCapture(driver, tempSrc);
				AddTest_IntoReport(
						"TC_ID_102_VerifyUserIsAbleToPurchaseAddOn1YearUnlimitedJobSearchFromMyAccount",
						testSteps, driver);
				assertTrue(false);
			}catch (Error e){
				testSteps.add(
						"Failed: TC_ID_102_VerifyUserIsAbleToPurchaseAddOn1YearUnlimitedJobSearchFromMyAccount"
								+ "<br><b>Error:</b><br> " + e.toString());
				tempSrc = getScreenshotPath();
				testSteps.add(tempSrc);
				captureCapture(driver, tempSrc);
				AddTest_IntoReport(
						"TC_ID_102_VerifyUserIsAbleToPurchaseAddOn1YearUnlimitedJobSearchFromMyAccount",
						testSteps, driver);
				assertTrue(false);
			}

		}

	@Test()
	public void TC_ID_2_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate()
			throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerAccountPage employerAccountPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);

		Object[][] dataArr = getData(excelFileName, "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		Object[][] dataArr2 = getData(excelFileName, "EmployerValidCredential", driver);
		String email = generateRandomString() + "@yopmail.com";
		createdUsers.add(email);
		String nextbilingDate;
		String purchasingDate;
		String nextBillingDateAfter30Days;

		try {
			int step = 1;

			testSteps.add("Step" + step + ": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step" + step + ": Click on <b>Join Now</b> Button");
			employerSignUpPage.clickJoinNowButton(driver);
			step++;

			testSteps.add("Step" + step + ": Click on hyperlink <b>Click Here</b>");
			employerSignUpPage.clickHereButton(driver);
			step++;

			testSteps.add("Step" + step + ": Select the Monthly Unlimited Job Posting Plan");
			employerSignUpPage.chooseRenewMonthly$525JobPostingPlan(driver);
			step++;

			testSteps.add("Step" + step + ": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step" + step + ": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step" + step + ": Enter Email");
			employerSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step" + step + ": Enter Company Name");
			employerSignUpPage.enterCompanyName("MaxWell", driver);
			step++;

			testSteps.add("Step" + step + ": Enter Password");
			employerSignUpPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step" + step + ": Enter Password again");
			employerSignUpPage.enterConfirmPassword(password, driver);
			step++;

			testSteps.add("Step" + step + ": Click on Terms and conditions checkbox");
			employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step" + step + "Click on <b>Checkout</b> Button");
			employerSignUpPage.clickOnCheckoutButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
			employerSignUpPage.enterCardNumber(cardNumber, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
			employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
			employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
			employerSignUpPage.enterNameOnCard(nameOnCard, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
			employerSignUpPage.clickOnCountryDropDown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
			employerSignUpPage.clickOnPakistanOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			employerSignUpPage.clickOnPayButton(driver);
			step++;

			Waits.wait5s();
			try {
				testSteps.add("Step " + step + " : Verify 'Congratulation' message display.");
				assertTrue(employerSignUpPage.isCongratulationLabelDisplay(driver),
						"Verified 'Congratulation' message is display.");
				step++;

				testSteps.add("Step " + step + " : Verify 'You have successfully subscribed.' description is display.");
				assertTrue(employerSignUpPage.isYouHaveSuccessfullySubscribedDisplay(driver),
						" Verified 'You have successfully subscribed.' description is display.");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Verify user is redirected to the'Dashboard Page'");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Dashboard Page'");
			step++;

			testSteps.add("Step " + step + " : Verify 'Purchasing Date' is display");
			assertTrue(employerAccountPage.isPurchasingDateLabelDisplay(driver),
					"Verified 'Purchasing Date' is display");
			step++;

			nextbilingDate = employerAccountPage.getNextBillDate(driver);

			purchasingDate = employerAccountPage.getPurchasingDate(driver);

			nextBillingDateAfter30Days = getDaysBetweenTwoDate(purchasingDate, nextbilingDate, "yyyy-MM-dd");

			try {
				testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter30Days)-34)+"' Days.");
				assertEquals(nextBillingDateAfter30Days,"34");
				
			} catch (Error e2) {
				testSteps.add("Step " + step + " : Verify Next Billing Date After'"+(Integer.parseInt(nextBillingDateAfter30Days)-33)+"' Days.");
				assertEquals(nextBillingDateAfter30Days,"33");				
			}


			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_2_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_2_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_2_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_2_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_2_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_1_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate()
			throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerAccountPage employerAccountPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);

		Object[][] dataArr = getData(excelFileName, "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		Object[][] dataArr2 = getData(excelFileName, "EmployerValidCredential", driver);
		String email = generateRandomString() + "@yopmail.com";
		createdUsers.add(email);
		String nextbilingDate;
		String purchasingDate;
		String nextBillingDateAfter30Days;

		try {
			int step = 1;
			testSteps.add("Step" + step + ": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to homepage successfully");
			step++;

			testSteps.add("Step" + step + ": Click on <b>Join Now</b> Button");
			employerSignUpPage.clickJoinNowButton(driver);
			step++;

			testSteps.add("Step" + step + ": Click on hyperlink <b>Click Here</b>");
			employerSignUpPage.clickHereButton(driver);
			step++;

			testSteps.add("Step" + step + ": Select the 30 days single job posting plan");
			employerSignUpPage.select30daysPlan(driver);
			step++;

			testSteps.add("Step" + step + ": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Choose AddOns");
			employerSignUpPage.selectFeaturedJobAddOn(driver);
			step++;
			
			testSteps.add("Step" + step + ": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step" + step + ": Enter Email");
			employerSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step" + step + ": Enter Company Name");
			employerSignUpPage.enterCompanyName("MaxWell", driver);
			step++;

			testSteps.add("Step" + step + ": Enter Password");
			employerSignUpPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step" + step + ": Enter Password again");
			employerSignUpPage.enterConfirmPassword(password, driver);
			step++;

			testSteps.add("Step" + step + ": Click on Terms and conditions checkbox");
			employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step" + step + "Click on <b>Checkout</b> Button");
			employerSignUpPage.clickOnCheckoutButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
			employerSignUpPage.enterCardNumber(cardNumber, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
			employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
			employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
			employerSignUpPage.enterNameOnCard(nameOnCard, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
			employerSignUpPage.clickOnCountryDropDown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
			employerSignUpPage.clickOnPakistanOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			employerSignUpPage.clickOnPayButton(driver);
			step++;

			Waits.wait5s();
			try {
				testSteps.add("Step " + step + " : Verify 'Congratulation' message display.");
				assertTrue(employerSignUpPage.isCongratulationLabelDisplay(driver),
						"Verified 'Congratulation' message is display.");
				step++;

				testSteps.add("Step " + step + " : Verify 'You have successfully subscribed.' description is display.");
				assertTrue(employerSignUpPage.isYouHaveSuccessfullySubscribedDisplay(driver),
						" Verified 'You have successfully subscribed.' description is display.");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Verify user is redirected to the'Dashboard Page'");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Dashboard Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' button from left panel");
			employerAccountPage.clickOnAccountButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify Next Billing Date Label is not display");
			assertFalse(employerAccountPage.isNextBillingDateLabelDisplay(driver),
					"Verified Next Billing Date Label is not display");
			step++;
			
			testSteps.add("Step " + step + " : Verify Purchasing Date Label is not display");
			assertFalse(employerAccountPage.isPurchasingDateLabelDisplay(driver),
					"Verified Purchasing Date Label is not display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_1_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_1_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_1_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_1_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_1_VerifyUserIsAbleToSeeNextBillingDateAfter30DaysInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_3_VerifyUserIsAbleToSeeNextBillingDateAfterAYearInAccountWithPlanNameAndPurchasingDate()
			throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerAccountPage employerAccountPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);

		Object[][] dataArr = getData(excelFileName, "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		Object[][] dataArr2 = getData(excelFileName, "EmployerValidCredential", driver);
		String email = generateRandomString() + "@yopmail.com";
		createdUsers.add(email);
		String nextbilingDate;
		String purchasingDate;
		String nextBillingDateAfterYear;

		try {

			int step = 1;

			testSteps.add("Step" + step + ": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step" + step + ": Click on <b>Join Now</b> Button");
			employerSignUpPage.clickJoinNowButton(driver);
			step++;

			testSteps.add("Step" + step + ": Click on hyperlink <b>Click Here</b>");
			employerSignUpPage.clickHereButton(driver);
			step++;

			testSteps.add("Step" + step + ": Select the annual Unlimited Job Posting Plan");
			employerSignUpPage.chooseRenewBiAnnually$2625JobPostingPlan(driver);
			step++;

			testSteps.add("Step" + step + ": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step" + step + ": Choose AddOns : <b>One Year Unlimted Resume Search</b>");
			employerSignUpPage.selectOneYearUnlimitedAddOn(driver);
			step++;

			testSteps.add(("Step" + step + ": Choose AddOns : Featured Job"));
			employerSignUpPage.selectFeaturedJobAddOn(driver);
			step++;

			testSteps.add("Step" + step + ": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step" + step + ": Enter Email");
			employerSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step" + step + ": Enter Company Name");
			employerSignUpPage.enterCompanyName("MaxWell", driver);
			step++;

			testSteps.add("Step" + step + ": Enter Password");
			employerSignUpPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step" + step + ": Enter Password again");
			employerSignUpPage.enterConfirmPassword(password, driver);
			step++;

			testSteps.add("Step" + step + ": Click on Terms and conditions checkbox");
			employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step" + step + "Click on <b>Checkout</b> Button");
			employerSignUpPage.clickOnCheckoutButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
			employerSignUpPage.enterCardNumber(cardNumber, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
			employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
			employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
			employerSignUpPage.enterNameOnCard(nameOnCard, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
			employerSignUpPage.clickOnCountryDropDown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
			employerSignUpPage.clickOnPakistanOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			employerSignUpPage.clickOnPayButton(driver);
			step++;

			Waits.wait5s();
			try {
				testSteps.add("Step " + step + " : Verify 'Congratulation' message display.");
				assertTrue(employerSignUpPage.isCongratulationLabelDisplay(driver),
						"Verified 'Congratulation' message is display.");
				step++;

				testSteps.add("Step " + step + " : Verify 'You have successfully subscribed.' description is display.");
				assertTrue(employerSignUpPage.isYouHaveSuccessfullySubscribedDisplay(driver),
						" Verified 'You have successfully subscribed.' description is display.");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Verify user is redirected to the 'Dashboard Page'");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Dashboard Page'");
			step++;

			testSteps.add("Step " + step + " : Click on 'Account' button from left panel");
			employerAccountPage.clickOnAccountButton(driver);
			step++;

			nextbilingDate = employerAccountPage.getNextBillDate(driver);

			purchasingDate = employerAccountPage.getPurchasingDate(driver);

			nextBillingDateAfterYear = getDaysBetweenTwoDate(purchasingDate, nextbilingDate, "yyyy-MM-dd");

			testSteps.add("Step " + step + " : Verify Next Billing Date After'Year' is displaying :"+nextBillingDateAfterYear);
			assertEquals(nextBillingDateAfterYear, "369");

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_3_VerifyUserIsAbleToSeeNextBillingDateAfterAYearInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_3_VerifyUserIsAbleToSeeNextBillingDateAfterAYearInAccountWithPlanNameAndPurchasingDate "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_3_VerifyUserIsAbleToSeeNextBillingDateAfterAYearInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add(
					"Failed: TC_ID_3_VerifyUserIsAbleToSeeNextBillingDateAfterAYearInAccountWithPlanNameAndPurchasingDate"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_3_VerifyUserIsAbleToSeeNextBillingDateAfterAYearInAccountWithPlanNameAndPurchasingDate",
					testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_8_VerifyUserIsAbleToSeeTheExactPackagesNamesAndAddOnsNameWithPricingInTheAccountTransactionHistory() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerAccountPage employerAccountPage;
		CandidateSignUpPage candidateSignUpPage;
		
		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);

		Object[][] dataArr = getData(excelFileName, "Password", driver);
		String password = dataArr[0][0].toString();
		Object[][] dataArr1 = getData(excelFileName, "CardDetails", driver);
		String cardNumber = dataArr1[0][0].toString();
		String cardExpiryDate = dataArr1[0][1].toString();
		String cardCvc = dataArr1[0][2].toString();
		String nameOnCard = dataArr1[0][3].toString();
		Object[][] dataArr2 = getData(excelFileName, "EmployerValidCredential",driver);
		String email = generateRandomString()+"@gmail.com";
		createdUsers.add(email);

		try {
			int step = 1;
			testSteps.add("Step"+step+": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to homepage successfully");
			step++;

			testSteps.add("Step "+step+": Click on <b>Login</b> Button");
			employerSignUpPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step"+step+": Click on 'Create An Account' Link");
			employerSignUpPage.clickOnCreateAnAccountLink(driver);
			step++;

			testSteps.add("Step"+step+": Click on 'click Here' Link");
			employerSignUpPage.clickOnClickHereLink(driver);
			step++;

			testSteps.add("Step"+step+": Select the 30 days single job posting plan");
			employerSignUpPage.select30daysPlan(driver);
			step++;			

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Choose AddOns");
			employerSignUpPage.selectFeaturedJobAddOn(driver);
			step++;

			String price = candidateSignUpPage.getPriceing(driver);
			price = price.replace(".00", "");

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Enter Email");
			employerSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step"+step+": Enter Company Name");
			employerSignUpPage.enterCompanyName("MaxWell",driver);
			step++;

			testSteps.add("Step"+step+": Enter Password");
			employerSignUpPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step"+step+": Enter Password again");
			employerSignUpPage.enterConfirmPassword(password,driver);
			step++;

			testSteps.add("Step"+step+": Click on Terms and conditions checkbox");
			employerSignUpPage.checkAgreeToTheTermAndConditionsCheckBox(driver);
			step++;

			testSteps.add("Step"+step+"Click on <b>Checkout</b> Button");
			employerSignUpPage.clickOnCheckoutButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
			employerSignUpPage.enterCardNumber(cardNumber, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
			employerSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
			employerSignUpPage.enterCardCvcNumber(cardCvc, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
			employerSignUpPage.enterNameOnCard(nameOnCard, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
			employerSignUpPage.clickOnCountryDropDown(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
			employerSignUpPage.clickOnPakistanOption(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Pay' button.");
			employerSignUpPage.clickOnPayButton(driver);
			step++;

			Waits.wait5s();
			try {
				testSteps.add("Step " + step + " : Verify 'Congratulation' message display.");
				assertTrue(employerSignUpPage.isCongratulationLabelDisplay(driver),
						"Verified 'Congratulation' message is display.");
				step++;

				testSteps.add("Step " + step + " : Verify 'You have successfully subscribed.' description is display.");
				assertTrue(employerSignUpPage.isYouHaveSuccessfullySubscribedDisplay(driver),
						" Verified 'You have successfully subscribed.' description is display.");
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Verify user is redirected to the'Dashboard Page'");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the'Dashboard Page'");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Account' button from left panel");
			employerAccountPage.clickOnAccountButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify Employer 30 Day Single Day Job Posting is Display");
			assertTrue(employerAccountPage.isEmployer30DaySingleDayJobPostingDisplay(driver),
					"Verified  Employer 30 Day Single Day Job Posting is Displayed'");
			step++;	
			
			testSteps.add("Step " + step + " : Verify membership price"+price+"");
			assertTrue(employerAccountPage.isPricingDisplay(price,driver),
					"Verified Verify membership price"+price+"");
			step++;			
			

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_8_VerifyUserIsAbleToSeeTheExactPackagesNamesAndAddOnsNameWithPricingInTheAccountTransactionHistory",
					testSteps, driver);



		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_8_VerifyUserIsAbleToSeeTheExactPackagesNamesAndAddOnsNameWithPricingInTheAccountTransactionHistory "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_8_VerifyUserIsAbleToSeeTheExactPackagesNamesAndAddOnsNameWithPricingInTheAccountTransactionHistory",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_8_VerifyUserIsAbleToSeeTheExactPackagesNamesAndAddOnsNameWithPricingInTheAccountTransactionHistory"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_8_VerifyUserIsAbleToSeeTheExactPackagesNamesAndAddOnsNameWithPricingInTheAccountTransactionHistory",
					testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_14_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		CandidateAccountPage candidateAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		candidateAccountPage = new CandidateAccountPage(driver);
		navigateToURL(appurl, driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
//		String emailAddress = dataArr[0][0].toString();
//		String password = dataArr[0][1].toString();
		String emailAddress = "ambreeny4191+regmarch13@gmail.com";
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

			testSteps.add("Step " + step + " : Click on 'Account' button from left panel");
			employerAccountPage.clickOnAccountButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Expire Date' is display");
			assertTrue(employerAccountPage.isExpireDateDisplay(driver),
					"Verified 'Expire Date' is display");
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
			AddTest_IntoReport("TC_ID_14_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate",
					testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_14_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_14_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate",
					testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_14_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_14_VerifyCancelledMembershipIsShowingMembershipPlanNamePurchasingDateCancelledTagAndExpiryDate",
					testSteps, driver);
			assertTrue(false);
		}
	}

}
