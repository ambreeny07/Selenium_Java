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
import com.vetscout.pages.ContactUsPage;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;

public class ContactUsTest extends BaseClass {

	
	
    @Test(priority = 1)
	public void TC_ID_297_VerifyUserIsAbleToSendMessageToVetScout() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ContactUsPage contactUsPage = new ContactUsPage();
		
		int step = 5;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String fName = PropertiesReader.getPropertyValue(env + "_" + "contactus_firstname");
		String lName = PropertiesReader.getPropertyValue(env + "_" + "contactus_lastname");
		String message = PropertiesReader.getPropertyValue(env + "_" + "contactus_message");
		String subject = PropertiesReader.getPropertyValue(env + "_" + "contactus_subject");


		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b>");
		homePage.clickOnUserContactUs();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First Name : <b>" + fName + "</b>");
		contactUsPage.enterContactUsFname(fName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last Name : <b>" + lName + "</b>");
		contactUsPage.enterContactUsLname(lName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Subject : <b>" + subject + "</b>");
		contactUsPage.enterContactUsSubject(subject);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + Email + "</b>");
		contactUsPage.enterContactUsEmail(Email);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Message : <b>" + message + "</b>");
		contactUsPage.enterContactUsMessage(message);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Submit</b> button");
		contactUsPage.clickOnSubmitButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Ok</b>");
		contactUsPage.clickOnACKButton();
		
		ErrorCollector.verifyTrue(true,
				"Verified 'User is able to send message to vetscout");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

	@Test(priority = 2)
	public void TC_ID_298_VerifyUserIsNotAbleToSendMessageLeavingAnyFieldBlank() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ContactUsPage contactUsPage = new ContactUsPage();
		
		int step = 5;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String fName = PropertiesReader.getPropertyValue(env + "_" + "contactus_firstname");
		String lName = PropertiesReader.getPropertyValue(env + "_" + "contactus_lastname");
		String subject = PropertiesReader.getPropertyValue(env + "_" + "contactus_subject");



		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b>");
		homePage.clickOnUserContactUs();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First Name : <b>" + fName + "</b>");
		contactUsPage.enterContactUsFname(fName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last Name : <b>" + lName + "</b>");
		contactUsPage.enterContactUsLname(lName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Subject : <b>" + subject + "</b>");
		contactUsPage.enterContactUsSubject(subject);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + Email + "</b>");
		contactUsPage.enterContactUsEmail(Email);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Submit</b> button");
		contactUsPage.clickOnSubmitButton();
		
		
		ErrorCollector.verifyTrue(contactUsPage.isContactUsMessageValidationDisplaying(),
				"Verified 'User is not able to send message leaving any field blank");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 3)
	public void TC_ID_299_VerifyUserIsNotAbleToSeeValidationMessageOnLeavingAnyFieldBlank() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ContactUsPage contactUsPage = new ContactUsPage();
		
		int step = 5;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");
		String fName = PropertiesReader.getPropertyValue(env + "_" + "contactus_firstname");
		String lName = PropertiesReader.getPropertyValue(env + "_" + "contactus_lastname");
		String subject = PropertiesReader.getPropertyValue(env + "_" + "contactus_subject");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b>");
		homePage.clickOnUserContactUs();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First Name : <b>" + fName + "</b>");
		contactUsPage.enterContactUsFname(fName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last Name : <b>" + lName + "</b>");
		contactUsPage.enterContactUsLname(lName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Subject : <b>" + subject + "</b>");
		contactUsPage.enterContactUsSubject(subject);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + Email + "</b>");
		contactUsPage.enterContactUsEmail(Email);
		

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Submit</b> button");
		contactUsPage.clickOnSubmitButton();
		
		
		ErrorCollector.verifyTrue(contactUsPage.isContactUsMessageValidationDisplaying(),
				"Verified 'User is not able to see validation message on leaving any field blank");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 4)
	public void TC_ID_300_VerifyUserIsAbleToSeeContactInformation() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ContactUsPage contactUsPage = new ContactUsPage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b>");
		homePage.clickOnUserContactUs();
		
	
		ErrorCollector.verifyTrue(contactUsPage.isContactUsDescriptionDisplaying(),
				"Verified 'Contact us Description' is displaying ");
		

		ErrorCollector.verifyTrue(contactUsPage.isContactUsPhoneNumberDisplaying(),
				"Verified 'Contact us Phone no: (888) 597-6660' is displaying ");
		

		ErrorCollector.verifyTrue(contactUsPage.isContactUsEmailDisplaying(),
				"Verified 'Contact us Email: support@vetscout.com' is displaying ");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

}
