package com.medrep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medrep.base.BaseClass;

public class CandidateSalaryInfoPage extends BaseClass {

	private WebDriver podriver = null;

	@FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
	WebElement medrepLogo;

	@FindBy(xpath = ("(//span[contains(text(),'Login')])[1]"))
	WebElement btnLogin;

	@FindBy(xpath = ("//input[@id='candidate-form_username']"))
	WebElement emailAddress;

	@FindBy(xpath = ("//input[@id='candidate-form_password']"))
	WebElement password;

	@FindBy(xpath = ("(//button[@type='submit'])[last()]"))
	WebElement btnSubmitLogin;

	@FindBy(xpath = ("(//a[contains(text(),'MEDICAL SALES SALARIES')])[last()]"))
	WebElement btnSalaryInfo;

	@FindBy(xpath = ("//h1[contains(text(),'HOW MUCH DO MEDICAL SALES REPS EARN?')]"))
	WebElement labelSalaryInformation;

	@FindBy(xpath = ("//p[contains(text(),'Biotech Sales Salary Report')]"))
	WebElement linkBioSalesSalaryReport;

	@FindBy(xpath = ("//h1[contains(text(),'Biotech Sales Salary Information')]"))
	WebElement headingBioSalesSalaryInformation;

	@FindBy(xpath = ("//h1[contains(text(),'EARN')]"))
	WebElement mainHeadingSalaryInfoPage;

	@FindBy(xpath = ("//p[contains(text(),'Surgical Sales Salary Report')]"))
	WebElement linkSurgicalSalesSalaryReport;

	@FindBy(xpath = ("//h1[contains(text(),'Surgical Sales Salary Information')]"))
	WebElement headingSurgicalSalesSalaryInformation;

	@FindBy(xpath = ("//p[contains(text(),'Medical Device Sales Salary Report')]"))
	WebElement linkMedicalDeviceSalesSalaryReport;

	@FindBy(xpath = ("//h1[contains(text(),'Medical Device Sales Salary Information')]"))
	WebElement headingMedicalDeviceSalesSalaryInformation;

	@FindBy(xpath = ("//p[contains(text(),'Medical Equipment Sales Salary Report')]"))
	WebElement linkMedicalEquipmentSalesSalaryReport;

	@FindBy(xpath = ("//h1[contains(text(),'Medical Equipment Sales Salary Information')]"))
	WebElement headingMedicalEquipmentSalesSalaryInformation;

	@FindBy(xpath = ("//p[contains(text(),'Pharmaceutical Sales Salary Report')]"))
	WebElement linkPharmaceuticalSalesSalaryReport;

	@FindBy(xpath = ("//h1[contains(text(),'Pharmaceutical Sales Salary Information')]"))
	WebElement headingPharmaceuticalSalesSalaryInformation;

	@FindBy(xpath = ("//p[contains(text(),'Medical Sales Salary Report')]"))
	WebElement linkMedicalSalesSalaryReport;

	@FindBy(xpath = ("//h1[contains(text(),'HOW MUCH DO MEDICAL SALES REPS EARN?')]"))
	WebElement headingHowMuchDoMedicalSalesRepsEarn;

	@FindBy(xpath = ("//li//a[contains(text(),'Search Jobs')]"))
	WebElement linkSearchJobs;

	@FindBy(xpath = ("//li//span[contains(text(),'Search Jobs')]"))
	WebElement labelSearchJobs;

	@FindBy(xpath = ("//li//a[contains(text(),'Career Advice')]"))
	WebElement linkCareerAdvice;

	@FindBy(xpath = ("//button[contains(text(),'Breaking into medical sales')]"))
	WebElement btnBreakingIntoMedicalSales;

	@FindBy(xpath = ("//li//a[contains(text(),'Salary Information')]"))
	WebElement linkSalaryInformation;

	@FindBy(xpath = ("(//li//a[contains(text(),'FAQ')])[1]"))
	WebElement linkFAQ;

	@FindBy(xpath = ("//h1[contains(text(),'Frequently Asked Questions')]"))
	WebElement headingFrequentlyAskedQuestions;

	@FindBy(xpath = ("(//li//a[contains(text(),'FAQ')])[2]"))
	WebElement linkJobPostersFAQ;

	@FindBy(xpath = ("//li//a[contains(text(),'About MedReps')]"))
	WebElement linkAboutMedrep;

	@FindBy(xpath = ("//li//a[contains(text(),'Contact Us')]"))
	WebElement linkContactUs;

	@FindBy(xpath = ("//li//a[contains(text(),'Privacy Policy')]"))
	WebElement linkPrivacyPolicy;

	@FindBy(xpath = ("//li//a[contains(text(),'Terms of Use')]"))
	WebElement linkTermsOfUse;

	@FindBy(xpath = ("//h1[contains(text(),'About MedReps')]"))
	WebElement headingAboutMedrep;

	@FindBy(xpath = ("//h1[contains(text(),'Contact Us')]"))
	WebElement headingContactUsPage;

	@FindBy(xpath = ("//h1[contains(text(),'Privacy Policy')]"))
	WebElement headingPrivacyPolicyPage;

	@FindBy(xpath = ("//h1[contains(text(),'Privacy Policy')]"))
	WebElement headingTermsOfUsePage;

	@FindBy(xpath = "//span[text()='Market']")
	WebElement marketBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Market']")
	WebElement marketText;

	@FindBy(xpath = "//span[text()='Job title']")
	WebElement jobTitleBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Job title']")
	WebElement jobTitleText;

	@FindBy(xpath = "//span[text()='Company size']")
	WebElement companySizeBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Company size']")
	WebElement companySizeText;

	@FindBy(xpath = "(//span[text()='Age & experience'])[last()]")
	WebElement ageBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Age & experience']")
	WebElement ageAndExperieceText;

	@FindBy(xpath = "//span[text()='Experience']")
	WebElement experienceBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Region']")
	WebElement regionText;

	@FindBy(xpath = "//span[text()='Region']")
	WebElement regionBtnOnSalaryInfoPage;

	@FindBy(xpath = "(//p[text()='Biotech Sales Salary Report'])[1]")
	WebElement biotechSalesSalaryReportBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Biotech Sales Salary Information']")
	WebElement biotechSalesSalaryReportText;

	@FindBy(xpath = "//a[text()='Write for Us']")
	WebElement writeForUsBtnOnSalaryInfoPage;

	@FindBy(xpath = "//h1[text()='Contact Us']")
	WebElement contactUsText;

	@FindBy(xpath = "//a[contains(text(),'Sitemap')]")
	WebElement sitemapBtn;

	@FindBy(xpath = ("(//div[@class='flex items-center']/span)[last()]"))
	WebElement profileBtn;

	@FindBy(xpath = ("//span[contains(text(), 'Logout')]"))
	WebElement logoutBtn;

	@FindBy(xpath = "//a[contains(text(),'Buy Jobs')]")
	WebElement buyJobsBtnOnSalaryInfo;

	@FindBy(xpath = "//h1[contains(text(),'Choose your job posting plan')]")
	WebElement chooseYourJobPostingPlanLabel;

	public CandidateSalaryInfoPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public boolean isMedrepLogoDisplay(WebDriver driver) {
		waitForElementVisibility(medrepLogo, "30", driver);
		return isElementDisplayed(medrepLogo, driver);
	}

	public boolean verifyOnLoginButton(WebDriver driver) {
		waitTime(2000);
		return isElementDisplayed(btnLogin, driver);
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitTime(2000, driver);
		waitForElementVisibility(btnLogin, "30", driver);
		waitForElementClickable(btnLogin, "30", driver);
		click(btnLogin, driver);
		try {
			waitForElementVisibility(btnLogin, "30", driver);
			waitForElementClickable(btnLogin, "30", driver);
			waitTime(5000);
			click(btnLogin, driver);
		} catch (Exception e) {

		}
	}

	public void Logout(WebDriver driverParam) {
		System.out.println(profileBtn);

		try {
			click(profileBtn, driverParam);
		} catch (Exception e) {
			try {
				clickUsingJavascriptExecutor(profileBtn, driverParam);
			} catch (Exception ex) {
				clickUsingActionClass(profileBtn, driverParam);
			}

		}
		try {
			click(logoutBtn, driverParam);
		} catch (Exception e) {
			try {
				clickUsingJavascriptExecutor(logoutBtn, driverParam);
			} catch (Exception ex) {
				clickUsingActionClass(logoutBtn, driverParam);
			}

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

	public void clickOnSalaryInfoButton(WebDriver driver) {
		waitforPageLoad(30, driver);
		waitForElementVisibility(btnSalaryInfo, "30", driver);
		waitForElementClickable(btnSalaryInfo, "30", driver);
		waitTime(5000, driver);
		click(btnSalaryInfo, driver);
	}

	public boolean isSalaryInformationLabelDisplay(WebDriver driver) {
		waitForElementVisibility(labelSalaryInformation, "30", driver);
		return isElementDisplayed(labelSalaryInformation, driver);
	}

	public void clickOnBioSalesSalaryReportLink(WebDriver driver) {
		waitforPageLoad(30, driver);
		scrollIntoViewSmoothly(linkBioSalesSalaryReport, driver);
		waitForElementClickable(linkBioSalesSalaryReport, "30", driver);
		waitTime(2000);
		click(linkBioSalesSalaryReport, driver);
	}

	public void clickBuyJobsBtnOnSalaryInfo(WebDriver driver) {
		scrollIntoViewSmoothly(buyJobsBtnOnSalaryInfo, driver);
		waitForElementClickable(buyJobsBtnOnSalaryInfo, "30", driver);
		waitTime(2000);
		click(buyJobsBtnOnSalaryInfo, driver);
	}

	public boolean isBioSalesSalaryInformationHeading(WebDriver driver) {
		return isElementDisplayed(headingBioSalesSalaryInformation, driver);
	}

	public boolean isMainHeadingSalaryInfoPageDisplaying(WebDriver driver) {
		return isElementDisplayed(mainHeadingSalaryInfoPage, driver);
	}

	public void clickOnSurgicalSalesSalaryReportLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkSurgicalSalesSalaryReport, driver);
		waitTime(2000);
		waitForElementClickable(linkSurgicalSalesSalaryReport, "30", driver);
		click(linkSurgicalSalesSalaryReport, driver);
	}

	public boolean isSurgicalSalesSalaryInformationHeading(WebDriver driver) {
		return isElementDisplayed(headingSurgicalSalesSalaryInformation, driver);
	}

	public void clickOnMedicalDeviceSalesSalaryReportLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkMedicalDeviceSalesSalaryReport, driver);
		waitTime(2000);
		waitForElementClickable(linkMedicalDeviceSalesSalaryReport, "30", driver);
		click(linkMedicalDeviceSalesSalaryReport, driver);
	}

	public boolean isMedicalDeviceSalesSalaryInformationHeading(WebDriver driver) {
		return isElementDisplayed(headingMedicalDeviceSalesSalaryInformation, driver);
	}

	public void clickOnMedicalEquipmentSalesSalaryReportLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkMedicalEquipmentSalesSalaryReport, driver);
		waitTime(2000);
		waitForElementClickable(linkMedicalEquipmentSalesSalaryReport, "30", driver);
		click(linkMedicalEquipmentSalesSalaryReport, driver);
	}

	public boolean isMedicalEquipmentSalesSalaryInformationHeading(WebDriver driver) {
		return isElementDisplayed(headingMedicalEquipmentSalesSalaryInformation, driver);
	}

	public void clickOnPharmaceuticalSalesSalaryReportLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkPharmaceuticalSalesSalaryReport, driver);
		waitTime(2000);
		waitForElementClickable(linkPharmaceuticalSalesSalaryReport, "30", driver);
		click(linkPharmaceuticalSalesSalaryReport, driver);
	}

	public boolean isPharmaceuticalSalesSalaryInformationHeading(WebDriver driver) {
		return isElementDisplayed(headingPharmaceuticalSalesSalaryInformation, driver);
	}

	public void clickOnMedicalSalesSalaryReportLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkMedicalSalesSalaryReport, driver);
		waitTime(2000);
		waitForElementClickable(linkMedicalSalesSalaryReport, "30", driver);
		click(linkMedicalSalesSalaryReport, driver);
	}

	public boolean isHowMuchDoMedicalSalesRepsEarnHeading(WebDriver driver) {
		return isElementDisplayed(headingHowMuchDoMedicalSalesRepsEarn, driver);
	}

	public void clickOnSearchJobsLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkSearchJobs, driver);
		waitTime(2000);
		waitForElementClickable(linkSearchJobs, "30", driver);
		click(linkSearchJobs, driver);
	}

	public boolean isSearchJobsLabelDisplay(WebDriver driver) {
		return isElementDisplayed(labelSearchJobs, driver);
	}

	public void clickOnCareerAdviceLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkCareerAdvice, driver);
		waitTime(2000);
		waitForElementClickable(linkCareerAdvice, "30", driver);
		click(linkCareerAdvice, driver);
	}

	public boolean isBreakingIntoMedicalSalesButtonDisplay(WebDriver driver) {
		waitForElementVisibility(btnBreakingIntoMedicalSales, "30", driver);
		return isElementDisplayed(btnBreakingIntoMedicalSales, driver);
	}

	public void clickOnSalaryInformationLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkSalaryInformation, driver);
		waitTime(2000);
		waitForElementClickable(linkSalaryInformation, "30", driver);
		click(linkSalaryInformation, driver);
	}

	public void clickOnFAQLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkFAQ, driver);
		waitTime(2000);
		waitForElementClickable(linkFAQ, "30", driver);
		click(linkFAQ, driver);
	}

	public boolean isFrequentlyAskedQuestionsHeadingDisplay(WebDriver driver) {
		return isElementDisplayed(headingFrequentlyAskedQuestions, driver);
	}

	public void clickOnJobPostersFAQLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkJobPostersFAQ, driver);
		waitTime(2000);
		waitForElementClickable(linkJobPostersFAQ, "30", driver);
		click(linkJobPostersFAQ, driver);
	}

	public void clickOnAboutMedrepLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkAboutMedrep, driver);
		waitTime(2000);
		waitForElementClickable(linkAboutMedrep, "30", driver);
		click(linkAboutMedrep, driver);
	}

	public void clickOnCantactUsLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkContactUs, driver);
		waitTime(2000);
		waitForElementClickable(linkContactUs, "30", driver);
		click(linkContactUs, driver);
	}

	public void clickOnPrivacyPolicyLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkPrivacyPolicy, driver);
		waitTime(2000);
		waitForElementClickable(linkPrivacyPolicy, "30", driver);
		click(linkPrivacyPolicy, driver);
	}

	public void clickOnTermsOfUseLink(WebDriver driver) {
		scrollIntoViewSmoothly(linkPrivacyPolicy, driver);
		waitTime(2000);
		waitForElementClickable(linkPrivacyPolicy, "30", driver);
		click(linkPrivacyPolicy, driver);
	}

	public boolean isAboutMedrepHeadingDisplay(WebDriver driver) {
		return isElementDisplayed(headingAboutMedrep, driver);
	}

	public boolean isContactUsHeadingDisplay(WebDriver driver) {
		return isElementDisplayed(headingContactUsPage, driver);
	}

	public boolean isPrivacyPolicyHeadingDisplay(WebDriver driver) {
		return isElementDisplayed(headingPrivacyPolicyPage, driver);
	}

	public boolean isTermOfUseHeadingDisplay(WebDriver driver) {
		return isElementDisplayed(headingTermsOfUsePage, driver);
	}

	public boolean verifyTheCurrentUrl(WebDriver driver, String value) {
		waitTime(2000);
		String str = getCurrentUrl(driver);
		return value.equals(str);
	}

	public boolean verifyTheCurrentUrlSiteMap(WebDriver driver, String value) {
		waitTime(2000);
		String str = "https://devicespace.com/sitemap.xml";
		return value.equals(str);
	}

	public void clickMarketBtnOnSalaryInfoPage(WebDriver driver) {
		waitForElementVisibility(marketBtnOnSalaryInfoPage, "20", driver);
		scrollToElement(marketBtnOnSalaryInfoPage, driver);
		if (isElementDisplayed(marketBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(marketBtnOnSalaryInfoPage, "30", driver);
			click(marketBtnOnSalaryInfoPage, driver);
		}
	}

	public boolean verifyMarketTextIsDisplaying(WebDriver driver) {
		return isElementDisplayed(marketText, driver);
	}

	public void clickJobTitleBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(jobTitleBtnOnSalaryInfoPage, driver);
		if (isElementDisplayed(jobTitleBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(jobTitleBtnOnSalaryInfoPage, "30", driver);
			click(jobTitleBtnOnSalaryInfoPage, driver);
		}
	}

	public boolean verifyJobTitleTextIsDisplaying(WebDriver driver) {
		return isElementDisplayed(jobTitleText, driver);
	}

	public void clickCompanySizeBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(companySizeBtnOnSalaryInfoPage, driver);
		if (isElementDisplayed(companySizeBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(companySizeBtnOnSalaryInfoPage, "30", driver);
			click(companySizeBtnOnSalaryInfoPage, driver);
		}
	}

	public boolean verifyCompanySizeTextIsDisplaying(WebDriver driver) {
		return isElementDisplayed(companySizeText, driver);
	}

	public void clickAgeBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(ageBtnOnSalaryInfoPage, driver);
		waitTime(1000, driver);
		if (isElementDisplayed(ageBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(ageBtnOnSalaryInfoPage, "30", driver);
			click(ageBtnOnSalaryInfoPage, driver);
		}
	}

	public boolean verifyAgeAndExperienceTextIsDisplaying(WebDriver driver) {
		return isElementDisplayed(ageAndExperieceText, driver);
	}

	public void clickExperienceBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(experienceBtnOnSalaryInfoPage, driver);
		if (isElementDisplayed(experienceBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(experienceBtnOnSalaryInfoPage, "30", driver);
			click(experienceBtnOnSalaryInfoPage, driver);
		}
	}

	public void clickRegionBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(regionBtnOnSalaryInfoPage, driver);
		if (isElementDisplayed(regionBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(regionBtnOnSalaryInfoPage, "30", driver);
			click(regionBtnOnSalaryInfoPage, driver);
		}
	}

	public boolean verifyRegionTextIsDisplaying(WebDriver driver) {
		return isElementDisplayed(regionText, driver);
	}

	public void clickWriteForUsBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(writeForUsBtnOnSalaryInfoPage, driver);
		if (isElementDisplayed(writeForUsBtnOnSalaryInfoPage, driver)) {
			waitForElementClickable(writeForUsBtnOnSalaryInfoPage, "30", driver);
			click(writeForUsBtnOnSalaryInfoPage, driver);
		}
	}

	public boolean verifyContactUsTextIsDisplaying(WebDriver driver) {
		return isElementDisplayed(contactUsText, driver);
	}

	public void clickSitemapBtnOnSalaryInfoPage(WebDriver driver) {
		scrollToElement(sitemapBtn, driver);
		waitForElementVisibility(sitemapBtn, "20", driver);
		waitForElementClickable(sitemapBtn, "30", driver);
		click(sitemapBtn, driver);
	}

	public boolean verifyChooseYourJobPostingPlanLabel(WebDriver driver) {
		return isElementDisplayed(chooseYourJobPostingPlanLabel, driver);
	}

}
