package com.vetscout.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.listeners.ExtentListeners;
import com.vetscout.pages.CartPage;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;

public class CartTest extends BaseClass {

	@Test(priority = 1)
	public void TC_ID_291_VerifyUserIsAbletoSeeCartByClickingOnIt() throws InterruptedException {
		login();

		HomePage homePage = new HomePage();
		CartPage cartPage = new CartPage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Cart</b>  Button");
		homePage.clickOnNavigationCard();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Cart content' is displaying");
		ErrorCollector.verifyTrue(cartPage.isCartContentDisplaying(),
				"Verified 'Card Page Content' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 2)
	public void TC_ID_292_VerifyUserIsAbleToRemoveProductFromCart() throws InterruptedException {
		login();

		CartPage cartPage = new CartPage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover On <b>Cart</b>  Button");
		cartPage.hoverOverNavigationCard();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Hover On <b>Cart Item</b>");
		cartPage.hoverOverCartMenuItem();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Remove from Cart</b>  Button");
		cartPage.clickOnRemoveFromCart();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Yes</b>  Button");
		cartPage.clickOnConfirmRemoveFromCart();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	

}
