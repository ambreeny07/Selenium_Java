package com.medrep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerLoginPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement  emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//button[contains(text(),'Post Job')])[last()]"))
	WebElement btnPostNewJob;
	
	@FindBy(xpath = "//span[contains(text(),'Wrong email or password')]")
	WebElement errorMessage;
	
	@FindBy(xpath = ("//div[contains(text(),'Please enter password')]"))
	WebElement passwordRequired;
	
	@FindBy(xpath = ("//div[contains(text(),'Required.')]"))
	WebElement emailRequired;
	
	@FindBy(xpath = "//a[contains(text(),'Buy Plan')]")
	WebElement btnBuyPlan;
	
	@FindBy(xpath="(//span[contains(text(),'Account')])[last()]")
	WebElement accountBtn;
	
	public EmployerLoginPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30",driver);
		waitTime(2000,driver);
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
		waitForElementVisibility(btnSubmitLogin, "30",driver);
		waitForElementClickable(btnSubmitLogin,"30",driver);
		click(btnSubmitLogin,driver);
	}
	
	public boolean isEmployerLoginSuccessfully(WebDriver driver){
		waitforPageLoad(30, driver);
	    waitForElementVisibility(btnPostNewJob, "30",driver);
		return isElementDisplayed(btnPostNewJob,driver);
	}
	 
	public boolean isErrorMessageWorngEmailOrPasswordDisplay(WebDriver driver){
	    return isElementDisplayed(errorMessage,driver);
	}
	 
	public String getPasswordIsRequire(WebDriver driver) {
	    return getElementText(passwordRequired,driver);
	}
		
    public String getEamilAddressIsRequire(WebDriver driver) {
	    return  getElementText(emailRequired,driver); 
	}

	public boolean isEmailFieldDisplay(WebDriver driver){
		waitForElementVisibility(emailAddress, "30",driver);
	    return isElementDisplayed(emailAddress,driver);
	}
	
	public boolean isBuyPlanButtonDisplay(WebDriver driver){
		scrollIntoViewSmoothly(btnBuyPlan,driver);
		waitTime(2000,driver);
		waitForElementVisibility(btnBuyPlan, "30",driver);
		return isElementDisplayed(btnBuyPlan,driver);
	}

	public void clickOnAccountBtn(WebDriver driver) {
		waitForElementVisibility(accountBtn,"30",driver);
		waitForElementClickable(accountBtn,"30",driver);
		click(accountBtn,driver);
	}
}
