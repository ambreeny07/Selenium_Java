package com.medrep.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateHiringWithMedrepPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//a[text()='POST JOBS'])[last()]"))
	WebElement postjobsNavigationBtn;
	
	@FindBy(xpath = ("//h1[contains(text(),'Post Jobs')]"))
	WebElement pageHeadingPostANewJob;
	
	@FindBy(xpath = ("//button[text()='Get Monthly Plan']"))
	WebElement getMonthlyPlanBtn;
	
	@FindBy(xpath = ("//button[text()='Next']"))
	WebElement nextBtn;
	
	@FindBy(xpath = ("(//p[contains(text(),'Optimize your recruitment')]/../div/div)[1]"))
	WebElement addOnsCheckbox;
	
	@FindBy(xpath = ("//p[text()='30 Day Single Job Posting']"))
	WebElement monthlyDaySingleJobPostingCheckbox;
	
	@FindBy(xpath = ("//button[text()='Checkout']"))
	WebElement checkoutBtn;
	
	@FindBy(xpath = ("//button[text()='Get Annual Plan']"))
	WebElement getAnnualPlanBtn;
	
	@FindBy(xpath = ("//button[text()='Post now']"))
	WebElement postNowBtn;
	
	@FindBy(xpath = ("//button[text()='Sign Up']"))
	WebElement signUpBtn;
	
	@FindBy(xpath = ("//h1[text()='Frequently Asked Questions']/.."))
	WebElement sectionFAQ;
	
	@FindBy(xpath = ("//input[@name='firstname']"))
	WebElement firstNameTxt;
	
	@FindBy(xpath = ("//input[@name='lastname']"))
	WebElement lastNameTxt;
	
	@FindBy(xpath = ("//input[@name='company']"))
	WebElement companyTxt;	
	
	@FindBy(xpath = ("//input[@name='jobtitle']"))
	WebElement jobTitleTxt;	
	
	@FindBy(xpath = ("//input[@name='phone']"))
	WebElement phoneTxt;
	
	@FindBy(xpath = ("//input[@name='email']"))
	WebElement emailTxt;
	
	@FindBy(xpath = ("//textarea[@name='message']"))
	WebElement messageTxt;
	
	@FindBy(xpath = ("//input[@type='submit']"))
	WebElement submitBtn;
	
	@FindBy(xpath = ("//div[text()='Thanks for submitting the form.']"))
	WebElement thanksForSubmittingTheFormLbl;	
	
	
	public CandidateHiringWithMedrepPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnPostjobsNavigationButton(WebDriver driver) {
		waitForElementClickable(postjobsNavigationBtn, "30", driver);
		click(postjobsNavigationBtn, driver);
	}
	
	public boolean isHiringWithMedrepsPageDisplay(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(pageHeadingPostANewJob, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void clickOnAddOnsCheckbox(WebDriver driver) {
		waitForElementClickable(addOnsCheckbox, "30", driver);
		click(addOnsCheckbox, driver);
	}
	
	public void clickOnNextButton(WebDriver driver) {
		click(nextBtn, driver);
	}
	
	public void clickOnGetMonthlyPlanButton(WebDriver driver) {
		click(getMonthlyPlanBtn, driver);
	}
	
	public void clickOnMonthlyDaySingleJobPostingCheckbox(WebDriver driver) {
		waitForElementClickable(monthlyDaySingleJobPostingCheckbox, "30", driver);
		click(monthlyDaySingleJobPostingCheckbox, driver);
	}
	
	public void clickOnCheckoutButton(WebDriver driver) {
		click(checkoutBtn, driver);
	}
	
	public void clickOnGetAnnualPlanButton(WebDriver driver) {
		click(getAnnualPlanBtn, driver);
	}
	
	public void clickOnPostNowButton(WebDriver driver) {
		click(postNowBtn, driver);
	}
	
	public void clickOnSignUpButton(WebDriver driver) {
		click(signUpBtn, driver);
	}
	
	public boolean isSectionFAQDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(sectionFAQ, driver);
			waitForElementVisibility(sectionFAQ, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}
	
	public void enterFirstName(String firstName, WebDriver driver) {
		driver.switchTo().frame("hs-form-iframe-0");
		scrollIntoViewSmoothly(firstNameTxt, driver);
		waitForElementVisibility(firstNameTxt, "30", driver);
		type(firstNameTxt, firstName, driver);
	}	

	public void enterLastName(String lastName, WebDriver driver) {
		scrollIntoViewSmoothly(lastNameTxt, driver);
		waitForElementVisibility(lastNameTxt, "30", driver);
		type(lastNameTxt, lastName, driver);
	}	

	public void enterCompany(String company, WebDriver driver) {
		scrollIntoViewSmoothly(companyTxt, driver);
		waitForElementVisibility(companyTxt, "30", driver);
		type(companyTxt, company, driver);
	}	

	public void enterJobTitle(String jobTitle, WebDriver driver) {
		scrollIntoViewSmoothly(jobTitleTxt, driver);
		waitForElementVisibility(jobTitleTxt, "30", driver);
		type(jobTitleTxt, jobTitle, driver);
	}	

	public void enterPhone(String phone, WebDriver driver) {
		scrollIntoViewSmoothly(phoneTxt, driver);
		waitForElementVisibility(phoneTxt, "30", driver);
		type(phoneTxt, phone, driver);
	}	

	public void enterEmail(String email, WebDriver driver) {
		scrollIntoViewSmoothly(emailTxt, driver);
		waitForElementVisibility(emailTxt, "30", driver);
		type(emailTxt, email, driver);
	}	

	public void enterMessage(String message, WebDriver driver) {
		scrollIntoViewSmoothly(messageTxt, driver);
		waitForElementVisibility(messageTxt, "30", driver);
		type(messageTxt, message, driver);
	}	

	public void enterSubmit(String submit, WebDriver driver) {
		scrollIntoViewSmoothly(submitBtn, driver);
		waitForElementVisibility(submitBtn, "30", driver);
		type(submitBtn, submit, driver);
	}
	
	public void clickOnSubmitButton(WebDriver driver) {
		click(submitBtn, driver);
	}
	
	public boolean isThanksForSubmittingTheFormLblDisplay(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(thanksForSubmittingTheFormLbl, driver);
			waitForElementVisibility(thanksForSubmittingTheFormLbl, "30", driver);
			return status = true;
		} catch (Exception e) {
			return status = false;
		}
	}	
}
