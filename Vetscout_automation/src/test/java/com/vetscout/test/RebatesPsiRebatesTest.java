package com.vetscout.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.pages.CartPage;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.OrdersPage;
import com.vetscout.pages.ProductsPage;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.utilities.Waits;

import com.vetscout.listeners.ExtentListeners;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.RebatesPsiRebatesPage;
import com.vetscout.pages.SingupPage;

public class RebatesPsiRebatesTest extends BaseClass {

	

	@Test(priority = 1)
	public void TC_ID_272_VerifyUserIsAbleToRedirectedToTheRebatesDataOfTheRebateAndSavingsPage()
			throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Rebates</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetRebates();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Rebates And Savings' Page heading is displaying");
		ErrorCollector.verifyTrue(homePage.isRebatesAndSavingsPageHeadingDisplaying(),
				"Verify 'Rebates And Savings' Page heading is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	
	@Test(priority = 2)
	public void TC_ID_273_VerifyUserIsAbleToRedirectedToTheSavingsDataOfTheRebateAndSavingsPage()
			throws InterruptedException {
		login();

		HomePage homePage = new HomePage();
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
		

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Savings</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Rebates And Savings' Page heading is displaying");
		ErrorCollector.verifyTrue(homePage.isrebatesAndSavingsPageRebatesHeadingDisplaying(),
				"Verify 'Rebates And Savings' Page heading is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	 @Test(priority = 3)
	public void TC_ID_274_VerifyUserIsAbleToSeeTheMissedSavingOnRebateAndSavingPage() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;

		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Savings</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();
		Waits.wait6s();

		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : Verify Missed Savings Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingsDisplaying(),
				": Verified Missed Savings Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 4)
	public void TC_ID_277_VerifyUserIsAbleToSeeAllInfromationRegardingRebatesInTheRebatesSection() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
	
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Rebates</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetRebates();

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Rebates Titel is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebatesTitelDisplaying(),
				": Verified Rebates Titel is Displaying");
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates section Info Related To Date is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isInfoRelatedToDateDisplaying(),
				": Verified on Rebates section Info Related To Date is Displaying");
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates section Info Related To Amount is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRelatedToInfoAmountDisplaying(),
				": Verified on Rebates section Info Related To Amount is Displaying");
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates section Info Related To Type is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRelatedToInfoTypeDisplaying(),
				": Verified on Rebates section Info Related To Type is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 5)
	public void TC_ID_278_VerifyUserIsAbleToExportAllRebatesData() throws InterruptedException {
		login();

		
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Rebates</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetRebates();

		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Export </b> Button");
		rebatesPsiRebatesPage.clickOnPSIRebateExportButton();
		
		
		
		
		String userDirectory = System.getProperty("user.home")+"\\Downloads";

		waitfor10sec();
		
		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify All PSIVet Rebates products list exported successfully");
		ErrorCollector.verifyTrue(productsPage.isFileDownloaded(userDirectory, "Rebate.xlsx"),
				"Verified All PSIVet Rebates products list exported successfully");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	 @Test(priority = 6)
	public void TC_ID_279_VerifyUserIsAbleToExportAllSavingData() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();
		ProductsPage productsPage = new ProductsPage();

		int step = 5;

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Export </b> Button");
		rebatesPsiRebatesPage.clickOnPSISavingExportButton();

		String userDirectory = System.getProperty("user.home") + "\\Downloads";

		waitfor10sec();

		ErrorCollector
				.extentLogInfo("Step " + (++step) + " : Verify All PSIVet Saving products list exported successfully");
		ErrorCollector.verifyTrue(productsPage.isFileDownloaded(userDirectory, "Order_Savings.xlsx"),
				"Verified All PSIVet Saving products list exported successfully");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	
	
	@Test(priority = 7)
	public void TC_ID_280_VerifyUserIsAbleToSeeAllInformationInSavingSection() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Expand Icon is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingExpandIconDisplaying(),
				": Verified on Rebates Saving Expand Icon is Displaying");

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Order Date is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateOrderDateDisplaying(),
				": Verified on Rebates Saving  Order Date is Displaying");		

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Order Number is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateOrderNumberDisplaying(),
				": Verified on Rebates Saving Order Number is Displaying");
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Total Saving is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateTotalDisplaying(),
				": Verified on Rebates Saving  Total Saving is Displaying");
		


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 9)
	public void TC_ID_282_VerifyUserIsAbleToSeeMissedSavingInformationInMissedSavingSection() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

	
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify  Missed Saving Expand Icon is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingExpandIcon(),
				": Verified  Missed Saving Expand Icon is Displaying");

		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify  Missed Saving Order Date is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingOrdeDate(),
				": Verified  Missed Saving Order Date is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify  Missed Saving Order Number is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingOrdeNumber(),
				": Verified  Missed Saving Order Number is Displaying");
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify  Missed Saving Total is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingTotal(),
				": Verified  Missed Saving Total is Displaying");
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify  Missed Saving Note is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingOrdeNote(),
				": Verified  Missed Saving Note is Displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 10)
	public void TC_ID_285_VerifyUserIsAbleToSeeOrderDetailFromMissedSavingSection() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to <b>Missed Saving</b> Section");
		rebatesPsiRebatesPage.scrollToMissedSavingSection();
		
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Expand</b> Icon");
		rebatesPsiRebatesPage.clickOnMissedSavingExpandButton();
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Product Image is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingProductImageDisplaying(),
				": Verified Missed Saving Product Image is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Product Description is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingProductDescriptionDisplaying(),
				": Verified Missed Saving Product Description is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Product Quantity is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingProductQuantityDisplaying(),
				": Verified Missed Saving Product Quantity is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Purchase From Vendor is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingPurchaseVendorDisplaying(),
				": Verified Missed Saving Purchase From Vendor is Displaying");
		
//		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Purchase Price is Displaying");
//		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingPurchasePriceDisplaying(),
//				": Verified Missed Saving Purchase Price is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving High Price Vendor is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingHighVendorDisplaying(),
				": Verified Missed Saving High Price Vendor is Displaying");
		
		
//		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving High Price is Displaying");
//		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingHighPriceDisplaying(),
//				": Verified Missed Saving High Price is Displaying");

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Total is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingProductTotalDisplaying(),
				": Verified Missed Saving Total is Displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	

	@Test(priority = 8)
	public void TC_ID_281_VerifyUserIsAbleToSeeSavingOrderInformationFromSavingSection() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
	
		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		
		Waits.wait3s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Expand</b> Icon");
		rebatesPsiRebatesPage.clickOnPSISavingExpandButton();
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Product Image is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingProductImageDisplaying(),
				": Verified on Rebates Saving Product Image is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Product Description is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingProductDescriptionDisplaying(),
				": Verified on Rebates Saving Product Description is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Product Quantity is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingProductQuantityDisplaying(),
				": Verified on Rebates Saving Product Quantity is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Purchase From Vendor is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingPurchaseVendorDisplaying(),
				": Verified on Rebates Saving Purchase From Vendor is Displaying");
		
//		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Purchase Price is Displaying");
//		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingPurchasePriceDisplaying(),
//				": Verified on Rebates Saving Purchase Price is Displaying");
		
		
		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving High Price Vendor is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingHighVendorDisplaying(),
				": Verified on Rebates Saving High Price Vendor is Displaying");
		
		
//		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving High Price is Displaying");
//		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingHighPriceDisplaying(),
//				": Verified on Rebates Saving High Price is Displaying");

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify on Rebates Saving Total is Displaying");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isRebateSavingProductTotalDisplaying(),
				": Verified on Rebates Saving Total is Displaying");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	 @Test(priority = 11)
	public void TC_ID_286_VerifyUserIsAbleToSaveTheNoteInMissedSavingSection() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
		String Note = "missed demo note";

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

		rebatesPsiRebatesPage.scrollToMissedSavingSection();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Note</b> Button");
		rebatesPsiRebatesPage.clickOnMissedSavingNoteBtn();

		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Note : <b>" + Note + "</b>");
		rebatesPsiRebatesPage.enterMissedSavingNote(Note);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Note Save</b> Button");
		rebatesPsiRebatesPage.clickOnMissedSavingNoteSaveBtn();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 12)
	public void TC_ID_287_VerifyUserIsAbleToSeeSaveIconChangeColorSavingTheNote() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
		
		String Note = "missed demo note";


		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();

	
		
		rebatesPsiRebatesPage.scrollToMissedSavingSection();
	
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Note</b> Button");
		rebatesPsiRebatesPage.clickOnMissedSavingNoteBtn();
		
		waitfor3sec();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Note : <b>" + Note + "</b>");
		rebatesPsiRebatesPage.enterMissedSavingNote(Note);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Note Save</b> Button");
		rebatesPsiRebatesPage.clickOnMissedSavingNoteSaveBtn();
	


		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Save Icon Change Color");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isSaveNoteSuccessfully(),
				": Verified Save Icon Changed the color");
		


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 13)
	public void TC_ID_288_VerifyUserIsAbleExpandAndContractMissedSavingSection() throws InterruptedException {
		login();

	
		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
		

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to <b>Missed Saving</b> Section");
		rebatesPsiRebatesPage.scrollToMissedSavingSection();
		
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Expand</b> Icon");
		rebatesPsiRebatesPage.clickOnMissedSavingExpandButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Expand</b> Icon Again");
		rebatesPsiRebatesPage.clickOnMissedSavingExpandButton();

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify Missed Saving Section is Contracted");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isMissedSavingExpandedSectionContracted(),
				": Verified Missed Saving Section is Contracted");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 14)
	public void TC_ID_290_VerifyUserIsAbleExpandAndContractSavingSection() throws InterruptedException {
		login();

		RebatesPsiRebatesPage rebatesPsiRebatesPage = new RebatesPsiRebatesPage();

		int step = 5;
	

		Waits.wait3s();
		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Rewards' in navigation and Click On <b>PSIVet Saving</b> option");
		rebatesPsiRebatesPage.hoverRewardsAndClickPSIVetSavings();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Scroll to <b>PSI Saving</b> Section");
		rebatesPsiRebatesPage.scrollToPSISavingSection();
		
		waitfor3sec();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Expand</b> Icon");
		rebatesPsiRebatesPage.clickOnPSISavingExpandButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Expand</b> Icon Again");
		rebatesPsiRebatesPage.clickOnPSISavingExpandButton();

		ErrorCollector.extentLogInfo("<b> Step " + (++step)+ " : Verify PSI Saving Section is Contracted");
		ErrorCollector.verifyTrue(rebatesPsiRebatesPage.isPSISavingExpandedSectionContracted(),
				": Verified PSI Saving Section is Contracted");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	





	
}
