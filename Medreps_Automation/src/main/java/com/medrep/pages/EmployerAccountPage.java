package com.medrep.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerAccountPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//span[contains(text(),'Account')])[last()]"))
	WebElement btnAccount;

	@FindBy(xpath = ("//h1[contains(text(),'Account')]"))
	WebElement pageHeadingAccount;

	@FindBy(xpath = ("//p[contains(text(),'Your Purchase')]"))
	WebElement titleYourPlan;

	@FindBy(xpath = ("(//p[contains(text(),'Unlimited Jobs')])[1]"))
	WebElement labelUnlimitedJobs;

	@FindBy(xpath = ("(//p[contains(text(),'Your Plan')]/..//p)[3]"))
	WebElement nextBillingDate;

	@FindBy(xpath = ("//p[contains(text(),'Add-Ons')] | //p[contains(text(),'Add Ons')]"))
	WebElement titleAddOns;

	@FindBy(xpath = ("//span[contains(text(),'1 Year Unlimited Resume Search')]"))
	WebElement labelEmployer1YearUnlimitedResumeSearch;

	@FindBy(xpath = ("//span[contains(text(),'1 Year Unlimited Resume Search')]//following-sibling::button"))
	WebElement btnPurchased;

	@FindBy(xpath = ("//span[contains(text(),'Multiple User')]"))
	WebElement labelMultipleUser;

	@FindBy(xpath = ("//span[contains(text(),'Multiple User')]//following-sibling::button"))
	WebElement multipleUserAddToPlanButton;

	@FindBy(xpath = ("//span[contains(text(),'Featured Job')]"))
	WebElement labelFeaturedJob;

	@FindBy(xpath = ("//span[contains(text(),'Featured Job')]//following-sibling::button"))
	WebElement featuredJobAddToPlanButton;

	@FindBy(xpath = ("//span[contains(text(),'$129 - Top of Job Results Page for 30 Days')]"))
	WebElement labelTopJob;

	@FindBy(xpath = ("//span[contains(text(),'$129 - Top of Job Results Page for 30 Days')]//following-sibling::button"))
	WebElement topJobAddToPlanButton;

	@FindBy(xpath = ("//span[contains(text(),'Featured in Job Alert Emails for 30 Days (up to 100,000+ subscribers)')]"))
	WebElement labelAlertEmails;

	@FindBy(xpath = ("//span[contains(text(),'Featured in Job Alert Emails for 30 Days (up to 100,000+ subscribers)')]//following-sibling::button"))
	WebElement alertEmailsAddToPlanButton;

	@FindBy(xpath = ("//p[contains(text(),'Support')]"))
	WebElement titleSupport;

	@FindBy(xpath = ("//p[contains(text(),'Have questions?')]"))
	WebElement labelHaveQuestions;

	@FindBy(xpath = ("//li[contains(text(),'Contact')]"))
	WebElement labelContact;

	@FindBy(xpath = ("//a[contains(text(),'info@medreps.com')]"))
	WebElement linkInfoMedrep;

	@FindBy(xpath = ("//li[contains(text(),'Update Payment Details')] | //u[contains(text(),'Update Payment Details')]"))
	WebElement linkUpdatePaymentDetails;

	@FindBy(xpath = ("//li[contains(text(),'Cancel Your Plan')]"))
	WebElement linkCancelYourPlan;

	@FindBy(xpath = ("//a[contains(text(),'Frequently Asked Questions')]"))
	WebElement linkFrequentlyAskedQuestions;

	@FindBy(xpath = ("//h1[contains(text(),'Frequently Asked Questions')]/.."))
	WebElement pageHeadingFrequentlyAskedQuestions;

	@FindBy(xpath = ("//span[contains(text(),'Payment method')]"))
	WebElement labelPaymentMethod;

	@FindBy(xpath = ("//span[contains(text(),'Billing information')]"))
	WebElement labelBillingInformation;

	@FindBy(xpath = ("//span[contains(text(),'Email')]/../../../..//following-sibling::div/span"))
	WebElement billingInformationEmail;

	@FindBy(xpath = ("(//span[contains(text(),'Billing address')]/../../../..//following-sibling::div//address//div)[6]"))
	WebElement billingAddress;

	@FindBy(xpath = ("//input[@placeholder='Postal code']"))
	WebElement postalCodeTxt;

	@FindBy(xpath = ("//span[contains(text(),'Invoice history')]"))
	WebElement labelInvoiceHistory;

	@FindBy(xpath = ("//span[contains(text(),'Update information')]"))
	WebElement updateInformation;

	@FindBy(xpath = ("(//div[contains(@class,'SearchableSelect')]//div)[1]"))
	WebElement addressDropdownIcon;

	@FindBy(xpath = ("(//div[contains(@class,'SearchableList-item')])"))
	List<WebElement> dropdownOptions;

	@FindBy(xpath = ("//span[contains(text(),'Save')]/../.././../../../.."))
	WebElement btnSave;

	@FindBy(xpath = ("//span[contains(text(),'Pay with')]"))
	WebElement labelPayWithCard;

	@FindBy(xpath = "//div[text()='Change']")
	WebElement changeButtonOnAddOnsPurchase;

	@FindBy(xpath = ("//input[@name='cardNumber']"))
	WebElement inputCardNumber;

	@FindBy(xpath = ("//input[@id='Field-numberInput']"))
	WebElement inputCardNumber_2;

	@FindBy(xpath = ("//input[@name='cardExpiry']"))
	WebElement inputCardExpiry;

	@FindBy(xpath = ("//input[@name='cardCvc']"))
	WebElement inputCardCvc;

	@FindBy(xpath = ("//input[@name='billingName']"))
	WebElement inputNameOnCard;

	@FindBy(xpath = ("//select[@id='billingCountry']"))
	WebElement countryDropDown;

	@FindBy(xpath = ("//option[@value='PK']"))
	WebElement optionPakistan;

	@FindBy(xpath = ("//button[contains(@class,'SubmitButton')]"))
	WebElement btnPay;

	@FindBy(xpath = ("//span[contains(text(),'$100.00')]"))
	WebElement hundredDollarAmount;

	@FindBy(xpath = ("//span[contains(text(),'$199.99')]"))
	WebElement oneHundredAndNinetyNineDollarAmount;

	@FindBy(xpath = ("//span[contains(text(),'$129.')]"))
	WebElement oneHundredAndTwentyNineDollarAmount;

	@FindBy(xpath = ("//span[contains(text(),'$99.')]"))
	WebElement ninetyNineDollarAmount;

	@FindBy(xpath = ("(//p[contains(text(),'Employer Annual Job Posting')])[1]"))
	WebElement employerAnnualJobPosting;

	@FindBy(xpath = ("//th[text()='Transaction ID']"))
	WebElement tableColumnTransactionId;

	@FindBy(xpath = ("//th[text()='Name ']"))
	WebElement tableColumnName;

	@FindBy(xpath = ("//th[text()='Type']"))
	WebElement tableColumnType;

	@FindBy(xpath = ("//th[text()='Amount']"))
	WebElement tableColumnAmount;

	@FindBy(xpath = ("//th[text()='Date']"))
	WebElement tableColumnDate;

	@FindBy(xpath = "//button[text()='Buy Credits']")
	WebElement buyCreditButton;

	@FindBy(xpath = "//p[text()='Your Purchase']/parent::div/following-sibling::div[2]/p")
	WebElement planName;
	
	@FindBy(xpath = "//p[text()='Your Purchase']")
	WebElement planName_2;

	@FindBy(xpath = "//button[@data-testid='hosted-payment-submit-button']")
	WebElement stripeSubscribeButton;

	@FindBy(xpath = "//span[text()='Add payment method']")
	WebElement addPaymentMethodButton;

	@FindBy(xpath = "//h1[text()='Account']")
	WebElement accountPage;

	@FindBy(xpath = "//span[text()='Add']")
	WebElement addButton;

	@FindBy(xpath = "//span[text()='Return to MedReps']")
	WebElement returnToMedReps;

	@FindBy(xpath = "//button[text()='Subscribe'] | //a[text()='Buy Plan']")
	WebElement subscribe;

	@FindBy(xpath = "//a[@href='mailto:info@medreps.com']")
	WebElement mailBox;

	@FindBy(xpath = "//table/tbody/tr/td")
	List<WebElement> dataInTransactionsTable;

	@FindBy(xpath = "//span[text()='Cancel plan']")
	WebElement cancelButton;

	@FindBy(xpath = "(//iframe[contains(@name,'__privateStripeFrame')])[1]")
	WebElement frame;

	@FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")
	WebElement threeDot;

	@FindBy(xpath = "(//span[text()='Delete'])[last()]")
	WebElement deletebtn;

	@FindBy(xpath = "(//span[text()='Delete payment method'])[last()]")
	WebElement deletePaymentMethod;

	@FindBy(xpath = "//p[text()='Next Billing Date:']")
	WebElement nextBillingDateLabel;
	
	@FindBy(xpath = "//p[text()='Purchasing Date:']")
	WebElement purchasingDateLabel;
	
	@FindBy(xpath = "//p[text()='Purchasing Date:']/../../p | //h1[text()='Account']/../h1[last()]")
	WebElement planNameLabel;
	
	@FindBy(xpath = "//p[text()='Your Purchase']")
	WebElement yourPurchaseLabel;
	
	@FindBy(xpath = "//p[contains(text(),'Next Billing Date:')]/span")
	WebElement nextBillDate;

	@FindBy(xpath = "//p[contains(text(),'Purchasing Date:')]/span")
	WebElement purchasingDate;
	
	@FindBy(xpath = "//div[text()='Canceled'] | //p[text()='CANCELED']")
	WebElement canceledLbl;
	
	@FindBy(xpath = "//p[contains(text(),'Expire Date:')]")
	WebElement expireDate;
	
	@FindBy(xpath = "//th[text()='Name ']/../../following::p[contains(text(),'Employer 30 Day Single Day Job Posting')]")
	WebElement employer30DaySingleDayJobPosting;	
	

	public EmployerAccountPage(WebDriver driverParam) {
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
			waitForElementClickable(btnLogin, "30", driver);
			waitTime(2000, driver);
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
	}

	public void clickOnAccountButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(btnAccount, "30", driver);
		waitForElementVisibility(btnAccount, "30", driver);
		click(btnAccount, driver);
	}

	public boolean isPageHeadingAccountDisplay(WebDriver driver) {
		waitForElementVisibility(pageHeadingAccount, "30", driver);
		return isElementDisplayed(pageHeadingAccount, driver);
	}

	public boolean isYourPlanTitleDisplay(WebDriver driver) {
		waitForElementVisibility(titleYourPlan, "30", driver);
		return isElementDisplayed(titleYourPlan, driver);
	}

	public boolean isUnlimitedJobsLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelUnlimitedJobs, "30", driver);
		return isElementDisplayed(labelUnlimitedJobs, driver);
	}

	public boolean isEmployerAnnualJobPostingLabelDisplay(WebDriver driver) {
		return isElementDisplayed(employerAnnualJobPosting, driver);
	}

	public String getNextBilligDate(WebDriver driver) {
		String billingDate = getElementText(nextBillingDate, driver);
		String[] date = billingDate.split("\\:");
		return date[1];
	}

	public String getNextBilligDateClassValue(WebDriver driver) {
		return getElementAttributeValue(nextBillingDate, "class", driver);
	}

	public boolean isAddOnTitleDisplay(WebDriver driver) {
		waitForElementVisibility(titleAddOns, "30", driver);
		return isElementDisplayed(titleAddOns, driver);
	}

	public boolean isLabelEmployer1YearUnlimitedResumeSearchDisplay(WebDriver driver) {
		waitForElementVisibility(labelEmployer1YearUnlimitedResumeSearch, "30", driver);
		return isElementDisplayed(labelEmployer1YearUnlimitedResumeSearch, driver);
	}

	public boolean isPurchasedButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnPurchased, "30", driver);
		return isElementDisplayed(btnPurchased, driver);
	}

	public boolean isMultipleUserLabelDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(labelMultipleUser, driver);
		waitTime(2000, driver);
		waitForElementVisibility(labelMultipleUser, "30", driver);
		return isElementDisplayed(labelMultipleUser, driver);
	}

	public boolean isMultipleUserAddToPlanButtonDisplay(WebDriver driver) {
		waitForElementVisibility(multipleUserAddToPlanButton, "30", driver);
		return isElementDisplayed(multipleUserAddToPlanButton, driver);
	}

	public boolean isFeaturedJobLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelFeaturedJob, "30", driver);
		return isElementDisplayed(labelFeaturedJob, driver);
	}

	public boolean isFeaturedJobAddToPlanButtonDisplay(WebDriver driver) {
		waitForElementVisibility(featuredJobAddToPlanButton, "30", driver);
		return isElementDisplayed(featuredJobAddToPlanButton, driver);
	}

	public boolean isTopOfJobLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelTopJob, "30", driver);
		return isElementDisplayed(labelTopJob, driver);
	}

	public boolean isTopJobAddToPlanButtonDisplay(WebDriver driver) {
		waitForElementVisibility(topJobAddToPlanButton, "30", driver);
		return isElementDisplayed(topJobAddToPlanButton, driver);
	}

	public boolean isAlertEmailsLabelDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(labelAlertEmails, driver);
		waitTime(2000, driver);
		waitForElementVisibility(labelAlertEmails, "30", driver);
		return isElementDisplayed(labelAlertEmails, driver);
	}

	public boolean isAlertEmailsAddToPlanButtonDisplay(WebDriver driver) {
		waitForElementVisibility(alertEmailsAddToPlanButton, "30", driver);
		return isElementDisplayed(alertEmailsAddToPlanButton, driver);
	}

	public boolean isSupportTitleDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(titleSupport, driver);
		waitTime(2000, driver);
		waitForElementVisibility(titleSupport, "30", driver);
		return isElementDisplayed(titleSupport, driver);
	}

	public boolean isHaveQuestionsLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelHaveQuestions, "30", driver);
		return isElementDisplayed(labelHaveQuestions, driver);
	}

	public boolean isContactLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelContact, "30", driver);
		return isElementDisplayed(labelContact, driver);
	}

	public boolean isInfoMedrepsLinkDisplay(WebDriver driver) {
		waitForElementVisibility(linkInfoMedrep, "30", driver);
		return isElementDisplayed(linkInfoMedrep, driver);
	}

	public boolean isUpdatePaymentDetailsLinkDisplay(WebDriver driver) {
		waitTime(2000, driver);
		waitForElementVisibility(linkUpdatePaymentDetails, "30", driver);
		return isElementDisplayed(linkUpdatePaymentDetails, driver);
	}

	public boolean isCancelYourPlanLinkDisplay(WebDriver driver) {
		waitForElementVisibility(linkCancelYourPlan, "30", driver);
		return isElementDisplayed(linkCancelYourPlan, driver);
	}

	public boolean isFrequentlyAskedQuestionsLinkDisplay(WebDriver driver) {
		waitForElementVisibility(linkFrequentlyAskedQuestions, "30", driver);
		return isElementDisplayed(linkFrequentlyAskedQuestions, driver);
	}

	public void clickOnFrequentlyAskedQuestionsLink(WebDriver driver) {
		waitForElementVisibility(linkFrequentlyAskedQuestions, "30", driver);
		waitForElementClickable(linkFrequentlyAskedQuestions, "30", driver);
		click(linkFrequentlyAskedQuestions, driver);
	}

	public boolean isFrequentlyAskedQuestionsPageHeadingDisplay(WebDriver driver) {
		waitForElementVisibility(pageHeadingFrequentlyAskedQuestions, "30", driver);
		return isElementDisplayed(pageHeadingFrequentlyAskedQuestions, driver);
	}

	public void clickOnCancelYourPlanLink(WebDriver driver) {
		waitForElementVisibility(linkCancelYourPlan, "30", driver);
		waitForElementClickable(linkCancelYourPlan, "30", driver);
		click(linkCancelYourPlan, driver);
	}

	public boolean isPaymentMethodLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelPaymentMethod, "30", driver);
		return isElementDisplayed(labelPaymentMethod, driver);
	}

	public boolean isBillingInformationLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelBillingInformation, "30", driver);
		return isElementDisplayed(labelBillingInformation, driver);
	}

	public String getBillingInformationEmail(WebDriver driver) {
		waitForElementVisibility(billingInformationEmail, "30", driver);
		return getElementText(billingInformationEmail, driver);
	}

	public String getBillingAddress(WebDriver driver) {
		waitForElementVisibility(billingAddress, "30", driver);
		return getElementText(billingAddress, driver);
	}

	public boolean isInvoiceHistoryDisplay(WebDriver driver) {
		waitForElementVisibility(labelInvoiceHistory, "30", driver);
		return isElementDisplayed(labelInvoiceHistory, driver);
	}

	public void clickOnUpdatePaymentDetailsLink(WebDriver driver) {
		waitForElementVisibility(accountPage, "30", driver);
		click(linkUpdatePaymentDetails, driver);
	}

	public void clickOnUpdateInformation(WebDriver driver) {
		waitForElementVisibility(updateInformation, "30", driver);
		waitForElementClickable(updateInformation, "30", driver);
		click(updateInformation, driver);
	}

	public void clickOnAddressDropdownIcon(WebDriver driver) {
		waitForElementVisibility(addressDropdownIcon, "30", driver);
		waitForElementClickable(addressDropdownIcon, "30", driver);
		click(addressDropdownIcon, driver);
	}

	public void selectDropdownOption(WebDriver driver) {
		int size = dropdownOptions.size();
		int randomNumber = ThreadLocalRandom.current().nextInt(2, size);
//		int randomNumber = 1;
		WebElement option = driver
				.findElement(By.xpath("(//div[contains(@class,'SearchableList-item')])[" + randomNumber + "]"));
		scrollIntoViewSmoothly(option, driver);
		waitTime(2000, driver);
		waitForElementClickable(option, "30", driver);
		click(option, driver);
	}

	public void postalCodeClear(WebDriver driver) {
		waitForElementClickable(postalCodeTxt, "30", driver);
		postalCodeTxt.clear();
	}

	public void clickOnSaveButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnSave, driver);
		waitTime(2000, driver);
		waitForElementClickable(btnSave, "30", driver);
		click(btnSave, driver);
	}

	public void clickOnMultipleUserAddToPlanButton(WebDriver driver) {
		waitForElementVisibility(multipleUserAddToPlanButton, "30", driver);
		waitForElementClickable(multipleUserAddToPlanButton, "30", driver);
		click(multipleUserAddToPlanButton, driver);
	}

	public boolean isPayWithCardLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelPayWithCard, "30", driver);
		return isElementDisplayed(labelPayWithCard, driver);
	}

	public boolean isCardNumberInputFieldDisplay(WebDriver driver) {
		waitForElementVisibility(inputCardNumber, "30", driver);
		return isElementDisplayed(inputCardNumber, driver);
	}

	public boolean isCardExpiryDateInputFieldDisplay(WebDriver driver) {
		waitForElementVisibility(inputCardExpiry, "30", driver);
		return isElementDisplayed(inputCardExpiry, driver);
	}

	public boolean isCardCvcInputFieldDisplay(WebDriver driver) {
		waitForElementVisibility(inputCardCvc, "30", driver);
		return isElementDisplayed(inputCardCvc, driver);
	}

	public void switchToFrame(WebDriver driver) {
		waitForElementVisibility(frame, "30", driver);
		driver.switchTo().frame(frame);
	}

	public boolean isCardNumberInputFieldTwoDisplay(WebDriver driver) {
		try {
			waitForElementVisibility(inputCardNumber_2, "30", driver);
			return isElementDisplayed(inputCardNumber_2, driver);
		} catch (Exception e) {
			return isElementDisplayed(inputCardNumber_2, driver);
		}
	}

	public boolean isNameOnCardInputFieldDisplay(WebDriver driver) {
		waitForElementVisibility(inputNameOnCard, "30", driver);
		return isElementDisplayed(inputNameOnCard, driver);
	}

	public boolean isCountryDropdownFieldDisplay(WebDriver driver) {
		waitForElementVisibility(countryDropDown, "30", driver);
		return isElementDisplayed(countryDropDown, driver);
	}

	public boolean isPayButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnPay, "30", driver);
		return isElementDisplayed(btnPay, driver);
	}

	public boolean isHundredDollarAmountDisplay(WebDriver driver) {
		waitForElementVisibility(hundredDollarAmount, "30", driver);
		return isElementDisplayed(hundredDollarAmount, driver);
	}

	public void clickOnFeaturedJobAddToPlanButton(WebDriver driver) {
		waitForElementVisibility(featuredJobAddToPlanButton, "30", driver);
		waitForElementClickable(featuredJobAddToPlanButton, "30", driver);
		click(featuredJobAddToPlanButton, driver);
	}

	public boolean isOneHundredAndNinetyNineDollarAmountDisplay(WebDriver driver) {
		waitForElementVisibility(hundredDollarAmount, "30", driver);
		return isElementDisplayed(hundredDollarAmount, driver);
	}

	public void clickOnTopJobAddToPlanButton(WebDriver driver) {
		waitForElementVisibility(topJobAddToPlanButton, "30", driver);
		waitForElementClickable(topJobAddToPlanButton, "30", driver);
		click(topJobAddToPlanButton, driver);
	}

	public boolean isOneHundredAndTwentyNineDollarAmountDisplay(WebDriver driver) {
		waitForElementVisibility(oneHundredAndTwentyNineDollarAmount, "30", driver);
		return isElementDisplayed(oneHundredAndTwentyNineDollarAmount, driver);
	}

	public void clickOnAlertEmailsAddToPlanButton(WebDriver driver) {
		waitForElementVisibility(alertEmailsAddToPlanButton, "30", driver);
		waitForElementClickable(alertEmailsAddToPlanButton, "30", driver);
		click(alertEmailsAddToPlanButton, driver);
	}

	public boolean isNinetyNineDollarAmountDisplay(WebDriver driver) {
		waitForElementVisibility(ninetyNineDollarAmount, "30", driver);
		return isElementDisplayed(ninetyNineDollarAmount, driver);
	}

	public void clickChangeButtonOnAddOnsPurchasePage(WebDriver driver) {
		waitForElementVisibility(changeButtonOnAddOnsPurchase, "30", driver);
		waitForElementClickable(changeButtonOnAddOnsPurchase, "30", driver);
		click(changeButtonOnAddOnsPurchase, driver);
	}

	public boolean isTableColumnTransactionIdDisplay(WebDriver driver) {
		waitForElementVisibility(tableColumnTransactionId, "30", driver);
		return isElementDisplayed(tableColumnTransactionId, driver);
	}

	public boolean isTableColumnNameDisplay(WebDriver driver) {
		waitForElementVisibility(tableColumnName, "30", driver);
		return isElementDisplayed(tableColumnName, driver);
	}

	public boolean isTableColumnTypeDisplay(WebDriver driver) {
		waitForElementVisibility(tableColumnType, "30", driver);
		return isElementDisplayed(tableColumnType, driver);
	}

	public boolean isTableColumnAmountDisplay(WebDriver driver) {
		waitForElementVisibility(tableColumnAmount, "30", driver);
		return isElementDisplayed(tableColumnAmount, driver);
	}

	public boolean isTableColumnDateDisplay(WebDriver driver) {
		waitForElementVisibility(tableColumnDate, "30", driver);
		return isElementDisplayed(tableColumnDate, driver);
	}

	public void clickOnBuyCreditsButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(buyCreditButton, "30", driver);
		waitForElementVisibility(buyCreditButton, "30", driver);
		click(buyCreditButton, driver);
	}

	public void clickOnPayButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(btnPay, "30", driver);
		waitForElementVisibility(btnPay, "30", driver);
		click(btnPay, driver);
	}

	public boolean verifyPlanNameIsDisplayed(WebDriver driver) {
		waitForElementVisibility(planName, "30", driver);
		return planName.isDisplayed();
	}

	public boolean verifyPlanNamesDisplayed(WebDriver driver) {
		waitForElementVisibility(planName_2, "30", driver);
		return planName_2.isDisplayed();
	}
	
	public void clickOnStripeSubscribeButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(stripeSubscribeButton, "30", driver);
		waitForElementVisibility(stripeSubscribeButton, "30", driver);
		click(stripeSubscribeButton, driver);
	}

	public void clickOnAddPaymentMethodButton(WebDriver driver) {
		waitForElementVisibility(addPaymentMethodButton, "30", driver);
		waitForElementClickable(addPaymentMethodButton, "30", driver);
		click(addPaymentMethodButton, driver);
	}

	public void clickOnAddButton(WebDriver driver) {
		waitForElementClickable(addButton, "30", driver);
		try {
			click(addButton, driver);
		} catch (Exception e) {
			clickUsingJavascriptExecutor(addButton, driver);
		}
	}

	public void clickOnReturnToMedReps(WebDriver driver) {
		waitForElementVisibility(returnToMedReps, "30", driver);
		waitForElementClickable(returnToMedReps, "30", driver);
		click(returnToMedReps, driver);
	}

	public void clickOnSubscribeButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(subscribe, "30", driver);
		waitForElementVisibility(subscribe, "30", driver);
		click(subscribe, driver);
	}

	public void clickOnFrequentlyAskedQuestions(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(5000, driver);
		waitForElementClickable(linkFrequentlyAskedQuestions, "30", driver);
		waitForElementVisibility(linkFrequentlyAskedQuestions, "30", driver);
		click(linkFrequentlyAskedQuestions, driver);
	}

	public boolean verifyMailBox(WebDriver driver) {
		waitForElementVisibility(mailBox, "30", driver);
		return mailBox.isDisplayed();
	}

	public boolean verifyAllDataIsShowingInTable(WebDriver driver) throws InterruptedException {

		boolean isShowing = true;

		for (int i = 0; i < dataInTransactionsTable.size(); i++) {
			if (i < 5) {
				continue;
			}
			System.out.println(dataInTransactionsTable.get(i).getText());
			System.out.println(i);
			if (dataInTransactionsTable.get(i).getText().isEmpty()) {
				isShowing = false;
				break;
			} else {
				isShowing = true;
			}
		}
		return isShowing;
	}

	public void clickCancelPlan(WebDriver driver) {

		try {
			waitForElementVisibility(cancelButton, "30", driver);
			click(cancelButton, driver);
		} catch (Exception e) {
			clickUsingJavascriptExecutor(cancelButton, driver);
		}
	}

	public void deleteCard(WebDriver driver) {

		try {
			waitForElementVisibility(threeDot, "30", driver);
			click(threeDot, driver);
			click(deletebtn, driver);
			click(deletePaymentMethod, driver);
		} catch (Exception e) {
		}
	}

	public boolean isNextBillingDateLabelDisplay(WebDriver driver) {
		waitTime(2000, driver);
		try {			
			waitForElementVisibility(yourPurchaseLabel, "30", driver);
			scrollIntoViewSmoothly(nextBillingDateLabel, driver);
			return isElementDisplayed(nextBillingDateLabel, driver);
		} catch (Exception e) {
			return isElementDisplayed(nextBillingDateLabel, driver);
		}
	}
	
	public boolean isPurchasingDateLabelDisplay(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(purchasingDateLabel, driver);
			return isElementDisplayed(purchasingDateLabel, driver);
		} catch (Exception e) {
			return isElementDisplayed(purchasingDateLabel, driver);
		}
	}
	
	public boolean isPlanNameLabelDisplay(WebDriver driver) {
		try {
			scrollIntoViewSmoothly(planNameLabel, driver);
			return isElementDisplayed(planNameLabel, driver);
		} catch (Exception e) {
			return isElementDisplayed(planNameLabel, driver);
		}
	}
	
	public String getNextBillDate(WebDriver driver) {
		String value = nextBillDate.getText().trim();	
		return value;
	}
	
	public String getPurchasingDate(WebDriver driver) {
		String value = purchasingDate.getText().trim();	
		return value;
	}
	
	public boolean isCanceledLabelDisplay(WebDriver driver) {
		waitTime(2000, driver);
		try {			
			waitForElementVisibility(canceledLbl, "30", driver);
			scrollIntoViewSmoothly(canceledLbl, driver);
			return isElementDisplayed(canceledLbl, driver);
		} catch (Exception e) {
			return isElementDisplayed(canceledLbl, driver);
		}
	}
	
	public boolean isExpireDateDisplay(WebDriver driver) {
		waitTime(2000, driver);
		try {			
			waitForElementVisibility(expireDate, "30", driver);
			scrollIntoViewSmoothly(expireDate, driver);
			return isElementDisplayed(expireDate, driver);
		} catch (Exception e) {
			return isElementDisplayed(expireDate, driver);
		}
	}
	
	public boolean isEmployer30DaySingleDayJobPostingDisplay(WebDriver driver) {
		waitTime(2000, driver);
		try {			
			waitForElementVisibility(employer30DaySingleDayJobPosting, "30", driver);
			scrollIntoViewSmoothly(employer30DaySingleDayJobPosting, driver);
			return isElementDisplayed(employer30DaySingleDayJobPosting, driver);
		} catch (Exception e) {
			return isElementDisplayed(employer30DaySingleDayJobPosting, driver);
		}
	}
	
	public boolean isPricingDisplay(String pricing , WebDriver driver) {
		WebElement findElement = driver
				.findElement(By.xpath("(//p[text()='"+pricing+"'])[1]"));
		return isElementDisplayed(findElement,driver);
	}
	
	
	
	

}
