package com.medrep.pages;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.node.BooleanNode;
import com.medrep.base.BaseClass;

public class CandidateDashboardPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//a[text()='DASHBOARD '])[last()]"))
	WebElement btnDashboard;

	@FindBy(xpath = ("(//a[contains(text(),'SEARCH JOBS')])[last()]"))
	WebElement tabSearchJobs;

	@FindBy(xpath = "//input[@placeholder='Keyword']")
	WebElement keywordInputField;

	@FindBy(xpath = "//input[@id='job-search-list-form_state']")
	WebElement stateInputField;

	@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
	WebElement stateOption;

	@FindBy(xpath = ("//p[contains(text(),'Apply')]"))
	WebElement labelApply;

	@FindBy(xpath = ("(//button[contains(text(),'Apply Now')])[1]"))
	WebElement btnApplyNow;

	@FindBy(xpath = "//span[@title='All']")
	WebElement cityInputField;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[3]")
	WebElement cityOption;

	@FindBy(xpath = "//button[text()='Find Jobs']")
	WebElement findJobsBtn;

	@FindBy(xpath = "(//div[@class='infinite-scroll-component '])/div")
	List<WebElement> totalJobs;

	@FindBy(xpath = "//tr[contains(@class,'ant-table-row')]")
	List<WebElement> jobsInApplicationHistory;

	@FindBy(xpath = "(//a[text()='View All'])[last()]")
	WebElement viewAllBtnOnApplicationHistory;

	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr")
	List<WebElement> applicationsOnApllicationHistoryViewAll;

	@FindBy(xpath = "//h1[text()='Your Profile']/parent::div//span[text()='Edit']")
	WebElement editProfileBtnOnDashboard;

	@FindBy(xpath = "//input[@placeholder='Enter Postal Code']")
	WebElement postalCode;

	@FindBy(xpath = "//input[@placeholder='Enter Your Last Name']")
	WebElement lastNameInputFieldOnProfile;

	@FindBy(xpath = "//input[@placeholder='Enter Years of Total Experience']")
	WebElement generalExpInputFieldOnProfile;

	@FindBy(xpath = "//input[@placeholder='Enter Years of Medical Sales Experience']")
	WebElement MedExpInputFieldOnProfile;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveBtnOnProfileEditPage;

	@FindBy(xpath = "//*[contains(text(),'Updated')] | //*[contains(text(),'successfully')]")
	WebElement updatedSuccessfullyMessage;

	@FindBy(xpath = "(//button[@aria-label='Close'])[2]/following-sibling::div//p")
	WebElement jobApplySuccessMessagePopup;

	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	WebElement closeBtnOnSuccessMessagePopup;

	@FindBy(xpath = "(//div[contains(@class,'ant-select-selector')])[1]")
	WebElement sortByBtn;

	@FindBy(xpath = "//li//span[contains(text(),'Dashboard')]")
	WebElement dashBoardHeader;

	@FindBy(xpath = "(//div[contains(@class,'ant-select-selector')])[2]")
	WebElement sortByMonthsFilter;

	@FindBy(xpath = "//input[contains(@accept,'.pdf')]")
	WebElement uploadResumeInputBtn;

	@FindBy(xpath = "//button[contains(text(),'Submit Application')]")
	WebElement submitApplicationBtn;

	@FindBy(xpath = "//p[contains(text(),\"You've successfully submitted your application.\")]")
	WebElement successMessage;

	@FindBy(xpath = "(//button[contains(text(),'Apply Now')])[1]")
	WebElement applyNowBtn;

	@FindBy(xpath = ("(//div[@class='flex items-center']/span)[last()]"))
	WebElement profileBtn;

	@FindBy(xpath = ("//span[contains(text(), 'Logout')]"))
	WebElement logoutBtn;

	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	WebElement removeLabelOnResume;

	@FindBy(xpath = "((//div[contains(@class,'listingCard')]))[1]")
	WebElement firstJobInTheList;

	@FindBy(xpath = "//img[@src='/icons/icon-bookmark.svg']")
	WebElement jobSaveBtn;
	
	@FindBy(xpath = "//img[@src='/icons/icon-bookmark.svg']/../../h1 | //img[@src='/icons/icon-bookmark.svg']/../../../h1")
	WebElement jobName;	

	@FindBy(xpath = "//button[text()='Apply Now']/../../../h1")
	WebElement jobTitle;

	@FindBy(xpath = "(//a[text()='View All'])[1]")
	WebElement viewAllBtn;

	@FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[last()]")
	WebElement navigationNextBtn;

	@FindBy(xpath = "//div[contains(text(),'save already applied job')]")
	WebElement Savedtooltip;

	@FindBy(xpath = "(//button[text()='Apply Now'])[last()]")
	WebElement jobApplyNowBtn;

	@FindBy(xpath = "//div[text()='Save job to your Dashboard']")
	WebElement saveJobToYourDashboardTooltip;

	@FindBy(xpath = "(//a[text()='View All'])[1]")
	WebElement yourJobViewAll;

	@FindBy(xpath = "//tbody[@class='ant-table-tbody']")
	WebElement savedJob;

	@FindBy(xpath = "(//a[text()='Unsave'])[last()]")
	WebElement unsaveBtn;
	
	@FindBy(xpath = "(//span[text()='Preview'])[1]")
	WebElement previewBtn;
	
	@FindBy(xpath = "(//span[contains(text(),'.pdf')]/../../../following::span[text()='Preview'])[1]")
	WebElement previewButtonWithCoverlatter;	
	
	@FindBy(xpath = "//span[text()='No cover letter for this job.']")
	WebElement noCoverLetterForThisJobPopup;
	
	@FindBy(xpath = "//p[text()='Cover Letter']")
	WebElement coverLetterForThisJobPopup;	
	
	@FindBy(xpath = "//th[text()='keyword']")
	WebElement keywordSection;
	
	@FindBy(xpath = "//th[text()='Date']")
	WebElement dateSection;
	
	@FindBy(xpath = "//th[text()='Number Of Search Results']")
	WebElement numberOfSearchResultsSection;
	
	@FindBy(xpath = "(//a[text()='View All'])[2]")
	WebElement applicatonHistoryViewAll;
	
	@FindBy(xpath = "//h1[text()='Application History']")
	WebElement applicatonHistoryPage;
	
	@FindBy(xpath = "(//span[text()='Edit'])[last()]")
	WebElement yourAlertEdit;
	
	@FindBy(xpath = "(//button[text()='Update'])[last()]")
	WebElement yourAlertUpdateBtn;
	
	@FindBy(xpath = "(//span[text()='Search saved'])[last()]")
	WebElement searchSavedSuccessfully ;
	
	@FindBy(xpath = "(//span[text()='Run'])[last()]")
	WebElement yourAlertRun;
	
	@FindBy(xpath = "(//h1[text()='GENERAL'])[last()]/..")
	WebElement jobSaveAlert;
	
	@FindBy(xpath = "(//span[text()='Delete'])[last()]")
	WebElement yourAlertDelete;
	
	@FindBy(xpath = "(//span[text()='Deleted'])[last()]")
	WebElement deletedSuccessfullyPopup ;
	
	@FindBy(xpath = "(//span[@title='Weekly'])[last()] | (//span[@title='Daily'])[last()]")
	WebElement yourAlertSelectWeeklyDaily;
	
	@FindBy(xpath = "(//div[@title='Daily'])[last()]")
	WebElement dailyOption;
	
	@FindBy(xpath = "(//div[@title='Weekly'])[last()]")
	WebElement weeklyOption;	
	
	@FindBy(xpath = "(//span[contains(text(),'.pdf')])[1]")
	WebElement resumePdfLink;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']/p")
	WebElement yourCoverLetterTxt;
	
	@FindBy(xpath = "//span[text()='Saved']")
	WebElement yourJobsSectionJobs;
	
	
	
	String getJobTitle;
	String getJobName;
	int sizeBefore;

	public CandidateDashboardPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void Logout(WebDriver driverParam) {
		System.out.println(profileBtn);
		try {
			click(profileBtn, driverParam);
		} catch (Exception e) {
			try {
				clickUsingJavascriptExecutor(profileBtn, driverParam);
			} catch (Exception ex) {
				clickUsingActionClass(profileBtn, driverParam);
			}

		}
		try {
			click(logoutBtn, driverParam);
		} catch (Exception e) {
			try {
				clickUsingJavascriptExecutor(logoutBtn, driverParam);
			} catch (Exception ex) {
				clickUsingActionClass(logoutBtn, driverParam);
			}

		}
	}

	public boolean verifyOnLoginButton(WebDriver driver) {
		waitTime(2000);
		return isElementDisplayed(btnLogin, driver);
	}

	public void clickOnApplyNowButton(WebDriver driver) {
		waitTime(2000, driver);
		scrollIntoViewSmoothly(btnApplyNow, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnApplyNow, "30", driver);
		waitForElementClickable(btnApplyNow, "30", driver);
		click(btnApplyNow, driver);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30", driver);
		waitForElementClickable(btnLogin, "30", driver);
		waitTime(5000);
		click(btnLogin, driver);
		try {
			waitForElementVisibility(btnLogin, "30", driver);
			waitForElementClickable(btnLogin, "30", driver);
			waitTime(5000);
			click(btnLogin, driver);
		} catch (Exception e) {

		}
	}

	public boolean isEmailFieldDisplay(WebDriver driver) {
		return isElementDisplayed(emailAddress, driver);
	}

	public void enterEmailAddress(String email, WebDriver driver) {
		waitForElementVisibility(emailAddress, "30", driver);
		type(emailAddress, email, driver);
	}

	public void enterPassword(String pass, WebDriver driver) {
		waitForElementVisibility(password, "30", driver);
		type(password, pass, driver);
	}

	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementClickable(btnSubmitLogin, "30", driver);
		click(btnSubmitLogin, driver);
	}

	public void clickOnDashboardButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000);
		scrollIntoViewSmoothly(btnDashboard, driver);
		waitForElementClickable(btnDashboard, "30", driver);
		click(btnDashboard, driver);
		waitforPageLoad(50, driver);
	}

	public void clickOnSearchJobsTab(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(tabSearchJobs, defaultWaitTime, driver);
		waitForElementClickable(tabSearchJobs, "30", driver);
		waitTime(3000, driver);
		click(tabSearchJobs, driver);
	}

	public boolean getCurrentUrlAfterClickingDashboardButton(WebDriver driver, String value) {
		waitTime(2000, driver);
		return value.equals(getCurrentUrl(driver));
	}

	public void enterKeyword(String value, WebDriver driver) {
		click(keywordInputField, driver);
//		waitForElementVisibility(keywordInputField,"20",driver);
		type(keywordInputField, 2, value, driver);
	}

	public void enterState(String value, WebDriver driver) {
		WebElement state = driver.findElement(By.xpath(
				"//input[@id='job-search-list-form_state'] | //div[@class='google-place-autocomplete-select__input']/input"));
		try {
			click(state, driver);
		} catch (Exception e) {
			type(state, 2, value, driver);
		}
//		type(stateInputField,2,value,driver);
		WebElement option = driver.findElement(By.xpath("(//div[contains(text(), 'Alabama')])[2]"));
		waitForElementClickable(option, "30", driver);
		click(option, driver);

	}

	public void selectCity(WebDriver driver) {
		waitForElementClickable(cityInputField, "30", driver);
		click(cityInputField, driver);
		String name = "Alexander City";
		WebElement cityName = driver.findElement(By.xpath("//div[contains(@title,'" + name + "')]/div"));
		waitForElementClickable(cityName, "30", driver);
		click(cityName, driver);
	}

	public void clickFindJobsButton(WebDriver driver) {
		waitForElementClickable(findJobsBtn, "30", driver);
		click(findJobsBtn, driver);
	}

	public boolean verifyJobsAreDisplaying(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollDownSlightly(driver);
		waitTime(2000, driver);
		try {
			driver.findElement(By.xpath("//div[contains(text(), 'No Jobs found!')]"));
			return true;
		} catch (Exception e) {
			return (totalJobs.size() > 0);
		}
	}

	public boolean verifyJobsInJobHistoryAreDisplaying(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollDownSlightly(driver);
		waitTime(2000, driver);
		return (jobsInApplicationHistory.size() > 0);
	}

	public void clickOnViewAllButtonOnJobHistory(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(viewAllBtnOnApplicationHistory, "30", driver);
		waitForElementClickable(viewAllBtnOnApplicationHistory, "30", driver);
		click(viewAllBtnOnApplicationHistory, driver);
	}

	public boolean verifyApplicationsInJobHistoryViewAllTabAreDisplaying(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(2000, driver);
		return (applicationsOnApllicationHistoryViewAll.size() > 0);
	}

	public void clickEditProfileBtnOnDashboard(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollToElement(editProfileBtnOnDashboard, driver);
		waitForElementClickable(editProfileBtnOnDashboard, "30", driver);
		click(editProfileBtnOnDashboard, driver);
	}

	public void enterPostalCodeOnProfileEditPage(WebDriver driver) {
		String digits = generateRandomNumberWithGivenNumberOfDigits(5, driver);
		type(postalCode, digits, driver);
	}

	public void enterLastNameOnProfilePage(WebDriver driver) {
		String digit = generateRandomNumberWithGivenNumberOfDigits(8, driver);
		type(lastNameInputFieldOnProfile, digit, driver);
	}

	public void enterGenExpOnProfilePage(WebDriver driver) {
		String digit = "3";
		type(generalExpInputFieldOnProfile, digit, driver);
	}

	public void enterMedExpOnProfilePage(WebDriver driver) {
		String digit = "3";
		type(MedExpInputFieldOnProfile, digit, driver);
	}

	public void clickSaveBtnOnProfileEditPage(WebDriver driver) {
		waitforPageLoad(30, driver);
//		waitForElementClickable(saveBtnOnProfileEditPage, "30", driver);
		click(saveBtnOnProfileEditPage, driver);
	}

	public boolean verifyDataUpdatedSuccessfully(WebDriver driver) {
		waitforPageLoad(30, driver);
		try {
			waitForElementVisibility(updatedSuccessfullyMessage, "30", driver);
			return isElementDisplayed(updatedSuccessfullyMessage, driver);
		} catch (Exception e) {
			return isElementDisplayed(updatedSuccessfullyMessage, driver);
		}
	}

	public boolean verifyDashBoardHeaderIsDisplaying(WebDriver driver) {
		return isElementDisplayed(dashBoardHeader, driver);
	}

	public void clickSortingOnApplicationHistory(String val, WebDriver driver) {
		waitForElementClickable(sortByBtn, "30", driver);
		click(sortByBtn, driver);
		WebElement element = driver.findElement(By.xpath("(//div[contains(text(),'" + val + "')])"));
		waitForElementClickable(element, "30", driver);
		click(element, driver);
	}

	public ArrayList<String> jobTitle(WebDriver driver) {
		ArrayList<String> allTitles = new ArrayList<>();
		List<WebElement> element = driver.findElements(By.xpath(
				"//div[@class='h-8 w-8 bg-cover bg-center bg-no-repeat']/../following-sibling::div[contains(@class,'ml-2')]/p"));
		for (int i = 0; i < element.size(); i++) {
			String title = getElementText(element.get(i), driver);
			allTitles.add(title);
		}
		return allTitles;
	}

	public ArrayList<String> jobLocation(WebDriver driver) {
		ArrayList<String> allLocations = new ArrayList<>();
		List<WebElement> element = driver
				.findElements(By.xpath("//span[contains(@class,'text-last text-location leading-0 ml-1')]"));
		for (int i = 0; i < element.size(); i++) {
			String loc = getElementText(element.get(i), driver);
			allLocations.add(loc);
		}
		return allLocations;
	}

	public ArrayList<String> jobCompany(WebDriver driver) {
		ArrayList<String> allCompanies = new ArrayList<>();
		List<WebElement> element = driver
				.findElements(By.xpath("//th[contains(text(),'Company')]/../../following-sibling::tbody//td[3]/div/p"));
		for (int i = 0; i < element.size(); i++) {
			String comp = getElementText(element.get(i), driver);
			allCompanies.add(comp);
		}
		return allCompanies;
	}

	public ArrayList<String> jobExpiryDate(WebDriver driver) {
		ArrayList<String> allExpiryDates = new ArrayList<>();
		List<WebElement> element = driver.findElements(
				By.xpath("//th[contains(text(),'Expiry date')]/../../following-sibling::tbody//td[4]/div/p"));
		for (int i = 0; i < element.size(); i++) {
			String date = getElementText(element.get(i), driver);
			date = date.replace("th,", "").replace("rd,", "").replace("nd,", "").replace("st,", "");
			allExpiryDates.add(date);
		}
		return allExpiryDates;
	}

	public ArrayList<String> jobAppliedDate(WebDriver driver) {
		ArrayList<String> allExpiryDates = new ArrayList<>();
		List<WebElement> element = driver.findElements(
				By.xpath("//th[contains(text(),'Date Applied')]/../../following-sibling::tbody//td[7]/span"));
		for (int i = 0; i < element.size(); i++) {
			String date = getElementText(element.get(i), driver);
			allExpiryDates.add(date);
		}
		return allExpiryDates;
	}

	public Date getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println(formatter.format(date));
		return date;
	}

	public void clickSortByMonth(String value, WebDriver driver) {
		waitForElementVisibility(sortByMonthsFilter, "30", driver);
		click(sortByMonthsFilter, driver);
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'" + value + "')]"));
		click(element, driver);
	}

	public boolean dateCheckLiesBetween(Date start, Date end, Date dateToCheck) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		Date startDate = start;
		Date endDate = end;
		Date d = dateToCheck;
		String currDt = sdf.format(d);

		if ((d.after(startDate) && (d.before(endDate)))
				|| (currDt.equals(sdf.format(startDate)) || currDt.equals(sdf.format(endDate)))) {
			System.out.println("Date is between " + sdf.format(startDate) + " to " + sdf.format(endDate));
			return true;
		} else {
			System.out.println("Date is not between " + sdf.format(startDate) + " to " + sdf.format(endDate));
			return false;
		}
	}

	public Date getOneMonthOldDate() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String dateValue = formatter.format(Date.from(ZonedDateTime.now().minusMonths(1).toInstant()));
		Date date = formatter.parse(dateValue);
		System.out.println(dateValue);
		return date;
	}

	public Date getThreeMonthOldDate() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String dateValue = formatter.format(Date.from(ZonedDateTime.now().minusMonths(3).toInstant()));
		Date date = formatter.parse(dateValue);
		return date;
	}

	public Date getSixMonthOldDate() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String dateValue = formatter.format(Date.from(ZonedDateTime.now().minusMonths(6).toInstant()));
		Date date = formatter.parse(dateValue);
		return date;
	}

	public boolean verifySortingByDate(String month, WebDriver driver) throws ParseException {
		boolean flag = true;
		if (month == "Last Month") {

			ArrayList<String> AppliedDates = jobAppliedDate(driver);
			for (int i = 0; i < AppliedDates.size(); i++) {
				Date date = new SimpleDateFormat("MM/dd/yyyy").parse(AppliedDates.get(i));
				flag = dateCheckLiesBetween(getOneMonthOldDate(), getCurrentDate(), date);
				if (!flag) {
					break;
				}
			}
		}
		if (month == "Last 3 Months") {
			ArrayList<String> AppliedDates = jobAppliedDate(driver);
			for (int i = 0; i < AppliedDates.size(); i++) {
				Date date = new SimpleDateFormat("MM/dd/yyyy").parse(AppliedDates.get(i));
				flag = dateCheckLiesBetween(getThreeMonthOldDate(), getCurrentDate(), date);
				if (!flag) {
					break;
				}
			}
		}
		if (month == "Last 6 Months") {
			ArrayList<String> AppliedDates = jobAppliedDate(driver);
			for (int i = 0; i < AppliedDates.size(); i++) {
				Date date = new SimpleDateFormat("MM/dd/yyyy").parse(AppliedDates.get(i));
				flag = dateCheckLiesBetween(getSixMonthOldDate(), getCurrentDate(), date);
				if (!flag) {
					break;
				}
			}
		}
		return flag;
	}

	public boolean isApplyLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelApply, driver);
	}

	public void clickOnApplyNowUnderYourJobs(WebDriver driver) {
		waitTime(3000);
		List<WebElement> applyNowBtns = driver.findElements(By.xpath("//a[contains(text(),'Apply Now')]"));
		for (int i = 0; i < applyNowBtns.size(); i++) {
			if (applyNowBtns.get(i) != null) {
				click(applyNowBtns.get(i), driver);
				break;
			} else {
				System.out.println("Apply Now Button not found.");
			}
		}
//		shiftWindowHandle(1, driver);
//		try {
//			WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]"));
//			click(applyBtn, driver);
//		} catch (Exception e) {
//			System.out.println("Hello");
//		}
	}

	public void uploadResumeInput(WebDriver driver) {
		waitTime(2000);
		waitForElementVisibility(submitApplicationBtn, "20", driver);
		scrollIntoViewSmoothly(submitApplicationBtn, driver);
		if (!isElementDisplayed(removeLabelOnResume, driver)) {
			uploadResumeInputBtn
					.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\testResume\\Resume.pdf");
		}
	}

	public void clickSubmitApplicationBtn(WebDriver driver) {
		scrollIntoViewSmoothly(submitApplicationBtn, driver);
		waitForElementClickable(submitApplicationBtn, "30", driver);
		waitTime(2000);
		click(submitApplicationBtn, driver);
	}

	public boolean verifySucessMessageIsDisplaying(WebDriver driver) {
		return isElementDisplayed(successMessage, driver);

	}

	public void clickApplyNowBtn(WebDriver driver) {
		waitTime(2000);
		waitForElementClickable(applyNowBtn, "30", driver);
		click(applyNowBtn, driver);
	}

	public void clickOnViewAllButon(WebDriver driver) {
		waitForElementClickable(viewAllBtn, "90", driver);
		click(viewAllBtn, driver);
	}

	public void clickApplyNowButton(WebDriver driver) {
		int count = 1;
		while (true) {
			if (count == 20) {
				break;
			}
			try {	
				
				WebElement applyNowBtn = driver.findElement(By
						.xpath("(//p[text()='"+getJobTitle+"']/../../../../td/button[text()='Apply Now'])[1]"));
				click(applyNowBtn, driver);
				break;
			} catch (Exception e) {
				
				scrollIntoViewSmoothly(navigationNextBtn, driver);
				if (navigationNextBtn.isEnabled() == false) {
					break;
				} else {
					click(navigationNextBtn, driver);
				}
				// TODO: handle exception
			}
			
//			if (navigationNextBtn.isEnabled() == false) {
//				click(jobApplyNowBtn, driver);
//				break;
//			} else {
//			}
			count++;
		}

	}

	public void verifyApplyNowBtnAndClickOnSaveBtn(WebDriver driver) {
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean flag = false;
		WebElement applied = null;

		do {
			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					scrollIntoViewSmoothly(job, driver);

					if (isElementDisplayed(applyNowBtn, driver)) {

						if (isElementDisplayed(jobSaveBtn, driver)) {

							hoverToElement(jobSaveBtn, driver);

							if (isElementDisplayed(saveJobToYourDashboardTooltip, driver)) {
								getJobTitle = jobName.getText();
								click(jobSaveBtn, driver);
								flag = true;
								break;
							} else {
								click(job, "10", driver);
							}
//						clickUsingJavascriptExecutor(jobSaveBtn, driver);
//						waitTime(4000, driver);
//						getJobTitle = jobTitle.getText();

						} else {
							click(job, "10", driver);
						}
					} else {
						try {
							click(job, "10", driver);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("");
						}
						if (i == n) {
							flag = true;
							break;
						}
					}
				}
			}else {
				flag = true;
				break;
			}
		} while (!flag);
	}

	public void clickYourJobViewAllButton(WebDriver driver) {
		waitTime(2000);
		waitForElementClickable(yourJobViewAll, "30", driver);
		click(yourJobViewAll, driver);
	}
	
	public void clickApplicatonHistoryViewAllButton(WebDriver driver) {
		waitTime(2000);
		click(applicatonHistoryViewAll, driver);
	}
	

	public boolean isSavedJobDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(savedJob, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}

	public void clickOnUnsaveButton(WebDriver driver) {
		waitTime(2000);
		sizeBefore = driver.findElements(By.xpath("//a[text()='Unsave']")).size();
		scrollIntoViewSmoothly(unsaveBtn, driver);
		waitForElementClickable(unsaveBtn, "30", driver);
		click(unsaveBtn, driver);
	}

	public boolean isJobRemovedFromListDisplay(WebDriver driver) {
		boolean status = false;
		int sizeAfter = driver.findElements(By.xpath("//a[text()='Unsave']")).size();
		if (sizeBefore > sizeAfter) {
			return status = true;
		}
		return status;
	}
	
	public void clickOnPreviewButton(WebDriver driver) {
		waitForElementClickable(previewBtn, "30", driver);
		click(previewBtn, driver);
	}
	
	public void clickOnPreviewButtonWithCoverlatter(WebDriver driver) {
		click(previewButtonWithCoverlatter, driver);
	}	
	
	public boolean isNoCoverLetterForThisJobPopupDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(noCoverLetterForThisJobPopup, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isCoverLetterForThisJobPopupDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(coverLetterForThisJobPopup, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isKeywordSectionDisplay(WebDriver driver) {
		try {			
			scrollIntoViewSmoothly(keywordSection, driver);
			return isElementDisplayed(keywordSection, driver);
		} catch (Exception e) {
			return isElementDisplayed(keywordSection, driver);
		}
	}
	
	
	public boolean isDateSectionDisplay(WebDriver driver) {
		try {			
			scrollIntoViewSmoothly(dateSection, driver);
			return isElementDisplayed(dateSection, driver);
		} catch (Exception e) {
			return isElementDisplayed(dateSection, driver);
		}
	}
	
	public boolean isNumberOfSearchResultsSectionDisplay(WebDriver driver) {
		try {			
			scrollIntoViewSmoothly(numberOfSearchResultsSection, driver);
			return isElementDisplayed(numberOfSearchResultsSection, driver);
		} catch (Exception e) {
			return isElementDisplayed(numberOfSearchResultsSection, driver);
		}
	}
	
	public boolean isApplicatonHistoryPageDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(applicatonHistoryPage, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isApplicatonHistorySectionDisplay(WebDriver driver) {
		try {			
			waitForElementVisibility(viewAllBtn, "30", driver);
			scrollIntoViewSmoothly(applicatonHistoryViewAll, driver);
			return isElementDisplayed(applicatonHistoryViewAll, driver);
		} catch (Exception e) {
			return isElementDisplayed(applicatonHistoryViewAll, driver);
		}
	}
	
	public void clickYourAlertEditButton(WebDriver driver) {
		waitForElementVisibility(viewAllBtn, "30", driver);
		click(yourAlertEdit, driver);
	}
	
	public void clickYourAlertUpdateButton(WebDriver driver) {
		waitForElementVisibility(yourAlertUpdateBtn, "30", driver);
		click(yourAlertUpdateBtn, driver);
	}
	
	public boolean isSearchSavedSuccessfullyPopupDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(searchSavedSuccessfully, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickYourAlertRunButton(WebDriver driver) {
		waitForElementVisibility(viewAllBtn, "30", driver);
		click(yourAlertRun, driver);
	}
	
	public boolean isJobSaveAlertDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(jobSaveAlert, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickYourAlertDeleteButton(WebDriver driver) {
		waitForElementVisibility(viewAllBtn, "30", driver);
		click(yourAlertDelete, driver);
	}
	
	public boolean isSaveJobDeletedSuccessfullyPopupDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(deletedSuccessfullyPopup, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public void selectWeeklyDailyDropdown(WebDriver driver) {
		waitForElementVisibility(viewAllBtn, "30", driver);
		click(yourAlertSelectWeeklyDaily, driver);
	}
	
	public boolean isWeeklyAndDailyOptionDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(dailyOption, "30", driver);
			waitForElementVisibility(weeklyOption, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickOnApplicatonHistoryViewAll(WebDriver driver) {
		waitForElementVisibility(viewAllBtn, "30", driver);
		click(applicatonHistoryViewAll, driver);
	}
	
	public void clickOnResumePdfLink(WebDriver driver) {
		waitForElementVisibility(resumePdfLink, "30", driver);
		click(resumePdfLink, driver);
	}
	
	public void enterTextInYourCoverLetter(WebDriver driver) {
		String text = generateRandomStringWithGivenNumberOfDigits(8, driver);
		type(yourCoverLetterTxt, text, driver);
	}
	
	public boolean lenghtOfSuggestedJobsinYourJobsSection(WebDriver driver) {
		boolean status = false;
			List<WebElement> myElements = driver.findElements(By.xpath("//span[text()='Suggested']"));
			int size = myElements.size();
			if(size == 3) {
				status = true;
			}else if(size == 2) {
				status = true ; 
			}else if(size == 1) {
				status = true;
			}
			return status;		
	}
	
	
}
