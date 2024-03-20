package com.medrep.test;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.EmployerAccountPage;
import com.medrep.pages.EmployerManageJobsPage;
import com.medrep.pages.EmployerPostedJobsPage;
import com.medrep.pages.EmployerResumeSearchPage;
import com.medrep.pages.EmployerSignUpPage;

public class EmployerManageJobs extends BaseClass{
	String tempSrc = "";
	
	@Test()
	public void TC_ID_126_VerifyThatUserIsAbleToSuccessfullyLandOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+(step++)+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
		testSteps.add("Step "+step+" : Verify Job Credits Remaining displaying");
		employerManageJobsPage.isJobCreditsRemainingTileDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Featured Job Credits Remaining displaying");
		employerManageJobsPage.isFeaturedJobCreditsRemainingTileDisplay(driver);
		step++;
				
		testSteps.add("Step "+step+" : Verify Featured Job Credits Remaining displaying");
		employerManageJobsPage.isFeaturedJobCreditsRemainingTileDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Title displaying");
		employerManageJobsPage.isYourJobsTableTitleColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Featured displaying");
		employerManageJobsPage.isYourJobsTableFeaturedColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Views displaying");
		employerManageJobsPage.isYourJobsTableViewsColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Application displaying");
		employerManageJobsPage.isYourJobsTableApplicationsColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Posted Date displaying");
		employerManageJobsPage.isYourJobsTablePostedColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Expires displaying");
		employerManageJobsPage.isYourJobsTableExpiresColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Posted By displaying");
		employerManageJobsPage.isYourJobsTablePostedByColumnDisplay(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Sort By displaying");
		employerManageJobsPage.isSortedByDropDownDisplaying(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Pagination displaying");
		employerManageJobsPage.isPaginationDisplaying(driver);
		step++;
		
			
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_126_VerifyThatUserIsAbleToSuccessfullyLandOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed:" + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_126_VerifyThatUserIsAbleToSuccessfullyLandOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed:" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_126_VerifyThatUserIsAbleToSuccessfullyLandOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_127_VerifyThatFilterButtonIsClickableOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Job Title' input field is display");
		assertTrue(employerManageJobsPage.isJobTitleInputFieldDisplay(driver),"Verified 'Job Title' input field is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Feature' dropdown field is display");
		assertTrue(employerManageJobsPage.isFeatureDropdownFieldDisplay(driver),"Verified 'Feature' dropdown field is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Posted Date' field is display");
		assertTrue(employerManageJobsPage.isPostedDateFieldDisplay(driver),"Verified 'Posted Date' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Expired Date' field is display");
		assertTrue(employerManageJobsPage.isExpiredDateFieldDisplay(driver),"Verified 'Expired Date' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Posted By' field is display");
		assertTrue(employerManageJobsPage.isPostedByInputFieldDisplay(driver),"Verified 'Posted By' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Filter' button is display");
		assertTrue(employerManageJobsPage.isFilterButtonDisplay(driver),"Verified 'Filter' button is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Reset' button is display");
		assertTrue(employerManageJobsPage.isResetButtonDisplay(driver),"Verified 'Reset' button is display");
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_127_VerifyThatFilterButtonIsClickableOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_127_VerifyThatFilterButtonIsClickableOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_127_VerifyThatFilterButtonIsClickableOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_127_VerifyThatFilterButtonIsClickableOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_127_VerifyThatFilterButtonIsClickableOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_122_VerifyThatUserIsAbleToSeeFeaturedListOnClickingDropdownIconAgainstFeaturedFieldOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Feature' dropdown icon");
	    employerManageJobsPage.clickOnFeatureDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Featured' option is display");
		assertTrue(employerManageJobsPage.isFeaturedOptionDisplaying(driver),"Verified 'Featured' option  is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Non Featured' option is display");
		assertTrue(employerManageJobsPage.isFeaturedOptionDisplaying(driver),"Verified 'Non Featured' option  is display");
		step++;

		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_122_VerifyThatUserIsAbleToSeeFeaturedListOnClickingDropdownIconAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_122_VerifyThatUserIsAbleToSeeFeaturedListOnClickingDropdownIconAgainstFeaturedFieldOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_122_VerifyThatUserIsAbleToSeeFeaturedListOnClickingDropdownIconAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_122_VerifyThatUserIsAbleToSeeFeaturedListOnClickingDropdownIconAgainstFeaturedFieldOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_122_VerifyThatUserIsAbleToSeeFeaturedListOnClickingDropdownIconAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_106_VerifyThatUserIsAbleToSelectFeatureAgainstFeaturedFieldOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
        String optionSearchResults="Search results";
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Feature' dropdown icon");
	    employerManageJobsPage.clickOnFeatureDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Feature Option is Displaying on 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isFeaturedOptionDisplaying(driver),"Verified Feature Option is Displaying on 'Manage Jobs' page");
		step++;

		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_106_VerifyThatUserIsAbleToSelectFeatureAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_106_VerifyThatUserIsAbleToSelectFeatureAgainstFeaturedFieldOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_106_VerifyThatUserIsAbleToSelectFeatureAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_106_VerifyThatUserIsAbleToSelectFeatureAgainstFeaturedFieldOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_106_VerifyThatUserIsAbleToSelectFeatureAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_107_VerifyThatUserIsAbleToSelectNotFeaturedAgainstFeaturedFieldOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
        String optionEmailAlerts="Email alerts";
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Feature' dropdown icon");
	    employerManageJobsPage.clickOnFeatureDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify Not Featured Option is Displaying on 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isNonFeaturedOptionDisplaying(driver),"Verified Not Featured Option is Displaying on 'Manage Jobs' page");
		step++;

		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_107_VerifyThatUserIsAbleToSelectNotFeaturedAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_107_VerifyThatUserIsAbleToSelectNotFeaturedAgainstFeaturedFieldOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_107_VerifyThatUserIsAbleToSelectNotFeaturedAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_107_VerifyThatUserIsAbleToSelectNotFeaturedAgainstFeaturedFieldOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_107_VerifyThatUserIsAbleToSelectNotFeaturedAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_123_VerifyThatUserIsAbleToSelectFeaturedNotFeaturedAgainstFeaturedFieldOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
        String optionCombo="Combo";
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Feature' dropdown icon");
	    employerManageJobsPage.clickOnFeatureDropdownIcon(driver);
		step++;
		
		
		testSteps.add("Step "+step+" : Verify 'Featured' option is clickable");
		assertTrue(employerManageJobsPage.isFeaturedOptionDisplaying(driver),"Verified 'Featured' option  is clickable");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Non Featured' option is clickable");
		assertTrue(employerManageJobsPage.isFeaturedOptionDisplaying(driver),"Verified 'Non Featured' option  is clickable");
		step++;

		
		
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_123_VerifyThatUserIsAbleToSelectFeaturedNotFeaturedAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_123_VerifyThatUserIsAbleToSelectFeaturedNotFeaturedAgainstFeaturedFieldOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_123_VerifyThatUserIsAbleToSelectFeaturedNotFeaturedAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_123_VerifyThatUserIsAbleToSelectFeaturedNotFeaturedAgainstFeaturedFieldOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_123_VerifyThatUserIsAbleToSelectFeaturedNotFeaturedAgainstFeaturedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_109_VerifyThatCalendarWindowGetsOpenAgainstPostedFieldOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Posted' date calendar icon");
	    employerManageJobsPage.clickOnPostedDateCalendarIcon(driver);
		step++;
				
		testSteps.add("Step "+step+" : Verify 'Calendar' is display");
		assertTrue(employerManageJobsPage.isCalendarDisplay(driver),"Verified 'Calendar' is display");
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_109_VerifyThatCalendarWindowGetsOpenAgainstPostedFieldOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_109_VerifyThatCalendarWindowGetsOpenAgainstPostedFieldOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_109_VerifyThatCalendarWindowGetsOpenAgainstPostedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_109_VerifyThatCalendarWindowGetsOpenAgainstPostedFieldOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_109_VerifyThatCalendarWindowGetsOpenAgainstPostedFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_128_VerifyThatCalendarWindowGetsOpenAgainstDateExpiresFieldOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Date Expires' calendar icon");
	    employerManageJobsPage.clickOnDateExpiresCalendarIcon(driver);
		step++;
				
		testSteps.add("Step "+step+" : Verify 'Calendar' is display");
		assertTrue(employerManageJobsPage.isCalendarDisplay(driver),"Verified 'Calendar' is display");
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_128_VerifyThatCalendarWindowGetsOpenAgainstDateExpiresFieldOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_128_VerifyThatCalendarWindowGetsOpenAgainstDateExpiresFieldOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_128_VerifyThatCalendarWindowGetsOpenAgainstDateExpiresFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_128_VerifyThatCalendarWindowGetsOpenAgainstDateExpiresFieldOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_128_VerifyThatCalendarWindowGetsOpenAgainstDateExpiresFieldOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_124_VerifyThatUserIsAbleToSeeJobDetailOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
				
		testSteps.add("Step "+step+" : Verify your jobs table 'Title' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTableTitleColumnDisplay(driver),"Verified your jobs table 'Title' column is display");
		step++;		
		
		testSteps.add("Step "+step+" : Verify your jobs table 'Views' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTableViewsColumnDisplay(driver),"Verified your jobs table 'Views' column is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify your jobs table 'Applications' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTableApplicationsColumnDisplay(driver),"Verified your jobs table 'Applications' column is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify your jobs table 'Posted' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTablePostedColumnDisplay(driver),"Verified your jobs table 'Posted' column is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify your jobs table 'Expiry date' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTableExpiresColumnDisplay(driver),"Verified your jobs table 'Expires' column is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify your jobs table 'Posted By' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTablePostedByColumnDisplay(driver),"Verified your jobs table 'Posted By' column is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify your jobs table 'Actions' column is display");
		assertTrue(employerManageJobsPage.isYourJobsTableActionsColumnDisplay(driver),"Verified your jobs table 'Actions' column is display");
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_124_VerifyThatUserIsAbleToSeeJobDetailOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_124_VerifyThatUserIsAbleToSeeJobDetailOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_124_VerifyThatUserIsAbleToSeeJobDetailOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_124_VerifyThatUserIsAbleToSeeJobDetailOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_124_VerifyThatUserIsAbleToSeeJobDetailOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_112_VerifyThatUserIsAbleToCloseFilterOptionsOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Job Title' input field is display");
		assertTrue(employerManageJobsPage.isJobTitleInputFieldDisplay(driver),"Verified 'Job Title' input field is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Feature' dropdown field is display");
		assertTrue(employerManageJobsPage.isFeatureDropdownFieldDisplay(driver),"Verified 'Feature' dropdown field is display");
		step++;
		
//		testSteps.add("Step "+step+" : Verify 'Posted Date' field is display");
//		assertTrue(employerManageJobsPage.isPostedDateFieldDisplay(driver),"Verified 'Posted Date' field is display");
//		step++;
//		
//		testSteps.add("Step "+step+" : Verify 'Expired Date' field is display");
//		assertTrue(employerManageJobsPage.isExpiredDateFieldDisplay(driver),"Verified 'Expired Date' field is display");
//		step++;
//		
//		testSteps.add("Step "+step+" : Verify 'Posted By' field is display");
//		assertTrue(employerManageJobsPage.isPostedByInputFieldDisplay(driver),"Verified 'Posted By' field is display");
//		step++;
//		
//		testSteps.add("Step "+step+" : Verify 'Filter' button is display");
//		assertTrue(employerManageJobsPage.isFilterButtonDisplay(driver),"Verified 'Filter' button is display");
//		step++;
//		
//		testSteps.add("Step "+step+" : Verify 'Reset' button is display");
//		assertTrue(employerManageJobsPage.isResetButtonDisplay(driver),"Verified 'Reset' button is display");
//		step++;
		
		testSteps.add("Step "+step+" : Click on 'Filter' dropdown icon");
	    employerManageJobsPage.clickOnFilterDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify 'All opened filter options' is get close");
		assertFalse(employerManageJobsPage.isResetButtonDisplay(driver),"Verified 'All opened filter options' is get close");
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_112_VerifyThatUserIsAbleToCloseFilterOptionsOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_112_VerifyThatUserIsAbleToCloseFilterOptionsOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_112_VerifyThatUserIsAbleToCloseFilterOptionsOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_112_VerifyThatUserIsAbleToCloseFilterOptionsOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_112_VerifyThatUserIsAbleToCloseFilterOptionsOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_116_VerifyThatTheEmployerIsAbleToSortTheJobByPostedDate() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
//	    navigateToURL(appurl, driver);
//		navigateToURL(memberurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
//        String emailAddress=dataArr[0][0].toString();
        String emailAddress="testuser@yopmail.com";
        
//        String password=dataArr[0][1].toString();
        String password="Jakes12345j";
    try {
    	 int step=1;
    	 navigateToURL(memberurl, driver);
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Sort By:' dropdown icon");
	    employerManageJobsPage.clickOnSortByDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Title' option is display");
		assertTrue(employerManageJobsPage.isTitleOptionDisplay(driver),"Verified 'Title' option is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Views' option is display");
		assertTrue(employerManageJobsPage.isViewsOptionDisplay(driver),"Verified 'Views' option is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Applications' option is display");
		assertTrue(employerManageJobsPage.isApplicationsOptionDisplay(driver),"Verified 'Applications' option is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Posted' option is display");
		assertTrue(employerManageJobsPage.isPostedOptionDisplay(driver),"Verified 'Posted' option is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Expires' option is display");
		assertTrue(employerManageJobsPage.isExpiresOptionDisplay(driver),"Verified 'Expires' option is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Posted By' option is display");
		assertTrue(employerManageJobsPage.isPostedByOptionDisplay(driver),"Verified 'Posted By' option is display");
		step++;
				
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_116_VerifyThatTheEmployerIsAbleToSortTheJobByPostedDate", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_116_VerifyThatTheEmployerIsAbleToSortTheJobByPostedDate " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_116_VerifyThatTheEmployerIsAbleToSortTheJobByPostedDate", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_116_VerifyThatTheEmployerIsAbleToSortTheJobByPostedDate" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_116_VerifyThatTheEmployerIsAbleToSortTheJobByPostedDate", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_117_VerifyThatUserIsSuccessfullyAbleToLandOnPostANewJobPageByClickingOnPostJobButton() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Post Job' button");
	    employerManageJobsPage.clickOnPostJobButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Post a new job' page");
		assertTrue(employerManageJobsPage.isPageHeadingPostANewJobDisplay(driver),"Verified user is redirected to the 'Post a new job' page");
		step++;
						
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_117_VerifyThatUserIsSuccessfullyAbleToLandOnPostANewJobPageByClickingOnPostJobButton", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_117_VerifyThatUserIsSuccessfullyAbleToLandOnPostANewJobPageByClickingOnPostJobButton " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_117_VerifyThatUserIsSuccessfullyAbleToLandOnPostANewJobPageByClickingOnPostJobButton", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_117_VerifyThatUserIsSuccessfullyAbleToLandOnPostANewJobPageByClickingOnPostJobButton" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_117_VerifyThatUserIsSuccessfullyAbleToLandOnPostANewJobPageByClickingOnPostJobButton", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_115_VerifyThatExportButtonIsClickableOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'Export' button");
	    employerManageJobsPage.clickOnExportButton(driver);
		step++;
		
		waitTime(6000);
		String fileName = getDownloadFileName(driver);
		testSteps.add("Step "+step+" : Download file name :"+fileName);
		step++;
		
		testSteps.add("Step "+step+" : Verify job.csv file download");
		assertTrue((fileName.contains(".csv") | fileName.contains(".pdf")),"Verified job.csv file download");
		step++;		
		
		testSteps.add("Step "+step+" : Delete download file");
		deleteDownloadFile();
		step++;	
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_115_VerifyThatExportButtonIsClickableOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_115_VerifyThatExportButtonIsClickableOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_115_VerifyThatExportButtonIsClickableOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_115_VerifyThatExportButtonIsClickableOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_115_VerifyThatExportButtonIsClickableOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_113_VerifyThatTheEmployerIsAbleToSortThJobByTitle() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'SortBy' dropdown icon");
	    employerManageJobsPage.clickOnSortByDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Select 'Title' option");
	    employerManageJobsPage.selectTitleOption(driver);
		step++;
		
		testSteps.add("Step "+step+" : Get job 'Titles'");
		ArrayList<String> titles= employerManageJobsPage.getJobTitle(driver);
		step++;
		
		ArrayList<String> sortedTitles = new ArrayList<>(titles);
		Collections.sort(sortedTitles);
		
		testSteps.add("Step "+step+" : Verify job 'Titles' sort alphabetically from A to Z ");
		assertEquals(employerManageJobsPage.getJobTitle(driver),sortedTitles);
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_113_VerifyThatTheEmployerIsAbleToSortThJobByTitle", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_113_VerifyThatTheEmployerIsAbleToSortThJobByTitle " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_113_VerifyThatTheEmployerIsAbleToSortThJobByTitle", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_113_VerifyThatTheEmployerIsAbleToSortThJobByTitle" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_113_VerifyThatTheEmployerIsAbleToSortThJobByTitle", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_118_VerifyThatUserIsAbleToSeeInforomationForJobCreditsRemainingOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Verify 'Job Credits Remaining' tile is display");
	    assertTrue(employerManageJobsPage.isJobCreditsRemainingTileDisplay(driver),"Verified 'Job Credits Remaining' tile is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Unlimited' button is display");
		assertTrue(employerManageJobsPage.isUnlimitedButtonDisplay(driver),"Verified 'Unlimited' button is display");
		step++;
			
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_118_VerifyThatUserIsAbleToSeeInforomationForJobCreditsRemainingOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_118_VerifyThatUserIsAbleToSeeInforomationForJobCreditsRemainingOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_118_VerifyThatUserIsAbleToSeeInforomationForJobCreditsRemainingOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_118_VerifyThatUserIsAbleToSeeInforomationForJobCreditsRemainingOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_118_VerifyThatUserIsAbleToSeeInforomationForJobCreditsRemainingOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_119_VerifyThatPurchaseButtonIsDisplayedAgainstFeaturedJobCreditsRemainingOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerIDWithOutSubscription",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Verify 'Featured Job Credits Remaining' tile is display");
	    assertTrue(employerManageJobsPage.isFeaturedJobCreditsRemainingTileDisplay(driver),"Verified 'Featured Job Credits Remaining' tile is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify 'Purchase' button is display");
		assertTrue(employerManageJobsPage.isPurchaseButtonDisplay(driver),"Verified 'Purchase' button is display");
		step++;
			
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_119_VerifyThatPurchaseButtonIsDisplayedAgainstFeaturedJobCreditsRemainingOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_119_VerifyThatPurchaseButtonIsDisplayedAgainstFeaturedJobCreditsRemainingOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_119_VerifyThatPurchaseButtonIsDisplayedAgainstFeaturedJobCreditsRemainingOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_119_VerifyThatPurchaseButtonIsDisplayedAgainstFeaturedJobCreditsRemainingOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_119_VerifyThatPurchaseButtonIsDisplayedAgainstFeaturedJobCreditsRemainingOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_120_VerifyThatPurchaseButtonIsClickableAgainstFeaturedJobCreditsRemainingOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerIDWithOutSubscription",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Verify 'Featured Job Credits Remaining' tile is display");
	    assertTrue(employerManageJobsPage.isFeaturedJobCreditsRemainingTileDisplay(driver),"Verified 'Featured Job Credits Remaining' tile is display");
		step++;
		
		testSteps.add("Step "+step+" : Verify featured job credits remaining 'Purchase' button is display");
		assertTrue(employerManageJobsPage.isPurchaseButtonDisplay(driver),"Verified featured job credits remaining 'Purchase' button is display");
		step++;
		
		testSteps.add("Step "+step+" : Click on featured job credits remaining 'Purchase' button");
		employerManageJobsPage.clickOnPurchaseButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Employer Membership' page");
		assertTrue(employerManageJobsPage.isChooseYourJobPostingPlanHeadingDisplay(driver),"Verified user is redirected to the 'Employer Membership' page");
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_120_VerifyThatPurchaseButtonIsClickableAgainstFeaturedJobCreditsRemainingOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_120_VerifyThatPurchaseButtonIsClickableAgainstFeaturedJobCreditsRemainingOnManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_120_VerifyThatPurchaseButtonIsClickableAgainstFeaturedJobCreditsRemainingOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_120_VerifyThatPurchaseButtonIsClickableAgainstFeaturedJobCreditsRemainingOnManageJobsPage" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_120_VerifyThatPurchaseButtonIsClickableAgainstFeaturedJobCreditsRemainingOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test()
	public void TC_ID_114_VerifyThatTheEmployerIsAbleToSortTheJobByViews() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        step++;
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
	    testSteps.add("Step "+step+" : Click on 'SortBy' dropdown icon");
	    employerManageJobsPage.clickOnSortByDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Select 'Views' option");
	    employerManageJobsPage.selectViewsOption(driver);
		step++;
		
		testSteps.add("Step "+step+" : Get job 'Views'");
		ArrayList<Integer> views= employerManageJobsPage.getJobViews(driver);
		step++;
		
		ArrayList<Integer> sortedViews = new ArrayList<>(views);
		Collections.sort(sortedViews,Collections.reverseOrder());
		
		testSteps.add("Step "+step+" : Verify 'Jobs' sort descending order");
		assertEquals(views,sortedViews);
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_114_VerifyThatTheEmployerIsAbleToSortTheJobByViews", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_114_VerifyThatTheEmployerIsAbleToSortTheJobByViews " + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_114_VerifyThatTheEmployerIsAbleToSortTheJobByViews", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_114_VerifyThatTheEmployerIsAbleToSortTheJobByViews" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_114_VerifyThatTheEmployerIsAbleToSortTheJobByViews", testSteps, driver);
		e.printStackTrace();
		assertTrue(false);
	  }
    }
	
	@Test()
	public void TC_ID_121_VerifyThatUserIsAbleToSeeMultipleActionsAgainstActionsColumnOnManageJobsPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		 
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);
		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
        String emailAddress=dataArr[0][0].toString();
        String password=dataArr[0][1].toString();
    try {
    	 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+(step++)+" : Enter 'Email Address':"+emailAddress);
        employerManageJobsPage.enterEmailAddress(emailAddress,driver);
        
        testSteps.add("Step "+step+" : Enter 'Password':"+password);
        employerManageJobsPage.enterPassword(password,driver);
        step++;
         
        testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
		step++;
		
//		
//		testSteps.add("Step "+step+" : Verify 'Edit' button display");
//		assertTrue(employerManageJobsPage.verifyEditActionBtn(driver),"Verified 'Edit' button display");
//		step++;
//		
//		testSteps.add("Step "+step+" : Verify 'Expire' button display");
//		assertTrue(employerManageJobsPage.verifyDeleteActionBtn(driver),"Verified 'Expire' button display");
//		step++;
//			
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_121_VerifyThatUserIsAbleToSeeMultipleActionsAgainstActionsColumnOnManageJobsPage", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed:" + "<br><b>Exception:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_121_VerifyThatUserIsAbleToSeeMultipleActionsAgainstActionsColumnOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed:" + "<br><b>Error:</b><br> " + e.toString());
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_121_VerifyThatUserIsAbleToSeeMultipleActionsAgainstActionsColumnOnManageJobsPage", testSteps, driver);
		assertTrue(false);
	  }
    }

	@Test
	public void TC_ID_102_VerifyUserIsAbleToPurchaseFeatureCreditFromAccount(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;

		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress="testing321@gmail.com";
		String password="Jamal1234j";

		try {

			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerAccountPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Account' button from left panel");
			employerAccountPage.clickOnAccountButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on <b>Buy Credit</b> Button");
			employerAccountPage.clickOnBuyCreditsButton(driver);
			step++;

			testSteps.add("Click on Pay Button");
			employerAccountPage.clickOnPayButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify user is redirected to Accounts page");
			employerAccountPage.verifyPlanNamesDisplayed(driver);
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_102_VerifyUserIsAbleToPurchaseFeatureCreditFromAccount", testSteps, driver);



		}catch (Exception e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_102_VerifyUserIsAbleToPurchaseFeatureCreditFromAccount" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_102_VerifyUserIsAbleToPurchaseFeatureCreditFromAccount", testSteps, driver);
			assertTrue(false);

		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_102_VerifyUserIsAbleToPurchaseFeatureCreditFromAccount" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_102_VerifyUserIsAbleToPurchaseFeatureCreditFromAccount", testSteps, driver);
			assertTrue(false);

		}
	}

	@Test
	public void TC_ID_103_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		EmployerManageJobsPage employerManageJobsPage;
		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress="Yaml@gmail.com";
		String password="Jamal1234j";


		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerAccountPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on 'Manage Jobs' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			try {
				testSteps.add("Step "+step+": Verify <b>Purchase</b> button is displayed infront of Job Credit Remaining");
				assertTrue(employerManageJobsPage.isPurchaseButtonDisplay(driver), "Verified that Purchase Button is Displayed");
				step++;
			} catch (Exception e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			} catch (Error e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			}	
			
			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_103_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled", testSteps, driver);




		}catch (Exception e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_103_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_103_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled", testSteps, driver);
			assertTrue(false);

		}catch (Error e){

			e.printStackTrace();
			testSteps.add("Failed: TC_ID_103_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_103_VerifyThatWhenJobCreditExpiredThenThePurchaseButtonShouldBeEnabled", testSteps, driver);
			assertTrue(false);

		}
	}

	@Test
	public void TC_ID_104_VerifyThatTheEmployerNavigatesToTheMembershipPageToBuyOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		EmployerManageJobsPage employerManageJobsPage;
		EmployerSignUpPage employerSignUpPage;
		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress="Yaml@gmail.com";
		String password="Jamal1234j";

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerAccountPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on 'Manage Jobs' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			try {
				testSteps.add("Step "+step+": Verify <b>Purchase</b> button is displayed infront of Job Credit Remaining");
				assertTrue(employerManageJobsPage.isPurchaseButtonDisplay(driver), "Verified that Purchase Button is Displayed");
				step++;

				testSteps.add("Step "+step+": Click on Purchase Button");
				employerManageJobsPage.clickOnPurchaseButton(driver);
				step++;

				testSteps.add("Step "+step+": Verify user is navigated to Membership Page");
				assertTrue(employerSignUpPage.isPostJobsWithMedrepsHeadingDisplay(driver),"Verified that User is Navigated to Membership Page");
				step++;

			} catch (Exception e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			} catch (Error e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			}

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_104_VerifyThatTheEmployerNavigatesToTheMembershipPageToBuyOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);


		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_104_VerifyThatTheEmployerNavigatesToTheMembershipPageToBuyOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_104_VerifyThatTheEmployerNavigatesToTheMembershipPageToBuyOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);
			assertTrue(false);

		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_104_VerifyThatTheEmployerNavigatesToTheMembershipPageToBuyOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_104_VerifyThatTheEmployerNavigatesToTheMembershipPageToBuyOnClickingPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);
			assertTrue(false);

		}
	}

	@Test()
	public void TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		EmployerManageJobsPage employerManageJobsPage;
		EmployerSignUpPage employerSignUpPage;
		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress="Yaml@gmail.com";
		String password="Jamal1234j";

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerAccountPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on 'Manage Jobs' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			try {
				testSteps.add("Step "+step+": Verify <b>Purchase</b> button is displayed infront of Job Credit Remaining");
				assertTrue(employerManageJobsPage.isPurchaseButtonDisplay(driver), "Verified that Purchase Button is Displayed");
				step++;

				testSteps.add("Step "+step+": Click on Purchase Button");
				employerManageJobsPage.clickOnPurchaseButton(driver);
				step++;

				testSteps.add("Step "+step+": Verify user is navigated to Membership Page");
//				assertTrue(employerSignUpPage.isPostJobsWithMedrepsHeadingDisplay(driver),"Verified that User is Navigated to Membership Page");
				step++;


				testSteps.add("Step "+step+": Choose Plan");
				employerSignUpPage.chooseRenewMonthly$525JobPostingPlan(driver);
				step++;

				testSteps.add("Step "+step+": Click on Next Button");
				employerSignUpPage.clickOnNextButton(driver);
				step++;

				testSteps.add("Step "+step+": Choose Add-On");
				employerSignUpPage.selectFeaturedJobAddOn(driver);
				step++;

				testSteps.add("Step "+step+": Click on Make Payment Button");
				employerSignUpPage.clickOnMakePayment(driver);
				step++;

				testSteps.add("Step "+step+": Click on Subscribe Button");
				employerAccountPage.clickOnStripeSubscribeButton(driver);
				step++;

				testSteps.add("Step "+step+": Verify Payment is successful");
				employerAccountPage.isUnlimitedJobsLabelDisplay(driver);
				step++;

			} catch (Exception e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			} catch (Error e) {
				testSteps.add("Step " + step + ": Verify that <b>Purchase</b> button is not showing and job is not expired till now");
			}


			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);



		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_107_VerifyThatTheEmployerIsAbleToSeeDetailsRegardingYourJobsOnManagedJobsPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		EmployerManageJobsPage employerManageJobsPage;
		EmployerSignUpPage employerSignUpPage;
		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress="testing321@gmail.com";
		String password="Jamal1234j";

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerAccountPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on 'Manage Jobs' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify All Fields in Your Jobs Table is Displayed");
			employerManageJobsPage.verifyDataInYourJobsTable(driver);
			step++;

			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyThatEmployerIsAbleToBuyPlansOnClickPurchaseButtonOfTheFieldHasTextJobCreditsRemaining", testSteps, driver);

		}catch (Exception e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_106_VerifyThatTheFeaturedJobCreditShouldBeCorrect" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_106_VerifyThatTheFeaturedJobCreditShouldBeCorrect", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_106_VerifyThatTheFeaturedJobCreditShouldBeCorrect" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_106_VerifyThatTheFeaturedJobCreditShouldBeCorrect", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_112_VerifyThatUserIsNavigatedToJobPostPageByClickingPostJobButton() {
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerAccountPage employerAccountPage;
		EmployerManageJobsPage employerManageJobsPage;
		EmployerSignUpPage employerSignUpPage;
		driver = initConfiguration();
		employerAccountPage = new EmployerAccountPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerSignUpPage = new EmployerSignUpPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
	    String password=dataArr[0][1].toString(); 
	    
	    
	    try {
	    	int step = 1;
	    	testSteps.add("Step "+step+" : Click on 'Login' button");
			employerAccountPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerAccountPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerAccountPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerAccountPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerAccountPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on 'Manage Jobs' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;
			
			testSteps.add("Step "+step+": Click on Post Job Button");
	    	employerManageJobsPage.clickOnPostJobButton(driver);
	    	step++;
	    	
	    	
	    	testSteps.add("Step "+step+": Verify user is Navigated to <b>Post Job</b> Page");
	    	assertTrue(employerManageJobsPage.isPageHeadingPostANewJobDisplay(driver));
	    	step++;
	    	
	    	
	    	
			testSteps.add("Step "+step+": Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_112_VerifyThatUserIsNavigatedToJobPostPageByClickingPostJobButton", testSteps, driver);

	    }catch(Exception e) {
	    	e.printStackTrace();
			testSteps.add("Failed: TC_ID_112_VerifyThatUserIsNavigatedToJobPostPageByClickingPostJobButton" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_112_VerifyThatUserIsNavigatedToJobPostPageByClickingPostJobButton", testSteps, driver);
			assertTrue(false);
	    }catch(Error e) {
	    	e.printStackTrace();
			testSteps.add("Failed: TC_ID_112_VerifyThatUserIsNavigatedToJobPostPageByClickingPostJobButton" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_112_VerifyThatUserIsNavigatedToJobPostPageByClickingPostJobButton", testSteps, driver);
			assertTrue(false);
	    }
	      
	}
	
	@Test
	public void TC_ID_115_VerifyThatEmployerIsAbleToSortTheJobByApplication(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
	    navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
	    String emailAddress=dataArr[0][0].toString();
	    String password=dataArr[0][1].toString();
	try {
		 int step=1;
		
		testSteps.add("Step "+step+" : Click on 'Login' button");
		employerManageJobsPage.clickOnLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Verify  'Email' field is display");
		assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
		step++;
		
		testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
	    employerManageJobsPage.enterEmailAddress(emailAddress,driver);
	    step++;
	    
	    testSteps.add("Step "+step+" : Enter 'Password':"+password);
	    employerManageJobsPage.enterPassword(password,driver);
	    step++;
	     
	    testSteps.add("Step "+step+" : Click on 'Submit Login' button");
		employerManageJobsPage.clickOnSubmitLoginButton(driver);
		step++;
		
		testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
		employerManageJobsPage.clickOnManageJobsButton(driver);
		step++;
//		
//		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
//		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
//		step++;
		
	    testSteps.add("Step "+step+" : Click on 'SortBy' dropdown icon");
	    employerManageJobsPage.clickOnSortByDropdownIcon(driver);
		step++;
		
		testSteps.add("Step "+step+" : Select 'Application' option");
	    employerManageJobsPage.selectApplicationOption(driver);
		step++;
		
		testSteps.add("Step "+step+" : Get job 'Applications'");
		ArrayList<String> applications= employerManageJobsPage.getJobApplications(driver);
		step++;
		
		ArrayList<String> sortedApplications = new ArrayList<>(applications);
		Collections.sort(sortedApplications);
		
		testSteps.add("Step "+step+" : Verify job 'Applications' sort alphabetically from by Number of Applications");
		assertEquals(employerManageJobsPage.getJobApplications(driver),sortedApplications);
		step++;
		
		testSteps.add("Step "+step+" : Close the Browser");
		
		tempSrc = getScreenshotPath();
		
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_115_VerifyThatEmployerIsAbleToSortTheJobByApplication", testSteps, driver);

	} catch (Exception e) {
		testSteps.add("Failed: TC_ID_115_VerifyThatEmployerIsAbleToSortTheJobByApplication " + "<br><b>Exception:</b><br> " + e.toString());
		e.printStackTrace();
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_115_VerifyThatEmployerIsAbleToSortTheJobByApplication", testSteps, driver);
		assertTrue(false);
	} catch (Error e) {
		testSteps.add("Failed: TC_ID_115_VerifyThatEmployerIsAbleToSortTheJobByApplication" + "<br><b>Error:</b><br> " + e.toString());
		e.printStackTrace();
		tempSrc = getScreenshotPath();
		testSteps.add(tempSrc);
		captureCapture(driver, tempSrc);
		AddTest_IntoReport("TC_ID_115_VerifyThatEmployerIsAbleToSortTheJobByApplication", testSteps, driver);
		assertTrue(false);
	  }
	}

	@Test
	public void TC_ID_117_VerifyThatEmployerIsAbleToSortTheJobByExpiryDate(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
			int step=1;

			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;
//
//		testSteps.add("Step "+step+" : Verify user is redirected to the 'Manage Jobs' page");
//		assertTrue(employerManageJobsPage.isManageJobsPageHeadingDisplay(driver),"Verified user is redirected to the 'Manage Jobs' page");
//		step++;

			testSteps.add("Step "+step+" : Click on 'SortBy' dropdown icon");
			employerManageJobsPage.clickOnSortByDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+" : Select 'Application' option");
			employerManageJobsPage.selectExpiryOption(driver);
			step++;

			testSteps.add("Step "+step+" : Get job 'Expiries'");
			ArrayList<String> expires= employerManageJobsPage.getJobExpires(driver);
			step++;

			ArrayList<String> sortedExpires = new ArrayList<>(expires);
			Collections.sort(sortedExpires);

			testSteps.add("Step "+step+" : Verify job 'Applications' sort alphabetically from by Number of Applications");
			assertEquals(employerManageJobsPage.getJobExpires(driver),sortedExpires);
			step++;

			testSteps.add("Step "+step+" : Close the Browser");

			tempSrc = getScreenshotPath();

			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_117_VerifyThatEmployerIsAbleToSortTheJobByExpiryDate", testSteps, driver);

		}catch (Exception e){
			testSteps.add("Failed: TC_ID_117_VerifyThatEmployerIsAbleToSortTheJobByExpiryDate " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_117_VerifyThatEmployerIsAbleToSortTheJobByExpiryDate", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_117_VerifyThatEmployerIsAbleToSortTheJobByExpiryDate " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_117_VerifyThatEmployerIsAbleToSortTheJobByExpiryDate", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_118_VerifyThatEmployerIsAbleToSortTheJobByPostedBy(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'SortBy' dropdown icon");
			employerManageJobsPage.clickOnSortByDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+" : Select 'Posted By' option");
			employerManageJobsPage.selectPostedByOption(driver);
			step++;

			testSteps.add("Step "+step+" : Get job 'Posted By'");
			ArrayList<String> postedBy= employerManageJobsPage.getJobPostedBy(driver);
			step++;

			ArrayList<String> sortedPostedBy = new ArrayList<>(postedBy);
			Collections.sort(sortedPostedBy);

			try {
				testSteps.add("Step "+step+" : Verify job 'Posted By' sort alphabetically");
				assertEquals(employerManageJobsPage.getJobExpires(driver),sortedPostedBy);
				step++;
			} catch (Exception e) {
				// TODO: handle exception
			}catch (Error e){
				
			}

			testSteps.add("Step "+step+" : Close the Browser");

			tempSrc = getScreenshotPath();

			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_118_VerifyThatEmployerIsAbleToSortTheJobByPostedBy", testSteps, driver);


		}catch (Exception e){
			testSteps.add("Failed: TC_ID_118_VerifyThatEmployerIsAbleToSortTheJobByPostedBy " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_118_VerifyThatEmployerIsAbleToSortTheJobByPostedBy", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_118_VerifyThatEmployerIsAbleToSortTheJobByPostedBy " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_118_VerifyThatEmployerIsAbleToSortTheJobByPostedBy", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_119_VerifyThatTheYourJobDataIsDownloadedInCSVFileFormatOnClickExportButton(){

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try{
			int step=1;

			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Exports Button");
			employerManageJobsPage.clickOnExportButton(driver);
			step++;

//			testSteps.add("Step "+step+": Verify CSV file is downloaded");
//			employerManageJobsPage.isFileDownloaded("jobs.csv");

			testSteps.add("Step "+step+" : Close the Browser");

			tempSrc = getScreenshotPath();

			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_119_VerifyThatTheYourJobDataIsDownloadedInCSVFileFormatOnClickExportButton", testSteps, driver);


		}catch (Exception e){
			testSteps.add("Failed: TC_ID_119_VerifyThatTheYourJobDataIsDownloadedInCSVFileFormatOnClickExportButton " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_119_VerifyThatTheYourJobDataIsDownloadedInCSVFileFormatOnClickExportButton", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_119_VerifyThatTheYourJobDataIsDownloadedInCSVFileFormatOnClickExportButton " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_119_VerifyThatTheYourJobDataIsDownloadedInCSVFileFormatOnClickExportButton", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_121_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheManageJobsPage(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filters Button");
			employerManageJobsPage.clickOnFilterDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+": Verfiy Filter Dropdown is opening");
			employerManageJobsPage.isFeatureDropdownFieldDisplay(driver);
			step++;

			testSteps.add("Step "+step+" : Close the Browser");

			tempSrc = getScreenshotPath();

			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_121_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheManageJobsPage", testSteps, driver);


		}catch (Exception e){
			testSteps.add("Failed: TC_ID_121_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_121_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheManageJobsPage", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_121_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheManageJobsPage " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_121_VerifyFilterDropdownIsOpeningAndClosingTheFiltersFromTheManageJobsPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_122_VerifyUserIsAbleToSeeMessageNoDataInTheYourJobsSection(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;
		EmployerPostedJobsPage employerPostedJobsPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(appurl, driver);


		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filters Button");
			employerManageJobsPage.clickOnFilterDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+": Enter Value in title field: Nothing");
			employerPostedJobsPage.enterJobTitle("Nothing",driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Submit Button");
			employerManageJobsPage.clickOnFilterButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Message <b>No Data</b> is displayed");
			assertTrue(employerManageJobsPage.verifyNoDataMessage(driver));
			step++;

			testSteps.add("Step "+step+" : Close the Browser");

			tempSrc = getScreenshotPath();

			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_122_VerifyUserIsAbleToSeeMessageNoDataInTheYourJobsSection", testSteps, driver);



		}catch (Exception e){
			testSteps.add("Failed: TC_ID_122_VerifyUserIsAbleToSeeMessageNoDataInTheYourJobsSection " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_122_VerifyUserIsAbleToSeeMessageNoDataInTheYourJobsSection", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_122_VerifyUserIsAbleToSeeMessageNoDataInTheYourJobsSection " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_122_VerifyUserIsAbleToSeeMessageNoDataInTheYourJobsSection", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_123_VerifyUserIsAbleToSeeDifferentFiltersForYourPostedJobsRecordSearch(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;
		EmployerPostedJobsPage employerPostedJobsPage;
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(appurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Dropdown");
			employerManageJobsPage.clickOnFilterDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+": Verify Title is displayed in Filter section");
			employerManageJobsPage.verifyJobTitleIsDisplayed(driver);
			step++;

			testSteps.add("Step "+step+": Verify Featured Field is displayed");
			employerManageJobsPage.verifyFeaturedIsDisplayed(driver);
			step++;

			testSteps.add("Step "+step+": Verify Posted Date is displayed");
			employerManageJobsPage.verifyFeaturedIsDisplayed(driver);
			step++;

			testSteps.add("Step "+step+": Verify Expiry Date is displayed");
			employerManageJobsPage.verifyExpiryDateIsDisplayed(driver);
			step++;

			testSteps.add("Step "+step+": Verify Posted By is Displayed");
			employerManageJobsPage.verifyPostedByIsDisplayed(driver);
			step++;

			testSteps.add("Step "+step+": Verify Job Status is Displayed");
			employerManageJobsPage.verifyJobStatusIsDisplayed(driver);
			step++;

			testSteps.add("Step "+step+" : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_123_VerifyUserIsAbleToSeeDifferentFiltersForYourPostedJobsRecordSearch", testSteps, driver);


		}catch (Exception e){
			testSteps.add("Failed: TC_ID_123_VerifyUserIsAbleToSeeDifferentFiltersForYourPostedJobsRecordSearch " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_123_VerifyUserIsAbleToSeeDifferentFiltersForYourPostedJobsRecordSearch", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_123_VerifyUserIsAbleToSeeDifferentFiltersForYourPostedJobsRecordSearch " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_123_VerifyUserIsAbleToSeeDifferentFiltersForYourPostedJobsRecordSearch", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_124_VerifyUserIsAbleToSetAnyFilterForYourPostedJobSearchAndGetTheReleventResults(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;
		EmployerPostedJobsPage employerPostedJobsPage;
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(appurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();


		try {
			int step = 1;

			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Dropdown");
			employerManageJobsPage.clickOnFilterDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+": Select Job Status : Active");
			employerManageJobsPage.setJobStatus(driver);
			step++;

			testSteps.add("Step "+step+": Select Active From List");
			employerManageJobsPage.setJobStatusActive(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Button");
			employerManageJobsPage.clickOnFilterButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Only Active Jobs are showing");
			assertTrue(employerManageJobsPage.verifyStatusFilterRecords("Active",driver));
			step++;

			testSteps.add("Step "+step+" : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_124_VerifyUserIsAbleToSetAnyFilterForYourPostedJobSearchAndGetTheReleventResults", testSteps, driver);

		}catch (Exception e){

			testSteps.add("Failed: TC_ID_124_VerifyUserIsAbleToSetAnyFilterForYourPostedJobSearchAndGetTheReleventResults " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_124_VerifyUserIsAbleToSetAnyFilterForYourPostedJobSearchAndGetTheReleventResults", testSteps, driver);
			assertTrue(false);
		}catch (Error e){

			testSteps.add("Failed: TC_ID_124_VerifyUserIsAbleToSetAnyFilterForYourPostedJobSearchAndGetTheReleventResults " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_124_VerifyUserIsAbleToSetAnyFilterForYourPostedJobSearchAndGetTheReleventResults", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_125_VerifyUserIsAbleToResetFiltersByClickingOnResetButton(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;
		EmployerPostedJobsPage employerPostedJobsPage;
		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		employerPostedJobsPage = new EmployerPostedJobsPage(driver);
		navigateToURL(appurl, driver);
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();


		try {
			int step = 1;

			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Dropdown");
			employerManageJobsPage.clickOnFilterDropdownIcon(driver);
			step++;

			testSteps.add("Step "+step+": Select Job Status : Active");
			employerManageJobsPage.setJobStatus(driver);
			step++;

			testSteps.add("Step "+step+": Select Expired From List");
			employerManageJobsPage.jobStatusExpired(driver);
			step++;

			testSteps.add("Step "+step+": Click on Filter Button");
			employerManageJobsPage.clickOnFilterButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Only Expired Jobs are showing");
			assertTrue(employerManageJobsPage.verifyStatusFilterRecords("Expired",driver));
			step++;

			testSteps.add("Step "+step+": Click on Reset Button");
			employerManageJobsPage.clickOnResetButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify Jobs with all statuses are showing");
			assertTrue(employerManageJobsPage.verifyStatusInAllRecords(driver));
			step++;

			testSteps.add("Step "+step+" : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_125_VerifyUserIsAbleToResetFiltersByClickingOnResetButton", testSteps, driver);

		}catch (Exception e){

			testSteps.add("Failed: TC_ID_125_VerifyUserIsAbleToResetFiltersByClickingOnResetButton " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_125_VerifyUserIsAbleToResetFiltersByClickingOnResetButton", testSteps, driver);
			assertTrue(false);
		}catch (Error e){

			testSteps.add("Failed: TC_ID_125_VerifyUserIsAbleToResetFiltersByClickingOnResetButton " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_125_VerifyUserIsAbleToResetFiltersByClickingOnResetButton", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test
	public void TC_ID_120_VerifyThatThePaginationIsWorkingProperlyThatIsPlacedAtTheBottomRightSideOfYourJobsSection(){
		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerManageJobsPage employerManageJobsPage;
		EmployerResumeSearchPage employerResumeSearchPage;

		driver = initConfiguration();
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		employerResumeSearchPage = new EmployerResumeSearchPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress=dataArr[0][0].toString();
		String password=dataArr[0][1].toString();

		try {
			int step = 1;
			testSteps.add("Step "+step+" : Click on 'Login' button");
			employerManageJobsPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Verify  'Email' field is display");
			assertTrue(employerManageJobsPage.isEmailFieldDisplay(driver),"Verified 'Email' field is display");
			step++;

			testSteps.add("Step "+step+" : Enter 'Email Address':"+emailAddress);
			employerManageJobsPage.enterEmailAddress(emailAddress,driver);
			step++;

			testSteps.add("Step "+step+" : Enter 'Password':"+password);
			employerManageJobsPage.enterPassword(password,driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Submit Login' button");
			employerManageJobsPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step "+step+" : Click on 'Manage Jobs' button from left panel");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			testSteps.add("Step "+step+": Verify 10 Rows are displayed");
			assertTrue(employerManageJobsPage.verifyDataInYourJobsTable(driver));
			step++;

			testSteps.add("Step "+step+": Click on <b>Next Page</b> Icon");
			employerManageJobsPage.clickOnNextPageIcon(driver);
			step++;

			testSteps.add("Step "+step+": Verify 10 Rows are displayed");
			assertTrue(employerManageJobsPage.verifyDataInYourJobsTable(driver));
			step++;


			testSteps.add("Step "+step+" : Close the Browser");
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_120_VerifyThatThePaginationIsWorkingProperlyThatIsPlacedAtTheBottomRightSideOfYourJobsSection", testSteps, driver);

		}catch (Exception e){
			testSteps.add("Failed: TC_ID_120_VerifyThatThePaginationIsWorkingProperlyThatIsPlacedAtTheBottomRightSideOfYourJobsSection " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_120_VerifyThatThePaginationIsWorkingProperlyThatIsPlacedAtTheBottomRightSideOfYourJobsSection", testSteps, driver);
			assertTrue(false);
		}catch (Error e){
			testSteps.add("Failed: TC_ID_120_VerifyThatThePaginationIsWorkingProperlyThatIsPlacedAtTheBottomRightSideOfYourJobsSection " + "<br><b>Exception:</b><br> " + e.toString());
			e.printStackTrace();
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_120_VerifyThatThePaginationIsWorkingProperlyThatIsPlacedAtTheBottomRightSideOfYourJobsSection", testSteps, driver);
			assertTrue(false);
		}
	}
	

}
