package com.vetscout.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.utilities.Waits;

public class ProductsPage extends BaseClass {

	@FindBy(xpath = ("//h1[text()='Monitor Accessories ']"))
	WebElement productPageHeadingAdministrationAndTransfusion;

	@FindBy(xpath = ("//input[@id='standard-text']"))
	WebElement searchBarProduct;

	@FindBy(xpath = ("//input[contains(@placeholder,'Search by Manufacturer')]"))
	WebElement searchBarManufacturer;

	@FindBy(xpath = ("//a[text()='Monitor Accessories & Parts']"))
	WebElement firstProductHeadingAdministrationAndTransfusion;

	@FindBy(xpath = ("//li[contains(text(),'Royal Canin')]"))
	WebElement optionRoyalcanin;
	
	@FindBy(xpath = ("(//div[@class='main-panel']//div[1]//a[contains(text(),'Anti-infective Agents')])[1]"))
	WebElement firstAntiInfectiveAgent;

	@FindBy(xpath = ("//b[contains(text(),'Last Ordered')]"))
	WebElement lastOrdered;

	@FindBy(xpath = ("//div[@class='main-panel']//div[1]//a"))
	WebElement allProductInAdministrationAndTransfusion;

	@FindBy(xpath = ("//div[@class='main-panel']//div//b"))
	WebElement allProductCountInAdministrationAndTransfusion;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[1]"))
	WebElement manufacturerFilter;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[2]"))
	WebElement manufacturerFilterABCCompounding;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[3]"))
	WebElement manufacturerFilterAddisonBiological;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[4]"))
	WebElement manufacturerFilterAllflex;

	@FindBy(xpath = ("(//div[contains(text(),'Manufacturer')]//following::div//input)[5]"))
	WebElement manufacturerFilterAmericanProtienCorp;

	@FindBy(xpath = ("//div[contains(text(),'Price')]"))
	WebElement productsPriceHeading;

	@FindBy(xpath = ("(//div[@class='vendorDiv'])[2]//input"))
	WebElement vendorFilter;

	@FindBy(xpath = ("//div[contains(text(),'Vendors')]"))
	WebElement vendorHeading;

	@FindBy(xpath = ("(//div[@data-index='0']//a/img)[1]"))
	WebElement productImage1;

	@FindBy(xpath = ("//h4[contains(text(),'Rate and Review')]"))
	WebElement detailPageReview;

	@FindBy(xpath = ("//div[@class='radioDiv']//input[@value='1']"))
	WebElement productPagePrice10;

	@FindBy(xpath = ("//p[contains(text(),'Sort By')]//following-sibling::div"))
	WebElement sortbyDropDown;

	@FindBy(xpath = ("//div[contains(text(),'Product Name (Z-A)')]"))
	WebElement sortbyDropDownProductNameZ_A;

	@FindBy(xpath = ("//p[contains(text(),'View')]//following-sibling::div"))
	WebElement viewDropDown;

	@FindBy(xpath = ("//input[@placeholder='Quantity']"))
	WebElement quantityTextDescriptionCartPage;
	@FindBy(xpath = ("//div[contains(@id,'option-3')]"))
	WebElement viewDropDownWide;

	@FindBy(xpath = ("//div[contains(@id,'option-0')]"))
	WebElement viewDropDownDefault;

	@FindBy(xpath = ("//button/span[contains(text(),'EXPORT')]"))
	WebElement exportButton;

	@FindBy(xpath = ("(//div[contains(text(),'Lowest Price')])[1]"))
	WebElement sortbyDropDownProductNameLowestPrice;

	@FindBy(xpath = ("(//button[@class='count'])[1]"))
	WebElement quantityDecreaseAddtoCartPopUp;

	@FindBy(xpath = ("(//button[@class='count'])[2]"))
	WebElement quantityincreaseAddtoCartPopUp;

	@FindBy(xpath = ("//input[contains(@id,'quantity')]"))
	WebElement quantityText;

	@FindBy(xpath = ("(//span[contains(text(),'Add to cart')]//parent::button)[1]"))
	WebElement addToCartButton;

	@FindBy(xpath = ("(//button//span[contains(text(),'Add to cart')]//ancestor::div[@class='main-panel']//div//h4//a)[1]"))
	WebElement firstAddToCartButtonDescription;

	@FindBy(xpath = ("//button//span[contains(text(),'Add to Cart')]"))
	WebElement addToCartButtonPopUp;

	@FindBy(xpath = ("(//div[@class='p-dialog-content']//div[2]//button//i)"))
	WebElement secondVendor;

	@FindBy(xpath = ("//div[@class='card']//span[contains(text(),'$')]"))
	WebElement priceInfrontVendor;

	@FindBy(xpath = ("(//h4[contains(text(),'$')])[1]"))
	WebElement priceInfrontVendorCart;
	
	@FindBy(xpath = ("(//span[text()='Add to Cart']//parent::div//following-sibling::div//span[contains(text(),'$')])[1]"))
	WebElement productPricePopUp;

	@FindBy(xpath = ("//i[contains(@class,'checkbox')]"))
	WebElement vendorCheckbox;

	@FindBy(xpath = ("//h4[@class='text-center']//parent::*//span[contains(@title,'availability') or contains(@title,'billed') or contains(@title,'scheduled')]"))
	WebElement vendorAvailablityIcon;
	
	@FindBy(xpath = ("(//span[text()='Add to Cart']//parent::div//following-sibling::div//img[@alt='promotion'])[1]"))
	WebElement promotionIcon;

	@FindBy(xpath = ("*//span[contains(@title,'availability') or contains(@title,'billed') or contains(@title,'scheduled')]"))
	WebElement cartPageVendorAvailablityIcon;

	@FindBy(xpath = ("*//span[contains(@title,'availability') or contains(@title,'billed') or contains(@title,'scheduled')]"))
	WebElement cartVendorAvailablityIcon;

	@FindBy(xpath = ("//button//span[contains(text(),'Update Cart')]"))
	WebElement updateCartButton;

	@FindBy(xpath = ("//button[contains(text(),'Ok')]"))
	WebElement okButton;

	@FindBy(xpath = ("(//button[@aria-label='Close'])[1]"))
	WebElement closeButton;

	@FindBy(xpath = ("//i[contains(@class,'disabled-checkbox')]"))
	WebElement disabledCheckBox;

	@FindBy(xpath = ("//span[contains(@title,'Earn points with the purchase of this product')]"))
	WebElement addedToCartMessageEarnpoint;

	@FindBy(xpath = ("//div[contains(text(),'Earn points with the purchase of this product')]"))
	WebElement earnPointToolTip;

	@FindBy(xpath = ("//div[contains(text(),'Redeem points with the purchase of this product.')]"))
	WebElement redeemPointToolTip;
	
	
	@FindBy(xpath = ("//div[@role='tooltip']"))
	WebElement promotionToolTip;

	@FindBy(xpath = ("//h5//a"))
	List<WebElement> numbercartPageItems;

	@FindBy(xpath = ("//h5//a"))
	WebElement cartPageItems;

	@FindBy(xpath = ("//div[@class='cartComp']//img[@alt='product-image']"))
	List<WebElement> cartPageItemsImage;

	@FindBy(xpath = ("//div[contains(@id,'tooltip')]"))
	WebElement addtocarttoolTip;

	@FindBy(xpath = ("//span[contains(text(),'View cart')]/parent::button"))
	WebElement viewCartButton;

	@FindBy(xpath = ("//*[contains(text(),'added to your cart')]"))
	WebElement addedToCartMessage;

	@FindBy(xpath = ("//div[contains(@class,'prod_desc prod_qty')]"))
	WebElement addedToCartPopUpQty;

	@FindBy(xpath = ("//div[@class='product_image_div']//img"))
	WebElement addedToCartPopUpproductImageDiv;

	@FindBy(xpath = ("//div[@class='prod_desc']"))
	WebElement addedToCartPopUpProductDescription;

	@FindBy(xpath = ("//div[@class='confirm_cart_item']"))
	WebElement addedToCartPopUpItemsCount;

	@FindBy(xpath = ("(//button//span[contains(text(),'View In Cart')])[1]"))
	WebElement viewInCart;

	@FindBy(xpath = ("//div//h1[contains(text(),'Here’s what’s in your cart')]"))
	WebElement cartPageHeading;

	@FindBy(xpath = ("(//h4//a)[1]"))
	WebElement firstProductInMyFavorite;

	@FindBy(xpath = ("(//div[@class='icon-edit']//span/span//*)[1]"))
	WebElement favouritePageHeartIconDropDownMyFavouriteCheckbox;
	
	@FindBy(xpath = ("//button[contains(@class,'active')]//img"))
	WebElement favouriteHeartFillIcon;
	
	@FindBy(xpath = ("//span[contains(text(),'Continue Shopping')]"))
	WebElement continueShoppingButton;

	@FindBy(xpath = ("(//button[@title='My Favorites'])[1]"))
	WebElement searchResultsFirstItemHeartIcon;

	@FindBy(xpath = ("(//button[@title='My Favorites'])[2]"))
	WebElement searchResultsSecondItemHeartIcon;

	@FindBy(xpath = ("//h4[contains(text(),'No products found')]"))
	WebElement noProductsFoundMessage;

	@FindBy(xpath = ("//span[@title='Redeem points with the purchase of this product.']"))
	WebElement addToCartRedeemPoint;

	@FindBy(xpath = ("//i[contains(@class,'disabled-checkbox')]"))
	List<WebElement> disabledCheckBox1;

	@FindBy(xpath = ("//button//span[contains(text(),'Add to cart')]"))
	List<WebElement> NumberOfAddToCart;

	@FindBy(xpath = ("//li[@class='ais-Hits-compactitem']"))
	List<WebElement> ProductsItems;

	@FindBy(xpath = ("//div[contains(text(),'ABC Compounding')]"))
	List<WebElement> ProductsWithCompounding;

	@FindBy(xpath = ("//b[contains(text(),'Last Ordered')]"))
	List<WebElement> ProductsWithLastOrdered;

	@FindBy(xpath = ("//div[@class='main-panel']//div[1]//a"))
	List<WebElement> ProductInAdministrationAndTransfusion;

	@FindBy(xpath = ("//div[@class='main-panel']//div//b"))
	List<WebElement> ProductCountInAdministrationAndTransfusion;

	@FindBy(xpath = ("//li[@class='ais-Hits-compactitem']"))
	List<WebElement> ProductsSize;

	@FindBy(xpath = ("(//li[@class='ais-Hits-compactitem'])//button[contains(@class,'active')]"))
	List<WebElement> ProductWithHeartIcons;

	@FindBy(xpath = ("(//button[contains(@class,'cart-btn')])[1]"))
	WebElement deleteIcon;

	@FindBy(xpath = ("(//button[@id='yes'])[2]"))
	WebElement yesRemoveButtonCartPage;

	@FindBy(xpath = ("//div[@id='panel1c-header']//img[@alt='product-image']"))
	WebElement vendorImage;

	@FindBy(xpath = ("//h4[contains(text(),'$')]"))
	WebElement totalPrice;

	@FindBy(xpath = ("//div[contains(@class,'cart-shop-list')]//img[@alt='product-image']"))
	WebElement productImage;

	@FindBy(xpath = ("//h5//a"))
	WebElement description;

	@FindBy(xpath = ("//div[contains(@class,'cart-shop-list')]//span[contains(text(),'$')]"))
	WebElement price;

	@FindBy(xpath = ("//div[contains(@class,'container') and contains(@class, 'py-15')]"))
	WebElement vendorSection;

	@FindBy(xpath = ("//button[contains(@class,'place_order')]"))
	WebElement placeOrderButton;

	@FindBy(xpath = ("//div[@id='panel1c-header']"))
	WebElement vendorsHeaderCarPage;

	@FindBy(xpath = ("//button[contains(@class,'place_order')]"))
	List<WebElement> placeOrderButtonList;

	@FindBy(xpath = ("//div[@id='panel1c-header']"))
	List<WebElement> vendorsHeaderCarPageList;

	@FindBy(xpath = ("//button//span[contains(text(),'Submit')]"))
	WebElement vendorsOrderSubmitButton;

	@FindBy(xpath = ("//h4[contains(text(),'Cart is empty')]"))
	WebElement cartIsEmptyMsg;

	@FindBy(xpath = ("//h4[contains(@class,'pt-20')]"))
	WebElement orderPlacedSuccessMsg;
	@FindBy(xpath = ("//i[contains(@class,'zmdi-delete')]"))
	List<WebElement> deleteIconList;

	@FindBy(xpath = ("//div//b[contains(text(),'cannot be')]"))
	WebElement cannotBeOrderedMsg;
	
	@FindBy(xpath = ("//h4//a"))
	List <WebElement> results;
	
	@FindBy(xpath = ("//*[text()='Frequently Purchased']"))
	WebElement frequentlyPurchasedOption;
	
	@FindBy(xpath = ("(//span[contains(text(),'Do not show in the future')])[1]"))
	WebElement QuickCartSummaryDisableCheckbox;
	
	@FindBy(xpath = ("//div[@class='prod_desc']"))
	WebElement productDescription;
	
	@FindBy(xpath = ("(//img[contains(@alt,'Covetrus')])[1]"))
	WebElement productVendorImg;
	
	
	
	
	
	

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void waitUnitlPageLoad() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
	}
	
	public boolean isNoProductsFoundMessageDisplaying() {
		return isElementDisplayed(noProductsFoundMessage);
	}
	
	public boolean isHeartFillIconDisplaying() {
		try {
			return isElementDisplayed(favouriteHeartFillIcon);

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isProductVendorImageDisplaying() {
		try {
			waitForElementVisibility(productVendorImg, 10);
			return isElementDisplayed(productVendorImg);

		} catch (Exception e) {
			return false;
		}
	}

	public void clickSearchResultsFirstItemHeartIcon1() {
		Waits.wait1s();
		waitForElementClickable(searchResultsFirstItemHeartIcon, "20");
		hoverAndClick(searchResultsSecondItemHeartIcon, searchResultsFirstItemHeartIcon);
	}

	public void clickOnContinueShoppingButton() {
		try {
			Waits.wait2s();
			waitForElementClickable(continueShoppingButton, "20");
			click(continueShoppingButton);
		} catch (Exception e) {
			
		}
		
	}

	public void clickOnFavouritePageHeartIconDropDownMyFavouriteChecbox() {
		Waits.wait2s();
		hoverAndClick(favouritePageHeartIconDropDownMyFavouriteCheckbox,
				favouritePageHeartIconDropDownMyFavouriteCheckbox);
	}

	public void clickOnExportButton() {
		waitForElementClickable(exportButton, "20");
		click(exportButton);
	}

	public void clickOnaddToCartButton() {
		try {
			click(addToCartButton);

		} catch (Exception e) {
			clickUsingJavascriptExecutor(addToCartButton);
		}
	}

	public String getDescriptionOfFirstProductInMyFavorite() {
		return getElementTextWithoutTrim(firstProductInMyFavorite);
	}

	public String getDescriptionOfFirstAddToCartButtonDescription() {
		return getElementTextWithoutTrim(firstAddToCartButtonDescription);
	}

	public String getDescriptionOffirstAddToCartButtonDescription(Integer i) {
		Waits.wait2s();
		String element = "(//button//span[contains(text(),'Add to cart')]//ancestor::div[@class='main-panel']//div//h4//a)["
				+ i.toString()
				+ "] | (//button//span[contains(text(),'Add to cart')]//ancestor::div[@class='main-panel'])["
				+ i.toString() + "]";
		return driver.findElement(By.xpath(element)).getText();
	}
	
	public String getDescriptionOffirstAddToCartProduct() {
		Waits.wait2s();
		
		return productDescription.getText();
	}

	public void clickOnFirstItemWithAddToCartButton(String text) {
		Waits.wait2s();
		String element = "//div//h4//a[contains(text(),'" + text.substring(0, 15)
				+ "')]//parent::*//parent::*//parent::*//button//span[contains(text(),'Add to cart')]";
		driver.findElement(By.xpath(element)).click();
	}

	public void clickOnFirstItemWithAddToCartButton(Integer i) {
		Waits.wait2s();
		String element = "(//div//h4//a//parent::*//parent::*//parent::*//button//span[contains(text(),'Add to cart')])["
				+ i.toString() + "]";
		
		try {
			driver.findElement(By.xpath(element)).click();

		} catch (Exception e) {
			clickUsingJavascriptExecutor(driver.findElement(By.xpath(element)));
		}
	}

	public boolean isFirstItemWithViewItemButtonDisplaying(String text) {
		Waits.wait2s();
		String element = "//div//h4//a[contains(text(),'" + text.substring(0, 15)
				+ "')]//parent::*//parent::*//parent::*//button//span[contains(text(),'View')]";
		return driver.findElement(By.xpath(element)).isDisplayed();
	}
	public int getNumberOfResults(WebDriver driver) {
		return results.size();
	}

	public boolean isPriceTagInFrontOfEachProduct(WebDriver driver) throws InterruptedException {
		for (int i = 2; i <= getNumberOfResults(driver) + 1; i++) {
			boolean check = driver
					.findElement(By.xpath("(//img[@alt='product-image'])[" + i
							+ "]//parent::div//following::div[3]//following-sibling::div[@class='price-vendor']"))
					.isDisplayed();
			if (!check) {
				return false;
			}
		}
		return true;
	}

	public void clickOnFirstItemWithViewItemButton(String text) {
		Waits.wait2s();
		String element = "//div//h4//a[contains(text(),'" + text.substring(0, 15)
				+ "')]//parent::*//parent::*//parent::*//button//span[contains(text(),'View')]";
		driver.findElement(By.xpath(element)).click();
	}

	public void clickOnViewInCartButton() {
		waitForElementClickable(viewInCart, "20");
		click(viewInCart);
	}
	
	public void clickOnQuickCartSummaryDisable() {
		waitForElementClickable(QuickCartSummaryDisableCheckbox, "20");
		click(QuickCartSummaryDisableCheckbox);
	}
	



	public void clickOnCloseButton() {
		waitForElementClickable(closeButton, "20");
		click(closeButton);
	}

	public void onlyClickOnCloseButton() {
		click(closeButton);
	}

	public void clickOnDisabledCheckBox() {
		waitForElementClickable(disabledCheckBox, "20");
		click(disabledCheckBox);
	}

	public int getNumberDisabledCheckBox() {
		Waits.wait1s();
		return disabledCheckBox1.size();
	}

	public void hoverOnAddedToCartMessageEarnpoint() {
		Waits.wait2s();
		hoverOverElement(addedToCartMessageEarnpoint);
		Waits.wait2s();
	}

	public void hoverOnVendorAvailablityIcon() {
		Waits.wait2s();
		hoverOverElement(vendorAvailablityIcon);
		Waits.wait1s();
	}

	public void hoverOncartPageVendorAvailablityIcon() {
		Waits.wait2s();
		hoverOverElement(cartPageVendorAvailablityIcon);
		Waits.wait1s();
	}

	public void hoverOnaddToCartRedeemPointIcon() {
		Waits.wait2s();
		hoverOverElement(addToCartRedeemPoint);
		Waits.wait1s();
	}
	
	public void hoverPromotionIcon() {
		Waits.wait2s();
		hoverOverElement(promotionIcon);
		Waits.wait1s();
	}

	public boolean isredeemPointToolTipDisplaying() {
		return isElementDisplayed(redeemPointToolTip);
	}
	
	public boolean isPromotionToolTipDisplaying() {
		return isElementDisplayed(promotionToolTip);
	}

	public boolean isEarnPointToolTipDisplaying() {
		return isElementDisplayed(earnPointToolTip);
	}

	public boolean isAddToCartToolTipDisplaying() {
		return isElementDisplayed(addtocarttoolTip);
	}

	public boolean iscartPageItemsDisplaying() {
		Waits.wait5s();
		Waits.wait5s();
		return isElementDisplayed(cartPageItems);
	}

	public boolean iscartItemsDisplaying(String description1) {
		String description = description1.substring(0, 2);
		try {
			scrollIntoView(driver.findElement(By.xpath("//h5//a[contains(text(),'" + description + "')]")));
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(driver.findElement(By.xpath("//h5//a[contains(text(),'" + description + "')]")));
	}

	public boolean isCartItemsDeleted(String description) {
		return isElementDisplayed(driver.findElement(By.xpath("//h5//a[contains(text(),'" + description + "')]")));
	}

	public boolean isAddedToCartMessageEarnpointDisplaying() {
		return isElementDisplayed(addedToCartMessageEarnpoint);
	}

	public void clickOnOkButton() {
		waitForElementClickable(okButton, "20");
		click(okButton);
	}

	public void clickOnUpdateCartButton() {
		click(updateCartButton);
	}

	public void clickOnViewCartButton() {
		click(viewCartButton);
	}

	public boolean isCartPageHeadingDisplaying() {
		return isElementDisplayed(cartPageHeading);
	}

	public void clickOnAddToCartButtonPopUp() {
		Waits.wait2s();
		waitForElementClickable(addToCartButtonPopUp, "20");
		click(addToCartButtonPopUp);
	}
	

	public void clickOnSecondVendor() {
		Waits.wait2s();
		hoverAndClick(secondVendor, secondVendor);
	}

	public boolean isAddToCartButtonPopUpDisplaying() {
		return isElementDisplayed(addToCartButtonPopUp);
	}

	public boolean isAddToCartButtonPopUpDisplaying1() {
		try {
			waitForElementVisibility(addToCartButtonPopUp, "5");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isViewInCartDisplaying() {
		return isElementDisplayed(viewInCart);
	}

	public void clickOnViewInCart() {
		Waits.wait2s();
		waitForElementClickable(viewInCart, "20");
		click(viewInCart);
	}

	public boolean isAddToCartButtonDisplaying() {
		return isElementDisplayed(addToCartButton);
	}

	public boolean isSecondVendorDisplaying() {
		return isElementDisplayed(secondVendor);
	}

	public boolean isVendorAvailablityCheckboxDisplaying() {
		try {
			waitForElementVisibility(vendorCheckbox, "5");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isVendorAvailablityIconDisplaying() {
		try {
			waitForElementVisibility(vendorAvailablityIcon, "5");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isPromotionIconDisplaying() {
		try {
			waitForElementVisibility(promotionIcon, 10);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isCartPageVendorAvailablityIconDisplaying() {
		try {
			waitForElementVisibility(cartVendorAvailablityIcon, "5");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isaddToCartRedeemPointDisplaying() {
		try {
			waitForElementVisibility(addToCartRedeemPoint, "10");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isPriceInfrontVendorDisplaying() {
		Waits.wait3s();
		return isElementDisplayed(priceInfrontVendor);
	}
	
	public boolean isPriceInfrontVendorCartDisplaying() {
		Waits.wait3s();
		return isElementDisplayed(priceInfrontVendorCart);
	}
	
	public boolean isProductPricePopUpDisplaying() {
		Waits.wait3s();
		return isElementDisplayed(productPricePopUp);
	}

	public boolean isAddedToCartMessageDisplaying() {
		try {
			waitForElementVisibility(addedToCartMessage, "5");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isAddedToCartPopUpQtyDisplaying() {
		return isElementDisplayed(addedToCartPopUpQty);
	}

	public boolean isAddedToCartPopUpproductImageDivDisplaying() {
		return isElementDisplayed(addedToCartPopUpproductImageDiv);
	}

	public boolean isAddedToCartPopUpProductDescriptionDisplaying() {
		return isElementDisplayed(addedToCartPopUpProductDescription);
	}

	public boolean isAddedToCartPopUpItemsCountDisplaying() {
		return isElementDisplayed(addedToCartPopUpItemsCount);
	}

	public void clickOnSortByDropDownProductNameLowestPrice() {
		Waits.wait1s();
		waitForElementClickable(sortbyDropDownProductNameLowestPrice, "20");
		click(sortbyDropDownProductNameLowestPrice);
	}

	public void clickOnQuantityDecreaseAddtoCartPopUp() {
		Waits.wait2s();
		try {
			click(quantityDecreaseAddtoCartPopUp);
		}catch (Exception e) {
			clickUsingJavascriptExecutor(quantityDecreaseAddtoCartPopUp);
		}
	}

	public void clickOnQuantityIncreaseAddtoCartPopUp() {
		Waits.wait2s();
		try {
			click(quantityincreaseAddtoCartPopUp);
		}catch (Exception e) {
			clickUsingJavascriptExecutor(quantityincreaseAddtoCartPopUp);
		}
	}

	public String getQuantityTextDescription() {
		Waits.wait2s();
		String element = "//input[@class='quantity_field']";//"//input[@id='quantity']";
		return driver.findElement(By.xpath(element)).getAttribute("value");
	}

	public String getQuantityTextDescriptionCartPage() {
		Waits.wait2s();
		return quantityTextDescriptionCartPage.getAttribute("value");
	}

	public void clickOnViewDropDownn() {
		Waits.wait2s();
		waitForElementClickable(viewDropDown, "20");
		click(viewDropDown);
	}

	public void clickOnViewDropDownWide() {
		Waits.wait2s();
		waitForElementClickable(viewDropDownWide, "20");
		click(viewDropDownWide);
	}

	public void clickOnViewDropDownDefault() {
		Waits.wait2s();
		waitForElementClickable(viewDropDownDefault, "20");
		click(viewDropDownDefault);
	}

	public void clickOnSortbyDropDown() {
		Waits.wait1s();
		waitForElementClickable(sortbyDropDown, "20");
		click(sortbyDropDown);
	}

	public void clickOnSortbyDropDownProductNameZ_A() {
		Waits.wait1s();
		waitForElementClickable(sortbyDropDownProductNameZ_A, "20");
		click(sortbyDropDownProductNameZ_A);
	}

	public void clickOnProductPagePrice10() {
		Waits.wait1s();
		waitForElementClickable(productPagePrice10, "20");
		click(productPagePrice10);
	}

	public void clickOnProductImage1() {
		Waits.wait1s();
		waitForElementClickable(productImage1, "20");
		click(productImage1);
	}

	public boolean isDetailPageReviewDisplaying() {
		return isElementDisplayed(detailPageReview);
	}

	public void clickOnManufacturerFilter() {
		Waits.wait2s();
		hoverAndClick(manufacturerFilter, manufacturerFilter);
	}

	public void clickOnVendorFilter() {
		Waits.wait2s();
		hoverAndClick(vendorFilter, vendorFilter);
	}
	
	public void clickOnSortbyDropDownFrequentlyPurchases() {
		Waits.wait1s();
		waitForElementClickable(frequentlyPurchasedOption, "20");
		click(frequentlyPurchasedOption);
	}

	public boolean scrollToVendorHeading() {
		scrollIntoView(vendorHeading);
		return isElementDisplayed(vendorHeading);
	}

	public boolean scrollToManufacturerFilter() {
		scrollIntoView(manufacturerFilter);
		return isElementDisplayed(manufacturerFilter);
	}

	public boolean scrollToProductsPriceHeading() {
		scrollIntoView(productsPriceHeading);
		return isElementDisplayed(productsPriceHeading);
	}

	public int getNumberOfAddToCart() {
		Waits.wait1s();
		return NumberOfAddToCart.size();
	}

	public int getcartPageItems() {
		Waits.wait1s();
		return numbercartPageItems.size();
	}

	public int getcartPageItemsImage() {
		Waits.wait1s();
		return cartPageItemsImage.size();
	}

	public double getNumberOfProductsItems() {
		Waits.wait1s();
		return ProductsItems.size();
	}

	public double getNumberOfProductsWithCompounding() {
		Waits.wait1s();
		return ProductsWithCompounding.size();
	}

	public void clickOnFirstProductHeadingAdministrationAndTransfusion() {
		Waits.wait1s();
		waitForElementClickable(firstProductHeadingAdministrationAndTransfusion, "20");
		click(firstProductHeadingAdministrationAndTransfusion);
	}

	public void clickOnFirstAntiInfectiveAgent() {
		Waits.wait1s();
		waitForElementClickable(firstAntiInfectiveAgent, "20");
		click(firstAntiInfectiveAgent);
	}

	public boolean isAllProductHeadingAdministrationAndTransfusionDisplaying() {
		return isElementDisplayed(productPageHeadingAdministrationAndTransfusion);
	}

	public boolean isLastOrderedDisplaying() {
		return isElementDisplayed(lastOrdered);
	}

	public double getNumberOfProductsWithLastOrdered() {
		Waits.wait1s();
		return ProductsWithLastOrdered.size();
	}

	public boolean isAllProductInAdministrationAndTransfusionDisplaying() {
		return isElementDisplayed(allProductInAdministrationAndTransfusion);
	}

	public double getNumberOfAllProductInAdministrationAndTransfusion() {
		Waits.wait1s();
		return ProductInAdministrationAndTransfusion.size();
	}

	public double getAllProductCountInAdministrationAndTransfusion() {
		Waits.wait1s();
		return ProductCountInAdministrationAndTransfusion.size();
	}

	public double getAllProductsSize() {
		Waits.wait1s();
		return ProductsSize.size();
	}

	public double getAllProductWithHeartIcons() {
		Waits.wait1s();
		return ProductWithHeartIcons.size();
	}
	
	
	

	public void enterIntoSearchBarProduct(String product) {
		Waits.wait5s();
		type(searchBarProduct, product);
		Waits.wait5s();

	}

	public void enterSearchBarManufacturer(String product) {
		Waits.wait5s();
		type(searchBarManufacturer, product);
		Waits.wait3s();
		waitForElementClickable(optionRoyalcanin, "20");
		click(optionRoyalcanin);
		Waits.wait5s();
	}

	public boolean isFileDownloaded(String downloadPath, String fileName) {
		Waits.wait2s();

		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName)) {
				//dirContents[i].delete();
				return true;
			}
		}
		return false;
	}

	public void clickOndeleteIconButton() {
		Waits.wait2s();
		try {
			click(deleteIcon);
		}catch (Exception e) {
			clickUsingJavascriptExecutor(deleteIcon);
		}
	}

	public void clickOndeleteIconButton(String description1) {
		Waits.wait2s();
		String description = description1.substring(0, 2);

		String toDelete = "(//i[contains(@class,'zmdi-delete')]/parent::span/parent::button)[1]";
		waitForElementClickable(driver.findElement(By.xpath(toDelete)), "20");
		Waits.wait6s();

		driver.findElement(By.xpath(toDelete)).click();
	}

	public void clickOnYesRemoveButtonCartPage() {
		Waits.wait2s();
		waitForElementClickable(yesRemoveButtonCartPage, "20");
		click(yesRemoveButtonCartPage);
	}

	public boolean isVendorImageDisplaying() {
		return isElementDisplayed(vendorImage);
	}

	public boolean isTotalPriceDisplaying() {
		return isElementDisplayed(totalPrice);
	}

	public boolean isPlaceOrderButtonDisplaying() {
		return isElementDisplayed(placeOrderButton);
	}

	public boolean isProductImageDisplaying() {
		return isElementDisplayed(productImage);
	}

	public boolean isDescriptionDisplaying() {
		return isElementDisplayed(description);
	}

	public boolean isPriceDisplaying() {
		return isElementDisplayed(price);
	}

	public boolean isQuantityDisplaying() {
		try {
			scrollIntoView(quantityText);
			Waits.wait1s();
		} catch (Exception e) {

		}
		return isElementDisplayed(quantityText);
	}

	public boolean isDeleteproducbuttonDisplaying() {
		try {
			scrollIntoView(deleteIcon);
			Waits.wait1s();
		} catch (Exception e) {

		}
		return isElementDisplayed(deleteIcon);
	}

	public int getNumberOfItemsOnCart() {
		return driver.findElements(By.xpath("//h5/a[contains(@title,'click here')]")).size();

	}

	public String getFirstTotalPrice() {
		String price = getElementText(totalPrice);
		price = price.replace("$", "");
		return price;
	}

	public int getNumberOfPlaceOrderButtonList() {
		return placeOrderButtonList.size();

	}

	public int getNumberOfVendorsHeaderCarPageList() {
		return vendorsHeaderCarPageList.size();
	}

	public void clickOnPlaceOrderButton() {
		scrollIntoViewSmoothly(placeOrderButton);
		click(placeOrderButton);
	}
	public void hoverOnPlaceOrderButton() {
		Waits.wait2s();
		mouseHover(placeOrderButton);
	}

	public void clickVendorsOrderSubmitButton() {
		Waits.wait2s();
		waitForElementClickable(vendorsOrderSubmitButton, "20");
		click(vendorsOrderSubmitButton);
	}

	public boolean isOrderPlacedSuccessMsgDisplaying() {
		return isElementDisplayed(orderPlacedSuccessMsg);
	}

	public boolean isVendorsOrderSubmitButtonDisplaying() {
		return isElementDisplayed(vendorsOrderSubmitButton);
	}

	public int getDeleteIconList() {
		return deleteIconList.size();
	}

	public void clickNextPageButton(String Number) {
		Waits.wait2s();
		String pageNumberXpath = "(//a[contains(@aria-label,'Page') and contains(text(),'" + Number + "')])[1]";
		waitForElementClickable(driver.findElement(By.xpath(pageNumberXpath)), "20");
		click(driver.findElement(By.xpath(pageNumberXpath)));
	}

	public boolean isCartIsEmptyMsgDisplaying() {
		return isElementDisplayed(cartIsEmptyMsg);
	}

	public boolean isCannotBeOrderedMsgDisplaying() {

		try {
			waitForElementVisibility(cannotBeOrderedMsg, "5");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
