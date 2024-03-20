package com.medrep.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medrep.base.BaseClass;
import com.medrep.pages.EmployerDashBoardPage;
import com.medrep.pages.EmployerManageJobsPage;
import com.medrep.pages.StrapiPage;

public class DeleteCreatedUser extends BaseClass {
	String tempSrc = "";

	@Test(priority=504)
	public void DeleteCreatedUser() {

		WebDriver driver = null;
		ArrayList<String> testSteps = new ArrayList<>();
		StrapiPage strapiPage;


		driver = initConfiguration();
		strapiPage = new StrapiPage(driver);
		navigateToURL(strapiAdminUrl, driver);

		Object[][] dataArr = getData(excelFileName, "StrapiUatAdmin", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		try {
			int step = 1;

			testSteps.add("Step " + step + " : Enter Strapi Dev Email: "+emailAddress+"");
			strapiPage.enterEmailAddress(emailAddress,driver);
			step++;
			
			testSteps.add("Step " + step + " : Enter Strapi Dev Password: "+password+"");
			strapiPage.enterPassword(password,driver);
			step++;
			
			strapiPage.clickOnSubmitLoginButton(driver);
			step++;
			
			strapiPage.clickOnUserMenuSearchButton(driver);
			step++;
			
			strapiPage.enterUserMenuSearch(driver);
			step++;
			
			strapiPage.clickOnUsersMenuOption(driver);
			step++;
			
			System.out.println(createdUsers.size());
			for(int i=0; i <= createdUsers.size() - 1; i++) {
				testSteps.add("Step " + step + " : Deleted User: "+createdUsers.get(i)+"  number: "+i+"");
				strapiPage.enterSearchUser(createdUsers.get(i),driver);
				step++;
				
				strapiPage.verifyTestUserDisplaying(createdUsers.get(i),driver);
				step++;
				
				try {
					strapiPage.clickOnTrashIcon(driver);
					step++;
					
					strapiPage.clickOnYesConfirm(driver);
					step++;
					
					strapiPage.verifyDeletedPopupDisplaying(driver);
					step++;	
				} catch (Exception e) {
					// TODO: handle exception
				}catch (Error e) {
					// TODO: handle exception
				}
								
			}		

			testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("DeleteCreatedUser",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: DeleteCreatedUser"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("DeleteCreatedUser",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: DeleteCreatedUser"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("DeleteCreatedUser",
                    testSteps, driver);
            assertTrue(false);
        }
    }
}
