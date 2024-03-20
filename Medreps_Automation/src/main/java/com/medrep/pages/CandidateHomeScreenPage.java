package com.medrep.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateHomeScreenPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("//a[text()='Home ']"))
	WebElement homeLinkOnDashboad;
	
	@FindBy(xpath = ("(//a[text()='SEARCH JOBS'])[2]"))
	WebElement searchJobsNavigationBtn;
	
	@FindBy(xpath = ("(//a[text()='MEDICAL SALES SALARIES'])[2]"))
	WebElement medicalSalesSalariesNavigationBtn;
	
	@FindBy(xpath = ("(//a[text()='CAREER ADVICE'])[2]"))
	WebElement careerAdviceNavigationBtn;
	
	@FindBy(xpath = ("(//a[text()='POST JOBS'])[2]"))
	WebElement postJobsBtn;
	
	@FindBy(xpath = ("(//div[@class='container mx-auto']/div/h1)[1]"))
	WebElement imageBinnerWithText;
	
	@FindBy(xpath = ("//button[text()='Search']"))
	WebElement searchBtn;
	
	@FindBy(xpath = ("//h1[text()='Hiring now on MedReps']/../div"))
	WebElement hiringNowOnMedRepsTextWithLogos;
	
	@FindBy(xpath = ("//h1[text()='The go-to site for medical sales reps']/../div"))
	WebElement theGoToSiteForMedicalSalesRepsTextWith3Card;
	
	@FindBy(xpath = ("//h1[text()='The go-to site for medical sales reps']/../button[text()='Join Now']"))
	WebElement joinNowBtn;
	
	@FindBy(xpath = ("//div[@style='background-image: url(\"/images/oppertunity-main.webp\");']/../..//button[text()='Search Jobs']"))
	WebElement imageAndSearchJobBtn;
	
	@FindBy(xpath = ("//h1[text()='Become a MedReps member']/../../button[text()='Join Now!']"))
	WebElement becomeAMemberWithJoinNowBtn;
	
	@FindBy(xpath = ("//p[text()[contains(.,'MedReps. All rights reserved.')]]"))
	WebElement copyWriteText;
	
	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;
	
	@FindBy(xpath = ("(//button[contains(text(),'Join Now')])[1]"))
	WebElement btnJoinNow;
	
	@FindBy(xpath = ("//p[text()='Register for a MedReps membership']"))
	WebElement registerForAMedRepsMembershipPopup;
	
	@FindBy(xpath = ("//button[@aria-label='Go to slide 1']"))
	WebElement goToSlideOne;
	
	@FindBy(xpath = ("//button[@aria-label='Go to slide 2']"))
	WebElement goToSlideTwo;
	
	@FindBy(xpath = ("//button[@aria-label='Go to slide 3']"))
	WebElement goToSlideThree;
	
	@FindBy(xpath = ("//button[@aria-label='Go to slide 4']"))
	WebElement goToSlideFour;
	
	@FindBy(xpath = ("(//a[text()='SEARCH JOBS'])[last()]"))
	WebElement searchJobBtnOnPage;
	
	@FindBy(xpath = ("(//a[text()='Read more'])[1]"))
	WebElement articleReadMoreFirst;
	
	@FindBy(xpath = ("(//a[text()='Read more'])[2]"))
	WebElement articleReadMoreSecond;
	
	
	
	public CandidateHomeScreenPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnHomeLink(WebDriver driver) {
		waitForElementClickable(homeLinkOnDashboad,"30",driver);
		click(homeLinkOnDashboad,driver);
	}
		
	public boolean isNavigationBarWithFourOption(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(searchJobsNavigationBtn, "30",driver);
			
			waitForElementVisibility(medicalSalesSalariesNavigationBtn, "30",driver);
			
			waitForElementVisibility(careerAdviceNavigationBtn, "30",driver);
			
			waitForElementVisibility(postJobsBtn, "30",driver);			
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean ishiringNowOnMedRepsTextWithLogos(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(hiringNowOnMedRepsTextWithLogos,driver);
			waitForElementVisibility(hiringNowOnMedRepsTextWithLogos, "30",driver);
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isImageBinnerWithTextAndSearchButton(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(imageBinnerWithText,driver);
			waitForElementVisibility(imageBinnerWithText, "30",driver);			
			waitForElementVisibility(searchBtn, "30",driver);			
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isTheGoToSiteForMedicalSalesRepsTextWith3Card(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(theGoToSiteForMedicalSalesRepsTextWith3Card,driver);
			waitForElementVisibility(theGoToSiteForMedicalSalesRepsTextWith3Card, "30",driver);	
			waitForElementVisibility(joinNowBtn, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isSectionAlongAnImageAndSearchJobsButton(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(imageAndSearchJobBtn,driver);
			waitForElementVisibility(imageAndSearchJobBtn, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isBecomeAnMemberSectionWithJoinNowButton(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(becomeAMemberWithJoinNowBtn,driver);
			waitForElementVisibility(becomeAMemberWithJoinNowBtn, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isCopyrightTextBelowTheFooter(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(copyWriteText,driver);
			waitForElementVisibility(copyWriteText, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isLoginButton(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(btnLogin,driver);
			waitForElementVisibility(btnLogin, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public boolean isJoinNowButton(WebDriver driver) {
		boolean status;
		try {
			scrollIntoViewSmoothly(btnJoinNow,driver);
			waitForElementVisibility(btnJoinNow, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnJoinNowButton(WebDriver driver) {
		waitForElementClickable(btnJoinNow,"30",driver);
		click(btnJoinNow,driver);
	}
	
	public boolean isRegisterForAMedRepsMembershipPopup(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(registerForAMedRepsMembershipPopup, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnSlideJoinNowButton(String count, WebDriver driver) {
		WebElement joinNow = driver
				.findElement(By.xpath("(//button[text()='Join Now'])["+count+"]"));
		joinNow.click();
//		click(joinNow,driver);
	}
	
	public void clickOnGoToSlideOne(WebDriver driver) {
		scrollIntoViewSmoothly(goToSlideOne,driver);
		waitForElementClickable(goToSlideOne,"30",driver);
		click(goToSlideOne,driver);
	}
	
	public void clickOnGoToSlideTwo(WebDriver driver) {
		waitForElementClickable(goToSlideTwo,"30",driver);
		click(goToSlideTwo,driver);
	}
	
	public void clickOnGoToSlideThree(WebDriver driver) {
		waitForElementClickable(goToSlideThree,"30",driver);
		click(goToSlideThree,driver);
	}
	
	public void clickOnGoToSlideFour(WebDriver driver) {
		waitForElementClickable(goToSlideFour,"30",driver);
		click(goToSlideFour,driver);
	}
	
	public void clickOnBecomeAMemberWithJoinNowButton(WebDriver driver) {
		click(becomeAMemberWithJoinNowBtn,driver);
	}
	
	public void clickOnSearchButton(WebDriver driver) {
		waitForElementClickable(searchBtn,"30",driver);
		click(searchBtn,driver);
	}	
	
	public boolean isSearchJobBtnOnPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(searchJobBtnOnPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}	
	
	public void clickOnFirstArticleReadMore(WebDriver driver) {
		click(articleReadMoreFirst,driver);
	}
	
	public void clickOnSecondArticleReadMore(WebDriver driver) {
		click(articleReadMoreSecond,driver);
	}
	
}
