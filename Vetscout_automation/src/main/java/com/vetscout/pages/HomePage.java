package com.vetscout.pages;

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

public class HomePage extends BaseClass {

	@FindBy(xpath = ("//a[@name='Profile']"))
	WebElement userProfileBtn;

	@FindBy(xpath = ("//h4[contains(text(),'Profile Infomation')]"))
	WebElement profilePageTitle;

	@FindBy(xpath = ("(//a[contains(@class,'icon-btn mr-10')]/span)[1]"))
	WebElement navigationMessageIcon;
	
	@FindBy(xpath = ("//u[contains(text(),'Announcements')]"))
	WebElement announcementsPageTitle;
	
	@FindBy(xpath = ("(//i[contains(text(),'shopping_cart')])[1]"))
	WebElement navigationCard;
	
	@FindBy(xpath = ("//a[@href='/cart']"))
	WebElement navigationCardCheckout;
	
	@FindBy(xpath = ("//h1[contains(text(),'Here’s what’s in your cart')]"))
	WebElement cardPageTitle;
	
	@FindBy(xpath = ("(//b[contains(text(),'Points')])[1]"))
	WebElement pointBuckBtn;	
	
	@FindBy(xpath = ("//h1[contains(text(),'Vet Scout Points')]"))
	WebElement pointPageTitle;
	
	@FindBy(xpath = ("//b[text()='Coming Soon']"))
	WebElement pointCommingSoon;
	
	@FindBy(xpath = ("(//a[@class='buck'])[1]"))
	WebElement navigationBuckBtn;
	
	@FindBy(xpath = ("//h1[contains(text(),'Transactions')]"))
	WebElement buckPageTitle;
	
	@FindBy(xpath = ("//p[contains(text(),'Purchases This Year')]//preceding::h1"))
	WebElement purchasesThisYearMoney;
	
	@FindBy(xpath = ("(//p[contains(text(),'Rebates and Savings')]//preceding::h1)[last()]"))
	WebElement rebatesAndSavingsMoney;
	
	@FindBy(xpath = ("(//p[contains(text(),'Missed Savings')]//preceding::h1)[last()]"))
	WebElement missedSavingsMoney;
	
	@FindBy(xpath = ("(//a[contains(text(),'Products')])[1]"))
	WebElement navigationProductsBtn;

	@FindBy(xpath = ("//div[2]//a[@href='/products/myfavorites']"))
	WebElement navigationProductsDropdownMyFavoritesOption;
	
	@FindBy(xpath = ("//div[2]//a[@href='/products/myproducts']"))
	WebElement navigationProductsDropdownMyProductsOption;
	
	@FindBy(xpath = ("//div[2]//a[@href='/products/categories']"))
	WebElement navigationProductsDropdownCategoriesOption;
	
	@FindBy(xpath = ("//h1[contains(text(),'All Products')]"))
	WebElement allProductsPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'Previous orders')]"))
	WebElement previousOrdersPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'Favorite products')]"))
	WebElement favoriteProductsPageTitle;
	
	@FindBy(xpath = ("(//a[contains(text(),'Home')])[1]"))
	WebElement navigationHomeBtn;	

	@FindBy(xpath = ("(//a[contains(text(),'Promotions')])[1]"))
	WebElement navigationPromotionsBtn;

	@FindBy(xpath = ("//h1[contains(text(),'General Promotions')]"))
	WebElement promotionsPageTitle;
	
	@FindBy(xpath = ("//div[2]//a[@href='/promotions/general']"))
	WebElement navigationPromotionDropdownGeneralOption;

	@FindBy(xpath = ("//h1[contains(text(),'Point Based Products')]"))
	WebElement pointsBasedProductsPageTitle;
	
	@FindBy(xpath = ("(//a[text()='Points'])[1]"))
	WebElement navigationPromotionDropdownExclusiveOption;

	@FindBy(xpath = ("(//a[contains(text(),'Rebates')])[1]"))
	WebElement navigationRebatesBtn;
	
	@FindBy(xpath = ("(//a[contains(text(),'Rewards')])[1]"))
	WebElement navigationRewardsBtn;
	
	@FindBy(xpath = ("//div[2]//a[@href='/rebates/savings?type=rebate']"))
	WebElement navigationRebatesBtnDropdownPSIVETRebatesOption;

	@FindBy(xpath = ("//div[contains(text(),'Rebates ')]"))
	WebElement PSIVETRebatesSection;

	@FindBy(xpath = ("//div[2]//a[@href='/rebates/savings?type=savings']"))
	WebElement navigationRebatesBtnDropdownPSIVETSavingsOption;

	@FindBy(xpath = ("//div[contains(text(),'Savings')]"))
	WebElement PSIVETSavingsSection;
	
	@FindBy(xpath = ("//div[2]//a[@href='/rebates/']"))
	WebElement navigationRebatesBtnDropdownEstimatorOption;

	@FindBy(xpath = ("//h1[contains(text(),'Rebate Estimators')]"))
	WebElement rebatesPageTitle;
	
	@FindBy(xpath = ("(//a[contains(text(),'Orders')])[2]"))
	WebElement navigationOrdersBtn;
	
	@FindBy(xpath = ("//h1[contains(text(),'History')]"))
	WebElement ordersPageTitle;
	
	@FindBy(xpath = ("(//a[contains(text(),'Analytics')])[1]"))
	WebElement navigationAnalyticsBtn;
	
	@FindBy(xpath = ("//div[2]//a[@href='/analytics/manufacturer']"))
	WebElement navigationAnalyticsDropdownManufacturerOption;
	
	@FindBy(xpath = ("//div[2]//a[@href='/analytics/product']"))
	WebElement navigationAnalyticsDropdownproductOption;
	
	@FindBy(xpath = ("//div[2]//a[@href='/analytics/merchant']"))
	WebElement navigationAnalyticsDropdownMerchangeOption;	
	
	@FindBy(xpath = ("(//li//a[@href='/orders'])[1]"))
	WebElement navigationOrderBtn;
	
	@FindBy(xpath = ("//div[2]//a[@href='/orders/history']"))
	WebElement navigationOrdersDropdownHistory;
	
	@FindBy(xpath = ("//div[2]//a[@href='/orders/backordered']"))
	WebElement navigationOrdersDropdownBackOrdered;
	
	@FindBy(xpath = ("//div[2]//a[@href='/orders/products']"))
	WebElement navigationOrdersDropdownByProduct;
	
	@FindBy(xpath = ("//div[2]//a[@href='/orders/manufacturers']"))
	WebElement navigationOrdersDropdownByManufacturer;
	
	@FindBy(xpath = ("//div[2]//a[@href='/orders/budgets']"))
	WebElement navigationOrdersDropdownBudget;

	@FindBy(xpath = ("//h1[contains(text(),'History')]"))
	WebElement ordersPageByHistoryPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'Backordered')]"))
	WebElement ordersPageByBackOrderedPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'By Product')]"))
	WebElement analyticsPageByProductPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'Favorite products')]"))
	WebElement productsPageTitle;
			
	@FindBy(xpath = ("//h1[contains(text(),'By Manufacturer')]"))
	WebElement ordersPageByManufacturerPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'Budget')]"))
	WebElement ordersPageByBudgetPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'By Merchant')]"))
	WebElement analyticsPageTitle;
	
	@FindBy(xpath = ("(//a[contains(text(),'Partners')])[1]"))
	WebElement navigationPartnersBtn;
	
	@FindBy(xpath = ("//h1[contains(text(),'Partners')]"))
	WebElement partnersPageTitle;
	
	@FindBy(xpath = ("//h1[contains(text(),'By Manufacturer')]"))
	WebElement analyticsPageByManufacturerPageTitle;
	
	@FindBy(xpath = ("//h2[contains(text(),'Featured products')]"))
	WebElement featuredProductsTitle;
	
	@FindBy(xpath = ("//div[@class='main-panel']//h4"))
	List<WebElement> featuredProductsDescriptions;
	
	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//a[text()='Show more'][1]"))
	WebElement showMoreLink;
	
	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//a[text()='Show less'][1]"))
	WebElement showLessLink;

	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//h4"))
	WebElement featuredProduct1Image;

	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//button[contains(@class,'slick-prev')]"))
	WebElement featuredProduct1LeftArrowButton;
	
	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//button[contains(@class,'slick-next')]"))
	WebElement featuredProduct1RightArrowButton;
	
	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//button[contains(@class,'active')]"))
	WebElement activeHeartShapedIcon;
	
	@FindBy(xpath = ("//button[contains(@class,'active')]//ancestor::*[@class='main-panel']//div//h4"))
	WebElement descriptionOfActiveHeartShapedIcon;
	
	@FindBy(xpath = ("(//div[@class='slick-slide slick-active slick-current']//div[@class='main-panel'])[1]//button//img"))
	WebElement heartShapedIcon;

	@FindBy(xpath = ("//div[@role='tooltip']"))
	WebElement featuredProductToolTip;
	
	
	
	@FindBy(xpath = ("//div[@class='main-panel']"))
	WebElement productMainPanel;
	
	@FindBy(xpath = ("(//a[@class='show-link'])[1]//parent::div/preceding-sibling::div"))
	List <WebElement> vendorsShowing;
	

	@FindBy(xpath = ("//a[@href='/points'][1]"))
	WebElement pointsButton;	

	@FindBy(xpath = ("//h1[contains(text(),'Vet Scout Points')]"))
	WebElement pointsPage;
	
	@FindBy(xpath = ("(//a[@href='/transaction'])[1]"))
	WebElement pointsBuckButton;	
	
	@FindBy(xpath = ("//h1[contains(text(),'Transactions')]"))
	WebElement transactionsPage;	
	
	@FindBy(xpath = ("(//div[contains(@class,'iron-app-logo')])[1]"))
	WebElement homePageLogoIcon;	
	
	@FindBy(xpath = ("//a[@name='Contact Us']"))
	WebElement userContactUs;

	@FindBy(xpath = ("(//div[contains(@class,'block-title')]//h2)[1]"))
	WebElement contactInfoHeading;

	@FindBy(xpath = ("//h1[text()[contains(.,' Rebates and Savings')]]"))
	WebElement rebatesAndSavingsPageHeading;
	
	@FindBy(xpath = ("//div[contains(@class,'h1') and contains(text(),'Rebates') ]"))
	WebElement rebatesAndSavingsPageRebatesHeading;
	
	
	@FindBy(xpath = ("//div[contains(@class,'h1') and contains(text(),'Missed Savings') ]"))
	WebElement rebatesAndSavingsPageMissedSavingsHeading;
	
	@FindBy(xpath = ("//input[@id='input-autosuggest']"))
	WebElement searchBar;
	

	@FindBy(xpath = ("(//h4//a)[1]"))
	WebElement searchResultsFirstText;

	@FindBy(xpath = ("//a[@href='/userProfile/profile']"))
	WebElement userProfilePageProfileOption;
	

	@FindBy(xpath = ("//a[@href='/userProfile/practice']"))
	WebElement userProfilePagePracticeOption;
	

	@FindBy(xpath = ("//a[@href='/userProfile/users']"))
	WebElement userProfilePageAdditionalUsersOption;
	

	@FindBy(xpath = ("//a[@href='/userProfile/address']"))
	WebElement userProfilePageAddressOption;
	

	@FindBy(xpath = ("//a[@href='/userProfile/notifications']"))
	WebElement userProfilePageNotificationsOption;
	

	@FindBy(xpath = ("//a[@href='/userProfile/availableSuppliers']"))
	WebElement userProfilePageVendorsOption;
	

	@FindBy(xpath = ("//a[@href='/userProfile/programs']"))
	WebElement userProfilePageRewardsProgramOption;
	
	
	@FindBy(xpath = ("//a[@href='/userProfile/group']"))
	WebElement userProfilePageGroupsOption;
	
	@FindBy(xpath = ("//a[@href='/faq']"))
	WebElement userProfilePageFAQOption;
	
	@FindBy(xpath = ("//a[@href='/userProfile/privacy-policy']"))
	WebElement userProfilePagePrivacyPolicyOption;

	
	@FindBy(xpath = ("//h4[contains(text(),'Practice Information')]"))
	WebElement userProfilePracticeInformationTitle;
	
	@FindBy(xpath = ("//h4[contains(text(),'Additional Users')]"))
	WebElement userProfileAdditionalUsersTitle;
	
	@FindBy(xpath = ("//h5[contains(text(),'Billing Address')]"))
	WebElement userProfileBillingAdressTitle;
	
	@FindBy(xpath = ("//span[contains(text(),'Order confirmation email')]"))
	WebElement userProfileNotificationOrderConfimation;
	
	@FindBy(xpath = ("//img[@title='Drag to order vendors']"))
	WebElement userProfileVendors;

	@FindBy(xpath = ("//b[contains(text(),'Partners Program')]"))
	WebElement userProfileRewardsProgramPage;

	@FindBy(xpath = ("//h6[contains(text(),'Share My Purchasing and Rebate Data')]"))
	WebElement userProfileGroupsPage;

	@FindBy(xpath = ("//h1[contains(text(),'Privacy Policy')]"))
	WebElement userProfilePrivacyPolicyPage;
	
	@FindBy(xpath = ("//h2[contains(text(),'Frequently Asked Question')]"))
	WebElement userProfileFAQPage;
	
	@FindBy(xpath = "(//div[contains(@class,'userLogout')]//img)[1]")
	WebElement profileIcon;
	
	@FindBy(xpath = "//a[@name='Logout']")
	WebElement btnLogout;
	
	@FindBy(xpath = "//h4[text()='User Sign In']")
	WebElement userSignInHeading;
	
	@FindBy(xpath = "//u[contains(text(),'Announcements')]/../..//following::div")
	WebElement announcementSection;
	
	@FindBy(xpath = "//a[@name='Contact Us']")
	WebElement btnContactUs;
	
	@FindBy(xpath = "//h1[contains(text(),'Contact Us')]")
	WebElement contactUsHeading;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void hoverAnalyticsAndClickByMerchant() {
		waitForElementClickable(navigationAnalyticsBtn, "20");
		hoverAndClick(navigationAnalyticsBtn,navigationAnalyticsDropdownMerchangeOption);
	}
	
	public void hoverAnalyticsAndClickByManufacturer() {
		waitForElementClickable(navigationAnalyticsBtn, "20");
		hoverAndClick(navigationAnalyticsBtn,navigationAnalyticsDropdownManufacturerOption);
	}
	
	public void hoverAnalyticsAndClickByProduct() {
		waitForElementClickable(navigationAnalyticsBtn, "20");
		hoverAndClick(navigationAnalyticsBtn,navigationAnalyticsDropdownproductOption);
	}

	public void hoverOrdersAndClickByHistory() {
		hoverAndClick(navigationOrderBtn,navigationOrdersDropdownHistory);
	}
	
	public void hoverOrdersAndClickBackOrdered() {
		waitForElementClickable(navigationOrderBtn, "20");
		hoverAndClick(navigationOrderBtn,navigationOrdersDropdownBackOrdered);
	}
	
	public void hoverOrdersAndClickByProduct() {
		waitForElementClickable(navigationOrderBtn, "20");
		hoverAndClick(navigationOrderBtn,navigationOrdersDropdownByProduct);
	}
	
	public void hoverOrdersAndClickByManufacturer() {
		waitForElementClickable(navigationOrderBtn, "20");
		hoverAndClick(navigationOrderBtn,navigationOrdersDropdownByManufacturer);
	}
	
	public void hoverOrdersAndClickByBudget() {
		waitForElementClickable(navigationOrderBtn, "20");
		hoverAndClick(navigationOrderBtn,navigationOrdersDropdownBudget);
	}
	

	public void clickOnUserProfileButton() {
		waitForElementClickable(userProfileBtn, "20");
		click(userProfileBtn);
	}
	
	public void clickOnNavigationMessageIcon() {
		waitForElementClickable(navigationMessageIcon, "20");
		click(navigationMessageIcon);
	}	
	
	public void clickOnNavigationCard() {
		waitForElementClickable(navigationCard, "20");
		click(navigationCard);
	}
	
	public void clickOnNavigationCardCheckout() {
		waitForElementClickable(navigationCardCheckout, "20");
		click(navigationCardCheckout);
	}	
	public void clickOnPointBuckButton() {
		waitForElementClickable(pointBuckBtn, "20");
		click(pointBuckBtn);
	}	

	public void clickOnPointsButton() {
		waitForElementClickable(pointsButton, "20");
		click(pointsButton);
	}	
	
	
	public boolean isProfilePageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(profilePageTitle);
	}
	
	public boolean isAnnouncementsPageTitleDisplaying() {
		Waits.wait2s();

		return isElementDisplayed(announcementsPageTitle);
	}
	
	public boolean isCardPageTitleDisplaying() {
		Waits.wait2s();

		return isElementDisplayed(cardPageTitle);
	}
	
	public boolean isPointPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(pointPageTitle);
	}
	
	public boolean isPointCommingSoonDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(pointCommingSoon);
	}
	
	public void clickOnNavigationBuckButton() {
		waitForElementClickable(navigationBuckBtn, "20");
		click(navigationBuckBtn);
	}	
	
	public boolean isBuckPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(buckPageTitle);
	}
	
	public boolean isPurchasesThisYearMoneyDisplaying() {
		return isElementDisplayed(purchasesThisYearMoney);
	}
	
	public boolean isRebatesAndSavingsMoneyDisplaying() {
		return isElementDisplayed(rebatesAndSavingsMoney);
	}
	
	public boolean isMissedSavingsMoneyDisplaying() {
		return isElementDisplayed(missedSavingsMoney);
	}
	
	public void clickOnNavigationProductsButton() {
		waitForElementClickable(navigationProductsBtn, "20");
		click(navigationProductsBtn);
	}	
	
	public boolean isProductsPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(productsPageTitle);
	}
	
	public void clickOnNavigationHomeButton() {
		waitForElementClickable(navigationHomeBtn, "20");
		click(navigationHomeBtn);
	}	
	
	public void clickOnNavigationRebatesButton() {
		waitForElementClickable(navigationRewardsBtn, "20");
		click(navigationRewardsBtn);
	}	
	
	
	public void clickOnNavigationOrdersButton() {
		waitForElementClickable(navigationOrdersBtn, "20");
		click(navigationOrdersBtn);
	}	
	
	public boolean isOrdersPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(ordersPageTitle);
	}
	
	public void clickOnNavigationPromotionsButton() {
		waitForElementClickable(navigationPromotionsBtn, "20");
		click(navigationPromotionsBtn);
	}	
	
	public boolean isPromotionsPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(promotionsPageTitle);
	}
	
	public void clickOnPromotionsPageTitle() {
		click(promotionsPageTitle);
	}	
	public void clickOnNavigationAnalyticsBtnButton() {
		waitForElementClickable(navigationAnalyticsBtn, "20");
		click(navigationAnalyticsBtn);
	}	
	
	public boolean isAnalyticsPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(analyticsPageTitle);
	}
	
	public void clickOnNavigationPartnersButton() {
		waitForElementClickable(navigationPartnersBtn, "20");
		click(navigationPartnersBtn);
	}	
	
	public boolean isPartnersPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(partnersPageTitle);
	}
	
	public boolean isAnalyticsPageByManufacturerPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(analyticsPageByManufacturerPageTitle);
	}
	
	public boolean isAnalyticsPageByProductPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(analyticsPageByProductPageTitle);
	}
	
	public boolean isOrdersPageByHistoryPageTitleDisplaying() {
		Waits.wait5s();
		return isElementDisplayed(ordersPageByHistoryPageTitle);
	}

	
	public boolean isOrdersPageByBackOrderedPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(ordersPageByBackOrderedPageTitle);
	}
	

	public boolean isByProductPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(analyticsPageByProductPageTitle);
	}
	
	public boolean isOrdersPageByManufacturerPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(ordersPageByManufacturerPageTitle);
	}
	

	public boolean isOrdersPageByBudgetPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(ordersPageByBudgetPageTitle);
	}
	
	public void hoverProductsAndClickMyFavorites() {
		waitForElementClickable(navigationProductsBtn, "20");
		hoverAndClick(navigationProductsBtn,navigationProductsDropdownMyFavoritesOption);
	}


	public void hoverProductsAndClickMyProducts() {
		waitForElementClickable(navigationProductsBtn, "20");
		hoverAndClick(navigationProductsBtn,navigationProductsDropdownMyProductsOption);
		Waits.wait6s();

	}

	public void hoverProductsAndClickAllCategories() {
		waitForElementClickable(navigationProductsBtn, "20");
		hoverAndClick(navigationProductsBtn,navigationProductsDropdownCategoriesOption);
		Waits.wait6s();
	}

	public boolean isAllProductsPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(allProductsPageTitle);
	}

	public boolean isPreviousOrdersPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(previousOrdersPageTitle);
	}

	public boolean isFavoriteProductsPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(favoriteProductsPageTitle);
	}
	
	public void hoverPromotionAndClickAllGeneralOption() {
		Waits.wait1s();
		waitForElementClickable(navigationPromotionsBtn, "20");
		hoverAndClick(navigationPromotionsBtn,navigationPromotionDropdownGeneralOption);
		Waits.wait6s();
	}

	public boolean isPointsBasedProductsPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(pointsBasedProductsPageTitle);
	}
	

	
	public void hoverPromotionAndClickAllExclusiveOption() {
		waitForElementClickable(navigationPromotionsBtn, "20");
		hoverAndClick(navigationPromotionsBtn,navigationPromotionDropdownExclusiveOption);
	}
	
	public boolean isPSIVETRebatesSectionPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(PSIVETRebatesSection);
	}
	
	public void hoverRebateAndClickAllPSIVETRebatesOption() {
		waitForElementClickable(navigationRewardsBtn, "20");
		hoverAndClick(navigationRewardsBtn,navigationRebatesBtnDropdownPSIVETRebatesOption);
	}

	public boolean isPSIVETSavingsSectionPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(PSIVETSavingsSection);
	}
	public void hoverRebatesAndClickPSIVETSavingsOption() {
		waitForElementClickable(navigationRewardsBtn, "20");
		hoverAndClick(navigationRewardsBtn,navigationRebatesBtnDropdownPSIVETSavingsOption);
	}
			
	public boolean isRebatesPageTitleDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(rebatesPageTitle);
	}
	public void hoverRebatesAndClickAllEstimatorOption() {
		waitForElementClickable(navigationRewardsBtn, "20");
		hoverAndClick(navigationRewardsBtn,navigationRebatesBtnDropdownEstimatorOption);
	}
	public void hoverRewardsAndClickRewardProgram() {
		waitForElementClickable(navigationRewardsBtn, "20");
		hoverAndClick(navigationRewardsBtn,userProfilePageRewardsProgramOption);
	}
	public boolean scrollDownToFeaturedProducts() {
		scrollIntoView(featuredProductsTitle);
		return isElementDisplayed(featuredProductsTitle);
	}	
	public boolean isFeaturedProductsDescriptionsDisplaying() {
		return featuredProductsDescriptions.size() >0 ;
	}

	public void clickOnheartShapedIcon() {
		scrollIntoViewSmoothly(heartShapedIcon);
		click(heartShapedIcon);
	}	

	public void clickOnactiveHeartShapedIcon() {
		waitForElementClickable(activeHeartShapedIcon, "20");
		click(activeHeartShapedIcon);
	}	
	public boolean isActiveHeartShapedIconDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(activeHeartShapedIcon);
	}
	public String getDescriptionOfActiveHeartShapedIcon() {
		return getElementTextWithoutTrim(descriptionOfActiveHeartShapedIcon);
	}

	public int getNumberOfVendorsShowing() {
		Waits.wait1s();
		return vendorsShowing.size();
	}

	public void clickOnShowMore() {
		scrollIntoViewSmoothly(showMoreLink);
		click(showMoreLink);
	}	
	
	public void clickOnShowLess() {
		scrollIntoViewSmoothly(showLessLink);
		click(showLessLink);
	}
	
	public String getImageSource() {
		WebElement img = driver.findElement(By.xpath("//div[@data-index='3']//div[5]/div/a/img"));
		return img.getAttribute("src");
	}

	public void clickOnFeaturedProduct1LeftArrowButton() {
		Waits.wait1s();
		hoverAndClick(featuredProduct1LeftArrowButton,featuredProduct1LeftArrowButton);
	}	
	
	public void clickOnFeaturedProduct1RightArrowButton() {
		Waits.wait1s();
		
		hoverAndClick(featuredProduct1RightArrowButton,featuredProduct1RightArrowButton);
	}
	
	public void hoverOverFeatureProductImage() {
		Waits.wait1s();
		try {
			hoverOverElement(featuredProduct1Image);

		} catch (Exception e) {
		}
	}
	
	public boolean isFeaturedProductToolTipDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(featuredProductToolTip);
	}
	
	public boolean isPointsPageDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(pointsPage);
	}
	
	public void clickOnPointsBuckButton() {
		waitForElementClickable(pointsBuckButton, "20");
		click(pointsBuckButton);
	}

	public boolean isTransactionsPageDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(transactionsPage);
	}
	public void clickOnHomePageLogoIcon() {
		waitForElementClickable(homePageLogoIcon, "20");
		click(homePageLogoIcon);
	}
	
	public void hoverOverNavigationCard() {
		hoverOverElement(navigationCard);
	}

	public boolean isNavigationCardCheckoutDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(navigationCardCheckout);
	}
	
	public void clickOnUserContactUs() {
		waitForElementClickable(userContactUs, "20");
		click(userContactUs);
	}
	
	public boolean isContactInfoHeadingDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(contactInfoHeading);
	}

	public void clickOnPurchasesThisYearMoneyButton() {
		waitForElementClickable(purchasesThisYearMoney, "20");
		click(purchasesThisYearMoney);
	}
	
	public void clickOnRebatesAndSavingsMoney() {
		waitForElementClickable(rebatesAndSavingsMoney, "20");
		click(rebatesAndSavingsMoney);
	}
	
	public boolean isRebatesAndSavingsPageHeadingDisplaying() {
		Waits.wait1s();
//		scrollUp();
		scrollToElement(rebatesAndSavingsPageHeading);
		return isElementDisplayed(rebatesAndSavingsPageHeading);
	}
	
	public boolean isrebatesAndSavingsPageRebatesHeadingDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(rebatesAndSavingsPageRebatesHeading);
	}
	
	public void clickOnmissedSavingsMoney() {
		waitForElementClickable(missedSavingsMoney, "20");
		click(missedSavingsMoney);
	}

	public boolean isRebatesAndSavingsPageMissedSavingsHeadingDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(rebatesAndSavingsPageMissedSavingsHeading);
	}

	public void enterIntoSearchBar(String product) {
		type(searchBar, product);
		searchBar.sendKeys(Keys.ENTER);
		
	}
	public String getTextOfSearchedResults() {
		return getElementText(searchResultsFirstText);
	}

	public void clickOnuserProfilePageProfileOption() {
		waitForElementClickable(userProfilePageProfileOption, "20");
		click(userProfilePageProfileOption);
	}

	public void clickOnuserProfilePagePracticeOption() {
		waitForElementClickable(userProfilePagePracticeOption, "20");
		click(userProfilePagePracticeOption);
	}


	public void clickOnuserProfilePageAdditionalUsersOption() {
		waitForElementClickable(userProfilePageAdditionalUsersOption, "20");
		click(userProfilePageAdditionalUsersOption);
	}


	public void clickOnuserProfilePageAddressOption() {
		waitForElementClickable(userProfilePageAddressOption, "20");
		click(userProfilePageAddressOption);
	}


	public void clickOnuserProfilePageNotificationsOption() {
		waitForElementClickable(userProfilePageNotificationsOption, "20");
		click(userProfilePageNotificationsOption);
	}


	public void clickOnuserProfilePageVendorsOption() {
		waitForElementClickable(userProfilePageVendorsOption, "20");
		click(userProfilePageVendorsOption);
	}


	public void clickOnuserProfilePageRewardsProgramOption() {
		waitForElementClickable(userProfilePageRewardsProgramOption, "20");
		click(userProfilePageRewardsProgramOption);
	}
	

	public void clickOnuserProfilePageGroupsOption() {
		waitForElementClickable(userProfilePageGroupsOption, "20");
		click(userProfilePageGroupsOption);
	}
	
	public void clickOnuserProfilePageFAQOption() {
		waitForElementClickable(userProfilePageFAQOption, "20");
		click(userProfilePageFAQOption);
	}


	public void clickOnuserProfilePagePrivacyPolicyOption() {
		waitForElementClickable(userProfilePagePrivacyPolicyOption, "20");
		click(userProfilePagePrivacyPolicyOption);
	}


	public boolean isUserProfilePracticeInformationTitleDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfilePracticeInformationTitle);
	}


	public boolean isUserProfileAdditionalUsersTitleDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfileAdditionalUsersTitle);
	}


	public boolean isUserProfileBillingAdressTitleDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfileBillingAdressTitle);
	}

	public boolean isUserProfileNotificationOrderConfimationDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfileNotificationOrderConfimation);
	}


	public boolean isUserProfileVendorsDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfileVendors);
	}

	public boolean isUserProfileRewardsProgramPageDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfileRewardsProgramPage);
	}


	public boolean isUserProfileGroupsPage() {
		Waits.wait1s();
		return isElementDisplayed(userProfileGroupsPage);
	}


	public boolean isUserProfilePrivacyPolicyPageDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfilePrivacyPolicyPage);
	}
	
	public boolean isUserFAQPageDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(userProfileFAQPage);
	}

	public void clickOnProfileIcon() {
		waitForElementClickable(profileIcon, "20");
		click(profileIcon);
	}

	public void clickOnLogoutBtn() {
		waitForElementClickable(btnLogout, "20");
		click(btnLogout);
	}

	public boolean isUserSignInHeadingDisplaying() {
		try {
			waitForElementVisibility(userProfilePageGroupsOption, "20");			
		}catch (Exception|Error e) {
		
		}
		return isElementDisplayed(userSignInHeading);
	}

	public boolean isAnnouncementSectionDisplaying() {
		try {
			waitForElementVisibility(announcementSection, "20");			
		}catch (Exception|Error e) {
			
		}
		return isElementDisplayed(announcementSection);
	}
	public boolean isContactUsHeadingDisplaying() {
		Waits.wait1s();
		return isElementDisplayed(contactUsHeading);
	}
	

	
}
