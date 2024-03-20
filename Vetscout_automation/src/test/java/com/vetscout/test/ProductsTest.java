package com.vetscout.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.OrdersPage;
import com.vetscout.pages.SingupPage;
import com.vetscout.utilities.Waits;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.pages.ProductsPage;

public class ProductsTest extends BaseClass {
	@Test(priority = 1)
	public void TC_ID_77_VerifyUserIsAbleToRedirectedToSpecificProductsListingByClickingOnTheProductCategory()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify is Product Heading <b>Administration And Transfusion</b> is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAllProductHeadingAdministrationAndTransfusionDisplaying(),
				"Verified is Product Heading <b>Administration And Transfusion</b> is Displaying");

	}

	@Test(priority = 2)
	public void TC_ID_78_VerifyUserIsAbleToSeeTheCorrectNumberOfProductsInFrontOfEachProductCategory()
			throws InterruptedException {

		login();
		
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see correct number of product infront of each category");
		ErrorCollector.verifyTrue(
				productsPage.getAllProductCountInAdministrationAndTransfusion() == productsPage
						.getNumberOfAllProductInAdministrationAndTransfusion(),
				"Verified : User is able to see correct number of product infront of each category");

	}

	@Test(priority = 2)
	public void TC_ID_79_VerifyUserIsAbleToChangeTheViewOnTheProductsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify is Product Heading <b>Administration And Transfusion</b> is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAllProductHeadingAdministrationAndTransfusionDisplaying(),
				"Verified is Product Heading <b>Administration And Transfusion</b> is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On View Drop Down Wide Option");
		promotionsPage.clickOnViewDropDownWideDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Wide</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(promotionsPage.isGeneralPromotionsFirstItemWideViewDisplaying(),
				"Verified : <b>Wide</b> view of products should get display on 'General Promotions' page");

	}

	
	
	
	@Test(priority = 4)
	public void TC_ID_80_VerifyUserIsAbleToSortProductsOnTheProductPageByAlphabeticalOrder()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
	
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify is Product Heading <b>Administration And Transfusion</b> is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAllProductHeadingAdministrationAndTransfusionDisplaying(),
				"Verified is Product Heading <b>Administration And Transfusion</b> is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on product name z-a");
		promotionsPage.clickOnSortByDropDownProductNameA_Z();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on product name z-a");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedAcendingStringArray(AfterSortingStringList));
	}
	
	

	@Test(priority = 3)
	public void TC_ID_81_VerifyUserIsAbleToSortProductOnTheProductCategoryPageByPricing() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();

	
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		waitfor3sec();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		productsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Lowest Price");
		productsPage.clickOnSortByDropDownProductNameLowestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = promotionsPage.getSortedDecendingDoubleArray(BeforeSortingDoubleList);

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see filtered products with selected pricing");
		ErrorCollector.verifyTrue(AfterSortingDoubleList.get(0) < 10,
				"Verified User is able to see filtered products with selected pricing");

	}



	@Test(priority = 5)
	public void TC_ID_82_VerifyUserIsAbleToSeeTheProductCategoryNameOnTheTopOfProductCategoryPage()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see product category name on the top of the page");
		ErrorCollector.verifyTrue(productsPage.isAllProductHeadingAdministrationAndTransfusionDisplaying(),
				"Verified User is able to see product category name on the top of the page");

	}

	

	@Test(priority = 6)
	public void TC_ID_83_VerifyUserIsAbleToFilterProductsOnTheProductCategoryPageByFiltersAvailableOnTheLeftTopCategory()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();



		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Earn point</b> filter");
		promotionsPage.clickOnGeneralPromotionsFiltersRebate(); 

		
		if(productsPage.isNoProductsFoundMessageDisplaying()) {
			ErrorCollector.extentLogInfo("Step " + (++step)
					+ " : No Product found against <b>Rebate</b> filter ");
			
		}else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
			promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
			int numberOfResultsAfter = Integer
					.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Rebate</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Rebate</b> filter");
		
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}



	@Test(priority = 7)
	public void TC_ID_84_VerifyUserIsAbleToFilterProductsByAvailabilityOnTheProductCategoryPage()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();



		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>In Stock</b> filter");
		promotionsPage.clickOnFeaturedProductFilterInstock();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify Number of Results have changed after applying <b>In Stock</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>In Stock</b> filter");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}
	


	
	@Test(priority = 10)
	public void TC_ID_85_VerifyUserIsAbleToFilterProductsByPriceOnTheProductCategoryPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor3sec();
		
		
		promotionsPage.clickOnGeneralPromotionsFilterPriceBelow10Dollar();

		waitfor3sec();

		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>All</b> Filter");
		promotionsPage.clickOnGeneralPromotionsFilterPriceAll();

		waitfor3sec();

		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are updated on the basis of 'All' Price Filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter > numberOfResultsFirst,
				"Verified : Products are updated on the basis of 'All' Price Filter ");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	@Test(priority = 8)
	public void TC_ID_86_VerifyUserIsAbleToFilterProductsByManufacturerOnTheProductCategoryPage()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Manufacturer</b> filter");
		productsPage.scrollToProductsPriceHeading();
		productsPage.clickOnManufacturerFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Manufacturer</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Manufacturer</b> filter");

		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}



	 @Test(priority = 8)
	public void TC_ID_87_VerifyUserIsAbleToFilterProductsByVendorsOnTheProductCategoryPage()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Vendors</b> filter");
		productsPage.scrollToVendorHeading();
		productsPage.clickOnVendorFilter();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see filtered product from a specific Vendor");
		ErrorCollector.verifyTrue(productsPage.isProductVendorImageDisplaying(),
				"Verified : User is able to see filtered product from a specific Vendor");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	



	@Test(priority = 9)
	public void TC_ID_88_VerifyUserIsAbleToRedirectedToProductDetailPageByClickingOnTheProductImageOrTitleFromTheProductCategoryPage()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Administration And Transfusion</b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On product Image");
		productsPage.clickOnProductImage1();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is redirected to product detail page");
		ErrorCollector.verifyTrue(productsPage.isDetailPageReviewDisplaying(),
				"Verified User is redirected to product detail page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}


	

	@Test(priority = 10)
	public void TC_ID_89_VerifyUserIsAbleToAddToCartProductFromProductCategoryPage() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On First Product Category");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

		

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Add to cart button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'View in Cart' Message is Displaying");
		ErrorCollector.verifyTrue(productsPage.isViewInCartDisplaying(),
				" : Verified 'View in Cart' Message is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	

	 @Test(priority = 10)
	public void TC_ID_90_VerifyUserIsAbleToSeeLastOrderedDateOnTheProductCardWhichYouAlreadyOrderedBefore()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify last Ordered date is Displaying");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified last Ordered date is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}


	
	
	@Test(priority = 11)
	public void TC_ID_91_VerifyUserIsAbleToSeeAllFavouriteProductsOnTheFavoriteProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");
		
		productsPage.getRefreshWebPage();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see correct number of product infront of each category");
		ErrorCollector.verifyTrue(productsPage.getAllProductsSize() == productsPage.getAllProductWithHeartIcons(),
				"Verified : User is able to see correct number of product infront of each category");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 12)
	public void TC_ID_92_VerifyUserIsAbleToSearchFavouriteProductsByName() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		String productToSearch = "EnteDerm Ointmen";

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		int ResultsBefore = promotionsPage.getNumberofResultsShowing();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Enter <b>" + productToSearch + "</b> Into Prodcut Name Search Bar ");
		productsPage.enterIntoSearchBarProduct(productToSearch);

		if (productsPage.isNoProductsFoundMessageDisplaying())
			ErrorCollector
					.extentLogInfo("Step " + (++step) + " : No product found against <b>" + productToSearch + "</b>");
		else {

			int ResultsAfter = promotionsPage.getNumberofResultsShowing();

			String resultText = promotionsPage.getTextOfSearchedResults();

			ErrorCollector
					.extentLogInfo("Step " + (++step) + " : Verify Searched product should be displayed on the page");
			ErrorCollector.verifyTrue(resultText.toLowerCase().contains(productToSearch.toLowerCase()),
					"Verified Searched product is displaying on the page");

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Results count updated");
			ErrorCollector.verifyTrue(ResultsBefore > ResultsAfter, "Verified Results count updated");

		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	 @Test(priority = 13)
	public void TC_ID_93_VerifyUserIsAbleToSearchFavouriteProductsByManufacturer() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		String manufacturerToSearch = "Royal Canin";

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		int ResultsBefore = promotionsPage.getNumberofResultsShowing();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Enter <b>Royal Canin</b> the field label with 'Manufacturer' ");
		productsPage.enterSearchBarManufacturer(manufacturerToSearch);

		int ResultsAfter = promotionsPage.getNumberofResultsShowing();

		String resultText = promotionsPage.getTextOfSearchResultsManufacturer();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Searched product <b>" + manufacturerToSearch
				+ "</b> is be displayed on the page");
		ErrorCollector.verifyTrue(resultText.toLowerCase().contains(manufacturerToSearch.toLowerCase()),
				"Verified Searched product <b>" + manufacturerToSearch + "</b> is be displayed on the page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Results count updated");
		ErrorCollector.verifyTrue(ResultsBefore > ResultsAfter, "Verified Results count updated");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	

	@Test(priority = 14)
	public void TC_ID_94_VerifyUserIsAbleToSortFavouriteProductByAlphabaticalOrder() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		productsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on product name z-a");
		productsPage.clickOnSortbyDropDownProductNameZ_A();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 15)
	public void TC_ID_95_VerifyUserIsAbleToSortFavouriteProductByPricing() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		productsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Lowest Price");
		productsPage.clickOnSortByDropDownProductNameLowestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = BeforeSortingDoubleList;

		ErrorCollector.extentLogInfo("Before Sorting Double List" + " : "
				+ promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver));

		ErrorCollector.extentLogInfo("After Sorting Double List" + " : "
				+ promotionsPage.getSortedAcendingDoubleArray(AfterSortingDoubleList));

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " :Products should get sort on the basis of 'Lowest Price' on 'General Promotions' page");
		assertEquals(BeforeSortingDoubleList, promotionsPage.getSortedAcendingDoubleArray(AfterSortingDoubleList));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	@Test(priority = 15)
	public void TC_ID_99_VerifyUserIsAbleToSeeLastOrderedDateOnTheFavouriteProductsWhichAreOrderedAsWell()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		productsPage.getRefreshWebPage();
		waitfor3sec();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify last Ordered date is Displaying");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified last Ordered date is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}




	@Test(priority = 20)
	public void TC_ID_97_VerifyUserIsAbleToRemoveFavouriteProductFromTheFavouritesProductPage()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");
		
		productsPage.getRefreshWebPage();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String productName = productsPage.getDescriptionOfFirstProductInMyFavorite();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Heart</b> Shaped Icon");
		promotionsPage.clickSearchResultsFirstItemHeartIcon1();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Refresh Page");
		productsPage.getRefreshWebPage();
		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Enter <b>" + productName + "</b> Into Prodcut Name Search Bar ");
		productsPage.enterIntoSearchBarProduct(productName);

		waitfor10sec();
		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify Searched product should not be displayed on the page");
		ErrorCollector.verifyTrue(productsPage.isNoProductsFoundMessageDisplaying(),
				"Verified Searched product is not displaying on the page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	
	@Test(priority = 20)
	public void TC_ID_98_VerifyUserIsAbleToExportAllFavouriteProductsInSheet() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Export Button");
		productsPage.clickOnExportButton();

		String userDirectory = System.getProperty("user.home")+"\\Downloads";

		waitfor10sec();
	
		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify All favourite products list exported successfully");
		ErrorCollector.verifyTrue(productsPage.isFileDownloaded(userDirectory, "WISHLIST_ITEM.xlsx"),
				"Verified All favourite products list exported successfully");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 18)
	public void TC_ID_100_VerifyUserIsAbleToSeeViewInCartButtonOnTheProductsCardWhichAreAlreadyInCart()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");
		
		productsPage.getRefreshWebPage();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		waitfor5sec();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;
		
		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Pop up button");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'View in Cart' Message is Displaying");
		ErrorCollector.verifyTrue(productsPage.isViewInCartDisplaying(),
				" : Verified 'View in Cart' Message is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 17)
	public void TC_ID_101_VerifyUserIsAbleToAddToCartFavouriteProductByClickingOnAddToCartButtonAvailableOnTheProductCard()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");
		
		productsPage.getRefreshWebPage();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		
		waitfor5sec();
		
		
		

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;
		
		for (Integer i = 1; i <= promotionsItems; i++) {
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Pop up button");
			productsPage.clickOnAddToCartButtonPopUp();


			if (productsPage.isAddedToCartMessageDisplaying()) {
				
				break;
				
			}
			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	@Test(priority = 16)
	public void TC_ID_102VerifyUserIsAbleToSeeAddToCartButtonOnAllPrdouctsCardIfProductIsAlreadyNotInTheCart()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");
		
		productsPage.getRefreshWebPage();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Add to Cart Button is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddToCartButtonDisplaying(),
				" : Verified Add to Cart Button is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	

	
	@Test(priority = 21)
	public void TC_ID_105_VerifyUserIsAbleToChangeTheViewOnTheFavoriteProductsPage() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " :click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On View Drop Down Wide Option");
		productsPage.clickOnViewDropDownWide();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Wide</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(promotionsPage.isGeneralPromotionsFirstItemWideViewDisplaying(),
				"Verified : <b>Wide</b> view of products should get display on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	

	@Test(priority = 24)
	public void TC_ID_106_VerifyUserIsAbleToSeeProductsFromThePreviousOrdersOnThePreviousOrdersPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Previous Order' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPreviousOrdersPageTitleDisplaying(),
				" : Verified 'Previous Order' Page Title is displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	


	@Test(priority = 27)
	public void TC_ID_107_VerifyUserIsAbleToSearchPreviousOrderedProductsByName() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();

		int step = 5;
	
		String SearchProduct = PropertiesReader.getPropertyValue("searchproduct");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		int ResultsBefore = promotionsPage.getNumberofResultsShowing();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Enter <b>"+SearchProduct+"</b> Into Prodcut Name Search Bar ");
		productsPage.enterIntoSearchBarProduct(SearchProduct);

		int ResultsAfter = promotionsPage.getNumberofResultsShowing();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Searched product should be displayed on the page");
		ErrorCollector.verifyTrue(
				new String(promotionsPage.getTextOfSearchedResults()).equalsIgnoreCase(SearchProduct),
				"Verified Searched product is displaying on the page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Results count updated");
		ErrorCollector.verifyTrue(ResultsBefore > ResultsAfter, "Verified Results count updated");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	

	@Test(priority = 29)
	public void TC_ID_109_VerifyUserIsAbleToSortPreviousOrderedProductsByAlphabaticalOrder()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		productsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on product name z-a");
		productsPage.clickOnSortbyDropDownProductNameZ_A();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	@Test(priority = 30)
	public void TC_ID_110_VerifyUserIsAbleToSortPreviousOrderedProductsByPricing() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		productsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Lowest Price");
		productsPage.clickOnSortByDropDownProductNameLowestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = BeforeSortingDoubleList;

		ErrorCollector.extentLogInfo("Before Sorting Double List" + " : "
				+ promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver));

		ErrorCollector.extentLogInfo("After Sorting Double List" + " : "
				+ promotionsPage.getSortedAcendingDoubleArray(AfterSortingDoubleList));

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " :Products should get sort on the basis of 'Lowest Price' on 'General Promotions' page");
		assertEquals(BeforeSortingDoubleList, promotionsPage.getSortedAcendingDoubleArray(AfterSortingDoubleList));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 31)
	public void TC_ID_112_VerifyUserIsAbleToAddPreviousOrderedProductsToTheFavouritesProductPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Heart</b> Shaped Icon");
		promotionsPage.clickSearchResultsFirstItemHeartIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 32)
	public void TC_ID_113_VerifyUserIsAbleToExportAllPreviousOrderedProductsInSheet() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Export Button");
		productsPage.clickOnExportButton();

		String userDirectory = System.getProperty("user.home")+"\\Downloads";

		waitfor10sec();
		
		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify All favourite products list exported successfully");
		ErrorCollector.verifyTrue(productsPage.isFileDownloaded(userDirectory, "MY_PRODUCT.xlsx"),
				"Verified All favourite products list exported successfully");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	@Test(priority = 33)
	public void TC_ID_114VerifyUserIsAbleToSeeLastOrderedDateOnAllPreviousOrderedProducts()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify User is able to see all previously ordered products");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithEarnPoints = productsPage.getNumberOfProductsWithLastOrdered();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see filtered product from a specific manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithEarnPoints,
				"Verified : User is able to see filtered product from a specific manufacturer");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	
	
	@Test(priority = 35)
	public void TC_ID_116_VerifyUserIsAbleToAddToCartPreviousOrderedProductsByClickingOnAddToCartButtonAvailableOnTheProductCard()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;
			} else {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'OK' Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Close' Button");
				productsPage.clickOnCloseButton();

			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 36)
	public void TC_ID_117_VerifyUserIsAbleToSeeAddToCartButtonOnAllPrdouctsCardIfProductIsAlreadyNotInthecart()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();
		
		
		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Add to Cart Button is Displaying");
				ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
						" : Verified Add to Cart Button is Displaying");
				break;
			} else {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'OK' Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Close' Button");
				productsPage.clickOnCloseButton();

			}
		}


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 37)
	public void TC_ID_119_VerifyAddToCartButtonChangedWithViewInCartButtonWhenProductAddedToTheCart()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' Button ");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();
			
			waitfor3sec();
			if(productsPage.isAddedToCartMessageDisplaying()) {
				
				break;
			} else {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Ok' Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Close' Button");
				productsPage.clickOnCloseButton();

			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'View in Cart' Message is Displaying");
		ErrorCollector.verifyTrue(productsPage.isFirstItemWithViewItemButtonDisplaying(descriptionOfFirstItem),
				" : Verified 'View in Cart' Message is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 38)
	public void TC_ID_120VerifyUserIsAbleToChangeTheViewOnTheFavouritesProductsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On View Drop Down Wide Option");
		productsPage.clickOnViewDropDownWide();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Wide</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(promotionsPage.isGeneralPromotionsFirstItemWideViewDisplaying(),
				"Verified : <b>Wide</b> view of products should get display on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	
	//@Test(priority = 45)
	public void TC_ID_161VerifyUserIsAbleToSeeTooltipOnHoveringOverTheEarnPointsIconOnTheAddToCartPopup()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isVendorAvailablityCheckboxDisplaying()) {
				break;
			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();
			}
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'is vendor Availablity Checkbox' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorAvailablityCheckboxDisplaying(),
				": Verified 'is vendor Availablity Checkbox' is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover Onadded To Cart MessageEarnpoint");
		productsPage.hoverOnAddedToCartMessageEarnpoint();

		ErrorCollector.extentLogInfo("Step " + (++step) + "Verify :  Is earn Point Tool Tip Displaying");
		ErrorCollector.verifyTrue(productsPage.isEarnPointToolTipDisplaying(),
				"Verified : Is earn Point Tool Tip Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 46)
	public void TC_ID_160VerifyUserIsAbleToSeeEarnPointsIconInFrontOfVendorWhoIsOfferingPoints()
			throws InterruptedException {

		login();
		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isVendorAvailablityCheckboxDisplaying()) {
				break;
			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();
			}
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'is vendor Availablity Checkbox' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorAvailablityCheckboxDisplaying(),
				": Verified 'is vendor Availablity Checkbox' is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + "Verify :  Is earn Point Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageEarnpointDisplaying(),
				"Verified : Is earn Point Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 50)
	public void TC_ID_157VerifyUserIsAbleToSeeTooltipOnHoveringOverTheAnnouncementPromotionIconAvailableInFrontOfVendorOnAddToCartPopup()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isVendorAvailablityIconDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'is vendor Availablity Checkbox' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorAvailablityIconDisplaying(),
				": Verified 'is vendor Availablity Checkbox' is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover On vendor Availablity Icon");
		productsPage.hoverOnVendorAvailablityIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + "Verify :  Is Vendor availability Tool Tip Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddToCartToolTipDisplaying(),
				"Verified : Is Vendor availability Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	
	//@Test(priority = 50)
	public void TC_ID_162AddToCartVerifyUserIsAbleToSeeRedeemPointsIconInFrontOfVendorWhoIsOfferingPoints()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Redeem point</b> filter");
		promotionsPage.scrollToGeneralPromotionsFiltersEarnPoint();

		promotionsPage.clickOnGeneralPromotionsFiltersRedeemPoint();
		String descriptionOfFirstItem;

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isaddToCartRedeemPointDisplaying()) {
				break;
			}

			else {
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is add To Cart Redeem Point is Displaying");
		ErrorCollector.verifyTrue(productsPage.isaddToCartRedeemPointDisplaying(),
				": Verified Is Add To Cart Redeem Point Is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 50)
	public void TC_ID_163VerifyUserIsAbleToSeeTooltipOnHoveringOverTheRedeemPointsIconInFrontOfVendorsWhoIsOfferingRedeemOptionOnTheAddToCartPopup()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Redeem point</b> filter");
		promotionsPage.scrollToGeneralPromotionsFiltersEarnPoint();

		promotionsPage.clickOnGeneralPromotionsFiltersRedeemPoint();
		String descriptionOfFirstItem;

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isaddToCartRedeemPointDisplaying()) {
				break;
			}

			else {
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is add To Cart Redeem Point is Displaying");
		ErrorCollector.verifyTrue(productsPage.isaddToCartRedeemPointDisplaying(),
				": Verified Is Add To Cart Redeem Point Is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover On Redeem Point Icon");
		productsPage.hoverOnaddToCartRedeemPointIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + "Verify :  Is Redeem Point Tool Tip Displaying");
		ErrorCollector.verifyTrue(productsPage.isredeemPointToolTipDisplaying(),
				"Verified : Is Redeem Point Tool Tip Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

	

	@Test(priority = 50)
	public void TC_ID_170VerifyUserIsAbleToSeeProductsWhichAreAddedInTheCartOnCartPage() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem;
		
		productsPage.waitUnitlPageLoad();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 50)
	public void TC_ID_171VerifyUserIsAbleToSeeProductInTheCartWhichIsAddedToTheCartVendorWise() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = null;
		
		productsPage.waitUnitlPageLoad();


		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see the product which is added to the cartt");
		ErrorCollector.verifyTrue(productsPage.iscartItemsDisplaying(descriptionOfFirstItem),
				": Verified User is able to see the product which is added to the cart");

	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 50)
	public void TC_ID_172VerifyUserIsAbleToSeeProductImageInTheCartWhichIsAddedToTheCart() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		productsPage.waitUnitlPageLoad();

		
		String descriptionOfFirstItem = null;

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see description of the product which is added to the cartt");
		ErrorCollector.verifyTrue(productsPage.iscartItemsDisplaying(descriptionOfFirstItem),
				": Verified User is able to see description of the product which is added to the cart");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see product image in the cart which is added to the cart");
		ErrorCollector.verifyTrue(productsPage.getcartPageItemsImage() == productsPage.getcartPageItems(),
				": Verified User is able to see product image in the cart which is added to the cart");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 50)
	public void TC_ID_173VerifyUserIsAbleToSeeDescriptionOfTheProductWhichIsAddedToTheCart()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		
		productsPage.waitUnitlPageLoad();


		String descriptionOfFirstItem = null;

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify the description in front of each product");
		ErrorCollector.verifyTrue(productsPage.getcartPageItemsImage() == productsPage.getcartPageItems(),
				": Verified the description in front of each product");

		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see description of the product which is added to the cartt");
		ErrorCollector.verifyTrue(productsPage.iscartItemsDisplaying(descriptionOfFirstItem),
				": Verified User is able to see description of the product which is added to the cart");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 50)
	public void TC_ID_175VerifyUserIsAbleToSeeVendorsAlongWithPriceAndAnnoucement()
			throws InterruptedException {

		login();
		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		waitfor5sec();
		
		
		
		try {
			productsPage.waitUnitlPageLoad();

		} catch (Exception e) {
			productsPage.clickNextPageButton("2");	
			productsPage.waitUnitlPageLoad();

		}



		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {

			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isPromotionIconDisplaying()) {
				break;
			}

			else {
			
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		

	}

		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see prices of the product");
		ErrorCollector.verifyTrue(productsPage.isProductPricePopUpDisplaying(),
				": Verified User is able to see prices of the product");
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to 'Promotion Icon'");
		ErrorCollector.verifyTrue(productsPage.isPromotionIconDisplaying(),
				": Verified User is able to 'Promotion Icon'");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover over 'Promotion Icon'");
		productsPage.hoverPromotionIcon();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see 'Promotion detail'");
		ErrorCollector.verifyTrue(productsPage.isPromotionToolTipDisplaying(),
				": Verified  User is able to see 'Promotion detail'");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();




	}

	
	@Test(priority = 50)
	public void TC_ID_176VerifyUserIsAbleToAdjustQuantityOfEachProductByIncrementAndDecrementTheQuantityCounter()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		
		productsPage.waitUnitlPageLoad();


		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see description of the product which is added to the cart");
		ErrorCollector.verifyTrue(productsPage.iscartItemsDisplaying(descriptionOfFirstItem),
				": Verified User is able to see description of the product which is added to the cart");

		waitfor3sec();

		int numberOfResultsFirst = Integer.parseInt(productsPage.getQuantityTextDescription());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click Onquantity increase AddtoCart PopUp");
		productsPage.clickOnQuantityIncreaseAddtoCartPopUp();

		int numberOfResultsAfter = Integer.parseInt(productsPage.getQuantityTextDescription());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  User is able to adjust quantity of product by increment and decrement the quantity counter");
		ErrorCollector.verifyTrue(numberOfResultsAfter > numberOfResultsFirst,
				"Verified : User is able to adjust quantity of product by increment and decrement the quantity counter");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 50)
	public void TC_ID_177VerifyUserIsAbleToDeleteTheProductFromTheCart() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		productsPage.waitUnitlPageLoad();

		
		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see description of the product which is added to the cart");
		ErrorCollector.verifyTrue(productsPage.iscartItemsDisplaying(descriptionOfFirstItem),
				": Verified User is able to see description of the product which is added to the cart");
		
		waitfor3sec();

		int itemSizeBefore = productsPage.getNumberOfItemsOnCart();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On delete Icon Button");
		productsPage.clickOndeleteIconButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On delete Icon Button Confirmation");
		productsPage.clickOnYesRemoveButtonCartPage();
		
		getRefreshWebPage();
		waitfor3sec();
		int itemSizeAfter = productsPage.getNumberOfItemsOnCart();

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Product deleted successfully");
		ErrorCollector.verifyTrue(itemSizeBefore > itemSizeAfter, ": Product deleted successfully");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 50)
	public void TC_ID_178VerifyThatTheProductAddedInTheCartIsDividedIntoTwoSections() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		
		productsPage.waitUnitlPageLoad();


		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}
		
		waitfor3sec();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Vendor Image Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorImageDisplaying(), ": Verify is Vendor Image Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Total Price Displaying");
		ErrorCollector.verifyTrue(productsPage.isTotalPriceDisplaying(), ": Verify is Total Price Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Place Order Button Displaying");
		ErrorCollector.verifyTrue(productsPage.isPlaceOrderButtonDisplaying(),
				": Verify is Place Order Button Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Product Image Displaying");
		ErrorCollector.verifyTrue(productsPage.isProductImageDisplaying(), ": Verify is Product Image Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Description Displaying");
		ErrorCollector.verifyTrue(productsPage.isDescriptionDisplaying(), ": Verify is Description Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Price Displaying");
		ErrorCollector.verifyTrue(productsPage.isPriceDisplaying(), ": Verify is Price Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Quantity Displaying");
		ErrorCollector.verifyTrue(productsPage.isQuantityDisplaying(), ": Verify is Quantity Displaying");

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Delete produc button Displaying");
		ErrorCollector.verifyTrue(productsPage.isDeleteproducbuttonDisplaying(),
				": Verify is Delete produc button Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 50)
	public void TC_ID_179VerifyTheTotalPriceUpdatedWhenUserIncreaseOrDecreaseTheQuantityOfTheProduct()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		
		productsPage.waitUnitlPageLoad();


		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}
		
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		Double numberOfResultsBefore = Double.parseDouble(productsPage.getFirstTotalPrice());

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Increment the quantity counter available in front of each product");
		productsPage.clickOnQuantityIncreaseAddtoCartPopUp();

		Waits.wait3s();
		Double numberOfResultsAfter = Double.parseDouble(productsPage.getFirstTotalPrice());

		ErrorCollector.verifyTrue(numberOfResultsBefore < numberOfResultsAfter, ": Total price updated successfully");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	



	@Test(priority = 50)
	public void TC_ID_180VerifyUserIsAbleToSeeThePlaceOrderButtonInTheUpperSectionOfEachVendorSection()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				
				productsPage.clickOnContinueShoppingButton();
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		homePage.clickOnNavigationCard();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");
		productsPage.getNumberOfPlaceOrderButtonList();
		productsPage.getNumberOfVendorsHeaderCarPageList();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Place order button is available on the upper section of the each vendor section");
		ErrorCollector.verifyTrue(
				productsPage.getNumberOfPlaceOrderButtonList() == productsPage.getNumberOfVendorsHeaderCarPageList(),
				": Verified Place order button is available on the upper section of the each vendor section");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	@Test(priority = 55)
	public void TC_ID_159verifyUserIsAbleToSeeAddToCartProductIfQuickCartSummaryIsDisabled()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		OrdersPage ordersPage = new OrdersPage();
		
		
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		
		waitfor3sec();

		
		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		boolean productAdded = false;
		
		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				
				 if(productAdded)
						break;
				 
				ErrorCollector.extentLogInfo(
						"Step " + (++step) + " : Click On Quick cart summary<b>Do not show in future</b> Checkbox");
				productsPage.clickOnQuickCartSummaryDisable();

				ErrorCollector
						.extentLogInfo("Step " + (++step) + " : Click On Quick cart summary<b>Continue Shoping</b> Button");
				productsPage.clickOnContinueShoppingButton();

				productAdded = true;
				
			}else if(productAdded)
				break;
			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User able to 'Add product' directly to the cart");
		ErrorCollector.verifyTrue(!productsPage.isAddedToCartMessageDisplaying(),
				" : Verified User able to 'Add product' directly to the cart");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	



	@Test(priority = 33)
	public void TC_ID_145UserIsAbleToAddProductToCartOnGeneralPromotionsPage() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		waitfor5sec();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;
		
		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Pop up button");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
				
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}
	
	
	@Test(priority = 35)
	public void TC_ID_147_UserIsAbleToSeeAddToCartPopupModalOnClickingAddToCart() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();



		waitfor5sec();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;
		
		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Pop up button");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
				
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' modal is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' modal is Displaying");

		productsPage.clickOnContinueShoppingButton();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	
	@Test(priority = 36)
	public void TC_ID_148UserIsAbleToCloseAddToCartpopupModalOnClickingAddToCart() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();


		waitfor5sec();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;
		
		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Pop up button");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
				
			}
		}
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Icon");
		productsPage.clickOnCloseButton();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Modal' is closed");
		ErrorCollector.verifyTrue(!productsPage.isAddedToCartMessageDisplaying(),
				" : Verified  'added To Cart Modal' is closed");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 37)
	public void TC_ID_149AddToCartVerifyUserIsAbleToSeeAddToCartPopupOnClickingAddToCartButtonOnAnyProduct()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();


		waitfor5sec();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;
		
		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on 'Add to Cart' Pop up button");
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
				
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' moda;l is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' modal is Displaying");

		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}



	@Test(priority = 47)
	public void TC_ID_152VerifyUserIsAbleToAdjustTheQuantityOfTheProductFromAddToCartPopup()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();
		
		
		int pageCounter = 1;
		int promotionsItems = productsPage.getNumberOfAddToCart();


		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			try {
				int numberOfResultsFirst = Integer.parseInt(productsPage.getQuantityTextDescription());

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On quantity Increase AddtoCart PopUp");
				productsPage.clickOnQuantityIncreaseAddtoCartPopUp();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
				promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
				int numberOfResultsAfter = Integer.parseInt(productsPage.getQuantityTextDescription());

				ErrorCollector.extentLogInfo("Step " + (++step) + "Verify : quantity has increased  ");
				ErrorCollector.verifyTrue(numberOfResultsAfter > numberOfResultsFirst, "Verified : quantity has increased  ");

				numberOfResultsFirst = numberOfResultsAfter;
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On quantity increase 'AddtoCart' PopUp");
				productsPage.clickOnQuantityDecreaseAddtoCartPopUp();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
				promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
				numberOfResultsAfter = Integer.parseInt(productsPage.getQuantityTextDescription());

				ErrorCollector.extentLogInfo("Step " + (++step) + "Verify : Quantity has decreased ");
				ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst, "Verified :  Quantity has decreased ");

				break;
			} catch (Exception e) {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();

			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
			}
		}

	

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	
	@Test(priority = 49)
	public void TC_ID_153VerifyUserIsAbleToSeeTheAvailabilityIconInFrontOfEachVendor() throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isVendorAvailablityIconDisplaying()) {
				break;
			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
			}
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'is vendor Availablity Checkbox' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorAvailablityIconDisplaying(),
				": Verified 'is vendor Availablity Checkbox' is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	


	@Test(priority = 50)
	public void TC_ID_156VerifyUserIsAbleToSeeAnnouncementpromotionIconInFrontOfVendorWhoAddedAnyAnnouncementpromotionForTheProduct()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
	
		waitfor5sec();;


		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' Button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isPromotionIconDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
			}
		}
		
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is 'Promotion Icon' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isPromotionIconDisplaying(),
				": Verified 'Promotion Icon' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	@Test(priority = 50)
	public void TC_ID_158verifyUserIsAbleToSeeQuickCartSummaryToTheCartBySelectingVendorAndQuantityAndClickingOnAddToCartButtonIfItIsNotDisable()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		productsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		productsPage.clickOnViewDropDownDefault();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : is Vendor Availablity Icon Displaying");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			if (productsPage.isVendorAvailablityIconDisplaying()) {
				break;
			}

			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
			
			if (i == promotionsItems && pageCounter<5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i=0;
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'is vendor Availablity Checkbox' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorAvailablityIconDisplaying(),
				": Verified ' vendor Availablity Checkbox' is Displayingg");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On quantity increase 'AddtoCart' PopUp");
		productsPage.clickOnQuantityIncreaseAddtoCartPopUp();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();

		productsPage.clickOnAddToCartButtonPopUp();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	
	@Test(priority = 42)
	public void TC_ID_164verifyUserIsAbleToSeeTheImageTitleAndQuantityOfEachProductsOnTheQuickCartSummaryPopup()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();


			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}

			if (i == promotionsItems && pageCounter < 5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i = 0;
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");
		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify added To Cart Pop Up product Image Div Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartPopUpproductImageDivDisplaying(),
				"Verified added To Cart Pop Upproduct Image Div Displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify added To Cart Pop Up Product Description is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartPopUpProductDescriptionDisplaying(),
				"Verified added To Cart Pop Up Product Description  is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify added To Cart Pop Up Items Count is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartPopUpItemsCountDisplaying(),
				"Verified added To Cart Pop Up Items Count is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 41)
	public void TC_ID_165VerifyUserIsAbleToSeeMessageYouVeAddedToYourCartAndItemsCountForTheItemsInTheCartOnTheQuickCartSummaryPopup()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();


			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}

			if (i == promotionsItems && pageCounter < 5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i = 0;
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Items Count' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartPopUpQtyDisplaying(),
				" : Verified 'Items Count' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 40)
	public void TC_ID_166QuickCartSummaryVerifyUserIsAbleToContinueShoppingByClickingOnContinueShoppingButtonAvailableOnTheQuickCartSummaryPopup()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();


		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();


			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}

			if (i == promotionsItems && pageCounter < 5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i = 0;
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}
	

	@Test(priority = 55)
	public void TC_ID_167verifyUserIsAbleToDisableQuickCartSummary()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		
		
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		
		waitfor3sec();

		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		boolean productAdded = false;
		
		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {
				
				 if(productAdded)
						break;
				 
				ErrorCollector.extentLogInfo(
						"Step " + (++step) + " : Click On Quick cart summary<b>Do not show in future</b> Checkbox");
				productsPage.clickOnQuickCartSummaryDisable();

				ErrorCollector
						.extentLogInfo("Step " + (++step) + " : Click On Quick cart summary<b>Continue Shoping</b> Button");
				productsPage.clickOnContinueShoppingButton();

				productAdded = true;
				
			}else if(productAdded)
				break;
			else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Quick cart summary' pop up is disabled");
		ErrorCollector.verifyTrue(!productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'Quick cart summary' pop up is disabled");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 39)
	public void TC_ID_168_QuickCartSummaryVerifyUserIsAbleToRedirectedToTheCartOnClickingViewCartButtonAvailableOnTheQuickCartSummaryPopup()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

	
		int promotionsItems = productsPage.getNumberOfAddToCart();
		int pageCounter = 1;

		for (Integer i = 1; i <= promotionsItems; i++) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On 'Add to cart' button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();


			if (productsPage.isAddedToCartMessageDisplaying()) {

				break;

			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}

			if (i == promotionsItems && pageCounter < 5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i = 0;
			}
		}
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify cart Page Heading Displaying");
		ErrorCollector.verifyTrue(productsPage.isCartPageHeadingDisplaying(),
				" : Verified cart Page Heading Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}


	

	@Test(priority = 43)
	public void TC_ID_169userIsAbleToCloseQuickCartSummaryPopupByClickingOnTheXButtonAvailableOnThePopup()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		waitfor3sec();

		String descriptionOfFirstItem = null;
		int promotionsItems = productsPage.getNumberOfAddToCart();

		boolean productAdded = false;

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			productsPage.clickOnFirstItemWithAddToCartButton(i);
			productsPage.clickOnAddToCartButtonPopUp();

			if (productsPage.isAddedToCartMessageDisplaying()) {

				ErrorCollector.extentLogInfo(
						"Step " + (++step) + " : Click On Quick cart summary<b> X </b> Button");
				productsPage.clickOnContinueShoppingButton();

				break;
			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
				productsPage.clickOnCloseButton();
			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Quick cart summary' pop up is Closed");
		ErrorCollector.verifyTrue(!productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'Quick cart summary' pop up is Closed");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}





}
