package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateJobSearchPage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerResumeSearchPage;
import com.medrep.pages.EmployerSignUpPage;
import com.medrep.utilities.Waits;

public class EmployerSignUp extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_11_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL("https://medreps.admin:MedReps@2022!@uat.medreps.com",driver);
		Thread.sleep(10000);
		navigateToURL("https://uat.medreps.com", driver);


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

			testSteps.add("Step"+step+": Click on <b>Join Now</b> Button");
			employerSignUpPage.clickJoinNowButton(driver);
			step++;

			testSteps.add("Step"+step+": Click on hyperlink <b>Click Here</b>");
			employerSignUpPage.clickHereButton(driver);
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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_11_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons",
					testSteps, driver);



		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_11_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_11_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_11_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_11_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_12_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithoutAddOns() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL("https://medreps.admin:MedReps@2022!@uat.medreps.com",driver);
		Thread.sleep(10000);
		navigateToURL("https://uat.medreps.com", driver);

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
			testSteps.add("Step"+step+": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to homepage successfully");
			step++;

			testSteps.add("Step"+step+": Click on <b>Join Now</b> Button");
			employerSignUpPage.clickJoinNowButton(driver);
			step++;

			testSteps.add("Step"+step+": Click on hyperlink <b>Click Here</b>");
			employerSignUpPage.clickHereButton(driver);
			step++;

			testSteps.add("Step"+step+": Select the 30 days single job posting plan");
			employerSignUpPage.select30daysPlan(driver);
			step++;

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;


			testSteps.add("Step"+step+": Do not choose AddOns and click on Next Button");
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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_12_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);



		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_12_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithoutAddOns "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_12_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_12_VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithoutAddOns"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"VerifyUserShouldBeAbleToCreate30daySingleJobPostingEmployerAccountSuccessfullyWithAddons",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_13_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL("https://medreps.admin:MedReps@2022!@uat.medreps.com",driver);
		Thread.sleep(10000);
		navigateToURL("https://uat.medreps.com", driver);

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

			testSteps.add("Step"+step+": Choose AddOns : Thirty Days Unlimted Resume Search");
			employerSignUpPage.selectThirtyDaysUnlimitedAddOn(driver);
			step++;

			testSteps.add(("Step"+step+": Choose AddOns : Featured Job"));
			employerSignUpPage.selectFeaturedJobAddOn(driver);
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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_13_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns",
					testSteps, driver);





		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_13_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_13_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_13_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_13_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns",
					testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_14_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL("https://medreps.admin:MedReps@2022!@uat.medreps.com",driver);
		Thread.sleep(10000);
		navigateToURL("https://uat.medreps.com", driver);

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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_14_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);





		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_14_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_14_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_14_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_14_VerifyUserShouldBeAbleToCreateMonthlyUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_15_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL("https://medreps.admin:MedReps@2022!@uat.medreps.com",driver);
		Thread.sleep(10000);
		navigateToURL("https://uat.medreps.com", driver);

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

			testSteps.add("Step"+step+": Select the annual Unlimited Job Posting Plan");
			employerSignUpPage.chooseRenewBiAnnually$2625JobPostingPlan(driver);
			step++;

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Choose AddOns : <b>One Year Unlimted Resume Search</b>");
			employerSignUpPage.selectOneYearUnlimitedAddOn(driver);
			step++;

			testSteps.add(("Step"+step+": Choose AddOns : Featured Job"));
			employerSignUpPage.selectFeaturedJobAddOn(driver);
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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_15_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns",
					testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_15_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_15_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_15_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_15_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithAddOns",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_16_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL("https://medreps.admin:MedReps@2022!@uat.medreps.com",driver);
		Thread.sleep(10000);
		navigateToURL("https://uat.medreps.com", driver);

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
		

		try{
			int step = 1;
			testSteps.add("Step"+step+": Verify that user is redirected to 'Homepage'");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "It is verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step"+step+": Click on <b>Join Now</b> Button");
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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_16_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_16_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_16_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_16_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_16_verifyUserShouldBeAbleToCreateAnnualUnlimitedJobPostingsEmployerAccountSuccessfullyWithoutAddOns",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_17_verifyUserShouldBeAbleToSignupForEmployerAccountSuccessfullyWithoutMembership() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
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

			assertTrue(employerSignUpPage.profileNameDisplay(driver));

			testSteps.add("Step " + step + " : Verify user is redirected to the 'Dashboard Page' and account is created successfully");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified user  is redirected to the 'Dashboard Page'");
			step++;


			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_17_verifyUserShouldBeAbleToSignupForEmployerAccountSuccessfullyWithoutMembership",
					testSteps, driver);

		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_17_verifyUserShouldBeAbleToSignupForEmployerAccountSuccessfullyWithoutMembership "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_17_verifyUserShouldBeAbleToSignupForEmployerAccountSuccessfullyWithoutMembership",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_17_verifyUserShouldBeAbleToSignupForEmployerAccountSuccessfullyWithoutMembership"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_17_verifyUserShouldBeAbleToSignupForEmployerAccountSuccessfullyWithoutMembership",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_19_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthlyUnlimitedJobPostingPlan() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
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

			assertTrue(employerSignUpPage.profileNameDisplay(driver));

			testSteps.add("Step " + step + " : Verify user is redirected to the 'Dashboard Page' and account is created successfully");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified user  is redirected to the 'Dashboard Page'");
			step++;


			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_19_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthlyUnlimitedJobPostingPlan",
					testSteps, driver);

		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_19_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthlyUnlimitedJobPostingPlan "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_19_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthlyUnlimitedJobPostingPlan",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_19_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthlyUnlimitedJobPostingPlan"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_19_VerifyThatUserHavingNoActivePackageIsAbleToSetUpNewSubscritpionForMonthlyUnlimitedJobPostingPlan",
					testSteps, driver);
			assertTrue(false);
		}

	}
	
	@Test()
	public void TC_ID_7_VerifyUserIsAbleToRedirectedToDashboardOnSigningUpFromTheJoinNowPage() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateJobSearchPage candidateJobSearchPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		candidateJobSearchPage = new CandidateJobSearchPage(driver);
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

		try{
			int step = 1;

			testSteps.add("Step"+step+": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to 'Homepage'");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Search Jobs' tab from navigation bar");
			candidateJobSearchPage.clickOnSearchJobsTab(driver);
			step++;

			testSteps.add("Step"+step+": Click on <b>SignMeUp</b> Button");
			employerSignUpPage.clickOnSignMeUpButton(driver);
			step++;

			testSteps.add("Step"+step+": Click on Monthly Membership Option");
			employerSignUpPage.clickOnMonthlyMembershipOption(driver);
			step++;

			testSteps.add("Step"+step+": Click on Next Button");
			employerSignUpPage.clickOnNextButton(driver);
			step++;

			testSteps.add("Step"+step+": Enter Email");
			employerSignUpPage.enterEmail(email, driver);
			step++;

			testSteps.add("Step"+step+": Enter First Name");
			employerSignUpPage.enterFirstName("Test"+generateRandomString()+"",driver);
			step++;
			
			testSteps.add("Step"+step+": Enter Last Name");
			employerSignUpPage.enterLastName("User"+generateRandomString()+"",driver);
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

			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_7_VerifyUserIsAbleToRedirectedToDashboardOnSigningUpFromTheJoinNowPage",
					testSteps, driver);

		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_7_VerifyUserIsAbleToRedirectedToDashboardOnSigningUpFromTheJoinNowPage "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_7_VerifyUserIsAbleToRedirectedToDashboardOnSigningUpFromTheJoinNowPage",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_7_VerifyUserIsAbleToRedirectedToDashboardOnSigningUpFromTheJoinNowPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_7_VerifyUserIsAbleToRedirectedToDashboardOnSigningUpFromTheJoinNowPage",
					testSteps, driver);
			assertTrue(false);
		}
	}	
	
	@Test()
	public void TC_ID_6_VerifyTheCartGetUpdatedOnTheEmployerSignupWhenAddingFeaturedJobAndResumeSearch() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerResumeSearchPage employerResumeSearchPage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
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
		String totalAmountBefore;
		String yourPurchaseValue;

		try{
			int step = 1;

			testSteps.add("Step"+step+": Verify user is redirected to Homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to 'Homepage'");
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
			
			totalAmountBefore = employerSignUpPage.getTotalAmountBefore(driver);
			
			testSteps.add("Step"+step+": Choose Featured Job AddOns");
			employerSignUpPage.selectFeaturedJobAddOn(driver);
			step++;
			
			yourPurchaseValue = employerSignUpPage.getYourPurchase(driver);
			
			testSteps.add("Step " + step + " : Verify your purchase section along with the prices updating accurately.");
			assertEquals(yourPurchaseValue,totalAmountBefore);
			
			testSteps.add("Step " + step + " : Close the Browser");


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_6_VerifyTheCartGetUpdatedOnTheEmployerSignupWhenAddingFeaturedJobAndResumeSearch",
					testSteps, driver);

		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_6_VerifyTheCartGetUpdatedOnTheEmployerSignupWhenAddingFeaturedJobAndResumeSearch "
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_6_VerifyTheCartGetUpdatedOnTheEmployerSignupWhenAddingFeaturedJobAndResumeSearch",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add(
					"Failed: TC_ID_6_VerifyTheCartGetUpdatedOnTheEmployerSignupWhenAddingFeaturedJobAndResumeSearch"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport(
					"TC_ID_6_VerifyTheCartGetUpdatedOnTheEmployerSignupWhenAddingFeaturedJobAndResumeSearch",
					testSteps, driver);
			assertTrue(false);
		}
	}	
	

	

}
