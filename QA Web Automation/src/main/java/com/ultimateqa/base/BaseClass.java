package com.ultimateqa.base;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.ultimateqa.listeners.ExtentManager;
import com.ultimateqa.utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Utility {

	/**
	 * Static class variables for managing WebDriver, Extent reports, and test-related configurations.
	 */
	public static boolean closeDriver = false;
	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static String browser;
	public static String env;
	public static FileInputStream fis;
	public static ExtentTest extentReport;
	public static SoftAssert softAssert;
	public static Integer waitInSeconds = 5;

	// File paths and constants
	public static String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";
	public static String imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";
	public static String UtilityscreenshotPath;
	public static String UtilityscreenshotName;
	public static final String colName = "env";
	public static int rowIndex = 0;
	public static final String testDataFile = "testData";
	public static final String testDataSheet = "TestData";
	public static final int defaultTimeForVisibility = 30;
	public static final int defaultTimeTOBeClickable = 30;
	public static final String AppUrl = "AppURL";
	private static String screenshotPath;
	private static String screenshotNam;
	public static String envVal = PropertiesReader.getPropertyValue("env");

	// Test suite runner information
	public static final String testSuiteRunnerFileName = "SuiteTests_Web";
	public static final String testSuiteRunnerSheetName = "Tests";
	public static HashMap<String, Integer> methodNamelist = new HashMap<>();

	// ThreadLocal for managing WebDriver instances in a multi-threaded environment
	public static ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<RemoteWebDriver>();

	/**
	 * Gets the current WebDriver instance associated with the current thread.
	 * 
	 * @return The current WebDriver instance.
	 */
	public static WebDriver getDriver() {
	    return dr.get();
	}

	/**
	 * Sets the WebDriver instance for the current thread.
	 * 
	 * @param driver The WebDriver instance to be set.
	 */
	public static void setWebDriver(RemoteWebDriver driver) {
	    dr.set(driver);
	}

	/**
	 * Represents the Extent report test and instance, initializing it with a specified report file location.
	 */
	public static ExtentTest test;
	private static ExtentReports extent = ExtentManager
	        .createInstance(System.getProperty("user.dir") + "/reports/" + "Web Automation Test Report.html");

	/**
	 * Initializes the WebDriver configuration based on the specified browser and environment.
	 * 
	 * @return WebDriver instance configured with the specified settings.
	 */
	public static WebDriver initConfiguration() {
	    WebDriver localD = null;
	    
	    // Initialize SoftAssert for assertion handling
	    softAssert = new SoftAssert();

	    // Get browser and environment settings from system environment variables or properties file
	    if (System.getenv("browser") != null && !System.getenv("browser").isEmpty()) {
	        browser = System.getenv("browser");
	    } else {
	        browser = PropertiesReader.getPropertyValue("browser");
	    }
	    if (System.getenv("env") != null && !System.getenv("env").isEmpty()) {
	        env = System.getenv("env");
	    } else {
	        env = PropertiesReader.getPropertyValue("env");
	    }

	    // Configure WebDriver based on the specified browser
	    if (browser.equals("firefox")) {
	        WebDriverManager.firefoxdriver().setup();
	        localD = new FirefoxDriver();
	    } else if (browser.equals("chrome")) {
	        WebDriverManager.chromedriver().setup();
	        Map<String, Object> prefs = new HashMap<String, Object>();
	        prefs.put("profile.default_content_setting_values.notifications", 2);
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", prefs);
//	        String agentString = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36";
//	        options.addArguments("--user-agent=" + agentString);
	        options.addArguments("--disable-extensions");
	        options.addArguments("--disable-infobars");
	        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
//	        options.addArguments("--headless");
	        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
	        options.addArguments("--disable-gpu");
	        options.addArguments("enable-automation");
	        options.addArguments("--dns-prefetch-disable");
	        options.addArguments("--disable-browser-side-navigation");
	        String agentString2 = "Mozilla/5.0 (iPhone; CPU iPhone OS 13_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148";
	        options.addArguments("--user-agent=" + agentString2);
	     // Set window size for iPhone 13
//	        options.addArguments("--window-size=2532,1170");
//	        options.addArguments("window-size=2532,1170");
	        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	        try {
	            localD = new ChromeDriver(options);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        localD.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	        localD.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
	        localD.manage().timeouts().setScriptTimeout(30L, TimeUnit.SECONDS);
//	        localD.manage().window().maximize();
	    } else if (browser.equals("edge")) {
	        WebDriverManager.edgedriver().setup();
	        WebDriverManager.safaridriver();
	        localD = new EdgeDriver();
	    } else if (browser.equals("safari")) {
	        WebDriverManager.safaridriver().setup();
	        localD = new SafariDriver();
	    } else if (browser.equals("chromium")) {
	        WebDriverManager.chromiumdriver().setup();
	        WebDriverManager.operadriver().setup();
	        localD = new ChromeDriver();
	    } else if (browser.equals("opera")) {
	        WebDriverManager.operadriver().setup();
	        localD = new OperaDriver();
	    }

	    // Set page load timeout for the WebDriver instance
	    localD.manage().timeouts().pageLoadTimeout(10, TimeUnit.MINUTES);

	    return localD;
	}
	
	/**
	 * Generates a timestamp in the format "dd-M-yyyy hh:mm:ss" and replaces characters '-',' ','and ':' with '_'.
	 * 
	 * @return The generated timestamp as a string.
	 */
	public static String getTimeStamp() {
	    return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()).replaceAll("[-: ]", "_");
	}
	
	/**
	 * Adds a test into the Extent report with the specified name, test steps, and WebDriver instance.
	 * 
	 * @param TestName      The name of the test.
	 * @param test_steps    The list of test steps.
	 * @param localDriver   The WebDriver instance.
	 */
	public static void AddTest_IntoReport(String TestName, ArrayList<String> test_steps, WebDriver localDriver) {
	    // Create a new test in the Extent report with the given name
	    test = extent.createTest(TestName);

	    // Iterate through each test step and log it into the Extent report
	    for (int i = 0; i < test_steps.size(); i++) {
	        // Check if the test step indicates failure or assertion failure
	        if (test_steps.get(i).contains("Failed") || test_steps.get(i).contains("Assertion")) {
	            if (test_steps.get(i).toLowerCase().contains("screenshot")) {
	                printString("Name" + test_steps.get(i));
	                try {
	                    // If the test step contains a screenshot, attach it to the report as a failure
	                    test.log(Status.FAIL, "<b>" + "<font color=" + "black>" + "Screenshot" + "</font>" + "</b>",
	                            MediaEntityBuilder.createScreenCaptureFromPath(test_steps.get(i)).build());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                // If the test step is a regular failure, log it as a failure
	                test.log(Status.FAIL, test_steps.get(i));
	            }
	        } else {
	            if (test_steps.get(i).toLowerCase().contains("screenshot")) {
	                printString("Name" + test_steps.get(i));
	                try {
	                    // If the test step contains a screenshot, attach it to the report as a pass
	                    test.log(Status.PASS, "<b>" + "<font color=" + "black>" + "Screenshot" + "</font>" + "</b>",
	                            MediaEntityBuilder.createScreenCaptureFromPath(test_steps.get(i)).build());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                // If the test step is a regular pass, log it as a pass
	                test.log(Status.PASS, test_steps.get(i));
	            }
	        }
	    }

	    // Clear the list of test steps and close the WebDriver instance
	    test_steps.clear();
	    closeBrowser(localDriver);
	}

	/**
	 * Generates a screenshot path based on the current date and time.
	 * 
	 * @return The generated screenshot path.
	 */
	public static String getScreenshotPath() {
	    Date d = new Date();
	    return screenshotNam = "ScreenShot" + d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	}

	/**
	 * Captures a screenshot and saves it with the specified name in the "reports" directory.
	 * 
	 * @param localDriver The WebDriver instance.
	 * @param screen      The name of the screenshot.
	 */
	public static void captureCapture(WebDriver localDriver, String screen) {
	    // Capture screenshot using WebDriver and save it to the "reports" directory
	    File scrFile = ((TakesScreenshot) localDriver).getScreenshotAs(OutputType.FILE);
	    Date d = new Date();
	    screenshotNam = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	    try {
	        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/reports/" + screen));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Captures a screenshot using the global WebDriver instance and saves it in the "target/surefire-reports/html" directory.
	 * 
	 * @throws IOException If an I/O exception occurs during screenshot capture.
	 */
	public static void UtilitycaptureScreenshot() throws IOException {
	    // Capture screenshot using the global WebDriver instance and save it to the "target/surefire-reports/html" directory
	    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    Date d = new Date();
	    UtilityscreenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
	    FileUtils.copyFile(scrFile,
	            new File(System.getProperty("user.dir") + "/target/surefire-reports/html/" + UtilityscreenshotName));
	}

	/**
	 * Performs cleanup operations after the test suite, flushing and closing the Extent report.
	 */
	@AfterSuite
	public static void afterSuiteFlush() {
	    extent.flush();
	}

}
