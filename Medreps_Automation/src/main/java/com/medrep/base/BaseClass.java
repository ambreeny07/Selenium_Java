package com.medrep.base;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.batch.json.JsonBatchCallback;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.Permission;
import com.medrep.listeners.ExtentManager;
import com.medrep.listeners.RetryListener;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.utilities.Utility;
import com.medrep.utilities.ZipUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Utility {

	public static boolean closeDriver = false;
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static String browser;
	public static String env;
	public static FileInputStream fis;
//	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExtentTest extentReport;
	public static SoftAssert softAssert;
	// public static ExtentReports rep = ExtentManager.getInstance();
	// This is to set default wait for every method
	public static Integer waitInSeconds = 5;
	public static final String api_base_url = "http://182.180.172.81:8082/";
	public static HashMap<String, Integer> methodNamelist = new HashMap<>();
	public static ArrayList<String> createdUsers = new ArrayList<String>();

	// This is the default path to data package
	public static String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";

	// This is the default path to imageUpload
	public static String imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";
	public static String UtilityscreenshotPath;
	public static String UtilityscreenshotName;
	// This is column name from which we need to get row
	public static final String colName = "env";
	// This is row index of environment column from which we need to get data
	public static int rowIndex = 0;
	// Excel file name
	public static final String testData = "testData";
	// Excel sheetname
	public static final String testDataSheet = "TestData";
	public static final int defaultTimeForVisibility = 30;
	public static final int defaultTimeTOBeClickable = 30;
	public static final String AppUrl = "AppURL";
	private static String screenshotPath;
	private static String screenshotNam;
	public static final String defaultWaitTime = "30";
	// Test Suite Runner File Name
	public static final String testSuiteRunnerFileName = "SuiteTests_Web";
	// Test Suite Runner Sheet Name
	public static final String testSuiteRunnerSheetName = "Tests";

	public static String appurl = "";
	public static String memberurl = "";
	public static String sharePointURL = "";
	public static String strapiAdminUrl = "";
	
	
	public static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<RemoteWebDriver>();

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void setWebDriver(RemoteWebDriver driver) {
		dr.set(driver);
	}

	public static ExtentTest test;
	private static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "/reports/" + "Web Automation Test Report.html");

	public static WebDriver initConfiguration() {
		
		WebDriver localD = null;
		String osName = System.getProperty("os.name");
		if (osName.contains("Windows")) {
			excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";
			imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";
		} else {
			excelFilePath = System.getProperty("user.dir") + "/src/test/resources/data/";
			imagePath = System.getProperty("user.dir") + "/src/test/resources/images/";
		}
		softAssert = new SoftAssert();

		if (System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {
			browser = System.getenv("browser");
			System.out.println("Browser: " + browser);
		} else {
			browser = PropertiesReader.getPropertyValue("browser");
		}
		if (System.getenv("env") != null && !System.getenv("env").isEmpty()) {
			env = System.getenv("env");
			System.out.println("Env: " + env);
		} else {
			env = PropertiesReader.getPropertyValue("env");
		}
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "gecko.exe");
			localD = new FirefoxDriver();
		} else if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			String profilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
					+ File.separator + "resources" + File.separator + "data" + File.separator + "Profile 1"
					+ File.separator;
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			String dowloadPath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\tempData\\";
			prefs.put("download.default_directory", dowloadPath);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			prefs.put("useAutomationExtension", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			String agentString = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.5304.88 Safari/537.36";
			options.addArguments("--user-agent=" + agentString);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			options.addArguments("window-size=1920,1080");
			options.addArguments("--headless");
			options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
			// options.addArguments("--disable-gpu");
			// options.addArguments("enable-automation");
			options.addArguments("--dns-prefetch-disable");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--disable-blink-features");
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			options.addArguments("--disable-blink-features=AutomationControlled");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//			options.addArguments("user-data-dir=" + profilePath);

			try {
				localD = new ChromeDriver(options);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			localD = new InternetExplorerDriver();
		}
		localD.manage().timeouts().pageLoadTimeout(10, TimeUnit.MINUTES);
		appurl = PropertiesReader.getPropertyValue(env + "_" + "AppURL");
		memberurl =  PropertiesReader.getPropertyValue(env + "_" + "MemberURL");
		sharePointURL =  PropertiesReader.getPropertyValue(env + "_" + "SharePointURL");
		strapiAdminUrl =  PropertiesReader.getPropertyValue(env + "_" + "StrapiAdmin");	
		return localD;
	}

	public static void shiftWindowHandle(int val, WebDriver driver) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(val));
	}

	/////////////////////////////////////////////////
	public static String getTimeStamp() {
		return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()).replaceAll("[-: ]", "_");
	}

	
	public static String getScreenshotPath() {
		Date d = new Date();
		return screenshotNam = "ScreenShot" + d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	}

	public static void captureCapture(WebDriver localDriver, String screen) {

		try {
			File scrFile = ((TakesScreenshot) localDriver).getScreenshotAs(OutputType.FILE);

			Date d = new Date();
			screenshotNam = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
			try {
				FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/reports/" + screen));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void UtilitycaptureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		UtilityscreenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "/target/surefire-reports/html/" + UtilityscreenshotName));

	}

	@AfterSuite
	public static void afterSuiteFlush() {
		extent.flush();
	}

	public String getDownloadFileName() {
		String fileName = null;
		File directoryPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\tempData\\");
		File filesList[] = directoryPath.listFiles();
		for (File file : filesList) {
			fileName = file.getName();
		}
		return fileName;
	}

	public void deleteDownloadFile() {
		try {

			FileUtils.cleanDirectory(
					new File(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\tempData\\"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
public static void AddTest_IntoReport(String TestName, ArrayList<String> test_steps, WebDriver localDriver) {
		
		String testType = null;
		for (String list : test_steps) {
			System.out.print("Type: "+testType);
			if (list.contains("Failed") || list.contains("Assertion")) {
				testType = "Failed";
				break;
			}else {
				testType = "TestPassed";
			}
		}
		
		if (testType.contains("TestPassed")) {
			test = extent.createTest(TestName);
			for(String steps:test_steps) {
				if (steps.toLowerCase().contains("screenshot")) {
					printString("Name" + steps, driver);
					try {
						test.log(Status.PASS, "<b>" + "<font color=" + "black>" + "Screenshot" + "</font>" + "</b>",
								MediaEntityBuilder.createScreenCaptureFromPath(steps).build());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					test.log(Status.PASS, steps);
				}
			}
		} else if (testType.contains("Failed") || testType.contains("Assertion")) {
			int count = RetryListener.maxRetryCnt;
			int currCount = methodNamelist.get(TestName);
			printString(count+"\n"+currCount);
			if (currCount == count) {
				test = extent.createTest(TestName);
				for(String steps:test_steps) {
					if(steps.contains("Failed") || steps.contains("Assertion")) {
						if (steps.toLowerCase().contains("screenshot")) {
							printString("Name" + steps, driver);
							try {
								test.log(Status.FAIL, "<b>" + "<font color=" + "black>" + "Screenshot" + "</font>" + "</b>",
										MediaEntityBuilder.createScreenCaptureFromPath(steps).build());
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							test.log(Status.FAIL, steps);
						}
					}else {
						if (steps.toLowerCase().contains("screenshot")) {
							printString("Name" + steps, driver);
							try {
								test.log(Status.PASS, "<b>" + "<font color=" + "black>" + "Screenshot" + "</font>" + "</b>",
										MediaEntityBuilder.createScreenCaptureFromPath(steps).build());
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							test.log(Status.PASS, steps);
						}
					}					
				}
			}
		}
		test_steps.clear();
		closeOtherTabs(localDriver);
		waitTime(7000);
		closeBrowser(localDriver);
	}

public String generateRandomString() {
	String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	int RANDOM_STRING_LENGTH = 10;
	StringBuilder sb = new StringBuilder();
	Random random = new Random();
	for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
		int index = random.nextInt(CHAR_LIST.length());
		sb.append(CHAR_LIST.charAt(index));
	}
	return sb.toString();
}

}
