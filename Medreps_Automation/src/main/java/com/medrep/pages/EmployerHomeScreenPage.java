package com.medrep.pages;

import com.medrep.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerHomeScreenPage extends BaseClass {

    private WebDriver podriver = null;


    @FindBy(xpath = "//p[text()='Primary Function']/../..")
    WebElement jobSearchBox;

    @FindBy(xpath = "//span[text()='Business Development']/preceding-sibling::span") WebElement optionToSelect;


    @FindBy(xpath = ("//button[text()='Search']"))
    WebElement searchBtn;

    @FindBy(xpath = "//span[text()='Function']/following-sibling::p") WebElement searchResultTitle;

    public EmployerHomeScreenPage(WebDriver driverParam) {
        this.podriver = driverParam;
        PageFactory.initElements(this.podriver, this);
    }


    public void enterValueInSearchBox(WebDriver driver){
        waitForElementVisibility(jobSearchBox, "30", driver);
        click(jobSearchBox,driver);
        waitForElementClickable(optionToSelect, "30", driver);
        click(optionToSelect, driver);
    }

    public void searchJob(WebDriver driver){
        waitForElementClickable(searchBtn, "30", driver);
        click(searchBtn, driver);
    }

    public String verifySearchResults(WebDriver driver){
        scrollIntoViewSmoothly(searchResultTitle, driver);
        isElementDisplayed(searchResultTitle, driver);
        return searchResultTitle.getText();
    }
}
