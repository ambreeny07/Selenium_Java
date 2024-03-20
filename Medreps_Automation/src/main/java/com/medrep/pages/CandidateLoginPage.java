package com.medrep.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateLoginPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//div[@class='flex items-center']/span)[last()]"))
	WebElement profileBtn;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[contains(@type,'email')]"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[contains(@type,'password')] | //input[@placeholder='Password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;
	
	@FindBy(xpath = ("(//img[@alt='Medreps logo'])[last()]"))
	WebElement medrepLogo;
	
	@FindBy(xpath = ("//p[text()='Current Members Login to Your Account.']"))
	WebElement currentMembersLoginToYourAccountText;
	
	@FindBy(xpath = ("//span[text()='Remember me next time.'] | //span[text()='Remember me next time']"))
	WebElement rememberMeNextTimeCheckbox;
	
	@FindBy(xpath = ("//a[text()='Forgot Password?']"))
	WebElement forgotPasswordBtn;

	@FindBy(xpath = ("//p[contains(text(),'Not a member yet?')]"))
	WebElement notAMemberYet;
	
	@FindBy(xpath = ("//span[contains(text(),'Create an Account')]"))
	WebElement createAnAccount;
	
	@FindBy(xpath = ("//p[contains(text(),'By signing in to MedReps.com')]"))
	WebElement bySigningInToMedRepsText;
	
	@FindBy(xpath = ("(//p[contains(text(),'2000-2022 MedReps. All rights reserved.')])[last()]"))
	WebElement copyrightText;
	
	@FindBy(xpath = ("(//p[contains(text(),'The go-to site for medical sales jobs and advice')])[last()]"))
	WebElement imageOnRightSideWitText;

	@FindBy(xpath="//span[@class='anticon anticon-eye-invisible ant-input-password-icon']")
	WebElement eyeIconInPasswordTxt;

	@FindBy(xpath="//h1[text()='Forgot Password']")
	WebElement forgotPasswordPage;
	
	@FindBy(xpath="//a[text()='Terms of Use & Privacy Policy.']")
	WebElement termsOfUsePrivacyPolicylink;
	
	@FindBy(xpath="//p[text()='Register for a MedReps membership']")
	WebElement registerForAMedRepsMembershipPopup;
	
	@FindBy(xpath="(//h1[text()='Privacy Policy'])[1]")
	WebElement termsOfUsePrivacyPolicyPageTitle;
	
	@FindBy(xpath = ("(//a[text()='DASHBOARD '])[last()]"))
	WebElement btnDashboard;
	
	public CandidateLoginPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public boolean isMedrepLogoDisplay(WebDriver driver){
		waitforPageLoad(30, driver);
		 waitForElementVisibility(medrepLogo, "30",driver);
		 return isElementDisplayed(medrepLogo,driver);
	 }
	public boolean verifyOnLoginButton(WebDriver driver) {
		waitTime(2000);
		return isElementDisplayed(btnLogin, driver);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30", driver);
		waitForElementClickable(btnLogin, "30", driver);
		waitTime(2000);
		click(btnLogin, driver);
		try {
			waitForElementVisibility(btnLogin, "30", driver);
			waitForElementClickable(btnLogin, "30", driver);
			waitTime(2000);
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
	
	public boolean isCurrentMembersLoginToYourAccountTextDisplay(WebDriver driver) {
		waitForElementVisibility(currentMembersLoginToYourAccountText, "30", driver);
		return isElementDisplayed(currentMembersLoginToYourAccountText, driver);
	}
	
	public boolean isRememberMeNextTimeCheckboxDisplay(WebDriver driver) {
		waitForElementVisibility(rememberMeNextTimeCheckbox, "30", driver);
		return isElementDisplayed(rememberMeNextTimeCheckbox, driver);
	}
	
	public boolean isForgotPasswordButtonDisplay(WebDriver driver) {
		waitForElementVisibility(forgotPasswordBtn, "30", driver);
		return isElementDisplayed(forgotPasswordBtn, driver);
	}
	
	public boolean isNotAMemberYetDisplay(WebDriver driver) {
		waitForElementVisibility(notAMemberYet, "30", driver);
		return isElementDisplayed(notAMemberYet, driver);
	}
	
	public boolean isCreateAnAccountDisplay(WebDriver driver) {
		waitForElementVisibility(createAnAccount, "30", driver);
		return isElementDisplayed(createAnAccount, driver);
	}
	
	public boolean isBySigningInToMedRepsTextDisplay(WebDriver driver) {
		waitForElementVisibility(bySigningInToMedRepsText, "30", driver);
		return isElementDisplayed(bySigningInToMedRepsText, driver);
	}
	
	public boolean isCopyrightTextDisplay(WebDriver driver) {
		waitForElementVisibility(copyrightText, "30", driver);
		return isElementDisplayed(copyrightText, driver);
	}
	
	public boolean isImageOnRightSideWitTextDisplay(WebDriver driver) {
		waitForElementVisibility(imageOnRightSideWitText, "30", driver);
		return isElementDisplayed(imageOnRightSideWitText, driver);
	}

	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementVisibility(btnSubmitLogin, "30", driver);
		waitForElementClickable(btnSubmitLogin, "30", driver);
		click(btnSubmitLogin, driver);
	}

	public boolean isEyeIconInPasswordTextDisplay(WebDriver driver) {
		waitForElementVisibility(eyeIconInPasswordTxt, "30", driver);
		return isElementDisplayed(eyeIconInPasswordTxt, driver);
	}
	
	public void clickOnEyeIconInPasswordTxt(WebDriver driver) {
		waitForElementVisibility(eyeIconInPasswordTxt,"20",driver);
		scrollToElement(eyeIconInPasswordTxt,driver);
		waitForElementClickable(eyeIconInPasswordTxt, "30",driver);
		click(eyeIconInPasswordTxt,driver);
	}
	
	public void clickOnForgotPasswordButton(WebDriver driver) {
		waitForElementVisibility(forgotPasswordBtn,"20",driver);
		scrollToElement(forgotPasswordBtn,driver);
		waitForElementClickable(forgotPasswordBtn, "30",driver);
		click(forgotPasswordBtn,driver);
	}
	
	public void clickOnCreateAnAccountLink(WebDriver driver) {
		waitForElementVisibility(createAnAccount,"20",driver);
		scrollToElement(createAnAccount,driver);
		waitForElementClickable(createAnAccount, "30",driver);
		click(createAnAccount,driver);
	}
	
	public boolean verifyEnterPasswrodIsDisplaying(String passwordEnter, WebDriver driver) {
		String passwordValue =  password.getAttribute("value");		
		return passwordValue.equals(passwordEnter);
	}
	
	public boolean isRegisterForAMedRepsMembershipPopupDisplay(WebDriver driver) {
		waitForElementVisibility(registerForAMedRepsMembershipPopup, "30", driver);
		return isElementDisplayed(registerForAMedRepsMembershipPopup, driver);
	}	
	
	public boolean isForgotPasswordPageDisplay(WebDriver driver) {
		waitForElementVisibility(forgotPasswordPage, "30", driver);
		return isElementDisplayed(forgotPasswordPage, driver);
	}
	
	public void clickOnTermsOfUsePrivacyPolicylink(WebDriver driver) {
		waitForElementVisibility(termsOfUsePrivacyPolicylink,"20",driver);
		scrollToElement(termsOfUsePrivacyPolicylink,driver);
		waitForElementClickable(termsOfUsePrivacyPolicylink, "30",driver);
		click(termsOfUsePrivacyPolicylink,driver);
	}
	
	public boolean isTermsOfUsePrivacyPolicyPageDisplay(WebDriver driver) {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(tabs2.size()-1));
		waitForElementVisibility(termsOfUsePrivacyPolicyPageTitle, "30", driver);
		return isElementDisplayed(termsOfUsePrivacyPolicyPageTitle, driver);
	}
	
	public void clickOnRememberMeNextTimeCheckbox(WebDriver driver) {
		waitForElementVisibility(rememberMeNextTimeCheckbox,"20",driver);
		scrollToElement(rememberMeNextTimeCheckbox,driver);
		waitForElementClickable(rememberMeNextTimeCheckbox, "30",driver);
		click(rememberMeNextTimeCheckbox,driver);
	}
	
	public boolean verifyCredentialsRepopulateOnTheLoginPopup(String emailAddressEnter, WebDriver driver) {
		String emailAddressValue =  emailAddress.getAttribute("value");		
		return emailAddressValue.equals(emailAddressEnter);
	}
	
	public boolean isHomePageDisplay(WebDriver driver) {
		Boolean status;
		try {
			waitForElementVisibility(btnDashboard, "5", driver);
			status =  true;
		} catch (Exception e) {
			status =  false;
		}		
		return status;
	}
	
}
