package com.vetscout.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.utilities.Waits;


public class LoginPage extends BaseClass {

	@FindBy(xpath = ("//input[@id='standard-email']"))
	WebElement loginEmailInput;
	
	@FindBy(xpath = ("//input[@id='standard-password-input']"))
	WebElement loginPasswordInput;
	
	@FindBy(xpath = ("//button[@id='login-btn'] | //span[text()='sign in']"))
	WebElement loginBtn;
	
	@FindBy(xpath = ("(//div[contains(@class,'iron-app-logo')])[1]"))
	WebElement homePageLogoIcon;	
	
	@FindBy(xpath = ("//div[contains(@class,'text-muted')]"))
	WebElement invalidUsernameAndPasswordPopup;
	
	@FindBy(xpath = ("//h3[contains(text(),'Forgot Password?')]"))
	WebElement forgotPasswordPage;	
	
	@FindBy(xpath = ("//a[contains(text(),'Forgot Password?')]"))
	WebElement forgotPasswordBtn;
	
	@FindBy(xpath = ("//h4[contains(text(),'User Sign In')] | //h4[contains(text(),'Sign In')]"))
	WebElement loginPageTitle;
	
	@FindBy(xpath = ("//span[contains(text(),'Remember Me')]//preceding::span//input[@type='checkbox']//parent::*"))
	WebElement rememberMeCheckbox;
	
	@FindBy(xpath = ("(//div[contains(@class,'iron-logout-wrap')]/span)[1]"))
	WebElement userProfileIcon;
	
	@FindBy(xpath = ("//a[@name='Logout']"))
	WebElement logoutBtn;
	
	@FindBy(xpath = ("//a[contains(text(),'Click here to create one')]"))
	WebElement clickHereToCreateOneLink;
	
	@FindBy(xpath = ("//h4[contains(text(),'Step 1 : Enter your details for Registration')]"))
	WebElement clickHereToCreateOnePageTitle;
	
	@FindBy(xpath = ("//img[contains(@alt,'VetScout Play Store')]"))
	WebElement playStoreBtn;
	
	@FindBy(xpath = ("//*[text()='Vet Scout']"))
	WebElement playStorePageTitle;
	
	@FindBy(xpath = ("//img[contains(@alt,'VetScout App Store')]"))
	WebElement appStoreBtn;
	
	@FindBy(xpath = ("//a[@id='ac-gn-firstfocus']"))
	WebElement appStorePageTitle;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void waitUnitlAppStorePageLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(appStorePageTitle));

	}
	
	public void enterLoginEmail(String email) {
		waitUntilElementDisplayed(loginEmailInput);
		type(loginEmailInput, email);
	}
	
	public void enterLoginPassword(String password) {
		waitUntilElementDisplayed(loginEmailInput);
		type(loginPasswordInput, password);
	}
	
	public void clickOnLoginButton() {
		waitForElementClickable(loginBtn, "20");
		click(loginBtn);
	}
	public void clickOnHomePageLogoIcon() {
		waitForElementClickable(homePageLogoIcon, "20");
		click(homePageLogoIcon);
	}
	
	public boolean isHomePageLogoIconDisplaying() {
		return isElementDisplayed(homePageLogoIcon);
	}
	
	public boolean isInvalidUsernameAndPasswordPopupDisplaying() {
		return isElementDisplayed(invalidUsernameAndPasswordPopup);
	}
	
	public boolean isForgotPasswordPageTitleDisplaying() {
		return isElementDisplayed(forgotPasswordPage);
	}
	
	public boolean isValidtionPopupDisplaying() {
		Boolean validtionPopup = Boolean.parseBoolean(loginEmailInput.getAttribute("required")); 
		return validtionPopup;
	}
	
	public void clickOnForgotPasswordButton() {
		waitForElementClickable(forgotPasswordBtn, "20");
		click(forgotPasswordBtn);
	}
	
	public boolean isLoginPageTitleDisplaying() {
		return isElementDisplayed(loginPageTitle);
	}
	
	public void clickOnRememberMeCheckbox() {
		waitForElementClickable(rememberMeCheckbox, "20");
		click(rememberMeCheckbox);
	}
	
	public void clickOnUserProfileIcon() {
		waitForElementClickable(userProfileIcon, "20");
		click(userProfileIcon);
	}
	
	public void clickOnLogoutButton() {
		waitForElementClickable(logoutBtn, "20");
		click(logoutBtn);
	}
	
	public String getEmail() {
		waitForElementVisibility(loginEmailInput, "5");
		String email =getElementText(loginEmailInput);
		return email;
	}
	
	public void clickOnClickHereToCreateOneLink() {
		waitForElementClickable(clickHereToCreateOneLink, "20");
		click(clickHereToCreateOneLink);
	}
	
	public boolean isClickHereToCreateOnePageTitleDisplaying() {
		return isElementDisplayed(clickHereToCreateOnePageTitle);
	}
	
	public void clickOnPlayStoreButton() {
		waitForElementClickable(playStoreBtn, "20");
		click(playStoreBtn);
	}
	
	public boolean isPlayStorePageTitleDisplaying() {
		return isElementDisplayed(playStorePageTitle);
	}
	
	public void clickOnAppStoreButton() {
		waitForElementClickable(appStoreBtn, "20");
		click(appStoreBtn);
	}
	
	public boolean isAppStorePageTitleDisplaying() {
		return isElementDisplayed(appStorePageTitle);
	}
	
	public String getPasswordInput() {
		waitForElementVisibility(loginPasswordInput, "20");
		return getElementText(loginPasswordInput);
	}
	
	public void clickOnHomePageLogoIconButton() {
		waitForElementClickable(homePageLogoIcon, "20");
		click(homePageLogoIcon);
	}
	
	public void loginToApp(String email, String password) {
		
		int step = 0;
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Visit app url");
		openURL("AppURL");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email Address : <b>" + email + "</b>");
		enterLoginEmail(email);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password <b>" + password + "</b>");
	    enterLoginPassword(password);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Remember Me</b> Checkbox");
		clickOnRememberMeCheckbox();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Login</b> Button");
		clickOnLoginButton();
		Waits.wait3s();

	}
	
	
}
