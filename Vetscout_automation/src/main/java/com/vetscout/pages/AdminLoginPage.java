package com.vetscout.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;


public class AdminLoginPage extends BaseClass {

	@FindBy(xpath = ("//img[@alt='header-logo']"))
	WebElement adminHomePageLogo;
	
	@FindBy(xpath = ("//img[@alt='user']"))
	WebElement userProfilIcon;
	
	@FindBy(xpath = ("//span[text()='Logout']"))
	WebElement logoutBtn;
	

	
	public AdminLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isAdminHomePageLogoIconDisplaying() {
		return isElementDisplayed(adminHomePageLogo);
	}
	
	public void clickOnLogoutButton() {
		waitForElementClickable(logoutBtn, "20");
		click(logoutBtn);
	}
	
	public void clickOnUserProfilIcon() {
		waitForElementClickable(userProfilIcon, "20");
		click(userProfilIcon);
	}
	
}
