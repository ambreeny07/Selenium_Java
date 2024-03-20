package com.ultimateqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ultimateqa.base.BaseClass;
import com.ultimateqa.utilities.Waits;

public class LoginPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("//a[contains(text(),'Sign In')]"))
	WebElement signInLink;

	@FindBy(xpath = ("//button[contains(text(),'Sign in')]"))
	WebElement signInBtn;

	@FindBy(xpath = ("//h2[contains(text(),'Welcome Back!')]"))
	WebElement loginPageTitle;

	@FindBy(xpath = ("//input[@id='user[email]']"))
	WebElement emailTxt;

	@FindBy(xpath = ("//input[@id='user[password]']"))
	WebElement passwordTxt;

	@FindBy(xpath = ("//p[contains(text(),'Signed in successfully.')]"))
	WebElement signedInSuccessfullyMsgPopup;

	@FindBy(xpath = ("(//button[@aria-controls='header-dropdown-menu'])[2]"))
	WebElement profileDropdown;

	@FindBy(xpath = ("//a[contains(text(),'My Account')]"))
	WebElement myAccountOption;

	@FindBy(xpath = ("//h2[contains(text(),'Edit Profile')]"))
	WebElement profilePage;

	@FindBy(xpath = ("//input[@id='user[email]']"))
	WebElement profileEmailTxt;

	@FindBy(xpath = ("//input[@id='user[first_name]']"))
	WebElement profileFirstNameTxt;

	@FindBy(xpath = ("//input[@id='user[last_name]']"))
	WebElement profileLastNameTxt;

	@FindBy(xpath = ("//label[contains(text(),'Company')]/following-sibling::input"))
	WebElement profileCompanyTxt;

	@FindBy(xpath = ("//label[contains(text(),'Professional Title')]/following-sibling::input"))
	WebElement profileProfessionalTitleTxt;

	@FindBy(xpath = ("//label[contains(text(),'Timezone')]/following-sibling::select"))
	WebElement profileTimezoneDropdown;

	@FindBy(xpath = ("//input[@value='Save Changes']"))
	WebElement saveChangesBtn;

	@FindBy(xpath = ("//p[contains(text(),'Your profile was successfully updated.')]"))
	WebElement yourProfileWasSuccessfullyUpdatedPopupMsgPopup;

	/**
	 * Constructor for the LoginPage class.
	 * 
	 * @param driverParam The WebDriver instance for the LoginPage.
	 */
	public LoginPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	/**
	 * Enters the provided email in the email text field on the login page.
	 * 
	 * @param driver The WebDriver instance.
	 * @param email  The email to be entered.
	 */
	public void enterEmail(WebDriver driver, String email) {
		type(emailTxt, email, driver);
	}

	/**
	 * Enters the provided password in the password text field on the login page.
	 * 
	 * @param driver   The WebDriver instance.
	 * @param password The password to be entered.
	 */
	public void enterPassword(WebDriver driver, String password) {
		type(passwordTxt, password, driver);
	}

	/**
	 * Clicks on the Sign In button on the login page.
	 * 
	 * @param driver The WebDriver instance.
	 */
	public void clickOnSignInButton(WebDriver driver) {
		Waits.wait5s();
		click(signInBtn, driver);
	}

	/**
	 * Clicks on the Sign In Link on the login page.
	 * 
	 * @param driver The WebDriver instance.
	 */
	public void clickOnSignInLink(WebDriver driver) {
		click(signInLink, driver);
	}

	/**
	 * Clicks on the profile dropdown on the login page.
	 * 
	 * @param driver The WebDriver instance.
	 */
	public void clickOnProfileDropdown(WebDriver driver) {
		click(profileDropdown, driver);
	}
	
	/**
	 * Clicks on the Profile Save Changes Button on the login page.
	 * 
	 * @param driver The WebDriver instance.
	 */
	public void clickOnProfileSaveChangesButton(WebDriver driver) {
		click(saveChangesBtn, driver);
	}	

	/**
	 * Clicks on the My Account option in the profile dropdown on the login page.
	 * 
	 * @param driver The WebDriver instance.
	 */
	public void clickOnMyAccountOption(WebDriver driver) {
		click(myAccountOption, driver);
	}

	/**
	 * Checks if the profile page is displaying.
	 * 
	 * @param driver The WebDriver instance.
	 * @return True if the profile page is displaying, false otherwise.
	 */
	public Boolean isProfilePageDisplaying(WebDriver driver) {
		try {
			waitForElementVisibility(profilePage, defaultTimeForVisibility, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Checks if the login page title is displaying.
	 * 
	 * @param driver The WebDriver instance.
	 * @return True if the login page title is displaying, false otherwise.
	 */
	public Boolean isLoginPageTitleDisplaying(WebDriver driver) {
		try {
			waitForElementVisibility(loginPageTitle, defaultTimeForVisibility, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Checks if the signed in Ssuccessfully Message Popup page is displaying.
	 * 
	 * @param driver The WebDriver instance.
	 * @return True if the dashboard page is displaying, false otherwise.
	 */
	public Boolean isSignedInSuccessfullyMsgPopupDisplaying(WebDriver driver) {
		try {
			waitForElementVisibility(signedInSuccessfullyMsgPopup, defaultTimeForVisibility, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Checks if the Your Profile Was Successfully Updated Message Popup is displaying.
	 * 
	 * @param driver The WebDriver instance.
	 * @return True if the dashboard page is displaying, false otherwise.
	 */
	public Boolean isYourProfileWasSuccessfullyUpdatedPopupMsgPopupDisplaying(WebDriver driver) {
		try {
			waitForElementVisibility(yourProfileWasSuccessfullyUpdatedPopupMsgPopup, defaultTimeForVisibility, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	

	/**
	 * Enters the provided email in the profile page.
	 * 
	 * @param driver The WebDriver instance.
	 * @param email  The email to be entered.
	 */
	public void enterProfileEmail(WebDriver driver, String email) {
		type(profileEmailTxt, email, driver);
	}

	/**
	 * Retrieves the text from the profile email element.
	 * 
	 * @param driver The WebDriver instance.
	 * @return The text from the profile email element.
	 */
	public String getProfileEmailText(WebDriver driver) {
		return getInputText(profileEmailTxt,20, driver);
	}

	/**
	 * Retrieves the text from the profile first name element.
	 * 
	 * @param driver The WebDriver instance.
	 * @return The text from the profile first name element.
	 */
	public String getProfileFirstNameText(WebDriver driver) {
		return getInputText(profileFirstNameTxt,20, driver);
	}

	/**
	 * Retrieves the text from the profile last name element.
	 * 
	 * @param driver The WebDriver instance.
	 * @return The text from the profile last name element.
	 */
	public String getProfileLastNameText(WebDriver driver) {
		return getInputText(profileLastNameTxt,20, driver);
	}

	/**
	 * Retrieves the text from the profile company element.
	 * 
	 * @param driver The WebDriver instance.
	 * @return The text from the profile company element.
	 */
	public String getProfileCompanyText(WebDriver driver) {
		return getInputText(profileCompanyTxt,20, driver);
	}

	/**
	 * Retrieves the text from the profile professional title element.
	 * 
	 * @param driver The WebDriver instance.
	 * @return The text from the profile professional title element.
	 */
	public String getProfileProfessionalTitleText(WebDriver driver) {
		return getInputText(profileProfessionalTitleTxt,20, driver);
	}

	/**
	 * Enters the provided first name in the profile page.
	 * 
	 * @param driver    The WebDriver instance.
	 * @param firstName The first name to be entered.
	 */
	public void enterFirstName(WebDriver driver, String firstName) {
		type(profileFirstNameTxt, firstName, driver);
	}

	/**
	 * Enters the provided last name in the profile page.
	 * 
	 * @param driver The WebDriver instance.
	 * @param user   The last name to be entered.
	 */
	public void enterProfileLastName(WebDriver driver, String lastName) {
		type(profileLastNameTxt, lastName, driver);
	}

	/**
	 * Enters the provided company name in the profile page.
	 * 
	 * @param driver    The WebDriver instance.
	 * @param firstName The company name to be entered.
	 */
	public void enterProfileCompany(WebDriver driver, String company) {
		type(profileCompanyTxt, company, driver);
	}

	/**
	 * Enters the provided professional title in the profile page.
	 * 
	 * @param driver    The WebDriver instance.
	 * @param firstName The professional title to be entered.
	 */
	public void enterProfileProfessionalTitle(WebDriver driver, String professionalTitle) {
		type(profileProfessionalTitleTxt, professionalTitle, driver);
	}

}
