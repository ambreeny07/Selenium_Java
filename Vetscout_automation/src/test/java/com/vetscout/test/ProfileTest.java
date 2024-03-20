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
import com.vetscout.pages.ProfilePage;

public class ProfileTest extends BaseClass {

	
	
	@Test(priority = 1)
	public void TC_ID_301_VerifyUserIsAbleToSeeProfilePage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.verifyTrue(homePage.isProfilePageTitleDisplaying(),
				"Verified User is Able to see Profile Page");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 2)
	public void TC_ID_302_VerifyUserIsAbleToEditInformationFromProfilePage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();

		int step = 5;

		String Phone = "1234567890";

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Phone no : <b>" + Phone + "</b>");
		profilePage.enterProfilePhoneno(Phone);

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnSaveButton();

		ErrorCollector.verifyTrue(profilePage.isPhonenoChange(Phone),
				"Verified User is Able to Edit Information from Profile Page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
  @Test(priority = 3)
	public void TC_ID_303_VerifyUserIsAbleChangeTheProfilePicture() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
	
		
		String picName = PropertiesReader.getPropertyValue(env + "_" + "profile_image");
		String pic = System.getProperty("user.dir") + "\\src\\test\\resources\\images\\"+picName;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
	
		String currentImageUrl = profilePage.getProfileImageSrc();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Upload Image");
		profilePage.changeProfilePic(pic);
		
		waitfor5sec();
		
		
		ErrorCollector.verifyTrue(profilePage.isProfilePictureChanged(currentImageUrl),
				"Verified User is Able to change profile picture");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 4)
	public void TC_ID_304_VerifyUserIsAbleToSeePracticePage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b> ");
		homePage.clickOnuserProfilePagePracticeOption();
		
		ErrorCollector.verifyTrue(homePage.isUserProfilePracticeInformationTitleDisplaying(),
				"Verified User is Able to see Practice Page");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 5)
	public void TC_ID_305_VerifyUserIsAbleToAddNewPractice() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		String Phone = PropertiesReader.getPropertyValue(env + "_" + "practice_phone");
		String practiceEmail =  PropertiesReader.getPropertyValue(env + "_" + "practice_email");
		String Name =  PropertiesReader.getPropertyValue(env + "_" + "practice_name");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b> Menu");
		homePage.clickOnuserProfilePagePracticeOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add New</b> Button");
		profilePage.clickOnAddNew();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Name : <b>" + Name + "</b>");
		profilePage.enterPracticeName(Name);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + practiceEmail + "</b>");
		profilePage.enterPracticeEmail(practiceEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Phone : <b>" + Phone + "</b>");
		profilePage.enterPracticePhone(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice Type</b>");
		profilePage.clickOnPracticeType();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Companion</b> Type");
		profilePage.clickOnPracticeCompanion();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnPracticeSave();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 6)
	public void TC_ID_306_VerifyUserIsNotAbleToAddNewPracticeLeavingFieldBlank() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
	
		String practiceEmail =  PropertiesReader.getPropertyValue(env + "_" + "practice_email");
		String Name =  PropertiesReader.getPropertyValue(env + "_" + "practice_name");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b> Menu");
		homePage.clickOnuserProfilePagePracticeOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add New</b> Button");
		profilePage.clickOnAddNew();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Name : <b>" + Name + "</b>");
		profilePage.enterPracticeName(Name);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + practiceEmail + "</b>");
		profilePage.enterPracticeEmail(practiceEmail);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice Type</b>");
		profilePage.clickOnPracticeType();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Companion</b> Type");
		profilePage.clickOnPracticeCompanion();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnPracticeSave();
		
		ErrorCollector.verifyTrue(profilePage.isPracticePhoneValidationDisplaying(),
				"Verified 'User is not able to add practice leaving any field blank");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 7)
	public void TC_ID_307_VerifyUserIsAbleToMakeAnyPracticeActive() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b> Menu");
		homePage.clickOnuserProfilePagePracticeOption();
		
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Make Active</b> Button");
		profilePage.clickOnMakeActiveButton();
		
		profilePage.clickOnMakeActiveButton();

		
		ErrorCollector.verifyTrue(profilePage.isActiveButtonDisplaying(),
				"Verified 'User is able to make any practice active");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 8)
	public void TC_ID_308_VerifyUserIsAbleToEditAnyPractice() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;

		String Phone = PropertiesReader.getPropertyValue(env + "_" + "practice_phone");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b>");
		homePage.clickOnuserProfilePagePracticeOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Edit</b> Practice");
		profilePage.clickOnEditPracticeButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Phone no : <b>" + Phone + "</b>");
		profilePage.enterPracticePhone(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnPracticeSave();
		
		
		ErrorCollector.verifyTrue(profilePage.isPractcePhonenoChange(Phone),
				"Verified User is Able to Edit Any Practice");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	@Test(priority = 9)
	public void TC_ID_309_VerifyUserIsAbleToSeeAdditionalUsersAvailableOnTheAdditionalUsersPage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practice</b>");
		homePage.clickOnuserProfilePagePracticeOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Additional Users</b> Option");
		profilePage.clickOnLeftMenuAdditionalUsersOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Additional Users 'Email' Info is displaying");
		ErrorCollector.verifyTrue(profilePage.isEmailInfoDisplaying(),
				"Verified  Additional Users 'Email' Info is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Additional Users 'First Name' Info is displaying");
		ErrorCollector.verifyTrue(profilePage.isFirstNameInfoDisplaying(),
				"Verified  Additional Users 'First Name' Info is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Additional Users 'Last Name' Info is displaying");
		ErrorCollector.verifyTrue(profilePage.isLastNameInfoDisplaying(),
				"Verified  Additional Users 'Last Name' Info is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Additional Users 'Phone' Info is displaying");
		ErrorCollector.verifyTrue(profilePage.isPhoneInfoDisplaying(),
				"Verified  Additional Users 'Phone' Info is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Additional Users 'Active' Info is displaying");
		ErrorCollector.verifyTrue(profilePage.isActiveInfoDisplaying(),
				"Verified  Additional Users 'Active' Info is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Additional Users 'Action' Info is displaying");
		ErrorCollector.verifyTrue(profilePage.isActionInfoDisplaying(),
				"Verified  Additional Users 'Action' Info is displaying");
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 11)
	public void TC_ID_310_VerifyUserIsAbleToAddAdditionalUser() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		String Phone = PropertiesReader.getPropertyValue(env + "_" + "practice_phone");
		String Name = PropertiesReader.getPropertyValue(env + "_" + "practice_name");
		String Email_ = "demo"+System.currentTimeMillis()/2 + "@vetscout.com";
		String Password_ = PropertiesReader.getPropertyValue(env + "_" + "practice_password");

		System.out.println(Email_);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Additional Users</b> Option");
		profilePage.clickOnLeftMenuAdditionalUsersOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add</b> Button");
		profilePage.clickOnAddAdditionalUserButton();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First Name : <b>" + Name + "</b>");
		profilePage.enterEditAdditionalUserFName(Name);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last Name : <b>" + Name + "</b>");
		profilePage.enterEditAdditionalUserLName(Name);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + Email_ + "</b>");
		profilePage.enterEditAdditionalUserEmail(Email_);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Phone no : <b>" + Phone + "</b>");
		profilePage.enterEditAdditionalUserPhone(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Password : <b>" + Password_ + "</b>");
		profilePage.enterEditAdditionalUserPassword(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Confirm Password : <b>" + Password_ + "</b>");
		profilePage.enterEditAdditionalUserConfirmPassword(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnAdditionalUserSaveButton();
		
		waitfor3sec();
		
		ErrorCollector.verifyTrue(profilePage.isAdditionalUserAddConfirmationDisplaying(),
				"Verified User is Able to Add Additional User");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 11)
	public void TC_ID_311_VerifyUserIsAbleToEditInformationOfAdditionalUser() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;

		String Phone = PropertiesReader.getPropertyValue(env + "_" + "practice_phone");	
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Additional Users</b> Option");
		profilePage.clickOnLeftMenuAdditionalUsersOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Edit</b> Button");
		profilePage.clickOnEditAdditionalUserButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Phone no : <b>" + Phone + "</b>");
		profilePage.enterEditAdditionalUserPhone(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnAdditionalUserSaveButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>OK</b> Button");
		profilePage.clickOnOKEditAdditionalUserButton();
		
		ErrorCollector.verifyTrue(profilePage.isAdditionalUserPhonenoChange(Phone),
				"Verified User is Able to Edit Information of Additional User");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 12)
	public void TC_ID_312_VerifyUserIsAbleToMakeUserActiveAndDeactive() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Additional Users</b> Option");
		profilePage.clickOnLeftMenuAdditionalUsersOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Lock</b> Button");
		profilePage.clickOnLockAdditionalUserButton();	
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Yes</b> Button");
		profilePage.clickOnLockYesAdditionalUserButton();
		
		ErrorCollector.verifyTrue(profilePage.isAdditionalUserUnLockDisplaying(),
				"Verified User Unlock Icon is Displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>UnLock</b> Button");
		profilePage.clickOnUnLockAdditionalUserButton();	
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Yes</b> Button");
		profilePage.clickOnLockYesAdditionalUserButton();
		
		ErrorCollector.verifyTrue(profilePage.isAdditionalUserLockDisplaying(),
				"Verified User Lock Icon is Displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 13)
	public void TC_ID_313_VerifyUserIsAbleToSeeAddressPage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Address</b> Option");
		homePage.clickOnuserProfilePageAddressOption();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown</b>");
		profilePage.clickOnAddressSelectPractice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Pet Care</b>");
		profilePage.clickOnAddressSelectPractice2();
		
		
		ErrorCollector.verifyTrue(profilePage.isAddressSelectDropdownDisplaying(),
				"Verified 'Drop Down Select Practice' is Displaying");
		

		if(profilePage.isAddressBillingEditBtnDisplaying()) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Shipping Address is already addedd");

		}else {
		ErrorCollector.verifyTrue(profilePage.isBillingAddressAddBtnDisplaying(),
				"Verified Billing Address 'Add' Button  is Displaying");
		
		
		ErrorCollector.verifyTrue(profilePage.isShippingAddressAddBtnDisplaying(),
				"Verified Shipping Address 'Add' Button  is Displaying");
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	

	@Test(priority = 14)
	public void TC_ID_314_VerifyUserIsAbleToAddBillingAddressShippingAddress() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		String FName = PropertiesReader.getPropertyValue(env + "_" + "address_fname");
		String LName = PropertiesReader.getPropertyValue(env + "_" + "address_lname");
		String Address = PropertiesReader.getPropertyValue(env + "_" + "address_address");
		String City = PropertiesReader.getPropertyValue(env + "_" + "address_city");
		String State = PropertiesReader.getPropertyValue(env + "_" + "address_state");
		String Zipcode = PropertiesReader.getPropertyValue(env + "_" + "address_zipcode");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Address</b> Option");
		homePage.clickOnuserProfilePageAddressOption();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown</b>");
		profilePage.clickOnAddressSelectPractice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Pet Care</b>");
		profilePage.clickOnAddressSelectPractice2();
		
		if(profilePage.isAddressBillingEditBtnDisplaying()) {
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Shipping Address is already addedd");

		}else {
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add</b> Billing Address");
		profilePage.clickOnAddBillingAddress();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First Name : <b>" + FName + "</b>");
		profilePage.enterAddressFName(FName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last Name : <b>" + LName + "</b>");
		profilePage.enterAddressLName(LName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Address : <b>" + Address + "</b>");
		profilePage.enterAddress(Address);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter City : <b>" + City + "</b>");
		profilePage.enterAddressCity(City);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter State : <b>" + State + "</b>");
		profilePage.enterAddressState(State);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ZipCode : <b>" + Zipcode + "</b>");
		profilePage.enterAddressZipCode(Zipcode);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnAddressSaveBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown</b>");
		profilePage.clickOnAddressSelectPractice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Pet Care</b>");
		profilePage.clickOnAddressSelectPractice1();
		
	
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add</b> Shipping Address");
		profilePage.clickOnAddBillingAddress();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter First Name : <b>" + FName + "</b>");
		profilePage.enterAddressFName(FName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Last Name : <b>" + LName + "</b>");
		profilePage.enterAddressLName(LName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Address : <b>" + Address + "</b>");
		profilePage.enterAddress(Address);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter City : <b>" + City + "</b>");
		profilePage.enterAddressCity(City);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter State : <b>" + State + "</b>");
		profilePage.enterAddressState(State);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter ZipCode : <b>" + Zipcode + "</b>");
		profilePage.enterAddressZipCode(Zipcode);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnAddressSaveBtn();
		
		
		ErrorCollector.verifyTrue(profilePage.isAddressBillingEditBtnDisplaying(),
				"Verified User is able to add Billing Address and Shipping Address");
		}
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	 @Test(priority = 15)
	public void TC_ID_315_VerifyUserIsAbleToEditBillingAddressShippingAddress() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;

		String Address = PropertiesReader.getPropertyValue(env + "_" + "address_address");
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Address</b> Option");
		homePage.clickOnuserProfilePageAddressOption();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown</b>");
		profilePage.clickOnAddressSelectPractice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Test Practice In Demo Login</b>");
		profilePage.clickOnAddressSelectPractice1();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Edit</b> Billing Address");
		profilePage.clickOnAddressBillingEditBtn();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Address : <b>" + Address + "</b>");
		profilePage.enterAddress(Address);
		
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnAddressSaveBtn();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown</b>");
		profilePage.clickOnAddressSelectPractice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Test Practice In Demo Login</b>");
		profilePage.clickOnAddressSelectPractice1();
		
		ErrorCollector.verifyTrue(profilePage.isEditBillingAddressChange(Address),
				"Verified User is able to Edit Billing Address");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Edit</b> Shipping Address");
		profilePage.clickOnAddressShippingEditBtn();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Address : <b>" + Address + "</b>");
		profilePage.enterAddress(Address);
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		profilePage.clickOnAddressSaveBtn();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown</b>");
		profilePage.clickOnAddressSelectPractice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Option 1</b>");
		profilePage.clickOnAddressSelectPractice1();

		ErrorCollector.verifyTrue(profilePage.isEditShippingAddressChange(Address),
				"Verified User is able to Edit Shipping Address");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 16)
	public void TC_ID_316_VerifyUserIsAbleSetEmailForEachVendorToSentEmailToUser() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");

		
		int step = 5;

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Notification</b> Option");
		homePage.clickOnuserProfilePageNotificationsOption();
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Practices DropDown</b>");
		profilePage.clickOnSelectPracticeNotification();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>DropDown Option 1</b>");
		profilePage.clickOnSelectPracticeNotificationOption1();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Checkbox</b> ");
		profilePage.clickOnCheckboxNotificationEmail();
		
		waitfor3sec();
		profilePage.clickOnInputNotificationEmail();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + Email + "</b>");
		profilePage.enterEditNotificationEmail(Email);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Update</b> Button ");
		profilePage.clickOnUpdateNotificationEmail();
		

		ErrorCollector.verifyTrue(profilePage.isNotificationEmailUpdated(Email),
				"Verified User is able set Email for vendor");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 17)
	public void TC_ID_317_VerifyUserIsAbleSeeAllVendorOnVendorPage() throws InterruptedException {
			login();

			LoginPage login = new LoginPage();
			HomePage homePage = new HomePage();
			ProfilePage profilePage = new ProfilePage();
			
			int step = 5;
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
			login.clickOnUserProfileIcon();

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
			homePage.clickOnUserProfileButton();
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Vendor</b> Option");
			homePage.clickOnuserProfilePageVendorsOption();
		
			

			ErrorCollector.verifyTrue(profilePage.isVendorListDisplaying(),
					"Verified User is able see all vendor on vendor page");
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
			closeBrowser();
		}

	@Test(priority = 18)
	public void TC_ID_318_VerifyUserIsAbleSeeRewardProgramProvidedByVendor() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Reward Program</b> Option");
		homePage.hoverRewardsAndClickRewardProgram();
	
	
		ErrorCollector.verifyTrue(homePage.isUserProfileRewardsProgramPageDisplaying(),
				"Verified User is able see privacy policy page");
		
		ErrorCollector.verifyTrue(profilePage.isRewardProgramDetailDisplaying(),
				"Verified User is able see Reward program detail");
		
		ErrorCollector.verifyTrue(profilePage.isRewardProgramLinkDisplaying(),
				"Verified User is able see reward program link");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	@Test(priority = 19)
	public void TC_ID_319_VerifyUserIsAbleToAppyForRewardProgram() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");

		String Name = PropertiesReader.getPropertyValue(env + "_" + "practice_name");
		String PracticeName = PropertiesReader.getPropertyValue(env + "_" + "practice_name");
		String Phone = PropertiesReader.getPropertyValue(env + "_" + "practice_phone");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Reward Program</b> Option");
		homePage.hoverRewardsAndClickRewardProgram();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Reward Program</b> Link");
		profilePage.clickOnRewardProgramLink();
		
		
		if(profilePage.isWithdrawConsentButtonDisplaying()) {
			profilePage.clickOnWithdrawConsentButton();
			profilePage.clickOnOKEditAdditionalUserButton();

		}
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Name : <b>" + Name + "</b>");
		profilePage.enterRewardName(Name);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Practice Name : <b>" + PracticeName + "</b>");
		profilePage.enterRewardPractice(PracticeName);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Email : <b>" + Email + "</b>");
		profilePage.enterRewardEmail(Email);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter Phone : <b>" + Phone + "</b>");
		profilePage.enterRewardPhone(Phone);
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Terms and Condition</b> Checkbox");
		profilePage.clickOnRewardTermsConditionCheckbox();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Submit</b> button");
		profilePage.clickOnRewardSubmit();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Ok</b> button");
		profilePage.clickOnOKEditAdditionalUserButton();
		
		
		ErrorCollector.verifyTrue(true,
				"Verified User is able to apply for 'Reward Program'");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	
	
	@Test(priority = 20)
	public void TC_ID_320_VerifyUserIsAbleSeePrivacyPolicyPage() throws InterruptedException {
			login();

			LoginPage login = new LoginPage();
			HomePage homePage = new HomePage();
			
			int step = 5;
	
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
			login.clickOnUserProfileIcon();

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
			homePage.clickOnUserProfileButton();
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Privacy Policy</b> Option");
			homePage.clickOnuserProfilePagePrivacyPolicyOption();
		
			

			ErrorCollector.verifyTrue(homePage.isUserProfilePrivacyPolicyPageDisplaying(),
					"Verified User is able see privacy policy page");
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
			closeBrowser();
		}
	
	@Test(priority = 21)
	public void TC_ID_321_VerifyUserIsAbleSeeDifferentGroup() throws InterruptedException {
			login();

			LoginPage login = new LoginPage();
			HomePage homePage = new HomePage();
			ProfilePage profilePage = new ProfilePage();
			
			int step = 5;
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
			login.clickOnUserProfileIcon();

			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
			homePage.clickOnUserProfileButton();
			
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Groups</b> Option");
			homePage.clickOnuserProfilePageGroupsOption();
		
			
			waitfor10sec();

			ErrorCollector.verifyTrue(homePage.isUserProfileGroupsPage(),
					"Verified User is able see Groups Page");

			ErrorCollector.verifyTrue(profilePage.isGroupsImageDisplaying(),
					"Verified User is able see Vendor Name");
			
			ErrorCollector.verifyTrue(profilePage.isGroupsImageCheckBoxDisplaying(),
					"Verified User is able see Checkbox with Vendor Name");
			
			ErrorCollector.verifyTrue(profilePage.isGroupsShareMyPurchaseDisplaying(),
					"Verified User is able see 'Share My Rebate and purchasing Data'");
			
			ErrorCollector.verifyTrue(profilePage.isGroupsCheckbox2Displaying(),
					"Verified User is able see Checkbox with label 'Share My Rebate and purchasing Data'");
			
		
			ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
			closeBrowser();
		}

	@Test(priority = 22)
	public void TC_ID_322_VerifyUserIsAbleToActiveTheGroupFromGroupPage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Groups</b> Option");
		homePage.clickOnuserProfilePageGroupsOption();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Check the <b>Checkbox </b> available with vendor");
		profilePage.clickOnGroupsCheckboxActive();
		
		
		ErrorCollector.verifyTrue(profilePage.isGroupChecboxChecked(),
				"Verified User is able active the 'Group' from group page");
		
	
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 33)
	public void TC_ID_333_VerifyUserIsAbleToDeActiveTheGroupFromGroupPage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Groups</b> Option");
		homePage.clickOnuserProfilePageGroupsOption();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : UnCheck the <b>Checkbox </b> available with vendor");
		profilePage.clickOnGroupsCheckboxDeActive();
		
		
		ErrorCollector.verifyTrue(profilePage.isGroupChecboxUnChecked(),
				"Verified User is able Deactive the 'Group' from group page");
		
	
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 34)
	public void TC_ID_334_VerifyUserIsAbleToAllowGoupToSeePurchasingRebateData() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Groups</b> Option");
		homePage.clickOnuserProfilePageGroupsOption();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Check the <b>Checkbox </b> available with vendor");
		profilePage.clickOnGroupsCheckboxActive();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Check the <b>Checkbox </b> Share Purchasing Rebate Data");
		profilePage.clickOnSharePurchasingRebateDataCheckboxActive();
		
		
		ErrorCollector.verifyTrue(profilePage.isSharePurchasingRebateDataChecboxChecked(),
				"Verified User is able allow group to see 'Purchasing and Rebaate Data'");
		
	
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	@Test(priority = 35)
	public void TC_ID_335_VerifyUserIsAbleToDisAllowGoupToSeePurchasingRebateData() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		int step = 5;
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>Groups</b> Option");
		homePage.clickOnuserProfilePageGroupsOption();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Check the <b>Checkbox </b> available with vendor");
		profilePage.clickOnGroupsCheckboxActive();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Uncheck the <b>Checkbox </b> Share Purchasing Rebate Data");
		profilePage.clickOnSharePurchasingRebateDataCheckboxDeActive();
		
		
		ErrorCollector.verifyTrue(profilePage.isSharePurchasingRebateDataChecboxUnChecked(),
				"Verified User is able DisAllow group to see 'Purchasing and Rebaate Data'");
		
	
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}


	 @Test(priority = 36)
	public void TC_ID_336_VerifyUserIsAbleSeeFAQPage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();

		int step = 5;

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>FAQ</b> Option");
		homePage.clickOnuserProfilePageFAQOption();

		ErrorCollector.verifyTrue(homePage.isUserFAQPageDisplaying(), "Verified User is able see 'FAQ' Page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}




	@Test(priority = 37)
	public void TC_ID_337_VerifyUserIsAbleSeeFAQListByExpandingItems() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		
		
		int step = 5;
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>FAQ</b> Option");
		homePage.clickOnuserProfilePageFAQOption();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>FAQ Item</b>");
		profilePage.clickOnFAQItem();
		
		ErrorCollector.verifyTrue(profilePage.isFAQDescriptionDisplaying(),
				"Verified User is able see 'FAQ List' by expanding items");

	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	
	 @Test(priority = 38)
	public void TC_ID_338_VerifyUserIsAbleSubmitQueryFromFAQPage() throws InterruptedException {
		login();

		LoginPage login = new LoginPage();
		HomePage homePage = new HomePage();
		ProfilePage profilePage = new ProfilePage();
		ContactUsPage contactUsPage = new ContactUsPage();

		int step = 5;
		String Email = PropertiesReader.getPropertyValue(env + "_" + "Valid_EmailId");

		String fName = PropertiesReader.getPropertyValue(env + "_" + "contactus_firstname");
		String lName = PropertiesReader.getPropertyValue(env + "_" + "contactus_lastname");
		String message = PropertiesReader.getPropertyValue(env + "_" + "contactus_message");
		String subject = PropertiesReader.getPropertyValue(env + "_" + "contactus_subject");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Navigation Profile</b> Icon");
		login.clickOnUserProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b>");
		homePage.clickOnUserProfileButton();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On left menu <b>FAQ</b> Option");
		homePage.clickOnuserProfilePageFAQOption();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Submit Request</b> button");
		profilePage.clickOnFAQSubmitRequest();

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

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Ok</b> button");
		contactUsPage.clickOnACKButton();

		ErrorCollector.verifyTrue(true, "Verified User is able submit query from 'FAQ' Page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}

	

	
}
