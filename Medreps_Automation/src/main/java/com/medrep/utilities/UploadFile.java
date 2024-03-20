package com.medrep.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.openqa.selenium.WebDriver;

import com.medrep.base.BaseClass;
import com.medrep.pages.UploadReportGenerateLinkPage;

public class UploadFile extends BaseClass {

	public UploadFile() {

	}

	public String UploadReportGenerateLink() {
		WebDriver driver = null;
		UploadReportGenerateLinkPage uploadReportGenerateLinkPage;
		String filePath = ZipUtils.OUTPUT_ZIP_FILE;

		driver = initConfiguration();
		navigateToURL(sharePointURL, driver);

		Object[][] dataArr = getData(excelFileName, "SharePointCredential", driver);
		String emailAddress = dataArr[0][0].toString();
		String password = dataArr[0][1].toString();
		uploadReportGenerateLinkPage = new UploadReportGenerateLinkPage(driver);

		uploadReportGenerateLinkPage.enterEmailAddress(emailAddress, driver);
		uploadReportGenerateLinkPage.clickOnNextButton(driver);
		uploadReportGenerateLinkPage.enterPassword(password, driver);
		uploadReportGenerateLinkPage.clickOnSignInButton(driver);
		uploadReportGenerateLinkPage.clickOnNoButton(driver);
		navigateToURL(sharePointURL, driver);
		uploadReportGenerateLinkPage.clickOnUploadButton(driver);
		uploadReportGenerateLinkPage.clickOnFilesDropdownOption(driver);
		uploadReportGenerateLinkPage.uploadFile(filePath, driver);
		uploadReportGenerateLinkPage.clickOnRecentReport(driver);
		uploadReportGenerateLinkPage.clickOnCopylinkButton(driver);
		String value = uploadReportGenerateLinkPage.getCopyPath(driver);
		driver.close();
		driver.quit();

		return value;
	}

}
