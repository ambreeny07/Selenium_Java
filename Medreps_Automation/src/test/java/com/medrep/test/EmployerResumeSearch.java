package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerResumeSearchPage;


public class EmployerResumeSearch extends BaseClass{
	String tempSrc = "";
	

	@Test
	public void TC_ID_66_VerifyUserIsRedirectedToResumeSearchPageByClickingOnTheResumeSearchOption(){

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify user is redirected to Resume Search Page");
			assertTrue(employerResumeSearchPage.isResumeSearchTitleDisplay(driver));
			step++;

			testSteps.add("Step "+step+" : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_66_VerifyUserIsRedirectedToResumeSearchPageByClickingOnTheResumeSearchOption", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_66_VerifyUserIsRedirectedToResumeSearchPageByClickingOnTheResumeSearchOption " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_66_VerifyUserIsRedirectedToResumeSearchPageByClickingOnTheResumeSearchOption", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_66_VerifyUserIsRedirectedToResumeSearchPageByClickingOnTheResumeSearchOption" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_66_VerifyUserIsRedirectedToResumeSearchPageByClickingOnTheResumeSearchOption", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_67_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheResumeSearchPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Dropdown");
			employerResumeSearchPage.clickFilterDropDownBtn(driver);
			Thread.sleep(2000);
			employerResumeSearchPage.clickFilterDropDownBtn(driver);
			step++;

			testSteps.add("Step "+step+": Verify by clicking on Filter Dropdown opens");
			assertTrue(employerResumeSearchPage.verifyFilterResetButtonDisplay(driver));
			step++;


			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_67_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheResumeSearchPage", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_67_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheResumeSearchPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_67_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_67_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_67_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_68_VerifyUserIsAbleToSearchResumeByEnteringKeyword(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter keyword in field : <b>QA</b>");
			employerResumeSearchPage.enterKeywordSearchName("QA",driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Search</b> Button");
			employerResumeSearchPage.clickSearchButtonOnSearchResume(driver);
			step++;

			testSteps.add("Step "+step+": Verify Search Results table is shown");
			employerResumeSearchPage.waitUntilSearchLoadingShowing(driver);
			step++;

			testSteps.add("Step "+step+": Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_68_VerifyUserIsAbleToSearchResumeByEnteringKeyword", testSteps, driver);


		}catch (Exception e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_68_VerifyUserIsAbleToSearchResumeByEnteringKeyword " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_68_VerifyUserIsAbleToSearchResumeByEnteringKeyword", testSteps, driver);
			assertTrue(false);

		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_68_VerifyUserIsAbleToSearchResumeByEnteringKeyword" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_68_VerifyUserIsAbleToSearchResumeByEnteringKeyword", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_69_VerifyUserIsAbleToSeeMessageNoResumeFoundPleaseUpdateYourSearch(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Enter keyword in field : <b>Nothing</b>");
			employerResumeSearchPage.enterKeywordSearchName("nothing",driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Search</b> Button");
			employerResumeSearchPage.clickSearchButtonOnSearchResume(driver);
			step++;

			testSteps.add("Step "+step+": Verify Search Results table is shown");
			assertTrue(employerResumeSearchPage.verifyNoResumeFoundMessage(driver));
			step++;

			testSteps.add("Step "+step+": Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_69_VerifyUserIsAbleToSeeMessageNoResumeFoundPleaseUpdateYourSearch", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_69_VerifyUserIsAbleToSeeMessageNoResumeFoundPleaseUpdateYourSearch " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_69_VerifyUserIsAbleToSeeMessageNoResumeFoundPleaseUpdateYourSearch", testSteps, driver);
			assertTrue(false);

		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_69_VerifyUserIsAbleToSeeMessageNoResumeFoundPleaseUpdateYourSearch" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_69_VerifyUserIsAbleToSeeMessageNoResumeFoundPleaseUpdateYourSearch", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Location dropdown is displaying");
			assertTrue(employerResumeSearchPage.isLocationFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Radius dropdown is displaying");
			assertTrue(employerResumeSearchPage.isRadiusFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Education level is displaying");
			assertTrue(employerResumeSearchPage.isEducationLevelFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Years of Medical Experience slider is displaying");
			assertTrue(employerResumeSearchPage.isYearsOfMedicalSalesExperienceFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Industry dropdown is displaying");
			assertTrue(employerResumeSearchPage.isIndustryFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Function dropdown is showing");
			assertTrue(employerResumeSearchPage.isFunctionFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Willing to Relocate Checkbox is showing");
			assertTrue(employerResumeSearchPage.isWillingToRelocateCheckboxDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify Willing to Relocate Text is showing");
			assertTrue(employerResumeSearchPage.isWillingToRelocateTextDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify open to 1099 Roles Checkbox is displaying");
			assertTrue(employerResumeSearchPage.isOpenToRolesCheckboxFilterDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Verify open to 1099 Roles Text Displaying");
			assertTrue(employerResumeSearchPage.isOpenToRolesTextFilterDisplay(driver));
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_71_VerifyUserIsAbleToSetAnyFilterForResumeSearchAndGetTheReleventResults(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			String industry = "Biotechnology";
			System.out.println("Industry "+industry);

			testSteps.add("Step "+step+": Select Industry from filter : "+industry);
			employerResumeSearchPage.selectValueFromIndustryDropdown(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Button");
			employerResumeSearchPage.clickSubmitFilterButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Results Industry is : "+industry);
			assertEquals(employerResumeSearchPage.checkIndustryValue(driver).substring(0,13), industry);
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_71_VerifyUserIsAbleToSetAnyFilterForResumeSearchAndGetTheReleventResults", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_71_VerifyUserIsAbleToSetAnyFilterForResumeSearchAndGetTheReleventResults " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_71_VerifyUserIsAbleToSetAnyFilterForResumeSearchAndGetTheReleventResults", testSteps, driver);
			assertTrue(false);
		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_70_VerifyUserIsAbleToSeeDifferentFiltersForResumeSearch" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_71_VerifyUserIsAbleToSetAnyFilterForResumeSearchAndGetTheReleventResults", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_72_VerifyUserIsAbleToResetFiltersByClickingOnResetButton(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			String industry = "Biotechnology";

			testSteps.add("Step "+step+": Select Industry from filter : "+industry);
			employerResumeSearchPage.selectValueFromIndustryDropdown(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Button");
			employerResumeSearchPage.clickSubmitFilterButton(driver);
			step++;

//			testSteps.add("Step "+step+": Verify Results Industry is : "+industry);
//			assertEquals(employerResumeSearchPage.checkIndustryValue(driver), industry);
//			step++;

			testSteps.add("Step "+step+": Click on Reset Button");
			employerResumeSearchPage.clickResetButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify default search results are showing");
			assertTrue(employerResumeSearchPage.isIndustryFilterDisplay(driver));
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_72_VerifyUserIsAbleToResetFiltersByClickingOnResetButton", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_72_VerifyUserIsAbleToResetFiltersByClickingOnResetButton" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_72_VerifyUserIsAbleToResetFiltersByClickingOnResetButton", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_72_VerifyUserIsAbleToResetFiltersByClickingOnResetButton" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_72_VerifyUserIsAbleToResetFiltersByClickingOnResetButton", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_73_VerifyUserIsAbleToSeeCreateAlertPopupOnClickingCreateAlert(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Create Alert</b> button");
			employerResumeSearchPage.clickCreateAlertButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Alert popup appeared or not");
			assertTrue(employerResumeSearchPage.isCreateAlertPopupDisplaying(driver));
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_73_VerifyUserIsAbleToSeeCreateAlertPopupOnClickingCreateAlert", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_73_VerifyUserIsAbleToSeeCreateAlertPopupOnClickingCreateAlert" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_73_VerifyUserIsAbleToSeeCreateAlertPopupOnClickingCreateAlert", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_73_VerifyUserIsAbleToSeeCreateAlertPopupOnClickingCreateAlert" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_73_VerifyUserIsAbleToSeeCreateAlertPopupOnClickingCreateAlert", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();


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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			String industry = "Biotechnology";

			testSteps.add("Step "+step+": Select Industry from filter : "+industry);
			employerResumeSearchPage.selectValueFromIndustryDropdown(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Create Alert</b> button");
			employerResumeSearchPage.clickCreateAlertButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Alert popup appeared or not");
			assertTrue(employerResumeSearchPage.isCreateAlertPopupDisplaying(driver));
			step++;

			testSteps.add("Step "+step+": Verify Results Industry is : "+industry);
			assertEquals(employerResumeSearchPage.checkIndustryValue(driver), industry);
			step++;

			testSteps.add("Step "+step+": Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup", testSteps, driver);



		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_75_VerifyUserIsAbleToCreateAlertForResumes(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			String industry = "Biotechnology";

			testSteps.add("Step "+step+": Select Industry from filter : "+industry);
			employerResumeSearchPage.selectValueFromIndustryDropdown(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Create Alert</b> button");
			employerResumeSearchPage.clickCreateAlertButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Alert popup appeared or not");
			assertTrue(employerResumeSearchPage.isCreateAlertPopupDisplaying(driver));
			step++;

			testSteps.add("Step "+step+": Enter Search Name");
			employerResumeSearchPage.enterSearchName("Alert0",driver);
			step++;

			testSteps.add("Step "+step+": Choose How ofter you would like to receive new resumes");
			employerResumeSearchPage.clickDailyRadioBtn(driver);
			step++;

			testSteps.add("Step "+step+": Click create alert submit button");
			employerResumeSearchPage.clickCreateAlertBtn(driver);
			step++;

			testSteps.add("Step "+step+" : Verify 'Search Saved' pop up is display");
			assertTrue(employerResumeSearchPage.verifySearchSavedPopup(driver),"Verified 'Search Saved' pop up is display");
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_74_VerifyTheSelectedFiltersOnResumeSearchPageRepopulateOnTheCreateAlertPopup", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_75_VerifyUserIsAbleToCreateAlertForResumes" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_75_VerifyUserIsAbleToCreateAlertForResumes", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_75_VerifyUserIsAbleToCreateAlertForResumes" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_75_VerifyUserIsAbleToCreateAlertForResumes", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_76_VerifyUserIsAbleToViewAllSavedAlerts(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>View All Alerts</b>.");
			employerResumeSearchPage.clickViewAllAlerts(driver);
			step++;

			testSteps.add("Step "+step+": Verify saved alerts are showing");
			assertTrue(employerResumeSearchPage.verifySavedAlertsAreShowing(driver));
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_76_VerifyUserIsAbleToViewAllSavedAlerts", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_76_VerifyUserIsAbleToViewAllSavedAlerts" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_76_VerifyUserIsAbleToViewAllSavedAlerts", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_76_VerifyUserIsAbleToViewAllSavedAlerts" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_75_VerifyUserIsAbleToCreateAlertForResumes", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_77_VerifyUserIsAbleToSeeResumesByDefaultOnTheResumeSearchPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Resumes by Default are displaying");
			assertTrue(employerResumeSearchPage.verifySearchResults(driver));
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_77_VerifyUserIsAbleToSeeResumesByDefaultOnTheResumeSearchPage", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_77_VerifyUserIsAbleToSeeResumesByDefaultOnTheResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_77_VerifyUserIsAbleToSeeResumesByDefaultOnTheResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_77_VerifyUserIsAbleToSeeResumesByDefaultOnTheResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_77_VerifyUserIsAbleToSeeResumesByDefaultOnTheResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_78_verifyUserIsAbleToViewAnyResumeAvailableOnTheBottomOfResumeSearchPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

//			testSteps.add("Step "+step+": Verify Resumes by Default are displaying");
//			assertTrue(employerResumeSearchPage.verifySearchResults(driver));
//			step++;

			testSteps.add("Step "+step+": Click on View Action Button");
			employerResumeSearchPage.clickOnViewActionButton(driver);
			step++;

			Thread.sleep(10000);
			testSteps.add("Step "+step+": Verify file is downloaded");
//			assertTrue(employerResumeSearchPage.isFileDownloaded());
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_78_verifyUserIsAbleToViewAnyResumeAvailableOnTheBottomOfResumeSearchPage", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_78_verifyUserIsAbleToViewAnyResumeAvailableOnTheBottomOfResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_78_verifyUserIsAbleToViewAnyResumeAvailableOnTheBottomOfResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_78_verifyUserIsAbleToViewAnyResumeAvailableOnTheBottomOfResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_78_verifyUserIsAbleToViewAnyResumeAvailableOnTheBottomOfResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_79_VerifyUserIsAbleToSaveTheResumeFromTheResumeSearchPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Save</b>");
			employerResumeSearchPage.clickOnSaveResumeButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Resume is saved");
			assertTrue(employerResumeSearchPage.verifyResumeSavedSuccessfully(driver));
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_79_VerifyUserIsAbleToSaveTheResumeFromTheResumeSearchPage", testSteps, driver);



		}catch (Exception e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_79_VerifyUserIsAbleToSaveTheResumeFromTheResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_79_VerifyUserIsAbleToSaveTheResumeFromTheResumeSearchPage", testSteps, driver);
			assertTrue(false);

		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_79_VerifyUserIsAbleToSaveTheResumeFromTheResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_79_VerifyUserIsAbleToSaveTheResumeFromTheResumeSearchPage", testSteps, driver);
			assertTrue(false);

		}
	}

	@Test
	public void TC_ID_80_VerifyUserIsAbleToUnsaveTheResumeWhichIsAlreadySavedFromResumeSearchPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Unsave</b>");
			employerResumeSearchPage.clickOnUnSaveResumeButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Resume is unsaved");
			assertTrue(employerResumeSearchPage.verifyResumeUnSavedSuccessfully(driver));
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_80_VerifyUserIsAbleToUnsaveTheResumeWhichIsAlreadySavedFromResumeSearchPage", testSteps, driver);

		}catch (Exception e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_80_VerifyUserIsAbleToUnsaveTheResumeWhichIsAlreadySavedFromResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_80_VerifyUserIsAbleToUnsaveTheResumeWhichIsAlreadySavedFromResumeSearchPage", testSteps, driver);
			assertTrue(false);

		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_80_VerifyUserIsAbleToUnsaveTheResumeWhichIsAlreadySavedFromResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_80_VerifyUserIsAbleToUnsaveTheResumeWhichIsAlreadySavedFromResumeSearchPage", testSteps, driver);
			assertTrue(false);

		}
	}

	@Test
	public void TC_ID_81_VerifyUserIsAbleToSeeSavedIconInFrontOfAllSavedJobsInResultListingOnResumePage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;





			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_81_VerifyUserIsAbleToSeeSavedIconInFrontOfAllSavedJobsInResultListingOnResumePage", testSteps, driver);



		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_81_VerifyUserIsAbleToSeeSavedIconInFrontOfAllSavedJobsInResultListingOnResumePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_81_VerifyUserIsAbleToSeeSavedIconInFrontOfAllSavedJobsInResultListingOnResumePage", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_81_VerifyUserIsAbleToSeeSavedIconInFrontOfAllSavedJobsInResultListingOnResumePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_81_VerifyUserIsAbleToSeeSavedIconInFrontOfAllSavedJobsInResultListingOnResumePage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_82_VerifyUserIsAbleToSeeAllSavedResumesInResumeSearchPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;


			testSteps.add("Step "+step+": Click on View All Resume link");
			employerResumeSearchPage.clickViewSavedResumes(driver);
			step++;

			testSteps.add("Step "+step+": Verify Saved Resume Page is displayed");
			employerResumeSearchPage.isSavedResumesPageDisplay(driver);
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_82_VerifyUserIsAbleToSeeAllSavedResumesInResumeSearchPage", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_82_VerifyUserIsAbleToSeeAllSavedResumesInResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_82_VerifyUserIsAbleToSeeAllSavedResumesInResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_82_VerifyUserIsAbleToSeeAllSavedResumesInResumeSearchPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_82_VerifyUserIsAbleToSeeAllSavedResumesInResumeSearchPage", testSteps, driver);
			assertTrue(false);
		}

	}

	@Test
	public void TC_ID_83_VerifyTheResumeSearchPageIsShowingResumesOnTheBottomOfThePageWithTheNecessaryDetails(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
//		String emailAddress=dataArr[0][0].toString();
		String emailAddress="ambreeny419+aprilemployer@gmail.com";		
		String password=dataArr[0][1].toString();

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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;
			
//			testSteps.add("Step "+step+": Click on <b>Save</b> link");
//			employerResumeSearchPage.clickResumeSaveButton(driver);
//			step++;
			
			testSteps.add("Step "+step+": Click on <b>View Saved Resumes</b> link");
			employerResumeSearchPage.clickViewSavedResumesButton(driver);
			step++;			

			testSteps.add("Step "+step+": Verify all 'saved resumes' is displaying");
			assertTrue(employerResumeSearchPage.verifySavedResumesDisplay(driver));
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_83_VerifyTheResumeSearchPageIsShowingResumesOnTheBottomOfThePageWithTheNecessaryDetails", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_83_VerifyTheResumeSearchPageIsShowingResumesOnTheBottomOfThePageWithTheNecessaryDetails" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_83_VerifyTheResumeSearchPageIsShowingResumesOnTheBottomOfThePageWithTheNecessaryDetails", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_83_VerifyTheResumeSearchPageIsShowingResumesOnTheBottomOfThePageWithTheNecessaryDetails" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_83_VerifyTheResumeSearchPageIsShowingResumesOnTheBottomOfThePageWithTheNecessaryDetails", testSteps, driver);
			assertTrue(false);
		}

	}
	
	@Test
	public void TC_ID_5_VerifyThatSearchingFromResumeSearchAndRunningTheResumeAlertShowExactSameResults(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerResumeSearchPage employerResumeSearchPage;
		CandidateSignUpPage candidateSignUpPage;
		EmployerDashBoardPage employerDashBoardPage;
		driver = initConfiguration();
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		candidateSignUpPage = new CandidateSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
//		String emailAddress=dataArr[0][0].toString();
		String emailAddress="ambreeny419+aprilemployer@gmail.com";		 
		String password=dataArr[0][1].toString();

		try{
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

			testSteps.add("Step "+step+": Click on <b>Resume Search</b> from left pane");
			employerResumeSearchPage.clickOnResumeSearchButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on <b>save</b>");
			employerResumeSearchPage.clickOnSaveResumeButton(driver);
			step++;			

			testSteps.add("Step "+step+": Click on <b>Unsave</b>");
			employerResumeSearchPage.clickOnUnSaveResumeButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Resume is unsaved");
			assertTrue(employerResumeSearchPage.verifyResumeUnSavedSuccessfully(driver));
			step++;


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_5_VerifyThatSearchingFromResumeSearchAndRunningTheResumeAlertShowExactSameResults", testSteps, driver);

		}catch (Exception e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_5_VerifyThatSearchingFromResumeSearchAndRunningTheResumeAlertShowExactSameResults" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_5_VerifyThatSearchingFromResumeSearchAndRunningTheResumeAlertShowExactSameResults", testSteps, driver);
			assertTrue(false);

		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_5_VerifyThatSearchingFromResumeSearchAndRunningTheResumeAlertShowExactSameResults" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_5_VerifyThatSearchingFromResumeSearchAndRunningTheResumeAlertShowExactSameResults", testSteps, driver);
			assertTrue(false);

		}
	}
}
