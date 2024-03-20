package com.vetscout.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.listeners.ExtentListeners;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.pages.SingupPage;

public class HomeTest extends BaseClass {

	@Test(priority = 1)
	public void TC_ID_17_VerifyUserAbleToRedirectedToTheProfilePageFromNavigationPanel() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>  Button");
		homePage.clickOnUserProfileButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Profile Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isProfilePageTitleDisplaying(),
				"Verified 'Profile Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 2)
	public void TC_ID_18_VerifyUserAbleToRedirectedToAnnouncementPageFromNavigationPanel() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Message</b> Icon");
		homePage.clickOnNavigationMessageIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Announcements Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isAnnouncementsPageTitleDisplaying(),
				"Verified 'Announcements Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 3)
	public void TC_ID_19_VerifyUserIsAbleToRedirectedToCartFromNavigationPanel() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Sopping Card</b> Icon");
		homePage.clickOnNavigationCard();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Shopping Card Checkout</b> Button");
		homePage.clickOnNavigationCardCheckout();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Card Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isCardPageTitleDisplaying(), "Verified 'Card Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 4)
	public void TC_ID_20_VerifyUserAbleToRedirectedToVetscoutPointsListFromNavigationPanel()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Point Comming Soon' is displaying");
		ErrorCollector.verifyTrue(homePage.isPointCommingSoonDisplaying(), "Verified 'Point Comming Soon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	@Test(priority = 5)
	public void TC_ID_21_VerifyUserAbleRedirectedToTransactionsPageFromTheNavigationPanel()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Navigation <b>Buck</b> Button");
		homePage.clickOnNavigationBuckButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Buck Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isBuckPageTitleDisplaying(), "Verified 'Buck Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	
	@Test(priority = 6)
	public void TC_ID_22_VerifyUserIsAbleToRedirectedToSpecificPageFromTheNavigationMenu() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Navigation <b>Products</b> Button");
		homePage.clickOnNavigationProductsButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Products Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isProductsPageTitleDisplaying(),
				"Verified 'Products Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	 @Test(priority = 7)
	public void TC_ID_23_VerifyUserAbleToSeeMoneyUsedToPurchaseThisYearOnTheAnalyticalTabAvailableOnHomepage()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;
		
		waitfor5sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify on the right side of home page 'Purchases This Year Money' is displaying");
		ErrorCollector.verifyTrue(homePage.isPurchasesThisYearMoneyDisplaying(),
				"Verified on the right side of home page 'Purchases This Year Money' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 8)
	public void TC_ID_24_VerifyUserAbleToSeeTotalOfRebatesAndSavingsOnTheAnalyticalTabAvailableOnHomepage()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Verify on the right side of home page 'Rebates And Savings Money' is displaying");
		ErrorCollector.verifyTrue(homePage.isRebatesAndSavingsMoneyDisplaying(),
				"Verified on the right side of home page 'Rebates And Savings Money' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 9)
	public void TC_ID_25_VerifyUserAbleToSeeTotalOfMissedSavingOnTheAnalyticalTabAvailableOnHomepage()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Verify on the right side of homepage 'Missed Savings Money' is displaying");
		ErrorCollector.verifyTrue(homePage.isMissedSavingsMoneyDisplaying(),
				"Verified on the right side of homepage 'Missed Savings Money' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 10)
	public void TC_ID_26_VerifyUserAbleToRedirectedToTheHomepageByClickingOnTheSiteLogoAvailableOnNavigationPanel()
			throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		int step = 5;
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Logo Icon</b> Button");
		login.clickOnHomePageLogoIconButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 11)
	public void TC_ID_27_VerifyThatUserIsAbleToRedirectToProductsPageByClickingOnProductsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Products</b> Button");
		homePage.clickOnNavigationProductsButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Products'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isProductsPageTitleDisplaying(),
				"Verified 'Products'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 12)
	public void TC_ID_28_VerifyThatUserIsAbleToAccessPromotionsPageByClickingOnPromotionsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Promotions</b> Button");
		homePage.clickOnNavigationPromotionsButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Promotions'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPromotionsPageTitleDisplaying(),
				"Verified 'Promotions'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 13)
	public void TC_ID_29_VerifyThatUserIsAbleToAccessRebatesPageByClickingOnRebatesFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Rebates</b> Button");
		homePage.clickOnNavigationRebatesButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Rebates'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isRebatesPageTitleDisplaying(),
				"Verified 'Rebates'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 14)
	public void TC_ID_30_VerifyThatUserIsAbleToAccessOrdersPageByClickingOnOrdersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Orders</b> Button");
		homePage.clickOnNavigationOrdersButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Orders'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageTitleDisplaying(), "Verified 'Orders'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 15)
	public void TC_ID_31_VerifythatUserIsAbleToAccessAnalyticsPageByClickingOnAnalyticsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Analytics</b> Button");
		homePage.clickOnNavigationAnalyticsBtnButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Analytics'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageTitleDisplaying(),
				"Verified 'Analytics'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 16)
	public void TC_ID_32_VerifyThatUserIsAbleToAccessPartnersPageByClickingOnPartnersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Partners</b> Button");
		homePage.clickOnNavigationPartnersButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Partners'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPartnersPageTitleDisplaying(),
				"Verified 'Partners'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 17)
	public void TC_ID_33_VerifyThatUserIsAbleToAccessByMerchantPageByClickingOnAnalyticsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Analytics' in navigation and Click On <b>By Merchant</b> option");
		homePage.hoverAnalyticsAndClickByMerchant();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Merchant' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageTitleDisplaying(),
				"Verified 'Merchant' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 18)
	public void TC_ID_34_VerifyThatUserIsAbleToAccessByManufacturerPageByClickingOnAnalyticsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Hover on 'Analytics' in navigation and Click On <b>By Manufacturer</b> option");
		homePage.hoverAnalyticsAndClickByManufacturer();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Manufacturer' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageByManufacturerPageTitleDisplaying(),
				"Verified 'Manufacturer' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 19)
	public void TC_ID_35_VerifyThatUserIsAbleToAccessByProductPageByClickingOnAnalyticsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Analytics' in navigation and Click On <b>By Product</b> option");
		homePage.hoverAnalyticsAndClickByProduct();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Product' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageByProductPageTitleDisplaying(),
				"Verified 'By Product' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 20)
	public void TC_ID_36_VerifyThatUserIsAbleToAccessByHistoryPageByClickingOnOrdersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 21)
	public void TC_ID_37_VerifyThatUserIsAbleToAccessByBackorderedPageByClickingOnOrdersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'BackOrdered' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBackOrderedPageTitleDisplaying(),
				"Verified 'BackOrdered' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 22)
	public void TC_ID_38_VerifyThatUserIsAbleToAccessByProductPageByClickingOnOrdersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
	

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By Product</b> option");
		homePage.hoverOrdersAndClickByProduct();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Product' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isByProductPageTitleDisplaying(),
				"Verified 'By Product' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 23)
	public void TC_ID_39_VerifyThatUserIsAbleToAccessByManufacturerPageByClickingOnOrdersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Manufacturer' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByManufacturerPageTitleDisplaying(),
				"Verified 'By Manufacturer' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 24)
	public void TC_ID_40_VerifyThatUserIsAbleToAccessByBudgetPageByClickingOnOrdersFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By Budget</b> option");
		homePage.hoverOrdersAndClickByBudget();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Budget' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBudgetPageTitleDisplaying(),
				"Verified 'By Budget' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 25)
	public void TC_ID_41_VerifyThatUserIsAbleToAccessByFavouritesPageByHoveringOnProductsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 26)
	public void TC_ID_42_VerifyThatUserIsAbleToAccessPreviousOrdersByHoveringOnProductsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Previous Order' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPreviousOrdersPageTitleDisplaying(),
				"Verified 'Previous Order' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	@Test(priority = 27)
	public void TC_ID_43_VerifyThatUserIsAbleToAccessAllProductsPageByHoveringOnProductsFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	
	@Test(priority = 28)
	public void TC_ID_44_VerifyThatUserIsAbleToAccessGeneralPromotionsPageByHoveringOnPromotionFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'General Promotions' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPromotionsPageTitleDisplaying(),
				"Verified 'General Promotions' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	//@Test(priority = 29)
	public void TC_ID_45_VerifyThatUserIsAbleToAccessPointsPageByHoveringOnPromotionFromNavigationPanel()
			throws InterruptedException {

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

	@Test(priority = 30)
	public void TC_ID_46_VerifyThatUserIsAbleToAccessPSIVETRebatesPageByHoveringOnRebatesFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
	
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rebate' in navigation and Click On <b>PSIVET Rebates</b> option");
		homePage.hoverRebateAndClickAllPSIVETRebatesOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'PSIVET Rebates' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPSIVETRebatesSectionPageTitleDisplaying(),
				"Verified 'PSIVET Rebates' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 31)
	public void TC_ID_47_VerifyThatUserIsAbleToAccessPSIVETSavingsPageByHoveringOnRebatesFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rebate' in navigation and Click On <b>PSIVET Savings</b> option");
		homePage.hoverRebatesAndClickPSIVETSavingsOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'PSIVET Savings' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPSIVETSavingsSectionPageTitleDisplaying(),
				"Verified 'PSIVET Savings' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 32)
	public void TC_ID_48_VerifyThatUserIsAbleToAccessEstimatorPageByHoveringOnRebatesFromNavigationPanel()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rebate' in navigation and Click On <b>Estimator</b> option");
		homePage.hoverRebatesAndClickAllEstimatorOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Estimator' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isRebatesPageTitleDisplaying(),
				"Verified 'Estimator' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	

	@Test(priority = 33)
	public void TC_ID_50_VerifyUserIsAbleToSeeTheFeaturedProductsOnTheHomepage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		if (homePage.isFeaturedProductsDescriptionsDisplaying()) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
			ErrorCollector.verifyTrue(homePage.scrollDownToFeaturedProducts(),
					": Scroll to element <b>Featured Products</b>");

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Featured Products' are displaying");
			ErrorCollector.verifyTrue(homePage.isFeaturedProductsDescriptionsDisplaying(),
					"Verified : 'Featured Products' are displaying");
		} else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Feature Products are not displaying");

		}

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 34)
	public void TC_ID_51_VerifyUserIsAbleToaddFeaturedItemsInToTheFavourites() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		waitfor5sec();

		if (homePage.isFeaturedProductsDescriptionsDisplaying()) {

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
		ErrorCollector.verifyTrue(homePage.scrollDownToFeaturedProducts(),
				": Scroll to element <b>Featured Products</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Heart</b> Shaped Icon");
		homePage.clickOnheartShapedIcon();

		if (!homePage.isActiveHeartShapedIconDisplaying())
			homePage.clickOnheartShapedIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify <b>Heart</b> changed color");
		ErrorCollector.verifyTrue(homePage.isActiveHeartShapedIconDisplaying(),
				"Verified : <b>Heart</b> changed color");
		} else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Feature Products are not displaying");

		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 37)
	public void TC_ID_52_VerifyUserIsAbleToSwipeProductImagesOnTheProductCard() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		waitfor3sec();

		if (homePage.isFeaturedProductsDescriptionsDisplaying()) {

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
		ErrorCollector.verifyTrue(homePage.scrollDownToFeaturedProducts(),
				": Scroll to element <b>Featured Products</b>");

		waitfor5sec();

		String image1 = homePage.getImageSource();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Click On <b>Right Arrow</b> Button on first Feature Product");
		homePage.clickOnFeaturedProduct1RightArrowButton();

		String image2 = homePage.getImageSource();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify different image has appeared");
		ErrorCollector.verifyTrue(image1 != image2, ": Verified different image has appeared");

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Click On <b>Left Arrow</b> Button on first Feature Product");
		homePage.clickOnFeaturedProduct1LeftArrowButton();

		String image3 = homePage.getImageSource();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
		ErrorCollector.verifyTrue(new String(image1).equals(image3), ": Scroll to element <b>Featured Products</b>");
		} else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Feature Products are not displaying");

		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 35)
	public void TC_ID_53_VerifyUserIsAbleToUnhideAllAvailableVendorsByClickingOnSeeMoreButtonAvailableOnTheProductCard()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;

		if (homePage.isFeaturedProductsDescriptionsDisplaying()) {

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
		ErrorCollector.verifyTrue(homePage.scrollDownToFeaturedProducts(),
				": Scroll to element <b>Featured Products</b>");

		int vendorlist = homePage.getNumberOfVendorsShowing();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Show more</b> link");
		homePage.clickOnShowMore();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " Verify User is able to see all available vendors which are hide");
		ErrorCollector.verifyTrue(vendorlist > 0,
				" Verified: User is able to see all available vendors which are hide");
		} else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Feature Products are not displaying");

		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 36)
	public void TC_ID_54_VerifyUserIsAbleTohideAllAvailableVendorsByClickingOnSeelessButtonAvailableOnTheProductCard()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;


		if (homePage.isFeaturedProductsDescriptionsDisplaying()) {

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
		ErrorCollector.verifyTrue(homePage.scrollDownToFeaturedProducts(),
				": Scroll to element <b>Featured Products</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Show more</b> link");
		homePage.clickOnShowMore();

		int vendorlist = homePage.getNumberOfVendorsShowing();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " Verify User is able to see all available vendors which are hide");
		ErrorCollector.verifyTrue(vendorlist > 0,
				" Verified: User is able to see all available vendors which are hide");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Show less</b> link");
		homePage.clickOnShowLess();

		vendorlist = homePage.getNumberOfVendorsShowing();

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " Verify User is able to hide all unhide available vendors by clicking on 'see less' button available on the product card");
		ErrorCollector.verifyTrue(vendorlist > 0,
				" Verified: User is able to hide all unhide available vendors by clicking on 'see less' button available on the product card");

		} else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Feature Products are not displaying");

		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 38)
	public void TC_ID_55_VerifyUserIsAbleToSeeTooltipProductTitleOnHoverOverTheProductImageAndProductNameOnTheProductCard()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;


		if (homePage.isFeaturedProductsDescriptionsDisplaying()) {

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to element <b>Featured Products</b>");
		ErrorCollector.verifyTrue(homePage.scrollDownToFeaturedProducts(),
				": Scroll to element <b>Featured Products</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover over <b>Featured Products</b>");
		homePage.hoverOverFeatureProductImage();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify is featured Product Tool Tip Displaying");
		ErrorCollector.verifyTrue(homePage.isFeaturedProductToolTipDisplaying(),
				": Verified is featured Product Tool Tip Displaying");


		} else {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Feature Products are not displaying");

		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}



	
}
