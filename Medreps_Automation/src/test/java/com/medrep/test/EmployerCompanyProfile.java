package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateProfilePage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerAccountPage;
import com.medrep.pages.EmployerCompanyProfilePage;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerLoginPage;
import com.medrep.pages.EmployerSignUpPage;
import com.medrep.utilities.Waits;

public class EmployerCompanyProfile extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_60_VerifyThatTheUserIsAbleToEditEmailOnCompanyProfilePage() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerAccountPage employerAccountPage;
		EmployerDashBoardPage employerDashBoardPage;
		EmployerCompanyProfilePage employerCompanyProfilePage;
		EmployerLoginPage employerLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		employerCompanyProfilePage = new EmployerCompanyProfilePage(driver);
		employerLoginPage = new EmployerLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
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
		String updatedEmailAddress = "Testuser" + generateRandomNumberWithGivenNumberOfDigits(3, driver)
				+ "@yopmail.com";
		createdUsers.add(updatedEmailAddress);
		
		try {
			int step = 1;
			testSteps.add("Step" + step + ": verify that user should be redirected to homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step" + step + ": Click on <b>Join Now</b> button");
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

			testSteps.add("Step" + step + ": Click on Back Button");
			employerSignUpPage.clickByHoverOnLogo(driver);
			step++;

			testSteps.add("Step " + step
					+ " : Verify user is redirected to the 'Dashboard Page' and account is created successfully");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the 'Dashboard Page'");
			step++;

			testSteps.add("Step" + step + ": Click on Back Button");
			employerSignUpPage.clickByHoverOnLogo(driver);
			step++;

			testSteps.add("Step " + step + " :Click on 'Profile Picture'");
			employerDashBoardPage.clickProfilePictureCircle(driver);
			step++;

			testSteps.add("Step " + step + " :Click on 'Profile' button");
			candidateProfilePage.clickProfileButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify user is navigated to <b>Company Profile</b> Page");
			assertTrue(employerDashBoardPage.isCompanyProfileLabelDisplay(driver));
			step++;

			testSteps.add("Step " + step + ": Edit the email field that has title Manage your Account");
			employerCompanyProfilePage.editManageYourAccountEmailField(updatedEmailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Click on Update Button");
			employerCompanyProfilePage.clickOnUpdateEmailButton(driver);

			testSteps.add("Step " + step + ": Verify User is logged out after email update");
			employerCompanyProfilePage.isLoginPageDisplayed(driver);
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerCompanyProfilePage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + "Enter Email address");
			employerCompanyProfilePage.enterEmailAddress(updatedEmailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Enter Password");
			employerCompanyProfilePage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on submit Login Button");
			employerCompanyProfilePage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify Login is successfull with updated email");
			assertTrue(employerLoginPage.isEmployerLoginSuccessfully(driver));
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_60_VerifyThatTheUserIsAbleToEditEmailOnCompanyProfilePage", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_60_VerifyThatTheUserIsAbleToEditEmailOnCompanyProfilePage "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_60_VerifyThatTheUserIsAbleToEditEmailOnCompanyProfilePage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_60_VerifyThatTheUserIsAbleToEditEmailOnCompanyProfilePage"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_60_VerifyThatTheUserIsAbleToEditEmailOnCompanyProfilePage", testSteps, driver);
			assertTrue(false);
		}

	}

	@Test()
	public void TC_ID_61_VerifyThatOnUpdatingEmailUserIsNotAbleToLoginWithPreviousEmail() throws InterruptedException {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerSignUpPage employerSignUpPage;
		EmployerAccountPage employerAccountPage;
		EmployerDashBoardPage employerDashBoardPage;
		EmployerCompanyProfilePage employerCompanyProfilePage;
		EmployerLoginPage employerLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		employerSignUpPage = new EmployerSignUpPage(driver);
		employerAccountPage = new EmployerAccountPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		employerCompanyProfilePage = new EmployerCompanyProfilePage(driver);
		employerLoginPage = new EmployerLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
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
		String updatedEmailAddress = "Testuser" + generateRandomNumberWithGivenNumberOfDigits(3, driver)
				+ "@yopmail.com";
		createdUsers.add(updatedEmailAddress);
		
		try {
			int step = 1;
			testSteps.add("Step" + step + ": verify that user should be redirected to homepage");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step" + step + ": Click on <b>Join Now</b> button");
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

			testSteps.add("Step" + step + ": Click on Back Button");
			employerSignUpPage.clickByHoverOnLogo(driver);
			step++;

			testSteps.add("Step " + step
					+ " : Verify user is redirected to the 'Dashboard Page' and account is created successfully");
			assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),
					"Verified user  is redirected to the 'Dashboard Page'");
			step++;

			testSteps.add("Step" + step + ": Click on Back Button");
			employerSignUpPage.clickByHoverOnLogo(driver);
			step++;

			testSteps.add("Step " + step + " :Click on 'Profile Picture'");
			employerDashBoardPage.clickProfilePictureCircle(driver);
			step++;

			testSteps.add("Step " + step + " :Click on 'Profile' button");
			candidateProfilePage.clickProfileButton(driver);
			step++;

			testSteps.add("Step " + step + ": Verify user is navigated to <b>Company Profile</b> Page");
			assertTrue(employerDashBoardPage.isCompanyProfileLabelDisplay(driver));
			step++;

			testSteps.add("Step " + step + ": Edit the email field that has title Manage your Account");
			employerCompanyProfilePage.editManageYourAccountEmailField(updatedEmailAddress, driver);
			step++;

			testSteps.add("Step " + step + ": Click on Update Button");
			employerCompanyProfilePage.clickOnUpdateEmailButton(driver);

			testSteps.add("Step " + step + ": Verify User is logged out after email update");
			employerCompanyProfilePage.isLoginPageDisplayed(driver);
			step++;

			testSteps.add("Step " + step + ": Click on Login Button");
			employerCompanyProfilePage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + "Enter Email address");
			employerCompanyProfilePage.enterEmailAddress(email, driver);
			step++;

			testSteps.add("Step " + step + ": Enter Password");
			employerCompanyProfilePage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + ": Click on submit Login Button");
			employerCompanyProfilePage.clickOnSubmitLoginButton(driver);
			step++;

			try {
				testSteps.add("Step " + step + ": Verify not Login successfull ");
				assertFalse(employerLoginPage.isEmployerLoginSuccessfully(driver));
				step++;				
			} catch (Exception e) {
				// TODO: handle exception
			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_61_VerifyThatOnUpdatingEmailUserIsNotAbleToLoginWithPreviousEmail", testSteps, driver);

		} catch (Exception e) {
			testSteps.add("Failed: TC_ID_61_VerifyThatOnUpdatingEmailUserIsNotAbleToLoginWithPreviousEmail "
					+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_61_VerifyThatOnUpdatingEmailUserIsNotAbleToLoginWithPreviousEmail", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_61_VerifyThatOnUpdatingEmailUserIsNotAbleToLoginWithPreviousEmail"
					+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_61_VerifyThatOnUpdatingEmailUserIsNotAbleToLoginWithPreviousEmail", testSteps, driver);
			assertTrue(false);
		}

	}

}
