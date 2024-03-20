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
import com.vetscout.pages.ProductsPage;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.pages.SingupPage;
import com.vetscout.utilities.Waits;
import com.vetscout.pages.ExcerciseObjectsPage;

public class MonkeyTest  extends BaseClass { 

	@Test(priority = 1)
	public void TC_ID_VerifyThatWeCanNavigateToEachPageAndExcerciseTheObjectsOnThatPageHomePage() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();


		ProductsPage productsPage = new ProductsPage();
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		login.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>******TC ID 2	Homepage	Verify user is able to see vetscout points page by clicking on 'Points' button ****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Points</b>  Button");
		homePage.clickOnPointsButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is redirected to vetscout points page");
		ErrorCollector.verifyTrue(homePage.isPointsPageDisplaying(),
				"Verified User is redirected to vetscout points page");


		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 3	Verify user is able to see the transaction page by clicking on 'Bucks' button*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>points buck button</b>");
		homePage.clickOnPointsBuckButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is redirected to transaction page");
		ErrorCollector.verifyTrue(homePage.isTransactionsPageDisplaying(), "Verified User is redirected to transaction page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 4 Verify user is able to redirect to the profile page from navigation panel *****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>  Button");
		homePage.clickOnUserProfileButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User should be redirected to profile page");
		ErrorCollector.verifyTrue(homePage.isProfilePageTitleDisplaying(),
				"Verified User should be redirected to profile page");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****5 Verify user is able to redirect to announcement page from the navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Message</b> Icon");
		homePage.clickOnNavigationMessageIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Announcements Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isAnnouncementsPageTitleDisplaying(),
				"Verified 'Announcements Page Title' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 6 Verify user is able to see the cart popup from the navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover Over <b>Navigation Sopping Card</b> Icon");
		homePage.hoverOverNavigationCard();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User should be to see the quick cart popup ");
		ErrorCollector.verifyTrue(homePage.isNavigationCardCheckoutDisplaying(),"Verified User should be to see the quick cart popup ");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 7 Verify that user is able to redirect to 'Products' page by clicking on 'Products' from navigation panel*****</b>");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Navigation <b>Products</b> Button");
		homePage.clickOnNavigationProductsButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Products Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isProductsPageTitleDisplaying(),
				"Verified 'Products Page Title' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 8 Verify that user is able to access 'Promotions' page by clicking on 'Promotions' from navigation panel*****</b>");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Promotions</b> Button");
		homePage.clickOnNavigationPromotionsButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Promotions'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPromotionsPageTitleDisplaying(),
				"Verified 'Promotions'Page Title is displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 9 Verify that user is able to access 'Rebates' page by clicking on 'Rebates' from navigation panel*****</b>");
		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Rebates</b> Button");
		homePage.clickOnNavigationRebatesButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Rebates'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isRebatesPageTitleDisplaying(),
				"Verified 'Rebates'Page Title is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 10 Verify that user is able to access 'Orders' page by clicking on 'Orders' from navigation panel*****</b>");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		Waits.wait5s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Orders</b> Button");
		homePage.clickOnNavigationOrdersButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Orders'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageTitleDisplaying(), "Verified 'Orders'Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 11 Verify that user is able to access 'Analytics' page by clicking on 'Analytics' from navigation panel*****</b>");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Analytics</b> Button");
		homePage.clickOnNavigationAnalyticsBtnButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Analytics'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageTitleDisplaying(),
				"Verified 'Analytics'Page Title is displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC 12 Verify that user is able to access 'Partners' page by clicking on 'Partners' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Home Page  Navigation <b>Partners</b> Button");
		homePage.clickOnNavigationPartnersButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Partners'Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPartnersPageTitleDisplaying(),
				"Verified 'Partners'Page Title is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 13 Verify that user is able to access 'By Merchant' page by hovering on 'Analytics' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
				
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Analytics' in navigation and Click On <b>By Merchant</b> option");
		homePage.hoverAnalyticsAndClickByMerchant();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Merchant' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageTitleDisplaying(),
				"Verified 'Merchant' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 14 Verify that user is able to access 'By Manufacturer' page by hovering on 'Analytics' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
						

		ErrorCollector.extentLogInfo("Step " + (++step)
				+ " : Hover on 'Analytics' in navigation and Click On <b>By Manufacturer</b> option");
		homePage.hoverAnalyticsAndClickByManufacturer();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Manufacturer' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageByManufacturerPageTitleDisplaying(),
				"Verified 'Manufacturer' Page Title is displaying");
	

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 15 Verify that user is able to access 'By Product' page by hovering on 'Analytics' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
								
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Analytics' in navigation and Click On <b>By Product</b> option");
		homePage.hoverAnalyticsAndClickByProduct();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Product' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageByProductPageTitleDisplaying(),
				"Verified 'By Product' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 16 Verify that user is able to access 'History' page by hovering on 'Orders' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
								
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By History</b> option");
		homePage.hoverOrdersAndClickByHistory();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By History' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByHistoryPageTitleDisplaying(),
				"Verified 'By History' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 17 Verify that user is able to access 'Backordered' page by hovering on 'Orders' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
				
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>BackOrdered</b> option");
		homePage.hoverOrdersAndClickBackOrdered();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'BackOrdered' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBackOrderedPageTitleDisplaying(),
				"Verified 'BackOrdered' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 18 Verify that user is able to access 'By Product' page by hovering on 'Orders' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By Product</b> option");
		homePage.hoverOrdersAndClickByProduct();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Product' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isByProductPageTitleDisplaying(),
				"Verified 'By Product' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 19 Verify that user is able to access 'By Manufacturer' page by hovering on 'Orders' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
				
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By Manufacturer</b> option");
		homePage.hoverOrdersAndClickByManufacturer();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Manufacturer' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByManufacturerPageTitleDisplaying(),
				"Verified 'By Manufacturer' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 20 Verify that user is able to access 'Budgets' page by hovering on 'Orders' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>By Budget</b> option");
		homePage.hoverOrdersAndClickByBudget();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'By Budget' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBudgetPageTitleDisplaying(),
				"Verified 'By Budget' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 21 Verify that user is able to access 'My favourites' page by hovering on 'Products' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
			
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>My Favorites</b> option");
		homePage.hoverProductsAndClickMyFavorites();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'My Favorites' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isFavoriteProductsPageTitleDisplaying(),
				"Verified 'My Favorites' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 22 Verify that user is able to access 'Previous orders' page by hovering on 'Products' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>Previous Order</b> option");
		homePage.hoverProductsAndClickMyProducts();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Previous Order' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPreviousOrdersPageTitleDisplaying(),
				"Verified 'Previous Order' Page Title is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 23 Verify that user is able to access 'All Products' page by hovering on 'Products' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
			
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Products' in navigation and Click On <b>All Categories</b> option");
		homePage.hoverProductsAndClickAllCategories();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'All Categories' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAllProductsPageTitleDisplaying(),
				"Verified 'All Categories' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 24 Verify that user is able to access 'General' promotion page by hovering on 'Promotions' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
		homePage.hoverPromotionAndClickAllGeneralOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'General Promotions' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPromotionsPageTitleDisplaying(),
				"Verified 'General Promotions' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 25 Verify that user is able to access 'Points'  page by hovering on 'Promotions' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
				

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>Points</b> option");
		homePage.hoverPromotionAndClickAllExclusiveOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Points Base Products' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPointsBasedProductsPageTitleDisplaying(),
				"Verified 'Points Base Products' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 26 Verify that user is able to access 'PSIVET Rebates'  page by hovering on 'Rebates' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
						

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rebate' in navigation and Click On <b>PSIVET Rebates</b> option");
		homePage.hoverRebateAndClickAllPSIVETRebatesOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'PSIVET Rebates' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPSIVETRebatesSectionPageTitleDisplaying(),
				"Verified 'PSIVET Rebates' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 27 Verify that user is able to access 'PSIVET Savings'  page by hovering on 'Rebates' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rebate' in navigation and Click On <b>PSIVET Savings</b> option");
		homePage.hoverRebatesAndClickPSIVETSavingsOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'PSIVET Savings' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isPSIVETSavingsSectionPageTitleDisplaying(),
				"Verified 'PSIVET Savings' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 28 Verify that user is able to access 'Estimator'  page by hovering on 'Rebates' from navigation panel*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rebate' in navigation and Click On <b>Estimator</b> option");
		homePage.hoverRebatesAndClickAllEstimatorOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Estimator' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isRebatesPageTitleDisplaying(),
				"Verified 'Estimator' Page Title is displaying");
				
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 29 Verify that user is able to access 'Contact us' page from profile icon*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b>");
		homePage.clickOnUserContactUs();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User should be redirected to contact us page");
		ErrorCollector.verifyTrue(homePage.isContactInfoHeadingDisplaying(),
				"User should be redirected to contact us page");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 30 Verify that user is able to redirected to 'Analytics by merchant' page by clicking on tab with label 'Purchases this year'*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b>");
		homePage.clickOnPurchasesThisYearMoneyButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Merchant' Page Title is displaying");
		ErrorCollector.verifyTrue(homePage.isAnalyticsPageTitleDisplaying(),
				"Verified 'Merchant' Page Title is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 31 Verify that user is able to redirected to 'PSI rebates and saving' page by clicking on tab with label 'Rebates and savings test'*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Rebates And Savings Money</b>");
		homePage.clickOnRebatesAndSavingsMoney();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User redirected to the page 'PSI rebates and savings'");
		ErrorCollector.verifyTrue(homePage.isrebatesAndSavingsPageRebatesHeadingDisplaying(),
				"Verified User redirected to the page 'PSI rebates and savings'");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 32 Verify that user is able to redirected to missed savings section of 'PSI rebates and savings' page by clicking on tab with label 'Missed savings'*****</b>");
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home page Logo</b>");
		homePage.clickOnHomePageLogoIcon();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Rebates And Savings Money</b>");
		homePage.clickOnmissedSavingsMoney();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User redirected to the page 'PSI rebates and savings' and missed savings section shown");
		ErrorCollector.verifyTrue(homePage.isRebatesAndSavingsPageMissedSavingsHeadingDisplaying(),
				"Verify User redirected to the page 'PSI rebates and savings' and missed savings section shown");
					
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 33 Verify user is able to see cart page *****</b>");
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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify cart Page Heading Displaying");
		ErrorCollector.verifyTrue(productsPage.isCartPageHeadingDisplaying(),
				" : Verified cart Page Heading Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 2)
	public void TC_ID_VerifyThatWeCanNavigateToEachPageAndExcerciseTheObjectsOnThatPageProfile() throws InterruptedException {

		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();

		PromotionsPage promotionsPage = new PromotionsPage();
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");

		String toSearch="AccuTreat";
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
		homePage.enterIntoSearchBar(toSearch);
		Waits.wait3s();
		
		String textOfResult=promotionsPage.getTextOfSearchedResults();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see result page with the results");
		ErrorCollector.verifyTrue(textOfResult.trim().equalsIgnoreCase(toSearch.trim()), "Verified User is able to see result page with the results");


		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 35 Verify user is able to see 'Practice' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>  Button");
		homePage.clickOnUserProfileButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Profile Page Title' is displaying");
		ErrorCollector.verifyTrue(homePage.isProfilePageTitleDisplaying(),
				"Verified 'Profile Page Title' is displaying");
		
		//========================

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b> Option");
		homePage.clickOnuserProfilePagePracticeOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify  User is able to see 'Practice' page");
		ErrorCollector.verifyTrue(homePage.isUserProfilePracticeInformationTitleDisplaying(),
				"Verified User is able to see 'Practice' page");
		
		//=========================
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 36 Verify user is able to see 'Additonal users' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Additional Users</b> Option");
		homePage.clickOnuserProfilePageAdditionalUsersOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify  User is able to see 'Additonal users' page");
		ErrorCollector.verifyTrue(homePage.isUserProfileAdditionalUsersTitleDisplaying(),
				"Verified User is able to see 'Additonal users' page");
		
		//=========================
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 37 Verify user is able to see 'Address' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Address</b> Option");
		homePage.clickOnuserProfilePageAddressOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see 'Address' page from the profile page");
		ErrorCollector.verifyTrue(homePage.isUserProfileBillingAdressTitleDisplaying(),
				"Verified user is able to see 'Address' page from the profile page");
		
		//=========================
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 38 Verify user is able to see 'Notifications' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Notifications</b> Option");
		homePage.clickOnuserProfilePageNotificationsOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see 'Notifications' page from the profile page");
		ErrorCollector.verifyTrue(homePage.isUserProfileNotificationOrderConfimationDisplaying(),
				"Verified user is able to see 'Notifications' page from the profile page");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 39 Verify user is able to see 'Vendors' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Vendors</b> Option");
		homePage.clickOnuserProfilePageVendorsOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see 'Vendors' page from the profile page ");
		ErrorCollector.verifyTrue(homePage.isUserProfileVendorsDisplaying(),
				"Verified user is able to see 'Vendors' page from the profile page");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 40 Verify user is able to see 'Rewards Program' page from the profile page*****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Rewards Program</b> Option");
		homePage.clickOnuserProfilePageRewardsProgramOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see 'Rewards Program' page from the profile page");
		ErrorCollector.verifyTrue(homePage.isUserProfileRewardsProgramPageDisplaying(),
				"Verified user is able to see 'Rewards Program' page from the profile page");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 41 Verify user is able to see 'Groups' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Groups</b> Option");
		homePage.clickOnuserProfilePageGroupsOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see 'Groups' page from the profile page");
		ErrorCollector.verifyTrue(homePage.isUserProfileGroupsPage(),
				"Verified user is able to see 'Groups' page from the profile page");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " :<b>*****TC ID 42 Verify user is able to see 'Privacy policy' page from the profile page *****</b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Privacy Policy</b> Option");
		homePage.clickOnuserProfilePagePrivacyPolicyOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see 'Privacy policy' page from the profile page");
		ErrorCollector.verifyTrue(homePage.isUserProfilePrivacyPolicyPageDisplaying(),
				"Verified user is able to see 'Privacy policy' page from the profile page");		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

}
