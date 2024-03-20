package com.medrep.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.List;

public class EmployerResumeSearchPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//li//span[contains(text(),'Resume Search')])[last()] | (//li//span[contains(text(),'Resume Alerts')])[last()]"))
	WebElement btnResumeSearch;

	@FindBy(xpath = "//span[text()='View All Alerts']")
	WebElement viewAllAlerts;

	@FindBy(xpath = "//span[text()='View Saved Resumes']")
	WebElement viewSavedResumes;

	@FindBy(xpath = "//h1[text()='Saved Resumes']")
	WebElement SavedResumes;

	@FindBy(xpath = "(//table/tbody/tr/td[2])[2]")
	WebElement savedAlertName;

	@FindBy(xpath = ("(//span[contains(text(),'View All Alerts')])[last()]"))
	WebElement btnSavedSearches;

	@FindBy(xpath = ("(//span[contains(text(),'Saved Resumes')])[last()]"))
	WebElement btnSavedResumes;

	@FindBy(xpath = ("(//*[contains(text(),'Save Search')]) | //*[contains(text(),'Create Alert')]"))
	WebElement btnSavedSearch;

	@FindBy(xpath = ("(//span[text()='Save'])[1]"))
	WebElement saveResumeButton;

	@FindBy(xpath = ("(//span[text()='Unsave'])[1]"))
	WebElement unSaveResumeButton;

	@FindBy(xpath = "//p[text()='Saved']")
	WebElement savedResumeIcon;
	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement UnsavedResumeIcon;

	@FindBy(xpath = "(//button[text()='Filter'])[2]")
	WebElement submitFilter;

	@FindBy(xpath = ("//h1[contains(text(),'Saved Resume Searches & Alerts')]"))
	WebElement headingSavedSearches;

	@FindBy(xpath = ("(//div[contains(@class,'show-arrow')])[1]"))
	WebElement frequencyDropdownIcon;

	@FindBy(xpath = ("(//div[contains(@class,'show-arrow')])[1]"))
	WebElement currentSelectedOption;

	@FindBy(xpath = ("//div[contains(@title,'Daily')]"))
	WebElement optionDaily;

	@FindBy(xpath = ("//div[contains(@title,'Weekly')]"))
	WebElement optionWeekly;

	@FindBy(xpath = ("//div[contains(@title,'Monthly')]"))
	WebElement optionMonthly;

	@FindBy(xpath = ("//span[contains(text(),'Search updated')]"))
	WebElement popupSearchUpdatedSuccessfully;

	@FindBy(xpath = ("(//span[contains(text(),'Edit')])[1]"))
	WebElement btnEdit;

	@FindBy(xpath = "(//span[contains(text(),'Delete')])[1]")
	WebElement deleteBtn;

	@FindBy(xpath = ("//button[contains(text(),'Update')]"))
	WebElement btnUpdate;

	@FindBy(xpath = ("//button[contains(text(),'Cancel')]"))
	WebElement btnCancel;

	@FindBy(xpath = ("//span[contains(text(),'Search saved')]"))
	WebElement popupSearchSaved;

	@FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'])[1]/td[2]/p")
	WebElement searchNameOnSavedSearches;

	@FindBy(xpath = "(//span[text()='Run'])[1]")
	WebElement runBtnOnFirstSearchName;

	@FindBy(xpath = "(//h1[contains(text(),'Saved Resume')])[1] | (//h1[contains(text(),'Resume')])[1]")
	WebElement searchResumeHeader;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter keyword')]")
	WebElement keywordSearchField;

	@FindBy(xpath = "//h1[text()='Resume Search']")
	WebElement resumeSearchTitle;

	@FindBy(xpath = "//button[contains(text(),'Search') and @type ='submit']")
	WebElement searchButtonOnSearchResume;

	@FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'][1]//p)[1]")
	WebElement firstResultAgainstSearch;

	@FindBy(xpath = "//button[contains(text(),'Search') and @type ='button']")
	WebElement saveSearchButtonOnSearchResume;

	@FindBy(xpath = "//div[text()='No Resume Found. Please update your search.'] | //div[text()='No matching resumes were found']")
	WebElement noResumeFound;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchKeywordButton;
	@FindBy(xpath = "//input[contains(@placeholder,'Search Name')]")
	WebElement searchNameInputField;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Name')]")
	WebElement alertSearchNameInputField;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Name')]")
	WebElement searchNameInputFieldCreateAlert;

	@FindBy(xpath = "//input[contains(@placeholder,'Search Keyword')]")
	WebElement searchKeywordInputField;

	@FindBy(xpath = "//input[@id='create-job-form_keyword']")
	WebElement searchKeywordNameInputField;

	@FindBy(xpath = "//button[contains(text(),'Create Alert') and @type='submit']")
	WebElement createAlertBtn;

	@FindBy(xpath = "//button[contains(text(),'Create Alert') and @type='button']")
	WebElement createAlertButton;

	@FindBy(xpath = "(//span[@class='ant-radio']/following-sibling::span)[1]")
	WebElement dailyRadioBtn;

	@FindBy(xpath = "//span[contains(text(),'Search saved')]")
	WebElement searchSavedPopup;

	@FindBy(xpath = "(//button[text()='Filter'])[last()]")
	WebElement filterBtn;

	@FindBy(xpath = "(//button[text()='Filter'])[1]")
	WebElement filterDropDownBtn;

	@FindBy(xpath = "(//button[text()='Reset'])[last()]")
	WebElement resetBtn;

	@FindBy(xpath = "//div[@class='ant-spin ant-spin-spinning']")
	WebElement searchLoader;

	@FindBy(xpath = "//label[@title='Location']/parent::div/following-sibling::div")
	WebElement locationDropdown;
	@FindBy(xpath = "//label[@title='Radius (mi)']/parent::div/following-sibling::div")
	WebElement radiusDropdown;
	@FindBy(xpath = "//label[@title='Education Level']/parent::div/following-sibling::div")
	WebElement educationLevel;
	@FindBy(xpath = "//label[text()='Total Years of Experience']/following-sibling::div[2]")
	WebElement totalYearsOfExperience;
	@FindBy(xpath = "//label[text()='Years of Medical Sales Experience']/following-sibling::div[2]")
	WebElement yearsOfMedicalSalesExperience;
	@FindBy(xpath = "//p[text()='Industry']/parent::div/parent::button")
	WebElement industry;
	@FindBy(xpath = "(//p[text()='Biotechnology'])[last()]")
	WebElement industryValueInTable;
	@FindBy(xpath = "//span[.='Biotechnology']/preceding-sibling::span")
	WebElement bioTechnologyCheckbox;
	@FindBy(xpath = "//p[text()='Function']/parent::div/parent::button")
	WebElement function;
	@FindBy(xpath = "//label[text()='Willing to Travel Up to']/following-sibling::div[2]")
	WebElement willingToTravelUpto;

	@FindBy(xpath = "//span[text()='Open to 1099 Roles']/preceding-sibling::span")
	WebElement openToRolesCheckbox;
	@FindBy(xpath = "//span[text()='Open to 1099 Roles']")
	WebElement openToRolesText;
	@FindBy(xpath = "//span[text()='Willing to Relocate']/preceding-sibling::span")
	WebElement willingToRelocateCheckbox;
	@FindBy(xpath = "//span[text()='Willing to Relocate']")
	WebElement willingToRelocateText;

	@FindBy(xpath = "//form[@id='create-alert-form']")
	WebElement createAlertPopupForm;
	@FindBy(xpath = "//th[text()='Name']/ancestor::table")
	WebElement resumeResultTable;
	@FindBy(xpath = "(//span[text()='View'])[2]")
	WebElement viewActionButton;
	
	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement resumeSaveButton;

	@FindBy(xpath = "//table/tbody/tr/td")
	List<WebElement> dataInResumesTable;
	
	@FindBy(xpath = "(//span[text()='View Saved Resumes'])[1]")
	WebElement viewSavedResumesButton;
	
	@FindBy(xpath = "(//p[text()='Saved'])[1]")
	WebElement savedResumes;
	
	@FindBy(xpath = "(//span[text()='Unsave'])[1]")
	WebElement unsaveResumes;	

	public EmployerResumeSearchPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30", driver);
		waitForElementClickable(btnLogin, "30", driver);
		waitTime(2000, driver);
		click(btnLogin, driver);
		try {
			getRefreshWebPage(driver);
			waitForElementVisibility(btnLogin, "30", driver);
			waitTime(2000, driver);
			waitForElementClickable(btnLogin, "30", driver);
			click(btnLogin, driver);
		} catch (Exception e) {

		}
	}

	public boolean isEmailFieldDisplay(WebDriver driver) {
		return isElementDisplayed(emailAddress, driver);
	}

	public boolean isResumeSearchTitleDisplay(WebDriver driver) {
		waitForElementVisibility(resumeSearchTitle, "30", driver);
		return isElementDisplayed(resumeSearchTitle, driver);
	}

	public boolean isLocationFilterDisplay(WebDriver driver) {
		waitForElementVisibility(locationDropdown, "30", driver);
		return isElementDisplayed(locationDropdown, driver);
	}

	public boolean isRadiusFilterDisplay(WebDriver driver) {
		waitForElementVisibility(radiusDropdown, "30", driver);
		return isElementDisplayed(radiusDropdown, driver);
	}

	public boolean isEducationLevelFilterDisplay(WebDriver driver) {
		waitForElementVisibility(educationLevel, "30", driver);
		return isElementDisplayed(educationLevel, driver);
	}

	public boolean isTotalYearsOfExperienceFilterDisplay(WebDriver driver) {
		waitForElementVisibility(totalYearsOfExperience, "30", driver);
		return isElementDisplayed(totalYearsOfExperience, driver);
	}

	public boolean isYearsOfMedicalSalesExperienceFilterDisplay(WebDriver driver) {
		waitForElementVisibility(yearsOfMedicalSalesExperience, "30", driver);
		return isElementDisplayed(yearsOfMedicalSalesExperience, driver);
	}

	public boolean isIndustryFilterDisplay(WebDriver driver) {
		waitForElementVisibility(industry, "30", driver);
		return isElementDisplayed(industry, driver);
	}

	public boolean isFunctionFilterDisplay(WebDriver driver) {
		waitForElementVisibility(function, "30", driver);
		return isElementDisplayed(function, driver);
	}

	public boolean isWillingToTravelUptoFilterDisplay(WebDriver driver) {
		waitForElementVisibility(willingToTravelUpto, "30", driver);
		return isElementDisplayed(willingToTravelUpto, driver);
	}

	public boolean isOpenToRolesCheckboxFilterDisplay(WebDriver driver) {
		waitForElementVisibility(openToRolesCheckbox, "30", driver);
		return isElementDisplayed(openToRolesCheckbox, driver);
	}

	public boolean isOpenToRolesTextFilterDisplay(WebDriver driver) {
		waitForElementVisibility(openToRolesText, "30", driver);
		return isElementDisplayed(openToRolesText, driver);
	}

	public boolean isWillingToRelocateCheckboxDisplay(WebDriver driver) {
		waitForElementVisibility(willingToRelocateCheckbox, "30", driver);
		return isElementDisplayed(willingToRelocateCheckbox, driver);
	}

	public boolean isWillingToRelocateTextDisplay(WebDriver driver) {
		waitForElementVisibility(willingToRelocateText, "30", driver);
		return isElementDisplayed(willingToRelocateText, driver);
	}

	public void enterEmailAddress(String email, WebDriver driver) {
		waitForElementVisibility(emailAddress, "30", driver);
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

	public void clickOnResumeSearchButton(WebDriver driver) {
//		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(btnResumeSearch, "30", driver);
		click(btnResumeSearch, driver);
	}

	public boolean verifyAllDataIsShowingInTable(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		boolean isShowing = true;

		for (int i = 0; i < dataInResumesTable.size(); i++) {
			if (i < 5) {
				continue;
			}
			System.out.println(dataInResumesTable.get(i).getText());
			System.out.println(i);
			if (dataInResumesTable.get(i).getText().isEmpty()) {
				isShowing = false;
				break;
			} else {
				isShowing = true;
			}
		}
		return isShowing;
	}

	public boolean verifySearchResults(WebDriver driver) {
		waitForElementVisibility(resumeResultTable, "30", driver);
		return resumeResultTable.isDisplayed();
	}

	public void clickOnViewActionButton(WebDriver driver) {
		waitForElementClickable(viewActionButton, "30", driver);
		click(viewActionButton, driver);
	}

	public boolean isFileDownloaded() {
		boolean flag = false;
		String fileName = ".pdf";
		// paste your directory path below
		// eg: C:\\Users\\username\\Downloads
		String dirPath =  System.getProperty("user.dir") + File.separator + "src"+ File.separator + "test"+ File.separator + "resources"+ File.separator + "data"+ File.separator + "tempData"+ File.separator;
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files.length == 0 || files == null) {
			System.out.println("The directory is empty");
			flag = false;
		} else {
			for (File listFile : files) {
				if (listFile.getName().contains(fileName)) {
					System.out.println(fileName + " is present");
					flag = true;
					try {
						FileUtils.forceDelete(listFile);
					} catch (Exception e) {
						// TODO: handle exception
					}
					break;
				}			
			}
		}
		return flag;
	}

	public void clickViewAllAlerts(WebDriver driver) {
		waitTime(5000, driver);
		waitForElementClickable(viewAllAlerts, "30", driver);
		click(viewAllAlerts, driver);
	}

	public void clickViewSavedResumes(WebDriver driver) {
		waitTime(5000, driver);
		waitForElementClickable(viewSavedResumes, "30", driver);
		click(viewSavedResumes, driver);
	}

	public void isSavedResumesPageDisplay(WebDriver driver) {
		waitTime(5000, driver);
		waitForElementClickable(SavedResumes, "30", driver);
		click(SavedResumes, driver);
	}

	public boolean verifySavedAlertsAreShowing(WebDriver driver) {
		waitTime(5000, driver);
		waitForElementVisibility(savedAlertName, "30", driver);
		return savedAlertName.isDisplayed();
	}

	public void selectValueFromIndustryDropdown(WebDriver driver) {
		waitTime(5000, driver);
		waitForElementClickable(industry, "30", driver);
		click(industry, driver);
		waitForElementClickable(bioTechnologyCheckbox, "30", driver);
		click(bioTechnologyCheckbox, driver);
	}

	public String checkIndustryValue(WebDriver driver) {
		waitTime(5000, driver);
		waitForElementVisibility(industryValueInTable, "30", driver);
		return industryValueInTable.getText();
	}

	public boolean isSavedSearchesButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnSavedSearches, driver);
	}

	public boolean isSavedResumesButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnSavedResumes, driver);
	}

	public void clickOnSavedSearchesButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnSavedSearches, "30", driver);
		click(btnSavedSearches, driver);
	}

	public void clickOnSavedResumesButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnSavedResumes, "30", driver);
		click(btnSavedResumes, driver);
	}

	public void clickOnSaveSearchButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnSavedSearch, "30", driver);
		click(btnSavedSearch, driver);
	}

	public void clickOnSaveResumeButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(saveResumeButton, "30", driver);
		click(saveResumeButton, driver);
	}

	public void clickOnUnSaveResumeButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(4000, driver);
		waitForElementClickable(unSaveResumeButton, "30", driver);
		click(unSaveResumeButton, driver);
	}

	public boolean verifyResumeSavedSuccessfully(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(savedResumeIcon, "30", driver);
		return savedResumeIcon.isDisplayed();
	}

	public boolean verifyResumeUnSavedSuccessfully(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(UnsavedResumeIcon, "30", driver);
		return UnsavedResumeIcon.isDisplayed();
	}

	public void clickSubmitFilterButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(submitFilter, "30", driver);
		click(submitFilter, driver);
	}

	public boolean isPageHeadingSavedSearchesDisplay(WebDriver driver) {
		return isElementDisplayed(headingSavedSearches, driver);
	}

	public void clickOnFrequencyDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(frequencyDropdownIcon, "30", driver);
		click(frequencyDropdownIcon, driver);
	}

	public void selectDailyOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(optionDaily, "30", driver);
		click(optionDaily, driver);
	}

	public void selectWeeklyOption(WebDriver driver) {
		try {
			String currentSelectedField = getElementText(currentSelectedOption, driver);
			String weekly = "Weekly";
			if (currentSelectedField.equals(weekly)) {
//			clickOnFrequencyDropdownIcon(driver);
//			waitTime(3000);
				selectMonthlyOption(driver);
				clickOnFrequencyDropdownIcon(driver);
				waitforPageLoad(30, driver);
				waitForElementClickable(optionWeekly, "30", driver);
				click(optionWeekly, driver);
			} else {
//			waitTime(3000);
//			clickOnFrequencyDropdownIcon(driver);
				waitforPageLoad(30, driver);
				waitForElementClickable(optionWeekly, "30", driver);
				click(optionWeekly, driver);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void selectMonthlyOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(optionMonthly, "30", driver);
		click(optionMonthly, driver);
	}

	public boolean isSearchUpdatedSuccessfullyPopupDisplay(WebDriver driver) {
		return isElementDisplayed(popupSearchUpdatedSuccessfully, driver);
	}

	public void clickOnEditButton(WebDriver driver) {
		waitForElementClickable(btnEdit, "30", driver);
		click(btnEdit, driver);
	}

	public void clickOnDeleteButton(WebDriver driver) {
		waitForElementClickable(deleteBtn, "30", driver);
		click(deleteBtn, driver);
	}

	public void clickOnUpdateButton(WebDriver driver) {
		waitForElementClickable(btnUpdate, "30", driver);
		click(btnUpdate, driver);
	}

	public boolean isUpdateButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnUpdate, driver);
	}

	public boolean isCancelButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnCancel, driver);
	}

	public boolean isSearchSavedPopupDisplay(WebDriver driver) {
		return isElementDisplayed(popupSearchSaved, driver);
	}

	public String searchName(WebDriver driver) {
		return getElementText(searchNameOnSavedSearches, driver);
	}

	public boolean verifySearchName(String val, WebDriver driver) {
		try {
			WebElement element = driver.findElement(
					By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]/td[2]/p[text()='" + val + "']"));
			return isElementDisplayed(element, driver);
		} catch (Exception e) {
			return true;
		}
	}

	public void clickRunBtnOnFirstSearchName(WebDriver driver) {
		waitForElementClickable(runBtnOnFirstSearchName, "20", driver);
		click(runBtnOnFirstSearchName, driver);
	}

	public boolean verifySearchResumeHeader(WebDriver driver) {
		return isElementDisplayed(searchResumeHeader, driver);
	}

	public void EnterKeywordInSearchField(String val, WebDriver driver) {
		type(keywordSearchField, val, driver);
	}

	public void clickSearchButtonOnSearchResume(WebDriver driver) {
		waitForElementClickable(searchKeywordButton, "20", driver);
		click(searchKeywordButton, driver);
	}

	public boolean verifyNoResumeFoundMessage(WebDriver driver) {
		waitForElementVisibility(noResumeFound, "30", driver);
		return noResumeFound.isDisplayed();
	}

	public void isLoaderShownUp(WebDriver driver) {
		waitForElementVisibility(searchLoader, "30", driver);
		wait.until(ExpectedConditions.invisibilityOf(searchLoader));
	}

	public String getSearchResult(WebDriver driver) {
		return getElementText(firstResultAgainstSearch, driver);
	}

	public void clickSaveSearchButtonOnSearchResume(WebDriver driver) {
		waitForElementClickable(saveSearchButtonOnSearchResume, "30", driver);
		click(saveSearchButtonOnSearchResume, driver);
	}

	public void enterSearchName(String val, WebDriver driver) {
		type(alertSearchNameInputField, val, driver);
	}

	public void enterSearchNameCreateAlert(String val, WebDriver driver) {
		type(searchNameInputFieldCreateAlert, val, driver);
	}

	public void enterKeywordSearchName(String val, WebDriver driver) {
		waitForElementVisibility(searchKeywordNameInputField, "30", driver);
		type(searchKeywordNameInputField, val, driver);
	}

	public void clickCreateAlertBtn(WebDriver driver) {
		waitForElementClickable(createAlertBtn, "30", driver);
		click(createAlertBtn, driver);
	}

	public void clickCreateAlertButton(WebDriver driver) {
		waitForElementClickable(createAlertButton, "30", driver);
		click(createAlertButton, driver);
	}

	public boolean isCreateAlertPopupDisplaying(WebDriver driver) {
		waitForElementVisibility(createAlertPopupForm, "30", driver);
		return createAlertBtn.isDisplayed();
	}

	public void clickDailyRadioBtn(WebDriver driver) {
		waitForElementClickable(dailyRadioBtn, "30", driver);
		click(dailyRadioBtn, driver);
	}

	public boolean verifySearchSavedPopup(WebDriver driver) {
		return isElementDisplayed(searchSavedPopup, driver);
	}

	public void clickResetButton(WebDriver driver) {
		waitForElementClickable(resetBtn, "30", driver);
		click(resetBtn, driver);
	}

	public boolean verifyFilterResetButtonDisplay(WebDriver driver) {
		boolean flag = false;
		try {
			if (isElementDisplayed(resetBtn, driver)) {
				flag = true;
			}
		} catch (Exception e) {

		}
		return flag;
	}

	public void clickFilterDropDownBtn(WebDriver driver) {
		waitForElementClickable(filterDropDownBtn, "20", driver);
		click(filterDropDownBtn, driver);
	}
	
	public void clickResumeSaveButton(WebDriver driver) {
		waitForElementClickable(viewSavedResumesButton, "20", driver);
		click(resumeSaveButton, driver);
	}
	
	public void clickViewSavedResumesButton(WebDriver driver) {
		waitForElementClickable(viewSavedResumesButton, "20", driver);
		click(viewSavedResumesButton, driver);
	}
	
	public boolean verifySavedResumesDisplay(WebDriver driver) {
		boolean flag = false;
		try {
			waitForElementVisibility(savedResumes, "30", driver);
			flag = true;
		} catch (Exception e) {
		}
		return flag;
	}

	public void clickUnaveResumesButton(WebDriver driver) {
		waitForElementClickable(unsaveResumes, "20", driver);
		click(unsaveResumes, driver);
	}
	

}
