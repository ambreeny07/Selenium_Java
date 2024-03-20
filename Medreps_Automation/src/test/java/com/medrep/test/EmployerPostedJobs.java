package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerPostedJobsPage;

public class EmployerPostedJobs extends BaseClass{
	String tempSrc = "";

	@Test
	public void TC_ID_28_VerifyThatThePostJobButtonIsClickable(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();


		try{
			int step = 1;
			testSteps.add("Step "+ step + ": Verify that user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step "+ step + ": Click on Login Button");
			employerPostedJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Enter email "+emailAddress);
			employerPostedJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+ step + ": Enter Password "+password);
			employerPostedJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+ step + ": Click on Submit Login Button");
			employerPostedJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Click on <b>Post Job button</b>");
			employerPostedJobsPage.clickOnPostedJobsButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Verify that user is navigated to <b>Post Job</b> Page");
			assertTrue(employerPostedJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified that user is navigated to post a job page");
			step++;

			testSteps.add("Step "+ step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_28_VerifyThatThePostJobButtonIsClickable", testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_28_VerifyThatThePostJobButtonIsClickable"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_28_VerifyThatThePostJobButtonIsClickable",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps
					.add("Failed: TC_ID_28_VerifyThatThePostJobButtonIsClickable"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_28_VerifyThatThePostJobButtonIsClickable",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_29_VerifyThatTheEmployerIsAbleToPostTheJobSuccessfully(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
			int step = 1;

			testSteps.add("Step "+ step + ": Verify that user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step "+ step + ": Click on Login Button");
			employerPostedJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Enter email "+emailAddress);
			employerPostedJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+ step + ": Enter Password "+password);
			employerPostedJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+ step + ": Click on Submit Login Button");
			employerPostedJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Click on <b>Post Job button</b>");
			employerPostedJobsPage.clickOnPostedJobsButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Verify that user is navigated to <b>Post Job</b> Page");
			assertTrue(employerPostedJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified that user is navigated to post a job page");
			step++;

			testSteps.add("Step "+step+": Enter Job Title : Software Engineer");
			employerPostedJobsPage.enterJobTitle("Software Engineer", driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Description");
			employerPostedJobsPage.enterJobDescription("SSE Required with 3 years of experience",driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Code");
			employerPostedJobsPage.enterJobCode("33322",driver);
			step++;

			testSteps.add("Step "+step+": Check the remote job checkbox");
			employerPostedJobsPage.checkRemoteCheckBox(driver);
			step++;

			testSteps.add("Step "+step+": Select Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);
			step++;

			testSteps.add("Step "+step+": Enter location - USA");
			employerPostedJobsPage.enterLocation("USA",driver);
			step++;

			testSteps.add("Step "+step+": Click on Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);

			testSteps.add("Step "+step+": Select Compensation Type : <b>Salary Only</b>");
			employerPostedJobsPage.clickCompensationTypeOption(driver);
			step++;

			testSteps.add("Step "+step+": Select Average Compensation from Slider");
			employerPostedJobsPage.selectAverageTotalCompensation(driver);
			step++;

			testSteps.add("Step "+step+": Select <b>Base Salary</b> from Slider");
			employerPostedJobsPage.selectBaseSalary(driver);
			step++;

			testSteps.add("Step"+step+": Click on Function Dropwdown");
			employerPostedJobsPage.clickOnFunctionDropdownIcon(driver);
			step++;

			testSteps.add("Step"+step+": Verify <b>Functions</b> dropdown list is displyed");
			assertTrue(employerPostedJobsPage.isListOfFunctionDisplay(driver),"Verified that list is displayed");
			step++;

			testSteps.add("Step "+step+": Select Function");
			employerPostedJobsPage.selectFunction(driver);
			step++;

			testSteps.add("Step "+step+": Select Industry");
			employerPostedJobsPage.clickIndustry(driver);
			employerPostedJobsPage.clickIndustryOption(driver);
			step++;


			testSteps.add("Step "+step+": Select Travel Percentage");
			employerPostedJobsPage.selectTravelPercentage(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : Email");
			employerPostedJobsPage.selectApplicationMethodType(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : External URL");
			employerPostedJobsPage.clickExternalJobRadioButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter External URL ");
			employerPostedJobsPage.enterExternalUrl("https://www.google.com",driver);
			step++;

			testSteps.add("Step "+step+": Click on Post Job Button");
			employerPostedJobsPage.clickOnPostJobButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify that job is posted successfully");
			assertTrue(employerPostedJobsPage.isJobCreatedSuccessfullyNotificationMessageDisplay(driver));
			step++;





			testSteps.add("Step "+ step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_29_VerifyThatTheEmployerIsAbleToPostTheJobSuccessfully", testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_29_VerifyThatTheEmployerIsAbleToPostTheJobSuccessfully"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_29_VerifyThatTheEmployerIsAbleToPostTheJobSuccessfully",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps
					.add("Failed: TC_ID_29_VerifyThatTheEmployerIsAbleToPostTheJobSuccessfully"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_29_VerifyThatTheEmployerIsAbleToPostTheJobSuccessfully",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_30_VerifyThatUserIsAbleToSaveJobAsDraftSuccessfullyViaPostANewJobPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
			int step = 1;

			testSteps.add("Step "+ step + ": Verify that user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step "+ step + ": Click on Login Button");
			employerPostedJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Enter email "+emailAddress);
			employerPostedJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+ step + ": Enter Password "+password);
			employerPostedJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+ step + ": Click on Submit Login Button");
			employerPostedJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Click on <b>Post Job button</b>");
			employerPostedJobsPage.clickOnPostedJobsButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Verify that user is navigated to <b>Post Job</b> Page");
			assertTrue(employerPostedJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified that user is navigated to post a job page");
			step++;

			testSteps.add("Step "+step+": Enter Job Title : Software Engineer");
			employerPostedJobsPage.enterJobTitle("Software Engineer", driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Description");
			employerPostedJobsPage.enterJobDescription("SSE Required with 3 years of experience",driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Code");
			employerPostedJobsPage.enterJobCode("33322",driver);
			step++;

			testSteps.add("Step "+step+": Check the remote job checkbox");
			employerPostedJobsPage.checkRemoteCheckBox(driver);
			step++;

			testSteps.add("Step "+step+": Select Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);
			step++;

			testSteps.add("Step "+step+": Enter location - USA");
			employerPostedJobsPage.enterLocation("USA",driver);
			step++;

			testSteps.add("Step "+step+": Click on Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);

			testSteps.add("Step "+step+": Select Compensation Type : <b>Salary Only</b>");
			employerPostedJobsPage.clickCompensationTypeOption(driver);
			step++;

			testSteps.add("Step "+step+": Select Average Compensation from Slider");
			employerPostedJobsPage.selectAverageTotalCompensation(driver);
			step++;

			testSteps.add("Step "+step+": Select <b>Base Salary</b> from Slider");
			employerPostedJobsPage.selectBaseSalary(driver);
			step++;

			testSteps.add("Step"+step+": Click on Function Dropwdown");
			employerPostedJobsPage.clickOnFunctionDropdownIcon(driver);
			step++;

			testSteps.add("Step"+step+": Verify <b>Functions</b> dropdown list is displyed");
			assertTrue(employerPostedJobsPage.isListOfFunctionDisplay(driver),"Verified that list is displayed");
			step++;

			testSteps.add("Step "+step+": Select Function");
			employerPostedJobsPage.selectFunction(driver);
			step++;

			testSteps.add("Step "+step+": Select Industry");
			employerPostedJobsPage.clickIndustry(driver);
			employerPostedJobsPage.clickIndustryOption(driver);
			step++;


			testSteps.add("Step "+step+": Select Travel Percentage");
			employerPostedJobsPage.selectTravelPercentage(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : Email");
			employerPostedJobsPage.selectApplicationMethodType(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : External URL");
			employerPostedJobsPage.clickExternalJobRadioButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter External URL ");
			employerPostedJobsPage.enterExternalUrl("https://www.google.com",driver);
			step++;

			testSteps.add("Step "+step+": Click on Save as Draft Button");
			employerPostedJobsPage.clickOnSaveAsDraftButton(driver);
			step++;
//
			testSteps.add("Step "+step+": Verify that job is posted successfully");
			assertTrue(employerPostedJobsPage.isJobSaveAsDraftSuccessfullyNotificationMessageDisplay(driver));
			step++;





			testSteps.add("Step "+ step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_30_VerifyThatUserIsAbleToSaveJobAsDraftSuccessfullyViaPostANewJobPage", testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_30_VerifyThatUserIsAbleToSaveJobAsDraftSuccessfullyViaPostANewJobPage"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_30_VerifyThatUserIsAbleToSaveJobAsDraftSuccessfullyViaPostANewJobPage",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps
					.add("Failed: TC_ID_30_VerifyThatUserIsAbleToSaveJobAsDraftSuccessfullyViaPostANewJobPage"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_30_VerifyThatUserIsAbleToSaveJobAsDraftSuccessfullyViaPostANewJobPage",
					testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_31_VerifyUserIsAbleToPostExternalJob(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
			int step = 1;

			testSteps.add("Step "+ step + ": Verify that user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step "+ step + ": Click on Login Button");
			employerPostedJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Enter email "+emailAddress);
			employerPostedJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+ step + ": Enter Password "+password);
			employerPostedJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+ step + ": Click on Submit Login Button");
			employerPostedJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Click on <b>Post Job button</b>");
			employerPostedJobsPage.clickOnPostedJobsButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Verify that user is navigated to <b>Post Job</b> Page");
			assertTrue(employerPostedJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified that user is navigated to post a job page");
			step++;

			testSteps.add("Step "+step+": Enter Job Title : Software Engineer");
			employerPostedJobsPage.enterJobTitle("Software Engineer", driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Description");
			employerPostedJobsPage.enterJobDescription("SSE Required with 3 years of experience",driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Code");
			employerPostedJobsPage.enterJobCode("33322",driver);
			step++;

			testSteps.add("Step "+step+": Check the remote job checkbox");
			employerPostedJobsPage.checkRemoteCheckBox(driver);
			step++;

			testSteps.add("Step "+step+": Select Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);
			step++;

			testSteps.add("Step "+step+": Enter location - USA");
			employerPostedJobsPage.enterLocation("USA",driver);
			step++;

			testSteps.add("Step "+step+": Click on Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);

			testSteps.add("Step "+step+": Select Compensation Type : <b>Salary Only</b>");
			employerPostedJobsPage.clickCompensationTypeOption(driver);
			step++;

			testSteps.add("Step "+step+": Select Average Compensation from Slider");
			employerPostedJobsPage.selectAverageTotalCompensation(driver);
			step++;

			testSteps.add("Step "+step+": Select <b>Base Salary</b> from Slider");
			employerPostedJobsPage.selectBaseSalary(driver);
			step++;

			testSteps.add("Step"+step+": Click on Function Dropwdown");
			employerPostedJobsPage.clickOnFunctionDropdownIcon(driver);
			step++;

			testSteps.add("Step"+step+": Verify <b>Functions</b> dropdown list is displyed");
			assertTrue(employerPostedJobsPage.isListOfFunctionDisplay(driver),"Verified that list is displayed");
			step++;

			testSteps.add("Step "+step+": Select Function");
			employerPostedJobsPage.selectFunction(driver);
			step++;

			testSteps.add("Step "+step+": Select Industry");
			employerPostedJobsPage.clickIndustry(driver);
			employerPostedJobsPage.clickIndustryOption(driver);
			step++;


			testSteps.add("Step "+step+": Select Travel Percentage");
			employerPostedJobsPage.selectTravelPercentage(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : Email");
			employerPostedJobsPage.selectApplicationMethodType(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : External URL");
			employerPostedJobsPage.clickExternalJobRadioButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter External URL ");
			employerPostedJobsPage.enterExternalUrl("https://www.google.com",driver);
			step++;

			testSteps.add("Step "+step+": Click on Post Job Button");
			employerPostedJobsPage.clickOnPostJobButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify that job is posted successfully");
			assertTrue(employerPostedJobsPage.isJobCreatedSuccessfullyNotificationMessageDisplay(driver));
			step++;





			testSteps.add("Step "+ step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_31_VerifyUserIsAbleToPostExternalJob", testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_31_VerifyUserIsAbleToPostExternalJob"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_31_VerifyUserIsAbleToPostExternalJob",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps
					.add("Failed: TC_ID_31_VerifyUserIsAbleToPostExternalJob"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_31_VerifyUserIsAbleToPostExternalJob",
					testSteps, driver);
			assertTrue(false);
		}
	}
	@Test
	public void TC_ID_32_VerifyUserIsAbleToPostEmailJob(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
			int step = 1;

			testSteps.add("Step "+ step + ": Verify that user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step "+ step + ": Click on Login Button");
			employerPostedJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Enter email "+emailAddress);
			employerPostedJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+ step + ": Enter Password "+password);
			employerPostedJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+ step + ": Click on Submit Login Button");
			employerPostedJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Click on <b>Post Job button</b>");
			employerPostedJobsPage.clickOnPostedJobsButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Verify that user is navigated to <b>Post Job</b> Page");
			assertTrue(employerPostedJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified that user is navigated to post a job page");
			step++;

			testSteps.add("Step "+step+": Enter Job Title : Software Engineer");
			employerPostedJobsPage.enterJobTitle("Software Engineer", driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Description");
			employerPostedJobsPage.enterJobDescription("SSE Required with 3 years of experience",driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Code");
			employerPostedJobsPage.enterJobCode("33322",driver);
			step++;

			testSteps.add("Step "+step+": Check the remote job checkbox");
			employerPostedJobsPage.checkRemoteCheckBox(driver);
			step++;

			testSteps.add("Step "+step+": Select Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);
			step++;

			testSteps.add("Step "+step+": Enter location - USA");
			employerPostedJobsPage.enterLocation("USA",driver);
			step++;

			testSteps.add("Step "+step+": Click on Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);

			testSteps.add("Step "+step+": Select Compensation Type : <b>Salary Only</b>");
			employerPostedJobsPage.clickCompensationTypeOption(driver);
			step++;

			testSteps.add("Step "+step+": Select Average Compensation from Slider");
			employerPostedJobsPage.selectAverageTotalCompensation(driver);
			step++;

			testSteps.add("Step "+step+": Select <b>Base Salary</b> from Slider");
			employerPostedJobsPage.selectBaseSalary(driver);
			step++;

			testSteps.add("Step"+step+": Click on Function Dropwdown");
			employerPostedJobsPage.clickOnFunctionDropdownIcon(driver);
			step++;

			testSteps.add("Step"+step+": Verify <b>Functions</b> dropdown list is displyed");
			assertTrue(employerPostedJobsPage.isListOfFunctionDisplay(driver),"Verified that list is displayed");
			step++;

			testSteps.add("Step "+step+": Select Function");
			employerPostedJobsPage.selectFunction(driver);
			step++;

			testSteps.add("Step "+step+": Select Industry");
			employerPostedJobsPage.clickIndustry(driver);
			employerPostedJobsPage.clickIndustryOption(driver);
			step++;


			testSteps.add("Step "+step+": Select Travel Percentage");
			employerPostedJobsPage.selectTravelPercentage(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : Email");
			employerPostedJobsPage.selectApplicationMethodType(driver);
			step++;

			testSteps.add("Step "+step+": Select Application Method : Email");
			employerPostedJobsPage.clickEmailRadioButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter Email URL ");
			employerPostedJobsPage.enterApplicationMethodEmail("jam@yopmail.com",driver);
			step++;

			testSteps.add("Step "+step+": Click on Post Job Button");
			employerPostedJobsPage.clickOnPostJobButton(driver);
			step++;
//
			testSteps.add("Step "+step+": Verify that job is posted successfully");
			assertTrue(employerPostedJobsPage.isJobCreatedSuccessfullyNotificationMessageDisplay(driver));
			step++;





			testSteps.add("Step "+ step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_32_VerifyUserIsAbleToPostEmailJob", testSteps, driver);


		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_32_VerifyUserIsAbleToPostEmailJob"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_32_VerifyUserIsAbleToPostEmailJob",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps
					.add("Failed: TC_ID_32_VerifyUserIsAbleToPostEmailJob"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_32_VerifyUserIsAbleToPostEmailJob",
					testSteps, driver);
			assertTrue(false);
		}

	}

	@Test
	public void TC_ID_33_VerifyThatEmployerIsAbleToPostPostJobByGivingDataToTheMandatoryFieldsOnly(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerPostedJobsPage employerPostedJobsPage;
		CandidateSignUpPage candidateSignUpPage;
		driver = initConfiguration();
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
		navigateToURL(memberurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();


		try{

			int step = 1;
			testSteps.add("Step "+ step + ": Verify that user is redirected to 'Homepage'");
			assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver), "Verified that user is redirected to Homepage");
			step++;

			testSteps.add("Step "+ step + ": Click on Login Button");
			employerPostedJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Enter email "+emailAddress);
			employerPostedJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+ step + ": Enter Password "+password);
			employerPostedJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+ step + ": Click on Submit Login Button");
			employerPostedJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Click on <b>Post Job button</b>");
			employerPostedJobsPage.clickOnPostedJobsButton(driver);
			step++;

			testSteps.add("Step "+ step + ": Verify that user is navigated to <b>Post Job</b> Page");
			assertTrue(employerPostedJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified that user is navigated to post a job page");
			step++;

			testSteps.add("Step "+step+": Enter Job Title : Software Engineer");
			employerPostedJobsPage.enterJobTitle("Software Engineer", driver);
			step++;

			testSteps.add("Step "+step+": Enter Job Description");
			employerPostedJobsPage.enterJobDescription("SSE Required with 3 years of experience",driver);
			step++;


			testSteps.add("Step "+step+": Enter location - USA");
			employerPostedJobsPage.enterLocation("USA",driver);
			step++;

			testSteps.add("Step "+step+": Click on Compensation Type");
			employerPostedJobsPage.clickCompensationType(driver);

			testSteps.add("Step "+step+": Select Compensation Type : <b>Salary Only</b>");
			employerPostedJobsPage.clickCompensationTypeOption(driver);
			step++;


			testSteps.add("Step "+step+": Select Average Compensation from Slider");
			employerPostedJobsPage.selectAverageTotalCompensation(driver);
			step++;


			testSteps.add("Step"+step+": Click on Function Dropwdown");
			employerPostedJobsPage.clickOnFunctionDropdownIcon(driver);
			step++;

			testSteps.add("Step"+step+": Verify <b>Functions</b> dropdown list is displyed");
			assertTrue(employerPostedJobsPage.isListOfFunctionDisplay(driver),"Verified that list is displayed");
			step++;

			testSteps.add("Step "+step+": Select Function");
			employerPostedJobsPage.selectFunction(driver);
			step++;

			testSteps.add("Step "+step+": Select Industry");
			employerPostedJobsPage.clickIndustry(driver);
			employerPostedJobsPage.clickIndustryOption(driver);
			step++;


			testSteps.add("Step "+step+": Select Travel Percentage");
			employerPostedJobsPage.selectTravelPercentage(driver);
			step++;

			testSteps.add("Step "+step+": Click on Post Job Button");
			employerPostedJobsPage.clickOnPostJobButton(driver);
			step++;
//
			testSteps.add("Step "+step+": Verify that job is posted successfully");
			assertTrue(employerPostedJobsPage.isJobCreatedSuccessfullyNotificationMessageDisplay(driver));
			step++;



			testSteps.add("Step "+ step + ": Close the browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_33_VerifyThatEmployerIsAbleToPostPostJobByGivingDataToTheMandatoryFieldsOnly", testSteps, driver);

		}catch (Exception e){
			testSteps.add(
					"Failed: TC_ID_33_VerifyThatEmployerIsAbleToPostPostJobByGivingDataToTheMandatoryFieldsOnly"
							+ "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_33_VerifyThatEmployerIsAbleToPostPostJobByGivingDataToTheMandatoryFieldsOnly",
					testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps
					.add("Failed: TC_ID_33_VerifyThatEmployerIsAbleToPostPostJobByGivingDataToTheMandatoryFieldsOnly"
							+ "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_33_VerifyThatEmployerIsAbleToPostPostJobByGivingDataToTheMandatoryFieldsOnly",
					testSteps, driver);
			assertTrue(false);
		}
	}
}
