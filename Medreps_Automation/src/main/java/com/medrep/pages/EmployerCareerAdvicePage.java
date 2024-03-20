package com.medrep.pages;

import com.medrep.base.BaseClass;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EmployerCareerAdvicePage extends BaseClass {
    private WebDriver podriver = null;

    @FindBy(xpath = ("(//img[@alt='Medreps Logo'])[2]"))
    WebElement medrepsLogo;

    @FindBy(xpath = "(//a[text()='CAREER ADVICE'])[last()]") WebElement careerAdviceLink;

    @FindBy(xpath = "(//a[text()='MEDICAL SALES SALARIES'])[last()]") WebElement medicalSalesLink;

    @FindBy(xpath = "(//a/parent::div)[2]") WebElement blogs;

    @FindBy(xpath = "//h1[text()='HOW MUCH DO MEDICAL SALES REPS EARN?']") WebElement medicalSalesPageTitle;

    @FindBy(xpath = "//h5[text()='My Favourite Day In Medical Sales is Tuesday']") WebElement singleBlog;

    @FindBy(xpath = "//h5[text()='My Favourite Day In Medical Sales is Tuesday']") WebElement blogTitle;

    @FindBy(xpath = "//h1[contains(@class,'font-normal')]") WebElement blogPageTitle;

    @FindBy(xpath = ("(//div[contains(@class,'w-full')]//h5)[1]"))
    WebElement firstBlog;
    @FindBy(xpath = ("//div[@class='w-full']//h1"))
    WebElement blogPageHeading;

    @FindBy(xpath = "//button[text()='Insider']") WebElement categoryInsider;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div[2]/div[1]/div[2]/div[1]/a/div/div[2]/h5") WebElement categoryInsiderBlog;

    @FindBy(xpath = "//input[@placeholder='Search']") WebElement searchField;
    @FindBy(xpath = "//h1[text()='Most Popular']/following-sibling::div") WebElement mostPopularBlogSection;

    @FindBy(xpath = "//input[contains(@id, 'email')]") WebElement newsletterEmailField;

    @FindBy(xpath = "//input[@value = 'Subscribe']") WebElement subscribeNewsLetterButton;

    @FindBy(xpath = "//span[text()='Thanks for subscribing!']") WebElement successMessage;

    @FindBy(xpath = "//iframe[contains(@id,'hs-form-iframe')]") WebElement frame;

    @FindBy(xpath = "//p[text()='Biotech Sales Salary Report']") WebElement bioTechJumpLink;

    @FindBy(xpath = "//h1[text()='Biotech Sales Salary Information']") WebElement bioTechJumpLinkPageHeading;
    
    @FindBy(xpath = "//span[text()='Market']/parent::a") WebElement marketJumpLink;
    
    @FindBy(xpath = "//h1[text()='Market']") WebElement marketSection;
    
    public EmployerCareerAdvicePage(WebDriver driverParam) {
        this.podriver = driverParam;
        PageFactory.initElements(this.podriver, this);
    }

    public void clickOnMedrepsLogo(WebDriver driver) throws InterruptedException {
        waitforPageLoad(30, driver);
        waitForElementClickable(medrepsLogo,"30",driver);
        Thread.sleep(5000);
        click(medrepsLogo, driver);
    }

    public void clickOnCareerAdviceLink(WebDriver driver){
        waitforPageLoad(30, driver);
        waitForElementClickable(careerAdviceLink,"30",driver);
        click(careerAdviceLink, driver);
    }

    public void clickOnMedicalSalesLink(WebDriver driver){
        waitforPageLoad(30, driver);
        waitForElementClickable(medicalSalesLink,"30",driver);
        click(medicalSalesLink, driver);
    }

    public void switchToFrame(WebDriver driver){
        waitForElementVisibility(frame,"30",driver);
        driver.switchTo().frame(frame);
    }

    public boolean verifyMostPopularBlogsSectionIsDisplayed(WebDriver driver){
        waitForElementVisibility(mostPopularBlogSection, "30",driver);
        return mostPopularBlogSection.isDisplayed();
    }
    public boolean verifyUserIsRedirectedToCareerAdvicePage(WebDriver driver){
        waitForElementVisibility(blogs,"30",driver);
        return blogs.isDisplayed();
    }

    public boolean verifyUserIsRedirectedToMedicalSalesPage(WebDriver driver){
        waitForElementVisibility(medicalSalesPageTitle,"30",driver);
        return medicalSalesLink.isDisplayed();
    }

    public void clickOnJumpLink(WebDriver driver) throws InterruptedException {
        waitForElementClickable(bioTechJumpLink, "30", driver);
        Thread.sleep(10000);
        click(bioTechJumpLink, driver);
    }

    public boolean verifyUserIsRedirectedToBioTechSalesPage(WebDriver driver){
        waitForElementVisibility(bioTechJumpLinkPageHeading,"30",driver);
        return bioTechJumpLinkPageHeading.isDisplayed();
    }

    public String getHeadingOfFirstBlog(WebDriver driver) {
        return getElementText(firstBlog, driver);
    }

    public boolean verifyResultsAreShowing(WebDriver driver){
        return firstBlog.isDisplayed();
    }
    public void clickOnBlog(WebDriver driver) {
        waitForElementClickable(firstBlog, "30", driver);
        click(firstBlog, driver);
    }
    public String getBlogPageHeading(WebDriver driver) {
        scrollIntoViewSmoothly(blogPageHeading, driver);
        waitTime(2000);
        return getElementText(blogPageHeading, driver);
    }

    public void clickOnCategoryInsider(WebDriver driver) throws InterruptedException {
        waitForElementClickable(categoryInsider, "30", driver);
        Thread.sleep(15000);
        click(categoryInsider, driver);
    }

    public boolean verifyCategoryInsiderBlogIsDisplayed(WebDriver driver){
        return categoryInsiderBlog.isDisplayed();
    }

    public void enterSearchFieldValue(WebDriver driver){
        waitForElementVisibility(searchField,"30",driver);
        type(searchField,"My Favourite",driver);
    }
    public void enterNewsLetterEmail(WebDriver driver){

        waitForElementVisibility(newsletterEmailField,"30",driver);
        scrollIntoViewSmoothly(newsletterEmailField,driver);
        type(newsletterEmailField,"testuser1@gmail.com",driver);
    }

    public void clickOnSubscribeButton(WebDriver driver) throws InterruptedException {
        waitForElementVisibility(subscribeNewsLetterButton,"30",driver);
        waitForElementClickable(subscribeNewsLetterButton,"30",driver);
        Thread.sleep(10000);
        click(subscribeNewsLetterButton,driver);
    }

    public boolean verifySuccessMessageIsDisplayed(WebDriver driver){
        waitForElementVisibility(successMessage,"30",driver);
        return successMessage.isDisplayed();
    }
    
    public void clickOnJumpLinkMarket(WebDriver driver) throws InterruptedException {
        waitForElementClickable(marketJumpLink,"30",driver);
        scrollIntoViewSmoothly(marketJumpLink,driver);
        Thread.sleep(10000);
        click(marketJumpLink,driver);
    }
    
    public boolean verifyMarketSectionIsDisplayed(WebDriver driver){
        waitForElementVisibility(marketSection,"30",driver);
        return marketSection.isDisplayed();
    }
    
}
