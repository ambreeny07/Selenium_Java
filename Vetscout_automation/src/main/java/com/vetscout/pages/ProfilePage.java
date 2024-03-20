package com.vetscout.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.utilities.Waits;


public class ProfilePage extends BaseClass {

	

	@FindBy(xpath = ("//*[contains(text(),'Phone :')]/parent::td/following-sibling::td"))
	WebElement profilePhone;
	
	@FindBy(xpath = ("//*[contains(text(),'edit')]"))
	WebElement editBtn;
	
	@FindBy(xpath = ("//*[contains(text(),'Save Profile')]"))
	WebElement saveBtn;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[3]"))
	WebElement profilePhoneInput;
	
	@FindBy(xpath = ("(//*[contains(@class,'image')])[1]"))
	WebElement profileImage;
	
	@FindBy(xpath = ("(//input[contains(@id,'profilePic')])[1]"))
	WebElement inputProfileImage;
	
	@FindBy(xpath = ("//*[contains(text(),'Add New')]"))
	WebElement addNewBtn;
	
	@FindBy(xpath = ("//input[@id='standard-name']"))
	WebElement practiceNameInput;
	
	@FindBy(xpath = ("//input[@id='standard-email']"))
	WebElement practiceEmailInput;
	
	@FindBy(xpath = ("//input[@id='standard-phone']"))
	WebElement practicePhoneInput;
	
	@FindBy(xpath = ("(//*[contains(@class,'p-multiselect-trigger')])[1]"))
	WebElement practiceTypeDropDown;
	
	@FindBy(xpath = ("//*[contains(text(),'Companion')]"))
	WebElement practiceTypeCompanion;
	
	@FindBy(xpath = ("//*[contains(text(),'save')]"))
	WebElement practiceSaveBtn;
	
	@FindBy(xpath = ("//div[contains(text(),'Phone Number is required.')]"))
	WebElement inputValidationPhone;
	
	@FindBy(xpath = ("(//*[contains(text(),'Make Active')])[1]"))
	WebElement makeActiveBtn;
	
	@FindBy(xpath = ("(//*[contains(text(),'Active')])[1]"))
	WebElement activeBtn;
	
	@FindBy(xpath = ("(//*[contains(text(),'Phone')])[1]/following-sibling::td"))
	WebElement practicePhoneNo;
	
	@FindBy(xpath = ("(//*[contains(text(),'Edit')])[1]"))
	WebElement editPracticeBtn;
	
	@FindBy(xpath = ("//a[@href='/userProfile/users'] | //a[text()='Additional Users']"))
	WebElement leftMenuAdditionalUsersOption;
	
	@FindBy(xpath = ("//div[text()='Email']/following::div[@role='gridcell'][1]"))
	WebElement emailInfo;
	
	@FindBy(xpath = ("//div[text()='First Name']/following::div[@role='gridcell'][2]"))
	WebElement firstNameInfo;
	
	@FindBy(xpath = ("//div[text()='Last Name']/following::div[@role='gridcell'][3]"))
	WebElement lastNameInfo;
	
	@FindBy(xpath = ("//div[text()='Phone']/following::div[@role='gridcell'][4]"))
	WebElement phoneInfo;
	
	@FindBy(xpath = ("//div[text()='Active']/following::div[@role='gridcell'][5]"))
	WebElement activeInfo;
	
	@FindBy(xpath = ("//div[text()='Action']/following::div[@role='gridcell'][6]"))
	WebElement actionInfo;
	
	@FindBy(xpath = ("(//span[contains(text(),'Add')])"))
	WebElement addAdditionalUserBtn;
	
	@FindBy(xpath = ("(//*[contains(text(),'edit')])[1]"))
	WebElement editAdditionalUserBtn;
	
	@FindBy(xpath = ("(//*[contains(text(),'Demo')])[1]/following-sibling::div[2]"))
	WebElement phoneAdditionalUser;
	
	@FindBy(xpath = ("(//input[@name='firstname'])[1]"))
	WebElement inputAdditionalUserFName;
	
	@FindBy(xpath = ("(//input[@name='lastname'])[1]"))
	WebElement inputAdditionalUserLName;
	
	@FindBy(xpath = ("(//input[@name='username'])[1]"))
	WebElement inputAdditionalUserEmail;
	
	@FindBy(xpath = ("(//input[@name='phone'])[1]"))
	WebElement inputAdditionalUserPhone;
	
	@FindBy(xpath = ("(//input[@name='password'])[1]"))
	WebElement inputAdditionalUserPassword;
	
	@FindBy(xpath = ("(//input[@name='confirmPassword'])[1]"))
	WebElement inputAdditionalUserConfirmPassword;
	
	
	@FindBy(xpath = ("//*[contains(text(),'Save')]"))
	WebElement additionalUserSaveBtn;
	
	@FindBy(xpath = ("(//div[text()='User Added Successfully !!'])[1]"))
	WebElement additionalUserAddConfirmation;
	
	
			
	
	@FindBy(xpath = ("//*[contains(text(),'Ok')]"))
	WebElement additionalUserEditOkBtn;
	
	@FindBy(xpath = ("(//i[contains(text(),'lock')])[1]"))
	WebElement additionalUserLockBtn;
	
	@FindBy(xpath = ("(//i[contains(text(),'lock_open')])[1]"))
	WebElement additionalUserLockOpenBtn;
	
	@FindBy(xpath = ("//*[contains(text(),'yes')]"))
	WebElement additionalUserYesLockBtn;	
	
	@FindBy(xpath = ("(//*[contains(@class,'select-responsive')])[1]"))
	WebElement addressSelectPractice;
	
	@FindBy(xpath = ("(//div[contains(text(),'Test Practice In Demo Login')])[1]"))
	WebElement addressSelectDropDown1;
	
	@FindBy(xpath = ("(//div[contains(text(),'Sourabh')])[1]"))
	WebElement addressSelectDropDown2;
	
	@FindBy(xpath = ("(//span[contains(text(),'add')])[1]"))
	WebElement addressBillingAddBtn;
	
	@FindBy(xpath = ("(//span[contains(text(),'add')])[2]"))
	WebElement addressShippingAddBtn;
	
	@FindBy(xpath = ("(//span[contains(text(),'edit')])[1]"))
	WebElement addressBillingEditBtn;
	
	@FindBy(xpath = ("(//span[contains(text(),'edit')])[2]"))
	WebElement addressShippingEditBtn;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[1]"))
	WebElement addressFNameInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[2]"))
	WebElement addressLNameInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[3]"))
	WebElement addressInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[4]"))
	WebElement addressCityInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[5]"))
	WebElement addressStateInput;
	
	@FindBy(xpath = ("(//input[@id='standard-name'])[6]"))
	WebElement addressZipCodeInput;
	
	@FindBy(xpath = ("//*[contains(text(),'save')]"))
	WebElement addressSaveBtn;
	
	//@FindBy(xpath = ("(//h5[contains(text(),'Billing Address')])[1]/following-sibling::div/address/div[2]"))
	@FindBy(xpath = ("(//address[contains(@class,'mb-25')])[1]/div[2]"))
	WebElement addressBilling;
	
	@FindBy(xpath = ("(//address[contains(@class,'mb-25')])[2]/div[2]"))
	WebElement addressShipping;
	
	@FindBy(xpath = ("(//input[@type='checkbox'])[1]"))
	WebElement NotificationEmailCheckbox;
	
	@FindBy(xpath = ("(//input[contains(@class,'p-inputtext')])[1]"))
	WebElement InputNotificationEmail;
	
	@FindBy(xpath = ("(//span[text()='Update'])[1]"))
	WebElement UpdateNotificationEmail;
	
	@FindBy(xpath = ("(//*[contains(@class,'select-responsive')])[1]"))
	WebElement selectPracticeNotification;
	
	@FindBy(xpath = ("(//*[contains(text(),'Test Practice In Demo Login')])[1]"))
	WebElement selectPracticeNotificationOption1;
	
	@FindBy(xpath = ("//div[contains(@role,'presentation')]/ul/li"))
	List<WebElement> vendorList;
	
	@FindBy(xpath = ("(//input[contains(@type,'checkbox')])[1]"))
	WebElement profileGroupImageCheckbox;
	
	@FindBy(xpath = ("(//input[contains(@type,'checkbox')])[1]/parent::span"))
	WebElement profileGroupImageCheckboxSpan;
	
	@FindBy(xpath = ("(//*[contains(text(),'Share My Purchasing and Rebate Data')])[1]"))
	WebElement profileGroupShareMyPurchasing;
	
	@FindBy(xpath = ("(//input[contains(@type,'checkbox')])[2]"))
	WebElement profileGroupCheckbox2;
	
	@FindBy(xpath = ("(//input[contains(@type,'checkbox')])[2]/parent::span"))
	WebElement profileGroupCheckbox2Span;
	
	@FindBy(xpath = ("(//img[contains(@alt,'PSIvet')])[1]"))
	WebElement profileGroupImage;
	
	@FindBy(xpath = ("(//div[contains(@role,'button')])[2]"))
	WebElement faqItem;
	
	@FindBy(xpath = ("(//div[contains(@role,'button')])[1]/following-sibling::div"))
	WebElement faqItemDescription;
	
	@FindBy(xpath = ("//span[text()='Support Email']"))
	WebElement faqSubmitRequestBtn;
	
	
	@FindBy(xpath = ("//b[text()='Covetrus PSIvet Partners Program']"))
	WebElement rewardProgramDetail;
	
	@FindBy(xpath = ("//a[text()='Click here for program details ']"))
	WebElement rewardProgramLink;
	
	@FindBy(xpath = ("(//input[contains(@type,'checkbox')])[1]"))
	WebElement rewardTermsConditionCheckbox;
	
	
	@FindBy(xpath = ("//input[contains(@name,'customerName')]"))
	WebElement rewardNameInput;
	
	@FindBy(xpath = ("//input[contains(@name,'companyName')]"))
	WebElement rewardPracticeInput;
	
	@FindBy(xpath = ("//input[contains(@name,'companyEmail')]"))
	WebElement rewardEmailInput;
	
	@FindBy(xpath = ("//input[contains(@name,'companyPhone')]"))
	WebElement rewardPhoneInput;
	
	@FindBy(xpath = ("//button[contains(@type,'submit')]"))
	WebElement rewardSubmitBtn;
	
	@FindBy(xpath = ("//*[contains(text(),'Withdraw consent')]//parent::button"))
	WebElement withdrawConsentButton;
	
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEditButton() {
		waitForElementClickable(editBtn, "20");
		click(editBtn);
	}
	
	public void clickOnSaveButton() {
		waitForElementClickable(saveBtn, "20");
		click(saveBtn);
	}
	
	public void clickOnAddNew() {
		waitForElementClickable(addNewBtn, "20");
		click(addNewBtn);
	}
	
	public void clickOnPracticeType() {
		waitForElementClickable(practiceTypeDropDown, "20");
		click(practiceTypeDropDown);
	}
	

	public void clickOnPracticeSave() {
		waitForElementClickable(practiceSaveBtn, "20");
		click(practiceSaveBtn);
	}
	
	public void clickOnPracticeCompanion() {
		waitForElementClickable(practiceTypeCompanion, "20");
		click(practiceTypeCompanion);
	}
	
	public void clickOnMakeActiveButton() {
		waitForElementClickable(makeActiveBtn, "20");
		click(makeActiveBtn);
	}
	
	public void clickOnEditPracticeButton() {
		waitForElementClickable(editPracticeBtn, "20");
		click(editPracticeBtn);
	}
	
	public void clickOnAdditionalUserSaveButton() {
		waitForElementClickable(additionalUserSaveBtn, "20");
		click(additionalUserSaveBtn);
	}
	
	public void clickOnAddAdditionalUserButton() {
		waitForElementClickable(addAdditionalUserBtn, "20");
		click(addAdditionalUserBtn);
	}
	
	public void clickOnEditAdditionalUserButton() {
		waitForElementClickable(editAdditionalUserBtn, "20");
		click(editAdditionalUserBtn);
	}
	
	public void clickOnOKEditAdditionalUserButton() {
		waitForElementClickable(additionalUserEditOkBtn, "20");
		click(additionalUserEditOkBtn);
	}
	
	public void clickOnLockAdditionalUserButton() {
		waitForElementClickable(additionalUserLockBtn, "20");
		click(additionalUserLockBtn);
	}
	
	public void clickOnUnLockAdditionalUserButton() {
		waitForElementClickable(additionalUserLockOpenBtn, "20");
		click(additionalUserLockOpenBtn);
	}
	
	public void clickOnLockYesAdditionalUserButton() {
		waitForElementClickable(additionalUserYesLockBtn, "20");
		click(additionalUserYesLockBtn);
	}
	
	public void clickOnAddressSelectPractice() {
		waitForElementClickable(addressSelectPractice, "20");
		click(addressSelectPractice);
	}
	
	public void clickOnAddressSelectPractice1() {
		waitForElementClickable(addressSelectDropDown1, "20");
		click(addressSelectDropDown1);
	}
	
	public void clickOnAddressSelectPractice2() {
		waitForElementClickable(addressSelectDropDown2, "20");
		click(addressSelectDropDown2);
	}
	
	public void clickOnAddBillingAddress() {
		waitForElementClickable(addressBillingAddBtn, "20");
		click(addressBillingAddBtn);
	}
	
	public void clickOnAddShippingAddress() {
		waitForElementClickable(addressShippingAddBtn, "20");
		click(addressShippingAddBtn);
	}
	
	public void clickOnAddressSaveBtn() {
		waitForElementClickable(addressSaveBtn, "20");
		click(addressSaveBtn);
	}
	
	public void clickOnAddressBillingEditBtn() {
		waitForElementClickable(addressBillingEditBtn, "20");
		click(addressBillingEditBtn);
	}
	
	public void clickOnAddressShippingEditBtn() {
		waitForElementClickable(addressShippingEditBtn, "20");
		click(addressShippingEditBtn);
	}
	
	public void clickOnUpdateNotificationEmail() {
		waitForElementClickable(UpdateNotificationEmail, "20");
		click(UpdateNotificationEmail);
	}
	public void clickOnCheckboxNotificationEmail() {

		NotificationEmailCheckbox.click();
		try {
			waitfor3sec();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(!NotificationEmailCheckbox.isSelected())
			NotificationEmailCheckbox.click();
	}
	
	public void clickOnSelectPracticeNotification() {
		waitForElementClickable(selectPracticeNotification, "20");
		click(selectPracticeNotification);
	}
	
	public void clickOnSelectPracticeNotificationOption1() {
		waitForElementClickable(selectPracticeNotificationOption1, "20");
		click(selectPracticeNotificationOption1);
	}
	
	public void clickOnInputNotificationEmail() {
		InputNotificationEmail.click();
	}
	
	public void clickOnGroupsCheckboxActive() {
		
		try {
			profileGroupImageCheckbox.click();

			waitfor5sec();
			
			if(!profileGroupImageCheckbox.isSelected())
				profileGroupImageCheckbox.click();
			
			waitfor5sec();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
	
	public void clickOnGroupsCheckboxDeActive() {
		
		try {
			profileGroupImageCheckbox.click();

			waitfor5sec();
			
			if(profileGroupImageCheckbox.isSelected())
				profileGroupImageCheckbox.click();
			
			waitfor5sec();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
	
	public void clickOnSharePurchasingRebateDataCheckboxActive() {
		
		try {
			profileGroupCheckbox2.click();

			waitfor5sec();
			
			if(!profileGroupCheckbox2.isSelected())
				profileGroupCheckbox2.click();
			
			waitfor5sec();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
	
	public void clickOnSharePurchasingRebateDataCheckboxDeActive() {
		
		try {
			profileGroupCheckbox2.click();

			waitfor5sec();
			
			if(profileGroupCheckbox2.isSelected())
				profileGroupCheckbox2.click();
			
			waitfor5sec();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}	
	
	public void enterProfilePhoneno(String str) {
		waitUntilElementDisplayed(profilePhoneInput);
		type(profilePhoneInput, str);
	}
	
	public void clickOnFAQItem() {
		waitForElementClickable(faqItem, "20");
		click(faqItem);
	}
	
	public void clickOnFAQSubmitRequest() {
		waitForElementClickable(faqSubmitRequestBtn, "20");
		click(faqSubmitRequestBtn);
	}

	public void clickOnRewardProgramLink() {
		waitForElementClickable(rewardProgramLink, "20");
		click(rewardProgramLink);
	}
	
	public void clickOnRewardSubmit() {
		waitForElementClickable(rewardSubmitBtn, "20");
		click(rewardSubmitBtn);
	}
	
	public void clickOnRewardTermsConditionCheckbox() {
		if(!rewardTermsConditionCheckbox.isSelected())
			rewardTermsConditionCheckbox.click();
		
	}
	
	public void enterPracticeEmail(String str) {
		waitUntilElementDisplayed(practiceEmailInput);
		type(practiceEmailInput, str);
	}
	
	public void enterPracticeName(String str) {
		waitUntilElementDisplayed(practiceNameInput);
		type(practiceNameInput, str);
	}
	
	public void enterPracticePhone(String str) {
		waitUntilElementDisplayed(practicePhoneInput);
		type(practicePhoneInput, str);
	}
	
	
	public void enterAddressFName(String str) {
		waitUntilElementDisplayed(addressFNameInput);
		type(addressFNameInput, str);
	}
	
	public void enterAddressLName(String str) {
		waitUntilElementDisplayed(addressLNameInput);
		type(addressLNameInput, str);
	}
	
	public void enterAddress(String str) {
		waitUntilElementDisplayed(addressInput);
		type(addressInput, str);
	}
	
	public void enterAddressCity(String str) {
		waitUntilElementDisplayed(addressCityInput);
		type(addressCityInput, str);
	}
	
	public void enterAddressState(String str) {
		waitUntilElementDisplayed(addressStateInput);
		type(addressStateInput, str);
	}
	
	public void enterAddressZipCode(String str) {
		waitUntilElementDisplayed(addressZipCodeInput);
		type(addressZipCodeInput, str);
	}
	
	public void enterEditAdditionalUserPhone(String str) {
		waitUntilElementDisplayed(inputAdditionalUserPhone);
		type(inputAdditionalUserPhone, str);
	}
	
	public void enterEditAdditionalUserFName(String str) {
		waitUntilElementDisplayed(inputAdditionalUserFName);
		type(inputAdditionalUserFName, str);
	}
	
	public void enterEditAdditionalUserLName(String str) {
		waitUntilElementDisplayed(inputAdditionalUserLName);
		type(inputAdditionalUserLName, str);
	}
	
	public void enterEditAdditionalUserEmail(String str) {
		waitUntilElementDisplayed(inputAdditionalUserEmail);
		type(inputAdditionalUserEmail, str);
	}
	
	public void enterEditAdditionalUserPassword(String str) {
		waitUntilElementDisplayed(inputAdditionalUserPassword);
		type(inputAdditionalUserPassword, str);
	}
	
	public void enterEditAdditionalUserConfirmPassword(String str) {
		waitUntilElementDisplayed(inputAdditionalUserConfirmPassword);
		type(inputAdditionalUserConfirmPassword, str);
	}
	
	public void enterEditNotificationEmail(String str) {
		waitUntilElementDisplayed(InputNotificationEmail);
		type(InputNotificationEmail, str);
	}
	
		
	public void enterRewardName(String str) {
		waitUntilElementDisplayed(rewardNameInput);
		type(rewardNameInput, str);
	}
	
	public void enterRewardPractice(String str) {
		waitUntilElementDisplayed(rewardPracticeInput);
		type(rewardPracticeInput, str);
	}
	
	public void enterRewardEmail(String str) {
		waitUntilElementDisplayed(rewardEmailInput);
		type(rewardEmailInput, str);
	}
	
	public void enterRewardPhone(String str) {
		waitUntilElementDisplayed(rewardPhoneInput);
		type(rewardPhoneInput, str);
	}
	

	public boolean isPhonenoChange(String str) {
		
		if(profilePhone.getText().equals(str))
			return true;
		
		return false;
	}
	
	public boolean isAdditionalUserPhonenoChange(String str) {
		
		if(phoneAdditionalUser.getText().equals(str))
			return true;
		
		return false;
	}
	
	public boolean isPractcePhonenoChange(String str) {
		
		if(practicePhoneNo.getText().equals(str))return true;
		
		return false;
	}
	
	public boolean isEditBillingAddressChange(String str) {
		
		if(addressBilling.getText().equals(str))return true;
		
		return false;
	}

	public boolean isEditShippingAddressChange(String str) {
	
	if(addressShipping.getText().equals(str))return true;
	
	return false;
}
	
	public boolean isNotificationEmailUpdated(String str) {
		
		if(InputNotificationEmail.getAttribute("value").equals(str))
			return true;
		
		return false;
	}
	
	public void changeProfilePic(String str) {
		
		waitUntilElementDisplayed(inputProfileImage);
		inputProfileImage.sendKeys(str);
	}
	
	public boolean isProfilePictureChanged(String str) {

		if(!getProfileImageSrc().equals(str))
			return true;
		
		return false;
	}
	
	public String getProfileImageSrc() {
		
		return profileImage.getAttribute("src");
	}
	
	public boolean isPracticePhoneValidationDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(inputValidationPhone);
	}
	
	public boolean isActiveButtonDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(activeBtn);
	}
	
	public boolean isEmailInfoDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(emailInfo);
	}
	
	public boolean isFirstNameInfoDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(firstNameInfo);
	}
	
	public boolean isLastNameInfoDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(lastNameInfo);
	}
	
	public boolean isPhoneInfoDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(phoneInfo);
	}
	
	public boolean isAdditionalUserAddConfirmationDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(additionalUserAddConfirmation);
	}
	
	
	public boolean isActiveInfoDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(activeInfo);
	}
	
	public boolean isActionInfoDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(actionInfo);
	}
	public boolean isAdditionalUserLockDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(additionalUserLockBtn);
	}
	
	public boolean isAdditionalUserUnLockDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(additionalUserLockOpenBtn);
	}
	
	public boolean isAddressSelectDropdownDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(addressSelectPractice);
	}
	
	public boolean isBillingAddressAddBtnDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(addressBillingAddBtn);
	}
	
	public boolean isShippingAddressAddBtnDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(addressShippingAddBtn);
	}
	
	public boolean isAddressBillingEditBtnDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(addressBillingEditBtn);
	}
	
	public boolean isGroupsImageCheckBoxDisplaying() {
	
		try {
			waitForElementVisibility(profileGroupImageCheckboxSpan, defaultTimeForVisibility);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean isGroupsCheckbox2Displaying() {
		
		try {
			waitForElementVisibility(profileGroupCheckbox2Span, defaultTimeForVisibility);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean isGroupsImageDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(profileGroupImage);
	}
	
	public boolean isGroupsShareMyPurchaseDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(profileGroupShareMyPurchasing);
	}
	
	public boolean isFAQDescriptionDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(faqItemDescription);
	}
	
	public boolean isRewardProgramDetailDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(rewardProgramDetail);
	}
	
	public boolean isRewardProgramLinkDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(rewardProgramLink);
	}
	

	

	public boolean isVendorListDisplaying() {
		Waits.wait1s();
		if(vendorList.size()>0)
			return true;
					
					
		return false;
	}
	
	public boolean isGroupChecboxChecked() {
		if(profileGroupImageCheckbox.isSelected())
			return true;
		
		return false;
		
	}
	
	public boolean isGroupChecboxUnChecked() {
		if(profileGroupImageCheckbox.isSelected())
			return false;
		
		return true;
		
	}
	public boolean isSharePurchasingRebateDataChecboxChecked() {
		if(profileGroupCheckbox2.isSelected())
			return true;
		
		return false;
		
	}
	
	public boolean isSharePurchasingRebateDataChecboxUnChecked() {
		if(profileGroupCheckbox2.isSelected())
			return false;
		
		return true;
		
	}	
	
	public void clickOnLeftMenuAdditionalUsersOption() {
		waitForElementClickable(leftMenuAdditionalUsersOption, "20");
		click(leftMenuAdditionalUsersOption);
	}
	
	public void clickOnWithdrawConsentButton() {
		waitForElementClickable(withdrawConsentButton, "20");
		click(withdrawConsentButton);
	}
	
	public boolean isWithdrawConsentButtonDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(withdrawConsentButton);
	}
	
	
	
	
}
