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

public class EmployerExistingUserManageProfilePage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement  emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;
	
	@FindBy(xpath = ("(//span[contains(text(),'Dashboard')])[last()]"))
	WebElement labelDashboard;
	
	@FindBy(xpath = ("//button[contains(@class,'dropdown-trigger')]"))
	WebElement profileDropdownIcon;
	
	@FindBy(xpath = ("//a[contains(text(),'Profile')]"))
	WebElement optionProfile;
	
	@FindBy(xpath = ("//div[contains(text(),'Profile')]"))
	WebElement headingProfile;
	
	@FindBy(xpath = ("//p[text()='Upload Logo']"))
	WebElement labelLogo;
	
	@FindBy(xpath = ("//div[contains(@class,'rounded-full relative')] | //img[@alt='user-image']"))
	WebElement  logoInputField;
	
	@FindBy(xpath = ("//label[contains(text(),'Name')]"))
	WebElement labelName;
	
	@FindBy(xpath = ("//input[@placeholder='Enter Name']"))
	WebElement nameInputField;

	@FindBy(xpath = ("//label[contains(text(),'Country')]"))
	WebElement labelCountry;
	
	@FindBy (xpath =("//label[contains(text(),'Location')]"))
	WebElement locationLabel;
	
	@FindBy(xpath = ("(//label[contains(text(),'Location')]/..//following-sibling::div//span/following-sibling::div/div/div[1])[1]"))
	WebElement countryInputField;
	
	@FindBy(xpath = ("//label[contains(text(),'Postal Code')]"))
	WebElement labelPostalCode;
	
	@FindBy(xpath = ("//input[@placeholder='Enter Postal Code']"))
	WebElement postalCodeInputField;
	
	@FindBy(xpath = ("//label[contains(text(),'Phone')]"))
	WebElement labelPhone;
	
	@FindBy(xpath = ("//input[@placeholder='Enter Phone']"))
	WebElement phoneInputField;
	
	@FindBy(xpath = ("//label[contains(text(),'Phone Type')]"))
	WebElement labelPhoneType;
	
	@FindBy(xpath = ("(//label[contains(text(),'Phone Type')]/..//following-sibling::div//span)[2]"))
	WebElement phoneTypeInputField;
	
	@FindBy(xpath = ("//input[@type='file']"))
	WebElement logoImageInputField;
	
	@FindBy (xpath="(//h1[text()='Company Profile']/following-sibling::div//div)[1]")
	WebElement changeLogoBtnOnEmployerProfilePage;
	
	@FindBy (xpath="//button[text()='Upload']")
	WebElement uploadBtnOnLogoUploadPopup;
	
	@FindBy(xpath = ("//button[contains(text(),'Save')]"))
	WebElement btnSave;
	
	@FindBy(xpath = ("//span[contains(text(),'Your profile has been updated')] | //span[contains(text(),'Updated successfully')]"))
	WebElement messageUpdatedSuccessfully;
	
	@FindBy(xpath = ("//label[contains(text(),'Location')]/..//following-sibling::div//div[contains(@class,'select__dropdown-indicator')]"))
	WebElement countryDropdownIcon;
	
	@FindBy(xpath=("//div[@class='google-place-autocomplete-select__input']/input"))
	WebElement locationOnPostJob;

	@FindBy(xpath = ("//div[contains(@class,'item-option-content')]"))
	List<WebElement> listOfDropdownOption;
	
	@FindBy(xpath = ("//label[contains(text(),'Phone Type')]/..//following-sibling::div//div[contains(@class,'show-arrow')]"))
	WebElement phoneTypeDropdownIcon;
	
	@FindBy(xpath = ("(//div[contains(@title,'Mobile')])//div"))
	WebElement optionMobile;
	
	@FindBy(xpath = ("(//div[contains(@title,'Office')])//div"))
	WebElement optionOffice;
	
	@FindBy(xpath = ("(//div[contains(@title,'Home')])//div"))
	WebElement optionHome;
	
	public EmployerExistingUserManageProfilePage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30",driver);
		waitTime(2000);
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
	
	public boolean isEmailFieldDisplay(WebDriver driver){
	    return isElementDisplayed(emailAddress,driver);
	}
	
	public boolean isDashboardLabelDisplay(WebDriver driver){
	    return isElementDisplayed(labelDashboard,driver);
	}

	public void clickOnProfileDropdownIcon(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(profileDropdownIcon,"30",driver);
		click(profileDropdownIcon,driver);
	}
	
	public void clickOnProfileOption(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(optionProfile,"30",driver);
		click(optionProfile,driver);
	}
	
	public boolean isProfileHeadingDisplay(WebDriver driver){
	    return isElementDisplayed(headingProfile,driver);
	}
	
	public boolean isLogoLabelDisplay(WebDriver driver){
	    return isElementDisplayed(labelLogo,driver);
	}
	
	public boolean isLogoInputFieldDisplay(WebDriver driver){
	    return isElementDisplayed(logoInputField,driver);
	}
	
	public boolean isNameLabelDisplay(WebDriver driver){
	    return isElementDisplayed(labelName,driver);
	}
	
	public boolean isNameInputFiledEmpty(WebDriver driver){
	    return getElementAttributeValue(nameInputField, "value",driver).isEmpty();
	}
	
	public boolean isCountryLabelDisplay(WebDriver driver){
	    return isElementDisplayed(locationLabel,driver);
	}
	
	public boolean isCountryInputFiledEmpty(WebDriver driver){
	    return getElementText(countryInputField,driver).isEmpty();
	}
	
	public boolean isPostalCodeLabelDisplay(WebDriver driver){
	    return isElementDisplayed(labelPostalCode,driver);
	}
	
	public boolean isPostalCodeInputFiledEmpty(WebDriver driver){
	    return getElementAttributeValue(postalCodeInputField, "value",driver).isEmpty();
	}
	
	public boolean isPhoneLabelDisplay(WebDriver driver){
	    return isElementDisplayed(labelPhone,driver);
	}
	
	public boolean isPhoneInputFiledEmpty(WebDriver driver){
	    return getElementAttributeValue(phoneInputField, "value",driver).isEmpty();
	}
	
	public boolean isPhoneTypeLabelDisplay(WebDriver driver){
		scrollIntoViewSmoothly(labelPhoneType,driver);
		waitTime(2000);
	    return isElementDisplayed(labelPhoneType,driver);
	}
	
	public boolean isPhoneTypeInputFiledEmpty(WebDriver driver){
	    return getElementText(phoneTypeInputField,driver).isEmpty();
	}
	
    public void uploadLogo(WebDriver driver) {
		logoImageInputField.sendKeys(System.getProperty("user.dir") +"\\src\\test\\resources\\data\\logoImage\\Logo.png");
	}
    
    public void clickOnSaveButton(WebDriver driver){
		scrollIntoViewSmoothly(btnSave,driver);
		waitTime(2000);
		waitForElementClickable(btnSave,"30",driver);
	    click(btnSave,driver);
	}
    
    public boolean isUpdatedSuccessfullyMessageDisplay(WebDriver driver){
    	waitForElementVisibility(messageUpdatedSuccessfully, "30",driver);
	    return isElementDisplayed(messageUpdatedSuccessfully,driver);
	}
    
    public void enterName(String name,WebDriver driver) {
    	nameInputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	nameInputField.sendKeys(Keys.DELETE);
		waitTime(1000);
    	type(nameInputField,name,driver);
	}	
    
    public void clickOnCountryDropdownIcon(WebDriver driver){
		waitForElementVisibility(countryDropdownIcon, "30",driver);
		waitForElementClickable(countryDropdownIcon,"30",driver);
	    click(countryDropdownIcon,driver);
	}
    
	
	public void enterLocation(String loc, WebDriver driver) {
		locationOnPostJob.sendKeys(loc);
		List <WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,'google-place-autocomplete-select__menu')]/div"));
		click(locations.get(0),driver);
		
	}
    
    public void selectOptionFromDropdownOption(WebDriver driver) {
		int size = listOfDropdownOption.size();
		int randomNumber = ThreadLocalRandom.current().nextInt(2, size);
		scrollIntoViewSmoothly(listOfDropdownOption.get(randomNumber),driver);
		waitTime(2000,driver);
		listOfDropdownOption.get(randomNumber).click();
	}
    
    public void enterPostalCode(String postalCode,WebDriver driver) {
    	postalCodeInputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	postalCodeInputField.sendKeys(Keys.DELETE);
		waitTime(1000,driver);
    	type(postalCodeInputField,postalCode,driver);
	}	
    
    public void enterPhoneNumber(String phoneNumber,WebDriver driver) {
    	phoneInputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
    	phoneInputField.sendKeys(Keys.DELETE);
		waitTime(1000);
    	type(phoneInputField,phoneNumber,driver);
	}	
    
    public void clickOnPhoneTypeDropdownIcon(WebDriver driver){
    	scrollIntoViewSmoothly(phoneTypeDropdownIcon,driver);
		waitTime(2000);
		waitForElementClickable(phoneTypeDropdownIcon,"30",driver);
	    click(phoneTypeDropdownIcon,driver);
	}
    
    public void selectMobileOptionFromDropdown(WebDriver driver){
    	waitForElementClickable(optionMobile,"30",driver);
	    click(optionMobile,driver);
	}
    
    public void selectOfficeOptionFromDropdown(WebDriver driver){
    	waitForElementClickable(optionOffice,"30",driver);
	    click(optionOffice,driver);
	}
    
    public void selectHomeOptionFromDropdown(WebDriver driver){
    	waitForElementClickable(optionHome,"30",driver);
	    click(optionHome,driver);
	}
    
    public void clickChangeLogoBtnOnEmployerProfilePage(WebDriver driver) {
    	waitForElementClickable(changeLogoBtnOnEmployerProfilePage,"30",driver);
    	click(changeLogoBtnOnEmployerProfilePage,driver);
    }
    
    public void clickUploadBtnOnLogoUploadPopup(WebDriver driver) {
    	waitForElementClickable(uploadBtnOnLogoUploadPopup,"30",driver);
    	click(uploadBtnOnLogoUploadPopup,driver);
    }


}
