package com.ultimateqa.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ultimateqa.base.BaseClass;
import com.ultimateqa.base.PropertiesReader;
import com.ultimateqa.listeners.RetryListener;
import com.ultimateqa.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin extends BaseClass {
	String tempSrc = "";

	@Test(priority = 1)
	public void VerifySignInValidCredential() throws IOException {
		// Initializing variables and setting up the WebDriver
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		LoginPage loginPage;
		
		
		

		// Initialize the WebDriver configuration
		driver = initConfiguration();

		// Create a LoginPage instance using the WebDriver
		loginPage = new LoginPage(driver);

		// Retrieve email and password from properties file
		String email = PropertiesReader.getPropertyValue("appUser");
		String pass = PropertiesReader.getPropertyValue("appPass");
		int steps = 0;
		try {
		    testSteps.add("Step " + (++steps) + " : Visit app URL");
		    navigateToURL(PropertiesReader.getPropertyValue("appURL"), driver);

		    testSteps.add("Step " + (++steps) + " : Click On Sign In Link");
		    loginPage.clickOnSignInLink(driver);

		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Login Page Title'</b> is displayed");
		    assertTrue(loginPage.isLoginPageTitleDisplaying(driver), "Login Page Title is displayed");

		    testSteps.add("Step " + (++steps) + " : Entering Email: " + email);
		    loginPage.enterEmail(driver, email);

		    testSteps.add("Step " + (++steps) + " : Entering Password: " + pass);
		    loginPage.enterPassword(driver, pass);

		    testSteps.add("Step " + (++steps) + " : Click On Sign In Button");
		    loginPage.clickOnSignInButton(driver);

		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Signed in Successfully Message Popup'</b> is displayed");
		    assertTrue(loginPage.isSignedInSuccessfullyMsgPopupDisplaying(driver), "Signed in Successfully Message Popup is displayed");

		    testSteps.add("Step " + (++steps) + " : Close the Browser");
		 // Capture a screenshot for the test report
		    tempSrc = getScreenshotPath();
		    testSteps.add(tempSrc);
		    captureCapture(driver, tempSrc);

		    // Add the test steps to the Extent report
		    AddTest_IntoReport("VerifySignInValidCredential", testSteps, driver);

		} catch (Exception e) {
		    // Handle exceptions and add failure details to the test report
		    testSteps.add("Failed: VerifySignInValidCredential " + "<br><b>Exception:</b><br> " + e.toString());
		    tempSrc = getScreenshotPath();
		    testSteps.add(tempSrc);
		    captureCapture(driver, tempSrc);

		    // Check if the maximum retry count is reached, else close the browser
		    if (BaseClass.methodNamelist.get("VerifySignInValidCredential") == RetryListener.maxRetryCnt) {
		        AddTest_IntoReport("VerifySignInValidCredential", testSteps, driver);
		    } else {
		        closeBrowser(driver);
		    }
		    assertTrue(false);

		} catch (Error e) {
		    // Handle errors and add failure details to the test report
		    testSteps.add("Failed: VerifySignInValidCredential " + "<br><b>Error:</b><br> " + e.toString());
		    tempSrc = getScreenshotPath();
		    testSteps.add(tempSrc);
		    captureCapture(driver, tempSrc);

		    // Check if the maximum retry count is reached, else close the browser
		    if (BaseClass.methodNamelist.get("VerifySignInValidCredential") == RetryListener.maxRetryCnt) {
		        AddTest_IntoReport("VerifySignInValidCredential", testSteps, driver);
		    } else {
		        closeBrowser(driver);
		    }
		    assertTrue(false);
		}
	}
//	
//	@Test(priority = 2)
//	public void VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly() throws IOException {
//		// Initializing variables and setting up the WebDriver
//		WebDriver driver = null;
//		ArrayList<String> testSteps = new ArrayList<>();
//		LoginPage loginPage;
//
//		// Initialize the WebDriver configuration
//		driver = initConfiguration();
//
//		// Create a LoginPage instance using the WebDriver
//		loginPage = new LoginPage(driver);
//
//		// Retrieve email and password from properties file
//		String email = PropertiesReader.getPropertyValue("appUser");
//		String pass = PropertiesReader.getPropertyValue("appPass");
//		String profileEmail="Demo@gmail.com";
//		String profileFirstName="TestX";
//		String profileLastName="UserX";
//		String profileCompany="UltimateX";
//		String profileProfessionalTitle="SQAX";
//		int steps = 0;
//		try {
//		    testSteps.add("Step " + (++steps) + " : Visit app URL");
//		    navigateToURL(PropertiesReader.getPropertyValue("appURL"), driver);
//
//		    testSteps.add("Step " + (++steps) + " : Click On Sign In Link");
//		    loginPage.clickOnSignInLink(driver);
//
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Login Page Title'</b> is displayed");
//		    assertTrue(loginPage.isLoginPageTitleDisplaying(driver), "Login Page Title is displayed");
//
//		    testSteps.add("Step " + (++steps) + " : Entering Email: " + email);
//		    loginPage.enterEmail(driver, email);
//
//		    testSteps.add("Step " + (++steps) + " : Entering Password: " + pass);
//		    loginPage.enterPassword(driver, pass);
//
//		    testSteps.add("Step " + (++steps) + " : Click On Sign In Button");
//		    loginPage.clickOnSignInButton(driver);
//
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Signed in Successfully Message Popup'</b> is displayed");
//		    assertTrue(loginPage.isSignedInSuccessfullyMsgPopupDisplaying(driver), "Signed in Successfully Message Popup is displayed");
//
//		    testSteps.add("Step " + (++steps) + " : Click On Profile Dropdown");
//		    loginPage.clickOnProfileDropdown(driver);
//		    
//		    testSteps.add("Step " + (++steps) + " : Click On My Account Option");
//		    loginPage.clickOnMyAccountOption(driver);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Page'</b> is displayed");
//		    assertTrue(loginPage.isProfilePageDisplaying(driver), "Profile Page is displayed");
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Email: " + profileEmail);
//		    loginPage.enterProfileEmail(driver, profileEmail);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Email Field:' "+profileEmail+"</b> populated correctly");
//		    Assert.assertTrue(profileEmail.equals(loginPage.getProfileEmailText(driver)), "Profile Email Field populated correctly");
//		   
//		    testSteps.add("Step " + (++steps) + " : Entering Profile First Name: " + profileFirstName);
//		    loginPage.enterFirstName(driver, profileFirstName);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile First Name Field:' "+profileFirstName+"</b> populated correctly");
//		    Assert.assertTrue(profileFirstName.equals(loginPage.getProfileFirstNameText(driver)), "Profile First Name Field populated correctly");
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Last Name: " + profileLastName);
//		    loginPage.enterProfileLastName(driver, profileLastName);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Last Name Field:' "+profileLastName+"</b> populated correctly");
//		    Assert.assertTrue(profileLastName.equals(loginPage.getProfileLastNameText(driver)), "Profile Last Name Field populated correctly");
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Company: " + profileCompany);
//		    loginPage.enterProfileCompany(driver, profileCompany);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Company Field:' "+profileCompany+"</b> populated correctly");
//		    Assert.assertTrue(profileCompany.equals(loginPage.getProfileCompanyText(driver)), "Profile Company Field populated correctly");
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Professional Title: " + profileProfessionalTitle);
//		    loginPage.enterProfileProfessionalTitle(driver, profileProfessionalTitle);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Professional Title Field:' "+profileProfessionalTitle+"</b> populated correctly");
//		    Assert.assertTrue(profileProfessionalTitle.equals(loginPage.getProfileProfessionalTitleText(driver)), "Profile Professional Title Field populated correctly");
//		    
//		    testSteps.add("Step " + (++steps) + " : Close the Browser");
//		 // Capture a screenshot for the test report
//		    tempSrc = getScreenshotPath();
//		    testSteps.add(tempSrc);
//		    captureCapture(driver, tempSrc);
//
//		    // Add the test steps to the Extent report
//		    AddTest_IntoReport("VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly", testSteps, driver);
//
//		} catch (Exception e) {
//		    // Handle exceptions and add failure details to the test report
//		    testSteps.add("Failed: VerifySignIn_ValidCredential " + "<br><b>Exception:</b><br> " + e.toString());
//		    tempSrc = getScreenshotPath();
//		    testSteps.add(tempSrc);
//		    captureCapture(driver, tempSrc);
//
//		    // Check if the maximum retry count is reached, else close the browser
//		    if (BaseClass.methodNamelist.get("VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly") == RetryListener.maxRetryCnt) {
//		        AddTest_IntoReport("VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly", testSteps, driver);
//		    } else {
//		        closeBrowser(driver);
//		    }
//		    assertTrue(false);
//
//		} catch (Error e) {
//		    // Handle errors and add failure details to the test report
//		    testSteps.add("Failed: VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly " + "<br><b>Error:</b><br> " + e.toString());
//		    tempSrc = getScreenshotPath();
//		    testSteps.add(tempSrc);
//		    captureCapture(driver, tempSrc);
//
//		    // Check if the maximum retry count is reached, else close the browser
//		    if (BaseClass.methodNamelist.get("VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly") == RetryListener.maxRetryCnt) {
//		        AddTest_IntoReport("VerifyNavigatesToProfilePageValiduserDetailsPopulatedCorrectly", testSteps, driver);
//		    } else {
//		        closeBrowser(driver);
//		    }
//		    assertTrue(false);
//		}
//	}
//	
//	@Test(priority = 1)
//	public void UpdatesUserProfileAndValidatesChanges() throws IOException {
//		// Initializing variables and setting up the WebDriver
//		WebDriver driver = null;
//		ArrayList<String> testSteps = new ArrayList<>();
//		LoginPage loginPage;
//
//		// Initialize the WebDriver configuration
//		driver = initConfiguration();
//
//		// Create a LoginPage instance using the WebDriver
//		loginPage = new LoginPage(driver);
//
//		// Retrieve email and password from properties file
//		String email = PropertiesReader.getPropertyValue("appUser");
//		String pass = PropertiesReader.getPropertyValue("appPass");
//		String profileFirstName="Test"+generateRandomNumberWithGivenNumberOfDigits(5, driver);
//		String profileLastName="User"+generateRandomNumberWithGivenNumberOfDigits(5, driver);
//		String profileCompany="Ultimate"+generateRandomNumberWithGivenNumberOfDigits(5, driver);
//		String profileProfessionalTitle="SQA"+generateRandomNumberWithGivenNumberOfDigits(5, driver);
//		int steps = 0;
//		try {
//		    testSteps.add("Step " + (++steps) + " : Visit app URL");
//		    navigateToURL(PropertiesReader.getPropertyValue("appURL"), driver);
//
//		    testSteps.add("Step " + (++steps) + " : Click On Sign In Link");
//		    loginPage.clickOnSignInLink(driver);
//
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Login Page Title'</b> is displayed");
//		    assertTrue(loginPage.isLoginPageTitleDisplaying(driver), "Login Page Title is displayed");
//
//		    testSteps.add("Step " + (++steps) + " : Entering Email: " + email);
//		    loginPage.enterEmail(driver, email);
//
//		    testSteps.add("Step " + (++steps) + " : Entering Password: " + pass);
//		    loginPage.enterPassword(driver, pass);
//
//		    testSteps.add("Step " + (++steps) + " : Click On Sign In Button");
//		    loginPage.clickOnSignInButton(driver);
//
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Signed in Successfully Message Popup'</b> is displayed");
//		    assertTrue(loginPage.isSignedInSuccessfullyMsgPopupDisplaying(driver), "Signed in Successfully Message Popup is displayed");
//
//		    testSteps.add("Step " + (++steps) + " : Click On Profile Dropdown");
//		    loginPage.clickOnProfileDropdown(driver);
//		    
//		    testSteps.add("Step " + (++steps) + " : Click On My Account Option");
//		    loginPage.clickOnMyAccountOption(driver);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Page'</b> is displayed");
//		    assertTrue(loginPage.isProfilePageDisplaying(driver), "Profile Page is displayed");
//		   
//		    testSteps.add("Step " + (++steps) + " : Entering Profile First Name: " + profileFirstName);
//		    loginPage.enterFirstName(driver, profileFirstName);
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Last Name: " + profileLastName);
//		    loginPage.enterProfileLastName(driver, profileLastName);
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Company: " + profileCompany);
//		    loginPage.enterProfileCompany(driver, profileCompany);
//		    
//		    testSteps.add("Step " + (++steps) + " : Entering Profile Professional Title: " + profileProfessionalTitle);
//		    loginPage.enterProfileProfessionalTitle(driver, profileProfessionalTitle);
//		    
//		    testSteps.add("Step " + (++steps) + " : Click On Profile Save Changes Button");
//		    loginPage.clickOnProfileSaveChangesButton(driver);
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Last Name :' "+profileLastName+"</b> changed");
//		    Assert.assertTrue(profileLastName.equals(loginPage.getProfileLastNameText(driver)), "Profile Last Name  changed");
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile First Name :' "+profileFirstName+"</b> changed");
//		    Assert.assertTrue(profileFirstName.equals(loginPage.getProfileFirstNameText(driver)), "Profile First Name  changed");
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Company Field:' "+profileCompany+"</b> changed");
//		    Assert.assertTrue(profileCompany.equals(loginPage.getProfileCompanyText(driver)), "Profile Company changed");
//		    
//		    testSteps.add("Step " + (++steps) + " : Verifying <b>'Profile Professional Title :' "+profileProfessionalTitle+"</b> changed");
//		    Assert.assertTrue(profileProfessionalTitle.equals(loginPage.getProfileProfessionalTitleText(driver)), "Profile Professional Title changed");
//		    
//		    testSteps.add("Step " + (++steps) + " : Close the Browser");
//		 // Capture a screenshot for the test report
//		    tempSrc = getScreenshotPath();
//		    testSteps.add(tempSrc);
//		    captureCapture(driver, tempSrc);
//
//		    // Add the test steps to the Extent report
//		    AddTest_IntoReport("UpdatesUserProfileAndValidatesChanges", testSteps, driver);
//
//		} catch (Exception e) {
//		    // Handle exceptions and add failure details to the test report
//		    testSteps.add("Failed: UpdatesUserProfileAndValidatesChanges " + "<br><b>Exception:</b><br> " + e.toString());
//		    tempSrc = getScreenshotPath();
//		    testSteps.add(tempSrc);
//		    captureCapture(driver, tempSrc);
//
//		    // Check if the maximum retry count is reached, else close the browser
//		    if (BaseClass.methodNamelist.get("UpdatesUserProfileAndValidatesChanges") == RetryListener.maxRetryCnt) {
//		        AddTest_IntoReport("UpdatesUserProfileAndValidatesChanges", testSteps, driver);
//		    } else {
//		        closeBrowser(driver);
//		    }
//		    assertTrue(false);
//
//		} catch (Error e) {
//		    // Handle errors and add failure details to the test report
//		    testSteps.add("Failed: UpdatesUserProfileAndValidatesChanges " + "<br><b>Error:</b><br> " + e.toString());
//		    tempSrc = getScreenshotPath();
//		    testSteps.add(tempSrc);
//		    captureCapture(driver, tempSrc);
//
//		    // Check if the maximum retry count is reached, else close the browser
//		    if (BaseClass.methodNamelist.get("UpdatesUserProfileAndValidatesChanges") == RetryListener.maxRetryCnt) {
//		        AddTest_IntoReport("UpdatesUserProfileAndValidatesChanges", testSteps, driver);
//		    } else {
//		        closeBrowser(driver);
//		    }
//		    assertTrue(false);
//		}
//	}
}
