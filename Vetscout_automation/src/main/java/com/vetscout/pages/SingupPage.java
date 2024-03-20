package com.vetscout.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;


public class SingupPage extends BaseClass {

	@FindBy(xpath = ("//span[contains(text(),'Next')]"))
	WebElement singupNextBtn;
	
	@FindBy(xpath = ("//input[@name='companyName']"))
	WebElement companyNameTxt;
	
	@FindBy(xpath = ("//a[contains(text(),'sign in')]"))
	WebElement signupPageSigninBtn;

	@FindBy(xpath = ("//label[contains(text(),'Practice Name')]//parent::div//input"))
	WebElement signupPagePracticeName;

	@FindBy(xpath = ("//label[contains(text(),'Practice Phone')]//parent::div//input"))
	WebElement signupPagePracticePhone;

	@FindBy(xpath = ("//label[contains(text(),'Practice Zip code')]//parent::div//input"))
	WebElement signupPagePracticeZipCode;

	@FindBy(xpath = ("//label[contains(text(),'first Name')]//parent::div//input"))
	WebElement signupPagePracticeFirstName;

	@FindBy(xpath = ("//label[contains(text(),'last Name')]//parent::div//input"))
	WebElement signupPageLastName;

	@FindBy(xpath = ("//label[contains(text(),'Email')]//parent::div//input"))
	WebElement signupPageEmail;

	@FindBy(xpath = ("//label[contains(text(),'Password')]//parent::div//input"))
	WebElement signupPagePassword;
	
	@FindBy(xpath = ("//label[contains(text(),'retype Password')]//parent::div//input"))
	WebElement signupPageRetypePassword;
		
	@FindBy(xpath = ("//div[contains(text(),'Registration successful.')]"))
	WebElement registerationSuccessfulPopUp;
	
	
	public SingupPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterSignupPagePracticeName(String Name) {
		waitUntilElementDisplayed(signupPagePracticeName);
		type(signupPagePracticeName, Name);
	}
	
	public void enterSignupPagePracticePhone(String Phone) {
		waitUntilElementDisplayed(signupPagePracticePhone);
		type(signupPagePracticePhone, Phone);
	}
	
	public void enterSignupPagePracticeZipCode(String ZipCode) {
		waitUntilElementDisplayed(signupPagePracticeZipCode);
		type(signupPagePracticeZipCode, ZipCode);
	}
	
	public void enterSignupPagePracticeFirstName(String FirstName) {
		waitUntilElementDisplayed(signupPagePracticeFirstName);
		type(signupPagePracticeFirstName, FirstName);
	}
	
	public void enterSignupPageLastName(String LastName) {
		waitUntilElementDisplayed(signupPageLastName);
		type(signupPageLastName, LastName);
	}
	
	public void enterSignupPageEmail(String email) {
		waitUntilElementDisplayed(signupPageEmail);
		type(signupPageEmail, email);
	}
	public void enterSignupPagePassword(String Password) {
		waitUntilElementDisplayed(signupPagePassword);
		type(signupPagePassword, Password);
	}
	
	public void enterSignupPageRetypePassword(String Password) {
		waitUntilElementDisplayed(signupPageRetypePassword);
		type(signupPageRetypePassword, Password);
	}
	
	public void clickOnSingupNextButton() {
		scrollToElement(singupNextBtn);
		waitForElementClickable(singupNextBtn, "20");
		click(singupNextBtn);
	}
	
	public void clickOnSignupPageSigninButton() {
		scrollToElement(signupPageSigninBtn);
		waitForElementClickable(signupPageSigninBtn, "20");
		click(signupPageSigninBtn);
	}
	
	public boolean isCompanyNameInputValidtionPopupDisplaying() {
		return Boolean.parseBoolean(companyNameTxt.getAttribute("required"));
	}
	
	public boolean isRegisterationSuccessfulPopUpDisplaying() {
		return isElementDisplayed(registerationSuccessfulPopUp);
	}
	

}
