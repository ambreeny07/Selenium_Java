package com.ultimateqa.listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ultimateqa.base.BaseClass;

public class ExtentManager {

	/**
	 * Static instance of ExtentReports.
	 */
	private static ExtentReports extent;

	/**
	 * Path to the Extent configuration file.
	 */
	public static String configFilesPath = System.getProperty("user.dir") + File.separator + "extent-config.xml";

	/**
	 * Static instance of ExtentTest.
	 */
	private static ExtentTest test;

	/**
	 * Creates and returns an instance of ExtentReports with the specified file
	 * name.
	 *
	 * @param fileName The name of the Extent report file.
	 * @return The created instance of ExtentReports.
	 */
	public static ExtentReports createInstance(String fileName) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);

		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(fileName);
		htmlReporter.loadConfig(configFilesPath);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "QA");
		extent.setSystemInfo("Organization", "QA");
		extent.setSystemInfo("Build no", "1234");

		return extent;
	}

	/**
	 * Path for storing captured screenshots.
	 */
	public static String screenshotPath;

	/**
	 * Name of the captured screenshot.
	 */
	public static String screenshotName;

	/**
	 * Captures a screenshot and saves it to the specified path.
	 */
	public static void captureScreenshot() {
		File scrFile = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/reports/" + screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
