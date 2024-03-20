package com.medrep.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateJobDetailPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//img[@src='/icons/icon-collapse-minus.svg'])[1]"))
	WebElement minusIconOnRightYearOfExperiense;
	
	@FindBy(xpath = ("(//img[@src='/icons/icon-collapse-plus.svg'])[1]"))
	WebElement plusIconOnRightYearOfExperiense;
	
	@FindBy(xpath = ("(//img[@src='/icons/icon-collapse-plus.svg'])[2]"))
	WebElement plusIconOnRightAnnualSalary;
	
	@FindBy(xpath = ("(//img[@src='/icons/icon-collapse-minus.svg'])[2]"))
	WebElement minusIconOnRightAnnualSalary;
	
	@FindBy(xpath = "//h1[text()='See how you compare']/../..")
	WebElement seeHowYouCompareSection;
	
	@FindBy(xpath = ("(//p[text()[contains(.,'years')]])[1]"))
	WebElement detialsMentionYearExprenceBelow;
	
	@FindBy(xpath = "//img[@src='/icons/icon-bookmark.svg']")
	WebElement jobSaveBtn;	
	
	@FindBy(xpath = "//span[text()='Saved']")
	WebElement jobSavedBtn;
	
	@FindBy(xpath = ("(//button[contains(text(),'Apply Now')])[1]"))
	WebElement btnApplyNow;
	
	
	
	public CandidateJobDetailPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnMinusIconOnRightYearOfExperiense(WebDriver driver) {
		waitForElementClickable(seeHowYouCompareSection,"30",driver);
		if(isElementDisplayed(minusIconOnRightYearOfExperiense, driver)){
			
		}else {
			click(plusIconOnRightYearOfExperiense,driver);
		}
	}
	
	public void clickOnPlusIconOnRightYearOfExperiense(WebDriver driver) {
		waitForElementClickable(seeHowYouCompareSection,"30",driver);
		if(isElementDisplayed(minusIconOnRightYearOfExperiense, driver)){
			click(minusIconOnRightYearOfExperiense,driver);
		}else {
			click(plusIconOnRightYearOfExperiense,driver);
		}
	}
	
	public void clickOnPlusIconOnRightAnnualSalary(WebDriver driver) {
		waitForElementClickable(seeHowYouCompareSection,"30",driver);
		if(isElementDisplayed(plusIconOnRightYearOfExperiense, driver)){
			click(plusIconOnRightYearOfExperiense,driver);
		}else {
		}
	}
	
	public void clickOnMinusIconOnRightAnnualSalary(WebDriver driver) {
		waitForElementClickable(seeHowYouCompareSection,"30",driver);
			click(minusIconOnRightYearOfExperiense,driver);
	}
	
	public boolean isDetialsMentionYearExprenceBelowDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(detialsMentionYearExprenceBelow, "60", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isDetialsMentionAnnualSalaryBelowDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(minusIconOnRightYearOfExperiense, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickOnPlusIconOnRightEducationLevel(WebDriver driver) {
		waitForElementClickable(seeHowYouCompareSection,"30",driver);
		if(isElementDisplayed(plusIconOnRightAnnualSalary, driver)){
			click(plusIconOnRightAnnualSalary,driver);
		}else {
		}
	}
	
	public boolean isDetialsMentionEducationLevelBelowDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(minusIconOnRightYearOfExperiense, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickOnJobSaveButton(WebDriver driver) {
		waitForElementVisibility(btnApplyNow, "15", driver);
		if(isElementDisplayed(jobSaveBtn, driver)){
			click(jobSaveBtn,driver);
		}else {
			click(jobSavedBtn,driver);
			waitForElementVisibility(jobSaveBtn, "20", driver);
			click(jobSaveBtn,driver);
		}
	}
	
}
