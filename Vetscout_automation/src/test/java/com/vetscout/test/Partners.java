package com.vetscout.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.pages.CartPage;
import com.vetscout.pages.ContactUsPage;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.OrdersPage;
import com.vetscout.pages.Partners_And_BudgetsPage;
import com.vetscout.pages.ProductsPage;
import com.vetscout.pages.ProfilePage;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.pages.RebatesPsiRebatesPage;
import com.vetscout.utilities.Waits;

public class Partners extends BaseClass {

	 @Test(priority = 25)
	public void TC_256_257_259_VerifyUserIsAbleToSeeAllPartnersOnThePartnersPage() throws InterruptedException {

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage partnersPage = new Partners_And_BudgetsPage();
		int step = 5;

		String qa_departmentColor_In_Partners_Page = PropertiesReader
				.getPropertyValue(env + "_" + "departmentColor_In_Partners_Page");

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_256 Verify user is able to see all partners on the partners page</ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Partners</b> Button");
		homePage.clickOnNavigationPartnersButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Partners'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPartnersPageTitleDisplaying(),
				"Verified 'Partners'Page Title is displaying");

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_257 Verify user is able to see the partners for each department mentioned with the highlighted line</ b>");

		String getBackGroundColor = partnersPage.getBackgroundColor().split("\\)")[0];
		getBackGroundColor = getBackGroundColor + ")";
		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify user is able to see the partners for each department mentioned with the highlighted line");
		ErrorCollector.verifyEquals(getBackGroundColor, qa_departmentColor_In_Partners_Page,
				"Verified user is able to see the partners for each department mentioned with the highlighted line");

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step)
				+ " : TC_259 Verify user is able to see partner image on the left and partner descriptiona and links on the right side under each department</ b>");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Verify user is able to see partner image on the left and partner descriptiona and links on the right side under each department");
		ErrorCollector.verifyTrue(partnersPage.isLinkRightToImageDisplaying(),
				"Verified Verify user is able to see partner image on the left and partner descriptiona and links on the right side under each department");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeDriver();

	}

	@Test(priority = 26)
	public void TC_258_VerifyUserIsAbleToSeeRelatedPartnerUnderEachDepartment() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage partnersPage = new Partners_And_BudgetsPage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Partners</b> Button");
		homePage.clickOnNavigationPartnersButton();

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Association' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isAssociationDepartmentPartnerDisplaying(),
				"Verified  'Association' Department Partner is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Manufacturing' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isMANUFACTURINGDepartmentPartnerDisplaying(),
				"Verified  'Manufacturing' Department Partner is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Health Care' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isHEALTHCAREDepartmentPartnerDisplaying(),
				"Verified  'Health Care' Department Partner is displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Health Certificate' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isHEALTHCERTIFICATESDepartmentPartnerDisplaying(),
				"Verified  'Health Certificate' Department Partner is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'PET Food' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isPETFOODDepartmentPartnerDisplaying(),
				"Verified  'Pet Food' Department Partner is displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Surgical Supplies' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isSURGICALSUPPLIESDepartmentPartnerDisplaying(),
				"Verified  'Surgical Supplies' Department Partner is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify 'Compounding Pharmacy' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isCOMPOUNDINGPHARMACYDepartmentPartnerDisplaying(),
				"Verified  'Compounding Pharmacy' Department Partner is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Specialty' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isSPECIALTYDepartmentPartnerDisplaying(),
				"Verified  'Specialty' Department Partner is displaying");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify 'Human Resources' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isHUMANRESOURCESDepartmentPartnerDisplaying(),
				"Verified  'Human Resources' Department Partner is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Telemedicined' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isTELEMEDICINEDepartmentPartnerDisplaying(),
				"Verified  'Telemedicined' Department Partner is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify 'Office Sanitary Supplices' Department Partner is displaying");
		ErrorCollector.verifyTrue(partnersPage.isOFFICESANITARYSUPPLIESDepartmentPartnerDisplaying(),
				"Verified  'Office Sanitary Supplices' Department Partner is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeDriver();
	}

	@Test(priority = 2)
	public void TC_ID_57_UserIsAbleToAddItemToMyFavoriteOnGeneralPromotionsPage() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Heart</b> Shaped Icon");
		promotionsPage.clickSearchResultsFirstItemHeartIcon();

		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Heart</b> changed color");
		ErrorCollector.verifyTrue(promotionsPage.isSearchResultsFirstItemActiveHeartIconDisplaying(),
				"Verified : Favourite icon turns into red");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 3)
	public void TC_ID_293_VerifyUserIsAbleToRedirectToCheckout() throws InterruptedException {
		login();

		CartPage cartPage = new CartPage();

		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover On <b>Cart</b>  Button");
		cartPage.hoverOverNavigationCard();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Checkout</b>  Button");
		cartPage.clickOnCheckOutCart();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 23)
	public void TC_ID_103_VerifyClickingOnViewInCartUserRedirectedToTheCart() throws InterruptedException {

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

		productsPage.getRefreshWebPage();
		waitfor3sec();

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Add to cart button");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();
			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			} else {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Close Button");
				productsPage.clickOnCloseButton();

			}
		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'added To Cart Message' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isAddedToCartMessageDisplaying(),
				" : Verified 'added To Cart Message' is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On continue Shopping Button");
		productsPage.clickOnContinueShoppingButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
		productsPage.clickOnFirstItemWithViewItemButton(descriptionOfFirstItem);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On update Cart Button");
		productsPage.clickOnUpdateCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify cart Page Heading Displaying");
		productsPage.isCartPageHeadingDisplaying();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();

	}

	@Test(priority = 22)
	public void TC_ID_104_VerifyAddToCartButtonChangedWithViewInCartButtonWhenProductIsAddedToTheCart()
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

		String descriptionOfFirstItem = productsPage.getDescriptionOfFirstAddToCartButtonDescription();

		int promotionsItems = productsPage.getNumberOfAddToCart();

		for (Integer i = 1; i <= promotionsItems; i++) {
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartButtonDescription(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
			productsPage.clickOnFirstItemWithAddToCartButton(i);

			ErrorCollector.extentLogInfo("Step " + (++step) + " : click On add To Cart Button in Pop Up");
			productsPage.clickOnAddToCartButtonPopUp();
			descriptionOfFirstItem = productsPage.getDescriptionOffirstAddToCartProduct();
			if (productsPage.isAddedToCartMessageDisplaying()) {
				break;
			} else {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Ok Button");
				productsPage.clickOnOkButton();

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Close Button");
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

	@Test(priority = 28)
	public void TC_ID_108_VerifyUserIsAbleToSearchPreviousOrderedByManufacturer() throws InterruptedException {

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsFirst = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Enter <b>Royal Canin</b> the field label with 'Manufacturer' ");
		productsPage.enterSearchBarManufacturer("Royal Canin");

		int ResultsAfter = promotionsPage.getNumberofResultsShowing();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify Searched product <b>Royal Canin</b> is be displayed on the page");
		ErrorCollector.verifyTrue(
				new String(promotionsPage.getTextOfSearchResultsManufacturer()).contains("Royal Canin"),
				"Verified Searched product <b>Royal Canin</b> is be displayed on the page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Get number of results Showing After Applying filter");
		promotionsPage.scrollDownToGeneralPromotionsPaginationLastPageNumber();
		int numberOfResultsAfter = Integer
				.parseInt(promotionsPage.getDescriptionOfGeneralPromotionsPaginationLastPageNumber());

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify Number of Results have changed after applying <b>My Favourites</b> filter ");
		ErrorCollector.verifyTrue(numberOfResultsAfter < numberOfResultsFirst,
				"Verified : Number of Results have changed after applying <b>My Favourites</b> filter");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 34)
	public void TC_ID_115_VerifyUserIsAbleToSeeViewInCartButtonOnTheProductsCardWhichAreAlreadyInCart()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		waitfor5sec();

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'View in Cart' Message is Displaying");
		ErrorCollector.verifyTrue(productsPage.isViewInCartDisplaying(),
				" : Verified 'View in Cart' Message is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 48)
	public void TC_ID_151AddToCartverifyUserIsAbleToSeePricesForAllAvailableVendorWhoseStocksAreAvailableOnAddToCartPopup()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
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

			try {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'price In front Vendor' is Displaying");
				ErrorCollector.verifyTrue(productsPage.isPriceInfrontVendorDisplaying(),
						" : Verified 'price In front Vendor' is Displaying");
				break;
			} catch (Exception e) {

				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();

			}

			if (i == promotionsItems && pageCounter < 5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i = 0;
			}
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 44)
	public void TC_ID_154VerifyUserIsNotAbleToSelectVendorWhoIsOutOfStockFromTheAddToCartPopup()
			throws InterruptedException {

		login();
		HomePage homePage = new HomePage();

		ProductsPage productsPage = new ProductsPage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Products</b> option");
		homePage.hoverProductsAndClickMyProducts();
//
//		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Product Heading <b>Monitor Accessories </b>");
//		productsPage.clickOnFirstProductHeadingAdministrationAndTransfusion();

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

			if (productsPage.isVendorAvailablityCheckboxDisplaying()) {
				break;
			} else {
				ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On First Item With View Item Button");
				productsPage.clickOnCloseButton();
			}

			if (i == promotionsItems && pageCounter < 5) {
				productsPage.clickNextPageButton(Integer.toString(++pageCounter));
				waitfor5sec();
				i = 0;
			}
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'is vendor Availablity Checkbox' is Displaying");
		ErrorCollector.verifyTrue(productsPage.isVendorAvailablityCheckboxDisplaying(),
				": Verified 'is vendor Availablity Checkbox' is Displayingg");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 50)
	public void TC_ID_174VerifyUserIsAbleToSeePricesOfTheProductWhichIsAddedToTheCart() throws InterruptedException {

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
		ErrorCollector.extentLogInfo("Step " + (++step) + " : click On view Cart Button");
		productsPage.clickOnViewCartButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is cart Page Items Displaying");
		ErrorCollector.verifyTrue(productsPage.iscartPageItemsDisplaying(), ": Verify is cart Page Items Displaying");

		
		waitfor5sec();


		ErrorCollector.extentLogInfo("Step " + (++step) + "Verify :  User is able to see the 'Price' of product");
		ErrorCollector.verifyTrue(productsPage.isPriceInfrontVendorCartDisplaying(),
				"Verified :   User is able to see the 'Price' of product");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


}
