package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateLoginPage;
import com.medrep.pages.CandidateProfilePage;
import com.medrep.pages.CandidateSignUpPage;

public class CandidateLogin extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_1_VerifyTheLoginButtonIsClickableAndFunctional() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'medrep Logo'</b> on login popup");
			assertTrue(candidateLoginPage.isMedrepLogoDisplay(driver), "Verified <b>'medrep Logo'</b> on login popup");
			step++;

			testSteps.add("Step " + step + " : Verify <b>'Email'</b> text field is displaying");
			assertTrue(candidateLoginPage.isEmailFieldDisplay(driver), "Verified <b>'Email'</b> text field is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Current Members Login To Your Account'</b> Text is displaying");
			assertTrue(candidateLoginPage.isCurrentMembersLoginToYourAccountTextDisplay(driver), "Verified <b>'Current Members Login To Your Account'</b> Text is displayed");
			step++;			
			
			testSteps.add("Step " + step + " : Verify <b>'Remember Me Next Time'</b> Checkbox is displaying");
			assertTrue(candidateLoginPage.isRememberMeNextTimeCheckboxDisplay(driver), "Verified <b>'Remember Me Next Time'</b> Checkbox is displayed");
			step++;			
			
			testSteps.add("Step " + step + " : Verify <b>'Forgot Password'</b> Button is displaying");
			assertTrue(candidateLoginPage.isForgotPasswordButtonDisplay(driver), "Verified <b>'Forgot Password'</b> Button is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Not a member yet?'</b> text is displaying");
			assertTrue(candidateLoginPage.isNotAMemberYetDisplay(driver), "Verified <b>'Not a member yet?'</b> text is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Create An Account'</b> link is displaying");
			assertTrue(candidateLoginPage.isCreateAnAccountDisplay(driver), "Verified <b>'Create An Account'</b> link is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'By signing in to MedReps.com, you agree to MedReps.com's Terms of Use & Privacy Policy.'</b> link is displaying");
			assertTrue(candidateLoginPage.isBySigningInToMedRepsTextDisplay(driver), "Verified <b>'By signing in to MedReps.com, you agree to MedReps.com's Terms of Use & Privacy Policy.'</b> link is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Verify copyright text <b>'2000-2022 MedReps. All rights reserved.'</b> text is displaying");
			assertTrue(candidateLoginPage.isCopyrightTextDisplay(driver), "Verified copyright text <b>'2000-2022 MedReps. All rights reserved.'</b> text is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Verify image on right side with text <b>'The go-to site for medical sales jobs and advice'</b> text is displaying");
			assertTrue(candidateLoginPage.isImageOnRightSideWitTextDisplay(driver), "Verified image on right side with text <b>'The go-to site for medical sales jobs and advice'</b> text is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_1_VerifyTheLoginButtonIsClickableAndFunctional", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_1_VerifyTheLoginButtonIsClickableAndFunctional " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_1_VerifyTheLoginButtonIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_1_VerifyTheLoginButtonIsClickableAndFunctional" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_1_VerifyTheLoginButtonIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_2_VerifyTheEyeIconInThePasswordFieldOnLoginPopIsUnmaskingThePassword() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'medrep Logo'</b> on login popup");
			assertTrue(candidateLoginPage.isMedrepLogoDisplay(driver), "Verified <b>'medrep Logo'</b> on login popup");
			step++;

			testSteps.add("Step " + step + " : Verify <b>'Eye'</b> Icon is displaying");
			assertTrue(candidateLoginPage.isEyeIconInPasswordTextDisplay(driver), "Verified <b>'Eye'</b> Icon is displayed");
			step++;
						
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_2_VerifyTheEyeIconInThePasswordFieldOnLoginPopIsUnmaskingThePassword", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_2_VerifyTheEyeIconInThePasswordFieldOnLoginPopIsUnmaskingThePassword " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_2_VerifyTheEyeIconInThePasswordFieldOnLoginPopIsUnmaskingThePassword", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_2_VerifyTheEyeIconInThePasswordFieldOnLoginPopIsUnmaskingThePassword" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_2_VerifyTheEyeIconInThePasswordFieldOnLoginPopIsUnmaskingThePassword", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_3_VerfiyTheEyeIconIsClickAbleAndFunctiona() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'medrep Logo'</b> on login popup");
			assertTrue(candidateLoginPage.isMedrepLogoDisplay(driver), "Verified <b>'medrep Logo'</b> on login popup");
			step++;

			testSteps.add("Step " + step + " : Verify <b>'Eye'</b> Icon is displaying");
			assertTrue(candidateLoginPage.isEyeIconInPasswordTextDisplay(driver), "Verified <b>'Eye'</b> Icon is displayed");
			step++;
			
			testSteps.add("Step "+step+" : Enter 'Password':"+password);
	        candidateProfilePage.enterPassword(password,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Click on 'Eye Icon' in password text field");
	        candidateLoginPage.clickOnEyeIconInPasswordTxt(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'password'</b>  is displaying in password field");
			assertTrue(candidateLoginPage.verifyEnterPasswrodIsDisplaying(password,driver), "Verified <b>'password'</b> is displayed in password field");
			step++;			
	        			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_3_VerfiyTheEyeIconIsClickAbleAndFunctiona", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_3_VerfiyTheEyeIconIsClickAbleAndFunctiona " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_3_VerfiyTheEyeIconIsClickAbleAndFunctiona", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_3_VerfiyTheEyeIconIsClickAbleAndFunctiona" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_3_VerfiyTheEyeIconIsClickAbleAndFunctiona", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_4_VerifyTheForgetPasswordLinkOnTheLoginPop() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Forgot Password'</b> Button is displaying");
			assertTrue(candidateLoginPage.isForgotPasswordButtonDisplay(driver), "Verified <b>'Forgot Password'</b> Button is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_4_VerifyTheForgetPasswordLinkOnTheLoginPop", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_4_VerifyTheForgetPasswordLinkOnTheLoginPop " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_4_VerifyTheForgetPasswordLinkOnTheLoginPop", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_4_VerifyTheForgetPasswordLinkOnTheLoginPop" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_4_VerifyTheForgetPasswordLinkOnTheLoginPop", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_5_VerifyTheForgetPasswordLinkIsClickable() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Forgot Password'</b> Button is displaying");
			assertTrue(candidateLoginPage.isForgotPasswordButtonDisplay(driver), "Verified <b>'Forgot Password'</b> Button is displayed");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Forgot Password' button");
			candidateLoginPage.clickOnForgotPasswordButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Forgot Password'</b> Page is displaying");
			assertTrue(candidateLoginPage.isForgotPasswordPageDisplay(driver), "Verified <b>'Forgot Password'</b> Page is displayed");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_5_VerifyTheForgetPasswordLinkIsClickable", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_5_VerifyTheForgetPasswordLinkIsClickable " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_5_VerifyTheForgetPasswordLinkIsClickable", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_5_VerifyTheForgetPasswordLinkIsClickable" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_5_VerifyTheForgetPasswordLinkIsClickable", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_6_VerifyTheLinkCreateAnAccountIsClickableAndFunctional() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Create An Account'</b> link is displaying");
			assertTrue(candidateLoginPage.isCreateAnAccountDisplay(driver), "Verified <b>'Create An Account'</b> link is displayed");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'create an account' Link");
			candidateLoginPage.clickOnCreateAnAccountLink(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify <b>'Register For A MedReps Membership'</b> popup is displaying");
			assertTrue(candidateLoginPage.isRegisterForAMedRepsMembershipPopupDisplay(driver), "Verified <b>'Register For A MedReps Membership'</b> popup is displayed");
			step++;		
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_6_VerifyTheLinkCreateAnAccountIsClickableAndFunctional", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_6_VerifyTheLinkCreateAnAccountIsClickableAndFunctional " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_6_VerifyTheLinkCreateAnAccountIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_6_VerifyTheLinkCreateAnAccountIsClickableAndFunctional" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_6_VerifyTheLinkCreateAnAccountIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_7_VerifyTheLinkTermsOfUsePrivacyPolicyIsClickableAndFunctional() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Create An Account'</b> link is displaying");
			assertTrue(candidateLoginPage.isCreateAnAccountDisplay(driver), "Verified <b>'Create An Account'</b> link is displayed");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Terms Of Use Privacy Policy' link");
			candidateLoginPage.clickOnTermsOfUsePrivacyPolicylink(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify <b>'Terms Of Use Privacy Policy'</b> page is displaying");
			assertTrue(candidateLoginPage.isTermsOfUsePrivacyPolicyPageDisplay(driver), "Verified <b>'Terms Of Use Privacy Policy'</b> page  is displayed");
			step++;		
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_7_VerifyTheLinkTermsOfUsePrivacyPolicyIsClickableAndFunctional", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_7_VerifyTheLinkTermsOfUsePrivacyPolicyIsClickableAndFunctional " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_7_VerifyTheLinkTermsOfUsePrivacyPolicyIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_7_VerifyTheLinkTermsOfUsePrivacyPolicyIsClickableAndFunctional" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_7_VerifyTheLinkTermsOfUsePrivacyPolicyIsClickableAndFunctional", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_8_VerifyUserShouldBeAbleToLoginWithTheValidCredentialsEitherForEmployerOrCandidate() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(candidateProfilePage.isEmailFieldDisplay(driver),"Verified 'Email' is field display");
			step++;
			
			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			candidateProfilePage.enterEmailAddress(emailAddress,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Enter 'Password':"+password);
	        candidateProfilePage.enterPassword(password,driver);
	        step++;
            
	        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
	        candidateProfilePage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify <b>'Home'</b> page is displaying");
			assertTrue(candidateLoginPage.isHomePageDisplay(driver), "Verified <b>'Home'</b> page  is displayed");
			step++;	
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_8_VerifyUserShouldBeAbleToLoginWithTheValidCredentialsEitherForEmployerOrCandidate", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_8_VerifyUserShouldBeAbleToLoginWithTheValidCredentialsEitherForEmployerOrCandidate " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_8_VerifyUserShouldBeAbleToLoginWithTheValidCredentialsEitherForEmployerOrCandidate", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_8_VerifyUserShouldBeAbleToLoginWithTheValidCredentialsEitherForEmployerOrCandidate" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_8_VerifyUserShouldBeAbleToLoginWithTheValidCredentialsEitherForEmployerOrCandidate", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_9_VerifyUserShouldBeAbleToSeeValidationMessageOnAttemptToLoginWithWrongCredentials() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		String emailAddress = "testWrongEmail";
		String password = "testWrongPass";
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(candidateProfilePage.isEmailFieldDisplay(driver),"Verified 'Email' is field display");
			step++;
			
			testSteps.add("Step "+step+" : Enter Wrong 'Email Address':"+emailAddress);
			candidateProfilePage.enterEmailAddress(emailAddress,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Enter Wrong 'Password':"+password);
	        candidateProfilePage.enterPassword(password,driver);
	        step++;
            
	        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
	        candidateProfilePage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify user is not able to login with wrong credentials");
			assertFalse(candidateLoginPage.isHomePageDisplay(driver), "Verified user is not able to login with wrong credentials");
			step++;	
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_9_VerifyUserShouldBeAbleToSeeValidationMessageOnAttemptToLoginWithWrongCredentials", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_9_VerifyUserShouldBeAbleToSeeValidationMessageOnAttemptToLoginWithWrongCredentials " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_9_VerifyUserShouldBeAbleToSeeValidationMessageOnAttemptToLoginWithWrongCredentials", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_9_VerifyUserShouldBeAbleToSeeValidationMessageOnAttemptToLoginWithWrongCredentials" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_9_VerifyUserShouldBeAbleToSeeValidationMessageOnAttemptToLoginWithWrongCredentials", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_10_VerifyRememberMeFunctionalityIsWorkingFineOnLogin() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(candidateProfilePage.isEmailFieldDisplay(driver),"Verified 'Email' is field display");
			step++;
			
			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			candidateProfilePage.enterEmailAddress(emailAddress,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Enter 'Password':"+password);
	        candidateProfilePage.enterPassword(password,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Click on 'remember me next time' checkbox");
	        candidateLoginPage.clickOnRememberMeNextTimeCheckbox(driver);
	        step++;
            
	        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
	        candidateProfilePage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' dropdown icon");
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Logout' button");
			candidateSignUpPage.clickOnLogoutButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify credentials are repopulate on the login popup");
			assertTrue(candidateLoginPage.verifyCredentialsRepopulateOnTheLoginPopup(emailAddress,driver), "Verified credentials are repopulate on the login popup displayed");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_10_VerifyRememberMeFunctionalityIsWorkingFineOnLogin", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_10_VerifyRememberMeFunctionalityIsWorkingFineOnLogin" + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_10_VerifyRememberMeFunctionalityIsWorkingFineOnLogin", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_10_VerifyRememberMeFunctionalityIsWorkingFineOnLogin" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_10_VerifyRememberMeFunctionalityIsWorkingFineOnLogin", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_137_VerifyUserIsAbleToLogoutFromTheSite() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateLoginPage candidateLoginPage;
		CandidateProfilePage candidateProfilePage;
		CandidateSignUpPage candidateSignUpPage;

		driver = initConfiguration();
		candidateLoginPage = new CandidateLoginPage(driver);
		candidateProfilePage = new CandidateProfilePage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		Object[][] dataArr = getData(excelFileName,"ActiveCandidateLoginCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();
		
		try {

			int step = 1;

			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step "+step+" : Click on 'Login' button");
			candidateProfilePage.clickOnLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(candidateProfilePage.isEmailFieldDisplay(driver),"Verified 'Email' is field display");
			step++;
			
			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			candidateProfilePage.enterEmailAddress(emailAddress,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Enter 'Password':"+password);
	        candidateProfilePage.enterPassword(password,driver);
	        step++;
	        
	        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
	        candidateProfilePage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' dropdown icon");
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Logout' button");
			candidateSignUpPage.clickOnLogoutButton(driver);
			step++;
			
			testSteps.add("Step "+step+" : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver),"Verified user is redirected to the'Home Page'");
			step++;
			
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_137_VerifyUserIsAbleToLogoutFromTheSite", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_137_VerifyUserIsAbleToLogoutFromTheSite" + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_137_VerifyUserIsAbleToLogoutFromTheSite", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_137_VerifyUserIsAbleToLogoutFromTheSite" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_137_VerifyUserIsAbleToLogoutFromTheSite", testSteps, driver);
			assertTrue(false);
		}
	}

}
