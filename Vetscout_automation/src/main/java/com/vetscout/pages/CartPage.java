package com.vetscout.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vetscout.base.BaseClass;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.utilities.Waits;


public class CartPage extends BaseClass {

	@FindBy(xpath = ("(//i[contains(text(),'shopping_cart')])[1]"))
	WebElement navigationCard;
	
	@FindBy(xpath = ("(//div[contains(@class,'inner-container')])[2]"))
	WebElement cartItem;
	
	@FindBy(xpath = ("(//li[contains(@class,'cart-menu-item')])[1]"))
	WebElement cartMenuItem;
	
	@FindBy(xpath = ("(//i[contains(text(),'remove_shopping_cart')])[1]"))
	WebElement removeFromCart;
	
	
	@FindBy(xpath = ("(//span[contains(text(),'yes')])[1]"))
	WebElement removeCartConfirmation;
	
	@FindBy(xpath = ("(//span[contains(text(),'Checkout')])[1] | (//span[contains(text(),'Checkout')])[1]"))
	WebElement checkoutCart;
	
	
	
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isCartContentDisplaying() {
		Waits.wait2s();
		return isElementDisplayed(cartItem);
	}
	
	public void hoverOverNavigationCard() {
		hoverOverElement(navigationCard);
	}
	
	public void hoverOverCartMenuItem() {
		hoverOverElement(cartMenuItem);
	}
	
	public void clickOnRemoveFromCart() {
		waitForElementClickable(removeFromCart, "20");
		click(removeFromCart);
	}
	
	public void clickOnConfirmRemoveFromCart() {
		waitForElementClickable(removeCartConfirmation, "20");
		click(removeCartConfirmation);
	}
	
	public void clickOnCheckOutCart() {
		waitForElementClickable(checkoutCart, "20");
		click(checkoutCart);
	}
	
}
