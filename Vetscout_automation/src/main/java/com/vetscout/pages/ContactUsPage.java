package com.vetscout.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.utilities.Waits;


public class ContactUsPage extends BaseClass {

	
	@FindBy(xpath = ("(//input[@id='standard-email'])[1]"))
	WebElement contactUsEmailInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[1]"))
	WebElement contactUsFnameInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[2]"))
	WebElement contactUsLnameInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[3]"))
	WebElement contactUsSubjectInput;
	
	@FindBy(xpath = ("//textarea[@id='standard-multiline-static']"))
	WebElement contactUsMessageInput;
	
	@FindBy(xpath = ("//span[text()='send message']"))
	WebElement submitBtn;
	
	@FindBy(xpath = ("//button[text()='Ok']"))
	WebElement ackBtnOk;
	
	@FindBy(xpath = ("//div[contains(text(),'Message is required.')]"))
	WebElement inputValidationMessage;
	
	@FindBy(xpath = ("//h2[contains(text(),'Contact Info')]/following-sibling::h5"))
	WebElement contactUsDescription;
	
	@FindBy(xpath = ("//a[contains(text(),'(888) 597-6660')]"))
	WebElement contactUsPhoneNumber;
	
	@FindBy(xpath = ("//a[contains(text(),'support@vetscout.com')]"))
	WebElement contactUsEmail;
	

	
	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterContactUsEmail(String str) {
		waitUntilElementDisplayed(contactUsEmailInput);
		type(contactUsEmailInput, str);
	}
	
	public void enterContactUsFname(String str) {
		waitUntilElementDisplayed(contactUsFnameInput);
		type(contactUsFnameInput, str);
	}
	
	public void enterContactUsLname(String str) {
		waitUntilElementDisplayed(contactUsLnameInput);
		type(contactUsLnameInput, str);
	}
	
	public void enterContactUsSubject(String str) {
		waitUntilElementDisplayed(contactUsSubjectInput);
		type(contactUsSubjectInput, str);
	}
	
	public void enterContactUsMessage(String str) {
		waitUntilElementDisplayed(contactUsMessageInput);
		type(contactUsMessageInput, str);
	}
	
	
	
	
	public void clickOnSubmitButton() {
		waitForElementClickable(submitBtn, "20");
		click(submitBtn);
	}
	
	public void clickOnACKButton() {
		waitForElementClickable(ackBtnOk, "20");
		click(ackBtnOk);
	}
	
	public boolean isContactUsMessageValidationDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(inputValidationMessage);
	}
	
	public boolean isContactUsDescriptionDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(contactUsDescription);
	}
	
	public boolean isContactUsPhoneNumberDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(contactUsPhoneNumber);
	}
	
	public boolean isContactUsEmailDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(contactUsEmail);
	}
	

	
}
