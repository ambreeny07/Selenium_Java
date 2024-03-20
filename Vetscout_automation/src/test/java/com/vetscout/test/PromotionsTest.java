package com.vetscout.test;

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
import com.vetscout.pages.SingupPage;
import com.vetscout.utilities.Waits;
import com.vetscout.pages.PromotionsPage;

public class PromotionsTest extends BaseClass {

	


	 @Test(priority = 39)
	public void TC_ID_56_UserIsAbleToSearchProductOnGeneralPromotionsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		String productToSearch = "Equiplas D Normal Equine Plasma";
		ProductsPage productsPage = new ProductsPage();

		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		int ResultsBefore = promotionsPage.getNumberofResultsShowing();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Enter <b>" + productToSearch + "</b> Into Prodcut Name Search Bar ");
		productsPage.enterIntoSearchBarProduct(productToSearch);

		if (promotionsPage.isNoProductsFoundMsgDisplaying())
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
			ErrorCollector.verifyTrue(ResultsBefore != ResultsAfter, "Verified Results count updated");
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	
	@Test(priority = 3)
	public void TC_ID_58_UserIsAbleToRemoveSomeProductFromMyFavouritesOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		try {
			promotionsPage.clickSearchResultsItemActiveHeartIcon();
			ErrorCollector.extentLogInfo(
					"Step " + (++step) + " : Verify <b>Favorite icon</b> changed color back from red to grey");
			ErrorCollector.verifyTrue(promotionsPage.isSearchResultsFirstItemHeartIconDisplaying(),
					"Verified : <b>Favorite icon</b> changed color back from red to grey");
		} catch (Exception e) {
			promotionsPage.clickSearchResultsFirstItemHeartIcon();
			promotionsPage.clickSearchResultsFirstItemHeartIcon();
			ErrorCollector.verifyTrue(promotionsPage.isSearchResultsFirstItemHeartIconDisplaying(),
					"Verified : <b>Favorite icon</b> changed color back from red to grey");

		}

	}

	@Test(priority = 4)
	public void TC_ID_59_UserIsAbleToSeeThatProductsAreByDefaultSortedFromProductNameA_ZOnGeneralPromotionspage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		String sortByfieldDescription = promotionsPage.getDescriptionOfSortByDropDown();
		String expectedDescription = "Product Name (A-Z)";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Product Name (A-Z)</b> is showing by default");
		waitTime(2000);
		ErrorCollector.verifyTrue(matchStringCaseInsensitiveTrim(expectedDescription, sortByfieldDescription),
				"Verified : <b>Product Name (A-Z)</b> is showing by default");
	}

	@Test(priority = 5)
	public void TC_ID_60_DropdownIconIsClickableAgainstSortByFieldOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;


		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name A_Z</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameA_ZDisplaying(),
				"Verified : <b>Product Name A_Z</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameZ_ADisplaying(),
				"Verified : <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Product Name Lowest Price</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameLowestPriceDisplaying(),
				"Verified : <b>Product Name Lowest Price</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Product Name Highest Price</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameHighestPriceDisplaying(),
				"Verified : <b>Product Name Highest Price</b> Option in  Sort by Drop Down is Displaying");

	}

	@Test(priority = 6)
	public void TC_ID_61_UserIsAbleToPerformSortingOnTheBasisOfProductNameZ_AOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on product name z-a");
		promotionsPage.clickOnSortByDropDownProductNameZ_A();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

	}

	@Test(priority = 7)
	public void TC_ID_62_UserIsAbleToPerformSortingOnTheBasisOfLowestPriceOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Lowest Price");
		promotionsPage.clickOnSortByDropDownProductNameLowestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = BeforeSortingDoubleList;

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " :Products should get sort on the basis of 'Lowest Price' on 'General Promotions' page");
		assertEquals(BeforeSortingDoubleList, promotionsPage.getSortedAcendingDoubleArray(AfterSortingDoubleList));

	}

	@Test(priority = 8)
	public void TC_ID_63_UserIsAbleToPerformSortingOnTheBasisOfHighestPriceOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Highest Price");
		promotionsPage.clickOnSortByDropDownProductNameHighestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = BeforeSortingDoubleList;

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " :Products should get sort on the basis of 'Highest Price' on 'General Promotions' page");
		assertEquals(BeforeSortingDoubleList, promotionsPage.getSortedDecendingDoubleArray(AfterSortingDoubleList));

	}

	
	
	
	@Test(priority = 9)
	public void TC_ID_64_DropdownIconIsClickableAgainstViewFieldOnGeneralPromotionsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Default</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownDefaultDisplaying(),
				"Verified : <b>Default</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Large</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownLargeDisplaying(),
				"Verified : <b>Large</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify <b>List</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownListDisplaying(),
				"Verified : <b>List</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify <b>Void</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownWideViewDisplaying(),
				"Verified : <b>Void</b> Option in  Sort by Drop Down is Displaying");

	}

	@Test(priority = 10)
	public void TC_ID_65_DefaultviewIsShownByDefaultForProductsOnGeneralPromotionsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		String sortByfieldDescription = promotionsPage.getDescriptionOfViewDropDown();
		String expectedDescription = "Default";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Default</b> is showing by default");
		ErrorCollector.verifyTrue(matchStringCaseInsensitiveTrim(expectedDescription, sortByfieldDescription),
				"Verified : <b>Product Name (A-Z)</b> is showing by default");
	}

	@Test(priority = 11)
	public void TC_ID_68_UserIsAbleToSelectWideViewForProductsDisplayOnGeneralPromoitonsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnViewDropDownWideDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Wide</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(promotionsPage.isGeneralPromotionsFirstItemWideViewDisplaying(),
				"Verified : <b>Wide</b> view of products should get display on 'General Promotions' page");
	}

	@Test(priority = 12)
	public void TC_ID_66_UserIsAbleToSelectLargeViewForProductsDisplayOnGeneralPromoitonsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		int defaultSize = promotionsPage.getSizeOfDefaultView();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Large option View Drop Down ");
		promotionsPage.clickOnViewDropDownLarge();

		int largeViewSize = promotionsPage.getSizeOfLargeView();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Large</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(defaultSize < largeViewSize,
				"Verified : <b>Large</b> view of products should get display on 'General Promotions' page");

	}

	@Test(priority = 13)
	public void TC_ID_67_UserIsAbleToSelectListViewForProductsDisplayOnGeneralPromoitonsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		int defaultSize = promotionsPage.getSizeOfDefaultView();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On List option View Drop Down ");
		promotionsPage.clickOnViewDropDownList();

		int largeViewSize = promotionsPage.getSizeOfLargeView();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>List</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(defaultSize < largeViewSize,
				"Verified : <b>List</b> view of products should get display on 'General Promotions' page");

	}

	@Test(priority = 14)
	public void TC_ID_69_UserIsAbleToViewImagesInForwardDirectionGivenForAProductOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		String image1 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Right Arrow</b> Button on first Product");
		promotionsPage.clickOnFeaturedProduct1RightArrowButton();

		String image2 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify different image has appeared");
		ErrorCollector.verifyTrue(image1 != image2, ": Verified different image has appeared");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 15)
	public void TC_ID_70_UserIsAbleToViewImagesInBackwardDirectionGivenForAProductOnGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		String image1 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Left Arrow</b> Button on first Product");
		promotionsPage.clickOnFeaturedProduct1LeftArrowButton();

		String image2 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify different image has appeared");
		ErrorCollector.verifyTrue(image1 != image2, ": Verified different image has appeared");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 16)
	public void TC_ID_71_UserIsAbleToApplyPreferredFilterOnProductsAgainstGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Preferred</b> filter");
		promotionsPage.scrollToGeneralPromotionsFiltersEarnPoint();
		promotionsPage.clickOnGeneralPromotionsFiltersPreferred();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Preferred' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Preferred' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	
	@Test(priority = 16)
	public void TC_ID_72_UserIsAbleToApplyEarnPointsFilterOnProductsAgainstGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Earn point</b> filter");
		promotionsPage.scrollToGeneralPromotionsFiltersEarnPoint();
		promotionsPage.clickOnGeneralPromotionsFiltersEarnPoint();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Earn point</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Earn point</b> filter");

		Double promotionsItems = promotionsPage.getNumberOfGeneralPromotionsItems();
		Double promotionsItemsWithEarnPoints = promotionsPage.getNumberOfGeneralPromotionsItemsWithEarnPoints();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Products are filtered on the basis of <b>Earn point</b> option on 'General Promotions' page ");
		assertEquals(promotionsItems, promotionsItemsWithEarnPoints,
				"Verified : Products are filtered on the basis of <b>Earn point</b> option on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 17)
	public void TC_ID_73_UserIsAbleToApplyRedeemPointsFilterOnProductsAgainstGeneralPromotionsPage()
			throws InterruptedException {
		login();
		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Redeem point</b> filter");
		promotionsPage.scrollToGeneralPromotionsFiltersEarnPoint();
		promotionsPage.clickOnGeneralPromotionsFiltersRedeemPoint();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Redeem point</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Redeem point</b> filter");

		Double promotionsItems = promotionsPage.getNumberOfGeneralPromotionsItems();
		Double promotionsItemsWithRedeemPoints = promotionsPage.getNumberOfGeneralPromotionsItemsWithRedeemPoints();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Products are filtered on the basis of <b>Redeem point</b> option on 'General Promotions' page ");
		assertEquals(promotionsItems, promotionsItemsWithRedeemPoints,
				"Verified : Products are filtered on the basis of <b>Redeem point</b> option on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 18)
	public void TC_ID_74_UserIsAbleToApplyMyFavoritesFilterOnProductsAgainstGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>My Favourites</b> filter");
		promotionsPage.scrollToGeneralPromotionsFiltersEarnPoint();
		promotionsPage.clickOnGeneralPromotionsFiltersMyFavorites();


		waitfor3sec();
		
		if(promotionsPage.isNoProductsFoundMsgDisplaying()) {
			promotionsPage.scrollToNoProductFoundMessage();
			ErrorCollector.extentLogInfo("Step " + (++step) + " : No Products Showing After Applying filter");

		}else {
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>My Favourites</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>My Favourites</b> filter");

		}
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 16)
	public void TC_ID_75_UserIsAbleToApplyPreviousOrdersFilterOnProductsAgainstGeneralPromotionsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Previous Orders</b> filter");
		promotionsPage.scrollDownToGeneralPromotionsFiltersHeading();
		promotionsPage.clickOnGeneralPromotionsFiltersPreviousOrders();
		
		waitfor3sec();
		
		if(promotionsPage.isNoProductsFoundMsgDisplaying()) {
			promotionsPage.scrollToNoProductFoundMessage();
			ErrorCollector.extentLogInfo("Step " + (++step) + " : No Products Showing After Applying filter");

		}
		else {
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Previous Orders' option on 'General Promotions' page and count is also updated");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Previous Orders' option on 'General Promotions' page and count is also updated");
		
		}
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	
	@Test(priority = 19)
	public void TC_ID_131UserIsAbleToCheckProductsOf3MManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>3M</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		productsPage.clickOnManufacturerFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>3M</b> Manufacturer filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>3M</b> Manufacturer filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWith3M = promotionsPage.getNumberOfProductsWith3M();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see filtered product from a specific manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWith3M,
				"Verified : User is able to see filtered product from a specific manufacturer");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 20)
	public void TC_ID_132UserIsAbleToCheckProductsOfABCCompoundingManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>ABCCompounding</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerFilterABCCompounding();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>ABCCompounding</b> Manufacturer filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>ABCCompounding</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithABCCompounding = promotionsPage.getNumberOfProductsWithABCCompounding();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see filtered product from a specific manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithABCCompounding,
				"Verified : User is able to see filtered product from a specific manufacturer");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 21)
	public void TC_ID_133UserIsAbleToCheckProductsOfAddisonOnGeneralPromotionsPage() throws InterruptedException {

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Addison Biological</b>  Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerFilterAddisonBiological();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Addison Biological</b>  Manufacturer filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Addison Biological</b>  Manufacturer filter");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	

	@Test(priority = 22)
	public void TC_ID_134UserIsAbleToCheckProductsOfAllFlexOnGeneralPromotionsPage() throws InterruptedException {

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Allflex</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerFilterAllflex();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Allflex</b> Manufacturer filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Allflex</b> Manufacturer filter");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	//@Test(priority = 23)
	public void TC_ID_135UserIsAbleToCheckProductsOfAmericanProtienCorpOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : click on <b>American Protien Corp</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerFilterAmericanProtienCorp();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>American Protien Corp</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>American Protien Corp</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithAmericanProtienCorp = promotionsPage.getNumberOfProductsWithAmericanProtienCorp();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see filtered product from <b>American Protien Corp</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithAmericanProtienCorp,
				"Verified : User is able to see filtered product from <b>American Protien Corp</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}


	@Test(priority = 24)
	public void TC_ID_136UserIsAbleToCheckProductsOfAnimalHealthLogisticsLaboratoryManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : click on <b>Animal Health Logistics</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerAnimalHealthLogisticsFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Animal Health Logistics</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Animal Health Logistics</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithManufacturerName = promotionsPage.getNumberOfProductsWithAnimalHealthLogistics();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see filtered product from <b>Animal Health Logistics</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithManufacturerName,
				"Verified : User is able to see filtered product from <b>Animal Health Logistics</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}


	@Test(priority = 25)
	public void TC_ID_137UserIsAbleToCheckProductsOfAnyAvailableOptionForLLCManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : click on <b>Animal Health Logistics</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerLLCFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Animal Health Logistics</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Animal Health Logistics</b> Manufacturer  filter");

	
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	@Test(priority = 26)
	public void TC_ID_138UserIsAbleToCheckProductsOfAnyAvailableOptionForFluidsManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Fluids</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerFluidsFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Fluids</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Fluids</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithManufacturerName = promotionsPage.getNumberOfProductsWithFluids();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to see filtered product from <b>Fluids</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithManufacturerName,
				"Verified : User is able to see filtered product from <b>Fluids</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 27)
	public void TC_ID_139UserIsAbleToCheckProductsOfAnyAvailableOptionForBIManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>BI</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerBImanufacturerFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>BI</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>BI</b> Manufacturer  filter");

	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	

	@Test(priority = 28)
	public void TC_ID_140UserIsAbleToCheckProductsOfAnyAvailableOptionForANDBIOLOGICALManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>AND BIOLOGICA</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerANDBIOLOGICALFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>AND BIOLOGICAL</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>AND BIOLOGICAL</b> Manufacturer  filter");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	
	//@Test(priority = 29)
	public void TC_ID_141UserIsAbleToCheckProductsOfAnyAvailableOptionForTherapeuticsManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Therapeutics</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerTherapeuticsFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Therapeutics</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Therapeutics</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithManufacturerName = promotionsPage.getNumberOfProductsWithTherapeutics();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see filtered product from <b>Therapeutics</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithManufacturerName,
				"Verified : User is able to see filtered product from <b>Therapeutics</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 30)
	public void TC_ID_142UserIsAbleToCheckProductsOfAnyAvailableOptionForSurgivetManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Surgivet</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerSurgivetFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Surgivet</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Surgivet</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithManufacturerName = promotionsPage.getNumberOfProductsWithSurgivet();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see filtered product from <b>Surgivet</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithManufacturerName,
				"Verified : User is able to see filtered product from <b>Surgivet</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}


	//@Test(priority = 31)
	public void TC_ID_143UserIsAbleToCheckProductsOfAnyAvailableOptionForInstrumentationManufacturerOnGeneralPromotionsPage()
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Instrumentation</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnManufacturerInstrumentationFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Instrumentation</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Instrumentation</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithManufacturerName = promotionsPage.getNumberOfProductsWithInstrumentation();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see filtered product from <b>Instrumentation</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithManufacturerName,
				"Verified : User is able to see filtered product from <b>Instrumentation</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 32)
	public void TC_ID_144UserIsAbleToCheckProductsForAnyVendorOnGeneralPromotionsPage() throws InterruptedException {

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Instrumentation</b> Manufacturer filter");
		productsPage.scrollToProductsPriceHeading();
		promotionsPage.clickOnVendorCovetrusFilter();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>Instrumentation</b> Manufacturer  filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>Instrumentation</b> Manufacturer  filter");

		Double promotionsItems = productsPage.getNumberOfProductsItems();
		Double promotionsItemsWithManufacturerName = promotionsPage.getNumberOfProductsWithVendorCovetrus();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify User is able to see filtered product from <b>Instrumentation</b> Manufacturer ");
		assertEquals(promotionsItems, promotionsItemsWithManufacturerName,
				"Verified : User is able to see filtered product from <b>Instrumentation</b> Manufacturer ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	
	
	@Test(priority = 34)
	public void TC_ID_146UserIsAbleToSeeTooltipForProductNameOnGeneralPromotionsPage() throws InterruptedException {

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover over <b>Featured Products</b>");
		promotionsPage.hoverOverFeatureProductImage();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is featured Product Tool Tip Displaying");
		ErrorCollector.verifyTrue(homePage.isFeaturedProductToolTipDisplaying(),
				": Verified is featured Product Tool Tip Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}



	 @Test(priority = 51)
	public void TC_ID_181VerifyUserIsAbleToSeeThePlaceOrderButtonInTheUpperSectionOfEachVendorSection()
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

		waitfor3sec();
		productsPage.hoverOnPlaceOrderButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On PlaceOrder Button");
		productsPage.clickOnPlaceOrderButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Order confirmation popup appears");
		ErrorCollector.verifyTrue(productsPage.isVendorsOrderSubmitButtonDisplaying(),
				": Verified Order confirmation popup appears");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on submit Button");
		productsPage.clickVendorsOrderSubmitButton();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify User is able to place order successfully and see a success message");
		ErrorCollector.verifyTrue(productsPage.isOrderPlacedSuccessMsgDisplaying(),
				": Verified User is able to place order successfully and see a success message");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	//@Test(priority = 29)
	public void TC_ID_182UserIsAbleToAccessPointBasedProductsPageSuccessfully() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Points Base Products' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPointsBasedProductsPageTitleDisplaying(),
				"Verified 'Points Base Products' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 29)
	public void TC_ID_183EarnPointsFilterIsSelectedByDefaultOnPointBasedProductsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Points Base Products' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPointsBasedProductsPageTitleDisplaying(),
				"Verified 'Points Base Products' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Checkbox against 'Earn Points' option is checked by default and remaining checkboxes are unchecked in 'Filters' section");
		ErrorCollector.verifyTrue(promotionsPage.isFiltersEarnPointChecked(),
				"Verified Checkbox against 'Earn Points' option is checked by default and remaining checkboxes are unchecked in 'Filters' section");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_184DropdownIconAgainstSortByFieldIsClickableOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Points Base Products' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPointsBasedProductsPageTitleDisplaying(),
				"Verified 'Points Base Products' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name A_Z</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameA_ZDisplaying(),
				"Verified : <b>Product Name A_Z</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameZ_ADisplaying(),
				"Verified : <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Product Name Lowest Price</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameLowestPriceDisplaying(),
				"Verified : <b>Product Name Lowest Price</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Product Name Highest Price</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isSortByDropDownProductNameHighestPriceDisplaying(),
				"Verified : <b>Product Name Highest Price</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_185UserIsAbleToSeeThatProductsAreByDefaultSortedFromProductNameAZOnPointasedProductspage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Points Base Products' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPointsBasedProductsPageTitleDisplaying(),
				"Verified 'Points Base Products' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is Product Name A-Z Sort By Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isProductNameAZSortByDisplaying(),
				"Verified is Product Name A-Z Sort By Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_186UserIsAbleToMarkSomeProductAsMyFavoritesOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Heart</b> Shaped Icon");
		promotionsPage.clickSearchResultsFirstItemHeartIcon1();

		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Favourite</b>Checkbox");

		productsPage.clickOnFavouritePageHeartIconDropDownMyFavouriteChecbox();
		try {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Heart</b> changed color");
			ErrorCollector.verifyTrue(promotionsPage.isSearchResultsFirstItemActiveHeartIconDisplaying(),
					"Verified : Favourite icon turns into red");
		}

		catch (Exception e) {
			promotionsPage.clickSearchResultsFirstItemHeartIcon1();
			productsPage.clickOnFavouritePageHeartIconDropDownMyFavouriteChecbox();
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Heart</b> changed color");
			ErrorCollector.verifyTrue(promotionsPage.isSearchResultsFirstItemActiveHeartIconDisplaying(),
					"Verified : Favourite icon turns into red");
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_188UserIsAbleToPerformSortingOnTheBasisOfProductNameZ_AOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on product name z-a");
		promotionsPage.clickOnSortByDropDownProductNameZ_A();

		BeforeSortingStringList = promotionsPage.getProductNameList(driver);
		AfterSortingStringList = BeforeSortingStringList;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		assertEquals(BeforeSortingStringList, promotionsPage.getSortedDecendingStringArray(AfterSortingStringList),
				": Verify <b>Product Name Z_A</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_189UserIsAbleToPerformSortingOnTheBasisOfLowestPriceOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Lowest Price");
		promotionsPage.clickOnSortByDropDownProductNameLowestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = BeforeSortingDoubleList;

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " :Products should get sort on the basis of 'Lowest Price' on 'General Promotions' page");
		assertEquals(BeforeSortingDoubleList, promotionsPage.getSortedAcendingDoubleArray(AfterSortingDoubleList));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_190UserIsAbleToPerformSortingOnTheBasisOfHighestPriceOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		ArrayList<String> BeforeSortingStringList = new ArrayList<>();
		ArrayList<String> AfterSortingStringList = new ArrayList<>();

		ArrayList<Double> BeforeSortingDoubleList = new ArrayList<>();
		ArrayList<Double> AfterSortingDoubleList = new ArrayList<>();
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnSortbyDropDown();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On sort by Drop Down Product Name Highest Price");
		promotionsPage.clickOnSortByDropDownProductNameHighestPrice();

		BeforeSortingDoubleList = promotionsPage.getNumberOfgeneralPromotionsItemPricesList(driver);
		AfterSortingDoubleList = BeforeSortingDoubleList;

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " :Products should get sort on the basis of 'Highest Price' on 'General Promotions' page");
		assertEquals(BeforeSortingDoubleList, promotionsPage.getSortedDecendingDoubleArray(AfterSortingDoubleList));

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_191DropdownIconIsClickableAgainstViewFieldOnPointBasedProductsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait2s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Default</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownDefaultDisplaying(),
				"Verified : <b>Default</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify <b>Large</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownLargeDisplaying(),
				"Verified : <b>Large</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify <b>List</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownListDisplaying(),
				"Verified : <b>List</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify <b>Void</b> Option in  Sort by Drop Down is Displaying");
		ErrorCollector.verifyTrue(promotionsPage.isViewDropDownWideViewDisplaying(),
				"Verified : <b>Void</b> Option in  Sort by Drop Down is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	//@Test(priority = 29)
	public void TC_ID_1DefaultViewIsShownByDefaultForProductsOnPointBasedProductsPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		String sortByfieldDescription = promotionsPage.getDescriptionOfViewDropDown();
		String expectedDescription = "Default";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Default</b> is showing by default");
		ErrorCollector.verifyTrue(matchStringCaseInsensitiveTrim(expectedDescription, sortByfieldDescription),
				"Verified : <b>Product Name (A-Z)</b> is showing by default");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 29)
	public void TC_ID_193UserIsAbleToSelectLargeViewForProductsDisplayOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();

		Waits.wait3s();
		int defaultSize = promotionsPage.getSizeOfDefaultView();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Large option View Drop Down ");
		promotionsPage.clickOnViewDropDownLarge();
		Waits.wait3s();

		int largeViewSize = promotionsPage.getSizeOfLargeView();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Large</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(defaultSize < largeViewSize,
				"Verified : <b>Large</b> view of products should get display on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 29)
	public void TC_ID_194UserIsAbleToSelectListViewForProductsDisplayOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();

		int defaultSize = promotionsPage.getSizeOfDefaultView();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On List option View Drop Down ");
		promotionsPage.clickOnViewDropDownList();
		Waits.wait3s();

		int largeViewSize = promotionsPage.getSizeOfLargeView();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>List</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(defaultSize < largeViewSize,
				"Verified : <b>List</b> view of products should get display on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 29)
	public void TC_ID_195UserIsAbleToSelectListWideForProductsDisplayOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();

		int defaultSize = promotionsPage.getSizeOfDefaultView();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click on sort by drop down icon");
		promotionsPage.clickOnViewDropDownWideDropDown();
		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify <b>Wide</b> view of products should get display on 'General Promotions' page");
		ErrorCollector.verifyTrue(promotionsPage.isGeneralPromotionsFirstItemWideViewDisplaying(),
				"Verified : <b>Wide</b> view of products should get display on 'General Promotions' page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

	//@Test(priority = 29)
	public void TC_ID_196UserIsAbleToViewImagesInForwardDirectionGivenForAProductOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		String image1 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Right Arrow</b> Button on first Product");
		promotionsPage.clickOnFeaturedProduct1RightArrowButton();

		String image2 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify different image has appeared");
		ErrorCollector.verifyTrue(image1 != image2, ": Verified different image has appeared");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
		

	}
	
	//@Test(priority = 29)
	public void TC_ID_197UserIsAbleToViewImagesInBackwardDirectionGivenForAProductOnPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		String image1 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Left Arrow</b> Button on first Product");
		promotionsPage.clickOnFeaturedProduct1LeftArrowButton();

		String image2 = promotionsPage.getGeneralPromotionsItem1ImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify different image has appeared");
		ErrorCollector.verifyTrue(image1 != image2, ": Verified different image has appeared");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}
	
	//@Test(priority = 29)
	public void TC_ID_198UserIsAbleToApplyPreferredFilterOnProductsAgainstPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Preferred</b> filter");
		promotionsPage.scrollToViewDropDown();
		promotionsPage.clickOnGeneralPromotionsFiltersPreferred();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Preferred' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Preferred' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 29)
	public void TC_ID_199UserIsAbleToApplyRedeemPointsFilterOnProductsAgainstPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Redeem Point</b> filter");
		promotionsPage.scrollToViewDropDown();
		promotionsPage.clickOnGeneralPromotionsFiltersRedeemPoint();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Redeem Point' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Redeem Point' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

	//@Test(priority = 29)
	public void TC_ID_200UserIsAbleToApplyMyFavouritesFilterOnProductsAgainstPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>My Favourites</b> filter");
		promotionsPage.scrollToViewDropDown();
		promotionsPage.clickOnGeneralPromotionsFiltersMyFavorites();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'My Favourites' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'My Favourites' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	//@Test(priority = 29)
	public void TC_ID_201UserIsAbleToApplyPreviousOrdersFilterOnProductsAgainstPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Previous Orders</b> filter");
		promotionsPage.scrollToViewDropDown();
		promotionsPage.clickOnGeneralPromotionsFiltersPreviousOrders();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Previous Orders' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Previous Orders' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	//@Test(priority = 29)
	public void TC_ID_202UserIsAbleToApplyRebateFilterOnProductsAgainstPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Rebates</b> filter");
		promotionsPage.scrollToViewDropDown();
		promotionsPage.clickOnGeneralPromotionsFiltersRebate();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Rebates' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Rebates' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	//@Test(priority = 29)
	public void TC_ID_203UserIsAbleToApplyPromotionFilterOnProductsAgainstPointBasedProductsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		Waits.wait6s();
		Waits.wait2s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
		promotionsPage.clickOnViewDropDownn();
		Waits.wait1s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
		promotionsPage.clickOnViewDropDownDefault();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click on <b>Promotion</b> filter");
		promotionsPage.scrollToViewDropDown();
		promotionsPage.clickOnGeneralPromotionsFiltersPromotion();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ "Verify :  Products are filtered on the basis of 'Promotion' option on 'General Promotions' page and count is also updated  ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Products are filtered on the basis of 'Promotion' option on 'General Promotions' page and count is also updated  ");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	


}
