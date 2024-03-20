package com.medrep.pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

import java.util.ArrayList;

public class EmployerSignUpPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2] | //img[@alt='MedReps logo']"))
	WebElement medrepLogo;

	@FindBy(xpath = "//img[@src='/icons/down-arrow.svg']") WebElement profileDropdownLogo;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("(//span[contains(text(),'Create an Account')])[last()]"))
	WebElement btnCreateAFreeAccount;

	@FindBy(xpath = ("(//a[contains(text(),'Click Here')])[last()]"))
	WebElement btnClickHere;
	
	@FindBy(xpath = ("//h1[contains(text(),'Post jobs with Medreps')]"))
	WebElement headingPostJobsWithMedreps;
	
	@FindBy(xpath = ("//p[contains(text(),'Monthly Unlimited Job Postings')]/../. | //p[contains(text(),'30 Day Unlimited Job Postings')]/../."))
	WebElement jobPostingPlanRenewMonthly;
	
	@FindBy(xpath = ("//button[contains(text(),'Next')]"))
	WebElement btnNext;

	@FindBy(xpath = "//button[text()='Make payment']") WebElement makePaymentButton;

	@FindBy(xpath = ("//input[@id='candidate-form_email']"))
	WebElement emailAddress;
	
	@FindBy(xpath = ("//input[@id='candidate-form_name']"))
	WebElement companyName;
	
	@FindBy(xpath = "//input[@id='candidate-form_password']")
	WebElement passwordInputField;
	
	@FindBy(xpath = "//input[@id='candidate-form_confirm']")
	WebElement confirmPasswordInputField;
	
	@FindBy(xpath = "//input[@id='candidate-form_marketing_preferences']/..")
	WebElement marketingpPeferencesCheckBox;
	
	@FindBy(xpath = "//input[@class='ant-checkbox-input']/..")
	WebElement agreeToTheTermAndConditionsCheckBox;
	
	@FindBy(xpath = ("//button[contains(text(),'Checkout')]"))
	WebElement btnCheckout;
	
	@FindBy(xpath = ("//input[@name='cardNumber']"))
	WebElement inputCardNumber;

	@FindBy(xpath = ("//input[@name='cardExpiry'] | //input[@name='expiry']"))
	WebElement inputCardExpiry;

	@FindBy(xpath = ("//input[@name='cardCvc'] | //input[@name='cvc']"))
	WebElement inputCardCvc;

	@FindBy(xpath = ("//input[@name='expiry']"))
	WebElement inputCardExpiryTwo;

	@FindBy(xpath = ("//input[@name='cvc']"))
	WebElement inputCardCvcTwo;

	@FindBy(xpath = ("//input[@name='billingName']"))
	WebElement inputNameOnCard;

	@FindBy(xpath = ("//select[@id='billingCountry']"))
	WebElement countryDropDown;

	@FindBy(xpath = ("//option[@value='PK']"))
	WebElement optionPakistan;

	@FindBy(xpath = ("//button[contains(@class,'SubmitButton')]"))
	WebElement btnPay;

	@FindBy(xpath = ("//h1[contains(text(),'Congratulation!')]"))
	WebElement labelCongratulation;

	@FindBy(xpath = ("//p[contains(text(),'You have successfully subscribed.')]"))
	WebElement labelSuccessfullySubscribed;

//	@FindBy(xpath = ("//p[contains(text(),'Renews quarterly')]/../../.."))
//	WebElement jobPostingPlanRenewQuarterly;
	@FindBy(xpath = ("//p[contains(text(),'30 Day Single Job Posting')]/../../."))
	WebElement jobPostingPlanPayAsYouGo;
	
	@FindBy(xpath = ("//p[text()='Annual Unlimited Job Postings']/parent::div"))
	WebElement jobPostingPlanRenewBiAnnually;

	@FindBy(xpath = "(//button[text()=\"Join Now\"])[1]") WebElement joinNowButton;

	@FindBy(xpath = "//a[text()=\"Click Here\"]") WebElement clickHereButton;

	@FindBy(xpath = "//p[text()='30 Day Single Job Posting']") WebElement choosePlan;

	@FindBy(xpath = "\"//button[text()='Next']\"") WebElement nextButton;

	@FindBy(xpath = "//p[text()='Featured Job']") WebElement featuredJobAddOn;

	@FindBy(xpath = "(//p[text()='30 Day Unlimited Resume Search'])[1]") WebElement thirtyDayUnlimtedAddOn;

	@FindBy(xpath = "//p[text()='1 Year Unlimited Resume Search']") WebElement oneYearUnlimitedAddOn;

	@FindBy(xpath = "//div[text()='Change']") WebElement changeButton;
	
	@FindBy(xpath = "//span[text()='Add']") WebElement addButton;
	
	@FindBy(xpath = ("//input[@id='Field-numberInput']"))
	WebElement inputCardNumber_2;
	
	@FindBy(xpath = ("//input[@id=\"Field-postalCodeInput\"]"))
	WebElement postalCode;
	
	@FindBy(xpath = ("//span[text()='Create an Account']"))
	WebElement createAnAccountLink;
	
	@FindBy(xpath = ("(//button[text()='Sign Me Up'])[1]"))
	WebElement signMeUpBtn;
	
	@FindBy(xpath = ("//p[text()='Monthly']"))
	WebElement monthlyMembershipOption;
	
	@FindBy(xpath = ("//span[text()='I have read and agree to the MedReps']"))
	WebElement iHaveReadAndAgreeToTheMedRepsCheckbox;
	
	@FindBy(xpath = ("(//a[text()='SEARCH JOBS'])[2]"))
	WebElement searchJobs;
	
	@FindBy(xpath = ("//input[@id='candidate-form_firstName']"))
	WebElement firstNameTxt;
	
	@FindBy(xpath = ("//input[@id='candidate-form_lastName']"))
	WebElement lastNameTxt;
	
	@FindBy(xpath = ("//a[text()='Click Here']"))
	WebElement clickHereLink;
	
	@FindBy(xpath = ("(//p[contains(text(),'$')])[1]"))
	WebElement featuredJobAmount;
	
	@FindBy(xpath = ("(//p[contains(text(),'$')])[2]"))
	WebElement yourPurchase;
	
	
	
	
	
	
	

//input[@id='candidate-form_password']
//input[@id='candidate-form_confirm']


	
	public EmployerSignUpPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public boolean isMedrepLogoDisplay(WebDriver driver) {
		waitForElementVisibility(medrepLogo, "60",driver);
		return isElementDisplayed(medrepLogo,driver);
	}

	public boolean profileNameDisplay(WebDriver driver){
		waitForElementVisibility(profileDropdownLogo, "30", driver);
		return isElementDisplayed(profileDropdownLogo, driver);
	}

	public void clickByHoverOnLogo(WebDriver driver){
		waitTime(1000,driver);
		waitForElementVisibility(medrepLogo, "30", driver);
		waitForElementClickable(medrepLogo, "30", driver);
		mouseHoverAndClick(medrepLogo, driver);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitTime(3000,driver);
		waitForElementClickable(btnLogin, "30",driver);
		
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
	public boolean isCreateAFreeAccountButtonDisplay(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(btnCreateAFreeAccount,driver);
		waitTime(2000);
		return isElementDisplayed(btnCreateAFreeAccount,driver);
	}

	public void clickJoinNowButton(WebDriver driver){
		waitForElementClickable(joinNowButton, "30", driver);
		click(joinNowButton, driver);
	}

	public void clickHereButton(WebDriver driver){
		waitforPageLoad(30,driver);
		waitForElementClickable(clickHereButton, "30", driver);
		click(clickHereButton, driver);
	}

	public void select30daysPlan(WebDriver driver){
		waitforPageLoad(30,driver);
		waitForElementClickable(choosePlan, "30", driver);
		click(choosePlan, driver);
	}

	public void selectFeaturedJobAddOn(WebDriver driver){
		waitforPageLoad(30,driver);
		waitForElementClickable(featuredJobAddOn, "30", driver);
		click(featuredJobAddOn, driver);
	}

	public void selectThirtyDaysUnlimitedAddOn(WebDriver driver){
		waitforPageLoad(30,driver);
		waitForElementClickable(thirtyDayUnlimtedAddOn, "30", driver);
		click(thirtyDayUnlimtedAddOn, driver);
	}

	public void selectOneYearUnlimitedAddOn(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(oneYearUnlimitedAddOn, "30", driver);
		click(oneYearUnlimitedAddOn, driver);
	}





	public void clickOnCreateAFreeAccount(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnCreateAFreeAccount,"30",driver);
		click(btnCreateAFreeAccount,driver);
	}
	
	public void clickOnEmployersClickHereButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(btnClickHere,driver);
		waitForElementClickable(btnClickHere,"30",driver);
		waitTime(2000);
		click(btnClickHere,driver);
	}
	
	public boolean isPostJobsWithMedrepsHeadingDisplay(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(headingPostJobsWithMedreps,"30",driver);
		return isElementDisplayed(headingPostJobsWithMedreps,driver);
	}
	
	public void chooseRenewMonthly$525JobPostingPlan(WebDriver driver) {
		waitForElementClickable(jobPostingPlanRenewMonthly,"30",driver);
		click(jobPostingPlanRenewMonthly,driver);
	}
	
	public void clickOnNextButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(btnNext,driver);
		waitForElementClickable(btnNext,"30",driver);
		waitTime(2000);
		click(btnNext,driver);
	}

	public void clickOnMakePayment(WebDriver driver){
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(makePaymentButton,driver);
		waitForElementClickable(makePaymentButton,"30",driver);
		waitTime(2000);
		click(makePaymentButton,driver);
	}

	
	public void enterEmail(String email,WebDriver driver) {
		scrollIntoViewSmoothly(emailAddress,driver);
		waitTime(2000);
		type(emailAddress, email,driver);
	}
	
	public void enterCompanyName(String name,WebDriver driver) {
		waitForElementVisibility(companyName, "30",driver);
		type(companyName, name,driver);
	}
	
	public void enterPassword(String pass,WebDriver driver) {
		scrollIntoViewSmoothly(passwordInputField,driver);
		waitTime(2000);
		type(passwordInputField, pass,driver);
	}

	public void enterConfirmPassword(String pass,WebDriver driver) {
		waitForElementVisibility(confirmPasswordInputField, "30",driver);
		type(confirmPasswordInputField, pass,driver);
	}

	public void checkMarketingPreferencesCheckBox(WebDriver driver) {
		waitForElementClickable(marketingpPeferencesCheckBox,"30",driver);
		click(marketingpPeferencesCheckBox,driver);
	}
	
	public void checkAgreeToTheTermAndConditionsCheckBox(WebDriver driver) {
		waitForElementClickable(agreeToTheTermAndConditionsCheckBox,"30",driver);
		click(agreeToTheTermAndConditionsCheckBox,driver);
	}
	
	public void clickOnCheckoutButton(WebDriver driver) {
		waitForElementClickable(btnCheckout,"60",driver);
		click(btnCheckout,driver);
	}
	
	public void enterCardNumber(String cardNumber,WebDriver driver) {
		try {
			waitForElementVisibility(changeButton,"30",driver);
			click(changeButton,driver);
		}catch (Exception e){
		}
		waitForElementVisibility(inputCardNumber, defaultWaitTime,driver);
		type(inputCardNumber, cardNumber,driver);
	}
	
	public void enterCardNumberTwo(String cardNumber,WebDriver driver) {
		try {
			waitForElementClickable(changeButton,"30",driver);
			click(changeButton,driver);
		}catch (Exception e){
			e.printStackTrace();
		}
		waitForElementVisibility(inputCardNumber_2, defaultWaitTime,driver);
		type(inputCardNumber_2, cardNumber,driver);
	}

	public void enterCardExpiryDate(String cardExpiry,WebDriver driver) {
		waitForElementVisibility(inputCardExpiry, defaultWaitTime,driver);
		type(inputCardExpiry, cardExpiry,driver);
	}

	public void enterCardCvcNumber(String cardCvc,WebDriver driver) {
		waitForElementVisibility(inputCardCvc, defaultWaitTime,driver);
		type(inputCardCvc, cardCvc,driver);
	}
	
	public void enterCardExpiryDateTwo(String cardExpiry,WebDriver driver) {
		waitForElementVisibility(inputCardExpiryTwo, defaultWaitTime,driver);
		type(inputCardExpiryTwo, cardExpiry,driver);
	}

	public void enterCardCvcNumberTwo(String cardCvc,WebDriver driver) {
		waitForElementVisibility(inputCardCvcTwo, defaultWaitTime,driver);
		type(inputCardCvcTwo, cardCvc,driver);
	}
	
	public void enterNameOnCard(String nameOnCard,WebDriver driver) {
		waitForElementVisibility(inputNameOnCard, defaultWaitTime,driver);
		type(inputNameOnCard, nameOnCard,driver);
	}
	
	public void enterPostalCode(String code,WebDriver driver) {
		waitForElementVisibility(postalCode, defaultWaitTime,driver);
		type(postalCode, code,driver);
	}
	

	public void clickOnCountryDropDown(WebDriver driver) {
		waitForElementClickable(countryDropDown,"30",driver);
		click(countryDropDown,driver);
	}

	public void clickOnPakistanOption(WebDriver driver) {
		waitForElementClickable(optionPakistan,"30",driver);
		click(optionPakistan,driver);
	}

	public void clickOnPayButton(WebDriver driver) {
		waitForElementClickable(btnPay, "30",driver);
		click(btnPay,driver);
	}

	public boolean isCongratulationLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelCongratulation, "30",driver);
		return isElementDisplayed(labelCongratulation,driver);
	}

	public boolean isYouHaveSuccessfullySubscribedDisplay(WebDriver driver) {
		waitForElementVisibility(labelSuccessfullySubscribed, "30",driver);
		return isElementDisplayed(labelSuccessfullySubscribed,driver);
	}

//	public void chooseRenewQuarterly$1775JobPostingPlan(WebDriver driver) {
//		scrollIntoViewSmoothly(jobPostingPlanRenewQuarterly,driver);
//		waitTime(2000);
//		click(jobPostingPlanRenewQuarterly,driver);
//	}
	public void choosePayAsYouGoJobPostingPlan(WebDriver driver) {
		scrollIntoViewSmoothly(jobPostingPlanPayAsYouGo,driver);
		waitForElementClickable(jobPostingPlanPayAsYouGo,"30",driver);
		waitTime(2000);
		click(jobPostingPlanPayAsYouGo,driver);
	}
	
	public void chooseRenewBiAnnually$2625JobPostingPlan(WebDriver driver) {
		scrollIntoViewSmoothly(jobPostingPlanRenewBiAnnually,driver);
		waitForElementClickable(jobPostingPlanRenewBiAnnually,"30",driver);
		waitTime(2000);
		click(jobPostingPlanRenewBiAnnually,driver);
	}
	
	public void clickOnCreateAnAccountLink(WebDriver driver) {
		waitForElementClickable(createAnAccountLink, "30",driver);
		click(createAnAccountLink,driver);
	}
	
	public void clickOnSignMeUpButton(WebDriver driver) {
		waitForElementClickable(signMeUpBtn, "30",driver);
		click(signMeUpBtn,driver);
	}
	
	public void clickOnMonthlyMembershipOption(WebDriver driver) {
		waitForElementClickable(monthlyMembershipOption, "30",driver);
		click(monthlyMembershipOption,driver);
	}
	
	public void clickOnIHaveReadAndAgreeToTheMedRepsCheckbox(WebDriver driver) {
		waitForElementClickable(monthlyMembershipOption, "30",driver);
		click(monthlyMembershipOption,driver);
	}
	
	public void clickOnSearchJobsButton(WebDriver driver) {
		waitForElementClickable(emailAddress, "30",driver);
		click(searchJobs,driver);
	}
	
	
	public void enterFirstName(String firstName,WebDriver driver) {
		scrollIntoViewSmoothly(firstNameTxt,driver);
		waitTime(2000);
		type(firstNameTxt, firstName,driver);
	}
	
	public void enterLastName(String lastName,WebDriver driver) {
		scrollIntoViewSmoothly(lastNameTxt,driver);
		waitTime(2000);
		type(lastNameTxt, lastName,driver);
	}
	
	
	public void clickOnClickHereLink(WebDriver driver) {
		waitTime(4000);
		click(clickHereLink,driver);
	}
	
	public String getTotalAmountBefore(WebDriver driver) {
		waitTime(4000);
		String v = featuredJobAmount.getText().trim().replace("$", "");
		float featuredJobVal = Float.parseFloat(v);
		String v_2 =yourPurchase.getText().trim().replace("$", "");
		float yourPurchaseVal = Float.parseFloat(v_2);
		String totalAmount = "$"+String.valueOf(yourPurchaseVal + featuredJobVal);
		
		return totalAmount;
	}
	
	public String getYourPurchase(WebDriver driver) {
		String yourPurchaseVale =yourPurchase.getText().trim().replace(".00", ".0");
		
		return yourPurchaseVale;
	}
	
	
	

}
