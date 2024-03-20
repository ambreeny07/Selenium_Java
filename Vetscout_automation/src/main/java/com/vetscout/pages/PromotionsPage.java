package com.vetscout.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;

import com.vetscout.errorCollectors.ErrorCollector;

import com.vetscout.utilities.Waits;

public class PromotionsPage extends BaseClass {

	@FindBy(xpath = ("//div[@id='list-header']//div[2]//div"))
	WebElement sortbyDropDown;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Product Name (A-Z)')]"))
	WebElement sortbyDropDownProductNameA_Z;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Product Name (Z-A)')]"))
	WebElement sortbyDropDownProductNameZ_A;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Lowest')]"))
	WebElement sortbyDropDownProductNameLowestPrice;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Highest')]"))
	WebElement sortbyDropDownProductNameHighestPrice;

	@FindBy(xpath = ("//div[@id='list-header']//div[3]//div"))
	WebElement viewDropDown;

	@FindBy(xpath = ("//div[@id='add-favorite-menu']"))
	WebElement addFavoriteMenu;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Default')]"))
	WebElement viewDropDownDefault;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Large')]"))
	WebElement viewDropDownLarge;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'List')]"))
	WebElement viewDropDownList;

	@FindBy(xpath = ("//div[contains(@id,'option') and contains(text(),'Wide')]"))
	WebElement viewDropDownWide;

	@FindBy(xpath = ("//input[@placeholder='Product Name, SKU, Manufacturer']"))
	WebElement searchBar;

	@FindBy(xpath = ("//div[@class='slick-list']"))
	WebElement searchResults;

	@FindBy(xpath = ("(//h4//a)[1]"))
	WebElement searchResultsFirstText;

	@FindBy(xpath = ("//div[@class='description']"))
	WebElement searchResultsManufacturer;

	@FindBy(xpath = ("//li[@class='ais-Hits-compactitem']"))
	WebElement searchResultsItem;

	@FindBy(xpath = ("(//li[@class='ais-Hits-compactitem'])[1]"))
	WebElement searchResultsFirstItem;

	@FindBy(xpath = ("(//button//img[1]//parent::*)[1]"))
	WebElement searchResultsFirstItemHeartIcon;

	@FindBy(xpath = ("(//img[contains(@src,(C3guOFl))]//parent::span//parent::button[not(contains(@class,'active'))])[1]"))
	WebElement searchResultsFirstInactiveItemHeartIcon;

	@FindBy(xpath = ("(//img[contains(@src,(C3guOFl))]//parent::span//parent::button[not(contains(@class,'active'))])[2]"))
	WebElement searchResultsSecondInactiveItemHeartIcon;

	@FindBy(xpath = ("(//button//img[1]//parent::*)[2]"))
	WebElement searchResultsSecondItemHeartIcon;

	@FindBy(xpath = ("(//li[@class='ais-Hits-compactitem'])[1]//button[contains(@class,'active')]"))
	WebElement searchResultsFirstItemActiveHeartIcon;

	@FindBy(xpath = ("//h4[contains(text(),'No products found')]"))
	WebElement noProductsFoundMsg;

	@FindBy(xpath = ("//h1[contains(text(),'General Promotions')]"))
	WebElement promotionsPageTitle;

	@FindBy(xpath = ("//li[@class='ais-Hits-compactitem']//button[contains(@class,'active')]"))
	WebElement searchResultsItemActiveHeartIcon;

	@FindBy(xpath = ("(//table//div//div)[1]"))
	WebElement generalPromotionsFirstItemWideView;

	@FindBy(xpath = ("(//ul[contains(@class,'ais-Hits-list')]//li//div)[1]"))
	WebElement generalPromotionsdefault_large_listView;

	@FindBy(xpath = ("//h4[@id='TooltipExample']//following-sibling::div[3]//div//div[1]//div[2]"))
	WebElement generalPromotionsItemPrices;

	@FindBy(xpath = ("//h4[@id='TooltipExample']//following-sibling::div[3]//span[contains(text(),'$')][1]"))
	List<WebElement> generalPromotionsItemPricesList;

	@FindBy(xpath = ("(//div[@data-index='1']//a/img)[1]"))
	WebElement generalPromotionsItem1Image;

	@FindBy(xpath = ("(//div[@class='main-panel']//button[contains(@class,'slick-prev')])[1]"))
	WebElement featuredProduct1LeftArrowButton;

	@FindBy(xpath = ("(//div[@class='main-panel']//button[contains(@class,'slick-next')])[1]"))
	WebElement featuredProduct1RightArrowButton;

	@FindBy(xpath = ("(//div[@class='main-panel']//div)[1]"))
	WebElement firstItem;

	@FindBy(xpath = ("//input[@value='IN_STOCK']"))
	WebElement featuredProductFilterInstock;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[1]"))
	WebElement manufacturerAgriProgFilter;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[1]"))
	WebElement manufacturerFilter;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[2]"))
	WebElement manufacturerFilterABCCompounding;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[3]"))
	WebElement manufacturerFilterAddisonBiological;

	@FindBy(xpath = ("//span[contains(text(),'Allflex')]//preceding-sibling::span//input"))
	WebElement manufacturerFilterAllflex;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[5]"))
	WebElement manufacturerFilterAmericanProtienCorp;

	@FindBy(xpath = ("//span[contains(text(),'Animal Health Logistics LLC')]//preceding-sibling::span//input"))
	WebElement manufacturerAnimalHealthLogisticsFilter;

	@FindBy(xpath = ("//span[contains(text(),'Animal Health Logistics LLC')]//preceding-sibling::span//input"))
	WebElement manufacturerLLCFilter;

	@FindBy(xpath = ("//span[contains(text(),'Bayer')]//preceding-sibling::span//input"))
	WebElement manufacturerFluidsFilter;

	@FindBy(xpath = ("//span[contains(text(),'Boehringer Ingelheim (BI)')]//preceding-sibling::span//input"))
	WebElement manufacturerBImanufacturerFilter;

	@FindBy(xpath = ("//span[contains(text(),'FERA DIAGNOSTICS AND BIOLOGICA')]//preceding-sibling::span//input"))
	WebElement manufacturerANDBIOLOGICALFilter;

	@FindBy(xpath = ("//span[contains(text(),'Therapeutics')]//preceding-sibling::span//input"))
	WebElement manufacturerTherapeuticsFilter;

	@FindBy(xpath = ("//span[contains(text(),'Surgivet')]//preceding-sibling::span//input"))
	WebElement manufacturerSurgivetFilter;

	@FindBy(xpath = ("//span[contains(text(),'Instrumentation')]//preceding-sibling::span//input"))
	WebElement manufacturerInstrumentationFilter;

	@FindBy(xpath = ("//img[contains(@src,'covetrus.png')]//parent::*//parent::*//input"))
	WebElement vendorCovetrus;

	@FindBy(xpath = ("//ul[@class='pagination']//li[last()-1]//a"))
	WebElement generalPromotionsPaginationLastPageNumber;

	@FindBy(xpath = ("//span[contains(text(),'Preferred')]//parent::*//input"))
	WebElement generalPromotionsFiltersPreferred;

	@FindBy(xpath = ("//span[contains(text(),'Promotion')]//parent::*//input"))
	WebElement generalPromotionsFiltersPromotion;

	@FindBy(xpath = ("//div[contains(text(),'Filters')]"))
	WebElement generalPromotionsFiltersHeading;

	@FindBy(xpath = ("//span[contains(text(),'Earn Points')]//parent::*//input"))
	WebElement generalPromotionsFiltersEarnPoint;

	@FindBy(xpath = ("//span[contains(text(),'Redeem Points')]//parent::*//input"))
	WebElement generalPromotionsFiltersRedeemPoints;

	@FindBy(xpath = ("//span[contains(text(),'My Favorites')]//parent::*//input"))
	WebElement generalPromotionsFiltersMyFavorites;

	@FindBy(xpath = ("//span[contains(text(),'Previous Orders')]//parent::*//input"))
	WebElement generalPromotionsFiltersPreviousOrders;

	@FindBy(xpath = ("//span[contains(text(),'Rebate')]//parent::*//input"))
	WebElement generalPromotionsFiltersRebate;

	@FindBy(xpath = ("//div[contains(text(),'ABC Compounding')]"))
	List<WebElement> ProductsWithABCCompounding;

	@FindBy(xpath = ("//div[contains(text(),'Addison Biological')]"))
	List<WebElement> ProductsWithAddisonBiological;

	@FindBy(xpath = ("//div[contains(text(),'Allflex')]"))
	List<WebElement> ProductsWithAllflex;

	@FindBy(xpath = ("//li[@class='ais-Hits-compactitem']"))
	List<WebElement> generalPromotionsItems;

	@FindBy(xpath = ("//img[@title='Earn Points']"))
	List<WebElement> ItemsWithEarnPoints;

	@FindBy(xpath = ("//div[contains(text(),'Addison Biological')]"))
	List<WebElement> ItemsWithRedeemPoints;

	@FindBy(xpath = ("//button[@title='My Favorites']"))
	List<WebElement> ItemsWithMyFavoritesButton;

	@FindBy(xpath = ("//div[contains(text(),'American Protein Corp')]"))
	List<WebElement> ProductsWithAmericanProtienCorp;

	@FindBy(xpath = ("//div[contains(text(),'Animal Health Logistics')]"))
	List<WebElement> ProductsWithAnimalHealthLogistics;

	@FindBy(xpath = ("//div[contains(text(),'APC Company, Inc')]"))
	List<WebElement> ProductsWithLLCmanufacturer;

	@FindBy(xpath = ("//div[contains(text(),'Bayer')]"))
	List<WebElement> ProductsWithFluids;

	@FindBy(xpath = ("//div[contains(text(),'Bovie')]"))
	List<WebElement> ProductsWithBImanufacturer;

	@FindBy(xpath = ("//div[contains(text(),'Generic')]"))
	List<WebElement> ProductsWithANDBIOLOGICAL;

	@FindBy(xpath = ("//div[contains(text(),'Neogen')]"))
	List<WebElement> NumberOfProductsWithTherapeutics;

	@FindBy(xpath = ("//div[contains(text(),'Smiths Medical Asd Inc')]"))
	List<WebElement> ProductsWithSurgivet;

	@FindBy(xpath = ("//div[contains(text(),'Vetnique Labs')]"))
	List<WebElement> ProductsWithInstrumentation;

	@FindBy(xpath = ("//div[@class='main-panel']//img[contains(@src,'covetrus.png')]"))
	List<WebElement> ProductsWithVendorCovetrus;

	@FindBy(xpath = ("//div[contains(text(),'Agri-Pro')]"))
	List<WebElement> ProductsWithAgriProg;

	@FindBy(xpath = ("//div[contains(text(),'3M')]"))
	List<WebElement> NumberOfProductsWith3M;

	@FindBy(xpath = ("//div[@class='slick-list']"))
	List<WebElement> Results;

	@FindBy(xpath = ("//div[contains(text(),'Product Name (A-Z)')]"))
	WebElement productNameAZSortBy;

	@FindBy(xpath = ("//*[text()='Above $500']/preceding-sibling::input"))
	WebElement priceFilterAbove500Dollar;

	@FindBy(xpath = ("//*[text()='$100 - $500']/preceding-sibling::input"))
	WebElement priceFilter100To500Dollar;

	@FindBy(xpath = ("//*[text()='$10 - $100']/preceding-sibling::input"))
	WebElement priceFilter10To100Dollar;

	@FindBy(xpath = ("//*[text()='Below $10']/preceding-sibling::input"))
	WebElement priceFilterBelow10Dollar;

	@FindBy(xpath = ("//*[text()='All']/preceding-sibling::input"))
	WebElement priceFilterAll;
	
	


	public PromotionsPage() {
		PageFactory.initElements(driver, this);
	}

	public double getNumberOfProductsWithAmericanProtienCorp() {
		Waits.wait1s();
		return ProductsWithAmericanProtienCorp.size();
	}

	public double getNumberOfProductsWithAnimalHealthLogistics() {
		Waits.wait1s();
		return ProductsWithAnimalHealthLogistics.size();
	}

	public double getNumberOfProductsWithLLCmanufacturer() {
		Waits.wait1s();
		return ProductsWithLLCmanufacturer.size();
	}

	public double getNumberOfProductsWithFluids() {
		Waits.wait1s();
		return ProductsWithFluids.size();
	}

	public double getNumberOfProductsWithBImanufacturer() {
		Waits.wait1s();
		return ProductsWithBImanufacturer.size();
	}

	public double getNumberOfProductsWithANDBIOLOGICAL() {
		Waits.wait1s();
		return ProductsWithANDBIOLOGICAL.size();
	}

	public double getNumberOfProductsWithTherapeutics() {
		Waits.wait1s();
		return NumberOfProductsWithTherapeutics.size();
	}

	public double getNumberOfProductsWithSurgivet() {
		Waits.wait1s();
		return ProductsWithSurgivet.size();
	}

	public double getNumberOfProductsWithInstrumentation() {
		Waits.wait1s();
		return ProductsWithInstrumentation.size();
	}

	public double getNumberOfProductsWithVendorCovetrus() {
		Waits.wait1s();
		return ProductsWithVendorCovetrus.size();
	}

	public double getNumberOfProductsWithABCCompounding() {
		Waits.wait1s();
		return ProductsWithABCCompounding.size();
	}

	public double getNumberOfProductsWithAddisonBiological() {
		Waits.wait1s();
		return ProductsWithAddisonBiological.size();
	}

	public double getNumberOfProductsWithAllflex() {
		Waits.wait1s();
		return ProductsWithAllflex.size();
	}

	public void clickOnItem() {
		Waits.wait2s();
		hoverAndClick(featuredProduct1RightArrowButton, featuredProduct1RightArrowButton);
	}

	public void hoverOverFeatureProductImage() {
		Waits.wait1s();
		hoverOverElement(firstItem);
	}

	public void clickOnManufacturerFilterABCCompounding() {
		Waits.wait2s();
		hoverAndClick(manufacturerFilterABCCompounding, manufacturerFilterABCCompounding);
	}

	public void clickOnManufacturerFilterAddisonBiological() {
		Waits.wait2s();
		hoverAndClick(manufacturerFilterAddisonBiological, manufacturerFilterAddisonBiological);
	}

	public void clickOnManufacturerFilterAllflex() {
		Waits.wait2s();
		hoverAndClick(manufacturerFilterAllflex, manufacturerFilterAllflex);
	}

	public void clickOnManufacturerFilterAmericanProtienCorp() {
		Waits.wait2s();
		hoverAndClick(manufacturerFilterAmericanProtienCorp, manufacturerFilterAmericanProtienCorp);
	}

	public void clickOnManufacturerAnimalHealthLogisticsFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerAnimalHealthLogisticsFilter, manufacturerAnimalHealthLogisticsFilter);
	}

	public void clickOnManufacturerLLCFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerLLCFilter, manufacturerLLCFilter);
	}

	public void clickOnManufacturerFluidsFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerFluidsFilter, manufacturerFluidsFilter);
	}

	public void clickOnManufacturerBImanufacturerFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerBImanufacturerFilter, manufacturerBImanufacturerFilter);
	}

	public void clickOnManufacturerANDBIOLOGICALFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerANDBIOLOGICALFilter, manufacturerANDBIOLOGICALFilter);
	}

	public void clickOnManufacturerTherapeuticsFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerTherapeuticsFilter, manufacturerTherapeuticsFilter);
	}

	public void clickOnManufacturerSurgivetFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerSurgivetFilter, manufacturerSurgivetFilter);
	}

	public void clickOnManufacturerInstrumentationFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerInstrumentationFilter, manufacturerInstrumentationFilter);
	}

	public void clickOnVendorCovetrusFilter() {
		Waits.wait2s();
		hoverAndClick(vendorCovetrus, vendorCovetrus);
	}

	public double getNumberOfProductsWithAgriProg() {
		Waits.wait1s();
		return ProductsWithAgriProg.size();
	}

	public double getNumberOfProductsWith3M() {
		Waits.wait1s();
		return NumberOfProductsWith3M.size();
	}

	public void enterIntoSearchBar(String product) {
		Waits.wait3s();
		type(searchBar, product);
	}

	public int getNumberofResultsShowing() {
		Waits.wait3s();
		return Results.size();
	}

	public String getTextOfSearchedResults() {
		return getElementText(searchResultsFirstText);
	}

	public String getTextOfSearchResultsManufacturer() {
		return getElementText(searchResultsManufacturer);
	}

	public void clickOnSearchResultsFirstItem() {
		Waits.wait1s();
		waitForElementClickable(searchResultsFirstItem, "20");
		click(searchResultsFirstItem);
	}

	public void clickSearchResultsFirstItemHeartIcon() {
		Waits.wait1s();
		waitForElementClickable(searchResultsFirstItemHeartIcon, "20");
		click(searchResultsFirstItemHeartIcon);
		hoverAndClick(searchResultsFirstItemHeartIcon, searchResultsFirstItemHeartIcon);
	}

	public void clickSearchResultsFirstInactiveItemHeartIcon() {
		Waits.wait1s();
		waitForElementClickable(searchResultsFirstInactiveItemHeartIcon, "20");
		hoverAndClick(searchResultsSecondInactiveItemHeartIcon, searchResultsFirstInactiveItemHeartIcon);
	}

	public void clickSearchResultsFirstItemHeartIcon1() {
		click(searchResultsFirstItemHeartIcon);
	}

	public void clickSearchResultsItemActiveHeartIcon() {
		Waits.wait1s();
		waitForElementClickable(searchResultsItemActiveHeartIcon, "20");
		hoverAndClick(searchResultsItemActiveHeartIcon, searchResultsItemActiveHeartIcon);
	}

	public boolean isSearchResultsFirstItemHeartIconDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(searchResultsFirstItemHeartIcon);
	}

	public boolean isSearchResultsFirstItemActiveHeartIconDisplaying() {
		return isElementDisplayed(searchResultsFirstItemActiveHeartIcon);
	}

	public boolean isNoProductsFoundMsgDisplaying() {
		return isElementDisplayed(noProductsFoundMsg);
	}

	public void clickOnSortbyDropDown() {
		Waits.wait2s();
		waitForElementClickable(sortbyDropDown, "20");
		click(sortbyDropDown);
	}

	public boolean isSortByDropDownProductNameA_ZDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(sortbyDropDownProductNameA_Z);
	}

	public void clickOnSortByDropDownProductNameA_Z() {
		Waits.wait1s();
		waitForElementClickable(sortbyDropDownProductNameA_Z, "20");
		click(sortbyDropDownProductNameA_Z);
	}

	public boolean isSortByDropDownProductNameZ_ADisplaying() {
		Waits.wait2s();
		return isElementDisplayed(sortbyDropDownProductNameZ_A);
	}

	public void clickOnSortByDropDownProductNameZ_A() {
		Waits.wait2s();
		waitForElementClickable(sortbyDropDownProductNameZ_A, "20");
		click(sortbyDropDownProductNameZ_A);
	}

	public boolean isSortByDropDownProductNameLowestPriceDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(sortbyDropDownProductNameLowestPrice);
	}

	public void clickOnSortByDropDownProductNameLowestPrice() {
		Waits.wait1s();
		waitForElementClickable(sortbyDropDownProductNameLowestPrice, "20");
		click(sortbyDropDownProductNameLowestPrice);
	}

	public boolean isSortByDropDownProductNameHighestPriceDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(sortbyDropDownProductNameHighestPrice);
	}

	public void clickOnSortByDropDownProductNameHighestPrice() {
		Waits.wait1s();
		waitForElementClickable(sortbyDropDownProductNameHighestPrice, "20");
		click(sortbyDropDownProductNameHighestPrice);
	}

	public void clickOnViewDropDownn() {
		Waits.wait2s();
		waitForElementClickable(viewDropDown, "20");
		click(viewDropDown);
	}

	public void clickOnAddFavoriteMenu() {
		Waits.wait2s();
		waitForElementClickable(addFavoriteMenu, "20");
		click(addFavoriteMenu);
	}

	public void clickOnViewDropDownDefault() {
		Waits.wait2s();
		waitForElementClickable(viewDropDownDefault, "20");
		click(viewDropDownDefault);
	}

	public boolean isViewDropDownDefaultDisplaying() {
		return isElementDisplayed(viewDropDownDefault);
	}

	public boolean isViewDropDownLargeDisplaying() {
		return isElementDisplayed(viewDropDownLarge);
	}

	public boolean isViewDropDownListDisplaying() {
		return isElementDisplayed(viewDropDownList);
	}

	public int getNumberOfResults(WebDriver driver) {
		return driver.findElements(By.xpath("//h4//a")).size();
	}

	public ArrayList<String> getProductNameList(WebDriver driver) throws InterruptedException {
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("List Count: " + getNumberOfResults(driver));
		for (int i = 1; i <= getNumberOfResults(driver); i++) {
			Waits.wait2s();
			list.add(driver.findElement(By.xpath("(//h4//a)[" + i + "]")).getText());
		}
		return list;
	}

	public double getNumberOfGeneralPromotionsItemPrices(WebDriver driver) {
		return generalPromotionsItemPricesList.size();
	}

	public ArrayList<Double> getNumberOfgeneralPromotionsItemPricesList(WebDriver driver) throws InterruptedException {
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.print("List Count: " + getNumberOfGeneralPromotionsItemPrices(driver));
		for (int i = 1; i <= getNumberOfGeneralPromotionsItemPrices(driver); i++) {
			Waits.wait2s();
			String str = driver.findElement(By.xpath(
					"(//h4[@id='TooltipExample']//following-sibling::div[3]//div//div//div//span[contains(text(),'$')][1])["
							+ i + "]"))
					.getText();
			String strNew = str.replace("$", "");
			if (!strNew.isEmpty()) {
				list.add(Double.parseDouble(strNew.replaceAll(",","")));
				}
		}
		return list;
	}

	public String getDescriptionOfSortByDropDown() {
		return getElementTextWithoutTrim(sortbyDropDown);
	}

	public String getDescriptionOfViewDropDown() {
		return getElementTextWithoutTrim(viewDropDown);
	}

	public int getSizeOfDefaultView() {
		Waits.wait2s();
		waitForElementVisibility(generalPromotionsdefault_large_listView, "5");
		int naturalWidth = generalPromotionsdefault_large_listView.getSize().getWidth();
		int naturalHeight = generalPromotionsdefault_large_listView.getSize().getHeight();
		return naturalWidth * naturalHeight;
	}

	public void clickOnViewDropDownWideDropDown() {
		Waits.wait1s();
		waitForElementClickable(viewDropDownWide, "20");
		click(viewDropDownWide);
	}

	public boolean isViewDropDownWideViewDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(viewDropDownWide);
	}

	public boolean isGeneralPromotionsFirstItemWideViewDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(generalPromotionsFirstItemWideView);
	}

	public void clickOnViewDropDownLarge() {
		Waits.wait1s();
		waitForElementClickable(viewDropDownLarge, "20");
		click(viewDropDownLarge);
	}

	public int getSizeOfLargeView() {
		Waits.wait2s();
		waitForElementVisibility(generalPromotionsdefault_large_listView, "5");
		int naturalWidth = generalPromotionsdefault_large_listView.getSize().getWidth();
		int naturalHeight = generalPromotionsdefault_large_listView.getSize().getHeight();
		return naturalWidth * naturalHeight;
	}

	public void clickOnViewDropDownList() {
		Waits.wait1s();
		waitForElementClickable(viewDropDownList, "20");
		click(viewDropDownList);
	}

	public int getSizeOfViewDropDownList() {
		Waits.wait2s();
		waitForElementVisibility(generalPromotionsdefault_large_listView, "5");
		int naturalWidth = generalPromotionsdefault_large_listView.getSize().getWidth();
		int naturalHeight = generalPromotionsdefault_large_listView.getSize().getHeight();
		return naturalWidth * naturalHeight;
	}

	public String getGeneralPromotionsItem1ImageSource() {
		return generalPromotionsItem1Image.getAttribute("src");
	}

	public void clickOnFeaturedProduct1LeftArrowButton() {
		Waits.wait1s();
		hoverAndClick(featuredProduct1LeftArrowButton, featuredProduct1LeftArrowButton);
	}

	public void clickOnFeaturedProduct1RightArrowButton() {
		Waits.wait1s();
		hoverAndClick(featuredProduct1RightArrowButton, featuredProduct1RightArrowButton);

	}

	public void clickOnFeaturedProductFilterInstock() {
		Waits.wait1s();
		hoverAndClick(featuredProductFilterInstock, featuredProductFilterInstock);

	}

	public void hoverOverGeneralPromotionsItem1Image() {
		Waits.wait1s();
		hoverOverElement(generalPromotionsItem1Image);
	}

	public boolean scrollDownToGeneralPromotionsPaginationLastPageNumber() {
		Waits.wait5s();
		scrollIntoView(generalPromotionsPaginationLastPageNumber);
		return isElementDisplayed(generalPromotionsPaginationLastPageNumber);
	}
	
	public void scrollToNoProductFoundMessage() {
		scrollIntoView(noProductsFoundMsg);

	}

	public boolean scrollDownToGeneralPromotionsFiltersHeading() {
		Waits.wait5s();
		scrollIntoView(generalPromotionsFiltersHeading);
		return isElementDisplayed(generalPromotionsFiltersHeading);
	}

	public String getDescriptionOfGeneralPromotionsPaginationLastPageNumber() {
		Waits.wait2s();
		waitForElementVisibility(generalPromotionsPaginationLastPageNumber, "5");
		return getElementTextWithoutTrim(generalPromotionsPaginationLastPageNumber);
	}

	public boolean scrollToGeneralPromotionsFiltersEarnPoint() {
		scrollIntoView(promotionsPageTitle);
		return isElementDisplayed(promotionsPageTitle);
	}

	public boolean scrollToViewDropDown() {
		scrollIntoView(viewDropDown);
		return isElementDisplayed(viewDropDown);
	}

	public boolean scrollTogeneralPromotionsFiltersPreferred() {
		scrollIntoView(generalPromotionsFiltersPreferred);
		return isElementDisplayed(generalPromotionsFiltersPreferred);
	}

	public void clickOnGeneralPromotionsFiltersPreferred() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersPreferred, generalPromotionsFiltersPreferred);
	}

	public void clickOnGeneralPromotionsFiltersEarnPoint() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersEarnPoint, generalPromotionsFiltersEarnPoint);
	}

	public void clickOnGeneralPromotionsFiltersRedeemPoint() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersRedeemPoints, generalPromotionsFiltersRedeemPoints);
	}

	public void clickOnGeneralPromotionsFiltersMyFavorites() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersMyFavorites, generalPromotionsFiltersMyFavorites);
	}

	public void clickOnGeneralPromotionsFiltersPreviousOrders() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersPreviousOrders, generalPromotionsFiltersPreviousOrders);
	}

	public void clickOnGeneralPromotionsFiltersRebate() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersRebate, generalPromotionsFiltersRebate);
	}

	public void clickOnGeneralPromotionsFilterPriceAll() {
		Waits.wait2s();
		hoverAndClick(priceFilterAll, priceFilterAll);
	}

	public void clickOnGeneralPromotionsFilterPriceBelow10Dollar() {
		Waits.wait2s();
		hoverAndClick(priceFilterBelow10Dollar, priceFilterBelow10Dollar);
	}

	public void clickOnGeneralPromotionsFilterPrice10To100Dollar() {
		Waits.wait2s();
		hoverAndClick(priceFilter10To100Dollar, priceFilter10To100Dollar);
	}

	public void clickOnGeneralPromotionsFilterPrice100To500Dollar() {
		Waits.wait2s();
		hoverAndClick(priceFilter100To500Dollar, priceFilter100To500Dollar);
	}

	public void clickOnGeneralPromotionsFilterPriceAbove500Dollar() {
		Waits.wait2s();
		hoverAndClick(priceFilterAbove500Dollar, priceFilterAbove500Dollar);
	}

	public void clickOnGeneralPromotionsFiltersPromotion() {
		Waits.wait2s();
		hoverAndClick(generalPromotionsFiltersPromotion, generalPromotionsFiltersPromotion);
	}

	public double getNumberOfGeneralPromotionsItems() {
		Waits.wait1s();
		return generalPromotionsItems.size();
	}

	public double getNumberOfGeneralPromotionsItemsWithEarnPoints() {
		Waits.wait1s();
		return ItemsWithEarnPoints.size();
	}

	public double getNumberOfGeneralPromotionsItemsWithRedeemPoints() {
		Waits.wait1s();
		return ItemsWithRedeemPoints.size();
	}

	public double getNumberOfGeneralPromotionsItemsWithMyFavoritesButton() {
		Waits.wait1s();
		return ItemsWithMyFavoritesButton.size();
	}

	public boolean isFiltersEarnPointChecked() {
		return (generalPromotionsFiltersEarnPoint.getAttribute("checked") != null);
	}

	public boolean isProductNameAZSortByDisplaying() {
		return isElementDisplayed(productNameAZSortBy);
	}

	public boolean isAllPriceFilterSelected() {
		return priceFilterAll.isSelected();
	}

	public boolean is10To100DollarPriceFilterSelected() {
		return priceFilter10To100Dollar.isSelected();
	}

	public boolean is100To500DollarPriceFilterSelected() {
		return priceFilter100To500Dollar.isSelected();
	}

	public boolean isAbove500DollarPriceFilterSelected() {
		return priceFilterAbove500Dollar.isSelected();
	}
}
