package com.vetscout.test;

import org.testng.annotations.Test;

import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.listeners.ExtentListeners;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.ProductsPage;
import com.vetscout.pages.OrdersPage;
import com.vetscout.pages.SingupPage;
import com.vetscout.utilities.Waits;
import com.vetscout.pages.PromotionsPage;
public class OrderTest extends BaseClass {

	

	@Test(priority = 1)
	public void TC_ID_204_VerifyUserIsAbleToSeeAllPreviousOrdersHistoryPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;


		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		waitfor5sec();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Product Description' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isProductDescriptionDisplaying(),
				"Verified 'Product Description' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Vendor Image ' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isVendorImageDisplaying(),
				"Verified 'Vendor Image ' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'SKU' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isSKUDisplaying(),
				"Verified 'SKU' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Price Displaying' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isPriceDisplaying(),
				"Verified 'Price Displaying' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Quantity Displaying' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isQuantityDisplaying(),
				"Verified 'Quantity Displaying' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Shipping Button' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isShippingButtonDisplaying(),
				"Verified 'Shipping Button' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	} 


	
	

	@Test(priority = 3)
	public void TC_ID_209VerifyUserIsAbleToSortOrderHistoryByProductNameA_Z()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		PromotionsPage promotionsPage= new PromotionsPage();
		int step = 5;
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();
		

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown");
		ordersPage.clickOnSortDropDown();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown Product Name A_Z");
		ordersPage.clickOnSortDropDownProductNameA_Z();


		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name A-Z</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedAcendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name A_Z</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	

	@Test(priority = 4)
	public void TC_ID_210VerifyUserIsAbleToSortOrderHistoryByProductNameZ_A()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		PromotionsPage promotionsPage= new PromotionsPage();
		int step = 5;
	
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();
		
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown");
		ordersPage.clickOnSortDropDown();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown Product Name Z_A");
		ordersPage.clickOnSortDropDownProductNameZ_A();


		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z-A</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	


	@Test(priority = 2)
	public void TC_ID_206_VerifyUserIsAbleToSearchOrderHistoryByProductName() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		String searchKey = "Pivetal";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Keys: '" + searchKey + "' in ProductName Field");
		ordersPage.enterKeysSearchFieldByProductName(searchKey);

		waitfor5sec();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Keys: '" + searchKey + "' Showing in result");
		ErrorCollector.verifyTrue(ordersPage.isSearchedResultDisplaying(searchKey),
				" : Verified Keys: '" + searchKey + "' Showing in result");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	
	@Test(priority = 5)
	public void TC_ID_211VerifyUserIsAbleToFilterOrderHistoryByVendors()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;
		
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		String searchKey="covetrus";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Keys: '"+searchKey+"' in Vendor Field");
		ordersPage.enterKeysSearchFieldByVendorName(searchKey);

		
		ordersPage.waitUnitlPageLoad();
		
		int totalCovetrus=ordersPage.getNumberOfVendorCovetrusImage();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Keys: '"+searchKey+"' Showing in result");
		ErrorCollector.verifyTrue(totalCovetrus>0,
				" : Verified Keys: '"+searchKey+"' Showing in result");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	

	

	@Test(priority = 6)
	public void TC_ID_212VerifyUserIsAbleToFilterOrderHistoryByShippingStatus() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ordersPage.waitUnitlPageLoad();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Shipping Status DropDown");
		ordersPage.clickOnShippingStatusDropDown();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Delivered option in DropDown ");
		ordersPage.clickOnShippingStatusDropDownDelivered();
		
		
		Waits.wait6s();
		
		int totalButton=ordersPage.getNumberOfDeliveredShippingButton();
		
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see all orders which are delivered");
		ErrorCollector.verifyTrue(0<totalButton,
				" : Verified User is able to see all orders which are delivered");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	
	

	@Test(priority = 7)
	public void TC_ID_214VerifyUserIsAbleToSeeAllProductsWhichWeOrderInEachOrderHistory() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;
		

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ordersPage.waitUnitlPageLoad();
		int total=ordersPage.getNumberOfFirstProductDescriptionOfEachOrder();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see all products in each order history block");
		ErrorCollector.verifyTrue(total>0,
				" : Verified User is able to see all products in each order history block");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	
	

	@Test(priority = 8)
	public void TC_ID_215VerifyUserIsAbleToSeeProductsImageDescriptionVendorsSkuPriceQuantityAndShippingStatusInEachOrders() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;
		

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		Waits.wait2s();
		int totalProductsImages=ordersPage.getNumberOfFirstProductImageOfEachOrder();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see product image in each order history block");
		ErrorCollector.verifyTrue(0<totalProductsImages,
				" : Verified User is able to see all products in each order history block");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see description in each order history block");
		ErrorCollector.verifyTrue(0<ordersPage.getNumberOfFirstProductDescriptionOfEachOrder(),
				" : Verified User is able to see all products in each order history block");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Vendors in each order history block");
		ErrorCollector.verifyTrue(0<ordersPage.getNumberOfFirstVendorImageOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see SKU in each order history block");
		ErrorCollector.verifyTrue(0<ordersPage.getNumberOfFirstSKUOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Price in each order history block");
		ErrorCollector.verifyTrue(0<ordersPage.getNumberOfFirstPriceOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Quantity in each order history block");
		ErrorCollector.verifyTrue(0<ordersPage.getNumberOfFirstQuantityOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Shipping status in each order history block");
		ErrorCollector.verifyTrue(0<ordersPage.getNumberOffirstShippingButtonOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	
	


	@Test(priority = 9)
	public void TC_ID_216VerifyUserIsAbleToSeeOrderNoTotalCostOfOrderAndOrderDateOnEachOrderHistoryBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;
	
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		Waits.wait2s();
		
		int total=ordersPage.getNumberOfEachOrder();
		
		int totalProductsImages=ordersPage.getNumberOfFirstProductImageOfEachOrder();
		
		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfOrderNumber();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Order number in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfOrderNumber(),
				" : Verified User is able to see Order number in each order history block");

		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfTotal();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Total cost of order in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfTotal(),
				" : Verified User is able to see Total cost of order in each order history block");
		
		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfOrderDueDate();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Order due date in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfOrderDueDate(),
				" : Verified User is able to see Order due date in each order history block");
		
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	


	@Test(priority = 45)
	public void TC_213VerifyUserIsAbleToFilterProductByHistoryByDateRange() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();
		int step = 5;

		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BY History</b> option");
		homePage.hoverOrdersAndClickByHistory();

		ordersPage.waitUnitlPageLoad();
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Date</b> Button");
		ordersPage.clickOnSelectDateBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>This Month</b> Button");
		ordersPage.clickOnThisMonthBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button");
		ordersPage.clickOnUpdateDateBtn();

		ordersPage.waitUnitlPageLoad();
		waitfor3sec();

		ErrorCollector.extentLogInfo(
				"<b> Step " + (++step) + " : TC_ID_213 Verify user is able to filter products by 'Date Range' </b>");
		ErrorCollector.verifyTrue(ordersPage.isByHistoryInRangeOrdersDisplaying(),
				": Verified user is able to filter products by 'Date Range'");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 10)
	public void TC_ID_217VerifyUserIsAbleToDownload() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		Waits.wait2s();
		
		String fileName =  ordersPage.getOrderId();
		
		fileName = "Invoice_"+ (fileName.split(": ", 2))[1] + ".pdf";
				

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Print Button");
		ordersPage.clickOnButtonPrint();
		
		ordersPage.waitUnitlPageLoad();
		waitfor3sec();
		
		String userDirectory = System.getProperty("user.home")+"\\Downloads";

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify All favourite products list exported successfully");
		ErrorCollector.verifyTrue(productsPage.isFileDownloaded(userDirectory, fileName),
				"Verified All favourite products list exported successfully");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	
	


	 @Test(priority = 11)
	public void TC_ID_218VerifyUserIsAbleToTrackDeliveredOrderFromTheOrderHistoryPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage = new OrdersPage();

		int step = 5;

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ordersPage.waitUnitlPageLoad();
		waitfor3sec();

		String num = "";
		String trackno = "";
		try {
			num = ordersPage.getNoTrackButton();

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Track Button");
			ordersPage.clickOnTrackButton();
			Waits.wait5s();
			ordersPage.switchToNextTab();
			waitfor3sec();

			trackno = ordersPage.getTrackingNum();

		} catch (Exception e) {

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Next Page Button");
			ordersPage.clickNextPageButton("2");
			num = ordersPage.getNoTrackButton();

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Track Button");
			ordersPage.clickOnTrackButton();
			Waits.wait5s();
			ordersPage.switchToNextTab();
			waitfor3sec();

			trackno = ordersPage.getTrackingNum();

		}

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to redirected to the shipper page with the tracking details");
		ErrorCollector.verifyTrue(num.equals(trackno),
				"Verified Verify User is able to redirected to the shipper page with the tracking details");

		closeTab(1);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 12)
	public void TC_ID_219VerifyUserIsAbleToAddOrdersProductIntoTheFavouriteItems() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		PromotionsPage promotionsPage= new PromotionsPage();
		int step = 5;
	
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();
		Waits.wait3s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		Waits.wait2s();

		int activeHeartsBefore=ordersPage.getNumberOfactiveHeartIcons();
		
		activeHeartsBefore=ordersPage.getNumberOfactiveHeartIcons();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Heart</b> Shaped Icon");
		promotionsPage.clickSearchResultsFirstItemHeartIcon1();
		
		int activeHeartsAfter=ordersPage.getNumberOfactiveHeartIcons();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Heart</b> changed color");
		ErrorCollector.verifyTrue(activeHeartsBefore<activeHeartsAfter,
				"Verified : Favourite icon turns into red");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}	
	

	
	
	@Test(priority = 13)
	public void TC_ID_220VerifyUserIsAbleToSeeAllBackorderedProductsWithOrderDetailsInOnTheBackorderPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;
	
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'BackOrdered' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBackOrderedPageTitleDisplaying(),
				"Verified 'BackOrdered' Page Title is displaying");

		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify ' Product Image' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isProductImageDisplaying(),
				"Verified 'Product Image' Page Title is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Product Description' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isProductDescriptionDisplaying(),
				"Verified 'Product Description' is displaying");
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Vendor Image ' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isVendorImageDisplaying(),
				"Verified 'Vendor Image ' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'SKU' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isSKUDisplaying(),
				"Verified 'SKU' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Price Displaying' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isPriceDisplaying(),
				"Verified 'Price Displaying' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Quantity Displaying' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isQuantityDisplaying(),
				"Verified 'Quantity Displaying' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Shipping Button' is displaying");
		ErrorCollector.verifyTrue(ordersPage.isShippingButtonDisplaying(),
				"Verified 'Shipping Button' is displaying");
		
		closeBrowser();

	}		

	@Test(priority = 14)
	public void TC_ID_221VerifyUserIsAbleToSearchBackorderedByProductName() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
	
		int step = 5;
		
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'BackOrdered' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBackOrderedPageTitleDisplaying(),
				"Verified 'BackOrdered' Page Title is displaying");

		String searchKey="Bupivacaine";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Keys: '"+searchKey+"' in ProductName Field");
		ordersPage.enterKeysSearchFieldByProductName(searchKey);

		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Keys: '"+searchKey+"' Showing in result");
		ErrorCollector.verifyTrue(ordersPage.isSearchedResultDisplaying(searchKey),
				" : Verified Keys: '"+searchKey+"' Showing in result");

		
		closeBrowser();

	}		
	
	
	
	

	@Test(priority = 15)
	public void TC_ID_224VerifyUserIsAbleToSortBackorderedProductsByProductNameA_Z() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		PromotionsPage promotionsPage= new PromotionsPage();
		int step = 5;

		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'BackOrdered' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBackOrderedPageTitleDisplaying(),
				"Verified 'BackOrdered' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown");
		ordersPage.clickOnSortDropDown();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown Product Name A_Z");
		ordersPage.clickOnSortDropDownProductNameA_Z();	
		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name A-Z</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedAcendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name A_Z</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();


	}
	
	

	@Test(priority = 16)
	public void TC_ID_225VerifyUserIsAbleToSortBackorderedProductsByProductNameZ_A() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		PromotionsPage promotionsPage= new PromotionsPage();
		int step = 5;

		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		Waits.wait3s();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'BackOrdered' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBackOrderedPageTitleDisplaying(),
				"Verified 'BackOrdered' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown");
		ordersPage.clickOnSortDropDown();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Sort DropDown Product Name A_Z");
		ordersPage.clickOnSortDropDownProductNameZ_A();	
		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z-A</b> Option in  Sort by Drop Down is Displaying");
	
		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 17)
	public void TC_ID_226VerifyUserIsAbleToFilterBackorderedProductsByVendors() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		
		int step = 5;

		Waits.wait3s();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		String searchKey="covetrus";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Vendor Drop Down");
		ordersPage.clickOnVendorDropDown();
		Waits.wait1s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Vendor Drop Down Covetrus");
		ordersPage.clickOnVendorDropDownCovetrus();

		Waits.wait6s();
		int total=ordersPage.getNumberOfResults();
		int totalCovetrus=ordersPage.getNumberOfVendorCovetrusImage();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Keys: '"+searchKey+"' Showing in result");
		ErrorCollector.verifyTrue(total==totalCovetrus,
				" : Verified Keys: '"+searchKey+"' Showing in result");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	

	@Test(priority = 18)
	public void TC_ID_229VerifyUserIsAbleToSeeProductsImageDescriptionVendorsPriceQuantityAndShippingStatusInBackorderBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		int step = 5;

		Waits.wait3s();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		int total=ordersPage.getNumberOfEachOrder();
		int totalProductsImages=ordersPage.getNumberOfFirstProductImageOfEachOrder();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see product image in each order history block");
		ErrorCollector.verifyTrue(total==totalProductsImages,
				" : Verified User is able to see all products in each order history block");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see description in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfFirstProductDescriptionOfEachOrder(),
				" : Verified User is able to see all products in each order history block");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Vendors in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfFirstVendorImageOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see SKU in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfFirstSKUOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Price in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfFirstPriceOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Quantity in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfBackOrderFirstQuantityOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Shipping status in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getbackOrderFirstShippingButtonOfEachOrder(),
				" : Verified User is able to see all products in each order history block");
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	@Test(priority = 19)
	public void TC_ID_230VerifyUserIsAbleToSeeOrderNoTotalCostOfOrderAndOrderDateOnEachBackorderBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		
		int step = 5;

		Waits.wait3s();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();

		int total=ordersPage.getNumberOfEachOrder();
		
		int totalProductsImages=ordersPage.getNumberOfFirstProductImageOfEachOrder();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see product image in each order history block");
		ErrorCollector.verifyTrue(total==totalProductsImages,
				" : Verified User is able to see all products in each order history block");

		
		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfOrderNumber();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Order number in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfOrderNumber(),
				" : Verified User is able to see Order number in each order history block");

		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfTotal();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Total cost of order in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfTotal(),
				" : Verified User is able to see Total cost of order in each order history block");
		
		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfOrderDueDate();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Order due date in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfOrderDueDate(),
				" : Verified User is able to see Order due date in each order history block");
		
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 20)
	public void TC_ID_231VerifyUserIsAbleToSeeActionsInFrontOfEachProductInTheBackorderBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
	
		int step = 5;

		Waits.wait3s();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();

		int total=ordersPage.getNumberOfEachOrder();
		
		int totalProductsImages=ordersPage.getNumberOfFirstProductImageOfEachOrder();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see product image in each order history block");
		ErrorCollector.verifyTrue(total==totalProductsImages,
				" : Verified User is able to see all products in each order history block");

		
		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfOrderNumber();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Action Product arrived in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfProductArrived(),
				" : Verified User is able to see Action Product arrived  in each order history block");

		total=ordersPage.getNumberOfEachOrder();
		
		totalProductsImages=ordersPage.getNumberOfTotal();
		
		int ProductCancelled=ordersPage.getNumberOfProductCancelled();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see Action Product Cancelled in each order history block");
		ErrorCollector.verifyTrue(ordersPage.getNumberOfEachOrder()==ordersPage.getNumberOfProductCancelled(),
				" : Verified User is able to see Action Product Cancelled in each order history block");
		

	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

	@Test(priority = 21)
	public void TC_ID_232VerifyUserIsAbleToSelectActionProductArrivedInFrontOfEachProductInTheBackorderBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();

		int step = 5;
	
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		
		String descriptionOfFirstItem = null;
		descriptionOfFirstItem = ordersPage.getTextOfProductDescription();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Product Arrived Radio Button");
		ordersPage.clickOnProductArrivedRadioButton();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Button Yes");
		ordersPage.clickOnButtonYes();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Button OK");
		ordersPage.clickOnButtonOK();
		Waits.wait2s();
		
		String descriptionOfFirstItemNew=ordersPage.getTextOfProductDescription();
		
		ErrorCollector.verifyFalse(descriptionOfFirstItem==descriptionOfFirstItemNew,
				": Verified User is able to see description of the product which is added to the cart");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	


	@Test(priority = 22)
	public void TC_ID_233VerifyUserIsAbleToSelectActionProductArrivedInFrontOfEachProductInTheBackorderBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();

		int step = 5;
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		
		String descriptionOfFirstItem = null;
		descriptionOfFirstItem = ordersPage.getTextOfProductDescription();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Product Arrived Radio Button");
		ordersPage.clickOnProductArrivedRadioButton();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Button Yes");
		ordersPage.clickOnButtonYes();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Button OK");
		ordersPage.clickOnButtonOK();
		Waits.wait2s();
		
		String descriptionOfFirstItemNew=ordersPage.getTextOfProductDescription();
		
		ErrorCollector.verifyFalse(descriptionOfFirstItem==descriptionOfFirstItemNew,
				": Verified User is able to see description of the product which is added to the cart");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	


	@Test(priority = 22)
	public void TC_ID_234VerifyUserIsAbleToSelectActionProductCancelledInFrontOfEachProductInTheBackorderBlock() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		OrdersPage ordersPage= new OrdersPage();
		
		int step = 5;
		
		Waits.wait3s();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();
		Waits.wait6s();
		
		String descriptionOfFirstItem = null;
		descriptionOfFirstItem = ordersPage.getTextOfProductDescription();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Product Cancelled Radio Button");
		ordersPage.clickOnProductCancelledRadioButtonLabel();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Button Yes");
		ordersPage.clickOnButtonYes();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Button OK");
		ordersPage.clickOnButtonOK();
		Waits.wait2s();
		
		String descriptionOfFirstItemNew=ordersPage.getTextOfProductDescription();
		
		ErrorCollector.verifyFalse(descriptionOfFirstItem==descriptionOfFirstItemNew,
				": Verified User is able to see description of the product which is added to the cart");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	



}
