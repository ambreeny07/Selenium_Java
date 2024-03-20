package com.vetscout.pages;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;

import com.vetscout.errorCollectors.ErrorCollector;

import com.vetscout.utilities.Waits;

public class AddProductsPage extends BaseClass{

	@FindBy(xpath = ("(//div//a[@href='/cart'])[1]"))
	WebElement addToCartIcon;
	
	@FindBy(xpath = ("(//div[contains(@class,'iron-logout-wrap')])[1]"))
	WebElement logoutIcon;
			
	@FindBy(xpath = ("//a[@name='Logout']"))
	WebElement logoutDropDownOption;
	
	public AddProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCartIcon() {
		waitForElementClickable(addToCartIcon, "20");
		click(addToCartIcon);
	}	
	public void clickOnLogoutIcon() {
		waitForElementClickable(logoutIcon, "20");
		click(logoutIcon);
	}	
	public void clickOnLogoutDropDownOption() {
		waitForElementClickable(logoutDropDownOption, "20");
		click(logoutDropDownOption);
	}	
	
}
