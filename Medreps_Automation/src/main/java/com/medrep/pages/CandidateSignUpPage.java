package com.medrep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateSignUpPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
	WebElement medrepLog;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("(//span[contains(text(),'Create an Account')])[last()]"))
	WebElement btnCreateAFreeAccount;

	@FindBy(xpath = ("(//p[contains(text(),'Bi-Annual')])[last()]"))
	WebElement CheckboxBiAnnual;

	@FindBy(xpath = ("(//input[@id='firstName'])[last()]"))
	WebElement firstNameInputField;

	@FindBy(xpath = ("//input[@name='lastName']"))
	WebElement lastNameInputField;

	@FindBy(xpath = ("(//input[@id='email'])[last()] | (//input[@type='email'])[last()]"))
	WebElement emailAddress;

	@FindBy(xpath = ("(//input[@id='confirmEmail'])[last()] | (//input[@id='candidate-form_name'])[last()]"))
	WebElement confirmEmailAddress;

	@FindBy(xpath = ("(//input[@id='password'])[last()] | (//input[@id='candidate-form_password'])[last()]"))
	WebElement password;
	
	@FindBy(xpath = ("(//input[@id='password'])[last()]"))
	WebElement password_2;

	@FindBy(xpath = ("(//input[@id='confirmPassword'])[last()] | (//input[@id='candidate-form_confirm'])[last()]"))
	WebElement inputConfirmPassword;
	
	@FindBy(xpath = ("(//input[@id='confirmPassword'])[last()]"))
	WebElement inputConfirmPassword_2;

	@FindBy(xpath = ("(//input[@name='remember'])[last()]/.. | (//input[@id='remember'])[last()]/.. | //span[contains(text(),'I have read and agree to the MedReps')]"))
	WebElement checkBoxIHaveReadAndAgreeToTheMedRepscom;

	@FindBy(xpath = ("(//*[contains(text(),'Employers')])[last()]/../button | //button[text()='Register']"))
	WebElement btnRegister;

	@FindBy(xpath = ("//input[@name='cardNumber']"))
	WebElement inputCardNumber;

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

	@FindBy(xpath = "//input[@id='enableStripePass']")
	WebElement checkBoxOnCreditCardInfoPage;

	@FindBy(xpath = ("//button[contains(@class,'SubmitButton')] | //button[text()='Pay']"))
	WebElement btnPay;

	@FindBy(xpath = ("//h1[contains(text(),'Congratulation!')]"))
	WebElement labelCongratulation;

	@FindBy(xpath = ("//p[contains(text(),'You have successfully subscribed.')]"))
	WebElement labelSuccessfullySubscribed;

	@FindBy(xpath = ("(//p[contains(text(),'Quarterly')])[last()]"))
	WebElement CheckboxEveryThreeMonths;

	@FindBy(xpath = ("(//p[contains(text(),'Monthly')])[last()]"))
	WebElement checkboxEveryMonth;

	@FindBy(xpath = ("(//button[contains(text(),'Join Now')])[1]"))
	WebElement btnJoinNow;

	@FindBy(xpath = ("//button[contains(text(),'Next')]"))
	WebElement btnNext;

	@FindBy(xpath = "(//input[contains(@placeholder,'E-Mail')])[position()=1]")
	WebElement candidateFormEmailInputField;

	@FindBy(xpath = "(//input[contains(@placeholder,'Confirm E-Mail')])[last()]")
	WebElement candidateFormConfirmEmialInputField;

	@FindBy(xpath = "(//input[@placeholder='First Name'])[position()=1]")
	WebElement candidateFormFirstNameInputField;

	@FindBy(xpath = "(//input[@placeholder='Last Name'])[position()=1]")
	WebElement candidateFormLastNameInputField;

	@FindBy(xpath = "(//input[@placeholder='Password'])[position()=1]")
	WebElement candidateFormPasswordInputField;

	@FindBy(xpath = "(//input[@placeholder='Confirm Password'])[position()=1]")
	WebElement candidateFormPasswordConfirmInputField;

	@FindBy(xpath = "(//input[@id='marketing_preferences'])[last()]/..")
	WebElement marketingpPeferencesCheckBox;

	@FindBy(xpath = "(//input[@name='remember'])[last()]/.. | (//input[@id='remember'])[last()]/..")
	WebElement agreeToTheTermAndConditionsCheckBox;

	@FindBy(xpath = ("(//button[text()='Register'])[last()]"))
	WebElement btnCheckout;

	@FindBy(xpath = ("//button[contains(text(),'Skip')]"))
	WebElement btnSkip;

	@FindBy(xpath = ("(//button[text()='Register'])[last()]"))
	WebElement btnSignup;

	@FindBy(xpath = "//button[text()='Get Membership']")
	WebElement getMembershipBtnOnCandidateDashboard;

	@FindBy(xpath = ("//h1[contains(text(),'Choose your subscription plan')]"))
	WebElement headingCandidateSubscription;

	@FindBy(xpath = ("//p[contains(text(),'Membership | Bi-Annual')]"))
	WebElement labelBiAnnualMembership;

	@FindBy(xpath = ("//div[contains(text(),'Every Six Months')]/../..//button"))
	WebElement btnContinueEverySixMonths;

	@FindBy(xpath = ("//p[contains(text(),'Quarterly')]"))
	WebElement labelQuaterly;

	@FindBy(xpath = ("//div[contains(text(),'Every Three Months')]/../..//button"))
	WebElement btnContinueEveryThreeMonths;

	@FindBy(xpath = ("//p[contains(text(),'Membership | Monthly')]"))
	WebElement labelMonthlyMembership;

	@FindBy(xpath = ("//div[contains(text(),'Every Month')]/../..//button"))
	WebElement btnContinueEveryMonth;

	@FindBy(xpath = ("(//span[contains(@class,'ant-avatar')])[1]"))
	WebElement profileDropdownIcon;

	@FindBy(xpath = ("//span[contains(text(),'Logout')]"))
	WebElement btnLogout;

	@FindBy(xpath = "//input[@id='candidate-form_username']")
	WebElement candidateFormEmail;

	@FindBy(xpath = ("(//button[@type='submit'])[2]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//div[contains(text(),'Every Six Months')])/..//following-sibling::button"))
	WebElement btnContinueOfEverySixMonths;

	@FindBy(xpath = ("//button[contains(text(),'Pay')]"))
	WebElement btnProceedToCheckOut;

	@FindBy(xpath = ("(//div[contains(text(),'Every Three Months')])/..//following-sibling::button"))
	WebElement btnContinueOfEveryThreeMonths;

	@FindBy(xpath = ("(//div[contains(text(),'Every Month')])/..//following-sibling::button"))
	WebElement btnContinueOfEveryMonth;
	
	@FindBy(xpath = ("//div[@class='Header-merchantLogoContainer']"))
	WebElement logoBackBtn;
	
	@FindBy(xpath = ("//a[text()='Account']"))
	WebElement accountOption;
	
	@FindBy(xpath = ("//a[text()='Buy subscription']"))
	WebElement buySubscription;
	
	@FindBy(xpath = ("//a[text()='Profile']"))
	WebElement profileOption;
	
	@FindBy(xpath = ("//h1[text()='Company Profile']"))
	WebElement profilePageTitle;
	
	@FindBy(xpath = ("(//p[contains(text(),'$')])[2]"))
	WebElement priceing;
	
	
	
	
	public CandidateSignUpPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public boolean isMedrepLogoDisplay(WebDriver driver) {
//		waitforPageLoad(30, driver);
		waitForElementVisibility(medrepLog, "10", driver);
		return isElementDisplayed(medrepLog, driver);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(3000, driver);
		waitForElementVisibility(btnLogin, "30", driver);
		waitForElementClickable(btnLogin, "30", driver);
		click(btnLogin, driver);
		try {
			waitForElementVisibility(btnLogin, "30", driver);
			waitForElementClickable(btnLogin, "30", driver);
			waitTime(5000);
			click(btnLogin, driver);
		} catch (Exception e) {

		}
	}

	public boolean isCreateAFreeAccountButtonDisplay(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(btnCreateAFreeAccount, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnCreateAFreeAccount, "30", driver);
		return isElementDisplayed(btnCreateAFreeAccount, driver);
	}

	public void clickOnCreateAFreeAccount(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(btnCreateAFreeAccount, driver);
		waitTime(2000, driver);
		waitForElementClickable(btnCreateAFreeAccount, "30", driver);
		click(btnCreateAFreeAccount, driver);
	}

	public void checkBiAnnualCheckBox(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(CheckboxBiAnnual, "30", driver);
		waitForElementClickable(CheckboxBiAnnual, "30", driver);
		click(CheckboxBiAnnual, driver);
	}

	public void enterFirstName(String firstName, WebDriver driver) {
		scrollIntoViewSmoothly(firstNameInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(firstNameInputField, "30", driver);
		type(firstNameInputField, firstName, driver);
	}

	public void enterLastName(String lastName, WebDriver driver) {
		waitForElementVisibility(lastNameInputField, "30", driver);
		type(lastNameInputField, lastName, driver);
	}

	public void enterEmail(String email, WebDriver driver) {
		waitForElementVisibility(emailAddress, "30", driver);
		type(emailAddress, email, driver);
	}

	public void enterConfirmEmail(String confirmEmail, WebDriver driver) {
		waitForElementVisibility(confirmEmailAddress, "30", driver);
		type(confirmEmailAddress, confirmEmail, driver);
	}

	public void enterPassword(String pass, WebDriver driver) {
		try {
			type(password_2, pass, driver);			
		} catch (Exception e) {
			waitForElementVisibility(password, "30", driver);
			type(password, pass, driver);
		}
	}

	public void enterConfirmPassword(String pass, WebDriver driver) {
		try {
			type(inputConfirmPassword_2, pass, driver);			
		} catch (Exception e) {
			waitForElementVisibility(inputConfirmPassword, "30", driver);
			type(inputConfirmPassword, pass, driver);
		}
		
	}

	public void checkIHaveReadAndAgreeToTheMedRepscomCheckBox(WebDriver driver) {
		scrollIntoViewSmoothly(checkBoxIHaveReadAndAgreeToTheMedRepscom, driver);
		waitTime(2000, driver);
		waitForElementClickable(checkBoxIHaveReadAndAgreeToTheMedRepscom, "30", driver);
		click(checkBoxIHaveReadAndAgreeToTheMedRepscom, driver);
	}

	public void clickOnRegisterButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(btnRegister, "30", driver);
		scrollIntoViewSmoothly(btnRegister, driver);
		waitTime(1000, driver);
		waitForElementClickable(btnRegister, "30", driver);
		click(btnRegister, driver);
	}

	public void enterCardNumber(String cardNumber, WebDriver driver) {
		waitForElementVisibility(inputCardNumber, "30", driver);
		type(inputCardNumber, cardNumber, driver);
	}

	public void enterCardExpiryDate(String cardExpiry, WebDriver driver) {
		waitForElementVisibility(inputCardExpiry, "30", driver);
		type(inputCardExpiry, cardExpiry, driver);
	}

	public void enterCardCvcNumber(String cardCvc, WebDriver driver) {
		waitForElementVisibility(inputCardCvc, "30", driver);
		type(inputCardCvc, cardCvc, driver);
	}

	public void enterNameOnCard(String nameOnCard, WebDriver driver) {
		waitForElementVisibility(inputNameOnCard, "30", driver);
		type(inputNameOnCard, nameOnCard, driver);
	}

	public void clickOnCountryDropDown(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(countryDropDown, "30", driver);
		click(countryDropDown, driver);
	}

	public void clickOnPakistanOption(WebDriver driver) {
		waitForElementClickable(optionPakistan, "30", driver);
		click(optionPakistan, driver);
	}

	public void clickOnPayButton(WebDriver driver) {
		waitForElementClickable(btnPay, "30", driver);
		click(btnPay, driver);
	}

	public boolean isCongratulationLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelCongratulation, "30", driver);
		return isElementDisplayed(labelCongratulation, driver);
	}

	public boolean isYouHaveSuccessfullySubscribedDisplay(WebDriver driver) {
		waitForElementVisibility(labelSuccessfullySubscribed, "30", driver);
		return isElementDisplayed(labelSuccessfullySubscribed, driver);
	}

	public void checkEveryThreeMonthsCheckBox(WebDriver driver) {
		scrollIntoViewSmoothly(CheckboxEveryThreeMonths, driver);
		waitTime(2000, driver);
		waitForElementVisibility(CheckboxEveryThreeMonths, "30", driver);
		waitForElementClickable(CheckboxEveryThreeMonths, "30", driver);
		click(CheckboxEveryThreeMonths, driver);
	}

	public void checkEveryMonthCheckBox(WebDriver driver) {
		scrollIntoViewSmoothly(checkboxEveryMonth, driver);
		waitTime(2000, driver);
		waitForElementVisibility(checkboxEveryMonth, "30", driver);
		waitForElementClickable(checkboxEveryMonth, "30", driver);
		click(checkboxEveryMonth, driver);
	}

	public void clickOnJoinNowButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(btnJoinNow, "30", driver);
		waitTime(2000);
		waitForElementClickable(btnJoinNow, "30", driver);
		click(btnJoinNow, driver);
		try {
			getRefreshWebPage(driver);
			waitForElementVisibility(btnJoinNow, "30", driver);
			waitTime(2000);
			waitForElementClickable(btnJoinNow, "30", driver);
			click(btnJoinNow, driver);
		} catch (Exception e) {

		}
		waitforPageLoad(30, driver);
	}

	public void clickOnNextButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnNext, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnNext, "30", driver);
		waitForElementClickable(btnNext, "30", driver);
		click(btnNext, driver);
	}

	public void enterCandidateConfirmEmail(String Email, WebDriver driver) {
		scrollIntoViewSmoothly(candidateFormConfirmEmialInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormConfirmEmialInputField, "30", driver);
		type(candidateFormConfirmEmialInputField, Email, driver);
	}

	public void enterCandidateEmail(String Email, WebDriver driver) {
		scrollIntoViewSmoothly(candidateFormEmailInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormEmailInputField, "30", driver);
		type(candidateFormEmailInputField, Email, driver);
	}

	public void enterCandidateFirstName(String firstName, WebDriver driver) {
		scrollIntoViewSmoothly(candidateFormFirstNameInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormFirstNameInputField, "30", driver);
		type(candidateFormFirstNameInputField, firstName, driver);
	}

	public void enterCandidateLastName(String lastName, WebDriver driver) {
		waitForElementVisibility(candidateFormLastNameInputField, "30", driver);
		type(candidateFormLastNameInputField, lastName, driver);
	}

	public void enterCandidatePassword(String password, WebDriver driver) {
		scrollIntoViewSmoothly(candidateFormPasswordInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormPasswordInputField, "30", driver);
		type(candidateFormPasswordInputField, password, driver);
	}

	public void enterCandidateComfirmPassword(String password, WebDriver driver) {
		waitForElementVisibility(candidateFormPasswordConfirmInputField, "30", driver);
		type(candidateFormPasswordConfirmInputField, password, driver);
	}

	public void checkMarketingPreferencesCheckBox(WebDriver driver) {
		try {
			waitForElementVisibility(marketingpPeferencesCheckBox, "5", driver);
			waitForElementClickable(marketingpPeferencesCheckBox, "5", driver);
			click(marketingpPeferencesCheckBox, driver);
		} catch (Exception e) {

		}

	}

	public void checkAgreeToTheTermAndConditionsCheckBox(WebDriver driver) {
		try {
			waitForElementVisibility(agreeToTheTermAndConditionsCheckBox, "30", driver);
			waitForElementClickable(agreeToTheTermAndConditionsCheckBox, "30", driver);
			click(agreeToTheTermAndConditionsCheckBox, driver);
		} catch (Exception e) {
		}
	}

	public void clickOnCheckoutButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(btnCheckout, "30", driver);
		waitForElementClickable(btnCheckout, "30", driver);
		click(btnCheckout, driver);
	}

	public void clickOnSkipButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnSkip, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnSkip, "30", driver);
		waitForElementClickable(btnSkip, "30", driver);
		click(btnSkip, driver);
	}

	public void clickOnSignUpButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnSignup, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnSignup, "30", driver);
		waitForElementClickable(btnSignup, "30", driver);
		click(btnSignup, driver);
		waitforPageLoad(30, driver);
	}

	public boolean isCandidateSubscriptionPageShow(WebDriver driver) {
		waitForElementVisibility(headingCandidateSubscription, "30", driver);
		return isElementDisplayed(headingCandidateSubscription, driver);
	}

	public boolean isBiAnnualLabelDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(labelBiAnnualMembership, driver);
		waitTime(2000, driver);
		waitForElementVisibility(labelBiAnnualMembership, "30", driver);
		return isElementDisplayed(labelBiAnnualMembership, driver);
	}

	public boolean isEverySixMonthSubscriptionContinueButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnContinueEverySixMonths, "30", driver);
		return isElementDisplayed(btnContinueEverySixMonths, driver);
	}

	public boolean isQuarterlyLabelDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(labelQuaterly, driver);
		waitTime(2000, driver);
		waitForElementVisibility(labelQuaterly, "30", driver);
		return isElementDisplayed(labelQuaterly, driver);
	}

	public boolean isEveryThreeMonthSubscriptionContinueButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnContinueEveryThreeMonths, "30", driver);
		return isElementDisplayed(btnContinueEveryThreeMonths, driver);
	}

	public boolean isMonthlyMembershipLabelDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(labelMonthlyMembership, driver);
		waitTime(2000, driver);
		waitForElementVisibility(labelMonthlyMembership, "30", driver);
		return isElementDisplayed(labelMonthlyMembership, driver);
	}

	public boolean isEveryMonthSubscriptionContinueButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnContinueEveryMonth, "30", driver);
		return isElementDisplayed(btnContinueEveryMonth, driver);
	}

	public void clickOnProfileDropdownIcon(WebDriver driver) {
		waitForElementVisibility(profileDropdownIcon, "30", driver);
		waitForElementClickable(profileDropdownIcon, "30", driver);
		click(profileDropdownIcon, driver);
	}

	public void clickOnLogoutButton(WebDriver driver) {
		waitForElementVisibility(btnLogout, "30", driver);
		waitForElementClickable(btnLogout, "30", driver);
		click(btnLogout, driver);
	}

	public void enterCandidateEmailLogin(String email, WebDriver driver) {
		waitForElementVisibility(candidateFormEmail, "30", driver);
		type(candidateFormEmail, email, driver);
	}

	public void clickOnSubmitLoginButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnSubmitLogin, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnSubmitLogin, "30", driver);
		waitForElementClickable(btnSubmitLogin, "30", driver);
		click(btnSubmitLogin, driver);
	}

	public void clickOnBiAnnualMembershipeButton(WebDriver driver) {
		scrollIntoViewSmoothly(labelBiAnnualMembership, driver);
		waitTime(2000, driver);
		waitForElementClickable(labelBiAnnualMembership, "30", driver);
		click(labelBiAnnualMembership, driver);
	}

	public void clickOnPayBtn(WebDriver driver) {
		waitForElementClickable(btnProceedToCheckOut, "30", driver);
		waitForElementClickable(btnProceedToCheckOut, "30", driver);
		click(btnProceedToCheckOut, driver);
	}

	public void clickOnQuarterlySubscriptionButton(WebDriver driver) {
		scrollIntoViewSmoothly(labelQuaterly, driver);
		waitTime(2000, driver);
		waitForElementClickable(labelQuaterly, "30", driver);
		click(labelQuaterly, driver);
	}

	public void clickOnEveryMonthSubScriptionOfContinueButton(WebDriver driver) {
		scrollIntoViewSmoothly(labelMonthlyMembership, driver);
		waitTime(2000, driver);
		waitForElementClickable(labelMonthlyMembership, "30", driver);
		click(labelMonthlyMembership, driver);
	}

	public void clickOnPayButton() {
		waitForElementClickable(btnPay, "30", driver);
		waitForElementClickable(btnPay, "30", driver);
		click(btnPay, driver);
	}

	public void checkEveryMonthCheckBox() {
		scrollIntoViewSmoothly(checkboxEveryMonth, driver);
		waitTime(2000, driver);
		waitForElementVisibility(checkboxEveryMonth, "30", driver);
		waitForElementClickable(checkboxEveryMonth, "30", driver);
		click(checkboxEveryMonth, driver);
	}

	public void clickOnJoinNowButton() {
		waitForElementVisibility(btnJoinNow, "30", driver);
		waitForElementClickable(btnJoinNow, "30", driver);
		click(btnJoinNow, driver);
	}

	public void clickOnNextButton() {
		scrollIntoViewSmoothly(btnNext, driver);
		waitTime(2000, driver);
		waitForElementVisibility(btnNext, "30", driver);
		waitForElementClickable(btnNext, "30", driver);
		click(btnNext, driver);
	}

	public void enterCandidateEmail(String Email) {
		scrollIntoViewSmoothly(candidateFormEmailInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormEmailInputField, "30", driver);
		type(candidateFormEmailInputField, Email, driver);
	}

	public void enterCandidateFirstName(String firstName) {
		scrollIntoViewSmoothly(candidateFormFirstNameInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormFirstNameInputField, "30", driver);
		type(candidateFormFirstNameInputField, firstName, driver);
	}

	public void enterCandidateLastName(String lastName) {
		waitForElementVisibility(candidateFormLastNameInputField, "30", driver);
		type(candidateFormLastNameInputField, lastName, driver);
	}

	public void enterCandidatePassword(String password) {
		scrollIntoViewSmoothly(candidateFormPasswordInputField, driver);
		waitTime(2000, driver);
		waitForElementVisibility(candidateFormPasswordInputField, "30", driver);
		type(candidateFormPasswordInputField, password, driver);
	}

	public void enterCandidateComfirmPassword(String password) {
		waitForElementVisibility(candidateFormPasswordConfirmInputField, "30", driver);
		type(candidateFormPasswordConfirmInputField, password, driver);
	}

	public void checkMarketingPreferencesCheckBox() {
		try {
			click(marketingpPeferencesCheckBox, driver);

		} catch (Exception e) {
			clickUsingJavascriptExecutor(marketingpPeferencesCheckBox, driver);
		}

	}

	public void clickOnGetMembershipBtnOnCandidateDashboard(WebDriver driver) {
		waitForElementVisibility(getMembershipBtnOnCandidateDashboard, "30", driver);
		scrollIntoViewSmoothly(getMembershipBtnOnCandidateDashboard, driver);
		waitForElementClickable(getMembershipBtnOnCandidateDashboard, "30", driver);
		click(getMembershipBtnOnCandidateDashboard, driver);
	}
	
	public void clickOnBackButton(WebDriver driver) {
		scrollIntoViewSmoothly(logoBackBtn, driver);
		waitForElementClickable(logoBackBtn, "30", driver);
		click(logoBackBtn, driver);
	}
	
	public void clickOnAccountOption(WebDriver driver) {
		waitForElementClickable(accountOption, "30", driver);
		click(accountOption, driver);
	}
	
	public void clickOnBuySubscriptionLink(WebDriver driver) {
		waitForElementClickable(buySubscription, "30", driver);
		click(buySubscription, driver);
	}
	
	public boolean isLogoutOptionDisplay(WebDriver driver) {
		waitForElementVisibility(btnLogout, "30", driver);
		return isElementDisplayed(btnLogout, driver);
	}

	public boolean isProfileOptionDisplay(WebDriver driver) {
		waitForElementVisibility(profileOption, "30", driver);
		return isElementDisplayed(profileOption, driver);
	}
	
	public void clickOnProfileOption(WebDriver driver) {
		scrollIntoViewSmoothly(profileOption, driver);
		waitForElementClickable(profileOption, "30", driver);
		click(profileOption, driver);
	}
	
	public boolean isProfilePageTitleDisplay(WebDriver driver) {
		waitForElementVisibility(profilePageTitle, "30", driver);
		return isElementDisplayed(profilePageTitle, driver);
	}
	
	public String getPriceing(WebDriver driver) {
		String value = priceing.getText().trim();	
		return value;
	}
	
	public String getMonthlyPackage(WebDriver driver) {
		String value = checkboxEveryMonth.getText().trim();	
		return value;
	}
	
	
	
}
