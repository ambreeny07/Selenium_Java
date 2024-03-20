package com.medrep.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerManageJobsPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement  emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//span[contains(text(),'Manage Jobs')])[last()]"))
	WebElement btnManageJobs;
	
	@FindBy(xpath = ("//h1[contains(text(),'Manage Jobs')]"))
	WebElement headingManageJobs;
	
	@FindBy(xpath = ("//h1[contains(text(),'Manage Jobs')]/../following-sibling::div/button"))
	WebElement filterDropdownIcon;
	
	@FindBy(xpath = ("//input[@id='create-job-form_title']"))
	WebElement jobTilteInputField;  
	
	@FindBy(xpath = ("//input[@id='create-job-form_featured']/../.."))
	WebElement featuredDropdownIcon;
	
	@FindBy(xpath = ("//div[@title='Featured']"))
	WebElement featuredDropdownOption;
	
	@FindBy(xpath = ("//div[@title='Not featured']"))
	WebElement notFeaturedDropdownOption;
	
	@FindBy(xpath = ("//input[@id='create-job-form_posted']/../.."))
	WebElement postedDateField;
	
	@FindBy(xpath = ("//input[@id='create-job-form_expired']/../.."))
	WebElement dateexpiresField;
	
	@FindBy(xpath = ("//input[@id='create-job-form_posted_by']"))
	WebElement postedByInputField;
	
	@FindBy(xpath = ("//form[@id='create-job-form']//button[contains(text(),'Filter')]"))
	WebElement btnFilter;
	
	@FindBy(xpath = ("//button[contains(text(),'Reset')]"))
	WebElement btnReset;
	
	@FindBy(xpath = ("//div[@title='Search results']"))
	WebElement optionSearchResults;
	
	@FindBy(xpath = ("//div[@title='Email alerts']"))
	WebElement optionEmailAlerts;
	
	@FindBy(xpath = ("//div[@title='Combo']"))
	WebElement optionCombo;
	
	@FindBy(xpath = ("//input[@id='create-job-form_featured']/..//following-sibling::span"))
	WebElement featuredInputField;
	
	@FindBy(xpath = ("(//div[contains(@class,'picker-header-view')]//button)[2]"))
	WebElement year;
	
	@FindBy(xpath = ("//th[contains(text(),'Title')]"))
	WebElement tableColumnTitle;
	
	@FindBy(xpath = ("//th[contains(text(),'Featured')]"))
	WebElement tableColumnFeatured;
	
	@FindBy(xpath = ("//th[contains(text(),'Views')]"))
	WebElement tableColumnViews;
	
	@FindBy(xpath = ("//th[contains(text(),'Applications')]"))
	WebElement tableColumnApplications;
	
	@FindBy(xpath = ("//th[contains(text(),'Posted')]"))
	WebElement tableColumnPosted;
	
	@FindBy(xpath = ("//th[contains(text(),'Expiry')]"))
	WebElement tableColumnExpires;
	
	@FindBy(xpath = ("//th[contains(text(),'Posted By')]"))
	WebElement tableColumnPostedBy;
	
	@FindBy(xpath = ("//th[contains(text(),'Actions')]"))
	WebElement tableColumnActions;
	
	@FindBy(xpath = ("//span[contains(text(),'Sort By')]/../div"))
	WebElement sortByDropdownIcon;
	
	@FindBy(xpath = ("//div[contains(@title,'Title')]"))
	WebElement optionTitle;
	
	@FindBy(xpath = ("//div[contains(@title,'Views')]"))
	WebElement optionViews;
	
	@FindBy(xpath = ("//div[contains(@title,'Applications')]"))
	WebElement optionApplications;
	
	@FindBy(xpath = ("//div[contains(@title,'Posted')]"))
	WebElement optionPosted;
	
	@FindBy(xpath = ("//div[contains(@title,'Expiry Date')]"))
	WebElement optionExpires;
	
	@FindBy(xpath = ("//div[contains(@title,'Posted By')]"))
	WebElement optionPostedBy;
	
	@FindBy(xpath = ("(//button[contains(text(),'Post Job')])[2]"))
	WebElement btnPostJob;
	
	@FindBy(xpath = ("//h1[contains(text(),'Post A New Job')]"))
    WebElement pageHeadingPostANewJob;
	
	@FindBy(xpath = ("//a[contains(text(),'EXPORT')]"))
	WebElement btnExport;
	
	@FindBy(xpath = ("//td[@class='ant-table-cell']/div/p[contains(@class,'font-b')]"))
	List<WebElement> listOfJobTiltes;

	@FindBy(xpath = ("//span[contains(text(),'Job Credits Remaining')]"))
	WebElement tileJobCreditsRemaining;
	
	@FindBy(xpath = ("//p[contains(text(),'Unlimited')]"))
	WebElement btnUnlimited;
	
	@FindBy(xpath = ("//span[contains(text(),'Featured Job Credits')]"))
	WebElement tileFeaturedJobCreditsRemaining;
	
	@FindBy(xpath = ("(//button[contains(text(),'Purchase')])[last()]"))
	WebElement btnPurchase;
	
	@FindBy(xpath = ("//h1[contains(text(),'Choose your job posting plan')]"))
	WebElement headingChooseYourJobPostingPlan;
	
	@FindBy(xpath = ("//td[@class='ant-table-cell']//p[contains(@class,'[#FEF8EA]')]"))
	List<WebElement> listOfJobViews;
	
	@FindBy (xpath="(//span[contains(text(),'Copy')])[1]")
	WebElement copyActionBtn;
	
	@FindBy(xpath="(//span[text()='Feature'])[1]")
	WebElement featureActionBtn;
	
	@FindBy(xpath="(//p[contains(text(),'Edit')])[1]")
	WebElement editActionbtn;
	
	@FindBy(xpath="(//p[contains(text(),'Delete')])[1] | (//p[contains(text(),'Expire')])[1]")
	WebElement deleteActionbtn;
	
	@FindBy(xpath="//li[@title='Next Page']//parent::ul")
	WebElement pagination;
	
	@FindBy(xpath = "//table/tbody/tr/td") List<WebElement> dataInYourJobsTable;
	
	@FindBy(xpath = ("//td[@class='ant-table-cell']/p[contains(@class,'text-[#01B3E3]')]"))
	List<WebElement> listOfJobExpires;
	
	@FindBy(xpath = ("//td[@class='ant-table-cell']/p[contains(@class,'text-[#00567C]')]"))
	List<WebElement> listOfJobApplications;	
	
	@FindBy(xpath = ("(//td[@class='ant-table-cell']/p[contains(text(),'@')])")) List<WebElement> listOfJobPostedBy;
	
	@FindBy(xpath = "//div[text()='No Data']") WebElement noDataMessage;
	
	@FindBy(xpath = "//input[@id='create-job-form_title']") WebElement title;
	
	@FindBy(xpath = "//label[text()='Featured']") WebElement featured;

	@FindBy(xpath = "//input[@id='create-job-form_posted']") WebElement postedDate;

	@FindBy(xpath = "//input[@id='create-job-form_expired']") WebElement expiryDate;

	@FindBy(xpath = "//input[@id='create-job-form_posted_by']") WebElement postedBy;

	@FindBy(xpath = "//input[@id='create-job-form_jobStatus']/parent::span/parent::div/parent::div") WebElement jobStatus;
	
	@FindBy(xpath = "//div[text()='Active']") WebElement jobStatusActive;
	
	@FindBy(xpath = "//div[text()='Expired']") WebElement jobStatusExpired;	
	
	@FindBy(xpath = "//p[contains(@class,'voyage')]") List<WebElement> activeStatusRecords;
	
	@FindBy(xpath = "(//a[text()=2])[last()]") WebElement nextPageIcon;

	
	
	public EmployerManageJobsPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30",driver);
		waitTime(2000,driver);
		waitForElementClickable(btnLogin,"30",driver);
		click(btnLogin,driver);
		try {
			getRefreshWebPage(driver);
			waitForElementVisibility(btnLogin, "30",driver);
			waitTime(2000,driver);
			waitForElementClickable(btnLogin,"30",driver);
			click(btnLogin,driver);
		}catch(Exception e) {
			
		}
	}
	
    public boolean isEmailFieldDisplay(WebDriver driver){
		return isElementDisplayed(emailAddress,driver);
	}
	 
	public void enterEmailAddress(String email,WebDriver driver) {
		waitForElementVisibility(emailAddress, "30",driver);	
    	type(emailAddress,email,driver);
	}	
	
	public void enterPassword(String pass,WebDriver driver) {
		waitForElementVisibility(password,defaultWaitTime,driver);	
    	type(password,pass,driver);
	}
	
	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementClickable(btnSubmitLogin,"30",driver);
		click(btnSubmitLogin,driver);
	}
	
	public void clickOnManageJobsButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		click(btnManageJobs,driver);
	}
	
	public boolean isManageJobsPageHeadingDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(headingManageJobs, "90", driver);
			
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public void clickOnFilterDropdownIcon(WebDriver driver) {
		waitTime(2000,driver);
		waitforPageLoad(30, driver);
		waitForElementClickable(filterDropdownIcon,"30",driver);
		click(filterDropdownIcon, driver);
	}
	
	public boolean isJobTitleInputFieldDisplay(WebDriver driver) {
		return isElementDisplayed(jobTilteInputField,driver);
	}
	
	public boolean isFeatureDropdownFieldDisplay(WebDriver driver) {
		return isElementDisplayed(featuredDropdownIcon,driver);
	}
	
	public boolean isPostedDateFieldDisplay(WebDriver driver) {
		return isElementDisplayed(postedDateField,driver);
	}
	
	public boolean isExpiredDateFieldDisplay(WebDriver driver) {
		return isElementDisplayed(dateexpiresField,driver);
	}
	
	public boolean isPostedByInputFieldDisplay(WebDriver driver) {
		return isElementDisplayed(postedByInputField,driver);
	}
	
	public boolean isFilterButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnFilter,driver);
	}
	
	public boolean isResetButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnReset,driver);
	}

	public void clickOnFeatureDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(featuredDropdownIcon,"30",driver);
		click(featuredDropdownIcon,driver);
	}
	
	public void clickOnFeatureOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(featuredDropdownOption,"30",driver);
		click(featuredDropdownOption,driver);
	}
	
	public void clickOnNotFeatureOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(notFeaturedDropdownOption,"30",driver);
		click(notFeaturedDropdownOption,driver);
	}
	
	public boolean isSearchResultsOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionSearchResults,driver);
	}
	
	public boolean isEmailAlertsOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionEmailAlerts,driver);
	}
	
	public boolean isComboOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionCombo,driver);
	}
	
	public void selectSearchResultsOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(optionSearchResults,"30",driver);
		click(optionSearchResults,driver);
	}
	
	public String getFeatureFieldValue(WebDriver driver) {
		return getElementAttribute(featuredInputField,"title",driver);
	}
	
	public void selectEmailAlertsOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(optionEmailAlerts,"30",driver);
		click(optionEmailAlerts,driver);
	}
	
	public void selectComboOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(optionCombo,"30",driver);
		click(optionCombo,driver);
	}
	
	public void clickOnPostedDateCalendarIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(postedDateField,"30",driver);
		click(postedDateField,driver);
	}
	
	public boolean isCalendarDisplay(WebDriver driver) {
		return isElementDisplayed(year,driver);
	}
	
	public void clickOnDateExpiresCalendarIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(dateexpiresField,"30",driver);
		click(dateexpiresField,driver);
	}

	public boolean isYourJobsTableTitleColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnTitle,driver);
	}
	
	public boolean isYourJobsTableFeaturedColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnFeatured,driver);
	}
	
	public boolean isYourJobsTableViewsColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnViews,driver);
	}
	
	public boolean isYourJobsTableApplicationsColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnApplications,driver);
	}
	
	public boolean isYourJobsTablePostedColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnPosted,driver);
	}
	
	public boolean isYourJobsTableExpiresColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnExpires,driver);
	}
	
	public boolean isYourJobsTablePostedByColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnPostedBy,driver);
	}
	
	public boolean isYourJobsTableActionsColumnDisplay(WebDriver driver) {
		return isElementDisplayed(tableColumnActions,driver);
	}
	
	public void clickOnSortByDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(sortByDropdownIcon,"30",driver);
		click(sortByDropdownIcon,driver);
	}
	
	public boolean isTitleOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionTitle,driver);
	}
	
	public boolean isViewsOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionViews,driver);
	}
	
	public boolean isApplicationsOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionTitle,driver);
	}
	
	public boolean isPostedOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionPosted,driver);
	}
	
	public boolean isExpiresOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionExpires,driver);
	}
	
	public boolean isPostedByOptionDisplay(WebDriver driver) {
		return isElementDisplayed(optionPostedBy,driver);
	}
	
	public void clickOnPostJobButton(WebDriver driver) {
		waitForElementClickable(btnPostJob,"30",driver);
		click(btnPostJob,driver);
	}
	
	public boolean isPageHeadingPostANewJobDisplay(WebDriver driver) {
		return isElementDisplayed(pageHeadingPostANewJob,driver);	
	}
	
	public void clickOnExportButton(WebDriver driver) {
		waitForElementClickable(btnExport,"30",driver);
		click(btnExport,driver);
	}
	
	public void selectTitleOption(WebDriver driver) {
		waitForElementClickable(optionTitle,"30",driver);
		click(optionTitle,driver);
	}
	
	public ArrayList<String> getJobTitle(WebDriver driver) { 
		int i =listOfJobTiltes.size();
		ArrayList<String> title = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement jobTitle = driver.findElement(By.xpath("(//td[@class='ant-table-cell']/div/p[contains(@class,'font-b')])[" + a + "]"));
			title.add(getElementText(jobTitle,driver).toLowerCase());
		}
		return title;
	}
	
	public boolean isUnlimitedButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnUnlimited,driver);	
	}
	
	public boolean isJobCreditsRemainingTileDisplay(WebDriver driver) {
		return isElementDisplayed(tileJobCreditsRemaining,driver);	
	}
	
	public boolean isPurchaseButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnPurchase,driver);	
	}
	
	public boolean isFeaturedJobCreditsRemainingTileDisplay(WebDriver driver) {
		return isElementDisplayed(tileFeaturedJobCreditsRemaining,driver);	
	}
	
	public void clickOnPurchaseButton(WebDriver driver) {
		waitForElementClickable(btnPurchase,"30",driver);
		click(btnPurchase,driver);	
	}
	
	public boolean isChooseYourJobPostingPlanHeadingDisplay(WebDriver driver) {
		return isElementDisplayed(headingChooseYourJobPostingPlan,driver);	
	}
	
	public void selectViewsOption(WebDriver driver) {
		waitForElementClickable(optionViews,"30",driver);
		click(optionViews,driver);
	}
	
	public ArrayList<Integer> getJobViews(WebDriver driver) { 
		int i =listOfJobViews.size();
		ArrayList<Integer> views = new ArrayList<Integer>();
		for(int a=1; a<=i;a++) {
			WebElement jobViews = driver.findElement(By.xpath("(//td[@class='ant-table-cell']//p[contains(@class,'[#FEF8EA]')])[" + a + "]"));
			views.add(Integer.parseInt(getElementText(jobViews,driver)));
		}
		return views;
	}
	
	public boolean verifyCopyActionBtn(WebDriver driver) {
		return isElementDisplayed(copyActionBtn, driver);
	}
	
	public boolean verifyEditActionBtn(WebDriver driver) {
		return isElementDisplayed(editActionbtn, driver);
	}
	
	public boolean verifyDeleteActionBtn(WebDriver driver) {
		return isElementDisplayed(deleteActionbtn, driver);
	}
	
	public boolean isSortedByDropDownDisplaying(WebDriver driver) {
		return isElementDisplayed(sortByDropdownIcon, driver);
	}
	
	public boolean isPaginationDisplaying(WebDriver driver) {
		return isElementDisplayed(pagination, driver);
	}
	public boolean isFeaturedOptionDisplaying(WebDriver driver) {
		return isElementDisplayed(featuredDropdownOption,driver);
	}
	
	public boolean isNonFeaturedOptionDisplaying(WebDriver driver) {
		return isElementDisplayed(notFeaturedDropdownOption,driver);
	}
	
	public boolean verifyDataInYourJobsTable(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		boolean isShowing = true;

		for (int i = 0; i<dataInYourJobsTable.size(); i++){
			if(i<9){
				continue;
			}
			System.out.println(dataInYourJobsTable.get(i).getText());
			System.out.println(i);
			if(dataInYourJobsTable.get(i).getText().isEmpty()){
				isShowing = false;
				break;
			}
			else {
				isShowing = true;
			}
		}
		return isShowing;
	}
	
	public void selectApplicationOption(WebDriver driver) {
		waitForElementClickable(optionApplications,"30",driver);
		click(optionApplications,driver);
	}
	
	public ArrayList<String> getJobApplications(WebDriver driver) { 
		int i =listOfJobApplications.size();
		ArrayList<String> application = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement jobApplication = driver.findElement(By.xpath("//td[@class='ant-table-cell']/p[contains(@class,'text-[#00567C]')]"));
			application.add(getElementText(jobApplication,driver).toLowerCase());
		}
		return application;
	}
	
	public void selectExpiryOption(WebDriver driver){
		waitForElementClickable(optionExpires,"30",driver);
		click(optionExpires,driver);
	}

	public ArrayList<String> getJobExpires(WebDriver driver) {
		int i =listOfJobExpires.size();
		ArrayList<String> expires = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement jobExpire = driver.findElement(By.xpath("//td[@class='ant-table-cell']/p[contains(@class,'text-[#01B3E3]"));
			expires.add(getElementText(jobExpire,driver).toLowerCase());
		}
		return expires;
	}
	
	public void selectPostedByOption(WebDriver driver){
		waitForElementClickable(optionPostedBy,"30",driver);
		click(optionPostedBy,driver);
	}
	
	public ArrayList<String> getJobPostedBy(WebDriver driver) {
		int i =listOfJobPostedBy.size();
		ArrayList<String> postedBy = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement jobPostedBy = driver.findElement(By.xpath("(//td[@class='ant-table-cell']/p[contains(text(),'@')])"));
			postedBy.add(getElementText(jobPostedBy,driver).toLowerCase());
		}
		return postedBy;
	}
	
	public boolean isFileDownloaded(String fileName) {
		boolean flag = false;
		//paste your directory path below
		//eg: C:\\Users\\username\\Downloads
		String dirPath = "C:\\Users\\CodeAutomation\\Downloads";
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files.length == 0 || files == null) {
			System.out.println("The directory is empty");
			flag = false;
		} else {
			for (File listFile : files) {
				if (listFile.getName().contains(fileName)) {
					System.out.println(fileName + " is present");
					break;
				}
				flag = true;
			}
		}
		return flag;
	}
	
	public void clickOnFilterButton(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(btnFilter,"30",driver);
		click(btnFilter,driver);
	}
	
	public boolean verifyNoDataMessage(WebDriver driver){
		waitForElementVisibility(noDataMessage, "30",driver);
		return noDataMessage.isDisplayed();
	}
	
	public boolean verifyJobTitleIsDisplayed(WebDriver driver){
		waitForElementVisibility(title, "30",driver);
		return title.isDisplayed();
	}

	public boolean verifyFeaturedIsDisplayed(WebDriver driver){
		waitForElementVisibility(featured, "30",driver);
		return featured.isDisplayed();
	}

	public boolean verifyPostedDateIsDisplayed(WebDriver driver){
		waitForElementVisibility(postedDate, "30",driver);
		return postedDate.isDisplayed();
	}

	public boolean verifyExpiryDateIsDisplayed(WebDriver driver){
		waitForElementVisibility(expiryDate, "30",driver);
		return expiryDate.isDisplayed();
	}

	public boolean verifyPostedByIsDisplayed(WebDriver driver){
		waitForElementVisibility(postedBy, "30",driver);
		return postedBy.isDisplayed();
	}

	public boolean verifyJobStatusIsDisplayed(WebDriver driver){
		waitForElementVisibility(jobStatus, "30",driver);
		return jobStatus.isDisplayed();
	}	
	
	public void setJobStatus(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(jobStatus,"30",driver);
		click(jobStatus, driver);
	}

	public void setJobStatusActive(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(jobStatusActive,"30",driver);
		click(jobStatusActive, driver);
	}
	
	public void jobStatusExpired(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(jobStatusExpired,"30",driver);
		click(jobStatusExpired, driver);
	}	
	
	public boolean verifyStatusFilterRecords(String status, WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		boolean isShowing = false;

		for (int i = 0; i<activeStatusRecords.size(); i++){
			if(i>16){
				break;
			}
			System.out.println(activeStatusRecords.get(i).getText());
			System.out.println(i);
			if(activeStatusRecords.get(i).getText().trim().equals(status)){
				isShowing = true;
			}
			else {
				isShowing = false;
			}
		}
		return isShowing;
	}
	
	public boolean verifyStatusInAllRecords(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);
		boolean isShowing = false;

		for (int i = 0; i<activeStatusRecords.size(); i++){
			if(i>16){
				break;
			}
			System.out.println(activeStatusRecords.get(i).getText());
			System.out.println(i);
			if(activeStatusRecords.get(i).getText().trim().equals("Expired")){
				isShowing = true;
				break;
			}if(activeStatusRecords.get(i).getText().trim().equals("Active")){
				isShowing = true;
				break;
			}if(activeStatusRecords.get(i).getText().trim().equals("Draft")){
				isShowing = true;
				break;
			}
			else {
				isShowing = false;
			}
		}
		return isShowing;
	}
	
	public void clickOnResetButton(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(btnReset,"30",driver);
		click(btnReset,driver);
	}
	
	public void clickOnNextPageIcon(WebDriver driver) throws InterruptedException {

		waitForElementVisibility(nextPageIcon,"30",driver);
		scrollIntoViewSmoothly(nextPageIcon,driver);
		waitForElementClickable(nextPageIcon,"30",driver);
		Thread.sleep(10000);
		click(nextPageIcon,driver);
	}
	
}
