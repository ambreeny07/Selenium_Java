package com.ultimateqa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	/**
	 * Waits for 1 second using Thread.sleep().
	 */
	public static void wait1s() {
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Waits for 2 seconds using Thread.sleep().
	 */
	public static void wait2s() {
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Waits for 3 seconds using Thread.sleep().
	 */
	public static void wait3s() {
	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Waits for 4 seconds using Thread.sleep().
	 */
	public static void wait4s() {
	    try {
	        Thread.sleep(4000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Waits for 5 seconds using Thread.sleep().
	 */
	public static void wait5s() {
	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Waits for 6 seconds using Thread.sleep().
	 */
	public static void wait6s() {
	    try {
	        Thread.sleep(6000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * Waits for the specified time using Thread.sleep().
	 *
	 * @param time The time to wait in milliseconds.
	 */
	public static void waitTime(int time) {
	    try {
	        Thread.sleep(time);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}

	/**
	 * Waits for the specified time using Thread.sleep().
	 *
	 * @param time The time to wait in milliseconds.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void waitTime(int time, WebDriver driver) {
	    try {
	        Thread.sleep(time);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}

	/**
	 * Waits for an element to be clickable using WebDriverWait.
	 *
	 * @param element The WebElement to wait for.
	 * @param timeOutInSeconds The maximum time to wait for the element to be clickable.
	 * @param driver The WebDriver used for interaction.
	 */
	public void waitForElementToBeClickable(WebElement element, int timeOutInSeconds, WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Waits for an element to be visible using WebDriverWait.
	 *
	 * @param element The WebElement to wait for.
	 * @param timeoutInSeconds The maximum time to wait for the element to be visible.
	 * @param driver The WebDriver used for interaction.
	 */
	public static void waitForElementVisibility(WebElement element, int timeoutInSeconds, WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	    wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Waits for 10 seconds using Thread.sleep().
	 *
	 * @throws InterruptedException If the sleep is interrupted.
	 */
	public static void waitfor10sec() throws InterruptedException {
	    Thread.sleep(10000);
	}

	/**
	 * Waits for 10 minutes using Thread.sleep().
	 *
	 * @throws InterruptedException If the sleep is interrupted.
	 */
	public static void waitfor10mints() throws InterruptedException {
	    Thread.sleep(600000);
	}

	/**
	 * Waits for 3 seconds using Thread.sleep().
	 *
	 * @throws InterruptedException If the sleep is interrupted.
	 */
	public static void waitfor3sec() throws InterruptedException {
	    Thread.sleep(3000);
	}

	/**
	 * Waits for 5 seconds using Thread.sleep().
	 *
	 * @throws InterruptedException If the sleep is interrupted.
	 */
	public static void waitfor5sec() throws InterruptedException {
	    Thread.sleep(5000);
	}

	/**
	 * Waits for 1 second using Thread.sleep().
	 *
	 * @throws InterruptedException If the sleep is interrupted.
	 */
	public static void waitfor1sec() throws InterruptedException {
	    Thread.sleep(1000);
	}

	/**
	 * Waits for 10 minutes using Thread.sleep().
	 *
	 * @throws InterruptedException If the sleep is interrupted.
	 */
	public void Waitfor10mints() throws InterruptedException {
	    Thread.sleep(3000);
	}
}
