package com.vetscout.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.listeners.ExtentListeners;
import com.vetscout.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test(priority = 1)
	public void TC_ID_1_LoginWithValidCrdentials() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + Email + "</b>");
		login.enterLoginEmail(Email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password " + Password + "</b>");
		login.enterLoginPassword(Password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		login.clickOnLoginButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 2)
	public void TC_ID_2_LoginWithInvalidCredentials() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String invalidEmail = PropertiesReader.getPropertyValue(env + "_" + "Invalid_EmailId");
		String invalidPassword = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Enter Invalid Email Address : <b>" + invalidEmail + "</b>");
		login.enterLoginEmail(invalidEmail);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Invalid Password " + invalidPassword + "</b>");
		login.enterLoginPassword(invalidPassword);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		login.clickOnLoginButton();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Invalid UserName And Password' Popup is displaying");
		ErrorCollector.verifyTrue(login.isInvalidUsernameAndPasswordPopupDisplaying(),
				"Verified 'Invalid UserName And Password' Popup is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 3)
	public void TC_ID_3_ValidationPopupWhenFieldIsBlank() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String invalidEmail = PropertiesReader.getPropertyValue(env + "_" + "Invalid_EmailId");
		String invalidPassword = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		login.clickOnLoginButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify Email Field 'Please fill out field' Popup is displaying");
		ErrorCollector.verifyTrue(login.isValidtionPopupDisplaying(),
				"Verified Email Field 'Please fill out field' Popup is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 4)
	public void TC_ID_4_ValidationMessageWhenEnteringInvalidCredentials() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + Email + "</b>");
		login.enterLoginEmail(Email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password " + Password + "</b>");
		login.enterLoginPassword(Password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		login.clickOnLoginButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 5)
	public void TC_ID_5_VerifyForgotPasswordLinkWorks() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + Email + "</b>");
		login.enterLoginEmail(Email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Forgot Password</b> Links");
		login.clickOnForgotPasswordButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Forgot Password' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isForgotPasswordPageTitleDisplaying(),
				"Verified 'Forgot Password' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 6)
	public void TC_ID_6_VerifyHomescreenWhenLoggingIn() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + Email + "</b>");
		login.enterLoginEmail(Email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password " + Password + "</b>");
		login.enterLoginPassword(Password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		login.clickOnLoginButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 7)
	public void TC_ID_7_VerifySignInPageWhenRedirectedSite() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Login Page Title' is displaying");
		ErrorCollector.verifyTrue(login.isLoginPageTitleDisplaying(), "Verified'Login Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 8)
	public void TC_ID_8_LoginWithRememberMe() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + Email + "</b>");
		login.enterLoginEmail(Email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password " + Password + "</b>");
		login.enterLoginPassword(Password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Remember Me</b> Checkbox");
		login.clickOnRememberMeCheckbox();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		login.clickOnLoginButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>User Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Logout</b> Button");
		login.clickOnLogoutButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Email Text Field' is Populated");
		assertEquals(Email, login.getEmail(), "Verify 'Email Text Field' is Populated");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 9)
	public void TC_ID_9_VerifyClickHereToCreateOneLink() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 12)
	public void TC_ID_10_VerifyUserIsAbleToEnterPasswordAsteriskSign() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + Email + "</b>");
		login.enterLoginEmail(Email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password " + Password + "</b>");
		login.enterLoginPassword(Password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Password' is not visible");
		assertNotEquals(Password, login.getPasswordInput(), "Verify 'Password' is not visible");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 10)
	public void TC_ID_11_VerifyUserRedirectedToDowloadAppFromAppstoreButton() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>App Store</b> Button");
		login.clickOnAppStoreButton();

		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		
		login.waitUnitlAppStorePageLoad();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'App Store' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isAppStorePageTitleDisplaying(),
				"Verified'App Store' Page Title is displaying");

		waitTime(1000);

		driver.close();
		driver.switchTo().window(browserTabs.get(0));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 11)
	public void TC_ID_12_VerifyUserRedirectedToDowloadAppFromPlaystoreButton() throws InterruptedException {

		initConfiguration();

		LoginPage login = new LoginPage();
		int step = 1;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Play Store</b> Button");
		login.clickOnPlayStoreButton();

		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Play Store' Page Title is displaying");
		ErrorCollector.verifyTrue(login.isPlayStorePageTitleDisplaying(),
				"Verified'Play Store' Page Title is displaying");
		waitTime(1000);
		driver.close();
		driver.switchTo().window(browserTabs.get(0));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


}
