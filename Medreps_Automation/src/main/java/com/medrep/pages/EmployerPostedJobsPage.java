package com.medrep.pages;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerPostedJobsPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//button[contains(text(),'Post Job')])[2]"))
	WebElement btnPostedJobs;

	@FindBy(xpath = ("//h1[contains(text(),'Post A New Job')]"))
	WebElement pageHeadingPostANewJob;

	@FindBy(xpath = ("//input[@id='create-job-form_title']"))
	WebElement jobTitleInputField;


	@FindBy(xpath = ("(//div[@id='create-job-form_description']/div/div)[1]"))
	WebElement jobDescription;

	@FindBy(xpath = ("//input[@id='create-job-form_job_code']"))
	WebElement jobCodeInputField;

	@FindBy(xpath = ("//div[@class='google-place-autocomplete-select__input']/input"))
	WebElement locationOnPostJob;

	@FindBy(xpath = ("//input[@id='create-job-form_state']/../../.."))
	WebElement stateDropdownIcon;

	@FindBy(xpath = ("//input[@id='create-job-form_state']"))
	WebElement stateInputField;

	@FindBy(xpath = ("//input[@id='create-job-form_city']/../../.."))
	WebElement cityDropdownIcon;

	@FindBy(xpath = ("//input[@id='create-job-form_city']"))
	WebElement cityInputField;

	@FindBy(xpath = ("//input[@id='create-job-form_zip']"))
	WebElement zipCodeInputField;

	@FindBy(xpath = ("//input[@id='create-job-form_remote_enabled']/../.."))
	WebElement remoteCheckBox;

	@FindBy(xpath = ("//span[contains(text(),'Base Salary')]/..//following-sibling::div//div[contains(@class,'slider-handle-2')]"))
	WebElement baseSalarySilder;

	@FindBy(xpath = ("//*[contains(text(),'Average Total Compensation')]/../..//following-sibling::div//div[contains(@class,'slider-handle-2')] | //span[contains(text(),'Average Total Compensation')]/..//following-sibling::div//div[contains(@class,'slider-handle-2')]"))
	WebElement averageTotalCompensationSilder;

	@FindBy(xpath = ("//input[@id='create-job-form_primary_function']/../../.."))
	WebElement functionDropdownIcon;

	@FindBy(xpath = "//span[contains(text(),'Your job has been')]")
	WebElement jobCreatedSuccessfullyMessage;

	@FindBy(xpath = "//span[text()='Job updated']")
	WebElement jobFeaturedSuccessfullyMessage;






	@FindBy(xpath = "//span[contains(text(),'Job saved')]")
	WebElement jobSavedSuccessfullyMessage;

	@FindBy(xpath = ("(//button[contains(text(),'Post Job')])[last()]"))
	WebElement btnPostJob;

	@FindBy(xpath = "//button[text()='Publish Job']")
	WebElement publishJobButton;

	@FindBy(xpath = ("//span[contains(text(),'0 -25%')]/.."))
	WebElement twentyFivePercentage;

	@FindBy(xpath = "//span[contains(text(),'Email')]/..") WebElement applicationMethodType;

	@FindBy(xpath = ("//h1[contains(text(),'Manage Jobs')]"))
	WebElement pageHeadingManageJobs;

	@FindBy(xpath = ("((//div[contains(@class,'rc-virtual-list-holder-inner')])[2]//following-sibling::div)[1]"))
	WebElement function;

	@FindBy(xpath = ("(//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div)[10]"))
	WebElement functionOption;

	@FindBy(xpath = ("//input[@id='create-job-form_compensation_type']//parent::*"))
	WebElement compensationType;

	@FindBy(xpath = ("//div[text()='Salary Only']"))
	WebElement compensationTypeOption;

	@FindBy(xpath = ("//input[@id='create-job-form_product_category']//parent::*"))
	WebElement industry;

	@FindBy(xpath = ("//div[text()='Capital Equipment']"))
	WebElement industryOption;

	@FindBy(xpath = ("//div[contains(@class,'list-holder-inner')]/div"))
	List<WebElement> dropdownOptions;

	@FindBy(xpath = ("//input[@id='create-job-form_state']/.././/following-sibling::span"))
	WebElement stateFieldInputValue;

	@FindBy(xpath = ("//input[@placeholder='Enter Maximum salary']"))
	WebElement maximumBaseSalaryInputField;

	@FindBy(xpath = ("//input[@placeholder='Enter Maximum Compensation']"))
	WebElement maximumCompensationInputField;

	@FindBy(xpath = ("//span[contains(text(),'Job saved as draft')] | //span[contains(text(),'job has been saved')]"))
	WebElement jobSavedAsDraftSuccessfullyMessage;

	@FindBy(xpath = ("//span[contains(text(),'job has been saved')] | //span[contains(text(),'Job saved as draft')]"))
	WebElement newJobSavedAsDraftSuccessfullyMessage;

	@FindBy(xpath = ("//button[contains(text(),'Save As Draft')]"))
	WebElement btnSaveAsDraft;

	@FindBy(xpath = ("//div[contains(text(),'Required')]"))
	WebElement labelRequired;

	@FindBy(xpath = ("(//div[@id='create-job-form_description']/div/div)[1]/p"))
	WebElement jobDescriptionInputField;

	@FindBy(xpath = "//input[@id='create-job-form_application_email']") WebElement emailField;

	@FindBy(xpath = ("(//div[contains(@class,'rc-virtual-list-holder-inner')]//div)[1]"))
	WebElement emptyOption;
	
	@FindBy(xpath = ("//span[contains(text(),'External Redirect')]"))
	WebElement externalJobInput;
	
	@FindBy(xpath = ("//input[@id='create-job-form_applicationUrl']"))
	WebElement externalUrlInput;

	@FindBy(xpath = "//button[text()='Update']") WebElement btnUpdate;
	
	@FindBy(xpath = ("//h1[contains(text(),'Manage Jobs')]/../following-sibling::div/button"))
	WebElement filterDropdownIcon;
	
	@FindBy(xpath = ("(//label[contains(@class,'ant-radio-wrapper-checked')])[last()]/span[text()='External Redirect'] | (//label[contains(@class,'ant-radio-wrapper-checked')])[last()]/span[text()='Email']"))
	WebElement externalRedirectOrEmailCheckbox;

	@FindBy(xpath = ("//span[text()='Email']"))
	WebElement emailCheckbox;
	
	@FindBy(xpath = ("//input[@id='create-job-form_application_email']"))
	WebElement emailAddressForApplicatonTxt;

	public EmployerPostedJobsPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, defaultWaitTime, driver);
		waitTime(2000);
		waitForElementClickable(btnLogin, "30", driver);
		click(btnLogin, driver);
		try {
			getRefreshWebPage(driver);
			waitForElementVisibility(btnLogin, defaultWaitTime, driver);
			waitForElementClickable(btnLogin, "30", driver);
			click(btnLogin, driver);
		} catch (Exception e) {

		}
	}

	public boolean isEmailFieldDisplay(WebDriver driver) {
		return isElementDisplayed(emailAddress, driver);
	}

	public void enterEmailAddress(String email, WebDriver driver) {
		waitForElementVisibility(emailAddress, defaultWaitTime, driver);
		type(emailAddress, email, driver);
	}

	public void enterPassword(String pass, WebDriver driver) {
		waitForElementVisibility(password, defaultWaitTime, driver);
		type(password, pass, driver);
	}

	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementClickable(btnSubmitLogin, "30", driver);
		click(btnSubmitLogin, driver);
	}

	public void clickOnPostedJobsButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnPostedJobs, "30", driver);
		click(btnPostedJobs, driver);
	}

	public boolean isPageHeadingPostANewJobDisplay(WebDriver driver) {
		return isElementDisplayed(pageHeadingPostANewJob, driver);
	}

	public void enterJobTitle(String title, WebDriver driver) {
		type(jobTitleInputField, title, driver);
	}

	public void clickUpdateButton(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(btnUpdate, "30", driver);
		click(btnUpdate, driver);
	}

	public void enterJobDescription(String description, WebDriver driver) {
		type(jobDescription, description, driver);
	}

	public void enterJobCode(String jobCode, WebDriver driver) {
		type(jobCodeInputField, jobCode, driver);
	}
	
	public void enterExternalUrl(String jobUrl, WebDriver driver) {
		type(externalUrlInput, jobUrl, driver);
	}

	public void enterApplicationMethodEmail(String email, WebDriver driver){
		type(emailField, email, driver);
	}

	public void enterLocation(String loc, WebDriver driver) {
		scrollIntoViewSmoothly(locationOnPostJob, driver);
		try {
			locationOnPostJob.sendKeys(loc);
		} catch (Exception e) {
			;
		}
		waitTime(2000);
		List<WebElement> locations = driver
				.findElements(By.xpath("//div[contains(@class,'google-place-autocomplete-select__menu')]/div"));
		Random rand = new Random();
		int i = rand.nextInt(4);
		click(locations.get(i), driver);

	}

	public void clickOnStateDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(stateDropdownIcon, driver);
		waitTime(2000);
		waitForElementClickable(stateDropdownIcon, "30", driver);
		click(stateDropdownIcon, driver);
	}

	public void selectState(WebDriver driver) {
		waitforPageLoad(30, driver);
		WebElement findElement = driver.findElement(
				By.xpath("(//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div)[1]"));
		String state = getElementAttribute(findElement, "title", driver);
		type(stateInputField, state, driver);
		stateInputField.sendKeys(Keys.ENTER);
	}

	public void clickOnCityDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);

		try {
			scrollIntoViewSmoothly(cityDropdownIcon, driver);
			waitForElementClickable(cityDropdownIcon, "30", driver);
			click(cityDropdownIcon, driver);
		} catch (Exception e) {
			scrollIntoViewSmoothly(cityDropdownIcon, driver);
			waitTime(2000);
			waitForElementClickable(cityDropdownIcon, "30", driver);
			click(cityDropdownIcon, driver);
		}
	}

	public void selectCity(WebDriver driver) {
		waitforPageLoad(30, driver);
		WebElement findElement = driver.findElement(
				By.xpath("(//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div)[1]"));
		String city = getElementAttribute(findElement, "title", driver);
		type(cityInputField, city, driver);
		cityInputField.sendKeys(Keys.ENTER);
	}

	public void enterZipCode(String zipCode, WebDriver driver) {
		type(zipCodeInputField, zipCode, driver);
	}

	public void checkRemoteCheckBox(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(remoteCheckBox, "30", driver);
		click(remoteCheckBox, driver);
	}

	public void selectBaseSalary(WebDriver driver) {
		try {
			Actions move = new Actions(driver);
			move.dragAndDropBy(baseSalarySilder, 50, 0).click();
			move.build().perform();
		} catch (Exception e) {

		}

	}

	public void selectAverageTotalCompensation(WebDriver driver) {
		Actions move = new Actions(driver);
		move.dragAndDropBy(averageTotalCompensationSilder, 50, 0).click();
		move.build().perform();
	}

	public void clickOnFunctionDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(functionDropdownIcon, driver);
		waitTime(2000);
		waitForElementClickable(functionDropdownIcon, "30", driver);
		click(functionDropdownIcon, driver);
	}

	public void selectFunction(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(function, "30", driver);
		click(function, driver);
	}

	public void selectTravelPercentage(WebDriver driver) {
		waitForElementClickable(twentyFivePercentage, "30", driver);
		click(twentyFivePercentage, driver);
	}

	public void selectApplicationMethodType(WebDriver driver){
		waitForElementClickable(applicationMethodType, "30", driver);
		click(applicationMethodType,driver);
	}


	public void clickOnPostJobButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		try {
			waitForElementVisibility(btnPostJob, defaultWaitTime, driver);
			waitForElementClickable(btnPostJob, "30", driver);
			click(btnPostJob, driver);
		} catch (Exception e) {
			waitForElementVisibility(btnPostJob, defaultWaitTime, driver);
			waitTime(2000);
			waitForElementClickable(btnPostJob, "30", driver);
			click(btnPostJob, driver);
		}
	}

	public boolean isJobCreatedSuccessfullyNotificationMessageDisplay(WebDriver driver) {
		try {
		waitForElementVisibility(jobCreatedSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(jobCreatedSuccessfullyMessage, driver);
		} catch (Exception e) {
			waitForElementVisibility(jobCreatedSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(jobCreatedSuccessfullyMessage, driver);
		}
	}



	public boolean isJobFeaturedSuccessfullyNotificationMessageDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(jobFeaturedSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(jobFeaturedSuccessfullyMessage, driver);
		} catch (Exception e) {
			waitForElementVisibility(jobFeaturedSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(jobFeaturedSuccessfullyMessage, driver);
		}
	}




	public boolean isPageHeadingManageJobsDisplay(WebDriver driver) {
		waitForElementVisibility(pageHeadingManageJobs, defaultWaitTime, driver);
		return isElementDisplayed(pageHeadingManageJobs, driver);
	}

	public boolean isListOfStateDropdownOptionsDisplay(WebDriver driver) {
		return dropdownOptions.size() > 0;
	}

	public String getStateInputFieldValue(WebDriver driver) {
		scrollIntoViewSmoothly(stateDropdownIcon, driver);
		waitTime(2000);
		return getElementText(stateFieldInputValue, driver);
	}

	public String getCityDropdownValue(WebDriver driver) {
		return getElementAttributeValue(cityDropdownIcon, "class", driver);
	}

	public boolean isCityDropdownFieldEnable(WebDriver driver) {
		return isElementEnabled(cityDropdownIcon, driver);
	}

	public boolean isListOfCityDropdownOptionsDisplay(WebDriver driver) {
		return dropdownOptions.size() > 0;
	}

	public String getMaximumBaseSalaryFieldValue(WebDriver driver) {
		return getElementAttributeValue(maximumBaseSalaryInputField, "value", driver);
	}

	public boolean isBaseSalaryFieldAutoFilled(WebDriver driver) {
		return getElementAttributeValue(maximumBaseSalaryInputField, "value", driver).isEmpty();

	}

	public String getMaximumCompensationFieldValue(WebDriver driver) {
		return getElementAttributeValue(maximumCompensationInputField, "value", driver);
	}

	public boolean isAverageTotalCompensationFieldAutoFilled(WebDriver driver) {
		return getElementAttributeValue(maximumCompensationInputField, "value", driver).isEmpty();

	}

	public boolean isListOfFunctionDisplay(WebDriver driver) {
		return dropdownOptions.size() > 0;
	}

	public boolean isJobSaveAsDraftSuccessfullyNotificationMessageDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(newJobSavedAsDraftSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(newJobSavedAsDraftSuccessfullyMessage, driver);
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}

	}

	public void clickOnSaveAsDraftButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnSaveAsDraft, driver);
		waitForElementVisibility(btnSaveAsDraft, defaultWaitTime, driver);
		waitForElementClickable(btnSaveAsDraft, "30", driver);
		click(btnSaveAsDraft, driver);
	}

	public boolean isRequiredLabelDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(labelRequired, driver);
		waitTime(2000);
		return isElementDisplayed(labelRequired, driver);
	}

	public boolean isJobTitleEmpty(WebDriver driver) {
		return getElementAttribute(jobTitleInputField, "value", driver).isEmpty();
	}

	public boolean isJobDescriptionInputFieldEmpty(WebDriver driver) {
		return getElementText(jobTitleInputField, driver).isEmpty();
	}

	public void selectEmptyState(WebDriver driver) {
		waitForElementClickable(emptyOption, "30", driver);
		click(emptyOption, driver);
	}

	public boolean isStateFieldEmpty(WebDriver driver) {
		return getElementText(stateInputField, driver).isEmpty();
	}

	public boolean isCityFieldEmpty(WebDriver driver) {
		return getElementText(cityInputField, driver).isEmpty();
	}

	public void selectFunctionOption(WebDriver driver) {
		waitForElementClickable(functionOption, "30", driver);
		click(functionOption, driver);
	}

	public boolean isZipCodeFieldEmpty(WebDriver driver) {
		return getElementAttributeValue(zipCodeInputField, "value", driver).isEmpty();
	}

	public void clickPublishJobButton(WebDriver driver) {
		waitForElementClickable(publishJobButton, "30", driver);
		click(publishJobButton, driver);
	}

	public void clickCompensationType(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(compensationType, driver);
	}

	public void clickCompensationTypeOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(compensationTypeOption, driver);
	}

	public void clickIndustry(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(industry, driver);
	}

	public void clickIndustryOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(industryOption, driver);
	}
	
	public void clickExternalJobRadioButton(WebDriver driver) {
		click(externalJobInput, driver);
	}

	public void clickEmailRadioButton(WebDriver driver){
		click(applicationMethodType,driver);
	}
	
	public void clickOnFilterDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(filterDropdownIcon,"30",driver);
		click(filterDropdownIcon, driver);
	}

	public boolean isExternalRedirectOrEmailcheckboxSelected(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(externalRedirectOrEmailCheckbox, driver);
			waitForElementVisibility(externalRedirectOrEmailCheckbox, "60", driver);
			return true;			
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickEmailCheckboxButton(WebDriver driver){
		click(emailCheckbox,driver);
	}
	
	public void enterEmailAddressForApplicaton(String email, WebDriver driver) {
		type(emailAddressForApplicatonTxt, email, driver);
	}
		

}
