package com.vetscout.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.listeners.ExtentListeners;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.SingupPage;

public class SingupTest extends BaseClass {

	@Test(priority = 1)
	public void TC_ID_13_VerifyUserNotAbleSignupWithoutEnteringDataIntoRequiredFields() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		SingupPage singupPage = new SingupPage();

		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Click here To Create One</b> Link");
		login.clickOnClickHereToCreateOneLink();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Click Here To Create One' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isClickHereToCreateOnePageTitleDisplaying(),
				"Verified'Click Here To Create One' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On  Singup <b>Next</b> Button");
		singupPage.clickOnSingupNextButton();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Click Here To Create One' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isClickHereToCreateOnePageTitleDisplaying(),
				"Verified'Click Here To Create One' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 2)
	public void TC_ID_14_VerifyUserAbleToSeeValidationMessageOnLeavingRequiredFieldBlankAndClickNextButton()
			throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		SingupPage singupPage = new SingupPage();

		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Click here To Create One</b> Link");
		login.clickOnClickHereToCreateOneLink();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Click Here To Create One' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isClickHereToCreateOnePageTitleDisplaying(),
				"Verified'Click Here To Create One' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On  Singup <b>Next</b> Button");
		singupPage.clickOnSingupNextButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify Company Name'Please fill out field' Popup is displaying");
		ErrorCollector.verifyTrue(singupPage.isCompanyNameInputValidtionPopupDisplaying(),
				"Verified Company Name Field 'Please fill out field' Popup is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 3)
	public void TC_ID_15_VerifyUserAbleToRedirectBackToSignPageFromSignupPage() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		SingupPage singupPage = new SingupPage();

		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Click here To Create One</b> Link");
		login.clickOnClickHereToCreateOneLink();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Click Here To Create One' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isClickHereToCreateOnePageTitleDisplaying(),
				"Verified'Click Here To Create One' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Signup Page <b>Signin</b> Button");
		singupPage.clickOnSignupPageSigninButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Login Page Title' is displaying");
		ErrorCollector.verifyTrue(login.isLoginPageTitleDisplaying(), "Verified'Login Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 3)
	public void TC_ID_16_VerifyUserIsAbleToGoToNextStepByEnteringDataInAllRequiredFieldsAndClickingOnNext()
			throws InterruptedException {

		Random rand = new Random();
		int val = rand.nextInt(10000000);
		String value = Integer.toString(val);

		rand = new Random();
		int phn = rand.nextInt(10000000);
		String phone = "510" + Integer.toString(phn);

		String zipcode = "042";
		String firstName = "Toney";
		String lastName = "Iglesius";

		rand = new Random();
		int num = rand.nextInt(1000);
		String email = firstName + firstName + Integer.toString(num) + "@gmail.com";

		String password = "LetMeIn123";

		initConfiguration();

		LoginPage login = new LoginPage();
		SingupPage singupPage = new SingupPage();

		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Click here To Create One</b> Link");
		login.clickOnClickHereToCreateOneLink();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Click Here To Create One' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isClickHereToCreateOnePageTitleDisplaying(),
				"Verified'Click Here To Create One' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Enter Practice Name : <b>" + "Toney_Pets_Clinic" + value + "</b>");
		singupPage.enterSignupPagePracticeName("Toney_Pets_Clinic" + value);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Practice Phone : <b>" + phone + "</b>");
		singupPage.enterSignupPagePracticePhone(phone);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Practice Zipcode : <b>" + zipcode + "</b>");
		singupPage.enterSignupPagePracticeZipCode(zipcode);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First name : <b>" + firstName + "</b>");
		singupPage.enterSignupPagePracticeFirstName(firstName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last name : <b>" + lastName + "</b>");
		singupPage.enterSignupPageLastName(lastName);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter email : <b>" + email + "</b>");
		singupPage.enterSignupPageEmail(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password : <b>" + password + "</b>");
		singupPage.enterSignupPagePassword(password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Re Enter Password : <b>" + password + "</b>");
		singupPage.enterSignupPageRetypePassword(password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On  Singup <b>Next</b> Button");
		singupPage.clickOnSingupNextButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + "Verify 'Successful Registeration PopUp' is visible");
		ErrorCollector.verifyTrue(singupPage.isRegisterationSuccessfulPopUpDisplaying(),
				"Verified 'Successful Registeration PopUp' is visible");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
}
