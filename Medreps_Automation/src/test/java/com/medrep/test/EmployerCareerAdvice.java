package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateCareerAdvicePage;
import com.medrep.pages.EmployerCareerAdvicePage;
import com.medrep.pages.EmployerManageJobsPage;
import com.medrep.utilities.Waits;

public class EmployerCareerAdvice extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_129_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;
		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		
		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			
			int step = 1;
			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateCareerAdvicePage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateCareerAdvicePage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
				step++;
			}			
			
			testSteps.add("Step " + step + " :Click on 'Medreps Logo'");
			candidateCareerAdvicePage.clickMedrepsLogo(driver);
			step++;
			
			testSteps.add("Step " + step + " :Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			Waits.wait2s();
			testSteps.add("Step " + step + " : Verify user is redirect to the 'Career Advice' page");
			assertTrue(candidateCareerAdvicePage.isBreakingIntoMedicalSalesButtonDisplay(driver),
					"Verified user is redirect to the'Career Advice' page");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_129_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_129_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_129_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_129_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_129_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_130_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateCareerAdvicePage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateCareerAdvicePage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
				step++;
			}
			
			testSteps.add("Step " + step + " :Click on 'Medreps Logo'");
			candidateCareerAdvicePage.clickMedrepsLogo(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Click on 'First Blog'");
			candidateCareerAdvicePage.clickOnBlog(driver);
			step++;

			testSteps.add("Step " + step + " : Verify user is redirect to the 'Blog' page");
			assertEquals(candidateCareerAdvicePage.getBlogPageHeading(driver), blogHeading,
					"User is not redirect to the 'Blog' page");
			step++;

			candidateCareerAdvicePage.Logout(driver);
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_130_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_130_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_130_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_130_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_130_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_131_VerifyUserIsAbleToOpenAnyBlogCategory() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName,"EmployerValidCredential",driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
				testSteps.add("Step " + step + " : Click on 'Login' button");
				candidateCareerAdvicePage.clickOnLoginButton(driver);
				step++;

				testSteps.add("Step " + step + " : Verify  'Email' field is display");
				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
				step++;

				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
				step++;

				testSteps.add("Step " + step + " : Enter 'Password':" + password);
				candidateCareerAdvicePage.enterPassword(password, driver);
				step++;

				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
				step++;
			}
			
			testSteps.add("Step " + step + " :Click on 'Medreps Logo'");
			candidateCareerAdvicePage.clickMedrepsLogo(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Click on 'Breaking Into Medical Sales' Tab");
			candidateCareerAdvicePage.clickBreakingIntoMedicalSalesTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Breaking Into Medical Sales' tab page is display");
			assertTrue(candidateCareerAdvicePage.isTabPageDisplay(driver), "Verified 'Breaking Into Medical Sales' tab page is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Job Search' Tab");
			candidateCareerAdvicePage.clickJobSearchTab(driver);
			step++;


			testSteps.add("Step " + step + " : Verify 'Job Search' tab page is display");
			assertTrue(candidateCareerAdvicePage.isTabPageDisplay(driver), "Verified 'Job Search' tab page is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Insider' Tab");
			candidateCareerAdvicePage.clickInsiderTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Insider' tab page is display");
			assertTrue(candidateCareerAdvicePage.isTabPageDisplay(driver), "Verified 'Insider' tab page is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Sales Advice' Tab");
			candidateCareerAdvicePage.clickSalesAdviceTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Sales Advice' tab page is display");
			assertTrue(candidateCareerAdvicePage.isTabPageDisplay(driver), "Verified 'Sales Advice' tab page is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'All' Tab");
			candidateCareerAdvicePage.clickAllTab(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'All' tab page is display");
			assertTrue(candidateCareerAdvicePage.isTabPageDisplay(driver), "Verified 'All' tab page is display");
			step++;
			
			candidateCareerAdvicePage.Logout(driver);
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_131_VerifyUserIsAbleToOpenAnyBlogCategory", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_131_VerifyUserIsAbleToOpenAnyBlogCategory " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_131_VerifyUserIsAbleToOpenAnyBlogCategory", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_131_VerifyUserIsAbleToOpenAnyBlogCategory" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_131_VerifyUserIsAbleToOpenAnyBlogCategory", testSteps, driver);
			assertTrue(false);
		}
	}

    @Test
    public void TC_ID_132_VerifyThatUserCanSearchBlogsFromCareerAdvicePage(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+": Click on Career Advice Link");
            employerCareerAdvicePage.clickOnCareerAdviceLink(driver);
            step++;


            testSteps.add("Step "+step+": Enter SearchField value :My Favourite");
            employerCareerAdvicePage.enterSearchFieldValue(driver);
            step++;


            testSteps.add("Step "+step+": Verify Search term related results are showing");
            assertTrue(employerCareerAdvicePage.verifyResultsAreShowing(driver));
            step++;


            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_132_VerifyThatUserCanSearchBlogsFromCareerAdvicePage", testSteps, driver);




        }catch (Exception e){
            testSteps.add("Failed: TC_ID_132_VerifyThatUserCanSearchBlogsFromCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_132_VerifyThatUserCanSearchBlogsFromCareerAdvicePage", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_132_VerifyThatUserCanSearchBlogsFromCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_132_VerifyThatUserCanSearchBlogsFromCareerAdvicePage", testSteps, driver);
            assertTrue(false);
        }
    }

	@Test
    public void TC_ID_134_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+": Click on Career Advice Link");
            employerCareerAdvicePage.clickOnCareerAdviceLink(driver);
            step++;

            testSteps.add("Step "+step+": Verify Most Popular Blogs Section is Displayed");
            assertTrue(employerCareerAdvicePage.verifyMostPopularBlogsSectionIsDisplayed(driver));
            step++;

            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_134_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage", testSteps, driver);


        }catch (Exception e){
            testSteps.add("Failed: TC_ID_134_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_134_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_134_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_134_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage", testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_135_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+": Click on Career Advice Link");
            employerCareerAdvicePage.clickOnCareerAdviceLink(driver);
            step++;

            testSteps.add("Step "+step+": Switch to Frame");
            employerCareerAdvicePage.switchToFrame(driver);
            step++;


            testSteps.add("Step "+step+": Enter Email");
            employerCareerAdvicePage.enterNewsLetterEmail(driver);
            step++;

            testSteps.add("Step "+step+": Click on Subscribe Button");
            employerCareerAdvicePage.clickOnSubscribeButton(driver);
            step++;

            driver.switchTo().defaultContent();

            testSteps.add("Step "+step+": Verify Success Message is displayed");
            assertTrue(employerCareerAdvicePage.verifySuccessMessageIsDisplayed(driver));
            step++;

            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_135_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage", testSteps, driver);


        }catch (Exception e){
            testSteps.add("Failed: TC_ID_135_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_135_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_135_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_135_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage", testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_136_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromNavigation(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+" : Click on Medical Sales Link");
            employerCareerAdvicePage.clickOnMedicalSalesLink(driver);
            step++;

            testSteps.add("Step "+step +" : Verify user is redirected to Medical Sales Link");
            employerCareerAdvicePage.verifyUserIsRedirectedToMedicalSalesPage(driver);
            step++;



            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_136_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromNavigation", testSteps, driver);


        }catch (Exception e){
            testSteps.add("Failed: TC_ID_136_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromNavigation " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_136_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromNavigation", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_136_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromNavigation " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_136_VerifyUserIsRedirectedToMedicalSalesSalaryInformationPageByClickingOnMedicalSalesSalaryFromNavigation", testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_139_VerifyUserIsRedirectedToReportPageByClickingOnAnyReportUnderMoreMedicalSalesSection(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+" : Click on Medical Sales Link");
            employerCareerAdvicePage.clickOnMedicalSalesLink(driver);
            step++;

            testSteps.add("Step "+step +" : Verify user is redirected to Medical Sales Link");
            employerCareerAdvicePage.verifyUserIsRedirectedToMedicalSalesPage(driver);
            step++;

            testSteps.add("Step "+step+": Click on Jump Link : Biotech Sales Salary Report");
            employerCareerAdvicePage.clickOnJumpLink(driver);
            step++;

            testSteps.add("Step "+step+" : Verify User is redirected to Biotech Sales Salary Report page");
            assertTrue(employerCareerAdvicePage.verifyUserIsRedirectedToBioTechSalesPage(driver));
            step++;


            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_139_VerifyUserIsRedirectedToReportPageByClickingOnAnyReportUnderMoreMedicalSalesSection", testSteps, driver);


        }catch (Exception e){
            testSteps.add("Failed: TC_ID_139_VerifyUserIsRedirectedToReportPageByClickingOnAnyReportUnderMoreMedicalSalesSection " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_139_VerifyUserIsRedirectedToReportPageByClickingOnAnyReportUnderMoreMedicalSalesSection", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_139_VerifyUserIsRedirectedToReportPageByClickingOnAnyReportUnderMoreMedicalSalesSection " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_139_VerifyUserIsRedirectedToReportPageByClickingOnAnyReportUnderMoreMedicalSalesSection", testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_138_VerifyUserIsAbleToSeeDifferentReportsUnderMoreMedicalSalesSalaryReportSection(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+" : Click on Medical Sales Link");
            employerCareerAdvicePage.clickOnMedicalSalesLink(driver);
            step++;

            testSteps.add("Step "+step +" : Verify user is redirected to Medical Sales Link");
            employerCareerAdvicePage.verifyUserIsRedirectedToMedicalSalesPage(driver);
            step++;

            testSteps.add("Step "+step+": Click on Jump Link : Biotech Sales Salary Report");
            employerCareerAdvicePage.clickOnJumpLink(driver);
            step++;

            testSteps.add("Step "+step+" : Verify User is redirected to Biotech Sales Salary Report page");
            assertTrue(employerCareerAdvicePage.verifyUserIsRedirectedToBioTechSalesPage(driver));
            step++;


            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_138_VerifyUserIsAbleToSeeDifferentReportsUnderMoreMedicalSalesSalaryReportSection", testSteps, driver);


        }catch (Exception e){
            testSteps.add("Failed: TC_ID_138_VerifyUserIsAbleToSeeDifferentReportsUnderMoreMedicalSalesSalaryReportSection " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_138_VerifyUserIsAbleToSeeDifferentReportsUnderMoreMedicalSalesSalaryReportSection", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_138_VerifyUserIsAbleToSeeDifferentReportsUnderMoreMedicalSalesSalaryReportSection " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_138_VerifyUserIsAbleToSeeDifferentReportsUnderMoreMedicalSalesSalaryReportSection", testSteps, driver);
            assertTrue(false);
        }
    }
  
    @Test
    public void TC_ID_137_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        EmployerManageJobsPage employerManageJobsPage;
        EmployerCareerAdvicePage employerCareerAdvicePage;
        driver = initConfiguration();
        employerManageJobsPage = new EmployerManageJobsPage(driver);
        employerCareerAdvicePage = new EmployerCareerAdvicePage(driver);
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

            testSteps.add("Step "+step+": Click on Medreps Logo");
            employerCareerAdvicePage.clickOnMedrepsLogo(driver);
            step++;

            testSteps.add("Step "+step+" : Click on Medical Sales Link");
            employerCareerAdvicePage.clickOnMedicalSalesLink(driver);
            step++;

            testSteps.add("Step "+step +" : Verify user is redirected to Medical Sales Link");
            employerCareerAdvicePage.verifyUserIsRedirectedToMedicalSalesPage(driver);
            step++;

            testSteps.add("Step "+step+": Click on Jump Link : Market");
            employerCareerAdvicePage.clickOnJumpLinkMarket(driver);
            step++;

            testSteps.add("Step "+step+": Verify Market Section is displayed by clicking on Jump Link");
            assertTrue(employerCareerAdvicePage.verifyMarketSectionIsDisplayed(driver));
            step++;

            testSteps.add("Step "+step+" : Close the Browser");
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_137_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings", testSteps, driver);


        }catch (Exception e){
            testSteps.add("Failed: TC_ID_137_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_137_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings", testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps.add("Failed: TC_ID_137_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings " + "<br><b>Exception:</b><br> " + e.toString());
            e.printStackTrace();
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_137_VerifyTheJumpLinksAvailableAndWorkingForCompareAverageEarnings", testSteps, driver);
            assertTrue(false);
        }
    }
	
}
