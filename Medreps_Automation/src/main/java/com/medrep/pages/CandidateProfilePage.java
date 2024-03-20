package com.medrep.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateProfilePage extends BaseClass {
	private WebDriver podriver = null;
	
	
	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
	WebElement medrepLogo;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement  emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;
	
	@FindBy (xpath="//span[contains(@class,'ant-avatar-circle')]")
	WebElement profilePicCircle;
	
	@FindBy (xpath="//a[text()='Profile']")
	WebElement profileBtn;
	
	@FindBy (xpath="//span[contains(text(),'Edit Your Profile')]")
	WebElement editProfileText;
	
	@FindBy (xpath="(//input[@placeholder='Enter Your Name'])[1]")
	WebElement nameInputFieldOnProfile;
	
	@FindBy (xpath="(//span[@class='ant-select-selection-item'])[1]")
	WebElement countryDropdownBox;
	
	@FindBy (xpath="//div[@class='ant-select-item-option-content']")
	List<WebElement> allCountries;
	
	@FindBy (xpath="//input[@placeholder='Enter Postal Code']")
	WebElement postalCode;
	
	@FindBy (xpath="//button[text()='Save']")
	WebElement saveBtnOnProfileEditPage;
	
	@FindBy (xpath="//*[contains(text(),'Updated successfully')]")
	WebElement updatedSuccessfullyMessage;
	
	@FindBy (xpath="//p[text()='Update your password']")
	WebElement updateYourPasswordScreen;
	
	@FindBy (xpath="//button[text()='Update your password']")
	WebElement updateYourPasswordBtn;
	
	@FindBy (xpath="//input[@id='namedUserForm_old_password']")
	WebElement oldPasswordInputField;
	
	@FindBy (xpath="//input[@id='namedUserForm_new_password']")
	WebElement newPasswordInputField;
	
	@FindBy (xpath="//input[@id='namedUserForm_confirm_new_password']")
	WebElement confirmPasswordInputField;
	
	@FindBy (xpath="(//button[text()='Update'])[last()]")
	WebElement updatePasswordBtnOnUpdatePasswordPopup;
	
	@FindBy (xpath="//span[text()='Logout']")
	WebElement logoutBtnOnProfile;
	
	@FindBy (xpath="(//button[text()='Cancel'])[last()]")
	WebElement cancelBtnOnPasswordUpdatePopup;
	
	@FindBy (xpath="//u[contains(text(),'Update Payment Details')]")
	WebElement updatePaymentDetailsLink;
	
	@FindBy (xpath="//span[contains(text(),'DeviceSpace partners with Stripe for simplified billing.')]")
	WebElement billingPage;
	
	@FindBy (xpath="//span[contains(text(),'Add payment method')]")
	WebElement addPaymentMethodBtn;
	
	@FindBy (xpath="//label[contains(text(),'Card number')]")
	WebElement cardNumberLabel;
	
	@FindBy(xpath=("//div[@class='google-place-autocomplete-select__input']/input"))
	WebElement locationOnPostJob;
	
	@FindBy (xpath="//h1[text()='Manage Your Account']/following-sibling::div//input")
	WebElement emailField;
	
	@FindBy (xpath="//button[text()='Update']")
	WebElement updateButtonForEmail;
	
	@FindBy (xpath="//input[@placeholder='Enter Your Last Name']")
	WebElement lastNameInputField;
	
	@FindBy (xpath="//button[text()='Cancel']")
	WebElement cancelBtn;
	
	@FindBy (xpath="(//div[contains(@class,'cursor-pointer')])[2]")
	WebElement cancelResumeBtn;
	
	@FindBy(xpath="//span[contains(text(),'Upload')]")
	WebElement uploadButton;
	
	@FindBy(xpath="//input[contains(@type,'file')]")
	WebElement uploadInputButton;
	
	
	public CandidateProfilePage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public boolean isMedrepLogoDisplay(WebDriver driver) {
		waitForElementVisibility(medrepLogo, "30",driver);
		return isElementDisplayed(medrepLogo,driver);
	}
	
	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30",driver);
		waitForElementClickable(btnLogin, "30",driver);
		waitTime(2000);
		click(btnLogin,driver);
		try {
			waitForElementVisibility(btnLogin, "30",driver);
			waitForElementClickable(btnLogin, "30",driver);
			waitTime(2000);
			click(btnLogin,driver);
		}catch(Exception e) {
			
		}
		
	}


    public boolean isEmailFieldDisplay(WebDriver driver){
	    waitForElementVisibility(emailAddress, "30",driver);
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
		waitForElementVisibility(btnSubmitLogin, "30",driver);
		waitForElementClickable(btnSubmitLogin, "30",driver);
		click(btnSubmitLogin,driver);
	}
	
	public void clickProfilePictureCircle(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(profilePicCircle, "30",driver);
		click(profilePicCircle,driver);
	}
	
	public void clickProfileButton(WebDriver driver) {
		waitTime(3000);
		waitforPageLoad(30, driver);
		waitForElementClickable(profileBtn, "90",driver);
		click(profileBtn,driver);
	}
	
	public boolean verifyEditProfileTextIsDisplaying(WebDriver driver) {

		return isElementDisplayed(editProfileText,driver);}
	
	public void enterNameInProfilePage(String value,WebDriver driver) {
		waitTime(1000,driver);
		type(nameInputFieldOnProfile,value,driver);
	}
	
	public void selectCountryFromDropdownOnProfileEditPage(WebDriver driver, String country) {
		waitForElementClickable(countryDropdownBox, "30",driver);
		click(countryDropdownBox,driver);
		selectValueFromDropdown(allCountries, country,driver);
		
	}
	
	public void enterPostalCodeOnProfileEditPage(WebDriver driver) {
		String digits = generateRandomNumberWithGivenNumberOfDigits(5,driver);
		type(postalCode,digits,driver);
	}
	
	public void clickSaveBtnOnProfileEditPage(WebDriver driver) {
		waitForElementClickable(saveBtnOnProfileEditPage, "30",driver);
		click(saveBtnOnProfileEditPage,driver);
	}
	
	
	
	public boolean verifyDataUpdatedSuccessfully(WebDriver driver) {
		return isElementDisplayed(updatedSuccessfullyMessage,driver);
	}
	
	public void clickUpdateYourPasswordBtn(WebDriver driver) {
		waitForElementClickable(updateYourPasswordBtn, "30",driver);
		click(updateYourPasswordBtn,driver);
	}
	
	public boolean verifyUpdateYourPasswordScreen(WebDriver driver) {
		try {
		return isElementDisplayed(updateYourPasswordScreen,driver);}catch(Exception e) {
			return false;
		}
	}
	
	public void enterOldPassword(String value,WebDriver driver) {
		
		type(oldPasswordInputField,value,driver);
	}
	
	public void enterNewPassword(String value,WebDriver driver) {
		
		type(newPasswordInputField,value,driver);
	}
	
	public void enterConfirmNewPassword(String value,WebDriver driver) {
		
		type(confirmPasswordInputField,value,driver);
	}
	
	public void clickUpdatePasswordBtnOnUpdatePasswordPopup(WebDriver driver) {
		waitForElementClickable(updatePasswordBtnOnUpdatePasswordPopup, "30",driver);
		click(updatePasswordBtnOnUpdatePasswordPopup,driver);
	}
	
	
	public void clickLogoutBtnOnProfile(WebDriver driver) {
		waitForElementClickable(logoutBtnOnProfile, "30",driver);
		click(logoutBtnOnProfile,driver);
	}
	
	public void clickCancelBtnOnPasswordUpdatePopup(WebDriver driver) {
		waitForElementClickable(cancelBtnOnPasswordUpdatePopup, "30",driver);
		click(cancelBtnOnPasswordUpdatePopup,driver);
	}
	
	public void clickOnUpdatePaymentDetailsLink(WebDriver driver) {
		waitForElementVisibility(updatePaymentDetailsLink,"20",driver);
		waitForElementClickable(updatePaymentDetailsLink, "30",driver);
		click(updatePaymentDetailsLink,driver);
	}
	
	public boolean verifyBillingPageIsDisplaying(WebDriver driver) {
		return isElementDisplayed(billingPage,driver);
	}
	
	public void clickAddPaymentMethodBtn(WebDriver driver) {
		waitForElementVisibility(addPaymentMethodBtn,"20",driver);
		scrollToElement(addPaymentMethodBtn,driver);
		waitForElementClickable(addPaymentMethodBtn, "30",driver);
		click(addPaymentMethodBtn,driver);
	}
	
	public boolean verifyCardNumberLabelIsDisplaying(WebDriver driver) {
		return isElementDisplayed(cardNumberLabel,driver);
	}
	
	public void enterEmail(String email, WebDriver driver) {
		type(emailField, email, driver);
	}
	
	public void clickUpdateButtonForEmail(WebDriver driver) {
		waitForElementVisibility(updateButtonForEmail,"20",driver);
		scrollToElement(updateButtonForEmail,driver);
		waitForElementClickable(updateButtonForEmail, "30",driver);
		click(updateButtonForEmail,driver);
	}
	
	public String LastNameValue(WebDriver driver) {
		String val = "value";
		return getElementAttribute(lastNameInputField,val, driver);
	}
	
	public void EnterLastName(String val, WebDriver driver) {
		type(lastNameInputField, val, driver);
	}
	
	public void clickCancelBtn(WebDriver driver) {
		waitForElementVisibility(updateButtonForEmail,"20",driver);
		scrollToElement(updateButtonForEmail,driver);
		waitForElementClickable(updateButtonForEmail, "30",driver);
		click(updateButtonForEmail,driver);
	}
	
	public void clickCancelResumeBtn(WebDriver driver) {
		waitForElementVisibility(cancelResumeBtn,"20",driver);
		scrollToElement(cancelResumeBtn,driver);
		waitForElementClickable(cancelResumeBtn, "30",driver);
		click(cancelResumeBtn,driver);
	}	
	
	public boolean verifyUploadBtnDisplay(WebDriver driver) {
		return isElementDisplayed(uploadButton, driver);
	}
	
	public void uploadResume(WebDriver driver) {
		try {
		if (isElementDisplayed(uploadButton, driver)) {
		scrollIntoViewSmoothly(uploadButton,driver);
		waitTime(2000,driver);
		uploadInputButton.sendKeys(System.getProperty("user.dir") +"\\src\\test\\resources\\data\\testResume\\Resume.pdf");
		}}catch(Exception e) {
			
		}
	 }
	
	
}
