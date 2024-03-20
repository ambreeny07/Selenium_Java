package com.vetscout.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.utilities.Waits;

public class Partners_And_BudgetsPage extends BaseClass {
	

	@FindBy(css = "div.main-panel > h1")
	WebElement departmentTitle;
	
	@FindBy(xpath = "(//img[contains(@src, 'psivet.com/wp-content/uploads/2020/04/')]/../parent::div/..//following::div[@class='text-part']//child::h3[1])[1]")
	WebElement imageLeftAlignedToText;
	
	@FindBy(xpath = "(//img[contains(@src, 'psivet.com/wp-content/uploads/2020/04/')]/../parent::div/..//following::div[@class='text-part']//child::h3/a[1])")
	WebElement linkRightToImage;
	
	@FindBy(xpath = "//h1[text()='ASSOCIATIONS']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement AssociationDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='SURGICAL SUPPLIES']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement SURGICALSUPPLIESDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='HEALTH CERTIFICATES']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement HEALTHCERTIFICATESDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='PET FOOD']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement PETFOODDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='COMPOUNDING PHARMACY']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement COMPOUNDINGPHARMACYDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='SPECIALTY']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement SPECIALTYDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='HUMAN RESOURCES']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement HUMANRESOURCESDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='TELEMEDICINE']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement TELEMEDICINEDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='OFFICE/SANITARY SUPPLIES']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement OFFICESANITARYSUPPLIESDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='MANUFACTURING']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement MANUFACTURINGDepartmentPartner;
	
	@FindBy(xpath = "//h1[text()='HEALTHCARE']/following-sibling::div//div[contains(@class,'img-part')]")
	WebElement HEALTHCAREDepartmentPartner;
	
	
	
	@FindBy(xpath = "(//*[contains(text(),'WEEKLY')]/parent::a)[1]")
	WebElement btnWeekly;
	
	@FindBy(xpath = "(//*[contains(text(),'MONTHLY')]/parent::a)[1]")
	WebElement btnMonthly;
	
	@FindBy(xpath = "(//*[contains(text(),'QUARTERLY')]/parent::a)[1]")
	WebElement btnQuarterly;
	
	@FindBy(xpath = "//tbody/tr")
	WebElement budgetsRow;
	
	@FindBy(xpath = "//span[text()='Budget']/following::tr[1]/td[3]")
	WebElement budgetsFisrtRow;
	
	@FindBy(xpath = "(//i[@class='fas fa-edit'])[1]")
	WebElement budgetsFisrtRowEditIcon;
	
	@FindBy(xpath = "//input[@id='outlined-adornment-amount']")
	WebElement budgetsEditTxt;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Select Year')]")
	WebElement yearlyInput;
	
	@FindBy(xpath = "//div[contains(text(),'Select Month')]")
	WebElement monthlyInput;
	
	@FindBy(xpath = "//div[contains(text(),'Select Quarter')]")
	WebElement quaterlyInput;
	
	@FindBy(xpath = "//*[text()='2023']")
	WebElement yearlyOption;
	
	@FindBy(xpath = "//*[text()='March']")
	WebElement monthlyOption;
	
	@FindBy(xpath = "//*[text()='Quarter 1(Jan - Mar)']")
	WebElement quaterlyOption;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-trash')])[1]")
	WebElement deleteBtn;
	
	
	@FindBy(xpath = "//td[contains(text(),'$500.00')]")
	WebElement budgetPrice;
	
	String budget ="" ;
	String budgetPriceEnter="500";
	
	
	
	@FindBy(xpath = "//a[@href='/orders/budgets/add?type=WEEKLY']")
	WebElement addWeeklyBudget;
	
	@FindBy(xpath = "//a[@href='/orders/budgets/add?type=MONTHLY']")
	WebElement addMonthlyBudget;
	
	@FindBy(xpath = "//a[@href='/orders/budgets/add?type=QUARTERLY']")
	WebElement addQuaterlyBudget;
	
	@FindBy(xpath = "//*[text()='Select Week Range']")
	WebElement selectWeekRangeBtn;
	
	@FindBy(xpath = "//button[contains(@class,'rdrDay rdrDayToday')]")
	WebElement todayDateBtn;
	
	@FindBy(xpath = "//input[contains(@id,'outlined-adornment-amount')]")
	WebElement weeklyBudgetAmountInput;
	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	WebElement weeklyBudgetCheckboxInput;
	
	
	
	
	public Partners_And_BudgetsPage() {
		PageFactory.initElements(driver, this);
	}

	
	public String getBackgroundColor() {
		waitForElementClickable(departmentTitle, "20");
		return getElementCssValue(departmentTitle, "background");
	}

	public boolean isImageLeftAlignedToTextDisplaying() {
		return isElementDisplayed(imageLeftAlignedToText);
	}

	public boolean isLinkRightToImageDisplaying() {
		return isElementDisplayed(linkRightToImage);
	}	
	
	public boolean isBtnWeeklyClickable() {
		return isElementEnabled(btnWeekly);
	}
	

	
	public void clickOnWeeklyTab() {
		click(btnWeekly);
	}
	public void clickOnMonthlyTab() {
		click(btnMonthly);
	}
	
	public void clickOnQuaterlyTab() {
		click(btnQuarterly);
	}
	
	public void clickOnAddWeeklyBudgetBtn() {
		waitForElementClickable(addWeeklyBudget, "20");
		click(addWeeklyBudget);
	}
	public void clickOnAddMonthlyBudgetBtn() {
		waitForElementClickable(addMonthlyBudget, "20");
		click(addMonthlyBudget);
	}
	
	public void clickOnAddQuaterlyBudgetBtn() {
		waitForElementClickable(addQuaterlyBudget, "20");
		click(addQuaterlyBudget);
	}
	
	public void clickOnWeekRangeBtn() {
		waitForElementClickable(selectWeekRangeBtn, "20");
		click(selectWeekRangeBtn);
	}
	
	public void clickOnTodayDateBtn() {
		waitForElementClickable(todayDateBtn, "20");
		click(todayDateBtn);
	}
	
	public void clickOnYearlyInputBtn() {
		waitForElementClickable(yearlyInput, "20");
		click(yearlyInput);
	}
	
	
	public void clickOnYearlyInputOption() {
		waitForElementClickable(yearlyOption, "20");
		click(yearlyOption);
	}
	
	
	public void clickOnMonthlyInputBtn() {
		waitForElementClickable(monthlyInput, "20");
		click(monthlyInput);
	}
	
	
	public void clickOnMonthlyOption() {
		waitForElementClickable(monthlyOption, "20");
		click(monthlyOption);
	}
	
	public void clickOnQuaterInputBtn() {
		waitForElementClickable(quaterlyInput, "20");
		click(quaterlyInput);
	}
	
	
	public void clickOnQuaterOption() {
		waitForElementClickable(quaterlyOption, "20");
		click(quaterlyOption);
	}
	
	public void clickOnBudgetSaveBtn() {
		waitForElementClickable(saveBtn, "20");
		click(saveBtn);
	}
	
	
	public void clickOnDeleteBudgetBtn() {
		waitForElementClickable(deleteBtn, "20");
		click(deleteBtn);
	}
	
	public void clickOnCheckboxBudget() {
		if(!weeklyBudgetCheckboxInput.isSelected())
			weeklyBudgetCheckboxInput.click();
	}
	

	
	public boolean isBudgetTabClickable(String tab) {
		String path = "(//*[contains(text(),'"+ tab +"')]/parent::a)[1]";
		return isElementEnabled(driver.findElement(By.xpath(path)));
	}

	public void clickOnBudgetsRangeTab(String tab) {
		String path = "(//*[contains(text(),'"+ tab +"')]/parent::a)[1]";
		click(driver.findElement(By.xpath(path)));
	}

	public boolean isbudgetsRowDisplaying() {
		return isElementDisplayed(budgetsRow);
	}

	public boolean isColumnValueDisplaying(int index) {
		String path = "(//tbody/tr//td["+ index +"])[1]";
		return isElementDisplayed(driver.findElement(By.xpath(path)));
	}

	public boolean isActionColumnValueDisplaying(int index) {
		String path = "(//tbody/tr//td[8]//a["+ index +"])[1]";
		return isElementDisplayed(driver.findElement(By.xpath(path)));
	}

	public boolean isColumnNameDisplaying(String columnName) {
		String path = "//span[contains(text(), '"+ columnName +"')]/..";
		return isElementDisplayed(driver.findElement(By.xpath(path)));
	}
	
	
	
	public boolean isAssociationDepartmentPartnerDisplaying() {
		return isElementDisplayed(AssociationDepartmentPartner);
	}
	
	public boolean isSURGICALSUPPLIESDepartmentPartnerDisplaying() {
		return isElementDisplayed(SURGICALSUPPLIESDepartmentPartner);
	}
	
	public boolean isHEALTHCERTIFICATESDepartmentPartnerDisplaying() {
		return isElementDisplayed(HEALTHCERTIFICATESDepartmentPartner);
	}
	public boolean isPETFOODDepartmentPartnerDisplaying() {
		return isElementDisplayed(PETFOODDepartmentPartner);
	}
	public boolean isCOMPOUNDINGPHARMACYDepartmentPartnerDisplaying() {
		return isElementDisplayed(COMPOUNDINGPHARMACYDepartmentPartner);
	}
	public boolean isSPECIALTYDepartmentPartnerDisplaying() {
		return isElementDisplayed(SPECIALTYDepartmentPartner);
	}
	public boolean isHUMANRESOURCESDepartmentPartnerDisplaying() {
		return isElementDisplayed(HUMANRESOURCESDepartmentPartner);
	}
	public boolean isTELEMEDICINEDepartmentPartnerDisplaying() {
		return isElementDisplayed(TELEMEDICINEDepartmentPartner);
	}
	public boolean isOFFICESANITARYSUPPLIESDepartmentPartnerDisplaying() {
		return isElementDisplayed(OFFICESANITARYSUPPLIESDepartmentPartner);
	}
	public boolean isMANUFACTURINGDepartmentPartnerDisplaying() {
		return isElementDisplayed(MANUFACTURINGDepartmentPartner);
	}
	public boolean isHEALTHCAREDepartmentPartnerDisplaying() {
		return isElementDisplayed(HEALTHCAREDepartmentPartner);
	}
	

	public boolean isAddBudgetDisplaying(String columnName) {
		String path = "//a[@href='/orders/budgets/add?type="+ columnName +"']";
		return isElementDisplayed(driver.findElement(By.xpath(path)));
	}
	
	public void clickOnFisrtRowEditIcon() {
		waitForElementVisibility(budgetsFisrtRow, "5");
		click(budgetsFisrtRowEditIcon);
	}
	
	public void clickOnEditSaveButton() {
		waitForElementClickable(saveBtn, "20");
		click(saveBtn);
	}
	
	public void enterBudgetPrice() {
		
		type(budgetsEditTxt, budgetPriceEnter);
	}
	

	
	public boolean shouldBeAbleToSeeNewChanges() {
		waitForElementVisibility(budgetPrice, "5");
		return isElementDisplayed(budgetPrice);
		
	}
	
	public boolean deleteTheBudget() {
		try {
			clickOnDeleteBudgetBtn();
			waitfor3sec();
			driver.switchTo().alert().accept();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
