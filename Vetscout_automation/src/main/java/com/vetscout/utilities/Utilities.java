package com.vetscout.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.common.collect.Comparators;
import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import java.util.Comparator;

public class Utilities extends BaseClass {

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "/target/surefire-reports/html/" + screenshotName));

	}

//	public static String captureWebScreenShot(WebDriver driver, String fileName) throws IOException {
//		String destinationPath = null;
//		String filePath = null;
//		try {
//			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//			File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
//			BasicFileReporter reporter = (BasicFileReporter) ExtentTestManager.getTest().getExtent().getStartedReporters().get(0);
//			File report = reporter.getFileFile();
//			String folder = report.getParent();
//			filePath = "screenshot/" + fileName + System.currentTimeMillis() + ".png";
//			destinationPath = folder + File.separator +  "screenshot/" + fileName + System.currentTimeMillis() + ".png";
//			File destination = new File(destinationPath);
//			destinationPath = destination.getAbsolutePath();
//			FileUtils.copyFile(src, destination);
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
//		return filePath;
//	}
//	
//	public static void attachWebScreenShotToReport( String fileName) {
//		try {
//			String imagePath = captureWebScreenShot(getDriver(), fileName);
//			ErrorCollector.extentScreenshot(imagePath,"Screen Capture");
//		} catch (Exception e) {
//		System.out.print(e.toString());
//		}
//
//	}
//	
	private static Credential authorize() throws Exception {
		String credentialLocation = System.getProperty("user.dir") + "/src/test/resources/config/credentials.json";

		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JacksonFactory.getDefaultInstance(),
				new FileReader(credentialLocation));

		List<String> scopes = Arrays.asList(SheetsScopes.SPREADSHEETS);

		GoogleAuthorizationCodeFlow googleAuthorizationCodeFlow = new GoogleAuthorizationCodeFlow.Builder(
				GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory.getDefaultInstance(), clientSecrets,
				scopes)
				.setDataStoreFactory(new FileDataStoreFactory(
						new File(System.getProperty("user.dir") + "/src/test/resources/data/")))
				.setAccessType("offline").build();

		return new AuthorizationCodeInstalledApp(googleAuthorizationCodeFlow, new LocalServerReceiver())
				.authorize("user");
	}

	public static String[][] getData(String spreadSheetId, String sheetName, String rangeDataToRead) throws Exception {
		Sheets sheet = new Sheets(GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory.getDefaultInstance(),
				authorize());

		List<List<Object>> data = sheet.spreadsheets().values().get(spreadSheetId, rangeDataToRead).execute()
				.getValues();
		Sheets.Spreadsheets.Get request = sheet.spreadsheets().get(spreadSheetId);
		Spreadsheet response = request.execute();
		Sheet reqSheet = response.getSheets().get(0);
		System.out.print(reqSheet.getData().get(0).getRowData().get(0));
		printString("Response");
		System.out.print(response);
		printString("Response");

		return convertToArray(data);
	}

	private static String[][] convertToArray(List<List<Object>> data) {
		String[][] array = new String[data.size()][];

		int i = 0;
		for (List<Object> row : data) {
			array[i++] = row.toArray(new String[row.size()]);
		}
		return array;
	}

	/*
	 * @DataProvider(name="dp") public Object[][] getData(Method m) {
	 * 
	 * String sheetName = m.getName(); int rows = excel.getRowCount(sheetName); int
	 * cols = excel.getColumnCount(sheetName);
	 * 
	 * Object[][] data = new Object[rows - 1][1];
	 * 
	 * Hashtable<String,String> table = null;
	 * 
	 * for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
	 * 
	 * table = new Hashtable<String,String>();
	 * 
	 * for (int colNum = 0; colNum < cols; colNum++) {
	 * 
	 * // data[0][0] table.put(excel.getCellData(sheetName, colNum, 1),
	 * excel.getCellData(sheetName, colNum, rowNum)); data[rowNum - 2][0] = table; }
	 * 
	 * }
	 * 
	 * return data;
	 * 
	 * }
	 */

	public static String removeDollarandSpaces(String amount) {

		printString("Amount :  " + amount);
		if (amount.contains("$")) {
			amount = amount.replace("$", "").trim();
			printString("Remove Dollar :  " + amount);
		}
		if (amount.contains(",")) {
			amount = amount.replace(",", "").trim();
			printString("Remove Dollar :  " + amount);
		}

		return amount.trim();
	}

	public static String getDate(int days, String Format, String Time_Zone) throws ParseException {

		DateFormat dateFormat = new SimpleDateFormat(Format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
		Date date = new Date();
		String DF = dateFormat.format(date);

		Calendar c = Calendar.getInstance();
		c.setTime(dateFormat.parse(DF));
		c.add(Calendar.DATE, days);
		String formattedDate = dateFormat.format(c.getTime());

		printString("date : " + formattedDate);
		return formattedDate;

	}

	public static ArrayList<String> getDateList(int maxdays, String Format, String Time_Zone) throws ParseException {
		ArrayList<String> dates = new ArrayList<>();
		for (int i = 0; i <= maxdays; i++) {
			DateFormat dateFormat = new SimpleDateFormat(Format);
			dateFormat.setTimeZone(TimeZone.getTimeZone(Time_Zone));
			Date date = new Date();
			String DF = dateFormat.format(date);
			Calendar c = Calendar.getInstance();
			c.setTime(dateFormat.parse(DF));
			c.add(Calendar.DATE, i);
			String formattedDate = dateFormat.format(c.getTime());
			dates.add(formattedDate);
		}
		return dates;
	}

	/*
	 * 
	 * ' Method Name: <reformatDate> ' Description: <This static method will take
	 * date and its format. then it changes date to required format.> ' Input
	 * parameters: <String DateToFormat, String PreFormat, String PostFormat> '
	 * Return value: <String> ' Created By: <Abu Bakar> ' Created On: <31/01/2022>
	 * 
	 */

	public static String reformatDate(String DateToFormat, String preFormat, String postFormat) throws ParseException {
		DateFormat srcDf = new SimpleDateFormat(preFormat);

		// parse the date string into Date object
		Date date = srcDf.parse(DateToFormat);

		DateFormat destDf = new SimpleDateFormat(postFormat);

		// format the date into another format
		DateToFormat = destDf.format(date);

		return DateToFormat;
	}

//	public static String getElementText(WebElement element, WebDriver driver) {
//		waitForElementVisibility(element, "10", driver);
//		return element.getText().trim();
//	}

	public ArrayList<String> getSortedDate(ArrayList<String> dates) {


		Collections.sort(dates, new Comparator<String>() {
	        DateFormat f = new SimpleDateFormat("dd/MMM/yyyy");
	        @Override
	        public int compare(String o1, String o2) {
	            try {
	                return f.parse(o1).compareTo(f.parse(o2));
	            } catch (Exception e) {
	                throw new IllegalArgumentException(e);
	            }
	        }
	    });
		return dates;
	}

}
