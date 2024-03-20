package com.medrep.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateJobSearchPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
	WebElement medrepLogo;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("//button[contains(@class,'dropdown')]"))
	WebElement btnProfileDropdown;

	@FindBy(xpath = ("(//a[contains(text(),'SEARCH JOBS')])[last()]"))
	WebElement tabSearchJobs;

	@FindBy(xpath = ("//span[contains(text(),'Create Alert')]"))
	WebElement btnCreateAlert;

	@FindBy(xpath = ("//span[contains(text(),'Please use search filters to create alert')]"))
	WebElement warningMessageCreateAlert;

	@FindBy(xpath = ("//p[contains(text(),'Category')]/../.."))
	WebElement btnCategoryDropdown;

	@FindBy(xpath = ("//p[contains(text(),'Primary Function')]/../.."))
	WebElement btnPrimaryFunctionDropdown;

	@FindBy(xpath = ("(//label[contains(@class,'dropdown-item')])"))
	List<WebElement> listOfCheckboxs;

	@FindBy(xpath = "(//label[contains(@class,'dropdown-item')])//span[2]")
	List<WebElement> listOfPrimaryFunction;

	@FindBy(xpath = ("//p[contains(text(),'Create Job Alert')]"))
	WebElement headingCreateJobAlert;

	@FindBy(xpath = ("//button[contains(text(),'Cancel')]"))
	WebElement btnCancel;

	@FindBy(xpath = ("//a[contains(text(),'Terms and Conditions')]"))
	WebElement linkOfTermAndCondition;

	@FindBy(xpath = ("(//h1[contains(text(),'Privacy Policy')])[1]"))
	WebElement pageHeadingPrivacyPolicy;

	@FindBy(xpath = ("//span[contains(text(),'Search Jobs')]"))
	WebElement pageHeadingSearchJobs;

	@FindBy(xpath = ("(//div[contains(@class,'listingCard')])[1]//div//p"))
	WebElement firstJobName;

	@FindBy(xpath = ("//div[contains(@class,'listingCard')]"))
	List<WebElement> listOfJobs;

	@FindBy(xpath = ("//input[@id='job-search-list-form_title']"))
	WebElement keywordInput;

	@FindBy(xpath = ("//button[contains(text(),'Find Jobs')]"))
	WebElement btnFindJobs;

	@FindBy(xpath = ("//b[contains(text(),'You have seen it all.')]"))
	WebElement messageYouHaveSeenItAll;

	@FindBy(xpath = ("(//div[@id='educationHistory_frequency']//label)[1]"))
	WebElement dailyRadioButton;

	@FindBy(xpath = ("(//div[@id='educationHistory_frequency']//label)[1]//input"))
	WebElement checkDailyRadioButton;

	@FindBy(xpath = ("(//div[@id='educationHistory_frequency']//label)[2]"))
	WebElement weeklyRadioButton;

	@FindBy(xpath = ("(//div[@id='educationHistory_frequency']//label)[2]//input"))
	WebElement checkWeeklyRadioButton;

	@FindBy(xpath = ("//div[text()='Location']/.././/div/input"))
	WebElement stateDropdown;

	@FindBy(xpath = ("//div[contains(@class,'list-holder-inner')]/div"))
	List<WebElement> dropdownOptions;
	
	@FindBy(xpath = ("//div[text()='No options']"))
	WebElement dropdownOptions_2;

	@FindBy(xpath = ("//div[contains(text(),'All')]/.."))
	WebElement optionAll;

	@FindBy(xpath = ("//input[@id='job-search-list-form_city']/..//following-sibling::span"))
	WebElement cityInputField;

	@FindBy(xpath = ("//input[@id='job-search-list-form_state']/..//following-sibling::span"))
	WebElement stateInputField;

	@FindBy(xpath = ("//input[@id='job-search-list-form_state']"))
	WebElement stateInput;

	@FindBy(xpath = ("//input[@id='job-search-list-form_city']/../../.."))
	WebElement cityDropdown;
	@FindBy(xpath = ("(//div[contains(@class,'list-holder-inner')]/div)[2]"))
	WebElement cityDropdownOption2;

	@FindBy(xpath = ("(//div[contains(@class,'listingCard')])[1]"))
	WebElement firstJob;

	@FindBy(xpath = ("(//button[contains(text(),'Apply Now')])[1]"))
	WebElement btnApplyNow;

	@FindBy(xpath = ("(//button[contains(text(),'Apply Now')])[2]"))
	WebElement btnApplyNowUnderDescription;

	@FindBy(xpath = ("//p[contains(text(),'Apply')]"))
	WebElement labelApply;

	@FindBy(xpath = ("//p[contains(text(),'Attach a New Resume')]/..//input"))
	WebElement resumeInput;

	@FindBy(xpath = ("//button[contains(text(),'Submit Application')]"))
	WebElement btnSubmitApplication;

	@FindBy(xpath = ("//p[contains(text(),'successfully submitted your application')]"))
	WebElement popupSuccessfullySubmittedYourApplication;

	@FindBy(xpath = "//p[contains(text(),'successfully submitted your application')]/../div/img")
	WebElement cancelBtn;

	@FindBy(xpath = ("(//span[contains(text(),'Applied')])[1]"))
	WebElement labelApplied;

	@FindBy(xpath = ("//p[contains(text(),'Attach a New Resume')]/..//div//p"))
	WebElement resumeName;

	@FindBy(xpath = ("//p[contains(text(),'Attach a New Resume')]/..//div//p//span"))
	WebElement btnRemove;

	@FindBy(xpath = ("//span[contains(text(),'Upload Resume')]"))
	WebElement labelUploadResume;

	@FindBy(xpath = ("//span[contains(text(),'View More')]"))
	WebElement btnViewMore;

	@FindBy(xpath = ("//span[contains(text(),'View Less')]"))
	WebElement btnViewLess;

	@FindBy(xpath = ("//span[contains(text(),'Please attach a resume.')]"))
	WebElement popupMessagePleaseAttachAResume;

	@FindBy(xpath = ("//div[contains(text(),'Years of Experience')]"))
	WebElement minusIconOfYearsOfExperience;

	@FindBy(xpath = ("//div[contains(@role,'tabpanel')]"))
	WebElement tabPanel;

	@FindBy(xpath = ("//div[contains(text(),'Annual Salary')]"))
	WebElement plusIconOfAnnualSalary;

	@FindBy(xpath = ("//div[contains(text(),'Annual Salary')]"))
	WebElement minusIconOfAnnualSalary;

	@FindBy(xpath = ("//p[contains(text(),'$40,000')]"))
	WebElement labelFortyThousandDollar;

	@FindBy(xpath = "//h1[contains(text(),'Medical Sales Jobs')]")
	WebElement medicalSalesJobs;

	@FindBy(xpath = "(//div[@class='infinite-scroll-component ']/div)[2]")
	WebElement firstJobOnPage;

	@FindBy(xpath = "//h1[text()='GENERAL']")
	WebElement generalTextOnJD;

	@FindBy(xpath = "//h1[text()='COMPENSATION']")
	WebElement compensationTextOnJD;

	@FindBy(xpath = "//img[@src='/icons/icon-bookmark.svg']")
	WebElement saveBtn;

	@FindBy(xpath = "//span[text()='Saved']/..")
	WebElement savedBtn;

	@FindBy(xpath = "//span[contains(text(),'Applied')]")
	WebElement appliedLbl;

	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	WebElement removeTagOnResumeSection;

	@FindBy(xpath = "//div[contains(text(),'Education Level')]//img")
	WebElement IconInfrontOfEducationLevel;

	@FindBy(xpath = "//div[contains(text(),'Education Level')]/../div[2]")
	WebElement graphUnderEducationLavel;

	@FindBy(xpath = "//span[contains(text(),'Job saved')] | //span[contains(text(),'Job saved successfully.')]")
	WebElement jobSavedSuccessMsg;
	
	@FindBy(xpath = "//span[text()[contains(.,'Job unsaved')]]")
	WebElement jobUnsavedMshOnPopup;
	
	@FindBy(xpath = "//div[contains(@class,'infinite-scroll-component ')]")
	WebElement list_area_jobs;
	
	@FindBy(xpath = "//*[contains(text(),'Candidates are redirected to your URL to apply.')]")
	WebElement redirectingMessage;

	@FindBy(xpath = "//span[text()='Select All']")
	WebElement primaryFunctionSelectAlloption;
	
	@FindBy(xpath = "//span[@class=\"ant-checkbox\"]/../span[text()='Business Development']")
	WebElement primaryFunctionBusinessDevelopmentOption;
	
	@FindBy(xpath = "((//label[contains(@class,'dropdown-item')])//span[2])[3]")
	WebElement primaryFunctionClinicalConsultingOption;
	
	@FindBy(xpath = "//span[text()='Independent Representative']")
	WebElement primaryFunctionIndependentRepresentativeOption;
	
	@FindBy(xpath = "//span[text()='Marketing']")
	WebElement primaryFunctionMarketingOption;
	
	@FindBy(xpath = "//span[text()='Account Management']")
	WebElement primaryFunctionAccountManagementOption;
	
	@FindBy(xpath = "//span[text()='Sales Management']")
	WebElement primaryFunctionSalesManagementOption;
	
	@FindBy(xpath = "//span[text()='Service Technician']")
	WebElement primaryFunctionServiceTechnicianOption;
	
	@FindBy(xpath = "//span[text()='Sales Support']")
	WebElement primaryFunctionSalesSupportOption;	
	
	@FindBy(xpath = "//span[text()='Other']")
	WebElement primaryFunctionOtherOption;
	
	@FindBy(xpath = "//p[text()='Average Total Compensation']")
	WebElement averageTotalCompensationDropdown;
	
	@FindBy(xpath = "//p[text()='Average Total Compensation']")
	WebElement averageTotalCompensation;
	
	@FindBy(xpath = "//div[@class='ant-slider ant-slider-horizontal']")
	WebElement averageTotalRangeSlider;
	
	@FindBy(xpath = "//p[text()='Industry']")
	WebElement industryDropdown;	
	
	@FindBy(xpath = "//input[@placeholder='Keyword']")
	WebElement keywordTxt;
	
	@FindBy(xpath = ("//div[@class='google-place-autocomplete-select__input']//input"))
	WebElement locationDropdown;
	
	@FindBy(xpath = ("//span[text()='Salary + Commission']"))
	WebElement salaryCommissionCheckbox;
	
	@FindBy(xpath = ("//span[text()='Commission Only']"))
	WebElement commissionOnlyCheckbox;
	
	@FindBy(xpath = ("//span[text()='Salary Only']"))
	WebElement salaryOnlyCheckbox;
	
	@FindBy(xpath = ("//span[text()='Not Specified']"))
	WebElement notSpecifiedCheckbox;
	
	@FindBy(xpath = ("//p[text()='Travel Percentage']"))
	WebElement travelPercentageDropdown;
	
	@FindBy(xpath = ("//p[text()='Industry']"))
	WebElement industryCheckbox;
	
	@FindBy(xpath = ("//div[@class='ant-message-custom-content ant-message-info'] | //span[text()='Please use search filters to create alert']"))
	WebElement alretWarningMsg;
	
	@FindBy(xpath = ("//span[text()='Create Alert']"))
	WebElement createAlertBtn;
	
	@FindBy(xpath = ("//span[text()='Select All']"))
	WebElement selectAllOption;
	
	@FindBy(xpath = ("//span[text()='0-25%']"))
	WebElement option0_25Percent;
	
	@FindBy(xpath = ("//span[text()='25-50%']"))
	WebElement option25_50Percent;
	
	@FindBy(xpath = ("//span[text()='50-75%']"))
	WebElement option50_75Percent;
	
	@FindBy(xpath = ("//span[text()='75-100%']"))
	WebElement option75_100Percent;
	
	@FindBy(xpath = ("//button[text()='Create Alert']"))
	WebElement createAlertBtnOnPopup;
	
	@FindBy(xpath = ("//p[text()='Salary Only']"))
	WebElement salaryOnlyJobs;
	
	@FindBy(xpath = ("//input[@placeholder='Search Name']"))
	WebElement searchNameTxt;
	
	@FindBy(xpath = ("//span[text()='Search saved']/.."))
	WebElement searchSavedPopup;
	
	@FindBy(xpath = "(//button[text()='Apply Now'])[last()]")
	WebElement jobApplyNowBtn;
	
	@FindBy(xpath = "//div[text()='Save job to your Dashboard']")
	WebElement saveJobToYourDashboardTooltip;
	
	@FindBy(xpath = "((//div[contains(@class,'listingCard')]))[1]")
	WebElement firstJobInTheList;	
	
	@FindBy(xpath = "(//button[contains(text(),'Apply Now')])[1]")
	WebElement applyNowBtn;
	
	@FindBy(xpath = "//img[@src='/icons/icon-bookmark.svg']")
	WebElement jobSaveBtn;	
	
	@FindBy(xpath = "(//div[@class='flex items-center']/div/p)[1]")
	WebElement jobTitle;
	
	@FindBy(xpath = "//h1[text()='General Information']/..")
	WebElement generalInformationAboutJob;
	
	@FindBy(xpath = "//h1[text()='Job Description']/..")
	WebElement jobDescription;
	
	@FindBy(xpath = "//h1[text()='Compensation Information']/..")
	WebElement compensationInformation;
	
	@FindBy(xpath = "//h1[text()='Company Information']/..")
	WebElement companyInformation;
	
	@FindBy(xpath = "(//button[text()='Apply Now'])[1]")
	WebElement applyNowBtnOnTop;
	
	@FindBy(xpath = "(//button[text()='Apply Now'])[2]")
	WebElement applyNowBtnOnBottom;
	
	@FindBy(xpath = "//h1[text()='More Jobs From This Company']/../../div[last()]")
	WebElement moreJobsFromThisCompany;
	
	@FindBy(xpath = "//img[@src='/icons/icon-printer.svg']")
	WebElement printerJobBtn;
	
	@FindBy(xpath = "//h1[text()='See how you compare']/../..")
	WebElement seeHowYouCompareSection;
	
	@FindBy(xpath = "//span[text()='Upload Resume']")
	WebElement uploadResumeLbl;
	
	@FindBy(xpath = "//h1[text()='See how you compare']/../p")
	WebElement membersAppliedToThisJob;
	
	@FindBy(xpath = "//div[text()='Years of Experience']")
	WebElement yearsOfExperienceLbl;
	
	@FindBy(xpath = "//div[text()='Annual Salary']")
	WebElement annualSalaryLbl;
	
	@FindBy(xpath = "//div[text()='Education Level']")
	WebElement educationLevelLbl;
	
	@FindBy(xpath = "//span[@class='text-voyage']")
	WebElement totalCountOfJob;
	
	@FindBy(xpath = "(//a[text()='View All'])[last()]")
	WebElement viewAllBtnOnApplicationHistory;
	
	@FindBy(xpath = "//span[text()='Compensation Type']/../p[text()='Salary + Commission']")
	WebElement compensationSalaryCommission;	
	
	@FindBy(xpath = "//p[text()='Commission Only']")
	WebElement compensationCommissionOnly;
	
	@FindBy(xpath = "//p[text()='Salary Only']")
	WebElement compensationSalaryOnly;
	
	@FindBy(xpath = "//p[text()='Not Specified']")
	WebElement compensationSNotSpecified;
	
	@FindBy(xpath = "//div[text()='No Jobs found!']")
	WebElement noJobsFound;	
	
	@FindBy(xpath = "(//span[contains(text(),'Remote')])[1]")
	WebElement remoteCheckbox;	
	
	@FindBy(xpath = "//span[contains(text(),'Function')]/following-sibling::p[text()='Business Development']")
	WebElement functionBusinessDevelopment;
	
	@FindBy(xpath = "//span[contains(text(),'Travel Percentage')]/following-sibling::p[text()='0-25%']")
	WebElement travelPercentage0_25Percent;	
	
	@FindBy(xpath = "(//span[text()='Biotechnology'])[2]")
	WebElement biotechnologyOption;	
	
	@FindBy(xpath = "//span[contains(text(),'Industry')]/following-sibling::p[text()='Biotechnology']")
	WebElement industryBiotechnology;	
	
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement resetBtn;
	
	@FindBy(xpath = "//input[contains(@id,\"react-select\")]")
	WebElement locationSearchTxt;
	
	@FindBy(xpath = "(//p[contains(text(),'USA')])[1] | (//p[contains(text(),'United States')])[1]")
	WebElement locationUnitedStates;
	
	@FindBy(xpath = "(//input[@class='ant-input-number-input'])[last()]")
	WebElement inputK;
	
	@FindBy(xpath = "//span[text()='Avg. Total Comp']/..//p[text()='10'] | //span[text()='Avg. Total Comp']/..//p[text()='0'] | //span[text()='Avg. Total Comp']/..//p[text()='5']")
	WebElement avgTotalComp;
	
		
		
	public CandidateJobSearchPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public boolean isMedrepLogoDisplay(WebDriver driver) {
		waitForElementVisibility(medrepLogo, "30", driver);
		return isElementDisplayed(medrepLogo, driver);
	}

	public boolean verifyJobSavedSuccessMsg(WebDriver driver) {
		return isElementDisplayed(jobSavedSuccessMsg, driver);
	}
	
	public boolean verifyJobUnSavedSuccessMsg(WebDriver driver) {
		return isElementDisplayed(jobUnsavedMshOnPopup, driver);
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
		waitForElementVisibility(emailAddress, "30", driver);
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
		waitForElementVisibility(btnSubmitLogin, "30", driver);
		waitForElementClickable(btnSubmitLogin, "30", driver);
		click(btnSubmitLogin, driver);
		waitForElementVisibility(viewAllBtnOnApplicationHistory, "100", driver);
	}

	public void clickOnSearchJobsTab(WebDriver driver) {
		waitTime(4000, driver);
		waitforPageLoad(30, driver);
		waitForElementVisibility(tabSearchJobs, "90", driver);
		waitForElementClickable(tabSearchJobs, "30", driver);
		waitTime(3000, driver);
		click(tabSearchJobs, driver);
		waitforPageLoad(30, driver);
		waitTime(3000, driver);
		waitForElementVisibility(firstJobInTheList, "100", driver);

	}

	public void clickOnCreateAlertButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnCreateAlert, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnCreateAlert, "30", driver);
		waitForElementClickable(btnCreateAlert, "30", driver);
		click(btnCreateAlert, driver);
	}

	public boolean isCreateAlertWarningMessageDisplay(WebDriver driver) {
		waitForElementVisibility(warningMessageCreateAlert, "30", driver);
		return isElementDisplayed(warningMessageCreateAlert, driver);
	}

	public void clickOnCategoryDropdownButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnCategoryDropdown, driver);
		waitForElementClickable(btnCategoryDropdown, "30", driver);
		click(btnCategoryDropdown, driver);
	}

	public void clickOnPrimaryFunctionDropdownButton(WebDriver driver) {
		waitForElementVisibility(btnPrimaryFunctionDropdown, defaultWaitTime, driver);
		click(btnPrimaryFunctionDropdown, driver);
	}

	public void checkDropdownCheckbox(WebDriver driver) {
		waitTime(2000, driver);
		WebElement checkbox = driver.findElement(By.xpath("(//label[contains(@class,'dropdown-item')])[2]"));
		waitForElementClickable(checkbox, "30", driver);
		click(checkbox, "20", driver);
	}

	public boolean isCreateJobAlertPopupDisplay(WebDriver driver) {
		waitForElementVisibility(headingCreateJobAlert, "30", driver);
		return isElementDisplayed(headingCreateJobAlert, driver);
	}

	public void clickOnCancelButton(WebDriver driver) {
		waitTime(2000, driver);
		scrollIntoViewSmoothly(btnCancel, driver);
		waitForElementVisibility(btnCancel, "30", driver);
		waitForElementClickable(btnCancel, "30", driver);
		click(btnCancel, driver);
	}

	public boolean isCreateJobAlertPopupClose(WebDriver driver) {
		waitTime(2000, driver);
		return isElementDisplayed(btnCancel, driver);
	}

	public void clickOnTermsAndConditionLink(WebDriver driver) {
		waitForElementVisibility(linkOfTermAndCondition, "30", driver);
		waitForElementClickable(linkOfTermAndCondition, "30", driver);
		click(linkOfTermAndCondition, driver);
	}

	public boolean isPageHeadingPrivacyPolicyDisplay(WebDriver driver) {
		waitForElementVisibility(pageHeadingPrivacyPolicy, "30", driver);
		return isElementDisplayed(pageHeadingPrivacyPolicy, driver);
	}

	public boolean isPageHeadingSearchJobsDisplay(WebDriver driver) {
		waitForElementVisibility(pageHeadingSearchJobs, "30", driver);
		return isElementDisplayed(pageHeadingSearchJobs, driver);
	}

	public Integer getListOfJobs(WebDriver driver) {
		return listOfJobs.size();
	}

	public boolean getJobName(String value, WebDriver driver) {
		scrollIntoViewSmoothly(driver.findElement(By.xpath("(//div[contains(@class,'listingCard')])[1]//div//p")), driver);
		waitTime(2000, driver);
//		if (value == "SQA Engineer for fresh students"){
//				value = "SQA Engineer for fresh stud...";
//		}
		String JobName = getElementText(firstJobName, driver);
		return JobName.toLowerCase().contains(value.toLowerCase());
	}
	
	public String getJobName(WebDriver driver) {
		

		String JobName = getElementText(firstJobName, driver);
		return JobName;
	}

	public void enterSearchJobKeyword(String jobName, WebDriver driver) {
		scrollIntoViewSmoothly(keywordInput, driver);
		waitTime(2000, driver);
		type(keywordInput, jobName, driver);
	}

	public boolean isYouHaveSeenItAllMessageDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(messageYouHaveSeenItAll, driver);
		waitTime(2000, driver);
		return isElementDisplayed(messageYouHaveSeenItAll, driver);
	}

	public void selectDailyRadioButton(WebDriver driver) {
		waitForElementClickable(dailyRadioButton, "30", driver);
		click(dailyRadioButton, driver);
	}

	public boolean isDailyRadioButtonSelected(WebDriver driver) {
		return isElementSelected(checkDailyRadioButton, driver);
	}

	public void selectWeeklyRadioButton(WebDriver driver) {
		waitForElementClickable(weeklyRadioButton, "30", driver);
		click(weeklyRadioButton, driver);
	}

	public boolean isWeeklyRadioButtonSelected(WebDriver driver) {
		return isElementSelected(checkWeeklyRadioButton, driver);
	}

	public void clickOnStateDropdown(WebDriver driver) {
		waitForElementVisibility(stateDropdown, defaultWaitTime, driver);
		waitForElementClickable(stateDropdown, "30", driver);
		click(stateDropdown, driver);
	}
	
	public void enterStateDropdown(WebDriver driver) {
		waitForElementVisibility(stateDropdown, defaultWaitTime, driver);
		String text = "a";
		type(stateDropdown, text, driver);
	}

	public boolean isListOfStateDropdownOptionsDisplay(WebDriver driver) {
		return dropdownOptions.size() > 0;
	}
	
	public boolean isStateDropdownOptionsDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(dropdownOptions_2, defaultWaitTime, driver);
			return false;
		} catch (Exception e) {
			return true;
		}
		
	}	

	public void selectAllOption(WebDriver driver) {
		waitForElementClickable(optionAll, "30", driver);
		click(optionAll, driver);
	}

	public String getCityInputFieldValue(WebDriver driver) {
		return getElementText(cityInputField, driver);
	}

	public String getStateInputFieldValue(WebDriver driver) {
		return getElementText(stateDropdown, driver);
	}

	public String getCityDropdownValue(WebDriver driver) {
		return getElementAttributeValue(cityDropdown, "class", driver);
	}

	public boolean isCityDropdownFieldEnable(WebDriver driver) {
		return isElementEnabled(cityDropdown, driver);
	}

	public void selectDropdownOption(WebDriver driver) {
		int randomNumber = ThreadLocalRandom.current().nextInt(2, 8);
		WebElement findElement = driver
				.findElement(By.xpath("(//div[contains(@class,'list-holder-inner')]/div)[" + randomNumber + "]"));
		String option = getElementAttribute(findElement, "title", driver);
		scrollUp(driver);
		waitTime(2000, driver);
		click(findElement, driver);
//		type(stateInput, option,driver);	
//		stateInput.sendKeys(Keys.DOWN);
//		stateInput.sendKeys(Keys.ENTER);
	}

	public void clickOnCityDropdownOption2(WebDriver driver) {
		waitForElementVisibility(cityDropdownOption2, "30", driver);
		waitForElementClickable(cityDropdownOption2, "30", driver);
		click(cityDropdownOption2, driver);

	}

	public void clickOnCityDropdown(WebDriver driver) {
		waitForElementVisibility(cityDropdown, "30", driver);
		waitForElementClickable(cityDropdown, "30", driver);
		click(cityDropdown, driver);

	}

	public boolean isListOfCityDropdownOptionsDisplay(WebDriver driver) {
		return dropdownOptions.size() > 0;
	}

	public void clickOnJob(WebDriver driver) {

		for (int i = 2; i < 20; i++) {
			waitTime(20000, driver);
			WebElement job = driver
					.findElement(By.xpath("((//div[contains(@class,'listingCard')])[" + i + "]/div)[1]"));
			WebElement applied = driver.findElement(By.xpath("//span[contains(text(),'Applied')]"));
			scrollIntoViewSmoothly(job, driver);
			waitTime(2000, driver);
			click(job, driver);
			scrollIntoViewSmoothly(btnApplyNow, driver);
			waitTime(2000, driver);
			click(btnApplyNow, driver);
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			String path = "//h1[contains(text(),'Job Description')]/../button[contains(text(),'Apply Now')]";
			int sizs = driver.findElements(By.xpath(path)).size();

			if (sizs > 0) {
				break;
			}
			click(tabSearchJobs, driver);

		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickOnApplyNowButton(WebDriver driver) {
		waitTime(4000, driver);		
		click(btnApplyNow, driver);
	}

	public void clickOnBtnApplyNowUnderDescription(WebDriver driver) {
		waitForElementClickable(btnApplyNowUnderDescription, "30", driver);
		click(btnApplyNowUnderDescription, driver);
	}

	public boolean isApplyLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelApply, driver);
	}

	public boolean isApplyJobPopupDisplay(WebDriver driver) {
		waitTime(2000, driver);
		return isElementDisplayed(labelApply, driver);
	}

	public void uploadResume(WebDriver driver) {
		if (isElementDisplayed(removeTagOnResumeSection, driver)) {
			click(removeTagOnResumeSection, driver);
			scrollIntoViewSmoothly(resumeInput, driver);
			waitTime(2000, driver);
			resumeInput
					.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\testResume\\Resume.pdf");
		} else {
			scrollIntoViewSmoothly(resumeInput, driver);
			waitTime(2000, driver);
			resumeInput
					.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\testResume\\Resume.pdf");
		}
	}

	public void clickOnSubmitApplicationButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnSubmitApplication, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnSubmitApplication, "30", driver);
		waitForElementClickable(btnSubmitApplication, "30", driver);
		click(btnSubmitApplication, driver);
	}

	public boolean isYouhaveSuccessfullySubmittedYourApplicationPopupDisplay(WebDriver driver) {
		waitTime(4000, driver);
		try {
			waitForElementVisibility(minusIconOfYearsOfExperience, "90", driver);
			return isElementDisplayed(popupSuccessfullySubmittedYourApplication, driver);			
		} catch (Exception e) {
			return isElementDisplayed(popupSuccessfullySubmittedYourApplication, driver);
		}
	}

	public String getUploadResumeFileName(WebDriver driver) {
		String fileName = getElementText(resumeName, driver);
		String[] name = fileName.split(" ");
		return name[0];
	}

	public void clickOnRemoveButton(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(btnRemove, driver);
			waitTime(2000, driver);
			waitForElementVisibility(btnRemove, "30", driver);
			waitForElementClickable(btnRemove, "30", driver);
			click(btnRemove, driver);
		} catch (Exception e) {

		}
	}

	public boolean isUploadResumeLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelUploadResume, "30", driver);
		return isElementDisplayed(labelUploadResume, driver);
	}

	public void clickOnViewMoreButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnViewMore, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnViewMore, "30", driver);
		waitForElementClickable(btnViewMore, "30", driver);
		click(btnViewMore, driver);
	}

	public boolean isViewLessButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnViewLess, "30", driver);
		return isElementDisplayed(btnViewLess, driver);
	}

	public void clickOnViewLessButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnViewLess, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnViewLess, "30", driver);
		waitForElementClickable(btnViewLess, "30", driver);
		click(btnViewLess, driver);
	}

	public boolean isViewMoreButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnViewMore, "30", driver);
		return isElementDisplayed(btnViewMore, driver);
	}

	public boolean isPleaseAttachAResumePopupMessageDisplay(WebDriver driver) {
		return isElementDisplayed(popupMessagePleaseAttachAResume, driver);
	}

	public void clickOnMinusIconOfYearsOfExperience(WebDriver driver) {
		waitForElementVisibility(minusIconOfYearsOfExperience, "30", driver);
		waitForElementClickable(minusIconOfYearsOfExperience, "30", driver);
		click(minusIconOfYearsOfExperience, driver);
	}

	public boolean isTabPanelDisplay(WebDriver driver) {
		waitTime(2000);
		return isElementDisplayed(tabPanel, driver);
	}

	public void clickOnPlusIconOfYearsOfExperience(WebDriver driver) {
		waitForElementVisibility(minusIconOfYearsOfExperience, "30", driver);
		waitForElementClickable(minusIconOfYearsOfExperience, "30", driver);
		click(minusIconOfYearsOfExperience, driver);
	}

	public void clickOnPlusIconOfAnnualSalary(WebDriver driver) {
		waitForElementVisibility(plusIconOfAnnualSalary, "30", driver);
		waitForElementClickable(plusIconOfAnnualSalary, "30", driver);
		click(plusIconOfAnnualSalary, driver);
	}

	public boolean is40000DollarLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelFortyThousandDollar, driver);
	}

	public void clickOnMinusIconOfAnnualSalary(WebDriver driver) {
		waitForElementVisibility(minusIconOfAnnualSalary, "30", driver);
		waitForElementClickable(minusIconOfAnnualSalary, "30", driver);
		click(minusIconOfAnnualSalary, driver);
	}

	public void clickFistJobOnPage(WebDriver driver) {
		scrollUp(driver);
		waitForElementClickable(firstJobOnPage, "30", driver);
		click(firstJobOnPage, driver);
	}

	public boolean verifyGeneralTextOnJobDescriptionIsDisplaying(WebDriver driver) {
		return isElementDisplayed(generalTextOnJD, driver);
	}

	public boolean verifyCompensationTextOnJobDescriptionIsDisplaying(WebDriver driver) {
		return isElementDisplayed(compensationTextOnJD, driver);
	}

	public void clickOnSaveButton(WebDriver driver) {
		try {
			waitForElementClickable(saveBtn, "30", driver);
			click(saveBtn, driver);
		} catch (Exception e) {
			waitForElementClickable(savedBtn, "30", driver);
			click(savedBtn, driver);
		}
	}

	public void clickOnSavedButton(WebDriver driver) {
		
		try {
			clickUsingJavascriptExecutor(saveBtn, driver);
		} catch (Exception e) {
		}
		waitForElementClickable(savedBtn, "30", driver);
		click(savedBtn, driver);
	}

	public boolean verifyJobRemovedSuccessfullyPopupDisplay(WebDriver driver) {
		return isElementDisplayed(saveBtn, driver);
	}

	public void clickOnJobOnSearchJobPage(WebDriver driver) {
		scrollIntoViewSmoothly(btnApplyNow, driver);
		String i = generateRandomNumberWithGivenNumberOfDigits(1, driver);
		WebElement job = driver.findElement(By.xpath("((//div[contains(@class,'listingCard')])[" + i + "]/div)[1]"));
		waitForElementVisibility(job, "20", driver);
		waitForElementClickable(job, "30", driver);
		click(job, driver);
	}

	public void clickOnCancelBtn(WebDriver driver) {
		waitForElementClickable(cancelBtn, "30", driver);
		click(cancelBtn, driver);
	}

	public void clickJobOnSearchJobForPlus(WebDriver driver) {
		boolean flag = false;
		int licenseDetailsCount = driver.findElements(By.xpath("//div[contains(@class,'listingCard')]")).size();
		do {
			for (int i = 0; i <= licenseDetailsCount; i++) {
				waitTime(2000, driver);
				WebElement job = driver
						.findElement(By.xpath("((//div[contains(@class,'listingCard')])[" + i+1 + "]/div)[1]"));

				scrollIntoViewSmoothly(job, driver);
				waitTime(2000, driver);
				try {
					click(job, "10", driver);
					try {
						driver.findElement(By.xpath("//span[contains(text(),'Applied')]"));
						continue;	

					} catch (Exception e) {
								
					}
				} catch (Exception e) {

				}
				
					scrollIntoViewSmoothly(btnApplyNow, driver);
					waitTime(2000, driver);
					waitForElementClickable(btnApplyNow, "30", driver);
					click(btnApplyNow, driver);
//					clickOnApplyNowButton(driver);
					flag = true;
					break;
				
			}
		} while (!flag);
	}

	public void clickJobOnSearchJob(WebDriver driver) {
		boolean flag = false;
		WebElement applied = null;
		int i = 1;
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("arguments[0].scrollTo(0, arguments[0].scrollHeight)", list_area_jobs);
	    
	    
	 

		do {
			int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
			System.out.println("n : "+n);
			  
				if(i==n)
					break;
			for (; i <= n; i++) {
				waitTime(2000, driver);
				WebElement job = driver
						.findElement(By.xpath("((//div[contains(@class,'listingCard')])[" + i + "]/div)[1]"));
				
				

				scrollIntoViewSmoothly(job, driver);
				waitTime(2000, driver);
				try {
					clickUsingJavascriptExecutor(job, driver);
					waitTime(2000, driver);
					try {
						applied = driver.findElement(By.xpath("//span[contains(text(),'Applied')]"));

					} catch (Exception e) {

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if (!isElementDisplayed(applied, driver)) {
//					scrollIntoViewSmoothly(btnApplyNow, driver);
//					waitTime(2000, driver);
//					waitForElementClickable(btnApplyNow, "30", driver);
//					click(btnApplyNow, driver);
//					
//					try {
//						waitForElementVisibility(redirectingMessage, 30, driver);
//						driver.navigate().back();
//						wait3s();
//						System.out.println("External job skiped");
//					} catch (Exception e) {
//						flag=true;
//						break;
//					}
					
					
					
//					ccclickOnApplyNowButton(driver);
					
					flag=true;
					break;
				}else {
					driver.navigate().back();
					waitTime(2000, driver);
				}
			}
			i=n;
			if(i>=60)break;
		} while (!flag);
	}
	

	public void clickJobOnNotAppliedJob(WebDriver driver) {
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean flag = false;
		WebElement applied = null;
		do {
			for (int i = 1; i < n; i++) {
				waitTime(2000, driver);
				WebElement job = driver
						.findElement(By.xpath("((//div[contains(@class,'listingCard')])[" + i + "]/div)[1]"));

				scrollIntoViewSmoothly(job, driver);
				waitTime(2000, driver);
				try {
					WebElement jobTitle = driver
							.findElement(By.xpath("((//div[contains(@class,'listingCard')])[" + i + "]/div)[1]//p"));
					if(jobTitle.getText().toLowerCase().contains("external")) {
						continue;
					}
					click(job, "10", driver);
					try {
						applied = driver.findElement(By.xpath("//span[contains(text(),'Applied')]"));

					} catch (Exception e) {

					}
				} catch (Exception e) {

				}
				if (!isElementDisplayed(applied, driver)) {
					
					flag=true;
					break;
//					clickOnApplyNowButton(driver);
					
				}
			}
		} while (!flag);
	}

	public boolean verifyAppliedLblIsDisplaying(WebDriver driver) {
		return isElementDisplayed(appliedLbl, driver);
	}

	public boolean verifyRemoveTagOnResumeSection(WebDriver driver) {
		return isElementDisplayed(removeTagOnResumeSection, driver);
	}

	public void clickRemoveTagOnResumeSection(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(removeTagOnResumeSection, driver);
			waitTime(2000, driver);
			waitForElementClickable(removeTagOnResumeSection, "30", driver);
			click(removeTagOnResumeSection, driver);
		} catch (Exception e) {

		}
	}

	public void clickIconInfrontOfEducationLevel(WebDriver driver) {
		waitForElementClickable(IconInfrontOfEducationLevel, "30", driver);
		click(IconInfrontOfEducationLevel, driver);
	}

	public boolean verifyGraphUnderAnnualSalaryIsDisplaying(WebDriver driver) {
		return isElementDisplayed(graphUnderEducationLavel, driver);
	}

	public String getAllPrimaryFunctionOptionsText(int val, WebDriver driver) {
		return getElementText(listOfPrimaryFunction.get(val), driver);
	}
	public Boolean isJobSaved(WebDriver driver) {
	try {
		return isElementDisplayed(savedBtn, driver);
	} catch (Exception e) {
		return false;
	}
		
	}
	
	public boolean isPrimaryFunctionSelectAllOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionSelectAlloption, "30", driver);
			return isElementDisplayed(primaryFunctionSelectAlloption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionSelectAlloption, driver);
		}
	}
	
	public boolean isPrimaryFunctionBusinessDevelopmentOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionBusinessDevelopmentOption, "30", driver);
			return isElementDisplayed(primaryFunctionBusinessDevelopmentOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionBusinessDevelopmentOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionClinicalConsultingOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionClinicalConsultingOption, "30", driver);
			return isElementDisplayed(primaryFunctionClinicalConsultingOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionClinicalConsultingOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionIndependentRepresentativeOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionIndependentRepresentativeOption, "30", driver);
			return isElementDisplayed(primaryFunctionIndependentRepresentativeOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionIndependentRepresentativeOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionMarketingOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionMarketingOption, "30", driver);
			return isElementDisplayed(primaryFunctionMarketingOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionMarketingOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionAccountManagementOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionAccountManagementOption, "30", driver);
			return isElementDisplayed(primaryFunctionAccountManagementOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionAccountManagementOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionSalesManagementOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionSalesManagementOption, "30", driver);
			return isElementDisplayed(primaryFunctionSalesManagementOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionSalesManagementOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionServiceTechnicianOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionServiceTechnicianOption, "30", driver);
			return isElementDisplayed(primaryFunctionServiceTechnicianOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionServiceTechnicianOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionOtherOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionOtherOption, "30", driver);
			return isElementDisplayed(primaryFunctionOtherOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionOtherOption, driver);
		}
	}
	
	public boolean isPrimaryFunctionSalesSupportOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(primaryFunctionSalesSupportOption, "30", driver);
			return isElementDisplayed(primaryFunctionSalesSupportOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(primaryFunctionSalesSupportOption, driver);
		}
	}
	
	public void clickAverageTotalCompensation(WebDriver driver) {
		waitForElementClickable(averageTotalCompensation, "30", driver);
		click(averageTotalCompensation, driver);
	}
	
	public boolean isAverageTotalRangeSliderDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(averageTotalRangeSlider, "30", driver);
			return isElementDisplayed(averageTotalRangeSlider, driver);
		} catch (Exception e) {
			return isElementDisplayed(averageTotalRangeSlider, driver);
		}
	}
	
	public boolean isIndustryDropdownDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(industryDropdown, "30", driver);
			return isElementDisplayed(industryDropdown, driver);
		} catch (Exception e) {
			return isElementDisplayed(industryDropdown, driver);
		}
	}
	
	
	public boolean isKeywordTextFieldDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(keywordTxt, "30", driver);
			return isElementDisplayed(keywordTxt, driver);
		} catch (Exception e) {
			return isElementDisplayed(keywordTxt, driver);
		}
	}
	
	public boolean isLocationDropdownDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(locationDropdown, "30", driver);
			return isElementDisplayed(locationDropdown, driver);
		} catch (Exception e) {
			return isElementDisplayed(locationDropdown, driver);
		}
	}
	
	public boolean isSalaryCommissionCheckboxDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(salaryCommissionCheckbox, "30", driver);
			return isElementDisplayed(salaryCommissionCheckbox, driver);
		} catch (Exception e) {
			return isElementDisplayed(salaryCommissionCheckbox, driver);
		}
	}
	
	public boolean isSalaryOnlyCheckboxDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(salaryOnlyCheckbox, "30", driver);
			return isElementDisplayed(salaryOnlyCheckbox, driver);
		} catch (Exception e) {
			return isElementDisplayed(salaryOnlyCheckbox, driver);
		}
	}
	
	public boolean isNotSpecifiedCheckboxDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(notSpecifiedCheckbox, "30", driver);
			return isElementDisplayed(notSpecifiedCheckbox, driver);
		} catch (Exception e) {
			return isElementDisplayed(notSpecifiedCheckbox, driver);
		}
	}
	
	public boolean isTravelPercentageDropdownDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(travelPercentageDropdown, "30", driver);
			return isElementDisplayed(travelPercentageDropdown, driver);
		} catch (Exception e) {
			return isElementDisplayed(travelPercentageDropdown, driver);
		}
	}
	
	public boolean isIndustryCheckboxDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(industryCheckbox, "30", driver);
			return isElementDisplayed(industryCheckbox, driver);
		} catch (Exception e) {
			return isElementDisplayed(industryCheckbox, driver);
		}
	}	
	
	public boolean isAverageTotalCompensationDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(averageTotalCompensation, "30", driver);
			return isElementDisplayed(averageTotalCompensation, driver);
		} catch (Exception e) {
			return isElementDisplayed(averageTotalCompensation, driver);
		}
	}
	
	public void clickCreateAlertButton(WebDriver driver) {
		waitForElementClickable(createAlertBtn, "30", driver);
		click(createAlertBtn, driver);
	}
	
	public boolean isAlretWarningMessageDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(alretWarningMsg, "30", driver);
			return isElementDisplayed(alretWarningMsg, driver);
		} catch (Exception e) {
			return isElementDisplayed(alretWarningMsg, driver);
		}
	}	
	
	public void clickOnCreateAlertButtonPopup(WebDriver driver) {
		waitForElementClickable(createAlertBtnOnPopup, "30", driver);
//		createAlertBtnOnPopup.click();
		click(createAlertBtnOnPopup, driver);
	}
	
	public void clickOnTravelPercentageDropdown(WebDriver driver) {
		waitForElementClickable(travelPercentageDropdown, "30", driver);
		click(travelPercentageDropdown, driver);
	}
	
	public boolean isSelectAllOptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(selectAllOption, "30", driver);
			return isElementDisplayed(selectAllOption, driver);
		} catch (Exception e) {
			return isElementDisplayed(selectAllOption, driver);
		}
	}	
	
	public boolean isOption0_25PercentDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(option0_25Percent, "30", driver);
			return isElementDisplayed(option0_25Percent, driver);
		} catch (Exception e) {
			return isElementDisplayed(option0_25Percent, driver);
		}
	}	
	
	public boolean isOption25_50PercentDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(option25_50Percent, "30", driver);
			return isElementDisplayed(option25_50Percent, driver);
		} catch (Exception e) {
			return isElementDisplayed(option25_50Percent, driver);
		}
	}	
	
	public boolean isOption50_75PercentDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(option50_75Percent, "30", driver);
			return isElementDisplayed(option50_75Percent, driver);
		} catch (Exception e) {
			return isElementDisplayed(option50_75Percent, driver);
		}
	}	
	
	public boolean isOption75_100PercentDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(option75_100Percent, "30", driver);
			return isElementDisplayed(option75_100Percent, driver);
		} catch (Exception e) {
			return isElementDisplayed(option75_100Percent, driver);
		}
	}	
	
	public boolean isSalaryOnlyJobsDisplay(WebDriver driver) {
		try {
			waitTime(2000, driver);
			scrollIntoViewSmoothly(salaryOnlyJobs, driver);
			return isElementDisplayed(salaryOnlyJobs, driver);
		} catch (Exception e) {
			return isElementDisplayed(salaryOnlyJobs, driver);
		}
	}

	public void clickOnFindJobsButton(WebDriver driver) {
		waitForElementClickable(btnFindJobs, "30", driver);
		click(btnFindJobs, driver);
	}
	
	public void enterKeyword(String keyword, WebDriver driver) {
		waitForElementVisibility(keywordTxt, "30", driver);
		type(keywordTxt, keyword, driver);
	}
	
	public void enterLocationDropdown(String location, WebDriver driver) {
		waitForElementVisibility(locationDropdown, "30", driver);
		type(locationDropdown, location, driver);
	}
	
	public void enterSearchName(String searchName, WebDriver driver) {
		waitForElementVisibility(searchNameTxt, "70", driver);
		type(searchNameTxt, searchName, driver);
	}
	
	public boolean isSearchSavedPopupDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(searchSavedPopup, "30", driver);
			return isElementDisplayed(searchSavedPopup, driver);
		} catch (Exception e) {
			return isElementDisplayed(searchSavedPopup, driver);
		}
	}	
	

	public void clickOnJobApplyNowButton(WebDriver driver) {
		waitForElementVisibility(firstJobInTheList, "60", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean flag = false;
		WebElement applied = null;

		do {
			if(1 < n) {			
			for (int i = 4; i < n; i++) {
				waitTime(4000, driver);
				WebElement job = driver
						.findElement(By.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])["+i+"]"));

				scrollIntoViewSmoothly(job, driver);
				
				if(isElementDisplayed(applyNowBtn, driver)){
					
					click(applyNowBtn, driver);
					flag=true;
					break;

				}else {
					try {
						click(job, "10", driver);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("");
					}
					if(i == n) {
						flag=true;
						break;
					}
				}
			}
			}else {
				flag=true;
				break;
			}
		} while (!flag);

	}
	
	public boolean isApplyNowButtonDisplayOnTopAndBottom(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(applyNowBtnOnTop, driver);
			waitForElementVisibility(applyNowBtnOnTop, "30", driver);
			scrollIntoViewSmoothly(applyNowBtnOnBottom, driver);
			waitForElementVisibility(applyNowBtnOnBottom, "30", driver);
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}	
	
	public boolean isJobTitleDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(jobTitle, "30", driver);
			return isElementDisplayed(jobTitle, driver);
		} catch (Exception e) {
			return isElementDisplayed(jobTitle, driver);
		}
	}	
	
	public boolean isGeneralInformationAboutJobDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(generalInformationAboutJob, "30", driver);
			return isElementDisplayed(generalInformationAboutJob, driver);
		} catch (Exception e) {
			return isElementDisplayed(generalInformationAboutJob, driver);
		}
	}	
	
	
	public boolean isJobDescriptionDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(jobDescription, "30", driver);
			return isElementDisplayed(jobDescription, driver);
		} catch (Exception e) {
			return isElementDisplayed(jobDescription, driver);
		}
	}	
	
	public boolean isCompensationInformationDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(compensationInformation, "30", driver);
			return isElementDisplayed(compensationInformation, driver);
		} catch (Exception e) {
			return isElementDisplayed(compensationInformation, driver);
		}
	}	
	
	
	public boolean isCompanyInformationDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(companyInformation, "30", driver);
			return isElementDisplayed(companyInformation, driver);
		} catch (Exception e) {
			return isElementDisplayed(companyInformation, driver);
		}
	}	
	
	public boolean isMoreJobsFromThisCompanyDisplay(WebDriver driver) {
		try {			
			scrollIntoViewSmoothly(moreJobsFromThisCompany, driver);
			return isElementDisplayed(moreJobsFromThisCompany, driver);
		} catch (Exception e) {
			return isElementDisplayed(moreJobsFromThisCompany, driver);
		}
	}	
	
	
	public boolean isPrinterJobBtnDisplay(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(printerJobBtn, driver);
			return isElementDisplayed(printerJobBtn, driver);
		} catch (Exception e) {
			return isElementDisplayed(printerJobBtn, driver);
		}
	}	
	
	public boolean isSeeHowYouCompareSectionDisplay(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(seeHowYouCompareSection, driver);
			return isElementDisplayed(seeHowYouCompareSection, driver);
		} catch (Exception e) {
			return isElementDisplayed(seeHowYouCompareSection, driver);
		}
	}	
	
	public boolean isResumeRemovedDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(uploadResumeLbl, "30", driver);
			return isElementDisplayed(uploadResumeLbl, driver);
		} catch (Exception e) {
			return isElementDisplayed(uploadResumeLbl, driver);
		}
	}	
	
	public boolean isYearsOfExperienceLblDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(yearsOfExperienceLbl, "30", driver);
			return isElementDisplayed(yearsOfExperienceLbl, driver);
		} catch (Exception e) {
			return isElementDisplayed(yearsOfExperienceLbl, driver);
		}
	}	
	
	public boolean isAnnualSalaryLblDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(annualSalaryLbl, "30", driver);
			return isElementDisplayed(annualSalaryLbl, driver);
		} catch (Exception e) {
			return isElementDisplayed(annualSalaryLbl, driver);
		}
	}
	
	public boolean isEducationLevelLblDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(educationLevelLbl, "30", driver);
			return isElementDisplayed(educationLevelLbl, driver);
		} catch (Exception e) {
			return isElementDisplayed(educationLevelLbl, driver);
		}
	}
	
	public boolean isMembersAppliedToThisJobDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(membersAppliedToThisJob, "30", driver);
			return isElementDisplayed(membersAppliedToThisJob, driver);
		} catch (Exception e) {
			return isElementDisplayed(membersAppliedToThisJob, driver);
		}
	}
	
	public boolean isTotalCountOfJobDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(totalCountOfJob, "30", driver);
			return isElementDisplayed(totalCountOfJob, driver);
		} catch (Exception e) {
			return isElementDisplayed(totalCountOfJob, driver);
		}
	}
	
	public boolean verifyKeywordFilterResult(String filterVale,WebDriver driver) {
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						try {
							WebElement keywordSearchValue = driver.findElement(By
									.xpath("(//p[contains(text(),'"+filterVale+"')])[" + i + "]"));
							scrollIntoViewSmoothly(keywordSearchValue, driver);
							isElementDisplayed(keywordSearchValue, driver);
							status = true;
							
						} catch (Exception e) {
							WebElement keywordSearchValue = driver.findElement(By
									.xpath("(//p[contains(text(),'test')])[" + i + "]"));
							scrollIntoViewSmoothly(keywordSearchValue, driver);
							isElementDisplayed(keywordSearchValue, driver);
							status = true;
						}
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public boolean verifySalaryCommissionCheckboxFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(compensationSalaryCommission, driver);
						waitForElementVisibility(compensationSalaryCommission, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}	
	
	public boolean verifyCommissionOnlyCheckboxFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(compensationCommissionOnly, driver);
						waitForElementVisibility(compensationCommissionOnly, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}	
		
	public void clickOnCommissionOnlyCheckbox(WebDriver driver) {
		waitForElementVisibility(commissionOnlyCheckbox, "100", driver);
		click(commissionOnlyCheckbox, driver);
	}
	
	public void clickOnSalaryCommissionCheckbox(WebDriver driver) {
		waitForElementVisibility(firstJobInTheList, "100", driver);
		click(salaryCommissionCheckbox, driver);
	}
	
	public void clickOnSalaryOnlyCheckbox(WebDriver driver) {
		waitForElementVisibility(salaryOnlyCheckbox, "100", driver);
		click(salaryOnlyCheckbox, driver);
	}
	
	public boolean verifyCompensationSalaryOnlyFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(compensationSalaryOnly, driver);
						waitForElementVisibility(compensationSalaryOnly, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public boolean verifyCompensationNotSpecifiedFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(compensationSNotSpecified, driver);
						waitForElementVisibility(compensationSNotSpecified, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public void clickOnNotSpecifiedCheckbox(WebDriver driver) {
		waitForElementVisibility(notSpecifiedCheckbox, "100", driver);
		click(notSpecifiedCheckbox, driver);
	}
	
	public boolean NoJobsFound(WebDriver driver) {
		try {
			waitForElementVisibility(noJobsFound, "60", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyRemoteFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						WebElement remoteJob = driver.findElement(By
								.xpath("(//span[contains(text(),' Remote')])[" + i + "]"));
						scrollIntoViewSmoothly(remoteJob, driver);
						waitForElementVisibility(remoteJob, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public void clickOnRemoteCheckbox(WebDriver driver) {
		waitForElementVisibility(remoteCheckbox, "60", driver);
		click(remoteCheckbox, driver);
	}
	
	public boolean verifyPrimaryFunctionBusinessDevelopmentFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(functionBusinessDevelopment, driver);
						waitForElementVisibility(functionBusinessDevelopment, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public void clickOnPrimaryFunctionBusinessDevelopmentOption(WebDriver driver) {
		waitForElementVisibility(primaryFunctionBusinessDevelopmentOption, "60", driver);
		click(primaryFunctionBusinessDevelopmentOption, driver);
	}
	
	public boolean verifyTravelPercentage0_25PercentFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(travelPercentage0_25Percent, driver);
						waitForElementVisibility(travelPercentage0_25Percent, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public void clickOnTravelPercentage0_25PercentOption(WebDriver driver) {
		waitForElementVisibility(option0_25Percent, "60", driver);
		click(option0_25Percent, driver);
	}
	
	public void clickOnIndustryDropdown(WebDriver driver) {
		waitForElementVisibility(industryDropdown, "60", driver);
		click(industryDropdown, driver);
	}
	
	public void clickOnIndustryBiotechnologyOption(WebDriver driver) {
		waitForElementVisibility(biotechnologyOption, "60", driver);
		click(biotechnologyOption, driver);
	}
	
	public boolean verifyIndustryBiotechnologyFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(industryBiotechnology, driver);
						waitForElementVisibility(industryBiotechnology, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public void clickOnResetButton(WebDriver driver) {
		waitTime(3000, driver);
		click(resetBtn, driver);
	}
	
	public void enterLocation(String location, WebDriver driver) {
		waitForElementVisibility(locationSearchTxt, "30", driver);
//		click(locationSearchTxt, driver);	
		type(locationSearchTxt, location, driver);
		waitTime(3000, driver);
		WebElement locationEle = driver.findElement(By
				.xpath("(//div[text()='"+location+"'])[last()]"));
		
		click(locationEle, driver);			
	}

	public boolean verifyLocationUnitedStatesFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(locationUnitedStates, driver);
						waitForElementVisibility(locationUnitedStates, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	public void enterInputAverageK(String location, WebDriver driver) {
		waitForElementVisibility(inputK, "30", driver);
		type(inputK, location, driver);
	}
	
	public void clickOnAverageTotalCompensationButton(WebDriver driver) {
		waitForElementVisibility(averageTotalCompensation, "60", driver);
		click(averageTotalCompensation, driver);
	}
	
	public boolean verifyAvgTotalCompFilterResult(WebDriver driver) {
		waitTime(4000, driver);
		waitForElementVisibility(firstJobInTheList, "90", driver);
		int n = driver.findElements(By.xpath("((//div[contains(@class,'listingCard')]))")).size();
		boolean status = false;

			if (1 <= n) {
				for (int i = 1; i <= n; i++) {
					waitTime(4000, driver);
					WebElement job = driver.findElement(By
							.xpath("(//*[@id=\"list-area\"]/div/div/div[contains(@class,'listingCard')])[" + i + "]"));

					click(job, "10", driver);
					
					try {
						scrollIntoViewSmoothly(avgTotalComp, driver);
						waitForElementVisibility(avgTotalComp, "90", driver);
						status = true;
					} catch (Exception e) {
						status = false;
						break;
					}
				}
			}
		return status;
	}
	
	
}
