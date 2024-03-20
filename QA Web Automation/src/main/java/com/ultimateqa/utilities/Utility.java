package com.ultimateqa.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.BasicFileReporter;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.ultimateqa.base.BaseClass;
import com.ultimateqa.base.PropertiesReader;
import com.ultimateqa.errorCollectors.Assertion;
import com.slack.api.model.Action;

public class Utility extends Assertion {
	/**
	 * Indicates whether the WebDriver instance should be closed.
	 */
	public static boolean closeDriver = false;

	/**
	 * WebDriverWait instance for explicit waits.
	 */
	public static WebDriverWait wait;

	/**
	 * The browser being used for the test.
	 */
	public static String browser;

	/**
	 * The environment for the test.
	 */
	public static String env;

	/**
	 * Default time for visibility in seconds.
	 */
	public static final int defaultTimeForVisibility = 30;

	/**
	 * Default time to be clickable in seconds.
	 */
	public static final int defaultTimeToBeClickable = 30;

	/**
	 * Column name from which to get the row.
	 */
	public static final String colName = "env";

	/**
	 * Default wait time in seconds.
	 */
	public static Integer waitInSeconds = 5;

	/**
	 * Default path to the data package.
	 */
	public static String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\";

	/**
	 * Default path to image upload.
	 */
	public static String imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\";

	/**
	 * Row index of the environment column from which to get data.
	 */
	public static int rowIndex = 0;

	/**
	 * Scrolls the web page to bring the specified WebElement into view smoothly.
	 *
	 * @param Element The WebElement to be scrolled into view.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void scrollIntoViewSmoothly(WebElement Element, WebDriver driver) {
	    JavascriptExecutor je = (JavascriptExecutor) driver;
	    je.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", Element);
	}

	/**
	 * Opens the URL based on the provided key and environment.
	 *
	 * @param key The key to fetch the URL from the properties file.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void openURL(String key, WebDriver driver) {
	    driver.get(PropertiesReader.getPropertyValue(env + "_" + key));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")),
	            TimeUnit.SECONDS);
	}

	/**
	 * Navigates to the specified URL.
	 *
	 * @param value The URL to navigate to.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void navigateToURL(String value, WebDriver driver) {
	    try {
	        driver.get(value);
//	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(
	                Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")), TimeUnit.SECONDS);
	    } catch (Exception e) {
	        driver.get(value);
//	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(
	                Integer.parseInt(PropertiesReader.getPropertyValue("implicit.wait")), TimeUnit.SECONDS);
	    }
	}

	/**
	 * Clicks on the specified WebElement after ensuring its visibility and clickability.
	 *
	 * @param element The WebElement to click.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void click(WebElement element, WebDriver driver) {
	    scrollIntoViewSmoothly(element, driver);
	    waitForElementVisibility(element, "30", driver);
	    waitForElementClickable(element, "20", driver);
	    element.click();
	    Waits.wait5s();
	}

	/**
	 * Clicks on the specified WebElement using the Actions class after ensuring its visibility.
	 *
	 * @param element The WebElement to click.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void clickUsingActionClass(WebElement element, WebDriver driver) {
	    scrollIntoViewSmoothly(element, driver);
	    waitForElementVisibility(element, "30", driver);
	    Point loc = element.getLocation();

	    new Actions(driver).moveByOffset(loc.x, loc.y).click().perform();
	    Waits.wait3s();
	}

	/**
	 * Clicks on the specified WebElement after ensuring its visibility and clickability, with a custom time.
	 *
	 * @param element The WebElement to click.
	 * @param timeInSeconds The custom time to wait for visibility and clickability.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void click(WebElement element, String timeInSeconds, WebDriver driver) {
	    scrollIntoViewSmoothly(element, driver);
	    waitForElementVisibility(element, timeInSeconds, driver);
	    waitForElementClickable(element, timeInSeconds, driver);
	    element.click();
	}

	/**
	 * Waits for the visibility of a WebElement within a specified timeout.
	 *
	 * @param element          The WebElement to wait for visibility.
	 * @param timeoutInSeconds The maximum time to wait for the element to be
	 *                         visible, in seconds.
	 * @param driver           The WebDriver instance.
	 */
	public static void waitForElementVisibility(WebElement element, String timeoutInSeconds, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * Waits for a WebElement to be clickable within a specified timeout.
	 *
	 * @param element          The WebElement to wait for clickability.
	 * @param timeoutInSeconds The maximum time to wait for the element to be
	 *                         clickable, in seconds.
	 * @param driver           The WebDriver instance.
	 */
	public static void waitForElementClickable(WebElement element, String timeoutInSeconds, WebDriver driver) {
		WebDriverWait waitClickable = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		waitClickable.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Selects an option from a dropdown by index.
	 * 
	 * @param driver          The WebDriver instance.
	 * @param dropdownElement The By locator for the dropdown element.
	 * @param index           The index of the option to be selected.
	 */
	public static void selectOptionByIndex(WebElement dropdownElement, int index, WebDriver driver) {
		waitUntilElementDisplayed(dropdownElement, driver);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(index);
	}

	/**
	 * Selects an option from a dropdown by value.
	 * 
	 * @param driver          The WebDriver instance.
	 * @param dropdownElement The By locator for the dropdown element.
	 * @param value           The value of the option to be selected.
	 */
	public static void selectOptionByValue(WebElement dropdownElement, String value, WebDriver driver) {
		waitUntilElementDisplayed(dropdownElement, driver);
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByValue(value);
	}

	/**
	 * Waits until the search loading indicator is displayed on the web page.
	 *
	 * @param driver The WebDriver used for interaction.
	 */
	public void waitUntilSearchLoadingShowing(WebDriver driver) {
	    try {
	        WebElement element = driver.findElement(By.xpath("//*[@class='css-1bg64dd']"));
	        waitUntilElementDisplayed(element, driver);
	    } catch (Exception e) {
	        // Handle exception if any
	    }
	}

	/**
	 * Waits until the specified WebElement is displayed on the web page.
	 *
	 * @param webElement The WebElement to wait for.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void waitUntilElementDisplayed(final WebElement webElement, WebDriver driver) {
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
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * Types the specified value into the WebElement after ensuring its visibility.
	 *
	 * @param element The WebElement to type into.
	 * @param value The value to be typed.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void type(WebElement element, String value, WebDriver driver) {
	    waitUntilElementDisplayed(element, driver);
	    element.clear();
	    try {
	        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	        element.sendKeys(Keys.DELETE);
	        element.sendKeys(value);
	    } catch (Exception e) {
	        element.sendKeys(value);
	    }
	}

	/**
	 * Selects a value from a dropdown by matching the text.
	 *
	 * @param dropdownValues List of WebElement options in the dropdown.
	 * @param value The value to be selected from the dropdown.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void selectValueFromDropdown(List<WebElement> dropdownValues, String value, WebDriver driver) {
	    for (WebElement ele : dropdownValues) {
	        System.out.println("Actual :" + ele.getText() + ":");
	        System.out.println("Expected :" + value + ":");
	        if (ele.getText().trim().equals(value)) {
	            click(ele, driver);
	            break;
	        }
	    }
	}

	/**
	 * Performs multiple selections from a dropdown based on the provided input values.
	 *
	 * @param searchBox The input box to type values into.
	 * @param elementList List of WebElement options in the dropdown.
	 * @param driver The WebDriver used for interaction.
	 * @param inputValues The values to be selected from the dropdown.
	 */
	public void multipleSelectFromDropDown(WebElement searchBox, List<WebElement> elementList, WebDriver driver,
	        String... inputValues) {
	    for (String inputValue : inputValues) {
	        type(searchBox, inputValue, driver);
	        for (WebElement value : elementList) {
	            if (value.getText().equals(inputValue)) {
	                click(value, driver);
	                break;
	            }
	        }
	    }
	}

	/**
	 * Scrolls the web page up using JavaScript.
	 *
	 * @param driver The WebDriver used for interaction.
	 */
	public void scrollUp(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("scroll(0,-250)");
	}

	/**
	 * Scrolls the web page down using JavaScript.
	 *
	 * @param driver The WebDriver used for interaction.
	 */
	public void scrollDown(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("scroll(0,2500)");
	}

	/**
	 * Scrolls the web page to bring the specified WebElement into view.
	 *
	 * @param Element The WebElement to be scrolled into view.
	 * @param driver The WebDriver used for interaction.
	 */
	public void scrollIntoView(WebElement Element, WebDriver driver) {
	    JavascriptExecutor je = (JavascriptExecutor) driver;
	    je.executeScript("arguments[0].scrollIntoView();", Element);
	}

	/**
	 * Clicks on the specified WebElement using JavaScript Executor.
	 *
	 * @param button The WebElement to be clicked.
	 * @param driver The WebDriver used for interaction.
	 */
	public void clickUsingJavascriptExecutor(WebElement button, WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", button);
	}

	/**
	 * Performs a mouse hover and clicks on the specified WebElement.
	 *
	 * @param button The WebElement to hover over and click.
	 * @param driver The WebDriver used for interaction.
	 */
	public void mouseHoverAndClick(WebElement button, WebDriver driver) {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(button);
	    actions.click().build().perform();
	}

	/**
	 * Performs a mouse hover over the specified WebElement.
	 *
	 * @param button The WebElement to hover over.
	 * @param driver The WebDriver used for interaction.
	 */
	public void mouseHover(WebElement button, WebDriver driver) {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(button);
	}

	/**
	 * Checks if the WebElement is displayed on the web page.
	 *
	 * @param element The WebElement to check for display.
	 * @param driver The WebDriver used for interaction.
	 * @return True if the element is displayed, false otherwise.
	 */
	public static boolean isElementDisplayed(WebElement element, WebDriver driver) {
	    wait2s();
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

	/**
	 * Checks if the status of the WebElement is selected.
	 *
	 * @param status The WebElement to check for selection status.
	 * @param driver The WebDriver used for interaction.
	 * @return True if the element is selected, false otherwise.
	 */
	public static boolean isElementSelected(WebElement status, WebDriver driver) {
	    if (status.isSelected()) {
	        return true;
	    } else {
	        return false;
	    }
	}

	/**
	 * Checks if the status of the WebElement is enabled.
	 *
	 * @param status The WebElement to check for enablement status.
	 * @param driver The WebDriver used for interaction.
	 * @return True if the element is enabled, false otherwise.
	 */
	public static boolean isElementEnabled(WebElement status, WebDriver driver) {
	    if (status.isEnabled()) {
	        return true;
	    } else {
	        return false;
	    }
	}

	/**
	 * Quits the WebDriver instance.
	 *
	 * @param driver The WebDriver instance to be quit.
	 */
	public static void quitBrowser(WebDriver driver) {
	    driver.quit();
	}

	/**
	 * Closes the current browser window.
	 *
	 * @param driver The WebDriver used for interaction.
	 */
	public static void closeBrowser(WebDriver driver) {
	    driver.close();
	    closeDriver = true;
	}

	/**
	 * Retrieves the title of the current web page.
	 *
	 * @param driver The WebDriver used for interaction.
	 * @return The title of the current web page.
	 */
	public static String getTitle(WebDriver driver) {
	    return driver.getTitle();
	}

	/**
	 * Waits for the page to load completely within the specified timeout.
	 *
	 * @param pageLoadTimeout The maximum time to wait for the page to load.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void waitforPageLoad(int pageLoadTimeout, WebDriver driver) {
	    try {
	        new WebDriverWait(driver, pageLoadTimeout).until(webDriver -> ((JavascriptExecutor) webDriver)
	                .executeScript("return document.readyState").equals("complete"));
	    } catch (TimeoutException e) {
	        printString(e.toString());
	    }
	}

	/**
	 * Retrieves the text content of the specified WebElement after ensuring its visibility.
	 *
	 * @param element The WebElement from which to retrieve the text.
	 * @param driver The WebDriver used for interaction.
	 * @return The text content of the element.
	 */
	public static String getElementText(WebElement element, WebDriver driver) {
	    waitForElementVisibility(element, "10", driver);
	    return element.getText().trim();
	}

	/**
	 * Closes the browser, equivalent to calling close() on the WebDriver instance.
	 *
	 * @param driver The WebDriver used for interaction.
	 */
	public static void teardown(WebDriver driver) {
	    closeBrowser(driver);
	}

	/**
	 * Refreshes the current web page.
	 *
	 * @param driver The WebDriver used for interaction.
	 */
	public static void getRefreshWebPage(WebDriver driver) {
	    waitTime(5000, driver);
	    driver.navigate().refresh();
	    waitTime(5000, driver);
	}

	/**
	 * Scrolls the web page to a specific view using JavaScript.
	 *
	 * @param Element The WebElement to be scrolled into view.
	 * @param driver The WebDriver used for interaction.
	 */
	public void scrollIntoSpecificView(WebElement Element, WebDriver driver) {
	    JavascriptExecutor je = (JavascriptExecutor) driver;
	    je.executeScript("scroll(0,1000)");
	}

	/**
	 * Scrolls the web page to a specific view for a specific action using JavaScript.
	 *
	 * @param Element The WebElement to be scrolled into view.
	 * @param driver The WebDriver used for interaction.
	 */
	public void scrollIntoSpecificViewInvoicesAction(WebElement Element, WebDriver driver) {
	    JavascriptExecutor je = (JavascriptExecutor) driver;
	    je.executeScript("scroll(0,1600)");
	}

	/**
	 * Scrolls the web page to bring the specified WebElement into view.
	 *
	 * @param element The WebElement to be scrolled into view.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void scrollToElement(WebElement element, WebDriver driver) {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    ((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -150)");
	    boolean isDisplay = isElementDisplayed(element, driver);
	    if (!isDisplay) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -100)");
	    }
	}

	/**
	 * Clicks on the specified WebElement after ensuring its visibility, clickability, and scrolling to it.
	 * If the click fails, it attempts to click using JavaScript.
	 *
	 * @param element The WebElement to click.
	 * @param timeInSecond The time to wait for the element's visibility.
	 * @param message A message describing the action for logging purposes.
	 * @param driver The WebDriver used for interaction.
	 */
	public void click(WebElement element, int timeInSecond, String message, WebDriver driver) {
	    waitTime(5000, driver);
	    waitForElementVisibility(element, Integer.toString(timeInSecond), driver);
	    waitForElementClickable(element, Integer.toString(timeInSecond), driver);
	    scrollToElement(element, driver);
	    try {
	        element.click();
	    } catch (Exception e) {
	        printString("Failed to Click through click method : " + e.toString());
	        printString("Trying to Click through javascript");
	        scrollIntoView(element, driver);
	        clickUsingJavascriptExecutor(element, driver);
	    }
	    printString("Clicked " + message);
	}

	/**
	 * Prints the specified message to the console.
	 *
	 * @param message The message to be printed.
	 */
	public static void printString(String message) {
	    try {
	        System.out.println(message);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Retrieves the value of the specified attribute of a WebElement after ensuring its visibility and scrolling to it.
	 *
	 * @param element The WebElement from which to retrieve the attribute value.
	 * @param attribute The attribute whose value is to be retrieved.
	 * @param driver The WebDriver used for interaction.
	 * @return The value of the specified attribute.
	 */
	public String getElementAttributeValue(WebElement element, String attribute, WebDriver driver) {
	    waitTime(40, driver);
	    waitForElementVisibility(element, Integer.toString(30), driver);
	    scrollToElement(element, driver);
	    return element.getAttribute(attribute);
	}

	/**
	 * Clears the input field of the specified WebElement after ensuring its visibility, scrolling to it, and waiting for the specified time.
	 *
	 * @param element The WebElement representing the input field to be cleared.
	 * @param timeInSecond The time to wait for the element's visibility.
	 * @param message A message describing the action for logging purposes.
	 * @param driver The WebDriver used for interaction.
	 */
	public void clear(WebElement element, int timeInSecond, String message, WebDriver driver) {
	    waitForElementVisibility(element, Integer.toString(timeInSecond), driver);
	    scrollToElement(element, driver);
	    element.clear();
	    printString("Clearing  " + message);
	}

	/**
	 * Generates a random number with the specified number of digits.
	 *
	 * @param number The number of digits in the generated random number.
	 * @param driver The WebDriver used for interaction.
	 * @return The generated random number.
	 */
	public static String generateRandomNumberWithGivenNumberOfDigits(int number, WebDriver driver) {
	    String randomNumber = "123456789";
	    StringBuilder sb = new StringBuilder(number);
	    for (int i = 0; i < number; i++) {
	        int index = (int) (randomNumber.length() * Math.random());
	        sb.append(randomNumber.charAt(index));
	    }
	    return sb.toString();
	}

	/**
	 * Generates a random string with the specified number of characters.
	 *
	 * @param number The number of characters in the generated random string.
	 * @param driver The WebDriver used for interaction.
	 * @return The generated random string.
	 */
	public static String generateRandomStringWithGivenNumberOfDigits(int number, WebDriver driver) {
	    String randomNumber = "qwertyuiopasdfghjklzxcvbnm";
	    StringBuilder sb = new StringBuilder(number);
	    for (int i = 0; i < number; i++) {
	        int index = (int) (randomNumber.length() * Math.random());
	        sb.append(randomNumber.charAt(index));
	    }
	    return sb.toString();
	}

	/**
	 * Clicks on the specified WebElement after ensuring its visibility, clickability, and scrolling to it.
	 * If the click fails, it attempts to click using JavaScript.
	 *
	 * @param element The WebElement to click.
	 * @param timeInSecond The time to wait for the element's visibility.
	 * @param driver The WebDriver used for interaction.
	 */
	public void click(WebElement element, int timeInSecond, WebDriver driver) {
	    waitTime(5000, driver);
	    waitForElementVisibility(element, Integer.toString(timeInSecond), driver);
	    waitForElementClickable(element, Integer.toString(timeInSecond), driver);
	    scrollToElement(element, driver);
	    try {
	        element.click();
	    } catch (Exception e) {
	        printString("Failed to Click through click method : " + e.toString());
	        printString("Trying to Click through javascript");
	        clickUsingJavascriptExecutor(element, driver);
	    }
	}

	/**
	 * Types the specified value into the specified WebElement after ensuring its visibility, clickability, and scrolling to it.
	 *
	 * @param element The WebElement to type into.
	 * @param timeInSecond The time to wait for the element's visibility.
	 * @param value The value to be typed into the element.
	 * @param driver The WebDriver used for interaction.
	 */
	public void type(WebElement element, int timeInSecond, String value, WebDriver driver) {
	    waitForElementVisibility(element, Integer.toString(timeInSecond), driver);
	    waitForElementClickable(element, Integer.toString(timeInSecond), driver);
	    scrollToElement(element, driver);
	    element.clear();
	    element.sendKeys(value);
	}

	/**
	 * Clears the input field of the specified WebElement after ensuring its visibility, scrolling to it, and waiting for the specified time.
	 *
	 * @param element The WebElement representing the input field to be cleared.
	 * @param timeInSecond The time to wait for the element's visibility.
	 * @param driver The WebDriver used for interaction.
	 */
	public void clear(WebElement element, int timeInSecond, WebDriver driver) {
	    waitForElementVisibility(element, Integer.toString(timeInSecond), driver);
	    scrollToElement(element, driver);
	    element.clear();
	}

	/**
	 * Retrieves the text entered in the input field of the specified WebElement after ensuring its visibility and scrolling to it.
	 *
	 * @param element The WebElement from which to retrieve the input text.
	 * @param waitInSeconds The time to wait for the element's visibility.
	 * @param driver The WebDriver used for interaction.
	 * @return The text entered in the input field.
	 */
	public String getInputText(WebElement element, int waitInSeconds, WebDriver driver) {
	    waitTime(waitInSeconds, driver);
	    waitForElementVisibility(element, Integer.toString(waitInSeconds), driver);
	    scrollToElement(element, driver);
	    return element.getAttribute("value");
	}
	/**
	 * Types the specified Keys into the given WebElement after ensuring its visibility,
	 * clickability, and scrolling to it. Also clears the element before entering the keys.
	 *
	 * @param element The WebElement to type keys into.
	 * @param Key The Keys to be typed into the element.
	 * @param driver The WebDriver used for interaction.
	 */
	public void typeKeys(WebElement element, Keys Key, WebDriver driver) {
	    waitForElementVisibility(element, Integer.toString(waitInSeconds), driver);
	    waitForElementClickable(element, Integer.toString(waitInSeconds), driver);
	    scrollToElement(element, driver);
	    element.clear();
	    element.sendKeys(Key);
	}

	/**
	 * Clears the input field of the specified WebElement using the BACK_SPACE key.
	 *
	 * @param element The WebElement representing the input field to be cleared.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void clearField(WebElement element, WebDriver driver) {
	    String inputText = element.getAttribute("value");
	    if (inputText != null) {
	        for (int i = 0; i < inputText.length(); i++) {
	            element.sendKeys(Keys.BACK_SPACE);
	        }
	    }
	}

	/**
	 * Opens the specified URL in a new tab using JavaScript in incognito mode.
	 *
	 * @param driver The WebDriver used for interaction.
	 * @param Url The URL to be opened in another tab.
	 */
	public void openUrlInAnotherTab(WebDriver driver, String Url) {
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("windows.create({'" + Url + "': url, 'incognito': true});");
	}

	/**
	 * Opens the specified URL in a new tab using JavaScript.
	 *
	 * @param driver The WebDriver used for interaction.
	 * @param urlToOpenInNewTab The URL to be opened in a new tab.
	 */
	public void openUrlInNewTab(WebDriver driver, String urlToOpenInNewTab) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.open('" + urlToOpenInNewTab + "');");
	}


}
