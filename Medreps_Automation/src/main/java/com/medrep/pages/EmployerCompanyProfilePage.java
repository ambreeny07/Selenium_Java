package com.medrep.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerCompanyProfilePage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement  emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//span[contains(text(),'Company Profile')])[last()]"))
	WebElement btnCompanyProfile;
	
	@FindBy(xpath = ("//h1[contains(text(),'Company Profile')]"))
	WebElement headingCompanyProfile;
	
	@FindBy(xpath = ("(//h1[contains(text(),'Company Profile')]/..//div//div)[1]"))
	WebElement companyLogo;
	
	@FindBy(xpath = ("//input[@id='candidate-form_name']"))
	WebElement companyNameInputField;
	
	@FindBy(xpath = ("//input[@id='candidate-form_company_email']"))
	WebElement companyEmailAddressInputField;
	
	@FindBy(xpath = ("//input[@id='candidate-form_phone']"))
	WebElement phoneInputField;
	
	@FindBy(xpath = ("//input[@id='candidate-form_website']"))
	WebElement websiteURLInputField;
	
	@FindBy(xpath = ("//input[@id='candidate-form_address']"))
	WebElement streetAddressInputField;
	
	@FindBy(xpath = ("(//label[contains(text(),'Country')]/..//following-sibling::div//span)[2]"))
	WebElement countryField;
	
	@FindBy(xpath = ("//label[contains(text(),'Location')]/..//following-sibling::div//span/following-sibling::div/div[1]"))
	WebElement locationField;
	
	@FindBy(xpath = ("(//label[contains(text(),'State')]/..//following-sibling::div//span)[2]"))
	WebElement stateField;
	
	@FindBy(xpath = ("(//label[contains(text(),'City')]/..//following-sibling::div//span)[2]"))
	WebElement cityField;
	
	@FindBy(xpath = ("//label[contains(text(),'About')]/..//following-sibling::div//div//p"))
	WebElement aboutInputField;
	
	@FindBy(xpath = ("//button[contains(text(),'Save')]"))
	WebElement btnSave;
	
	@FindBy(xpath = ("(//label[contains(text(),'State')]/..//following-sibling::div//div)[3]"))
	WebElement stateDropdownIcon;
	
	@FindBy(xpath = ("(//div[contains(@class,'list-holder-inner')]/div)[1]"))
	WebElement optionEmptyState;
	
	@FindBy(xpath = ("//input[@id='candidate-form_city']"))
	WebElement cityInputField;
	
	@FindBy(xpath = ("(//label[contains(text(),'Country')]/..//following-sibling::div//div)[3]"))
	WebElement countryDropdownIcon;
	
	@FindBy(xpath = ("//div[contains(@class,'option')]"))
	List<WebElement> DropdownOptionsList;
	
	@FindBy(xpath = ("//div[@id='candidate-form_country_list']/following-sibling::div//div[contains(@class,'rc-virtual-list-holder-inner')]/div"))
    List<WebElement> listOfCountries;

	@FindBy(xpath = ("//div[@id='candidate-form_state_list']/following-sibling::div//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div"))
    List<WebElement> listOfStates;
	
	@FindBy(xpath = ("(//label[contains(text(),'City')]/..//following-sibling::div//div)[3]"))
	WebElement cityDropdownIcon;
	
	@FindBy(xpath = ("//div[@id='candidate-form_city_list']/following-sibling::div//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div"))
    List<WebElement> listOfCities;
	
	@FindBy(xpath = ("//input[@id='candidate-form_state']"))
	WebElement stateInputField;
	
	
	@FindBy(xpath = ("//*[contains(text(),'Company Name')]"))
	WebElement companyNameLabel;
	
	@FindBy(xpath = ("//*[contains(text(),'Company Email')]"))
	WebElement companyEmailLabel;	
	
	@FindBy(xpath = ("//*[contains(text(),'Company Phone')]"))
	WebElement companyPhoneLabel;
	
	@FindBy(xpath = ("//*[contains(text(),'Company Website')]"))
	WebElement companyWebSiteURLLabel;
	
	@FindBy(xpath = ("//*[contains(text(),'Location')]"))
	WebElement companyLocationLabel;
	
	@FindBy(xpath = ("//*[contains(text(),'About')]"))
	WebElement companyAboutLabel;
	
	@FindBy(xpath = ("//*[contains(text(),'Cancel')]"))
	WebElement cancelButton;
	
	@FindBy(xpath = ("//*[contains(text(),'Update')]"))
	WebElement companyEmailUpdate;
	
	@FindBy(xpath = "//button[text()='Update']") WebElement updateEmailButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Name'] | //input[@placeholder='Enter Your Email Address']") WebElement manageYourAccountEmailField;
	

	public EmployerCompanyProfilePage(WebDriver driverParam) {
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
		waitForElementVisibility(password, "30",driver);	
    	type(password,pass,driver);
	}
	
	public void clickOnSubmitLoginButton(WebDriver driver) {
		
		waitForElementClickable(btnSubmitLogin,"30",driver);
		click(btnSubmitLogin,driver);
	}

	public void clickOnCompanyProfileButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnCompanyProfile,"30",driver);
		click(btnCompanyProfile,driver);
	}
	
	public boolean isPageHeadingCompanyProfileDisplay(WebDriver driver) {
		return isElementDisplayed(headingCompanyProfile,driver);
	}
	
	public boolean isCompanyLogoDisplay(WebDriver driver) {
		return isElementDisplayed(companyLogo,driver);
	}
	
	public boolean isCompanyNameIputFieldDisplay(WebDriver driver) {
		return isElementDisplayed(companyNameInputField,driver);
	}
	
	public boolean isCompanyEmailAddressIputFieldDisplay(WebDriver driver) {
		return isElementDisplayed(companyEmailAddressInputField,driver);
	}
	
	public boolean isPhoneIputFieldDisplay(WebDriver driver) {
		return isElementDisplayed(phoneInputField,driver);
	}
	
	public boolean isWebsiteURLIputFieldDisplay(WebDriver driver) {
		return isElementDisplayed(websiteURLInputField,driver);
	}
	
	public boolean isStreetAddressIputFieldDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(streetAddressInputField,driver);
		waitTime(2000,driver);
		return isElementDisplayed(streetAddressInputField,driver);
	}
	
	public boolean isCountryFieldDisplay(WebDriver driver) {
		return isElementDisplayed(countryField,driver);
	}
	
	public boolean isLocationFieldDisplay(WebDriver driver) {
		return isElementDisplayed(locationField,driver);
	}
	
	public boolean isStateFieldDisplay(WebDriver driver) {
		return isElementDisplayed(stateField,driver);
	}
	
	public boolean isCityFieldDisplay(WebDriver driver) {
		return isElementDisplayed(cityField,driver);
	}
	
	public boolean isAboutIputFieldDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(aboutInputField,driver);
		waitTime(2000,driver);
		return isElementDisplayed(aboutInputField,driver);
	}
	
	public boolean isSaveButtonDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(btnSave,driver);
		waitTime(2000,driver);
		return isElementDisplayed(btnSave,driver);
	}
	
	public void clickOnStateDropdownIcon(WebDriver driver) {
		scrollIntoViewSmoothly(stateDropdownIcon,driver);
		waitTime(2000,driver);
		click(stateDropdownIcon,driver);
	}
	
	public void selectStateEmptyOption(WebDriver driver) {
		scrollIntoViewSmoothly(optionEmptyState,driver);
		waitTime(2000,driver);
		waitForElementClickable(optionEmptyState,"30",driver);
		click(optionEmptyState,driver);
	}
	
	public boolean isCityInputFieldEnable(WebDriver driver) {
		return isElementEnabled(cityInputField,driver);
	}
	
	public void clickOnCountryDropdownIcon(WebDriver driver) {
		scrollIntoViewSmoothly(countryDropdownIcon,driver);
		waitTime(2000,driver);
		waitForElementClickable(countryDropdownIcon,"30",driver);
		click(countryDropdownIcon,driver);
	}
	
	public boolean isDropdownOptionListDisplay(WebDriver driver) {
        return DropdownOptionsList.size()>0;
	}
	
	public void selectStateFromStatesDropdownOptions(WebDriver driver) { 
		int size = listOfStates.size();
		int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
		if(randomNumber==5) {
			randomNumber++;
		}
		System.out.println(randomNumber);
		WebElement findElement= driver.findElement(By.xpath("(//div[@id='candidate-form_state_list']/following-sibling::div//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div)["+randomNumber+"]"));
		String a=getElementAttributeValue(findElement,"title",driver);
		scrollIntoViewSmoothly(stateDropdownIcon,driver);
		waitTime(2000,driver);
		type(stateInputField, a,driver);	
		stateInputField.sendKeys(Keys.ENTER);
	}
	
	public boolean isStateFieldEmpty(WebDriver driver) {
        return getElementAttributeValue(stateField,"title",driver).isEmpty();
	}
	
	public void clickOnCityDropdownIcon(WebDriver driver) {
		scrollIntoViewSmoothly(cityDropdownIcon,driver);
		waitTime(2000,driver);
		scrollIntoViewSmoothly(cityDropdownIcon,driver);
		waitTime(2000,driver);
		waitForElementClickable(cityDropdownIcon,"30",driver);
		click(cityDropdownIcon,driver);
	}
	
	public void selectCityFromCityDropdownOptions(WebDriver driver) { 
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 2);
		WebElement findElement= driver.findElement(By.xpath("(//div[@id='candidate-form_city_list']/following-sibling::div//div[contains(@class,'rc-virtual-list-holder-inner')]//following-sibling::div)["+randomNumber+"]"));
		String a=getElementAttributeValue(findElement,"title",driver);
		scrollIntoViewSmoothly(cityDropdownIcon,driver);
		waitTime(2000,driver);
		type(cityInputField, a,driver);	
		cityInputField.sendKeys(Keys.ENTER);
	}
	
	public String getCityFieldValue(WebDriver driver) {
        return getElementText(cityField,driver);
	}

	public boolean isNameLabel(WebDriver driver) {
		return isElementDisplayed(companyNameLabel,driver);
	}
	
	public boolean isEmailLabel(WebDriver driver) {
		return isElementDisplayed(companyEmailLabel,driver);
	}
	
	
	public boolean isPhoneLabel(WebDriver driver) {
		return isElementDisplayed(companyPhoneLabel,driver);
	}
	
	public boolean isWebSiteUrlLabel(WebDriver driver) {
		return isElementDisplayed(companyWebSiteURLLabel,driver);
	}
	
	public boolean isAboutLabel(WebDriver driver) {
		return isElementDisplayed(companyAboutLabel,driver);
	}
	public boolean isLocationLabel(WebDriver driver) {
		return isElementDisplayed(companyLocationLabel,driver);
	}
	
	public boolean isCancelButtonLabel(WebDriver driver) {
		return isElementDisplayed(cancelButton,driver);
	}
	
	public boolean isUpdateEmailLabel(WebDriver driver) {
		return isElementDisplayed(companyEmailUpdate,driver);
	}
	
	public boolean isLoginPageDisplayed(WebDriver driver){
		waitForElementVisibility(btnLogin, "90",driver);
		return btnLogin.isDisplayed();
	}
	
	public void clickOnUpdateEmailButton(WebDriver driver){
		waitForElementClickable(updateEmailButton, "30",driver);
		click(updateEmailButton,driver);
	}

	public void editManageYourAccountEmailField(String updatedEmail, WebDriver driver){
		waitTime(2000,driver);
		scrollIntoViewSmoothly(manageYourAccountEmailField,driver);
		waitForElementVisibility(manageYourAccountEmailField, "30", driver);
		sendKeysToWebElement(manageYourAccountEmailField, updatedEmail,driver);
	}
}
