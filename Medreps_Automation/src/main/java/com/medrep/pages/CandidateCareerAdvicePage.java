package com.medrep.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateCareerAdvicePage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
	WebElement medrepLogo;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[contains(@type,'email')]"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[contains(@type,'password')]"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//li//a[contains(text(),'CAREER ADVICE')])[last()]"))
	WebElement btnCareerAdvice;

	@FindBy(xpath = ("//button[contains(text(),'Breaking into medical sales')]"))
	WebElement btnBreakingIntoMedicalSales;

	@FindBy(xpath = ("(//div[contains(@class,'w-full')]//h5)[1]"))
	WebElement firstBlog;

	@FindBy(xpath = ("//div[@class='w-full']//h1"))
	WebElement blogPageHeading;

	@FindBy(xpath = ("//input[@placeholder='Search']"))
	WebElement searchInputField;

	@FindBy(xpath = ("//div[contains(@class,'w-full min-h')]"))
	List<WebElement> listOfBlog;

	@FindBy(xpath = ("//button[contains(text(),'View More')]"))
	WebElement btnViewMore;

	@FindBy(xpath = "//button[contains(text(),'Job search')]")
	WebElement jobSearchBtn;

	@FindBy(xpath = "//button[contains(text(),'Insider')]")
	WebElement insiderBtn;

	@FindBy(xpath = "//button[contains(text(),'Breaking into medical sales')]")
	WebElement BreakingIntoMedicalSalesBtn;

	@FindBy(xpath = ("(//div[@class='flex items-center']/span)[last()]"))
	WebElement profileBtn;

	@FindBy(xpath = ("//span[contains(text(), 'Logout')]"))
	WebElement logoutBtn;

	@FindBy(xpath = "//button[contains(text(),'Sales advice')]")
	WebElement salesAdviceBtn;

	@FindBy(xpath = "//button[text()='Breaking into medical sales']")
	WebElement breakingIntoMedicalSalesTab;
	
	@FindBy(xpath = "//button[text()='Job search']")
	WebElement jobSearchTab;
	
	@FindBy(xpath = "//button[text()='Insider']")
	WebElement insiderTab;
	
	@FindBy(xpath = "//button[text()='Sales advice']")
	WebElement salesAdviceTab;
	
	@FindBy(xpath = "//button[text()='All']")
	WebElement allTab;
	
	@FindBy(xpath = "(//div[@class='career-advice-scroll w-full'])[1]")
	WebElement pageLoaded;
	
	@FindBy(xpath = "//h1[text()='Most Popular']/../div")
	WebElement mostPopularBlogs;
	
	@FindBy(xpath = "//input[@inputmode='email']")
	WebElement emailSubscribeTxt;
	
	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement emailSubscribeBtn;
	
	@FindBy(xpath = "//div[@class='ant-message-notice-content']")
	WebElement subscribtionSuccessMsg;
	
	@FindBy(xpath = "(//button[text()='Join Now!'])[1]")
	WebElement joinNowBtn;
	
	@FindBy(xpath = "(//button[text()='Join Now!'])[1]/../../../..")
	WebElement joinNowBinner;
	
	@FindBy(xpath = "//div[@class='flex flex-col items-center cursor-pointer']")
	WebElement downloadIcon;
	
	@FindBy(xpath = "//div[contains(@class,'flex flex-col items-center cursor-pointer ml-')]/button")
	WebElement saveIcon;
	
	@FindBy(xpath = "//span[text()='Link copied to clipboard.']")
	WebElement linkCopiedToClipboardPopup;
	
	@FindBy(xpath = "//div[@id='downloadDiv']")
	WebElement fullArtical;
	
	@FindBy(xpath = "(//img[@alt='Medreps Logo']/..)[last()]")
	WebElement medrepsLogo;	
	
	
	public CandidateCareerAdvicePage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public boolean isMedrepLogoDisplay(WebDriver driver) {
		waitForElementVisibility(medrepLogo, "30", driver);
		return isElementDisplayed(medrepLogo, driver);
	}
	
	public void Logout(WebDriver driverParam) {
//		waitForElementClickable(profileBtn, "30", driver);
//		waitTime(2000);
//		System.out.println(profileBtn);
//		clickUsingJavascriptExecutor(profileBtn, driver);
		
		try {
			click(profileBtn, driverParam);
		}catch (Exception e) {
			try {
				clickUsingJavascriptExecutor(profileBtn, driverParam);
			}catch (Exception ex) {
				clickUsingActionClass(profileBtn, driverParam);
			}
			
		}
		try {
			click(logoutBtn, driverParam);
		}catch (Exception e) {
			try {
				clickUsingJavascriptExecutor(logoutBtn, driverParam);
			}catch (Exception ex) {
				clickUsingActionClass(logoutBtn, driverParam);
			}
			
		}
	}

	public boolean verifyOnLoginButton(WebDriver driver) {
		waitTime(2000);
		return isElementDisplayed(btnLogin, driver);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(btnLogin, "30", driver);
		waitForElementClickable(btnLogin, "30", driver);
		waitTime(2000);
		click(btnLogin, driver);
		try {
			waitForElementVisibility(btnLogin, "30", driver);
			waitForElementClickable(btnLogin, "30", driver);
			waitTime(2000);
			click(btnLogin, driver);
		} catch (Exception e) {

		}
	}

	public boolean isEmailFieldDisplay(WebDriver driver) {
		waitTime(1000, driver);
		waitForElementVisibility(emailAddress, "30", driver);
		return isElementDisplayed(emailAddress, driver);
	}

	public void enterEmailAddress(String email, WebDriver driver) {
		waitForElementVisibility(emailAddress, "30", driver);
		type(emailAddress, email, driver);
	}

	public void enterPassword(String pass, WebDriver driver) {
		waitForElementVisibility(password, "30", driver);
		type(password, pass, driver);
	}

	public void clickOnSubmitLoginButton(WebDriver driver) {
		waitForElementVisibility(btnSubmitLogin, "30", driver);
		waitForElementClickable(btnSubmitLogin, "30", driver);
		click(btnSubmitLogin, driver);
	}

	public void clickOnCareerAdviceButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitTime(2000);
		waitForElementVisibility(btnCareerAdvice, "30", driver);
		waitForElementClickable(btnCareerAdvice, "30", driver);
		waitTime(2000);
		click(btnCareerAdvice, driver);
		waitforPageLoad(30, driver);
	}

	public boolean isBreakingIntoMedicalSalesButtonDisplay(WebDriver driver) {
		return isElementDisplayed(btnBreakingIntoMedicalSales, driver);
	}

	public String getHeadingOfFirstBlog(WebDriver driver) {
		return getElementText(firstBlog, driver);
	}

	public void clickOnBlog(WebDriver driver) {
//		waitForElementClickable(firstBlog, "30", driver);
		click(firstBlog, driver);
	}

	public String getBlogPageHeading(WebDriver driver) {
		scrollIntoViewSmoothly(blogPageHeading, driver);
		waitTime(2000);
		return getElementText(blogPageHeading, driver);
	}

	public void enterSearch(String search, WebDriver driver) {
		scrollIntoViewSmoothly(searchInputField, driver);
		waitTime(2000);
		waitForElementVisibility(searchInputField, "30", driver);
		type(searchInputField, search, driver);
	}

	public int getListOfBlog(WebDriver driver) {
		return listOfBlog.size();
	}

	public void clickOnViewMoreButton(WebDriver driver) {
		scrollIntoViewSmoothly(btnViewMore, driver);
		waitForElementClickable(btnViewMore, "30", driver);
		waitTime(2000);
		click(btnViewMore, driver);
	}

	public void clickJobSearchBtn(WebDriver driver) {
		scrollIntoViewSmoothly(jobSearchBtn, driver);
		waitForElementClickable(jobSearchBtn, "30", driver);
		waitTime(2000);
		click(jobSearchBtn, driver);
	}

	public void clickInsiderBtn(WebDriver driver) {
		scrollIntoViewSmoothly(insiderBtn, driver);
		waitForElementClickable(insiderBtn, "30", driver);
		waitTime(2000);
		click(insiderBtn, driver);
	}

	public void clickBreakingIntoMedicalSalesBtn(WebDriver driver) {
		scrollIntoViewSmoothly(BreakingIntoMedicalSalesBtn, driver);
		waitForElementClickable(BreakingIntoMedicalSalesBtn, "30", driver);
		waitTime(2000);
		click(BreakingIntoMedicalSalesBtn, driver);
	}

	public void clickSalesAdviceBtn(WebDriver driver) {
		scrollIntoViewSmoothly(salesAdviceBtn, driver);
		waitForElementClickable(salesAdviceBtn, "30", driver);
		waitTime(2000);
		click(salesAdviceBtn, driver);
	}
	
	public void clickBreakingIntoMedicalSalesTab(WebDriver driver) {
		scrollIntoViewSmoothly(breakingIntoMedicalSalesTab, driver);
		waitForElementClickable(breakingIntoMedicalSalesTab, "30", driver);
		click(breakingIntoMedicalSalesTab, driver);
	}
	
	public void clickJobSearchTab(WebDriver driver) {
		scrollIntoViewSmoothly(jobSearchTab, driver);
		waitForElementClickable(jobSearchTab, "30", driver);
		click(jobSearchTab, driver);
	}
	
	public void clickInsiderTab(WebDriver driver) {
		scrollIntoViewSmoothly(insiderTab, driver);
		waitForElementClickable(insiderTab, "30", driver);
		click(insiderTab, driver);
	}
	
	public void clickSalesAdviceTab(WebDriver driver) {
		scrollIntoViewSmoothly(salesAdviceTab, driver);
		waitForElementClickable(salesAdviceTab, "30", driver);
		click(salesAdviceTab, driver);
	}
	
	public void clickAllTab(WebDriver driver) {
		scrollIntoViewSmoothly(allTab, driver);
		waitForElementClickable(allTab, "30", driver);
		click(allTab, driver);
	}
	
	public boolean isTabPageDisplay(WebDriver driver) {
		waitTime(1000, driver);
		waitForElementVisibility(pageLoaded, "30", driver);
		return isElementDisplayed(pageLoaded, driver);
	}
	
	public boolean isMostPopularBlogsDisplay(WebDriver driver) {
		waitForElementVisibility(medrepLogo, "30", driver);		
		scrollIntoViewSmoothly(mostPopularBlogs, driver);
		waitForElementVisibility(mostPopularBlogs, "30", driver);
		return isElementDisplayed(mostPopularBlogs, driver);
	}
	
	public void enterEmailSubscribe(String email, WebDriver driver) {
		driver.switchTo().frame("hs-form-iframe-0");
		scrollIntoViewSmoothly(emailSubscribeTxt, driver);
		waitForElementVisibility(emailSubscribeTxt, "30", driver);
		type(emailSubscribeTxt, email, driver);
	}
	
	public void clickEmailSubscribeButton(WebDriver driver) {
		scrollIntoViewSmoothly(emailSubscribeBtn, driver);
		waitForElementClickable(emailSubscribeBtn, "30", driver);
		click(emailSubscribeBtn, driver);
	}
	
	public boolean isSubScribtionSuccessMessageDisplay(WebDriver driver) {
		waitForElementVisibility(subscribtionSuccessMsg, "30", driver);
		return isElementDisplayed(subscribtionSuccessMsg, driver);
	}
	
	public boolean isJoinNowButtonDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(joinNowBtn, driver);
		waitForElementVisibility(joinNowBtn, "30", driver);
		return isElementDisplayed(joinNowBtn, driver);
	}
	
	public boolean isJoinNowBinnerDisplay(WebDriver driver) {
		waitTime(1000, driver);
		scrollIntoViewSmoothly(joinNowBinner, driver);
		waitForElementVisibility(joinNowBinner, "30", driver);
		return isElementDisplayed(joinNowBinner, driver);
	}
	
	public void clickDownloadIcon(WebDriver driver) {
		scrollIntoViewSmoothly(downloadIcon, driver);
		waitForElementClickable(downloadIcon, "30", driver);
		click(downloadIcon, driver);
	}
	
	public void clickSaveIcon(WebDriver driver) {
		scrollIntoViewSmoothly(saveIcon, driver);
		waitForElementClickable(saveIcon, "30", driver);
		click(saveIcon, driver);
	}
	
	public boolean isLinkCopiedToClipboardPopupDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(linkCopiedToClipboardPopup, driver);
		waitForElementVisibility(linkCopiedToClipboardPopup, "30", driver);
		return isElementDisplayed(linkCopiedToClipboardPopup, driver);
	}
	
	public boolean isFullArticalDisplay(WebDriver driver) {
		scrollIntoViewSmoothly(fullArtical, driver);
		waitForElementVisibility(fullArtical, "30", driver);
		return isElementDisplayed(fullArtical, driver);
	}

	public void clickMedrepsLogo(WebDriver driver) {
		waitForElementClickable(medrepsLogo, "30", driver);
		click(medrepsLogo, driver);
	}
	

}
