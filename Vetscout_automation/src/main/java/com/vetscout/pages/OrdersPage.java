package com.vetscout.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vetscout.base.BaseClass;
import com.vetscout.utilities.Waits;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OrdersPage extends BaseClass {
	@FindBy(xpath = ("//div[contains(@class,'cart-shop-list')]//img[contains(@alt,'product-image')]"))
	WebElement productImage;

	@FindBy(xpath = ("//a[@title='click here to get product details']"))
	WebElement productDescription;

	@FindBy(xpath = ("//a[@title='click here to get product details']"))
	WebElement firstProductDescription;

	@FindBy(xpath = ("//img[contains(@src,'covetrus.png')]"))
	WebElement vendorImage;

	@FindBy(xpath = ("(//div[contains(@class,'mb-20')]//img[contains(@src,'covetrus.png')])"))
	List<WebElement> vendorCovetrusImage;

	@FindBy(xpath = ("(//div[contains(@class,'mb-20')]//h4)"))
	WebElement SKU;

	@FindBy(xpath = ("(//div[contains(@class,'mb-20')]//h4[contains(text(),'$')])"))
	WebElement price;

	@FindBy(xpath = ("(//div[contains(@class,'mb-20')]//h4[@style='font-size: 1rem;'])[3]"))
	WebElement quantity;

	@FindBy(xpath = ("(//div[contains(@class,'mb-20')]//button)"))
	WebElement shippingButton;

	@FindBy(xpath = ("//button//span[contains(text(),'DELIVERED')] | //button//span[contains(text(),'Delivered')]"))
	List<WebElement> shippingDeliveredButtonList;
	
	@FindBy(xpath = ("(//button//span[contains(text(),'DELIVERED')] | //button//span[contains(text(),'Delivered')])[1]"))
	WebElement firstShippingDeliveredButton;

	@FindBy(xpath = ("(//input[@id='standard-text'])[1]"))
	WebElement searchFieldByProductName;

	@FindBy(xpath = ("(//input[@id='standard-text'])[2]"))
	WebElement searchFieldByVendorName;

	@FindBy(xpath = ("//p[contains(text(),'Sort')]//following-sibling::*//div//div"))
	WebElement sortDropDown;

	@FindBy(xpath = ("//div[contains(text(),'Search by Vendor')]"))
	WebElement vendorDropDown;

	@FindBy(xpath = ("//div[contains(text(),'Covetrus')]"))
	WebElement vendorDropDownCovetrus;

	@FindBy(xpath = ("//div[contains(text(),'Newest First')]"))
	WebElement sortDropDownNewestFirst;

	@FindBy(xpath = ("//div[contains(text(),'Oldest First')]"))
	WebElement sortDropDownOldestFirst;

	@FindBy(xpath = ("//div[contains(text(),'Product Name (A-Z)')]"))
	WebElement sortDropDownProductNameA_Z;

	@FindBy(xpath = ("//div[contains(text(),'Product Name (Z-A)')]"))
	WebElement sortDropDownProductNameZ_A;

	@FindBy(xpath = ("//button//span[contains(text(),'Print')]"))
	WebElement buttonPrint;

	@FindBy(xpath = ("(//div[@class='orderId'])[1]"))
	WebElement orderId;

	@FindBy(xpath = ("(//a[text()='TRACK'])[1]"))
	WebElement trackButton;
	
	@FindBy(xpath = ("(//a[text()='TRACK'])[last()]"))
	WebElement trackButton2;

	@FindBy(xpath = ("//p[contains(text(),'Shipping Status')]//following-sibling::div//div//div"))
	WebElement shippingStatusDropDown;

	@FindBy(xpath = ("//div[contains(text(),'Delivered')]"))
	WebElement shippingStatusDropDownDelivered;

	@FindBy(xpath = ("//div[contains(@class,'card-header')]//h5"))
	WebElement shippingDetailsPageHeader;

	@FindBy(xpath = ("//h6//a[contains(@title,'product details')]"))
	List<WebElement> productDescriptionList;

	@FindBy(xpath = ("//div[contains(@class,'rct-card-wrap') and contains(@class,'cart-shop-list')]"))
	List<WebElement> eachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//img[contains(@alt,'product-image')]"))
	List<WebElement> firstProductImageOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//a[@title='click here to get product details']"))
	List<WebElement> firstProductDescriptionOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[3]//img"))
	List<WebElement> firstVendorImageOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[4]//h4"))
	List<WebElement> firstSKUOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[contains(@class,'mb-20')]//h4[contains(text(),'$')]"))
	List<WebElement> firstPriceOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[6]//h4"))
	List<WebElement> firstQuantityOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[5]//h4"))
	List<WebElement> backOrderFirstQuantityOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[7]//button"))
	List<WebElement> firstShippingButtonOfEachOrder;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//div[6]//button"))
	List<WebElement> backOrderFirstShippingButtonOfEachOrder;

	@FindBy(xpath = ("//div[@class='orderId']"))
	List<WebElement> orderNumber;

	@FindBy(xpath = ("//div[contains(text(),'Total:')]"))
	List<WebElement> total;

	@FindBy(xpath = ("//div[contains(text(),'Ordered On: ')]"))
	List<WebElement> orderDueDate;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//span[contains(text(),'Product arrived')]"))
	List<WebElement> productArrived;

	@FindBy(xpath = ("//hr[contains(@class,'devider')]//following-sibling::div[1]//span[contains(text(),'Product cancelled')]"))
	List<WebElement> productCancelled;

	@FindBy(xpath = ("//button[contains(@class,'active')]//img"))
	List<WebElement> activeHeartIcons;

	@FindBy(xpath = ("//input[@value='SHIPPED']"))
	List<WebElement> productArrivedRadioButtonList;

	@FindBy(xpath = ("(//button[contains(@id,'yes')])[2]"))
	WebElement buttonYes;

	@FindBy(xpath = ("//input[@value='SHIPPED']"))
	WebElement productArrivedRadioButton;

	@FindBy(xpath = ("//button[contains(@class,'btn-warning')]"))
	WebElement buttonOK;
	@FindBy(xpath = ("(//span[contains(text(),'Product arrived')])[1]"))
	WebElement productArrivedRadioButtonLabel;

	@FindBy(xpath = ("(//span[contains(text(),'Product cancelled')])[1]"))
	WebElement productCancelledRadioButtonLabel;

	@FindBy(xpath = "(//p[text()='Vendor']//following-sibling::div//child::div)[1]")
	WebElement vendorDrodpown;

	@FindBy(xpath = "//div[contains(text(), 'BI')]")
	WebElement BIVendor;

	@FindBy(xpath = "(//img[@alt='Covetrus'])[1]")
	WebElement ProductVendor;

	@FindBy(xpath = "(//img[contains(@alt,'product-image')])[1]")
	WebElement productImageInOrdersPage;

	@FindBy(xpath = "//a[@title='click here to get product details']")
	WebElement productDescriptionInOrdersPage;

	@FindBy(xpath = "//img[contains(@src,'vet-price-check.s3-us-west-2.amazonaws.com/store/')]")
	WebElement productVendorInOrderPage;

	@FindBy(xpath = "//img[contains(@src,'vet-price-check.s3-us-west-2.amazonaws.com/store/')]//following::h4[1]")
	WebElement productPriceInOrderPage;

	@FindBy(xpath = "//img[contains(@src,'vet-price-check.s3-us-west-2.amazonaws.com/store/')]//following::h4[2]")
	WebElement productQuantityInOrderPage;

	@FindBy(xpath = "//img[contains(@src,'vet-price-check.s3-us-west-2.amazonaws.com/store/')]//following::h4[3]")
	WebElement productDateInOrderPage;

	@FindBy(xpath = "//input[@id='standard-text']")
	WebElement searchProductInput;

	@FindBy(xpath = "//b[contains(text(),'MANUFACTURER :')]/..")
	WebElement manufacturerHeading;

	@FindBy(xpath = ("//p[text()='Vendor']//following-sibling::div//div[contains(@class, 'indicatorContainer')]"))
	WebElement sortDrodpownIcon;

	@FindBy(xpath = "(//div[@class='my-fvrt']//p)[1]")
	WebElement productCount;

	@FindBy(xpath = "//button[contains(@title,'Select Date Range')]")
	WebElement selectDateBtn;

	@FindBy(xpath = "(//button[contains(@title,'Select Date Range')])[1]")
	WebElement PSIRebateDateBtn;

	@FindBy(xpath = "(//button[contains(@title,'Select Date Range')])[2]")
	WebElement PSISavingDateBtn;

	@FindBy(xpath = "(//button[contains(@title,'Select Date Range')])[3]")
	WebElement MissedSavingDateBtn;

	@FindBy(xpath = "(//span[text()='This Month'])[1]")
	WebElement thisMonthBtn;

	@FindBy(xpath = "(//span[text()='This Month'])[3]")
	WebElement PSISavingThisMonthBtn;

	@FindBy(xpath = "(//span[text()='This Month'])[5]")
	WebElement MissedSavingThisMonthBtn;

	@FindBy(xpath = "//span[text()='Update']")
	WebElement updateDateBtn;

	@FindBy(xpath = "(//span[text()='Update'])[1]")
	WebElement PSIRebateUpdateDateBtn;

	@FindBy(xpath = "(//span[text()='Update'])[2]")
	WebElement PSISavingUpdateDateBtn;

	@FindBy(xpath = "(//span[text()='Update'])[3]")
	WebElement MissedSavingUpdateDateBtn;

	@FindBy(xpath = "//button[contains(@title,'Select Date Range')]//preceding-sibling::div/div/input")
	WebElement dateField;

	@FindBy(xpath = "(//button[contains(@title,'Select Date Range')]//preceding-sibling::div/div/input)[1]")
	WebElement PSIRebateDateField;

	@FindBy(xpath = "(//button[contains(@title,'Select Date Range')]//preceding-sibling::div/div/input)[2]")
	WebElement PSISavingDateField;

	@FindBy(xpath = "(//button[contains(@title,'Select Date Range')]//preceding-sibling::div/div/input)[3]")
	WebElement MissedSavingDateField;

	@FindBy(xpath = "(//div[@class='cartComp'])")
	List<WebElement> byProductOrdersCard;

	@FindBy(xpath = "//div[contains(text(),'Ordered On: ')]/b")
	List<WebElement> byHistoryOrderDates;

	@FindBy(xpath = "(//div[@class='card'])[1]//td[contains(.,',')]")
	List<WebElement> PSIRebateOrdersDates;

	@FindBy(xpath = "(//div[@class='card'])[2]//td[contains(.,',')]")
	List<WebElement> PSISavingOrdersDates;

	@FindBy(xpath = "(//div[@class='card'])[3]//td[contains(.,',')]")
	List<WebElement> MissedSavingOrdersDates;

	@FindBy(xpath = "//button[contains(@class,'cart-btn')]//i")
	List<WebElement> cartOrdersDeleteBtns;

	@FindBy(xpath = "//span[text()='Tracking number:']/parent::td/following-sibling::td")
	WebElement trackingNum;

	public OrdersPage() {
		PageFactory.initElements(driver, this);
	}

	public void waitUnitlPageLoad() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(vendorImage));
	}

	public boolean isProductImageDisplaying() {
		return isElementDisplayed(productImage);
	}

	public boolean isProductDescriptionDisplaying() {
		return isElementDisplayed(productDescription);
	}

	public boolean isVendorImageDisplaying() {
		waitForElementVisibility(vendorImage, defaultTimeForVisibility);

		return isElementDisplayed(vendorImage);
	}

	public boolean isSKUDisplaying() {
		return isElementDisplayed(SKU);
	}

	public boolean isPriceDisplaying() {
		return isElementDisplayed(price);
	}

	public boolean isQuantityDisplaying() {
		return isElementDisplayed(quantity);
	}

	public boolean isShippingButtonDisplaying() {
		return isElementDisplayed(shippingButton);
	}

	public boolean isSearchedResultDisplaying(String toSearch) {
		
		waitForElementVisibility(orderId, defaultTimeForVisibility);
		return isElementDisplayed(orderId);
	}

	public void enterKeysSearchFieldByProductName(String toSearch) {
		waitUntilElementDisplayed(searchFieldByProductName);
		type(searchFieldByProductName, toSearch);
	}

	public void enterKeysSearchFieldByVendorName(String toSearch) {
		waitUntilElementDisplayed(searchFieldByVendorName);
		type(searchFieldByVendorName, toSearch);
		searchFieldByVendorName.sendKeys(Keys.RETURN);
	}

	public static String getElementText(WebElement element, WebDriver driver) {
		return element.getText().trim();
	}

	public String getTrackingNum() {
		return trackingNum.getText().trim();
	}

	public String getOrderId() {
		return orderId.getText();
	}

	public ArrayList<String> jobExpiryDate(WebDriver driver) {
		ArrayList<String> allExpiryDates = new ArrayList<>();
		List<WebElement> element = driver.findElements(
				By.xpath("//th[contains(text(),'Expiry date')]/../../following-sibling::tbody//td[4]/div/p"));
		for (int i = 0; i < element.size(); i++) {
			String date = getElementText(element.get(i), driver);
			allExpiryDates.add(date);
		}
		return allExpiryDates;
	}

	public void clickOnSortDropDown() {
		waitForElementClickable(sortDropDown, "20");
		click(sortDropDown);
	}

	public void clickOnVendorDropDownCovetrus() {
		waitForElementClickable(vendorDropDownCovetrus, "20");
		click(vendorDropDownCovetrus);
	}

	public void clickOnVendorDropDown() {
		waitForElementClickable(vendorDropDown, "20");
		click(vendorDropDown);
	}

	public void clickOnShippingStatusDropDown() {
		waitForElementClickable(shippingStatusDropDown, "20");
		click(shippingStatusDropDown);
	}

	public void clickOnShippingStatusDropDownDelivered() {
		waitForElementClickable(shippingStatusDropDownDelivered, "20");
		click(shippingStatusDropDownDelivered);
	}

	public void clickOnSortDropDownNewestFirst() {
		waitForElementClickable(sortDropDownNewestFirst, "20");
		click(sortDropDownNewestFirst);
	}

	public void clickOnSortDropDownOldestFirst() {
		waitForElementClickable(sortDropDownOldestFirst, "20");
		click(sortDropDownOldestFirst);
	}

	public void clickOnSortDropDownProductNameA_Z() {
		waitForElementClickable(sortDropDownProductNameA_Z, "20");
		click(sortDropDownProductNameA_Z);
	}

	public void clickOnSortDropDownProductNameZ_A() {
		waitForElementClickable(sortDropDownProductNameZ_A, "20");
		click(sortDropDownProductNameZ_A);
	}

	public void clickOnSelectDateBtn() {
		waitForElementClickable(selectDateBtn, "20");
		click(selectDateBtn);
	}

	public void clickOnPSIRebateDateBtn() {
		waitForElementClickable(PSIRebateDateBtn, "20");
		try {
			click(PSIRebateDateBtn);

		} catch (Exception e) {
			click(PSIRebateDateBtn);

		}
	}

	public void clickOnPSISavingDateBtn() {
		waitForElementClickable(PSISavingDateBtn, "20");
		try {
			click(PSISavingDateBtn);

		} catch (Exception e) {
			click(PSISavingDateBtn);

		}
	}

	public void clickOnMissedSavingDateBtn() {
		waitForElementClickable(MissedSavingDateBtn, "20");
		try {
			click(MissedSavingDateBtn);
		} catch (Exception e) {
			click(MissedSavingDateBtn);
		}
	}

	public void clickOnThisMonthBtn() {
		waitForElementClickable(thisMonthBtn, "20");
		click(thisMonthBtn);
	}

	public void clickOnPSISavingThisMonthBtn() {
		waitForElementClickable(PSISavingThisMonthBtn, "20");
		click(PSISavingThisMonthBtn);
	}

	public void clickOnMissedSavingThisMonthBtn() {
		waitForElementClickable(MissedSavingThisMonthBtn, "20");
		click(MissedSavingThisMonthBtn);
	}

	public void clickOnUpdateDateBtn() {
		waitForElementClickable(updateDateBtn, "20");
		click(updateDateBtn);
	}

	public void clickOnPSIRebateUpdateDateBtn() {
		waitForElementClickable(PSIRebateUpdateDateBtn, "20");
		click(PSIRebateUpdateDateBtn);
	}

	public void clickOnPSISavingUpdateDateBtn() {
		waitForElementClickable(PSISavingUpdateDateBtn, "20");
		click(PSISavingUpdateDateBtn);
	}

	public void clickOnMissedSavingUpdateDateBtn() {
		waitForElementClickable(MissedSavingUpdateDateBtn, "20");
		click(MissedSavingUpdateDateBtn);
	}

	public int getNumberOfResults() {
		return productDescriptionList.size();
	}

	public int getNumberOfVendorCovetrusImage() {
		return vendorCovetrusImage.size();
	}

	public int getNumberOfDeliveredShippingButton() {
		try {
			waitForElementVisibility(firstShippingDeliveredButton, 60);

		} catch (Exception e) {
			waitForElementVisibility(firstShippingDeliveredButton, 60);
		}
		return shippingDeliveredButtonList.size();
	}

	public int getNumberOfEachOrder() {
		return eachOrder.size();
	}

	public int getNumberOfFirstProductDescriptionOfEachOrder() {
		return firstProductDescriptionOfEachOrder.size();
	}

	public int getNumberOfFirstVendorImageOfEachOrder() {
		return firstVendorImageOfEachOrder.size();
	}

	public int getNumberOfFirstSKUOfEachOrder() {
		return firstSKUOfEachOrder.size();
	}

	public int getNumberOfFirstPriceOfEachOrder() {
		return firstPriceOfEachOrder.size();
	}

	public int getNumberOfFirstQuantityOfEachOrder() {
		return firstQuantityOfEachOrder.size();
	}

	public int getNumberOfBackOrderFirstQuantityOfEachOrder() {
		return backOrderFirstQuantityOfEachOrder.size();
	}

	public int getNumberOffirstShippingButtonOfEachOrder() {
		return firstShippingButtonOfEachOrder.size();

	}

	public int getbackOrderFirstShippingButtonOfEachOrder() {
		return backOrderFirstShippingButtonOfEachOrder.size();
	}

	public int getNumberOfFirstProductImageOfEachOrder() {
		return firstProductImageOfEachOrder.size();
	}

	public int getNumberOfOrderNumber() {
		return orderNumber.size();
	}

	public int getNumberOfTotal() {
		return total.size();
	}

	public int getNumberOfOrderDueDate() {
		return orderDueDate.size();
	}

	public void clickOnButtonPrint() {
		waitForElementClickable(buttonPrint, "20");
		click(buttonPrint);
	}

	public void clickOnTrackButton() {
		waitForElementClickable(trackButton, "20");
		click(trackButton);
	}
	public void clickOnTrackButton2() {
		waitForElementClickable(trackButton2, "20");
		click(trackButton2);
	}

	public String getNoTrackButton() {

		String url = trackButton.getAttribute("href");

		url = (url.split("=", 2))[1];

		return url;

	}
	public String getNoTrackButton2() {

		String url = trackButton2.getAttribute("href");

		url = (url.split("=", 3))[2];

		return url;

	}

	public void switchToNextTab() {
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
	}

	public ArrayList<String> getProductNameList(WebDriver driver) throws InterruptedException {
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("List Count: " + getNumberOfResults());
		for (int i = 1; i <= getNumberOfResults(); i++) {
			Waits.wait2s();
			list.add(
					driver.findElement(By.xpath("(//h6//a[contains(@title,'product details')])[" + i + "]")).getText());
		}
		return list;
	}

	public boolean isShippingDetailsPageHeaderDisplaying() {
		return isElementDisplayed(shippingDetailsPageHeader);
	}

	public int getNumberOfactiveHeartIcons() {
		return activeHeartIcons.size();
	}

	public int getNumberOfProductArrived() {
		return productArrived.size();
	}

	public int getNumberOfProductCancelled() {
		return productCancelled.size();
	}

	public int getProductCount() {

		int num = 0;

		String str = productCount.getText();

		String[] arrOfStr = str.split(" of ", 2);

		arrOfStr = arrOfStr[1].split(" ", 2);

		num = Integer.parseInt(arrOfStr[0]);

		return num;
	}

	public int getNumberOfProductArrivedRadioButtonList() {
		return productArrivedRadioButtonList.size();
	}

	public void clickOnButtonYes() {
		waitForElementClickable(buttonYes, "20");
		click(buttonYes);
	}

	public void clickOnProductArrivedRadioButton() {
		try {
			click(productArrivedRadioButtonLabel);

		} catch (Exception e) {
			clickUsingJavascriptExecutor(productArrivedRadioButtonLabel);	

		}
	}

	public void clickOnProductCancelledRadioButtonLabel() {
		
		try {
			click(productCancelledRadioButtonLabel);
		} catch (Exception e) {
			clickUsingJavascriptExecutor(productCancelledRadioButtonLabel);
		}
		
	}

	public void clickOnButtonOK() {

		waitForElementClickable(buttonOK, "20");
		click(buttonOK);
	}

	public String getTextOfProductDescription() {
		return getElementText(firstProductDescription);
	}

	public boolean isItemDisplaying(String description1) {
		try {
			scrollIntoView(driver.findElement(By.xpath(
					"//a[@title='click here to get product details' and contains(text(),'" + description1 + "')]")));
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(driver.findElement(By
				.xpath("//a[@title='click here to get product details' and contains(text(),'" + description1 + "')]")));
	}

	public String clickVendorDrodpown() {
		scrollUp();
		click(vendorDrodpown);
		String getSelectedVendor = getElementText(vendorDropDownCovetrus);
		click(vendorDropDownCovetrus);

		return getSelectedVendor;
	}

	public boolean isProductVendorDisplaying() {
		try {
			scrollIntoView(ProductVendor);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(ProductVendor);
	}

	public boolean isProductImageInOrdersPageDisplaying() {
		try {
			scrollIntoView(productImageInOrdersPage);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(productImageInOrdersPage);
	}

	public boolean isProductDescriptionInOrdersPageDisplaying() {
		try {
			scrollIntoView(productDescriptionInOrdersPage);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(productDescriptionInOrdersPage);
	}

	public boolean isProductVendorInOrderPageDisplaying() {
		try {
			scrollIntoView(productVendorInOrderPage);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(productVendorInOrderPage);
	}

	public boolean isProductPriceInOrderPageDisplaying() {
		try {
			scrollIntoView(productPriceInOrderPage);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(productPriceInOrderPage);
	}

	public boolean isProductQuantityInOrderPageDisplaying() {
		try {
			scrollIntoView(productQuantityInOrderPage);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(productQuantityInOrderPage);
	}

	public boolean isProductDateInOrderPageDisplaying() {
		try {
			scrollIntoView(productDateInOrderPage);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(productDateInOrderPage);
	}

	public void enterProductToSearch(String productToSearch) {
		sendKeysToWebElement(searchProductInput, productToSearch);
		typeKeys(searchProductInput, Keys.TAB);
	}

	public boolean isSearchedProductInOrderPageDisplaying(String product) {

		WebElement element = null;
		try {
			String path = "//a[contains(text(), '" + product + "')]";
			element = driver.findElement(By.xpath(path));
			scrollIntoView(element);
			Waits.wait5s();
		} catch (Exception e) {

		}
		return isElementDisplayed(element);
	}

	public int getRepeatedOrdersSizeForSearchedProduct(String keyword, String qa_productAltTag) {
		String path = "(//a[contains(text(), '" + keyword + "')]//preceding::div[1])[1]/..//following::img[@alt='"
				+ qa_productAltTag + "']";
		List<WebElement> listOfOrders = driver.findElements(By.xpath(path));
		return listOfOrders.size();
	}

	public boolean isManufacturerHeadingInOrderPageDisplaying() {
		WebElement element = null;
		boolean isVisibel = false;
		try {
			String path = "//b[contains(text(),'MANUFACTURER :')]/..";
			List<WebElement> listOfOrders = driver.findElements(By.xpath(path));
			for (int i = 1; i <= listOfOrders.size(); i++) {
				String pathVal = "(//b[contains(text(),'MANUFACTURER :')]/..)[" + i + "]";
				element = driver.findElement(By.xpath(pathVal));
				scrollIntoView(element);
				Waits.wait5s();
				isVisibel = isElementDisplayed(element);
			}

		} catch (Exception e) {

		}
		System.out.println(isVisibel);
		return isVisibel;

	}

	public void clickSortDrodpown(String sortByCategory) {
		scrollIntoView(sortDrodpownIcon);
		click(sortDrodpownIcon);
		String path = "//div[contains(text(), '" + sortByCategory + "')]";
		click(driver.findElement(By.xpath(path)));

	}

	public boolean productsUnderEachManufacturerBlockDisplaying() {
		WebElement element = null;
		boolean isVisibel = false;
		try {
			String path = "(//h5[text()='Product']/following::a[@title='click here to get product details'])";
			List<WebElement> listOfOrders = driver.findElements(By.xpath(path));
			for (int i = 1; i <= listOfOrders.size(); i++) {
				String pathVal = "(//h5[text()='Product']/following::a[@title='click here to get product details'])["
						+ i + "]";
				element = driver.findElement(By.xpath(pathVal));
				scrollIntoView(element);
				Waits.wait5s();
				isVisibel = isElementDisplayed(element);
			}

		} catch (Exception e) {

		}
		System.out.println(isVisibel);
		return isVisibel;

	}

	public boolean isSearchedProductIsDisplaying(String str) {

		if (getElementText(firstProductDescription).equals(str)) {
			return true;
		}

		return false;
	}

	public boolean isProductCountChange(int count) {

		int num = 0;

		String str = productCount.getText();

		String[] arrOfStr = str.split(" of ", 2);

		arrOfStr = arrOfStr[1].split(" ", 2);

		num = Integer.parseInt(arrOfStr[0]);

		if (count != num)
			return true;

		return false;
	}

	public boolean isNewestFirstOrdersDisplaying() {

		for (int i = 1; i <= byProductOrdersCard.size(); i++) {

			String pathVal = "(//div[@class='cartComp'])[" + i + "]//h4[contains(.,', ')]";

			List<WebElement> byProductOrderedOn = driver.findElements(By.xpath(pathVal));

			if (!checkNewestFirstInList(byProductOrderedOn)) {
				return false;
			}
		}

		return true;
	}

	public boolean isOldestFirstOrdersDisplaying() {

		for (int i = 1; i <= byProductOrdersCard.size(); i++) {

			String pathVal = "(//div[@class='cartComp'])[" + i + "]//h4[contains(.,', ')]";

			List<WebElement> byProductOrderedOn = driver.findElements(By.xpath(pathVal));

			if (!checkOldestFirstInList(byProductOrderedOn)) {
				return false;
			}
		}

		return true;
	}

	public boolean isInRangeOrdersDisplaying() {

		for (int i = 1; i <= byProductOrdersCard.size(); i++) {

			String pathVal = "(//div[@class='cartComp'])[" + i + "]//h4[contains(.,', ')]";

			List<WebElement> byProductOrderedOn = driver.findElements(By.xpath(pathVal));

			if (!checkInDateRangeInList(byProductOrderedOn, dateField)) {
				return false;
			}
		}

		return true;
	}

	public boolean isByHistoryNewestFirstOrdersDisplaying() {

		if (!checkNewestFirstInList(byHistoryOrderDates))
			return false;

		return true;
	}

	public boolean isByHistoryOldestFirstOrdersDisplaying() {
		if (!checkOldestFirstInList(byHistoryOrderDates))
			return false;

		return true;
	}

	public boolean isByHistoryInRangeOrdersDisplaying() {

		if (!checkInDateRangeInList(byHistoryOrderDates, dateField))
			return false;

		return true;
	}

	public boolean isPSIRebateInRangeOrdersDisplaying() {

		if (!checkInDateRangeInList(PSIRebateOrdersDates, PSIRebateDateField))
			return false;

		return true;
	}

	public boolean isPSISavingInRangeOrdersDisplaying() {

		if (!checkInDateRangeInList(PSISavingOrdersDates, PSISavingDateField))
			return false;

		return true;
	}

	public boolean isMissedSavingInRangeOrdersDisplaying() {

		if (!checkInDateRangeInList(MissedSavingOrdersDates, MissedSavingDateField))
			return false;

		return true;
	}
	
	public void clickNextPageButton(String Number) {
		Waits.wait2s();
		String pageNumberXpath = "(//a[contains(@aria-label,'Page') and contains(text(),'" + Number + "')])[1]";
		waitForElementClickable(driver.findElement(By.xpath(pageNumberXpath)), "20");
		click(driver.findElement(By.xpath(pageNumberXpath)));
	}

	public boolean checkNewestFirstInList(List<WebElement> byProductOrderedOn) {

		if (byProductOrderedOn.size() == 0)
			return true;

		try {
			Date firstOrderDate = new SimpleDateFormat("E, dd MMM yyyy").parse(byProductOrderedOn.get(0).getText());

			for (WebElement item : byProductOrderedOn) {

				Date itemDate = new SimpleDateFormat("E, dd MMM yyyy").parse(item.getText());

				if (firstOrderDate.compareTo(itemDate) < 0)
					return false;

				firstOrderDate = itemDate;
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean checkOldestFirstInList(List<WebElement> byProductOrderedOn) {

		if (byProductOrderedOn.size() == 0)
			return true;

		try {
			Date firstOrderDate = new SimpleDateFormat("E, dd MMM yyyy").parse(byProductOrderedOn.get(0).getText());

			for (WebElement item : byProductOrderedOn) {
				Date itemDate = new SimpleDateFormat("E, dd MMM yyyy").parse(item.getText());

				if (firstOrderDate.compareTo(itemDate) > 0)
					return false;

				firstOrderDate = itemDate;
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean checkInDateRangeInList(List<WebElement> byProductOrderedOn, WebElement dateField) {

		if (byProductOrderedOn.size() == 0)
			return true;

		try {

			String[] arrOfStr = dateField.getAttribute("value").split(" - ", 2);

			Date minRange = new SimpleDateFormat("MM/dd/yyyy").parse(arrOfStr[0]);
			Date maxRange = new SimpleDateFormat("MM/dd/yyyy").parse(arrOfStr[1]);

			for (WebElement item : byProductOrderedOn) {
				Date itemDate = new SimpleDateFormat("E, dd MMM yyyy").parse(item.getText());

				if (minRange.compareTo(itemDate) > 0 || maxRange.compareTo(itemDate) < 0)
					return false;

			}
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public void emptyCart() {
		try {
			int i = 0;
			System.out.print("Size : " + cartOrdersDeleteBtns.size());
			for (WebElement item : cartOrdersDeleteBtns) {
				click(item);
				clickOnButtonYes();
				waitfor1sec();
				if (++i > 20)
					break;
			}
		} catch (Exception e) {
		}

	}

}
