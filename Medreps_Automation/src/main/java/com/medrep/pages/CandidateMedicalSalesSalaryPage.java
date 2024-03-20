package com.medrep.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateMedicalSalesSalaryPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//a[text()='MEDICAL SALES SALARIES'])[last()]"))
	WebElement medicalSalesSalariesNavigationBar;
	
	@FindBy(xpath = ("//h1[contains(text(),'HOW MUCH')]"))
	WebElement medicalSalesSalariesPage;
	
	@FindBy(xpath = ("//span[text()='Market']"))
	WebElement marketLink;
	
	@FindBy(xpath = ("//span[text()='Job title']"))
	WebElement JobTitleLink;
	
	@FindBy(xpath = ("//span[text()='Company size']"))
	WebElement companySizeLink;
	
	@FindBy(xpath = ("//span[text()='Age & experience']"))
	WebElement ageAndExperienceLink;
	
	@FindBy(xpath = ("//span[text()='Region']"))
	WebElement regionLink;
	
	@FindBy(xpath = ("(//p[text()='Biotech Sales Salary Report'])[last()]"))
	WebElement biotechSalesSalaryReportLink;
	
	@FindBy(xpath = ("(//p[text()='Surgical Sales Salary Report'])[last()]"))
	WebElement surgicalSalesSalaryReportLink;
	
	@FindBy(xpath = ("(//p[text()='Medical Device Sales Salary Report'])[last()]"))
	WebElement medicalDeviceSalesSalaryReportLink;
	
	@FindBy(xpath = ("(//p[text()='Medical Equipment Sales Salary Report'])[last()]"))
	WebElement medicalEquipmentSalesSalaryReportLink;
	
	@FindBy(xpath = ("(//p[text()='Pharmaceutical Sales Salary Report'])[last()]"))
	WebElement pharmaceuticalSalesSalaryReportLink;
	
	@FindBy(xpath = ("(//p[text()='Medical Sales Salary Report'])[last()]"))
	WebElement medicalSalesSalaryReportLink;
	
	@FindBy(xpath = ("//h1[text()='Biotech Sales Salary Information']"))
	WebElement biotechSalesSalaryReportPage;
	
	
	public CandidateMedicalSalesSalaryPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public boolean isMarketLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(marketLink, driver);
			waitForElementVisibility(marketLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	
	public boolean isJobTitleLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(JobTitleLink, driver);
			waitForElementVisibility(JobTitleLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public boolean isCompanySizeLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(companySizeLink, driver);
			waitForElementVisibility(companySizeLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isAgeAndExperienceLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(ageAndExperienceLink, driver);
			waitForElementVisibility(ageAndExperienceLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public boolean isRegionLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(regionLink, driver);
			waitForElementVisibility(regionLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isBiotechSalesSalaryReportLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(biotechSalesSalaryReportLink, driver);
			waitForElementVisibility(biotechSalesSalaryReportLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public boolean isSurgicalSalesSalaryReportLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(surgicalSalesSalaryReportLink, driver);
			waitForElementVisibility(surgicalSalesSalaryReportLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public boolean isMedicalDeviceSalesSalaryReportLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(medicalDeviceSalesSalaryReportLink, driver);
			waitForElementVisibility(medicalDeviceSalesSalaryReportLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public boolean isMedicalEquipmentSalesSalaryReportLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(medicalEquipmentSalesSalaryReportLink, driver);
			waitForElementVisibility(medicalEquipmentSalesSalaryReportLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	public boolean isPharmaceuticalSalesSalaryReportLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(pharmaceuticalSalesSalaryReportLink, driver);
			waitForElementVisibility(pharmaceuticalSalesSalaryReportLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public boolean isMedicalSalesSalaryReportLinkDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(medicalSalesSalaryReportLink, driver);
			waitForElementVisibility(medicalSalesSalaryReportLink, "5", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	
	public void clickOnBiotechSalesSalaryReportLink(WebDriver driver) {
		scrollIntoViewSmoothly(biotechSalesSalaryReportLink, driver);
		waitForElementClickable(biotechSalesSalaryReportLink,"30",driver);
		click(biotechSalesSalaryReportLink,driver);
		
	}
	
	public boolean isBiotechSalesSalaryReportPageDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(biotechSalesSalaryReportPage, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickOnMedicalSalesSalariesNavigationBar(WebDriver driver) {
		waitForElementClickable(medicalSalesSalariesNavigationBar,"30",driver);
		click(medicalSalesSalariesNavigationBar,driver);
	}

	public boolean isMedicalSalesSalariesPageDisplay(WebDriver driver) {
		boolean status;
		try {
			waitTime(4000, driver);
			waitForElementVisibility(medicalSalesSalariesPage, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	
	
}
