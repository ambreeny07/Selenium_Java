package com.medrep.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateAccountPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
	WebElement medrepLogo;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[contains(@type,'email')]"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[contains(@type,'password')]"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//li//a[contains(text(),'CAREER ADVICE')])[last()]"))
	WebElement btnCareerAdvice;

	@FindBy(xpath = ("//button[contains(text(),'Breaking into medical sales')]"))
	WebElement btnBreakingIntoMedicalSales;

	@FindBy(xpath = ("(//div[contains(@class,'w-full')]//h5)[1]"))
	WebElement firstBlog;

	@FindBy(xpath = ("//div[@class='w-full']//h1"))
	WebElement blogPageHeading;

	@FindBy(xpath = ("//input[@placeholder='Search']"))
	WebElement searchInputField;

	@FindBy(xpath = ("//div[contains(@class,'w-full min-h')]"))
	List<WebElement> listOfBlog;

	@FindBy(xpath = ("//button[contains(text(),'View More')]"))
	WebElement btnViewMore;

	@FindBy(xpath = "//button[contains(text(),'Job search')]")
	WebElement jobSearchBtn;

	@FindBy(xpath = "//button[contains(text(),'Insider')]")
	WebElement insiderBtn;

	@FindBy(xpath = "//button[contains(text(),'Breaking into medical sales')]")
	WebElement BreakingIntoMedicalSalesBtn;

	@FindBy(xpath = ("(//div[@class='flex items-center']/span)/../img"))
	WebElement profileDropdown;

	@FindBy(xpath = ("//span[contains(text(), 'Logout')]"))
	WebElement logoutBtn;
	
	@FindBy(xpath = ("(//a[contains(text(),'Account')])[last()]"))
	WebElement accountOption;	

	@FindBy(xpath=("//p[text()='Next Billing Date: ']"))
	WebElement nextBillingDateAccountPage;
	
	@FindBy(xpath=("//u[text()='Cancel Membership']"))
	WebElement cancelMembershipLink;
	
	@FindBy(xpath=("//span[text()='Cancel plan']"))
	WebElement cancelPlanBtn;
	
	@FindBy(xpath=("//img[@alt='Close modal icon']"))
	WebElement completeYourProfileCloseBtn;
	
	@FindBy(xpath=("//th[text()='Transaction ID']"))
	WebElement transactionHistoryTableTransactionID;
	
	@FindBy(xpath=("//th[text()='Name ']"))
	WebElement transactionHistoryName;
	
	@FindBy(xpath=("//th[text()='Type']"))
	WebElement transactionHistoryType;
	
	@FindBy(xpath=("//th[text()='Amount']"))
	WebElement transactionHistoryAmount;
	
	@FindBy(xpath=("//th[text()='Date']"))
	WebElement transactionHistoryDate;
	
	@FindBy(xpath=("//th[text()='Payment Status']"))
	WebElement transactionHistoryPaymentStatus;
	
	@FindBy(xpath=("//span[text()='Return to MedReps']"))
	WebElement returnToMedRepsBtn;
	
	@FindBy(xpath=("//p[text()='No subscription found'] | //p[text()='CANCELED']"))
	WebElement noSubscriptionFound;
	
	@FindBy(xpath=("//input[@placeholder='Enter Your Name'] | //input[@placeholder='Enter Your Email Address']"))
	WebElement newEmailNameTxt;
	
	@FindBy(xpath=("//button[text()='Update']"))
	WebElement updateBtn;
	
	@FindBy(xpath=("//button[text()='Update your password']"))
	WebElement updateYourPasswordBtn;
	
	@FindBy(xpath=("//input[@id='namedUserForm_old_password']"))
	WebElement oldPasswordTxt;
	
	@FindBy(xpath=("//input[@id='namedUserForm_new_password']"))
	WebElement newPasswordTxt;
	
	@FindBy(xpath=("//input[@id='namedUserForm_confirm_new_password']"))
	WebElement confirmNewPasswordTxt;
	
	@FindBy(xpath=("(//button[text()='Update'])[last()]"))
	WebElement passwordUpdateBtn;
	
	@FindBy(xpath=("//img[@alt='Close modal icon']"))
	WebElement closeModalPopupBtn;
	
	@FindBy(xpath=("//p[contains(text(),'Monthly Candidate Membership')]"))
	WebElement monthlyCandidateMembership;
	
	
	public CandidateAccountPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnProfileDropdown(WebDriver driver) {
		waitForElementClickable(profileDropdown, "90", driver);
		click(profileDropdown, driver);
	}
	
	public void clickOnAccountOption(WebDriver driver) {
		waitForElementClickable(accountOption, "30", driver);
		click(accountOption, driver);
	}
	
	public boolean isNextBillingDateAccountPageDisplay(WebDriver driver) {
		waitForElementVisibility(nextBillingDateAccountPage, "30",driver);
		return isElementDisplayed(nextBillingDateAccountPage,driver);
	}
	
	public void clickOnCancelMembershipLink(WebDriver driver) {
		waitForElementClickable(cancelMembershipLink, "30", driver);
		click(cancelMembershipLink, driver);
	}
	
	public void clickOnCancelPlanButton(WebDriver driver) {
		try {
			waitForElementClickable(cancelPlanBtn, "30", driver);
			click(cancelPlanBtn, driver);
			
		} catch (Exception e) {
			waitForElementClickable(cancelPlanBtn, "30", driver);
			clickUsingJavascriptExecutor(cancelPlanBtn, driver);
			
		}
	}
	
	public void clickOnCompleteYourProfileCloseButton(WebDriver driver) {
		waitForElementClickable(completeYourProfileCloseBtn, "30", driver);
		click(completeYourProfileCloseBtn, driver);
	}
	
	public boolean isTransactionHistoryTableTransactionIDDisplay(WebDriver driver) {
		waitForElementVisibility(transactionHistoryTableTransactionID, "30",driver);
		return isElementDisplayed(transactionHistoryTableTransactionID,driver);
	}
	
	public boolean isTransactionHistoryTableNameDisplay(WebDriver driver) {
		waitForElementVisibility(transactionHistoryName, "30",driver);
		return isElementDisplayed(transactionHistoryName,driver);
	}
	
	public boolean isTransactionHistoryTableTypeDisplay(WebDriver driver) {
		waitForElementVisibility(transactionHistoryType, "30",driver);
		return isElementDisplayed(transactionHistoryType,driver);
	}
	
	public boolean isTransactionHistoryTableAmountDisplay(WebDriver driver) {
		waitForElementVisibility(transactionHistoryAmount, "30",driver);
		return isElementDisplayed(transactionHistoryAmount,driver);
	}
	
	public boolean istransactionHistoryTableDateDisplay(WebDriver driver) {
		waitForElementVisibility(transactionHistoryDate, "30",driver);
		return isElementDisplayed(transactionHistoryDate,driver);
	}
	
	public boolean istransactionHistoryTablePaymentStatusDisplay(WebDriver driver) {
		waitForElementVisibility(transactionHistoryPaymentStatus, "30",driver);
		return isElementDisplayed(transactionHistoryPaymentStatus,driver);
	}
	
	public boolean isNoSubscriptionFoundDisplay(WebDriver driver) {
		waitForElementVisibility(noSubscriptionFound, "30",driver);
		return isElementDisplayed(noSubscriptionFound,driver);
	}
	
	public void clickOnReturnToMedRepsLink(WebDriver driver) {
		waitForElementClickable(returnToMedRepsBtn, "30", driver);
		click(returnToMedRepsBtn, driver);
	}
	
	public void enterNewEmail(String email, WebDriver driver) {
		waitForElementVisibility(nextBillingDateAccountPage, "30",driver);
		scrollIntoViewSmoothly(newEmailNameTxt, driver);
		type(newEmailNameTxt, email, driver);
	}
	
	public void clickOnUpdateButton(WebDriver driver) {
		waitForElementClickable(updateBtn, "30", driver);
		click(updateBtn, driver);
	}
	
	public boolean isLoginButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30",driver);
		return isElementDisplayed(btnLogin,driver);
	}

	public void enterOldPassword(String email, WebDriver driver) {
		waitForElementVisibility(oldPasswordTxt, "30",driver);
		type(oldPasswordTxt, email, driver);
	}

	public void enterNewPassword(String email, WebDriver driver) {
		waitForElementVisibility(newPasswordTxt, "30",driver);
		type(newPasswordTxt, email, driver);
	}

	public void enterConfirmNewPassword(String email, WebDriver driver) {
		waitForElementVisibility(confirmNewPasswordTxt, "30",driver);
		type(confirmNewPasswordTxt, email, driver);
	}
	
	public void clickOnPasswordUpdateButton(WebDriver driver) {
		waitForElementClickable(passwordUpdateBtn, "30", driver);
		click(passwordUpdateBtn, driver);
	}
	
	public void clickOnUpdateYourPasswordButton(WebDriver driver) {
		waitForElementClickable(nextBillingDateAccountPage, "30", driver);
		click(updateYourPasswordBtn, driver);
	}
	
	public void clickOnCloseModalPopupButton(WebDriver driver) {
		waitForElementClickable(closeModalPopupBtn, "30", driver);
		click(closeModalPopupBtn, driver);
	}
	
	public boolean isMonthlyCandidateMembershipDisplay(WebDriver driver) {
		waitForElementVisibility(monthlyCandidateMembership, "30",driver);
		return isElementDisplayed(monthlyCandidateMembership,driver);
	}	
	
	public boolean isPricingDisplay(String pricing , WebDriver driver) {
		WebElement findElement = driver
				.findElement(By.xpath("//p[text()='"+pricing+"']"));
		return isElementDisplayed(findElement,driver);
	}	
	
	
}
