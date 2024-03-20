package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerManageJobsPage;

public class DeleteJobs extends BaseClass {
	String tempSrc = "";

	@Test(priority=500)
	public void DeleteJob() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		EmployerDashBoardPage employerDashBoardPage;
		EmployerManageJobsPage employerManageJobsPage;// = new EmployerManageJobsPage(driver);

		boolean flag = false;

		driver = initConfiguration();
		employerDashBoardPage = new EmployerDashBoardPage(driver);
		employerManageJobsPage = new EmployerManageJobsPage(driver);
		navigateToURL(appurl, driver);

		Object[][] dataArr = getData(excelFileName, "EmployerValidCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Click on 'Login' button");
			employerDashBoardPage.clickOnLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Verify  'Email' field is display");
			assertTrue(employerDashBoardPage.isEmailFieldDisplay(driver), "Verified 'Email' field is display");
			step++;

			testSteps.add("Step " + step + " : Enter 'Email Address':" + emailAddress);
			employerDashBoardPage.enterEmailAddress(emailAddress, driver);
			step++;

			testSteps.add("Step " + step + " : Enter 'Password':" + password);
			employerDashBoardPage.enterPassword(password, driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Submit Login' button");
			employerDashBoardPage.clickOnSubmitLoginButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Dashboard' button");
			employerDashBoardPage.clickOnDashboardButton(driver);
			step++;

			testSteps.add("Step " + step + " : Click on 'Mange Job' button");
			employerManageJobsPage.clickOnManageJobsButton(driver);
			step++;

			try {
				for (int i = 0; i < 8; i++) {
					testSteps.add("Step " + step + " : Click on 'Expire' button");
					employerDashBoardPage.clickOnRecentJobDeleteButton(driver);
					step++;

					waitTime(2000);
				}

			} catch (Exception e) {

			}

			testSteps.add("Step " + step + " : Close the Browser");

			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("DeleteJob", testSteps, driver);

		} catch (Exception e) {
			e.printStackTrace();
			testSteps.add("Failed: DeleteJob " + "<br><b>Exception:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("DeleteJob", testSteps, driver);
			assertTrue(false);
		} catch (Error e) {
			testSteps.add("Failed: DeleteJob" + "<br><b>Error:</b><br> " + e.toString());
			tempSrc = getScreenshotPath();
			testSteps.add(tempSrc);
			captureCapture(driver, tempSrc);
			AddTest_IntoReport("DeleteJob", testSteps, driver);
			assertTrue(false);
		}
	}
}
