package com.medrep.test;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.EmployerNamedUsersPage;

public class EmployerNamedUsers extends BaseClass{
	String tempSrc = "";

	  @Test
		public void TC_ID_84_VerifyUserDirectedToNamesUserPageByClickingOnTheNamesUserFromLeftMenu(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Verify user is redirected to <b>Named User</b> Page");
			  assertTrue(employerNamedUsersPage.isPageHeadingDisplay(driver));
			  step++;

			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_84_VerifyUserDirectedToNamesUserPageByClickingOnTheNamesUserFromLeftMenu", testSteps, driver);


		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_84_VerifyUserDirectedToNamesUserPageByClickingOnTheNamesUserFromLeftMenu" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_84_VerifyUserDirectedToNamesUserPageByClickingOnTheNamesUserFromLeftMenu", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_84_VerifyUserDirectedToNamesUserPageByClickingOnTheNamesUserFromLeftMenu" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_84_VerifyUserDirectedToNamesUserPageByClickingOnTheNamesUserFromLeftMenu", testSteps, driver);
			  assertTrue(false);
		  }
	  }

	  @Test
		public void TC_ID_85_VerifyUserIsAbleToSearchNamedUsersFromTheNamedUsersAlreadyCreated(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Enter Name in searchfield");
			  employerNamedUsersPage.enterValueInSearchField(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_85_VerifyUserIsAbleToSearchNamedUsersFromTheNamedUsersAlreadyCreated", testSteps, driver);

		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_85_VerifyUserIsAbleToSearchNamedUsersFromTheNamedUsersAlreadyCreated" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_85_VerifyUserIsAbleToSearchNamedUsersFromTheNamedUsersAlreadyCreated", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_85_VerifyUserIsAbleToSearchNamedUsersFromTheNamedUsersAlreadyCreated" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_85_VerifyUserIsAbleToSearchNamedUsersFromTheNamedUsersAlreadyCreated", testSteps, driver);
			  assertTrue(false);
		  }
	  }

	  @Test
		public void TC_ID_86_VerifyUserIsAbleAddNamedUsers(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

//			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
//			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Click on Add User Button");
//			  employerNamedUsersPage.clickOnAddUserButton(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Enter Email on Add User Popup");
//			  employerNamedUsersPage.enterEmailInAddUserPopup(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Click on Add Button");
//			  employerNamedUsersPage.clickAddBtn(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Enter Password");
//			  employerNamedUsersPage.enterPasswordOnAddUser(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Enter Confirm Password");
//			  employerNamedUsersPage.enterConfirmPassword(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Click on Add Button");
//			  employerNamedUsersPage.clickAddBtn(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Verify Add User Success Alert Appears");
//			  assertTrue(employerNamedUsersPage.verifyUserCreatedMessageDisplaying(driver));
//			  step++;


			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_86_VerifyUserIsAbleAddNamedUsers", testSteps, driver);

		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_86_VerifyUserIsAbleAddNamedUsers" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_86_VerifyUserIsAbleAddNamedUsers", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_86_VerifyUserIsAbleAddNamedUsers" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_86_VerifyUserIsAbleAddNamedUsers", testSteps, driver);
			  assertTrue(false);
		  }
	  }

	  @Test
		public void TC_ID_87_VerifyUserIsAbleToSortNamedUserByEmail(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Click on Sort By Button");
			  employerNamedUsersPage.clickOnSortButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Select option Email");
			  employerNamedUsersPage.selectOptionEmail(driver);
			  step++;

			  testSteps.add("Step "+step+" : Get Named User 'Emails'");
			  ArrayList<String> emails= employerNamedUsersPage.getNamedEmails(driver);
			  step++;

			  ArrayList<String> sortedEmails = new ArrayList<>(emails);
			  Collections.sort(sortedEmails);

			  testSteps.add("Step "+step+" : Verify Named User Emails sort alphabetically from by Number of Emails");
			  assertEquals(employerNamedUsersPage.getNamedEmails(driver),sortedEmails);
			  step++;


			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_87_VerifyUserIsAbleToSortNamedUserByEmail", testSteps, driver);



		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_87_VerifyUserIsAbleToSortNamedUserByEmail" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_87_VerifyUserIsAbleToSortNamedUserByEmail", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_87_VerifyUserIsAbleToSortNamedUserByEmail" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_87_VerifyUserIsAbleToSortNamedUserByEmail", testSteps, driver);
			  assertTrue(false);
		  }
	  }

	  @Test
		public void TC_ID_88_VerifyUserIsAbleToSortNamedUsersByAddedDate(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Click on Sort By Button");
			  employerNamedUsersPage.clickOnSortButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Select option Added On");
			  employerNamedUsersPage.selectOptionAddedOn(driver);
			  step++;

			  testSteps.add("Step "+step+" : Get Named User 'Added Dates'");
			  ArrayList<String> addedDates= employerNamedUsersPage.getNamedAddedDates(driver);
			  step++;

			  ArrayList<String> sortedAddedDates = new ArrayList<>(addedDates);
			  Collections.sort(sortedAddedDates);

			  testSteps.add("Step "+step+" : Verify job 'Applications' sort alphabetically from by Number of Applications");
			  assertEquals(employerNamedUsersPage.getNamedAddedDates(driver),sortedAddedDates);
			  step++;


			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_88_VerifyUserIsAbleToSortNamedUsersByAddedDate", testSteps, driver);



		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_88_VerifyUserIsAbleToSortNamedUsersByAddedDate" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_88_VerifyUserIsAbleToSortNamedUsersByAddedDate", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_88_VerifyUserIsAbleToSortNamedUsersByAddedDate" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_88_VerifyUserIsAbleToSortNamedUsersByAddedDate", testSteps, driver);
			  assertTrue(false);
		  }
	  }

	  @Test
		public void TC_ID_89_VerifyUserIsAbleToSortNamedUsersByLastLogin(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Click on Sort By Button");
			  employerNamedUsersPage.clickOnSortButton(driver);
			  step++;

			  testSteps.add("Step "+step+": Select option Last Login");
			  employerNamedUsersPage.selectOptionLastLogin(driver);
			  step++;

			  testSteps.add("Step "+step+" : Get Named User 'Last Login'");
			  ArrayList<String> lastLogins= employerNamedUsersPage.getNamedLastLogin(driver);
			  step++;

			  ArrayList<String> sortedLastLogins = new ArrayList<>(lastLogins);
			  Collections.sort(sortedLastLogins);

			  testSteps.add("Step "+step+" : Verify Last Login' sort alphabetically from by Number of Last Logins");
			  assertEquals(employerNamedUsersPage.getNamedLastLogin(driver),sortedLastLogins);
			  step++;


			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_89_VerifyUserIsAbleToSortNamedUsersByLastLogin", testSteps, driver);



		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_89_VerifyUserIsAbleToSortNamedUsersByLastLogin" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_89_VerifyUserIsAbleToSortNamedUsersByLastLogin", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_89_VerifyUserIsAbleToSortNamedUsersByLastLogin" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_89_VerifyUserIsAbleToSortNamedUsersByLastLogin", testSteps, driver);
			  assertTrue(false);
		  }
	  }

	  @Test
		public void TC_ID_90_VerifyUserIsAbleToRemoveNamedUserFromAnEmployerAccount(){
		  WebDriver driver = null;
		  ArrayList<String> testSteps = new ArrayList<>();
		  EmployerNamedUsersPage employerNamedUsersPage;

		  driver = initConfiguration();
		  employerNamedUsersPage = new EmployerNamedUsersPage(driver);
		  navigateToURL(appurl, driver);

		  Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		  String emailAddress=dataArr[0][0].toString();
		  String password=dataArr[0][1].toString();

		  try {
			  int step = 1;

			  testSteps.add("Step "+step+" : Click on 'Login' button");
			  employerNamedUsersPage.clickOnLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Verify  'Email' field is display");
			  assertTrue(employerNamedUsersPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			  employerNamedUsersPage.enterEmailAddress(emailAddress,driver);
			  step++;

			  testSteps.add("Step "+step+" : Enter 'Password':"+password);
			  employerNamedUsersPage.enterPassword(password,driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			  employerNamedUsersPage.clickOnSubmitLoginButton(driver);
			  step++;

			  testSteps.add("Step "+step+" : Click on 'Name Users' button");
			  employerNamedUsersPage.clickOnNamedUsersButton(driver);
			  step++;

//			  testSteps.add("Step "+step+": Click on Remove User Button");
//			  employerNamedUsersPage.clickOnRemoveUserButton(driver);
//			  step++;
//
//			  testSteps.add("Step "+step+": Verify <b>User Deleted</b> Alert is displayed");
//			  employerNamedUsersPage.verifyUserRemovedSuccessfully(driver);
//			  step++;


			  testSteps.add("Step "+step+": Close the Browser");
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_90_VerifyUserIsAbleToRemoveNamedUserFromAnEmployerAccount", testSteps, driver);



		  }catch (Exception e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_90_VerifyUserIsAbleToRemoveNamedUserFromAnEmployerAccount" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_90_VerifyUserIsAbleToRemoveNamedUserFromAnEmployerAccount", testSteps, driver);
			  assertTrue(false);
		  }catch (Error e){
			  e.printStackTrace();
			  testSteps.add("Failed: TC_ID_90_VerifyUserIsAbleToRemoveNamedUserFromAnEmployerAccount" + "<br><b>Error:</b><br> " + e.toString());
			  tempSrc = getScreenshotPath();
			  testSteps.add(tempSrc);
			  captureCapture(driver, tempSrc);
			  AddTest_IntoReport("TC_ID_90_VerifyUserIsAbleToRemoveNamedUserFromAnEmployerAccount", testSteps, driver);
			  assertTrue(false);
		  }
	  }
}
