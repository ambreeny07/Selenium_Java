package com.vetscout.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.OrdersPage;
import com.vetscout.pages.ProductsPage;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.pages.RebatesPsiRebatesPage;
import com.vetscout.utilities.Waits;

public class Sort_Products_In_Orders extends BaseClass {

	ArrayList<String> BeforeSortingStringList = new ArrayList<>();
	ArrayList<String> AfterSortingStringList = new ArrayList<>();


	@Test(priority = 39)
	public void TC_241VerifyUserIsAbleToFilterProductByProductByDateRange() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Order</b> option");
		homePage.hoverOrdersAndClickByProduct();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnSelectDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnUpdateDateBtn();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_241 Verify user is able to filter products by 'Date Range' </b>");
		ErrorCollector.verifyTrue(ordersPage.isInRangeOrdersDisplaying(),
				": Verified user is able to filter products by 'Date Range'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 22)
	public void TC_240_242_VerifyUserIsAbleToFilterProductsByVendors() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;

		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY PRODUCT</b> option");
		homePage.hoverOrdersAndClickByProduct();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_ID_242 Verify user is able to see product image, Product description, Order id, Vendor, Price, Quantity, and ordered date on each product block</ b>");

		ErrorCollector.verifyTrue(ordersPage.isProductImageInOrdersPageDisplaying(),
				": Verified User is able to see product image in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductDescriptionInOrdersPageDisplaying(),
				": Verified User is able to see product description in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductVendorInOrderPageDisplaying(),
				": Verified User is able to see product vendor in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductPriceInOrderPageDisplaying(),
				": Verified User is able to see product price in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductQuantityInOrderPageDisplaying(),
				": Verified User is able to see product quantity in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductDateInOrderPageDisplaying(),
				": Verified User is able to see product ordered date in product block ");

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_ID_240 Verify User is able to see product by selected vendor </b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Select vendor");
		String descriptionOfProductVendor = ordersPage.clickVendorDrodpown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selected vendor : " + descriptionOfProductVendor);

		ErrorCollector.verifyTrue(ordersPage.isProductVendorDisplaying(),
				": Verified User is able to see product by selected vendor : " + descriptionOfProductVendor);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 23)
	public void TC_243_VerifyUserIsAbleToSeeRepeatedOrderOfSameProductInTheProductBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		String producToSearch = PropertiesReader.getPropertyValue(env + "_" + "productToSearch");
		String qa_productAltTag = PropertiesReader.getPropertyValue(env + "_" + "productAltTag");
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY PRODUCT</b> option");
		homePage.hoverOrdersAndClickByProduct();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_ID_243 Verify user is able to see repeated order of same product in the product block</ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter product to search <b>" + producToSearch + "</b>");
		ordersPage.enterProductToSearch(producToSearch);
		Waits.wait3s();
		ErrorCollector.verifyTrue(
				ordersPage.getRepeatedOrdersSizeForSearchedProduct(producToSearch.split(" ")[0], qa_productAltTag) > 0,
				": Verified user is able to see repeated order of same product in the product block.");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 24)
	public void TC_244_VerifyUserIsAbleToSeeOrderedProductsByManufacturer() throws InterruptedException {

		login();
		
		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_ID_244 Verify user is able to see ordered products by manufacturer</ b>");

		ErrorCollector.verifyTrue(ordersPage.isManufacturerHeadingInOrderPageDisplaying(),
				": Verified User is able to see ordered products by manufacturer");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	

	 @Test
		public void TC_245VerifyUserIsAbleToSeeOrderedProductsByManufacturerByProductName() throws InterruptedException {

			login();

			HomePage homePage = new HomePage();
			OrdersPage ordersPage = new OrdersPage();
			int step = 5;

			String productName = PropertiesReader.getPropertyValue("productToSearchByManufecturer");

			
			Waits.wait3s();

			ErrorCollector.extentLogInfo(
					"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
			homePage.hoverOrdersAndClickByManufacturer();
			Waits.wait6s();

			ordersPage.enterKeysSearchFieldByProductName(productName);
			Waits.wait6s();

			ErrorCollector.extentLogInfo("<b> Step " + (++step)
					+ " : TC_ID_245 Verify user is able to see ordered products by manufacturer by product name</ b>");

			ErrorCollector.verifyTrue(ordersPage.isSearchedProductIsDisplaying(productName),
					": Verified User is able to see ordered products by manufacturer by name");

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
			closeBrowser();
		}

	
 @Test
	public void TC_248VerifyUserIsAbleToSortProductByProductNameAtoZ() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		PromotionsPage promotionsPage = new PromotionsPage();

		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown");
		ordersPage.clickOnSortDropDown();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown Product Name A_Z");
		ordersPage.clickOnSortDropDownProductNameA_Z();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo("<b> Step " + (++step)
				+ " : TC_ID_248 Verify user is able to sort products on the by manufacturer page  by 'Product name (A-Z)'</ b>");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedAcendingStringArray(AfterSortingStringList),
				": Verifid user is able to sort products on the by manufacturer page  by 'Product name (A-Z)'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

 @Test
	public void TC_249VerifyUserIsAbleToSortProductByProductNameZtoA() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		PromotionsPage promotionsPage = new PromotionsPage();

		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown");
		ordersPage.clickOnSortDropDown();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown Product Name Z_A");
		ordersPage.clickOnSortDropDownProductNameZ_A();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo("<b> Step " + (++step)
				+ " : TC_ID_249 Verify user is able to sort products on the by manufacturer page  by 'Product name (Z-A)'</ b>");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verifid user is able to sort products on the by manufacturer page  by 'Product name (Z-A)'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

 @Test
	public void TC_250VerifyUserIsAbleToFilterProductsByVendors() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " :  Verify User is able to see product by selected vendor </b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Select vendor");
		String descriptionOfProductVendor = null;
		descriptionOfProductVendor = ordersPage.clickVendorDrodpown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Selected vendor : " + descriptionOfProductVendor);

		ErrorCollector.verifyTrue(ordersPage.isProductVendorDisplaying(),
				": Verified User is able to see product by selected vendor : " + descriptionOfProductVendor);
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test
	public void TC_255VerifyUserIsAbleToSeeProductDetail() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("<b> Step " + (++step)
				+ " : TC_ID_255 Verify user is able to see product image, Product description, Order id, Vendor, Price, Quantity, and ordered date on each product block</ b>");

		ErrorCollector.verifyTrue(ordersPage.isProductImageInOrdersPageDisplaying(),
				": Verified User is able to see product image in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductDescriptionInOrdersPageDisplaying(),
				": Verified User is able to see product description in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductVendorInOrderPageDisplaying(),
				": Verified User is able to see product vendor in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductPriceInOrderPageDisplaying(),
				": Verified User is able to see product price in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductQuantityInOrderPageDisplaying(),
				": Verified User is able to see product quantity in product block ");

		ErrorCollector.verifyTrue(ordersPage.isProductDateInOrderPageDisplaying(),
				": Verified User is able to see product ordered date in product block ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test
	public void TC_252_VerifyUserIsAbleToSeeManufacturerOnTheTopOfEachManufacturerBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : Verify manufacturer name on the top left of each manufacturer block</ b>");
		ErrorCollector.verifyTrue(ordersPage.isManufacturerHeadingInOrderPageDisplaying(),
				": Verified manufacturer name on the top left of each manufacturer block");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test
	public void TC_253_VerifyUserIsAbleToSeeProductsUnderEachManufacturerBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : Verify products Under Each Manufacturer Block is Displaying</ b>");
		ErrorCollector.verifyTrue(ordersPage.productsUnderEachManufacturerBlockDisplaying(),
				": Verified products Under Each Manufacturer Block is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test
	public void TC_254_VerifyUserIsAbleToSeeSameManufacturerUnderEachManufacturerBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("<b> Step " + (++step)
				+ " : Verify Same Manufacrurer products Under Each Manufacturer Block is Displaying</ b>");
		ErrorCollector.verifyTrue(ordersPage.productsUnderEachManufacturerBlockDisplaying(),
				": Verified  Same Manufacrurer  products Under Each Manufacturer Block is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 30)
	public void TC_ID_76_UserIsAbleToApplyRebateFilterOnProductsAgainstGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		waitfor3sec();

		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Rebate</b> Filter");
		promotionsPage.clickOnGeneralPromotionsFiltersRebate();

		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Rebate' Filter on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Rebate' Filter on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 31)
	public void TC_ID_111_VerifyUserIsAbleToSortPreviousOrderedProductsByFrequentlyPurchasesdProducts()
			throws InterruptedException {

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

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort By</b> DropDown");
		productsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Frequently Purchases</b> Option");
		productsPage.clickOnSortbyDropDownFrequentlyPurchases();

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see all previously ordered products by frequently purchases");
		ErrorCollector.verifyTrue(productsPage.isLastOrderedDisplaying(),
				" : Verified User is able to see all previously ordered products by frequently purchases");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 32)
	public void TC_ID_125_UserIsAbleToCheckProductOfPriceAllGeneralPromotionsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
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
				+ "Verify :  Products are updated on the basis of 'All' Price Filter on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter > numberOfResultsFirst,
				"Verified : Products are updated on the basis of 'All' Price Filter on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 33)
	public void TC_ID_126_ByDefaultProductsOfAllPricesAreDisplayedOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  By Default 'All' Price Filter is selected on 'General Promotions' page");
		ErrorCollector.verifyTrue(promotionsPage.isAllPriceFilterSelected(),
				"Verified :  By Default'All' Price Filter is selected  on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 34)
	public void TC_ID_128_UserIsAbleToCheckProductHavingPrice10To100DollarAreDisplayedOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		waitfor3sec();

		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>$10 to $100</b> Filter");
		promotionsPage.clickOnGeneralPromotionsFilterPrice10To100Dollar();

		waitfor3sec();

		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are updated on the basis of '$10 to $100' Price Filter on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are updated on the basis of '$10 to $100' Price Filter on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 35)
	public void TC_ID_129_UserIsAbleToCheckProductHavingPrice100To500DollarAreDisplayedOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		waitfor3sec();

		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>$100 to $500</b> Filter");
		promotionsPage.clickOnGeneralPromotionsFilterPrice100To500Dollar();

		waitfor3sec();

		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are updated on the basis of '$100 to $500' Price Filter on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are updated on the basis of '$100 to $500' Price Filter on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 36)
	public void TC_ID_130_UserIsAbleToCheckProductHavingPriceAbove500DollarAreDisplayedOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		waitfor3sec();

		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Above 500 Dollar</b> Filter");
		promotionsPage.clickOnGeneralPromotionsFilterPriceAbove500Dollar();

		waitfor3sec();

		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are updated on the basis of 'Above $500' Price Filter on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are updated on the basis of 'Above $500' Price Filter on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 37)
	public void TC_236VerifyUserIsAbleToSortProductByProductByNewsFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Order</b> option");
		homePage.hoverOrdersAndClickByProduct();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Newest First</b> Option");
		ordersPage.clickOnSortDropDownNewestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_236 Verify user is able to sort products by 'Newest first'</ b>");
		ErrorCollector.verifyTrue(ordersPage.isNewestFirstOrdersDisplaying(),
				": Verified user is able to sort products by 'Newest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 38)
	public void TC_237VerifyUserIsAbleToSortProductByProductByOldestFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Order</b> option");
		homePage.hoverOrdersAndClickByProduct();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Oldest First</b> Option");
		ordersPage.clickOnSortDropDownOldestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_237 Verify user is able to sort products by 'Oldest first' </b>");
		ErrorCollector.verifyTrue(ordersPage.isOldestFirstOrdersDisplaying(),
				": Verified  user is able to sort products by 'Oldest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	@Test(priority = 40)
	public void TC_246VerifyUserIsAbleToSortProductByManufecturerByNewsFirst() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manfecturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Newest First</b> Option");
		ordersPage.clickOnSortDropDownNewestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_246 Verify user is able to sort products by 'Newest first'</ b>");
		ErrorCollector.verifyTrue(ordersPage.isNewestFirstOrdersDisplaying(),
				": Verified user is able to sort products by 'Newest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 41)
	public void TC_247VerifyUserIsAbleToSortProductByManufecturerByOldestFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manfecturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Oldest First</b> Option");
		ordersPage.clickOnSortDropDownOldestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_247 Verify user is able to sort products by 'Oldest first' </b>");
		ErrorCollector.verifyTrue(ordersPage.isOldestFirstOrdersDisplaying(),
				": Verified  user is able to sort products by 'Oldest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 42)
	public void TC_251VerifyUserIsAbleToFilterProductByManufecturerByDateRange() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Manfecturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnSelectDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnUpdateDateBtn();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_241 Verify user is able to filter products by 'Date Range' </b>");
		ErrorCollector.verifyTrue(ordersPage.isInRangeOrdersDisplaying(),
				": Verified user is able to filter products by 'Date Range'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 43)
	public void TC_207VerifyUserIsAbleToSortProductByHistoryByNewsFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Newest First</b> Option");
		ordersPage.clickOnSortDropDownNewestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_207 Verify user is able to sort products by 'Newest first'</ b>");
		ErrorCollector.verifyTrue(ordersPage.isByHistoryNewestFirstOrdersDisplaying(),
				": Verified user is able to sort products by 'Newest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 44)
	public void TC_208VerifyUserIsAbleToSortProductByHistoryByOldestFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Oldest First</b> Option");
		ordersPage.clickOnSortDropDownOldestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_208 Verify user is able to sort products by 'Oldest first' </b>");
		ErrorCollector.verifyTrue(ordersPage.isByHistoryOldestFirstOrdersDisplaying(),
				": Verified  user is able to sort products by 'Oldest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	
	@Test(priority = 46)
	public void TC_222VerifyUserIsAbleToSortProductByBackOrderedByNewsFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Newest First</b> Option");
		ordersPage.clickOnSortDropDownNewestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_222 Verify user is able to sort products by 'Newest first'</ b>");
		ErrorCollector.verifyTrue(ordersPage.isByHistoryNewestFirstOrdersDisplaying(),
				": Verified user is able to sort products by 'Newest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 47)
	public void TC_223VerifyUserIsAbleToSortProductByBackOrderedByOldestFirst() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Backordered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Sort</b> DropDown");
		ordersPage.clickOnSortDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Oldest First</b> Option");
		ordersPage.clickOnSortDropDownOldestFirst();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_223 Verify user is able to sort products by 'Oldest first' </b>");
		ErrorCollector.verifyTrue(ordersPage.isByHistoryOldestFirstOrdersDisplaying(),
				": Verified  user is able to sort products by 'Oldest first'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 48)
	public void TC_227VerifyUserIsAbleToFilterProductByBackorderedByDateRange() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY Backordered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnSelectDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnUpdateDateBtn();

		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_227 Verify user is able to filter products by 'Date Range' </b>");
		ErrorCollector.verifyTrue(ordersPage.isByHistoryInRangeOrdersDisplaying(),
				": Verified user is able to filter products by 'Date Range'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 51)
	public void TC_ID_283_VerifyUserIsAbleToExportAllMissedSavings() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to <b>Missed Saving</b> Section");
		rebatesPsiRebatesPage.scrollToMissedSavingSection();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Export </b> Button");
		rebatesPsiRebatesPage.clickOnMissedSavingExportButton();

		waitfor5sec();
		String userName = "codeautomation";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Missed Saving File exported successfully");
		ErrorCollector.verifyTrue(
				productsPage.isFileDownloaded("C:/Users/" + userName + "/Downloads", "Order_Missed_Savings.xlsx"),
				"Verified Missed Saving File exported successfully");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 52)
	public void TC_ID_275_VerifyUserIsAbleToSeePSIRebateBySelectingDateRange() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Rebate</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetRebates();

		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnPSIRebateDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnUpdateDateBtn();

		waitfor3sec();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify PSI Rebate Order are displaying in specified range");
		ErrorCollector.verifyTrue(ordersPage.isPSIRebateInRangeOrdersDisplaying(),
				"Verified  PSI Rebate Order are displaying in specified range");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 53)
	public void TC_ID_276_VerifyUserIsAbleToSeePSISavingBySelectingDateRange() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;
		

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnPSISavingDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnPSISavingThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnPSISavingUpdateDateBtn();

		waitfor3sec();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify PSI Saving Order are displaying in specified range");
		ErrorCollector.verifyTrue(ordersPage.isPSISavingInRangeOrdersDisplaying(),
				"Verified  PSI Saving Order are displaying in specified range");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 54)
	public void TC_ID_284_VerifyUserIsAbleToSeeMissedSavingBySelectingDateRange() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;
	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to <b>Missed Saving</b> Section");
		rebatesPsiRebatesPage.scrollToMissedSavingSection();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnMissedSavingDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnMissedSavingThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnMissedSavingUpdateDateBtn();

		waitfor3sec();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify Missed Saving Order are displaying in specified range");
		ErrorCollector.verifyTrue(ordersPage.isMissedSavingInRangeOrdersDisplaying(),
				"Verified  Missed Saving Order are displaying in specified range");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


}
