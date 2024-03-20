package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.medrep.base.BaseClass;
import com.medrep.pages.CandidateCareerAdvicePage;
import com.medrep.utilities.Waits;

public class CandidateCareerAdvice extends BaseClass {
	String tempSrc = "";

	@Test()
	public void TC_ID_100_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;
		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		
		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
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

//			Waits.wait1s();
			testSteps.add("Step " + step + " :Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			Waits.wait2s();
			testSteps.add("Step " + step + " : Verify user is redirect to the 'Career Advice' page");
			assertTrue(candidateCareerAdvicePage.isBreakingIntoMedicalSalesButtonDisplay(driver),
					"Verified user is redirect to the'Career Advice' page");
			step++;

			Waits.wait2s();
			candidateCareerAdvicePage.Logout(driver);

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_100_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel", testSteps, driver);

		} catch (Exception e) {
			testSteps.add(
					"Failed: TC_ID_100_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_100_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: TC_ID_100_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_100_VerifyUserIsRedirectedToBlogPageByClickingOnCareerAdvicePageFromTheNavigationPanel", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_101_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
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
			AddTest_IntoReport("TC_ID_101_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_101_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_101_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_101_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_101_VerifyUserIsAbleToOpenAnyBlogByClickingOnTheBlogFromTheCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_102_VerifyUserIsAbleToOpenAnyBlogCategory() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
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
			AddTest_IntoReport("TC_ID_102_VerifyUserIsAbleToOpenAnyBlogCategory", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_102_VerifyUserIsAbleToOpenAnyBlogCategory " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_102_VerifyUserIsAbleToOpenAnyBlogCategory", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_102_VerifyUserIsAbleToOpenAnyBlogCategory" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_102_VerifyUserIsAbleToOpenAnyBlogCategory", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_103_VerifyThatUserCanSearchBlogsFromCareerAdvicePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
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

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Enter 'Search Blog':" + blogHeading);
			candidateCareerAdvicePage.enterSearch(blogHeading, driver);
			step++;

			testSteps.add("Step " + step + " : Verify search 'Blog' is display");
			assertEquals(candidateCareerAdvicePage.getHeadingOfFirstBlog(driver), blogHeading,
					"Search 'Blog' is not display");
			step++;

			candidateCareerAdvicePage.Logout(driver);
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_103_VerifyThatUserCanSearchBlogsFromCareerAdvicePage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_103_VerifyThatUserCanSearchBlogsFromCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_103_VerifyThatUserCanSearchBlogsFromCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_103_VerifyThatUserCanSearchBlogsFromCareerAdvicePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_103_VerifyThatUserCanSearchBlogsFromCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_105_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
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

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Most Popular' Blogs is display");
			assertTrue(candidateCareerAdvicePage.isMostPopularBlogsDisplay(driver), "Verified 'Most Popular' Blogs is display");
			step++;

			candidateCareerAdvicePage.Logout(driver);
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_105_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_105_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_105_VerifyUserIsAbleToSeeMostPopularBlogsSectionOnTheBottomOfThePage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_106_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		String subscribtionEmail = "test"+generateRandomNumberWithGivenNumberOfDigits(4,driver)+"@gmail.com";
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

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Subscribtion Email':" + subscribtionEmail);
			candidateCareerAdvicePage.enterEmailSubscribe(subscribtionEmail, driver);
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Email Subscribe' button");
			candidateCareerAdvicePage.clickEmailSubscribeButton(driver);
			step++;			
			
			testSteps.add("Step " + step + " : Verify 'SubScribtion Success Message' popup is display");
			assertTrue(candidateCareerAdvicePage.isSubScribtionSuccessMessageDisplay(driver), "Verified 'SubScribtion Success Message' popup is display");
			step++;

			candidateCareerAdvicePage.Logout(driver);
			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_106_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_106_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_106_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_106_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_106_VerifyUserIsAbleToSubscribeForNewsletterFromTheCareerAdvicePage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_153_VerifyGuestUserIsNotAbleToSeeGatedArticlesFormTheBlogPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
//			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
//				testSteps.add("Step " + step + " : Click on 'Login' button");
//				candidateCareerAdvicePage.clickOnLoginButton(driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Verify  'Email' field is display");
//				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
//				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Password':" + password);
//				candidateCareerAdvicePage.enterPassword(password, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
//				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
//				step++;
//			}

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Click on 'First Blog'");
			candidateCareerAdvicePage.clickOnBlog(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Join Now' Button");
			assertTrue(candidateCareerAdvicePage.isJoinNowButtonDisplay(driver), "Verified 'Join Now' Button");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_153_VerifyGuestUserIsNotAbleToSeeGatedArticlesFormTheBlogPage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_153_VerifyGuestUserIsNotAbleToSeeGatedArticlesFormTheBlogPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_153_VerifyGuestUserIsNotAbleToSeeGatedArticlesFormTheBlogPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_153_VerifyGuestUserIsNotAbleToSeeGatedArticlesFormTheBlogPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_153_VerifyGuestUserIsNotAbleToSeeGatedArticlesFormTheBlogPage", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_154_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
//			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
//				testSteps.add("Step " + step + " : Click on 'Login' button");
//				candidateCareerAdvicePage.clickOnLoginButton(driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Verify  'Email' field is display");
//				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
//				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Password':" + password);
//				candidateCareerAdvicePage.enterPassword(password, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
//				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
//				step++;
//			}

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Click on 'First Blog'");
			candidateCareerAdvicePage.clickOnBlog(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Download' Icon");
			candidateCareerAdvicePage.clickDownloadIcon(driver);
			step++;
			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_154_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_154_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_154_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_154_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_154_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_155_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
//			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
//				testSteps.add("Step " + step + " : Click on 'Login' button");
//				candidateCareerAdvicePage.clickOnLoginButton(driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Verify  'Email' field is display");
//				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
//				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Password':" + password);
//				candidateCareerAdvicePage.enterPassword(password, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
//				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
//				step++;
//			}

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Click on 'First Blog'");
			candidateCareerAdvicePage.clickOnBlog(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Save' Icon");
			candidateCareerAdvicePage.clickSaveIcon(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Link Copied To Clipboard' Popup is display");
			assertTrue(candidateCareerAdvicePage.isLinkCopiedToClipboardPopupDisplay(driver), "Verified Link Copied To Clipboard' Popup  is display");
			step++;
			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_155_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_155_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_155_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_155_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_155_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_157_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
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

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Download' Icon");
			candidateCareerAdvicePage.clickDownloadIcon(driver);
			step++;			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_157_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_157_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_157_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_157_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_157_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_156_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
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
			
			testSteps.add("Step " + step + " : Verify 'Full Artical' is display");
			assertTrue(candidateCareerAdvicePage.isFullArticalDisplay(driver), "Verified 'Full Artical' is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_156_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_156_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_156_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_156_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_156_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_138_VerifyUserIsNotAbleToSeeGatedArticlesFormTheBlogPage() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[1][0].toString();
		String password = dataArr[1][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
			step++;
//			if (candidateCareerAdvicePage.verifyOnLoginButton(driver) == true) {
//				testSteps.add("Step " + step + " : Click on 'Login' button");
//				candidateCareerAdvicePage.clickOnLoginButton(driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Verify  'Email' field is display");
//				assertTrue(candidateCareerAdvicePage.isEmailFieldDisplay(driver), "Verified 'Email' is field display");
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
//				candidateCareerAdvicePage.enterEmailAddress(emailAddress, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Enter 'Password':" + password);
//				candidateCareerAdvicePage.enterPassword(password, driver);
//				step++;
//
//				testSteps.add("Step " + step + " : Click on 'Submit Login' button");
//				candidateCareerAdvicePage.clickOnSubmitLoginButton(driver);
//				step++;
//			}

			testSteps.add("Step " + step + " : Click on 'Career Advice' from top tab-bar");
			candidateCareerAdvicePage.clickOnCareerAdviceButton(driver);
			step++;

			String blogHeading = candidateCareerAdvicePage.getHeadingOfFirstBlog(driver);
			testSteps.add("Step " + step + " : Get first 'Blog' heading:" + blogHeading);
			step++;

			testSteps.add("Step " + step + " : Click on 'First Blog'");
			candidateCareerAdvicePage.clickOnBlog(driver);
			step++;

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Join Now' Button");
			assertTrue(candidateCareerAdvicePage.isJoinNowButtonDisplay(driver), "Verified 'Join Now' Button");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_138_VerifyUserIsNotAbleToSeeGatedArticlesFormTheBlogPage", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_138_VerifyUserIsNotAbleToSeeGatedArticlesFormTheBlogPage " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_138_VerifyUserIsNotAbleToSeeGatedArticlesFormTheBlogPage", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_138_VerifyUserIsNotAbleToSeeGatedArticlesFormTheBlogPage" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_138_VerifyUserIsNotAbleToSeeGatedArticlesFormTheBlogPage", testSteps, driver);
			assertTrue(false);
		}
	}
	
	@Test()
	public void TC_ID_139_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[1][0].toString();
		String password = dataArr[1][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
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

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Download' Icon");
			candidateCareerAdvicePage.clickDownloadIcon(driver);
			step++;			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_139_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_139_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_139_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_139_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_139_VerifyGuestUserIsNotAbleToDownloadGatedFullArticle", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_140_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[1][0].toString();
		String password = dataArr[1][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
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

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Save' Icon");
			candidateCareerAdvicePage.clickSaveIcon(driver);
			step++;
			
			testSteps.add("Step " + step + " : Verify 'Link Copied To Clipboard' Popup is display");
			assertTrue(candidateCareerAdvicePage.isLinkCopiedToClipboardPopupDisplay(driver), "Verified Link Copied To Clipboard' Popup  is display");
			step++;			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_140_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_140_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_140_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_140_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_140_VerifyGuestUserIsAbleToCopyLinkOfAnyArticle", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_141_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
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
			
			testSteps.add("Step " + step + " : Verify 'Full Artical' is display");
			assertTrue(candidateCareerAdvicePage.isFullArticalDisplay(driver), "Verified 'Full Artical' is display");
			step++;

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_141_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_141_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_141_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_141_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_141_VerifyGuestUserIsAbleToSeeFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		}
	}

	@Test()
	public void TC_ID_142_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		CandidateCareerAdvicePage candidateCareerAdvicePage;

		driver = initConfiguration();
		candidateCareerAdvicePage = new CandidateCareerAdvicePage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "ActiveCandidateLoginCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {

			int step = 1;

			testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
			assertTrue(candidateCareerAdvicePage.isMedrepLogoDisplay(driver),
					"Verified user is redirected to the'Home Page'");
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

			testSteps.add("Step " + step + " : Verify 'Join Now' Binner is display");
			assertTrue(candidateCareerAdvicePage.isJoinNowBinnerDisplay(driver), "Verified 'Join Now' Binner is display");
			step++;
			
			testSteps.add("Step " + step + " : Click on 'Download' Icon");
			candidateCareerAdvicePage.clickDownloadIcon(driver);
			step++;			

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_142_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add(
					"Failed: TC_ID_142_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_142_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			e.printStackTrace();
			testSteps.add("Failed: TC_ID_142_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("TC_ID_142_VerifyGuestUserIsAbleToDownloadFullArticleWithInUnlocked", testSteps, driver);
			assertTrue(false);
		}
	}

}
