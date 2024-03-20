package com.medrep.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class EmployerNamedUsersPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement  emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;
	
    @FindBy(xpath = ("(//span[contains(text(),'Named Users')])[last()]"))
	WebElement btnNamedUsers;
    
    @FindBy(xpath = ("(//h1[contains(text(),'Named Users')])[1]"))
    WebElement pageHeading;
    
    @FindBy(xpath = ("//th[contains(text(),'Email')]"))
    WebElement tableCellEmail;
    
    @FindBy(xpath = ("//th[contains(text(),'status')]"))
    WebElement tableCellStatus;
    
    @FindBy(xpath = ("//th[contains(text(),'Last login')]"))
    WebElement tableCellLastLogin;
    
    @FindBy(xpath = ("//th[contains(text(),'Added On')]"))
    WebElement tableCellAddedOn;
    
    @FindBy(xpath = ("//th[contains(text(),'Action')]"))
    WebElement tableCellAction;
    
    @FindBy (xpath="//button[contains(text(),'Add User')]")
    WebElement addUserBtn;
    
    @FindBy (xpath="//input[@type='email']")
    WebElement emailFieldOnAddUserPopup;
    
    @FindBy (xpath="//input[@placeholder='Password']")
    WebElement passwordFieldOnAddUserPopup;
    
    @FindBy (xpath="//input[@placeholder='Confirm Password']")
    WebElement confirmPasswordFieldOnAddUserPopup;
    
    @FindBy(xpath="(//button[contains(text(),'Add')])[2]")
    WebElement addBtn;
    
    @FindBy(xpath="(//ul//li[last()-1])[3]")
    WebElement paginationLastTab;
    
    @FindBy(xpath = ("//span[text()='User created'] | //span[text()='User Created Successfully']"))
	WebElement userCreatedMessage;
    
    @FindBy(xpath = "//input[@placeholder='Search Named User']") WebElement searchField;
    
    @FindBy(xpath = "//span[contains(text(),'Sort By')]/../div/..") WebElement sortBtn;

	@FindBy(xpath = "//div[contains(@title,'Email')]") WebElement optionEmail;
	
	@FindBy(xpath = "//p[contains(@class,'ml-2')]")
	List<WebElement> listOfEmails;
	
	@FindBy(xpath = "//div[contains(@title,'Added On')]") WebElement optionAddedOn;
	
	@FindBy(xpath = "//p[contains(@class, 'text-[#00567C]')]")
	List<WebElement> listOfAddedDates;
	
	@FindBy(xpath = "//div[contains(@title,'Last login')]") WebElement optionLastLogin;
	
	@FindBy(xpath = "//p[contains(@class,'text-[#756F63]')]") List<WebElement> listOfLastLogin;
	
	@FindBy(xpath = "(//div/span[text()='Remove User'])[last()]") WebElement removeBtn;

	@FindBy(xpath = "//span[text()='User deleted']") WebElement userDeletedSuccessAlert;
	
	public EmployerNamedUsersPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, defaultWaitTime,driver);
		waitTime(2000);
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
	
    public boolean isEmailFieldDisplay(WebDriver driver){
		waitForElementVisibility(emailAddress, defaultWaitTime,driver);
		return isElementDisplayed(emailAddress,driver);
	}
	 
	public void enterEmailAddress(String email,WebDriver driver) {
		waitForElementVisibility(emailAddress, defaultWaitTime,driver);	
    	type(emailAddress,email,driver);
	}	
	
	public void enterPassword(String pass,WebDriver driver) {
		waitForElementVisibility(password, defaultWaitTime,driver);	
    	type(password,pass,driver);
	}
	
	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementClickable(btnSubmitLogin,"30",driver);
		click(btnSubmitLogin,driver);
	}
	
	public void clickOnNamedUsersButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementClickable(btnNamedUsers,"30",driver);
		click(btnNamedUsers,driver);
	}
	
	public String getPageHeading(WebDriver driver) {
		return getElementText(pageHeading,driver);
	}

	public boolean isPageHeadingDisplay(WebDriver driver){
		return isElementDisplayed(pageHeading,driver);
	}
	
	public boolean isTableCellEmailDisplay(WebDriver driver){
		return isElementDisplayed(tableCellEmail,driver);
	}
	
	public boolean isTableCellStatusDisplay(WebDriver driver){
		return isElementDisplayed(tableCellStatus,driver);
	}
	
	public boolean isTableCellLastLoginDisplay(WebDriver driver){
		return isElementDisplayed(tableCellLastLogin,driver);
	}
	
	public boolean isTableCellAddedOnDisplay(WebDriver driver){
		return isElementDisplayed(tableCellAddedOn,driver);
	}
	
	public boolean isTableCellActionDisplay(WebDriver driver){
		return isElementDisplayed(tableCellAction,driver);
	}

	public void clickAddUserBtn(WebDriver driver) {
		waitForElementClickable(addUserBtn,"60",driver);
		click(addUserBtn,driver);
	}
	
	public boolean verifyAddUserPopUpDisplaying(WebDriver driver) {
		return isElementDisplayed(emailFieldOnAddUserPopup,driver);
	}
	
	public void enterEmail(String val, WebDriver driver) {
		type(emailFieldOnAddUserPopup, val, driver);
	}
	
	public void enterPasswordOnAddUser( WebDriver driver) {
		type(passwordFieldOnAddUserPopup, "Test1234", driver);
	}
	
	public void enterConfirmPassword( WebDriver driver) {
		type(confirmPasswordFieldOnAddUserPopup, "Test1234", driver);
	}
	
	public void clickAddBtn(WebDriver driver) {
		waitForElementClickable(addBtn,"30",driver);
		clickUsingJavascriptExecutor(addBtn,driver);
	}
	
	public boolean verifyNewUserDisplaying(String email, WebDriver driver) {
		//click(paginationLastTab,driver);
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'"+email+"')]"));
		return isElementDisplayed(element,driver);
	}
	
	public boolean verifyUserCreatedMessageDisplaying(WebDriver driver) {
		try {
			waitForElementVisibility(userCreatedMessage, defaultTimeForVisibility, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public void enterValueInSearchField(String email,WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementVisibility(searchField,"30",driver);
		type(searchField,email,driver);
	}
	
	public void enterEmailInAddUserPopup(WebDriver driver){
		waitForElementVisibility(emailFieldOnAddUserPopup, "30",driver);
		type(emailFieldOnAddUserPopup, "test1234@gmail.com",driver);
	}
	
	public void clickOnAddUserButton(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(addUserBtn,"30",driver);
		click(addUserBtn,driver);
	}
	
	public void clickOnSortButton(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(sortBtn,"30",driver);
		click(sortBtn,driver);
	}
	
	public void selectOptionEmail(WebDriver driver) {
		waitForElementClickable(optionEmail,"30",driver);
		click(optionEmail,driver);
	}
	
	public ArrayList<String> getNamedEmails(WebDriver driver) {
		int i =listOfEmails.size();
		ArrayList<String> email = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement emails = driver.findElement(By.xpath("//p[contains(@class,'ml-2')]"));
			email.add(getElementText(emails,driver).toLowerCase());
		}
		return email;
	}
	
	public void selectOptionAddedOn(WebDriver driver) {
		waitForElementClickable(optionAddedOn,"30",driver);
		click(optionAddedOn,driver);
	}
	
	public ArrayList<String> getNamedAddedDates(WebDriver driver) {
		int i =listOfAddedDates.size();
		ArrayList<String> addedDate = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement addedDates = driver.findElement(By.xpath("//p[contains(@class, 'text-[#00567C]')]"));
			addedDate.add(getElementText(addedDates,driver).toLowerCase());
		}
		return addedDate;
	}
	
	public void selectOptionLastLogin(WebDriver driver) {
		waitForElementClickable(optionLastLogin,"30",driver);
		click(optionLastLogin,driver);
	}
	
	public ArrayList<String> getNamedLastLogin(WebDriver driver) {
		int i =listOfLastLogin.size();
		ArrayList<String> lastLogin = new ArrayList<String>();
		for(int a=1; a<=i;a++) {
			WebElement lastLogins = driver.findElement(By.xpath("//p[contains(@class,'text-[#756F63]')]"));
			lastLogin.add(getElementText(lastLogins,driver).toLowerCase());
		}
		return lastLogin;
	}
	
	public void clickOnRemoveUserButton(WebDriver driver){
		waitforPageLoad(30, driver);
		waitForElementClickable(removeBtn,"30",driver);
		click(removeBtn,driver);
	}

	public boolean verifyUserRemovedSuccessfully(WebDriver driver){

		waitForElementVisibility(userDeletedSuccessAlert,"30",driver);
		return userDeletedSuccessAlert.isDisplayed();
	}
}
