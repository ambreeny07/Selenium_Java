package com.vetscout.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;


public class RebatesPsiRebatesPage extends BaseClass {

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
	
	@FindBy(xpath = ("(//a[@href='/rebates'])[1] | (//a[text()='Rewards'])[1]"))
	WebElement rewardsBtn;
	
	@FindBy(xpath = ("(//a[@href='/rebates/savings?type=rebate'])[1] | (//a[text()='PSIVet Rebates'])[1]"))
	WebElement pSIVetRebates;
	
	@FindBy(xpath = ("(//a[@href='/rebates/savings?type=savings'])[1] | (//a[text()='PSIVet Savings'])[1]"))
	WebElement pSIVetSavings;
	
	@FindBy(xpath = ("(//a[@href='/rebates/'])[1] | (//a[text()='Estimator'])[1]"))
	WebElement estimatorOption;
	
	@FindBy(xpath = ("(//a[@href='/userProfile/programs'])[1] | (//a[text()='Rewards Programs'])[1]"))
	WebElement RewardsProgramsOption;
	
	@FindBy(xpath = ("//div[contains(text(),'Missed Savings')]"))
	WebElement missedSavings;
	
	@FindBy(xpath = ("//div[text()='Rebates ']"))
	WebElement rebatesTitel;
	
	@FindBy(xpath = ("//span[text()='DATE']/following::td[1]"))
	WebElement infoDate;
	
	@FindBy(xpath = ("//span[text()='DESCRIPTION']/following::td[2]"))
	WebElement infoDescription;
	
	@FindBy(xpath = ("//span[text()='AMOUNT']/following::td[3]"))
	WebElement infoAmount;
	
	@FindBy(xpath = ("//span[text()='TYPE']/following::td[4]"))
	WebElement infoType;
	
	@FindBy(xpath = ("(//span[text()='EXPORT'])[1]"))
	WebElement PSIRebateExportBtn;
	
	@FindBy(xpath = ("(//span[text()='EXPORT'])[2]"))
	WebElement PSISavingExportBtn;
	
	@FindBy(xpath = ("(//span[text()='EXPORT'])[3]"))
	WebElement MissedSavingExportBtn;
	
	
	@FindBy(xpath = ("(//button[contains(@class,'p-row-toggler')])[1]"))
	WebElement PSISavingExpandIcon;
	
	@FindBy(xpath = ("(//button[contains(@class,'p-row-toggler')])[1]/parent::td/following-sibling::td[1]"))
	WebElement PSISavingOrderDate;
	
	@FindBy(xpath = ("(//button[contains(@class,'p-row-toggler')])[1]/parent::td/following-sibling::td[2]"))
	WebElement PSISavingOrderNumber;
	
	@FindBy(xpath = ("(//button[contains(@class,'p-row-toggler')])[1]/parent::td/following-sibling::td[3]"))
	WebElement PSISavingTotalSaving;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]"))
	WebElement PSISavingProductImage;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[1]"))
	WebElement PSISavingProductDescription;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[2]"))
	WebElement PSISavingProductQuantity;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[3]"))
	WebElement PSISavingProductPurchaseVendor;
	
//	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[4]"))
//	WebElement PSISavingProductPurchasePrice;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[4]"))
	WebElement PSISavingProductHighVendor;
	
//	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[6]"))
//	WebElement PSISavingProductHighPrice;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[5]"))
	WebElement PSISavingProductSaving;
	
	@FindBy(xpath = ("(//table[contains(@role,'grid')])[3]/tbody/tr[1]/td[1]/button"))
	WebElement MissedSavingExpandIcon;
	
	@FindBy(xpath = ("(//table[contains(@role,'grid')])[3]/tbody/tr[1]/td[2]"))
	WebElement MissedSavingOrderDate;
	
	@FindBy(xpath = ("(//table[contains(@role,'grid')])[3]/tbody/tr[1]/td[3]"))
	WebElement MissedSavingOrderNumber;
	
	@FindBy(xpath = ("(//table[contains(@role,'grid')])[3]/tbody/tr[1]/td[4]"))
	WebElement MissedSavingTotal;
	
	@FindBy(xpath = ("(//table[contains(@role,'grid')])[3]/tbody/tr[1]/td[5]"))
	WebElement MissedSavingNote;
	
	@FindBy(xpath = ("(//table[contains(@role,'grid')])[3]/tbody/tr[1]/td[5]/div/button/span/i"))
	WebElement MissedSavingNoteIcon;
	
	
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]"))
	WebElement MissedSavingProductImage;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[1]"))
	WebElement MissedSavingProductDescription;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[2]"))
	WebElement MissedSavingProductQuantity;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[3]"))
	WebElement MissedSavingProductPurchaseVendor;
	
//	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[4]"))
//	WebElement MissedSavingProductPurchasePrice;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[4]"))
	WebElement MissedSavingProductHighVendor;
	
//	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[6]"))
//	WebElement MissedSavingProductHighPrice;
	
	@FindBy(xpath = ("(//img[contains(@class,'product-image')])[1]/parent::td/following-sibling::td[5]"))
	WebElement MissedSavingProductSaving;
	
	
	@FindBy(xpath = ("(//input[contains(@class,'p-inputtext')])[last()]"))
	WebElement MissedSavingNoteInput;
	
	@FindBy(xpath = ("(//i[text()='save'])[last()]/parent::span/parent::button"))
	WebElement MissedSavingNoteSaveBtn;
		
	
	public RebatesPsiRebatesPage() {
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
	
	public void enterMissedSavingNote(String str) {
		waitUntilElementDisplayed(MissedSavingNoteInput);
		MissedSavingNoteInput.click();
		type(MissedSavingNoteInput, str);
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
	
	public void clickOnPSIRebateExportButton() {
		scrollToElement(PSIRebateExportBtn);
		waitForElementClickable(PSIRebateExportBtn, "20");
		click(PSIRebateExportBtn);
	}
	
	public void clickOnPSISavingExportButton() {
		scrollToElement(PSISavingExportBtn);
		waitForElementClickable(PSISavingExportBtn, "20");
		click(PSISavingExportBtn);
	}
	
	public void clickOnMissedSavingExportButton() {
		scrollToElement(MissedSavingExportBtn);
		waitForElementClickable(MissedSavingExportBtn, "20");
		click(MissedSavingExportBtn);
	}
	
	public void clickOnPSISavingExpandButton() {
		scrollToElement(PSISavingExpandIcon);
		waitForElementClickable(PSISavingExpandIcon, "20");
		click(PSISavingExpandIcon);
	}
	
	public void clickOnMissedSavingExpandButton() {
		scrollToElement(MissedSavingExpandIcon);
		waitForElementClickable(MissedSavingExpandIcon, "20");
		click(MissedSavingExpandIcon);
	}
	
	
	public void clickOnMissedSavingNoteSaveBtn() {
		scrollToElement(MissedSavingNoteSaveBtn);
		waitForElementClickable(MissedSavingNoteSaveBtn, "20");
		click(MissedSavingNoteSaveBtn);
	}
	
	public void clickOnMissedSavingNoteBtn() {
		scrollToElement(MissedSavingNote);
		waitForElementClickable(MissedSavingNote, "20");
		click(MissedSavingNote);
	}
	
	
	public void scrollToMissedSavingSection() {
		scrollIntoViewSmoothly(MissedSavingExpandIcon);
		
	}
	
	
	public void scrollToPSISavingSection() {
		scrollToElement(PSISavingExpandIcon);
		
	}
	
	
	
	public boolean isCompanyNameInputValidtionPopupDisplaying() {
		return Boolean.parseBoolean(companyNameTxt.getAttribute("required"));
	}
	
	public boolean isRegisterationSuccessfulPopUpDisplaying() {
		return isElementDisplayed(registerationSuccessfulPopUp);
	}
	public void hoverRewardsAndClickPSIVetRebates() {
		waitForElementClickable(rewardsBtn, "20");
		hoverAndClick(rewardsBtn,pSIVetRebates);
	}
	
	public void hoverRewardsAndClickPSIVetSavings() {
		waitForElementClickable(rewardsBtn, "20");
		hoverAndClick(rewardsBtn,pSIVetSavings);
	}
	
	public boolean isMissedSavingsDisplaying() {
		scrollIntoView(missedSavings);
		return isElementDisplayed(missedSavings);
	}
	
	public boolean isRebatesTitelDisplaying() {
		scrollIntoView(rebatesTitel);
		return isElementDisplayed(rebatesTitel);
	}
	
	public boolean isInfoRelatedToDateDisplaying() {
		scrollIntoView(infoDate);
		return isElementDisplayed(infoDate);
	}
	
	public boolean isRelatedToInfoAmountDisplaying() {
		scrollIntoView(infoAmount);
		return isElementDisplayed(infoAmount);
	}
	
	public boolean isRelatedToInfoTypeDisplaying() {
		scrollIntoView(infoType);
		return isElementDisplayed(infoType);
	}
	
	public boolean isRebateSavingExpandIconDisplaying() {
		scrollIntoView(PSISavingExpandIcon);
		return isElementDisplayed(PSISavingExpandIcon);
	}
	
	public boolean isRebateOrderDateDisplaying() {
		scrollIntoView(PSISavingOrderDate);
		return isElementDisplayed(PSISavingOrderDate);
	}
	
	public boolean isRebateOrderNumberDisplaying() {
		scrollIntoView(PSISavingOrderNumber);
		return isElementDisplayed(PSISavingOrderNumber);
	}
	
	public boolean isRebateTotalDisplaying() {
		scrollIntoView(PSISavingTotalSaving);
		return isElementDisplayed(PSISavingTotalSaving);
	}
	
	
	public boolean isRebateSavingProductImageDisplaying() {
		scrollIntoView(PSISavingProductImage);
		return isElementDisplayed(PSISavingProductImage);
	}
	
	
	public boolean isRebateSavingProductDescriptionDisplaying() {
		scrollIntoView(PSISavingProductDescription);
		return isElementDisplayed(PSISavingProductDescription);
	}
		
	public boolean isRebateSavingProductQuantityDisplaying() {
		scrollIntoView(PSISavingProductQuantity);
		return isElementDisplayed(PSISavingProductQuantity);
	}
	
	public boolean isRebateSavingPurchaseVendorDisplaying() {
		scrollIntoView(PSISavingProductPurchaseVendor);
		return isElementDisplayed(PSISavingProductPurchaseVendor);
	}
	
//	public boolean isRebateSavingPurchasePriceDisplaying() {
//		scrollIntoView(PSISavingProductPurchasePrice);
//		return isElementDisplayed(PSISavingProductPurchasePrice);
//	}
	
	public boolean isRebateSavingHighVendorDisplaying() {
		scrollIntoView(PSISavingProductHighVendor);
		return isElementDisplayed(PSISavingProductHighVendor);
	}
	
//	public boolean isRebateSavingHighPriceDisplaying() {
//		scrollIntoView(PSISavingProductHighPrice);
//		return isElementDisplayed(PSISavingProductHighPrice);
//	}
	
	public boolean isRebateSavingProductTotalDisplaying() {
		scrollIntoView(PSISavingProductSaving);
		return isElementDisplayed(PSISavingProductSaving);
	}
	
	public boolean isMissedSavingExpandIcon() {
		scrollIntoView(MissedSavingExpandIcon);
		return isElementDisplayed(MissedSavingExpandIcon);
	}
	
	public boolean isMissedSavingOrdeDate() {
		scrollIntoView(MissedSavingOrderDate);
		return isElementDisplayed(MissedSavingOrderDate);
	}
	
	public boolean isMissedSavingOrdeNumber() {
		scrollIntoView(MissedSavingOrderNumber);
		return isElementDisplayed(MissedSavingOrderNumber);
	}
	
	public boolean isMissedSavingTotal() {
		scrollIntoView(MissedSavingTotal);
		return isElementDisplayed(MissedSavingTotal);
	}
	
	public boolean isMissedSavingOrdeNote() {
		scrollIntoView(MissedSavingNote);
		return isElementDisplayed(MissedSavingNote);
	}
	
	public boolean isMissedSavingProductImageDisplaying() {
		scrollIntoView(MissedSavingProductImage);
		return isElementDisplayed(MissedSavingProductImage);
	}
	
	
	public boolean isMissedSavingProductDescriptionDisplaying() {
		scrollIntoView(MissedSavingProductDescription);
		return isElementDisplayed(MissedSavingProductDescription);
	}
		
	public boolean isMissedSavingProductQuantityDisplaying() {
		scrollIntoView(MissedSavingProductQuantity);
		return isElementDisplayed(MissedSavingProductQuantity);
	}
	
	public boolean isMissedSavingPurchaseVendorDisplaying() {
		scrollIntoView(MissedSavingProductPurchaseVendor);
		return isElementDisplayed(MissedSavingProductPurchaseVendor);
	}
	
//	public boolean isMissedSavingPurchasePriceDisplaying() {
//		scrollIntoView(MissedSavingProductPurchasePrice);
//		return isElementDisplayed(MissedSavingProductPurchasePrice);
//	}
	
	public boolean isMissedSavingHighVendorDisplaying() {
		scrollIntoView(MissedSavingProductHighVendor);
		return isElementDisplayed(MissedSavingProductHighVendor);
	}
	
//	public boolean isMissedSavingHighPriceDisplaying() {
//		scrollIntoView(MissedSavingProductHighPrice);
//		return isElementDisplayed(MissedSavingProductHighPrice);
//	}
	
	public boolean isMissedSavingProductTotalDisplaying() {
		scrollIntoView(MissedSavingProductSaving);
		return isElementDisplayed(MissedSavingProductSaving);
	}
	
	
	public boolean isSaveNoteSuccessfully() {

		if(MissedSavingNoteIcon.getCssValue("color").equals("rgba(255, 87, 34, 1)"))
			return true;
		
		
		return false;
	}
	
	public boolean isMissedSavingExpandedSectionContracted() {

			if(isElementDisplayed(MissedSavingProductImage))
			return false;
			else
			return true;

	}
	
	
	public boolean isPSISavingExpandedSectionContracted() {

			if(isElementDisplayed(PSISavingProductImage))
			return false;
			else
			return true;

	}
	
	
	

}
