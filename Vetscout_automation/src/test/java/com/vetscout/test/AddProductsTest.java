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
import com.vetscout.utilities.Waits;
import com.vetscout.pages.AddProductsPage;
import com.vetscout.pages.ProductsPage;

public class AddProductsTest extends BaseClass {

	@Test(priority = 1)
	public void TC_ID_LoginSeeProductDetailsAddToCartAround100ProductsViewCart() throws InterruptedException {

		login();
		for (int a=0;a<7;a++) {
			LoginPage login = new LoginPage();
			HomePage homePage = new HomePage();
			AddProductsPage addProdcutsPage=new AddProductsPage();
			ProductsPage productsPage=new ProductsPage();
			int step = 1;
		
			int productsAddedToCart=0;
			int currentPage=1;
			Boolean keepRunning=true;
			int TARGET=100;
			
		
	
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
			ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");
			
			Waits.wait1s();
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Add To Cart Icon");
			addProdcutsPage.clickOnAddToCartIcon();
	
			Waits.wait3s();
	
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
			ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");
			
			int numberOfProductsToDelete=productsPage.getDeleteIconList();		
			for (Integer i = 0; i < numberOfProductsToDelete; i++) {
				try {
					ErrorCollector.extentLogInfo("Step " + (++step) + " : click On delete Icon Button");
					productsPage.clickOndeleteIconButton();
					
					ErrorCollector.extentLogInfo("Step " + (++step) + " : click On delete Icon Button");
					productsPage.clickOnYesRemoveButtonCartPage();
				}
				catch(Exception e){
					
				}
	
		    }
	
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover on 'Promotion' in navigation and Click On <b>General</b> option");
			homePage.hoverPromotionAndClickAllGeneralOption();
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On View Drop Downn");
			productsPage.clickOnViewDropDownn();
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Default View Drop Downn");
			productsPage.clickOnViewDropDownDefault();
			
			String descriptionOfFirstItem = null;	 
	
			int numberOfItemsOnCurrentPage=productsPage.getNumberOfAddToCart();
			while(keepRunning) {
				for (Integer i = 1; i <= numberOfItemsOnCurrentPage; i++) {
					if(productsAddedToCart==TARGET) {
						keepRunning=false;
						break;
					}
					
					try {
						Waits.wait1s();
						descriptionOfFirstItem=productsPage.getDescriptionOffirstAddToCartButtonDescription(i);			
						productsPage.clickOnFirstItemWithAddToCartButton(i);
						Waits.wait1s();
						productsPage.clickOnAddToCartButtonPopUp();
						Waits.wait1s();
						if(productsPage.isAddedToCartMessageDisplaying()) {
							ErrorCollector.extentLogInfo("Step " + (++step) + " : Product Number:"+productsAddedToCart+" added to cart");
							Waits.wait2s();
							productsPage.clickOnCloseButton();
							productsAddedToCart++;
							ErrorCollector.extentLogInfo("Step " + (++step) + " : Product Number:"+productsAddedToCart+" added to cart");
						}
						
						else{
							Waits.wait1s();
							ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Ok Button");
							productsPage.clickOnOkButton();
							Waits.wait1s();
							ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
							productsPage.clickOnCloseButton();
						}	
					}				
					catch(Exception e) {
				
						try {
							Waits.wait1s();
							if(productsPage.isCannotBeOrderedMsgDisplaying()) {
								ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
								productsPage.onlyClickOnCloseButton();							
							}
						}
						catch(Exception E){
							
						}catch(Error E){
							
						}
						Waits.wait1s();
						ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Next Page Button");
						String currentPagestr = Integer.toString(currentPage+1);
						try {
							productsPage.clickNextPageButton(currentPagestr);
						}
						catch(Exception e1) {
							ErrorCollector.extentLogInfo("Step " + (++step) + " : click On Close Button");
							productsPage.onlyClickOnCloseButton();
							productsPage.clickNextPageButton(currentPagestr);
						}
						currentPage++;
						numberOfItemsOnCurrentPage=productsPage.getNumberOfAddToCart();
					}
			    }
			}
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Add To Cart Icon");
			addProdcutsPage.clickOnAddToCartIcon();
	
			Waits.wait3s();
	
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'home Page Logo Icon' is displaying");
			ErrorCollector.verifyTrue(login.isHomePageLogoIconDisplaying(), "Verified 'home Page Logo Icon' is displaying");
			
			numberOfProductsToDelete=productsPage.getDeleteIconList();
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify "+numberOfProductsToDelete+" Items are added to cart");
			ErrorCollector.verifyTrue(numberOfProductsToDelete==TARGET, "Verified "+numberOfProductsToDelete+" Items are added to cart");
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Logout Icon");
			addProdcutsPage.clickOnLogoutIcon();
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On Logout Drop Down Option");
			addProdcutsPage.clickOnLogoutDropDownOption();
		}
		ErrorCollector.extentLogInfo("Last Step : Close the Browser");
		closeBrowser();
	}
}
