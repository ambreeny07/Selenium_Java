package com.medrep.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateFooterPage extends BaseClass {
	
	private WebDriver podriver = null;
	
	@FindBy(xpath = ("//p[text()='MEMBERS']/../ul//span[text()='Login']"))
	WebElement membersLoginLink;
	
	@FindBy(xpath = ("//p[text()='MEMBERS']/../ul//span[text()='Membership']"))
	WebElement membersMembershipLink;
	
	@FindBy(xpath = ("//p[text()='MEMBERS']/../ul//a[text()='Search Jobs']"))
	WebElement membersSearchJobsLink;
	
	@FindBy(xpath = ("//p[text()='MEMBERS']/../ul//a[text()='Career Advice']"))
	WebElement membersCareerAdviceLink;
	
	@FindBy(xpath = ("(//a[text()='CAREER ADVICE'])[2]"))
	WebElement careerAdvicePage;
	
	@FindBy(xpath = ("//p[text()='MEMBERS']/../ul//a[text()='Medical Sales Salaries']"))
	WebElement membersMedicalSalesSalariesLink;
	
	@FindBy(xpath = ("(//a[text()='MEDICAL SALES SALARIES'])[2]"))
	WebElement medicalSalesSalariesPage;	
	
	@FindBy(xpath = ("//p[text()='MEMBERS']/../ul//a[text()='FAQ']"))
	WebElement membersFAQLink;
	
	@FindBy(xpath = ("//h1[text()='Frequently Asked Questions']"))
	WebElement frequentlyAskedQuestionsPage;
	
	@FindBy(xpath = ("//p[text()='JOB POSTERS']/../ul//span[text()='Login']"))
	WebElement jobPostersLoginLink;
	
	@FindBy(xpath = ("//p[text()='JOB POSTERS']/../ul//a[text()='Buy Jobs']"))
	WebElement jobPostersbuyJobsLink;
	
	@FindBy(xpath = ("(//a[text()='HIRING WITH MEDREPS'])[2]"))
	WebElement buyJobsPage;
	
	@FindBy(xpath = ("//p[text()='JOB POSTERS']/../ul//a[text()='FAQ']"))
	WebElement jobPostersFAQLink;
	
	@FindBy(xpath = ("//p[text()='ABOUT']/../ul//a[text()='About MedReps']"))
	WebElement aboutAboutMedRepsLinke;
	
	@FindBy(xpath = ("//h1[text()='About MedReps']"))
	WebElement aboutMedRepsPage;
	
	@FindBy(xpath = ("//p[text()='ABOUT']/../ul//a[text()='Manage Email Preferences']"))
	WebElement aboutManageEmailPreferencesLinke;
	
	@FindBy(xpath = ("//h1[text()='Manage Email Preference']"))
	WebElement manageEmailPreferencesPage;
	
	@FindBy(xpath = ("//p[text()='ABOUT']/../ul//a[text()='Contact Us']"))
	WebElement aboutContactUsLinke;
	
	@FindBy(xpath = ("//h1[text()='Contact Us']"))
	WebElement contactUsPage;
	
	@FindBy(xpath = ("//p[text()='ABOUT']/../ul//a[text()='Privacy Policy']"))
	WebElement aboutPrivacyPolicyLinke;
	
	@FindBy(xpath = ("(//h1[text()='Privacy Policy'])[1]"))
	WebElement privacyPolicyPage;
	
	@FindBy(xpath = ("//p[text()='ABOUT']/../ul//a[text()='Terms of Use']"))
	WebElement aboutTermsOfUseLinke;
	
	@FindBy(xpath = ("//p[text()='ABOUT']/../ul//a[text()='Sitemap']"))
	WebElement aboutSitemapLinke;
	
		
	public CandidateFooterPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnMembersLoginLink(WebDriver driver) {
		click(membersLoginLink,driver);
	}

	public void clickOnMembersMembershipLink(WebDriver driver) {
		click(membersMembershipLink,driver);
	}
	
	public void clickOnMembersSearchJobLink(WebDriver driver) {
		click(membersSearchJobsLink,driver);
	}
	
	public void clickOnMembersCareerAdviceLink(WebDriver driver) {
		click(membersCareerAdviceLink,driver);
	}	
	
	public boolean isCareerAdvicePage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(careerAdvicePage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnMembersMedicalSalesSalariesLink(WebDriver driver) {
		click(membersMedicalSalesSalariesLink,driver);
	}
	
	public boolean isMedicalSalesSalariesPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(medicalSalesSalariesPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnMembersFAQLink(WebDriver driver) {
		click(membersFAQLink,driver);
	}
	
	public boolean isFrequentlyAskedQuestionsPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(frequentlyAskedQuestionsPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnJobPostersLoginLink(WebDriver driver) {
		click(jobPostersLoginLink,driver);
	}
	
	public void clickOnJobPostersbuyJobsLink(WebDriver driver) {
		click(jobPostersbuyJobsLink,driver);
	}	
	
	public boolean isBuyJobsPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(buyJobsPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnJobPostersFAQLink(WebDriver driver) {
		click(jobPostersFAQLink,driver);
	}	
	
	public void clickOnAboutAboutMedRepsLinke(WebDriver driver) {
		click(aboutAboutMedRepsLinke,driver);
	}
	
	public boolean isAboutMedRepsPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(aboutMedRepsPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnAboutManageEmailPreferencesLinke(WebDriver driver) {
		click(aboutManageEmailPreferencesLinke,driver);
	}
	
	public boolean isManageEmailPreferencesPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(manageEmailPreferencesPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnAboutContactUsLinke(WebDriver driver) {
		click(aboutContactUsLinke,driver);
	}
	
	public boolean isContactUsPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(contactUsPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnAboutPrivacyPolicyLinke(WebDriver driver) {
		click(aboutPrivacyPolicyLinke,driver);
	}
	
	public boolean isPrivacyPolicyPage(WebDriver driver) {
		boolean status;
		try {
			waitForElementVisibility(privacyPolicyPage, "30",driver);				
			status = true;
		}catch (Exception e) {
			status = false;
		}		
		return status;
	}
	
	public void clickOnAboutTermsOfUseLinke(WebDriver driver) {
		click(aboutTermsOfUseLinke,driver);
	}
	
	public void clickOnAboutSitemapLinke(WebDriver driver) {
		click(aboutSitemapLinke,driver);
	}
	
	public String getUrlOfSitemap(WebDriver driver) {
		
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(tabs2.size()-1));
			
			String URL = driver.getCurrentUrl();
//			Assert.assertEquals(URL, "http://localhost:8080/imdb/homepage" );
//			waitForElementVisibility(privacyPolicyPage, "30",driver);				
			
		return URL;
	}
	
}
