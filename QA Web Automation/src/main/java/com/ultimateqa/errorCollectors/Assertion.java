package com.ultimateqa.errorCollectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ultimateqa.base.BaseClass;
import com.ultimateqa.listeners.ExtentListeners;
import com.ultimateqa.utilities.Waits;
import com.sun.mail.handlers.message_rfc822;

public class Assertion extends Waits {
	
	// Map to store verification failures for each test result
    private static Map<ITestResult, List<Throwable>> verificationFailuresMap = new HashMap<ITestResult, List<Throwable>>();

    /**
     * Asserts that a condition is true.
     *
     * @param condition The condition to assert.
     */
    public static void assertTrue(boolean condition) {
        Assert.assertTrue(condition);
    }

    /**
     * Asserts that a condition is true with a custom message.
     *
     * @param condition The condition to assert.
     * @param message   The custom message to display on failure.
     */
    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

    /**
     * Asserts that a condition is false.
     *
     * @param condition The condition to assert.
     */
    public static void assertFalse(boolean condition) {
        Assert.assertFalse(condition);
    }

    /**
     * Asserts that a condition is false with a custom message.
     *
     * @param condition The condition to assert.
     * @param message   The custom message to display on failure.
     */
    public static void assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
    }

    /**
     * Asserts that two boolean values are equal.
     *
     * @param actual   The actual boolean value.
     * @param expected The expected boolean value.
     */
    public static void assertEquals(boolean actual, boolean expected) {
        Assert.assertEquals(actual, expected);
    }

    /**
     * Asserts that two objects are equal.
     *
     * @param actual   The actual object.
     * @param expected The expected object.
     */
    public static void assertEquals(Object actual, Object expected) {
        Assert.assertEquals(actual, expected);
    }

    /**
     * Asserts that two arrays of objects are equal.
     *
     * @param actual   The actual array.
     * @param expected The expected array.
     */
    public static void assertEquals(Object[] actual, Object[] expected) {
        Assert.assertEquals(actual, expected);
    }

    /**
     * Asserts that two objects are equal with a custom message.
     *
     * @param actual   The actual object.
     * @param expected The expected object.
     * @param message  The custom message to display on failure.
     */
    public static void assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }

    // NotEqual

    /**
     * Asserts that two boolean values are not equal.
     *
     * @param actual   The actual boolean value.
     * @param expected The expected boolean value.
     */
    public static void assertNotEquals(boolean actual, boolean expected) {
        Assert.assertNotEquals(actual, expected);
    }

    /**
     * Asserts that two objects are not equal.
     *
     * @param actual   The actual object.
     * @param expected The expected object.
     */
    public static void assertNotEquals(Object actual, Object expected) {
        Assert.assertNotEquals(actual, expected);
    }

    /**
     * Asserts that two arrays of objects are not equal.
     *
     * @param actual   The actual array.
     * @param expected The expected array.
     */
    public static void assertNotEquals(Object[] actual, Object[] expected) {
        Assert.assertNotEquals(actual, expected);
    }

    /**
     * Asserts that two objects are not equal with a custom message.
     *
     * @param actual   The actual object.
     * @param expected The expected object.
     * @param message  The custom message to display on failure.
     */
    public static void assertNotEquals(Object actual, Object expected, String message) {
        Assert.assertNotEquals(actual, expected, message);
    }

    // Soft Asserts

    /**
     * Soft asserts that a condition is true.
     *
     * @param condition The condition to assert.
     */
    public static void softAssertTrue(boolean condition) {
        BaseClass.softAssert.assertTrue(condition);
    }

    /**
     * Soft asserts that a condition is true with a custom message.
     *
     * @param condition The condition to assert.
     * @param message   The custom message to display on failure.
     */
    public static void softAssertTrue(boolean condition, String message) {
        BaseClass.softAssert.assertTrue(condition, message);
    }

    /**
     * Soft asserts that a condition is false.
     *
     * @param condition The condition to assert.
     */
    public static void softAssertFalse(boolean condition) {
        BaseClass.softAssert.assertFalse(condition);
    }

    /**
     * Soft asserts that a condition is false with a custom message.
     *
     * @param condition The condition to assert.
     * @param message   The custom message to display on failure.
     */
    public static void softAssertFalse(boolean condition, String message) {
        BaseClass.softAssert.assertFalse(condition, message);
    }

    /**
     * Soft asserts that two boolean values are equal.
     *
     * @param actual   The actual boolean value.
     * @param expected The expected boolean value.
     */
    public static void softAssertEquals(boolean actual, boolean expected) {
        BaseClass.softAssert.assertEquals(actual, expected);
    }

    /**
     * Soft asserts that two objects are equal.
     *
     * @param actual   The actual object.
     * @param expected The expected object.
     */
    public static void softAssertEquals(Object actual, Object expected) {
        BaseClass.softAssert.assertEquals(actual, expected);
    }

    /**
     * Soft asserts that two arrays of objects are equal.
     *
     * @param actual   The actual array.
     * @param expected The expected array.
     */
    public static void softAssertEquals(Object[] actual, Object[] expected) {
        BaseClass.softAssert.assertEquals(actual, expected);
    }

    /**
     * Soft asserts that two objects are equal with a custom message.
     *
     * @param actual   The actual object.
     * @param expected The expected object.
     * @param message  The custom message to display on failure.
     */
    public static void softAssertEquals(Object actual, Object expected, String message) {
        BaseClass.softAssert.assertEquals(actual, expected, message);
    }

    /**
     * Fails the test with the specified message.
     *
     * @param message The custom message to display on failure.
     */
    public static void fail(String message) {
        Assert.fail(message);
    }

    /**
     * Retrieves the list of verification failures for the current test result.
     *
     * @return List of verification failures.
     */
    public static List<Throwable> getVerificationFailures() {
        List<Throwable> verificationFailures = verificationFailuresMap.get(Reporter.getCurrentTestResult());
        return verificationFailures == null ? new ArrayList<Throwable>() : verificationFailures;
    }

    /**
     * Adds a verification failure to the list for the current test result.
     *
     * @param e The Throwable representing the verification failure.
     */
    public static void addVerificationFailure(Throwable e) {
        List<Throwable> verificationFailures = getVerificationFailures();
        verificationFailuresMap.put(Reporter.getCurrentTestResult(), verificationFailures);
        verificationFailures.add(e);
    }

}
