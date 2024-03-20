package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateProfilePage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerCompanyProfilePage;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerLoginPage;
import com.medrep.pages.EmployerPostedJobsPage;
import com.medrep.utilities.Waits;

public class EmployerHamburger extends BaseClass{
	String tempSrc = "";
	

	@Test
	public void TC_ID_62_VerifyThatHamburgerIsClickableAndFunctionalThatIsPlacedAtTheTopRightSide(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";


		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' dropdown icon");
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;
			
			testSteps.add("Step "+step+": Verify that <b>Logout</b> Option is display");
			assertTrue(candidateSignUpPage.isLogoutOptionDisplay(driver),"Verified that <b>Logout</b> Option is displayed");
			step++;
			
			testSteps.add("Step "+step+": Verify that <b>Profile</b> Option is display");
			assertTrue(candidateSignUpPage.isProfileOptionDisplay(driver),"Verified that <b>Profile</b> Option is displayed");
			step++;

			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_62_VerifyThatHamburgerIsClickableAndFunctionalThatIsPlacedAtTheTopRightSide", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_62_VerifyThatHamburgerIsClickableAndFunctionalThatIsPlacedAtTheTopRightSide"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_62_VerifyThatHamburgerIsClickableAndFunctionalThatIsPlacedAtTheTopRightSide",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_62_VerifyThatHamburgerIsClickableAndFunctionalThatIsPlacedAtTheTopRightSide"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_62_VerifyThatHamburgerIsClickableAndFunctionalThatIsPlacedAtTheTopRightSide",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_63_VerifyThatTheHamburgerMenuHasAllTheRequiredMenuItemsProfileLogout(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";


		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' dropdown icon");
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;
			
			testSteps.add("Step "+step+": Verify that <b>Logout</b> Option is display");
			assertTrue(candidateSignUpPage.isLogoutOptionDisplay(driver),"Verified that <b>Logout</b> Option is displayed");
			step++;
			
			testSteps.add("Step "+step+": Verify that <b>Profile</b> Option is display");
			assertTrue(candidateSignUpPage.isProfileOptionDisplay(driver),"Verified that <b>Profile</b> Option is displayed");
			step++;

			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_63_VerifyThatTheHamburgerMenuHasAllTheRequiredMenuItemsProfileLogout", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_63_VerifyThatTheHamburgerMenuHasAllTheRequiredMenuItemsProfileLogout"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_63_VerifyThatTheHamburgerMenuHasAllTheRequiredMenuItemsProfileLogout",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_63_VerifyThatTheHamburgerMenuHasAllTheRequiredMenuItemsProfileLogout"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_63_VerifyThatTheHamburgerMenuHasAllTheRequiredMenuItemsProfileLogout",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_64_VerifyThatTheUserNavigatesToTheCompanyProfilePageOnClickProfileButton(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";


		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' dropdown icon");
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' Option");
			candidateSignUpPage.clickOnProfileOption(driver);
			step++;
//			
//			testSteps.add("Step "+step+": Verify that <b>Profile</b> Option is display");
//			assertTrue(candidateSignUpPage.isProfileOptionDisplay(driver),"Verified that <b>Profile</b> Option is displayed");
//			step++;
//			
			testSteps.add("Step "+step+": Verify that <b>Profile</b> page title is display");
			assertTrue(candidateSignUpPage.isProfilePageTitleDisplay(driver),"Verified that <b>Profile</b> page title is displayed");
			step++;
			
			
			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_64_VerifyThatTheUserNavigatesToTheCompanyProfilePageOnClickProfileButton", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_64_VerifyThatTheUserNavigatesToTheCompanyProfilePageOnClickProfileButton"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_64_VerifyThatTheUserNavigatesToTheCompanyProfilePageOnClickProfileButton",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_64_VerifyThatTheUserNavigatesToTheCompanyProfilePageOnClickProfileButton"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_64_VerifyThatTheUserNavigatesToTheCompanyProfilePageOnClickProfileButton",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_65_VerifyThatTheUserIsLoggedOutOnClickLogoutButton(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateProfilePage candidateProfilePage;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateProfilePage = new CandidateProfilePage (driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = "testuser@yopmail.com";
		String password = "Jakes12345j";


		try {
			int step = 1;
			testSteps.add("Step "+step+": Verify user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
			step++;

			testSteps.add("Step "+step+": Click on Login Button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter email "+emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+": Enter password "+password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step "+step+": Click on login submit button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on Dashboard Button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Profile' dropdown icon");
			candidateSignUpPage.clickOnProfileDropdownIcon(driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Logout' button");
			candidateSignUpPage.clickOnLogoutButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateProfilePage.isMedrepLogoDisplay(driver), "Verified user is redirected to the'Home Page'");
			step++;

			
			testSteps.add("Step "+step+": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_65_VerifyThatTheUserIsLoggedOutOnClickLogoutButton", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_65_VerifyThatTheUserIsLoggedOutOnClickLogoutButton"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_65_VerifyThatTheUserIsLoggedOutOnClickLogoutButton",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps
					.add("Failed: TC_ID_65_VerifyThatTheUserIsLoggedOutOnClickLogoutButton"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_65_VerifyThatTheUserIsLoggedOutOnClickLogoutButton",
					testSteps, driver);
			assertTrue(false);
		}
	}
}
