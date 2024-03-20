package com.medrep.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class StrapiPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("//input[@id='email']"))
	WebElement emailTxt;
	
	@FindBy(xpath = ("//input[@id='password']"))
	WebElement passwordTxt;
	
	@FindBy(xpath = ("//button[@type='submit']"))
	WebElement loginBtn;
	
	@FindBy(xpath = ("//span[text()='Collection Types']/../button"))
	WebElement userMenuSearchBtn;
	
	@FindBy(xpath = ("//input[@placeholder='Search...']"))
	WebElement userMenuSearchTxt;
	
	@FindBy(xpath = ("//span[text()='Users']"))
	WebElement usersMenuOption;
	
	@FindBy(xpath = ("//input[@placeholder='Search for an entry...']"))
	WebElement searchUser;
	
	@FindBy(xpath = ("//*[local-name()='svg' and @data-icon='trash-alt']"))
	WebElement trashIcon;
	
	@FindBy(xpath = ("//span[text()='Yes, confirm']"))
	WebElement yesConfirm;
	
	@FindBy(xpath = ("//p[text()='Deleted']"))
	WebElement deletedPopup;	
	
	
	
	public StrapiPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void enterEmailAddress(String email,WebDriver driver) {
		waitForElementVisibility(emailTxt, "30",driver);	
    	type(emailTxt,email,driver);
	}	

	public void enterPassword(String password,WebDriver driver) {
		waitForElementVisibility(passwordTxt, "30",driver);	
    	type(passwordTxt,password,driver);
	}	
	
	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementVisibility(loginBtn, "30",driver);
		waitForElementClickable(loginBtn,"30",driver);
		click(loginBtn,driver);
	}
	
	public void clickOnUserMenuSearchButton(WebDriver driver) {
		waitForElementVisibility(userMenuSearchBtn, "30",driver);
		waitForElementClickable(userMenuSearchBtn,"30",driver);
		click(userMenuSearchBtn,driver);
	}
	
	public void enterUserMenuSearch(WebDriver driver) {
		waitForElementVisibility(userMenuSearchTxt, "30",driver);	
    	type(userMenuSearchTxt,"Users",driver);
	}
	
	public void clickOnUsersMenuOption(WebDriver driver) {
		waitForElementVisibility(usersMenuOption, "30",driver);
		waitForElementClickable(usersMenuOption,"30",driver);
		click(usersMenuOption,driver);
	}
	
	public void enterSearchUser(String searchUserVal,WebDriver driver) {
		waitForElementVisibility(searchUser, "30",driver);	
    	type(searchUser,searchUserVal,driver);
	}
	
	public boolean verifyTestUserDisplaying(String testName, WebDriver driver) {
		try {
		WebElement element = driver.findElement(By.xpath("(//span[text()='"+testName+"'])[1]"));
		waitForElementVisibility(element, "30",driver);		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnTrashIcon(WebDriver driver) {
		waitForElementVisibility(trashIcon, "30",driver);
		waitForElementClickable(trashIcon,"30",driver);
		click(trashIcon,driver);
	}
	
	public void clickOnYesConfirm(WebDriver driver) {
		waitForElementVisibility(yesConfirm, "30",driver);
		waitForElementClickable(yesConfirm,"30",driver);
		click(yesConfirm,driver);
	}
	
	public boolean verifyDeletedPopupDisplaying(WebDriver driver) {
		try {
		waitForElementVisibility(deletedPopup, "30",driver);		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
