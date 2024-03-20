package com.medrep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerDashBoardPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = "//span[contains(text(),'Job expired')]")
	WebElement jobExpiredSuccessfullyMessage;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("//p[contains(text(),'Active Jobs')]"))
	WebElement activeJobsSection;

	@FindBy(xpath = ("//p[contains(text(),'Total Applications')]"))
	WebElement totalApplicationsSection;

	@FindBy(xpath = ("//p[contains(text(),'Job Views')]"))
	WebElement jobViewsSection;

	@FindBy(xpath = ("//h1[contains(text(),'Recent Jobs')]"))
	WebElement recentJobsHeading;

	@FindBy(xpath = ("//h1[contains(text(),'Recent Jobs')]/..//following-sibling::a//button"))
	WebElement btnViewAll;

	@FindBy(xpath = ("//th[text()='Title']/parent::tr/parent::thead/parent::table\n"))
	WebElement yourJobsTable;

	@FindBy(xpath = ("//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div[last()]"))
	WebElement recentJobsTable;

	@FindBy(xpath = ("//*[contains(text(),'Resume Alerts')] | //h1[contains(text(),'Resume Search')] | //h1[contains(text(),'Search Resume')] | //div[contains(text(),'Saved Resume')]"))
	WebElement resumeSearchHeading;

	@FindBy(xpath = "(//span[text()='Resume Search'])[2]")
	WebElement resumeSearchSideTabButton;

	@FindBy(xpath = "(//th[contains(text(),'Applications')]/../../following-sibling::tbody/tr[position()>1]/td[4]/a/p)[1]")
	WebElement applicationBtnUnderRecentJobs;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement updateButton;

	@FindBy(xpath = ("//h1[contains(text(),'Resume Alerts')]/..//following-sibling::a//button"))
	WebElement btnNewSearch;

	@FindBy(xpath = ("//h1[contains(text(),'Resume Alerts')]/../..//following-sibling::div"))
	WebElement resumeSearchTable;

	@FindBy(xpath = ("//h1[contains(text(),'Company Profile')]"))
	WebElement companyProfileHeading;

	@FindBy(xpath = ("//h1[contains(text(),'Company Profile')]/..//following-sibling::a//button"))
	WebElement btnCompanyProfileEdit;

	@FindBy(xpath = ("//h1[contains(text(),'Company Profile')]/../..//following-sibling::div"))
	WebElement companyProfileTable;

	@FindBy(xpath = ("//p[contains(text(),'Total Active jobs Today')]"))
	WebElement labelTotalActiveJobsToday;

	@FindBy(xpath = ("//p[contains(text(),'Active Jobs')]/..//following-sibling::div"))
	WebElement statusbarActiveJobs;

	@FindBy(xpath = ("//p[contains(text(),'Total Applications Today')]"))
	WebElement labelTotalApplicationsToday;

	@FindBy(xpath = ("//p[contains(text(),'Total Applications')]/..//following-sibling::div"))
	WebElement statusbarTotalApplications;

	@FindBy(xpath = ("//p[contains(text(),'Total Job Views Today')]"))
	WebElement labelTotalJobViewsToday;

	@FindBy(xpath = ("//p[contains(text(),'Job Views')]/..//following-sibling::div"))
	WebElement statusbarJobViews;

	@FindBy(xpath = ("//th[contains(text(),'Title')]"))
	WebElement tableCellHeadingTitle;

	@FindBy(xpath = ("//th[contains(text(),'Location')]"))
	WebElement tableCellHeadingLocation;

	@FindBy(xpath = "//th[contains(text(),'Job Status')]")
	WebElement tableCellHeadingJobStatus;

	@FindBy(xpath = ("//th[contains(text(),'Views')]"))
	WebElement tableCellHeadingViews;

	@FindBy(xpath = ("//th[contains(text(),'Applications')]"))
	WebElement tableCellHeadingApplications;

	@FindBy(xpath = ("//th[contains(text(),'Featured')]"))
	WebElement tableCellHeadingFeatured;

	@FindBy(xpath = ("//th[contains(text(),'Posted')]"))
	WebElement tableCellHeadingPosted;

	@FindBy(xpath = ("//th[contains(text(),'Expiry')]"))
	WebElement tableCellHeadingExpires;

	@FindBy(xpath = ("//th[contains(text(),'Posted By')]"))
	WebElement tableCellHeadingPostedBy;

	@FindBy(xpath = ("//th[contains(text(),'Action')]"))
	WebElement tableCellHeadingAction;

	@FindBy(xpath = ("(//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div//tbody//tr//p[contains(text(),'Edit')])[1]/.."))
	WebElement recentJobsTableActionCellEditButton;

	@FindBy(xpath = ("(//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div//tbody//tr//span[contains(text(),'Copy')])[1]"))
	WebElement recentJobsTableActionCellCopyButton;

	@FindBy(xpath = ("(//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div[last()]/div//tbody//div/div/span)[1]"))
	WebElement recentJobsTableActionCellFeaturedButton;

	@FindBy(xpath = ("(//table/tbody/tr[2]/td[9]/div/div[2]/span)[1]"))
	WebElement recentJobsTableActionCellFeatureButton;

	@FindBy(xpath = "//p[contains(text(),'currently have any featured job credits')]")
	WebElement noCreditPopup;
	@FindBy(xpath = ("//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div//tbody//tr[2]/td[9]/div/p"))
	WebElement recentJobsTableActionCellExpireButton;

	@FindBy(xpath = ("(//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div//tbody//tr//p[contains(text(),'Expire')])[1]/.. | (//h1[contains(text(),'Recent Jobs')]/../..//following-sibling::div//tbody//tr//p[contains(text(),'Delete')])[1]/.."))
	WebElement recentJobsTableActionCellDeleteButton;

	@FindBy(xpath = ("(//*[text()='Expire'])[1]"))
	WebElement recentJobDeleteButton;

	@FindBy(xpath = ("//h1[contains(text(),'Manage Jobs')]"))
	WebElement labelManageJobs;

	@FindBy(xpath = ("//div[contains(text(),'Saved Resume')] | //div[contains(text(),'Resume')]"))
	WebElement labelSearchResume;

	@FindBy(xpath = ("//div[contains(text(),'Company Profile')]"))
	WebElement labelCompanyProfile;

	@FindBy(xpath = ("//h1[contains(text(),'Edit A Job')]"))
	WebElement headingEditJob;

	@FindBy(xpath = ("//b[contains(text(),'Upgrade Job')]"))
	WebElement headingUpgradeJob;

	@FindBy(xpath = ("(//h1[contains(text(),'Resume Alerts')]/../..//following-sibling::div//tbody//tr//span[contains(text(),'Edit')])[1]"))
	WebElement resumeSearchTableActionCellEditButton;

	@FindBy(xpath = ("(//h1[contains(text(),'Resume Alerts')]/../..//following-sibling::div//tbody//tr//p[contains(text(),'Run')])[1]/.."))
	WebElement resumeSearchTableActionCellRunButton;

	@FindBy(xpath = ("(//h1[contains(text(),'Resume Alerts')]/../..//following-sibling::div//tbody//tr//p[contains(text(),'Delete')])[1]"))
	WebElement resumeSearchTableActionCellDeleteButton;

	@FindBy(xpath = ("//th[contains(text(),'Search Name')]"))
	WebElement tableCellHeadingSearchName;

	@FindBy(xpath = ("//th[contains(text(),'Keyword')]"))
	WebElement tableCellHeadingKeyword;

	@FindBy(xpath = ("//th[contains(text(),'Frequency')]"))
	WebElement tableCellHeadingFrequency;

	@FindBy(xpath = ("//th[contains(text(),'Created on')]"))
	WebElement tableCellHeadingCreatedon;

	@FindBy(xpath = ("(//h1[contains(text(),'Company Profile')]/../..//following-sibling::div//div//div)[1]"))
	WebElement companyLogo;

	@FindBy(xpath = ("(//h1[contains(text(),'Company Profile')]/../..//following-sibling::div//div//div)[3]//p"))
	WebElement companyName;

	@FindBy(xpath = ("//p[text()='About']"))
	WebElement labelAbout;

	@FindBy(xpath = ("//p[contains(text(),'Address')]"))
	WebElement labelAddress;

	@FindBy(xpath = ("//p[contains(text(),'Website')]"))
	WebElement labelWebsite;

	@FindBy(xpath = ("//h1[contains(text(),'Resume Alerts')]/../..//following-sibling::div//tbody//tr[2]/td[3]//span[2]"))
	WebElement frequencyDropdown;

	@FindBy(xpath = ("//div[contains(@title,'Daily')]"))
	WebElement optionDaily;

	@FindBy(xpath = ("//div[contains(@title,'Weekly')]"))
	WebElement optionWeekly;

	@FindBy(xpath = ("//div[contains(@title,'Monthly')]"))
	WebElement optionMonthly;

	@FindBy(xpath = ("(//span[text()='Dashboard'])[last()] | (//a[text()='DASHBOARD '])[last()]"))
	WebElement btnDashboard;

	@FindBy(xpath = ("//button[text()='Purchase']"))
	WebElement btnPurchase;

	@FindBy(xpath = "//button[text()='Make payment']")
	WebElement makePaymentButton;

	@FindBy(xpath = "(//h1[text()='Resume Alerts']/../../following-sibling::div//p[contains(text(),'Run')])[1]")
	WebElement runBtnUnderResumeSearch;

	@FindBy(xpath = "(//h1[text()='Resume Alerts']/../../following-sibling::div//p[contains(text(),'Delete')])[1]")
	WebElement deleteBtnUnderResumeSearch;

	@FindBy(xpath = "((//*[text()='Expire'])[1]")
	WebElement deleteBtnUnderRecentJobs;

	@FindBy(xpath = "//*[contains(text(),'Search has been deleted')] | //*[contains(text(),'Search deleted successfully')] | //*[contains(text(),'Job deleted successfully')]")
	WebElement searchDeletedSuccessfullyMessage;

	@FindBy(xpath = "//h1[contains(text(),'Applications')]")
	WebElement applicationsHeader;

	@FindBy(xpath = "//th[contains(text(),'Candidate Name')]")
	WebElement candidateNameLabelOnApplicationPage;

	@FindBy(xpath = "//th[contains(text(),'Applied on')]")
	WebElement appliedOnLabelOnApplicationPage;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesButton;

	@FindBy(xpath = "//th[contains(text(),'Status')]")
	WebElement statusLabelOnApplicationPage;

	@FindBy(xpath = "//th[contains(text(),'Action')]")
	WebElement actionLabelOnApplicationPage;

	@FindBy(xpath = "//li[contains(@title,'Previous Page')]")
	WebElement previousPageBtn;

	@FindBy(xpath = "//li[contains(@title,'Next Page')]")
	WebElement nextPageBtn;

	@FindBy(xpath = "//a[contains(@rel,'nofollow')]")
	WebElement pageNumberOnApplicationPage;

	@FindBy(xpath = "(//p[contains(text(),'View')])[1]")
	WebElement viewBtnUnderAction;

	@FindBy(xpath = "//input[@id='candidate-profile-form_name']")
	WebElement nameFieldOnApplicationDetailsPage;

	@FindBy(xpath = "//input[@id='candidate-profile-form_email']")
	WebElement emailFieldOnApplicationDetailsPage;

	@FindBy(xpath = "//span[text()='Featured Job Credits']/following-sibling::p")
	WebElement featuredCreditCount;

	@FindBy(xpath = "(//span[text()='Account'])[2]")
	WebElement accountTab;

	@FindBy(xpath = "//button[text()='Buy Credits']")
	WebElement buyCreditButton;

	@FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
	WebElement payButton;

	@FindBy(xpath = "//h1[text()='Account']")
	WebElement accountTitle;

	@FindBy(xpath = "(//h1[contains(text(),'Choose your job posting plan')])[1]")
	WebElement membershipPageHeader;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButtonOnEditPopupInResumeSearchTable;

	@FindBy(xpath = "//input[@id='create-alert-form_searchName']")
	WebElement searchNameFieldOnEditPopup;

	@FindBy(xpath = "//span[text()='Search saved']")
	WebElement savedSearchAlert;

	@FindBy(xpath = "//input[@id = 'candidate-form_name']")
	WebElement companyNameField;

	@FindBy(xpath = "//input[@id = 'candidate-form_company_email']")
	WebElement companyEmailAddress;

	@FindBy(xpath = "//input[@id = 'candidate-form_phone']")
	WebElement companyPhoneNumber;

	@FindBy(xpath = "//input[@id = 'candidate-form_website']")
	WebElement companyWebsite;

	@FindBy(xpath = "(//div/p)[2]")
	WebElement companyAboutField;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement companyProfileSaveButton;

	@FindBy(xpath = "//span[text()='Update cancelled']")
	WebElement cancelUpdateAlert;

	@FindBy(xpath = "")
	WebElement hamburgerIcon;

	@FindBy(xpath = "(//div[text()='No Data'])[1]")
	WebElement noData;

	@FindBy(xpath = "//span[contains(@class,'ant-avatar-square')]")
	WebElement profile;

	@FindBy(xpath = "(//div[@title='Weekly'])[last()]")
	WebElement frequencyDropdownWeeklyOption;

	@FindBy(xpath = "(//h1[contains(text(),'Resume Alerts')]/../..//following::td/div/div/span[text()='Weekly'])[1]")
	WebElement updatedFrequencyToWeek;
	
	@FindBy(xpath = "(//span[text()='Feature'])[last()]")
	WebElement featureBtn;
	
	@FindBy(xpath = "//a[text()='here']")
	WebElement featurePopup;

	public EmployerDashBoardPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30", driver);
		waitTime(2000, driver);
		waitForElementClickable(btnLogin, "30", driver);
		click(btnLogin, driver);
//		try {
//			getRefreshWebPage(driver);
//			waitForElementVisibility(btnLogin, "30",driver);
//			waitTime(2000,driver);
//			waitForElementClickable(btnLogin,"30",driver);
//			click(btnLogin,driver);
//		}catch(Exception e) {
//
//		}
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

	public boolean isFeaturedButtonDisabled(WebDriver driver) {
		waitForElementVisibility(recentJobsTableActionCellFeatureButton, "30", driver);
		click(recentJobsTableActionCellFeatureButton, "30", driver);
		waitForElementVisibility(noCreditPopup, "15", driver);
		return noCreditPopup.isDisplayed();
	}

	public void clickOnUpdateButton(WebDriver driver) {
		waitForElementVisibility(updateButton, "30", driver);
		scrollIntoViewSmoothly(updateButton, driver);
		click(updateButton, driver);
	}

	public boolean isActiveJobsSectionDisplay(WebDriver driver) {
		waitForElementVisibility(activeJobsSection, "30", driver);
		return isElementDisplayed(activeJobsSection, driver);
	}

	public boolean isTotalApplicationsSectionDisplay(WebDriver driver) {
		waitForElementVisibility(totalApplicationsSection, "30", driver);
		return isElementDisplayed(totalApplicationsSection, driver);
	}

	public boolean isJobViewsSectionDisplay(WebDriver driver) {
		waitForElementVisibility(jobViewsSection, "30", driver);
		return isElementDisplayed(jobViewsSection, driver);
	}

	public boolean isRecentJobsTableHeadingDisplay(WebDriver driver) {
		waitForElementVisibility(recentJobsHeading, "30", driver);
		return isElementDisplayed(recentJobsHeading, driver);
	}

	public boolean isViewAllButtonOfRecentJobsTableDisplay(WebDriver driver) {
		return isElementDisplayed(btnViewAll, driver);
	}

	public boolean isYourJobsTableDisplayed(WebDriver driver) {
		waitForElementVisibility(yourJobsTable, "30", driver);
		return isElementDisplayed(yourJobsTable, driver);
	}

	public boolean isRecentJobsTableDisplay(WebDriver driver) {
		waitForElementVisibility(recentJobsTable, "90", driver);
		return isElementDisplayed(recentJobsTable, driver);
	}

	public boolean isSavedSearchAlertDisplay(WebDriver driver) {
		waitForElementVisibility(savedSearchAlert, "30", driver);
		return isElementDisplayed(savedSearchAlert, driver);
	}

	public boolean isDeleteSearchAlertDisplay(WebDriver driver) {
		waitForElementVisibility(searchDeletedSuccessfullyMessage, "30", driver);
		return isElementDisplayed(searchDeletedSuccessfullyMessage, driver);
	}

	public boolean isResumeSearchTableHeadingDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(resumeSearchHeading, driver);
		waitTime(2000, driver);
		return isElementDisplayed(resumeSearchHeading, driver);
	}

	public boolean isNewSearchButtonOfResumeSearchTableDisplay(WebDriver driver) {
		return isElementDisplayed(btnNewSearch, driver);
	}

	public boolean isResumeSearchTableDisplay(WebDriver driver) {
		return isElementDisplayed(resumeSearchTable, driver);
	}

	public boolean isCompanyProfileHeadingDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(companyProfileHeading, driver);
		waitTime(2000, driver);
		return isElementDisplayed(companyProfileHeading, driver);
	}

	public boolean isEditButtonOfCompanyProfileDisplay(WebDriver driver) {
		return isElementDisplayed(btnCompanyProfileEdit, driver);
	}

	public boolean isCompanyProfileTableDisplay(WebDriver driver) {
		return isElementDisplayed(companyProfileTable, driver);
	}

	public boolean isTotalActiveJobsTodayLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelTotalActiveJobsToday, driver);
	}

	public boolean isActiveJobsStatusBarDisplay(WebDriver driver) {
		return isElementDisplayed(statusbarActiveJobs, driver);
	}

	public boolean isTotalApplicationsTodayLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelTotalApplicationsToday, driver);
	}

	public boolean isTotalApplicationsStatusBarDisplay(WebDriver driver) {
		return isElementDisplayed(statusbarTotalApplications, driver);
	}

	public boolean isTotalJobViewsTodayLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelTotalJobViewsToday, driver);
	}

	public boolean isJobsViewStatusBarDisplay(WebDriver driver) {
		return isElementDisplayed(statusbarJobViews, driver);
	}

	public boolean isTabelCellHeadingTitleDisplay(WebDriver driver) {
		waitForElementVisibility(tableCellHeadingTitle, "30", driver);
		return isElementDisplayed(tableCellHeadingTitle, driver);
	}

	public boolean isTabelCellHeadingLocationDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingLocation, driver);
	}

	public boolean isTabelCellHeadingJobStatusDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingJobStatus, driver);
	}

	public boolean isTabelCellHeadingViewsDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingViews, driver);
	}

	public boolean isTabelCellHeadingPostedDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingPosted, driver);
	}

	public boolean isTabelCellHeadingApplicationDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingApplications, driver);
	}

	public boolean isTabelCellHeadingFeaturedDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingFeatured, driver);
	}

	public String getFeaturedJobCreditCount() {
//		System.out.println("Hello"+featuredCreditCount.getText());
		return featuredCreditCount.getText();
	}

	public void buyFeaturedCredit(WebDriver driver) {
		waitForElementVisibility(accountTab, "30", driver);
		waitForElementClickable(accountTab, "30", driver);
		click(accountTab, driver);
		waitForElementVisibility(buyCreditButton, "60", driver);
		waitForElementClickable(buyCreditButton, "60", driver);
		click(buyCreditButton, driver);
		waitForElementVisibility(payButton, "60", driver);
		waitForElementClickable(payButton, "60", driver);
		click(payButton, driver);
		waitForElementVisibility(accountTitle, "90", driver);
		click(btnDashboard, driver);

	}

	public boolean isAccountPageShown(WebDriver driver) {
		waitForElementVisibility(accountTitle, "90", driver);
		return accountTitle.isDisplayed();
	}

	public boolean isTabelCellHeadingExpiresDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingExpires, driver);
	}

	public boolean isTabelCellHeadingPostedByDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingPostedBy, driver);
	}

	public boolean isTabelCellHeadingActionDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingAction, driver);
	}

	public boolean isRecentJobsTabelActionCellEditButtonDisplay(WebDriver driver) {
		waitForElementVisibility(recentJobsTableActionCellEditButton, "30", driver);
		return isElementDisplayed(recentJobsTableActionCellEditButton, driver);
	}

	public boolean isRecentJobsTabelActionCellCopyButtonDisplay(WebDriver driver) {
		waitForElementVisibility(recentJobsTableActionCellCopyButton, "30", driver);
		return isElementDisplayed(recentJobsTableActionCellCopyButton, driver);
	}

	public boolean isRecentJobsTabelActionCellExpireButtonDisplay(WebDriver driver) {
		waitForElementVisibility(recentJobsTableActionCellExpireButton, "30", driver);
		return isElementDisplayed(recentJobsTableActionCellExpireButton, driver);
	}

	public boolean isRecentJobsTabelActionCellFeaturedButtonDisplay(WebDriver driver) {
		waitForElementVisibility(recentJobsTableActionCellFeatureButton, "30", driver);
		return isElementDisplayed(recentJobsTableActionCellFeatureButton, driver);
	}

	public boolean isRecentJobsTabelActionCellFeatureButtonDisplay(WebDriver driver) {
		return isElementDisplayed(recentJobsTableActionCellFeatureButton, driver);
	}

	public boolean isRecentJobsTabelActionCellDeleteButtonDisplay(WebDriver driver) {
		return isElementDisplayed(recentJobsTableActionCellDeleteButton, driver);
	}

	public void clickOnViewAllButtonOfRecentJobs(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnViewAll, "30", driver);
		click(btnViewAll, driver);
	}

	public boolean isManageJobsLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelManageJobs, driver);
	}

	public void clickOnNewSearchButtonOfResumeSearchTable(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnNewSearch, "30", driver);
		click(btnNewSearch, driver);
	}

	public void clickOnActionEditInResumeSearchTable(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(resumeSearchTableActionCellEditButton, "30", driver);
		click(resumeSearchTableActionCellEditButton, driver);
	}

	public void enterSearchNameOnEditPopup(WebDriver driver, String name) {
		waitforPageLoad(30, driver);
		waitForElementClickable(searchNameFieldOnEditPopup, "30", driver);
		sendKeysToWebElement(searchNameFieldOnEditPopup, name, driver);
	}

	public void clickOnCancelButtonInEditPopup(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(cancelButtonOnEditPopupInResumeSearchTable, "30", driver);
		click(cancelButtonOnEditPopupInResumeSearchTable, driver);
	}

	public void isCancelAlertDisplays(WebDriver driver) {
		waitForElementVisibility(cancelUpdateAlert, "30", driver);
		cancelUpdateAlert.isDisplayed();
	}

	public boolean isSearchResumeLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelSearchResume, driver);
	}

	public void clickOnEditButtonOfCompanyProfileTable(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(2000, driver);
		click(btnCompanyProfileEdit, driver);
	}

	public boolean isCompanyProfileLabelDisplay(WebDriver driver) {
		waitforPageLoad(30, driver);
		try {
			waitForElementVisibility(labelCompanyProfile, defaultWaitTime, driver);
			return isElementDisplayed(labelCompanyProfile, driver);
			
		} catch (Exception e) {
			return isElementDisplayed(labelCompanyProfile, driver);
		}
	}

	public void clickOnRecentJobsTabelActionCellEditButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(recentJobsTableActionCellEditButton, "30", driver);
		click(recentJobsTableActionCellEditButton, driver);
	}

	public void clickOnRecentJobsTabelActionCellCopyButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(recentJobsTableActionCellCopyButton, "30", driver);
		click(recentJobsTableActionCellCopyButton, driver);
	}

	public void clickOnRecentJobsTabelActionCellFeaturedButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(recentJobsTableActionCellFeaturedButton, "30", driver);
		click(recentJobsTableActionCellFeaturedButton, driver);
	}

	public boolean isPageHeadingEditJobDisplay(WebDriver driver) {
		return isElementDisplayed(headingEditJob, driver);
	}

	public void clickOnRecentJobsTabelActionCellFeatureButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(recentJobsTableActionCellFeaturedButton, "30", driver);
		click(recentJobsTableActionCellFeaturedButton, driver);
	}

	public void clickOnRecentJobsTabelActionCellExpireButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(recentJobsTableActionCellExpireButton, "30", driver);
		click(recentJobsTableActionCellExpireButton, driver);
	}

	public boolean isJobExpiredSuccessfullyNotificationMessageDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(jobExpiredSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(jobExpiredSuccessfullyMessage, driver);
		} catch (Exception e) {
			waitForElementVisibility(jobExpiredSuccessfullyMessage, defaultWaitTime, driver);
			return isElementDisplayed(jobExpiredSuccessfullyMessage, driver);
		}
	}

	public void acceptFeaturedPopup(WebDriver driver) {
		waitForElementVisibility(yesButton, defaultWaitTime, driver);
		waitForElementClickable(yesButton, "30", driver);
		click(yesButton, driver);
	}

	public boolean isPageHeadingUpgradeJobDisplay(WebDriver driver) {
		return isElementDisplayed(headingUpgradeJob, driver);
	}

	public boolean isResumeSearchTabelActionCellEditButtonDisplay(WebDriver driver) {
		waitForElementVisibility(resumeSearchTableActionCellEditButton, "30", driver);
		return isElementDisplayed(resumeSearchTableActionCellEditButton, driver);
	}

	public boolean isResumeSearchTabelActionCellRunButtonDisplay(WebDriver driver) {
		waitForElementVisibility(resumeSearchTableActionCellRunButton, "30", driver);
		return isElementDisplayed(resumeSearchTableActionCellRunButton, driver);
	}

	public boolean isResumeSearchTabelActionCellDeleteButtonDisplay(WebDriver driver) {
		waitForElementVisibility(resumeSearchTableActionCellDeleteButton, "30", driver);
		return isElementDisplayed(resumeSearchTableActionCellDeleteButton, driver);
	}

	public boolean isTabelCellHeadingSearchNameDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingSearchName, driver);
	}

	public boolean isTabelCellHeadingKeywordDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingKeyword, driver);
	}

	public boolean isTabelCellHeadingFrequencyDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingFrequency, driver);
	}

	public boolean isTabelCellHeadingCreatedonDisplay(WebDriver driver) {
		return isElementDisplayed(tableCellHeadingCreatedon, driver);
	}

	public boolean isCompanyLogoDisplay(WebDriver driver) {
		return isElementDisplayed(companyLogo, driver);
	}

	public String getCompanyName(WebDriver driver) {
		return getElementText(companyName, driver);
	}

	public boolean isCompanyNameDisplay(WebDriver driver) {
		return isElementDisplayed(companyName, driver);
	}

	public boolean isAboutLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelAbout, driver);
	}

	public boolean isAddressLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelAddress, driver);
	}

	public boolean isWebsiteLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelWebsite, driver);
	}

	public void clickOnResumeSearchTableFrequencyDropdown(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(frequencyDropdown, driver);
		waitTime(2000, driver);
		waitForElementClickable(frequencyDropdown, "30", driver);
		click(frequencyDropdown, driver);
	}

	public boolean isDailyOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionDaily, driver);
	}

	public boolean isWeeklyOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionWeekly, driver);
	}

	public boolean isMonthlyOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionMonthly, driver);
	}

	public void clickOnDashboardButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnDashboard, "30", driver);
		click(btnDashboard, driver);
	}

	public boolean isPurchaseButtonEnabled(WebDriver driver) {
		waitforPageLoad(30, driver);
		return btnPurchase.isEnabled();
	}

	public void clickOnPaymentButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(makePaymentButton, "30", driver);
		click(makePaymentButton, driver);

	}

	public void clickOnPurchaseButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnPurchase, "30", driver);
		click(btnPurchase, driver);
	}

	public void clickOnResumeButtonFromDashboard(WebDriver driver) {
		waitForElementClickable(resumeSearchSideTabButton, "30", driver);
		click(resumeSearchSideTabButton, driver);
	}

	public boolean verifyUserIsNavigatedToMembershipPage(WebDriver driver) {
		waitforPageLoad(30, driver);
		return membershipPageHeader.isDisplayed();
	}

	public void clickOnDeleteButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(recentJobsTableActionCellDeleteButton, "30", driver);
		click(btnDashboard, driver);
	}

	public boolean verifyResumeDisplayiing(WebDriver driver) {
		try {
			waitForElementVisibility(runBtnUnderResumeSearch, "20", driver);
			return isElementDisplayed(runBtnUnderResumeSearch, driver);
		} catch (Exception e) {
			return false;
		}
	}

	public void clickRunButtonUnderResumeSearch(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(runBtnUnderResumeSearch, "20", driver);
		waitForElementClickable(runBtnUnderResumeSearch, "30", driver);
		click(runBtnUnderResumeSearch, driver);
	}

	public void clickDeleteBtnUnderResumeSearch(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(deleteBtnUnderResumeSearch, "20", driver);
		waitForElementClickable(deleteBtnUnderResumeSearch, "30", driver);
		click(deleteBtnUnderResumeSearch, driver);
	}

	public boolean verfiySearchDeletedSuccessfullyMessageDisplay(WebDriver driver) {
		return isElementDisplayed(searchDeletedSuccessfullyMessage, driver);
	}

	public void clickApplicationBtnUnderRecentJobs(WebDriver driver) {
		waitForElementVisibility(applicationBtnUnderRecentJobs, "20", driver);
		waitForElementClickable(applicationBtnUnderRecentJobs, "30", driver);
		click(applicationBtnUnderRecentJobs, driver);
	}

	public void clickviewBtnUnderAction(WebDriver driver) {
		waitForElementVisibility(viewBtnUnderAction, "20", driver);
		waitForElementClickable(viewBtnUnderAction, "30", driver);
		click(viewBtnUnderAction, driver);
	}

	public boolean verifyActionLabelOnApplicationPage(WebDriver driver) {
		return isElementDisplayed(actionLabelOnApplicationPage, driver);
	}

	public boolean verifyApplicationsHeader(WebDriver driver) {
		return isElementDisplayed(applicationsHeader, driver);
	}

	public boolean verifyCandidateNameLabelOnApplicationPage(WebDriver driver) {
		return isElementDisplayed(candidateNameLabelOnApplicationPage, driver);
	}

	public boolean verifyAppliedOnLabelOnApplicationPage(WebDriver driver) {
		return isElementDisplayed(appliedOnLabelOnApplicationPage, driver);
	}

	public boolean verifyStatusLabelOnApplicationPage(WebDriver driver) {
		return isElementDisplayed(statusLabelOnApplicationPage, driver);
	}

	public boolean verifyPreviousPageBtn(WebDriver driver) {
		return isElementDisplayed(previousPageBtn, driver);
	}

	public boolean verifyNextPageBtn(WebDriver driver) {
		return isElementDisplayed(nextPageBtn, driver);
	}

	public boolean verifyPageNumberOnApplicationPage(WebDriver driver) {
		return isElementDisplayed(pageNumberOnApplicationPage, driver);
	}

	public boolean verifyNameFieldIsDisabled(WebDriver driver) {
		boolean flag = false;
		try {
			type(nameFieldOnApplicationDetailsPage, "pp", driver);
			return flag;
		} catch (Exception e) {
			flag = true;
			return flag;
		}
	}

	public boolean verifyEmailFieldIsDisabled(WebDriver driver) {
		boolean flag = false;
		try {
			type(emailFieldOnApplicationDetailsPage, "pp", driver);
			return flag;
		} catch (Exception e) {
			flag = true;
			return flag;
		}
	}

	public void clickOnRecentJobDeleteButton(WebDriver driver) {

		click(recentJobDeleteButton, driver);
	}

	public void editCompanyProfileCompanyNameField(WebDriver driver, String value) {
		waitForElementVisibility(companyNameField, "30", driver);
		sendKeysToWebElement(companyNameField, value, driver);
	}

	public void editCompanyProfileCompanyEmailAddressField(WebDriver driver, String value) {
		waitForElementVisibility(companyEmailAddress, "30", driver);
		sendKeysToWebElement(companyEmailAddress, value, driver);
	}

	public void editCompanyProfileCompanyPhoneField(WebDriver driver, String value) {
		waitForElementVisibility(companyPhoneNumber, "30", driver);
		sendKeysToWebElement(companyPhoneNumber, value, driver);
	}

	public void editCompanyProfileCompanyWebsiteUrlField(WebDriver driver, String value) {
		waitForElementVisibility(companyWebsite, "30", driver);
		sendKeysToWebElement(companyWebsite, value, driver);
	}

	public void editCompanyProfileAbout(WebDriver driver, String value) {
		waitForElementVisibility(companyAboutField, "30", driver);
		sendKeysToWebElement(companyAboutField, value, driver);
	}

	public void clickSaveButtonOnCompanyProfilePage(WebDriver driver) {
		waitForElementClickable(companyProfileSaveButton, "30", driver);
		click(companyProfileSaveButton, driver);
	}

	public boolean verifyNoDataMessageIsDisplayed(WebDriver driver) {
		waitForElementVisibility(noData, "30", driver);
		return isElementDisplayed(noData, driver);
	}

	public void clickProfilePictureCircle(WebDriver driver) {
		waitTime(4000, driver);
		waitforPageLoad(30, driver);
		waitForElementClickable(profile, "90", driver);
		click(profile, driver);
	}

	public void clickFrequencyDropdownWeeklyOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(frequencyDropdownWeeklyOption, driver);
	}

	public boolean verifyFrequencyUpdatedToWeek(WebDriver driver) {
		try {
			waitForElementVisibility(updatedFrequencyToWeek, "30", driver);
			return isElementDisplayed(updatedFrequencyToWeek, driver);
		} catch (Exception e) {
			return isElementDisplayed(updatedFrequencyToWeek, driver);
			// TODO: handle exception
		}
	}
	
	public void clickFeatureButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(featureBtn, driver);
	}
	
	public boolean verifyFeaturePopup(WebDriver driver) {
		try {
			waitForElementVisibility(featurePopup, "30", driver);
			return isElementDisplayed(featurePopup, driver);
		} catch (Exception e) {
			return isElementDisplayed(featurePopup, driver);
			// TODO: handle exception
		}
	}

}
