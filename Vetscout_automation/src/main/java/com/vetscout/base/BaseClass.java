package com.vetscout.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.listeners.ExtentListeners;
import com.vetscout.utilities.Waits;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.vetscout.pages.*;

public class BaseClass {
	/*
	 * WebDriver
	 *
	 * ExcelReader Logs WebDriverWait ExtentReports
	 *
	 *
	 *
	 */
	public static boolean closeDriver = false;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String browser;
	public static String env;
	public static FileInputStream fis;
	public static ExtentTest extentReport;
	public static SoftAssert softAssert;
	public static Integer waitInSeconds = 5;

	// This is the default path to data package
	public static String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";

	// This is the default path to imageUpload
	public static String imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";

	// This is column name from which we need to get row
	public static final String colName = "env";
	// This is row index of environment column from which we need to get data
	public static int rowIndex = 0;
	// Excel file name
	public static final String testDataFile = "testData";
	// Excel sheetname
	public static final String testDataSheet = "TestData";	
	public static final int defaultTimeForVisibility = 30;
	public static final int defaultTimeTOBeClickable = 30;
	public static final String AppUrl = "AppURL";

	// Test Suite Runner File Name
	public static final String testSuiteRunnerFileName = "SuiteTests_Web";
	// Test Suite Runner Sheet Name
	public static final String testSuiteRunnerSheetName = "Tests";

	public static void initConfiguration() {

		String osName = System.getProperty("os.name");
		if (osName.contains("Windows")) {
			excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";
			imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";
		} else {
			excelFilePath = System.getProperty("user.dir") + "/src/test/resources/data/";
			imagePath = System.getProperty("user.dir") + "/src/test/resources/images/";
		}
		System.out.println("OS : " + osName);
		System.out.println("User Dir : " + System.getProperty("user.dir"));
		System.out.println("excelFilePath  : " + excelFilePath);
		System.out.println("imagePath   : " + imagePath);
		extentReport = ExtentListeners.testReport.get();
		softAssert = new SoftAssert();

		System.out.println("OS : " + System.getProperty("os.name"));
		System.out.println("User Dir : " + System.getProperty("user.dir"));
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
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			prefs.put("useAutomationExtension", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			String agentString = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36";
			options.addArguments("--user-agent=" + agentString);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			options.addArguments("window-size=1920,1080");
			//options.addArguments("--headless");
			options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
			options.addArguments("--disable-gpu");
			//options.addArguments("enable-automation");
			options.addArguments("--dns-prefetch-disable");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--disable-blink-features=AutomationControlled");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			try {
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(9000,TimeUnit.NANOSECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void scrollIntoViewSmoothly(WebElement Element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				Element);
	}

	public static void openURL(String key) {
		driver.get(PropertiesReader.getPropertyValue(env + "_" + key));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")),
				TimeUnit.SECONDS);
	}

	public static void navigateToURL(String value) {
		driver.get(value);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")),
				TimeUnit.SECONDS);
	}

	public static String loginDetails(String key) {
		return PropertiesReader.getPropertyValue(env + "_" + key);
	}

	public static void click(WebElement element) {
		waitForElementVisibility(element, "30");
		scrollIntoViewSmoothly(element);
		waitForElementClickable(element, "20");
		element.click();
		Waits.wait5s();
	}

	public static void click(WebElement element, String timeInSeconds) {
		waitForElementVisibility(element, timeInSeconds);
		waitForElementClickable(element, timeInSeconds);
		element.click();
	}

	public static void waitForElementVisibility(WebElement element, String timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementClickable(WebElement element, String timeoutInSeconds) {
		WebDriverWait waitClickable = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		waitClickable.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void hoverAndClick(WebElement element,WebElement element1) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		builder.moveToElement(element1).click().perform();
//		waitTime(3000);
	}
	public void hoverOverElement(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).pause(1000).perform();

	}
	
	public void waitUntilSearchLoadingShowing() {
		try {
			WebElement element = driver.findElement(By.xpath("//*[@class='css-1bg64dd']"));
			waitUntilElementDisplayed(element);
		} catch (Exception e) {
		}
	}

	public static void waitUntilElementDisplayed(final WebElement webElement) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		ExpectedCondition elementIsDisplayed = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver arg0) {
				try {
					webElement.isDisplayed();
					return true;
				} catch (NoSuchElementException e) {
					return false;
				} catch (StaleElementReferenceException f) {
					return false;
				}
			}
		};
		wait.until(elementIsDisplayed);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void Waitfor10mints() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void type(WebElement element, String value) {
		waitUntilElementDisplayed(element);
//		waitForElementClickable(element, "10");
		element.clear();
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
			System.out.println("Entered :" + value);
			element.sendKeys(value);
		} catch (Exception e) {
			element.sendKeys(value);
		}
	}

	public static void type_old(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void selectValueFromDropdown(List<WebElement> dropdownValues, String value) {
		for (WebElement ele : dropdownValues) {
			System.out.println("Actual :" + ele.getText() + ":");
			System.out.println("Excepted :" + value + ":");
			if (ele.getText().trim().equals(value)) {
				click(ele);
				break;
			}
		}
	}

	public void multipleSelectFromDropDown(WebElement searchBox, List<WebElement> elementList, String... inputValues) {

		for (String inputValue : inputValues) {
			type(searchBox, inputValue);
			for (WebElement value : elementList) {
				if (value.getText().equals(inputValue)) {
					click(value);
					break;
				}
			}
		}
	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,-250)");
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,2500)");
	}

	public void scrollIntoView(WebElement Element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void clickUsingJavascriptExecutor(WebElement button) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
	}

	public void mouseHoverAndClick(WebElement button) {
		Actions actions = new Actions(driver);
		actions.moveToElement(button);
		actions.click().build().perform();
	}

	public void mouseHover(WebElement button) {
		Actions actions = new Actions(driver);
		actions.moveToElement(button);
	}

	public static boolean isElementDisplayed(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static boolean isElementSelected(WebElement status) {
		if (status.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isElementEnabled(WebElement status) {
		if (status.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void quitBrowser() {

	}

	public static void closeBrowser() {

		closeDriver = true;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void waitforPageLoad(int pageLoadTimeout) {
		try {
			new WebDriverWait(driver, pageLoadTimeout).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		} catch (TimeoutException e) {
			printString(e.toString());
		}
	}

	public static String getUniqueData(String value) {
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyHmm");
		Date date = new Date();
		String unique = formatter.format(date).toString();
		String uniqueValue = value + unique;
		formatter.formatToCharacterIterator(uniqueValue);
		return uniqueValue;
	}

	public static String getUniqueEmailId(String value) {

		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyHmm");
		Date date = new Date();
		String unique = formatter.format(date).toString();
		String uniqueEmailId = value + generateRandomNumberWithGivenNumberOfDigits(5) + unique + "@codeautomation.ai";
		return uniqueEmailId;
	}

	public static String getElementText(WebElement element) {
		waitForElementVisibility(element, "10");
		return element.getText().trim();
	}
	public static String getElementTextWithoutTrim(WebElement element) {
		waitForElementVisibility(element, "10");
		return element.getText();
	}

	public static String getSystemDateInMMDDYYYYFormat() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Dater : " + dtf.format(now));
		return dtf.format(now);

	}

	public static void teardown() {
//		log.info("Closing the test script in teardown");
//		ErrorCollector.extentLogInfo("Closing the test script in teardown");
		closeBrowser();
	}

	public static void getRefreshWebPage() {
		waitTime(5000);
		driver.navigate().refresh();
		waitTime(5000);
	}

	// Scroll Into Specific view
	public void scrollIntoSpecificView(WebElement Element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0,1000)");
	}

	// Scroll Into Specific view
	public void scrollIntoSpecificViewInvoicesAction(WebElement Element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0,1600)");
	}

	@AfterTest
	public void tearDown() {

		BaseClass.quitBrowser();
	}

	public static void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -150)");
		boolean isDisplay = isElementDisplayed(element);
		if (!isDisplay) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -100)");
		}
	}
	

	public void click(WebElement element, int timeInSecond, String message) {
		waitTime(5000);
		waitForElementVisibility(element, Integer.toString(timeInSecond));
		waitForElementClickable(element, Integer.toString(timeInSecond));
		scrollToElement(element);
		try {
			element.click();
		} catch (Exception e) {
			printString("Failed to Click through click method : " + e.toString());
			printString("Trying to Click through javascript");
			scrollIntoView(element);
			clickUsingJavascriptExecutor(element);
		}
		printString("Clicked " + message);
		ErrorCollector.extentLogInfo("Clicked " + message);
	}


	public static void printString(String message) {
		try {
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getElementAttributeValue(WebElement element, String attribute) {
		waitTime(waitInSeconds);
		waitForElementVisibility(element, Integer.toString(waitInSeconds));
		scrollToElement(element);
		return element.getAttribute(attribute);
	}

	public void clear(WebElement element, int timeInSecond, String message) {

		waitForElementVisibility(element, Integer.toString(timeInSecond));
		scrollToElement(element);
		element.clear();
		printString("Clearing  " + message);
		ErrorCollector.extentLogInfo("Clearing  " + message);

	}

	public static void scrollToAddPaymentsElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			((JavascriptExecutor) driver).executeScript("scrollBy(0, -350)");
		} catch (Exception e) {
			e.printStackTrace();
			boolean isDisplay = isElementDisplayed(element);
			if (!isDisplay) {
				// ((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, 50)");
			}
		}
	}

	public static String generateRandomNumberWithGivenNumberOfDigits(int number) {
		String randomNumber = "123456789";
		StringBuilder sb = new StringBuilder(number);
		for (int i = 0; i < number; i++) {
			int index = (int) (randomNumber.length() * Math.random());
			sb.append(randomNumber.charAt(index));
		}
		return sb.toString();
	}

	public static String generateRandomStringWithGivenNumberOfDigits(int number) {
		String randomNumber = "qwertyuiopasdfghjklzxcvbnm";
		StringBuilder sb = new StringBuilder(number);
		for (int i = 0; i < number; i++) {
			int index = (int) (randomNumber.length() * Math.random());
			sb.append(randomNumber.charAt(index));
		}
		return sb.toString();
	}

	public void click(WebElement element, int timeInSecond) {
		waitTime(5000);
		waitForElementVisibility(element, Integer.toString(timeInSecond));
		waitForElementClickable(element, Integer.toString(timeInSecond));
		scrollToElement(element);
		try {
			element.click();
		} catch (Exception e) {
			printString("Failed to Click through click method : " + e.toString());
			printString("Trying to Click through javascript");
			clickUsingJavascriptExecutor(element);
		}
	}

	public void type(WebElement element, int timeInSecond, String value) {
		waitForElementVisibility(element, Integer.toString(timeInSecond));
		waitForElementClickable(element, Integer.toString(timeInSecond));
		scrollToElement(element);
		element.clear();
		element.sendKeys(value);
	}

	public String getDate(int Day, String formateStr) {
		SimpleDateFormat format = new SimpleDateFormat(formateStr);
		final Date date = new Date();
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, Day);
		return format.format(calendar.getTime());
	}

	public void clear(WebElement element, int timeInSecond) {

		waitForElementVisibility(element, Integer.toString(timeInSecond));
		scrollToElement(element);
		element.clear();
	}

	public String getInputText(WebElement element) {
		waitTime(waitInSeconds);
		waitForElementVisibility(element, Integer.toString(waitInSeconds));
		scrollToElement(element);
		return element.getAttribute("value");
	}

	public void clearThroughRobot(WebElement element) {
		click(element, waitInSeconds);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_DELETE);
		} catch (AWTException e) {
			ErrorCollector.addVerificationFailure(e);
		}

	}

	public void typeKeys(WebElement element, Keys Key) {
		waitForElementVisibility(element, Integer.toString(waitInSeconds));
		waitForElementClickable(element, Integer.toString(waitInSeconds));
		scrollToElement(element);
		element.clear();
		element.sendKeys(Key);
	}

	public void goBack() {
		driver.navigate().back();
	}

	public static void switchTab(int index) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(index));

	}

	public static ArrayList<String> getWindows() {
		return new ArrayList<String>(driver.getWindowHandles());
	}

	public static void closeTab(int index) {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(index));
		driver.close();
		driver.switchTo().window(tabs2.get(index - 1));

	}

	public Integer sumofList(ArrayList<Integer> list) {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total = total + list.get(i);
		}
		return total;
	}

	public static void waitfor10sec() throws InterruptedException {
		Thread.sleep(10000);
	}

	public static void waitfor10mints() throws InterruptedException {
		Thread.sleep(600000);
	}

	public static void waitfor3sec() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void waitfor5sec() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void waitfor1sec() throws InterruptedException {
		Thread.sleep(1000);
	}

	public static void clearField(WebElement element) {
		String inputText = element.getAttribute("value");
		if (inputText != null) {
			for (int i = 0; i < inputText.length(); i++) {
				element.sendKeys(Keys.BACK_SPACE);
			}
		}
	}

	public void waitForElementToBeClickable(WebElement element, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForElementVisibility(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void sendKeysToWebElement(WebElement element, String keys) {
		waitForElementVisibility(element, defaultTimeForVisibility);
		waitForElementToBeClickable(element, defaultTimeTOBeClickable);
		element.clear();
		element.sendKeys(keys);
		Waits.wait1s();
	}

	public static void clearUsingJavascriptExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '';", element);
	}

	
	public static ArrayList<Double> getSortedAcendingDoubleArray(ArrayList<Double> list ) {
		Collections.sort(list);
		return list;
	}
	public static ArrayList<String> getSortedAcendingStringArray(ArrayList<String> list ) {
		Collections.sort(list);
		return list;
	}
	public static ArrayList<Double> getSortedDecendingDoubleArray(ArrayList<Double> list ) {
		Collections.sort(list,Collections.reverseOrder());
		return list;
	}
	
	public static ArrayList<String> getSortedDecendingStringArray(ArrayList<String> list ) {
		Collections.sort(list,Collections.reverseOrder());
		return list;
	}
	
	public boolean matchStringCaseInsensitiveTrim(String word,String word1) {
		word=word.trim();
		word1=word1.trim();
		return new String(word).equals(word1);
	}
	

	public String getElementCssValue(WebElement element, String attribute) {
		waitTime(waitInSeconds);
		waitForElementVisibility(element, Integer.toString(waitInSeconds));
		scrollToElement(element);
		return element.getCssValue(attribute);
	}
	
	public String randomNumberString(int len) {
		String AB = "123456789";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
	
	
	
	public void login() {
		initConfiguration();
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String Password = PropertiesReader.getPropertyValue(env + "_" + "Valid_Password");

		LoginPage loginPage = new LoginPage();
		loginPage.loginToApp(Email,Password);
	}
	
	
	public void closeDriver() {
		driver.close();
	}


}
