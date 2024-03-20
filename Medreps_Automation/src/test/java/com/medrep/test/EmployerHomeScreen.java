package com.medrep.test;

import com.medrep.base.BaseClass;
import com.medrep.base.PropertiesReader;
import com.medrep.pages.CandidateHomeScreenPage;
import com.medrep.pages.CandidateSignUpPage;
import com.medrep.pages.EmployerHomeScreenPage;
import com.medrep.pages.EmployerSignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class EmployerHomeScreen extends BaseClass {
    String tempSrc = "";

    @Test()
    public void TC_ID_21_asGuestUserVerifyHomescreenIsShowingInformationAsExpected(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateHomeScreenPage candidateHomeScreenPage;
        CandidateSignUpPage candidateSignUpPage;
        EmployerHomeScreenPage employerHomeScreenPage;

        driver = initConfiguration();
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        candidateSignUpPage = new CandidateSignUpPage(driver);
        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);

        try {

            int step = 1;

            testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified  'Logo' on Home Page'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Login' button");
            assertTrue(candidateHomeScreenPage.isLoginButton(driver),
                    "Verified 'Login' button");
            step++;

            testSteps.add("Step " + step + " : Verify 'Join Now' button");
            assertTrue(candidateHomeScreenPage.isJoinNowButton(driver),
                    "Verified 'Join Now' button");
            step++;

            testSteps.add("Step " + step + " : Verify 'Navigation bar with four' options");
            assertTrue(candidateHomeScreenPage.isNavigationBarWithFourOption(driver),
                    "Verified 'Navigation bar with four' options");
            step++;

            testSteps.add("Step " + step + " : Verify 'hiring Now On MedReps' Text and 'MedReps Logos'");
            assertTrue(candidateHomeScreenPage.ishiringNowOnMedRepsTextWithLogos(driver),
                    "Verified 'hiring Now On MedReps' Text and 'MedReps Logos'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Image Binner' Text and 'Search' button");
            assertTrue(candidateHomeScreenPage.isImageBinnerWithTextAndSearchButton(driver),
                    "Verified 'Image Binner' Text and 'Search' button");
            step++;

            testSteps.add("Step " + step + " : Verify 'The Go To Site For Medical Sales Reps' Text and three cards");
            assertTrue(candidateHomeScreenPage.isTheGoToSiteForMedicalSalesRepsTextWith3Card(driver),
                    "Verified 'The Go To Site For Medical Sales Reps' Text and three cards");
            step++;

            testSteps.add("Step " + step + " : Verify 'Section Along An Image' and 'Search Jobs' button");
            assertTrue(candidateHomeScreenPage.isSectionAlongAnImageAndSearchJobsButton(driver),
                    "Verified 'Section Along An Image' and 'Search Jobs' button");
            step++;

            testSteps.add("Step " + step + " : Verify 'Become An Member Section' and 'Join Now' button");
            assertTrue(candidateHomeScreenPage.isBecomeAnMemberSectionWithJoinNowButton(driver),
                    "Verified 'Become An Member Section' and 'Join Now' button");
            step++;

            testSteps.add("Step " + step + " : Verify 'copy right' text below the footer");
            assertTrue(candidateHomeScreenPage.isCopyrightTextBelowTheFooter(driver),
                    "Verified 'copy right' text below the footer");
            step++;

            testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_21_asGuestUserVerifyHomescreenIsShowingInformationAsExpected",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: TC_ID_21_asGuestUserVerifyHomescreenIsShowingInformationAsExpected"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_21_asGuestUserVerifyHomescreenIsShowingInformationAsExpected",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: TC_ID_21_asGuestUserVerifyHomescreenIsShowingInformationAsExpected"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_21_asGuestUserVerifyHomescreenIsShowingInformationAsExpected",
                    testSteps, driver);
            assertTrue(false);
        }



    }

    @Test
    public void TC_ID_22_AsAGuestUserVerifySearchfieldIsWorkingFine(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateHomeScreenPage candidateHomeScreenPage;
        EmployerSignUpPage employerSignUpPage;
        EmployerHomeScreenPage employerHomeScreenPage;

        driver = initConfiguration();
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        employerSignUpPage = new EmployerSignUpPage(driver);
        employerHomeScreenPage = new EmployerHomeScreenPage(driver);

        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);

        try {
            int step = 1;
            testSteps.add("Step"+step+": Verify user is redirected to 'Homepage'");
            assertTrue(employerSignUpPage.isMedrepLogoDisplay(driver),"Verified that user is redirected to 'Homepage'");
            step++;

            String searchTerm = "Business Development";

            testSteps.add("Step"+step+": Enter the keyword in search field : "+searchTerm);
            employerHomeScreenPage.enterValueInSearchBox(driver);
            step++;

            testSteps.add("Step"+step+": Click on Search Button");
            employerHomeScreenPage.searchJob(driver);
            step++;

            testSteps.add("Step"+step+": Verify search results are related to search term :"+searchTerm);
            assertTrue(employerHomeScreenPage.verifySearchResults(driver).equals(searchTerm));

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_22_AsAGuestUserVerifySearchfieldIsWorkingFine",
                    testSteps, driver);


        }catch (Exception e){
            testSteps.add(
                    "Failed: TC_ID_22_AsAGuestUserVerifySearchfieldIsWorkingFine"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_22_AsAGuestUserVerifySearchfieldIsWorkingFine",
                    testSteps, driver);
            assertTrue(false);
        }catch (Error e){
            testSteps
                    .add("Failed: TC_ID_22_AsAGuestUserVerifySearchfieldIsWorkingFine"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_22_AsAGuestUserVerifySearchfieldIsWorkingFine",
                    testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_23_asAGuestUserVerifyTheJoinNowButtonIsFunctionalOnTheSliderInHomepage(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateHomeScreenPage candidateHomeScreenPage;
        CandidateSignUpPage candidateSignUpPage;
        EmployerSignUpPage employerSignUpPage;
        EmployerHomeScreenPage employerHomeScreenPage;

        driver = initConfiguration();
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        employerSignUpPage = new EmployerSignUpPage(driver);
        employerHomeScreenPage = new EmployerHomeScreenPage(driver);
        candidateSignUpPage = new CandidateSignUpPage(driver);

        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);

        try {

            int step = 1;

            testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified  'Logo' on Home Page'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Login' button");
            assertTrue(candidateHomeScreenPage.isLoginButton(driver),
                    "Verified 'Login' button");
            step++;

            testSteps.add("Step " + step + " : Verify 'Join Now' button");
            assertTrue(candidateHomeScreenPage.isJoinNowButton(driver),
                    "Verified 'Join Now' button");
            step++;

            testSteps.add("Step " + step + " : Click on 'Join Now' button");
            candidateSignUpPage.clickOnJoinNowButton(driver);
            step++;

            testSteps.add("Step " + step + " : Verify 'Register For A MedReps Membership' Popup is displaying");
            assertTrue(candidateHomeScreenPage.isRegisterForAMedRepsMembershipPopup(driver),
                    "Verified 'Register For A MedReps Membership' Popup is displayed");
            step++;

            testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_23_asAGuestUserVerifyTheJoinNowButtonIsFunctionalOnTheSliderInHomepage",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: TC_ID_23_asAGuestUserVerifyTheJoinNowButtonIsFunctionalOnTheSliderInHomepage"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_23_asAGuestUserVerifyTheJoinNowButtonIsFunctionalOnTheSliderInHomepage",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: TC_ID_23_asAGuestUserVerifyTheJoinNowButtonIsFunctionalOnTheSliderInHomepage"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_23_asAGuestUserVerifyTheJoinNowButtonIsFunctionalOnTheSliderInHomepage",
                    testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_24_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomepage(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateSignUpPage candidateSignUpPage;
        CandidateHomeScreenPage candidateHomeScreenPage;
        EmployerSignUpPage employerSignUpPage;

        driver = initConfiguration();
        candidateSignUpPage = new CandidateSignUpPage(driver);
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        employerSignUpPage = new EmployerSignUpPage(driver);
        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
        String cardNumber = dataArr1[0][0].toString();
        String cardExpiryDate = dataArr1[0][1].toString();
        String cardCvc = dataArr1[0][2].toString();
        String nameOnCard = dataArr1[0][3].toString();

        try {

            int step = 1;

            testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified  'Logo' on Home Page'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Login' button");
            assertTrue(candidateHomeScreenPage.isLoginButton(driver),
                    "Verified 'Login' button");
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide One' button");
            candidateHomeScreenPage.clickOnGoToSlideOne(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
            candidateHomeScreenPage.clickOnSlideJoinNowButton("5",driver);


//            testSteps.add("Step"+step+": Click on click here hyperlink");
//            employerSignUpPage.clickHereButton(driver);
//            step++;


            testSteps.add("Step " + step + " : Check on 'Monthly' check box");
            candidateSignUpPage.checkEveryMonthCheckBox(driver);
            step++;

            String firstName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
            candidateSignUpPage.enterFirstName(firstName, driver);
            step++;

            String lastName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
            candidateSignUpPage.enterLastName(lastName, driver);
            step++;

            String email = getUniqueEmailId("Test3", driver);
            createdUsers.add(email);
            testSteps.add("Step " + step + ": Enter Email : " + email);
            candidateSignUpPage.enterEmail(email, driver);
            step++;

            testSteps.add("Step " + step + ": Enter Confirm Email  : " + email);
            candidateSignUpPage.enterConfirmEmail(email, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Password':" + password);
            candidateSignUpPage.enterPassword(password, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Confirm Password':" + password);
            candidateSignUpPage.enterConfirmPassword(password, driver);
            step++;

            try {
                testSteps.add("Step " + step + " : Check 'Marketing Preferences' check box");
                candidateSignUpPage.checkMarketingPreferencesCheckBox(driver);
                step++;}catch (Exception e) {
                // TODO: handle exception
            }

            testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
            candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Register' button");
            candidateSignUpPage.clickOnRegisterButton(driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
            candidateSignUpPage.enterCardNumber(cardNumber, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
            candidateSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
            candidateSignUpPage.enterCardCvcNumber(cardCvc, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
            candidateSignUpPage.enterNameOnCard(nameOnCard, driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
            candidateSignUpPage.clickOnCountryDropDown(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
            candidateSignUpPage.clickOnPakistanOption(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pay' button.");
            candidateSignUpPage.clickOnPayButton(driver);
            step++;

            testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified user  is redirected to the'Home Page'");
            step++;


            testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_24_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomepage",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: TC_ID_24_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomepage"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_24_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: TC_ID_24_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomepage"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_24_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider1SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_25_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomepage(){
        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateSignUpPage candidateSignUpPage;
        CandidateHomeScreenPage candidateHomeScreenPage;

        driver = initConfiguration();
        candidateSignUpPage = new CandidateSignUpPage(driver);
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
        String cardNumber = dataArr1[0][0].toString();
        String cardExpiryDate = dataArr1[0][1].toString();
        String cardCvc = dataArr1[0][2].toString();
        String nameOnCard = dataArr1[0][3].toString();

        try {

            int step = 1;

            testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified  'Logo' on Home Page'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Login' button");
            assertTrue(candidateHomeScreenPage.isLoginButton(driver),
                    "Verified 'Login' button");
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Two' button");
            candidateHomeScreenPage.clickOnGoToSlideTwo(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
            candidateHomeScreenPage.clickOnSlideJoinNowButton("6",driver);

            testSteps.add("Step " + step + " : Check on 'Monthly' check box");
            candidateSignUpPage.checkEveryMonthCheckBox(driver);
            step++;

            String firstName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
            candidateSignUpPage.enterFirstName(firstName, driver);
            step++;

            String lastName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
            candidateSignUpPage.enterLastName(lastName, driver);
            step++;

            String email = getUniqueEmailId("Test3", driver);
            createdUsers.add(email);
            testSteps.add("Step " + step + ": Enter Email : " + email);
            candidateSignUpPage.enterEmail(email, driver);
            step++;

            testSteps.add("Step " + step + ": Enter Confirm Email  : " + email);
            candidateSignUpPage.enterConfirmEmail(email, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Password':" + password);
            candidateSignUpPage.enterPassword(password, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Confirm Password':" + password);
            candidateSignUpPage.enterConfirmPassword(password, driver);
            step++;

            try {
                testSteps.add("Step " + step + " : Check 'Marketing Preferences' check box");
                candidateSignUpPage.checkMarketingPreferencesCheckBox(driver);
                step++;}catch (Exception e) {
                // TODO: handle exception
            }

            testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
            candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Register' button");
            candidateSignUpPage.clickOnRegisterButton(driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
            candidateSignUpPage.enterCardNumber(cardNumber, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
            candidateSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
            candidateSignUpPage.enterCardCvcNumber(cardCvc, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
            candidateSignUpPage.enterNameOnCard(nameOnCard, driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
            candidateSignUpPage.clickOnCountryDropDown(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
            candidateSignUpPage.clickOnPakistanOption(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pay' button.");
            candidateSignUpPage.clickOnPayButton(driver);
            step++;

            testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified user  is redirected to the'Home Page'");
            step++;


            testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_25_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomepage",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: TC_ID_25_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomepage"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_25_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: TC_ID_25_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomepage"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_25_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider2SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_26_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomepage(){

        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateSignUpPage candidateSignUpPage;
        CandidateHomeScreenPage candidateHomeScreenPage;

        driver = initConfiguration();
        candidateSignUpPage = new CandidateSignUpPage(driver);
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
        String cardNumber = dataArr1[0][0].toString();
        String cardExpiryDate = dataArr1[0][1].toString();
        String cardCvc = dataArr1[0][2].toString();
        String nameOnCard = dataArr1[0][3].toString();

        try {

            int step = 1;

            testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified  'Logo' on Home Page'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Login' button");
            assertTrue(candidateHomeScreenPage.isLoginButton(driver),
                    "Verified 'Login' button");
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Three' button");
            candidateHomeScreenPage.clickOnGoToSlideThree(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
            candidateHomeScreenPage.clickOnSlideJoinNowButton("8",driver);

            testSteps.add("Step " + step + " : Check on 'Monthly' check box");
            candidateSignUpPage.checkEveryMonthCheckBox(driver);
            step++;

            String firstName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
            candidateSignUpPage.enterFirstName(firstName, driver);
            step++;

            String lastName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
            candidateSignUpPage.enterLastName(lastName, driver);
            step++;

            String email = getUniqueEmailId("Test3", driver);
            createdUsers.add(email);
            testSteps.add("Step " + step + ": Enter Email : " + email);
            candidateSignUpPage.enterEmail(email, driver);
            step++;

            testSteps.add("Step " + step + ": Enter Confirm Email  : " + email);
            candidateSignUpPage.enterConfirmEmail(email, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Password':" + password);
            candidateSignUpPage.enterPassword(password, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Confirm Password':" + password);
            candidateSignUpPage.enterConfirmPassword(password, driver);
            step++;

            try {
                testSteps.add("Step " + step + " : Check 'Marketing Preferences' check box");
                candidateSignUpPage.checkMarketingPreferencesCheckBox(driver);
                step++;}catch (Exception e) {
                // TODO: handle exception
            }

            testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
            candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Register' button");
            candidateSignUpPage.clickOnRegisterButton(driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
            candidateSignUpPage.enterCardNumber(cardNumber, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
            candidateSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
            candidateSignUpPage.enterCardCvcNumber(cardCvc, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
            candidateSignUpPage.enterNameOnCard(nameOnCard, driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
            candidateSignUpPage.clickOnCountryDropDown(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
            candidateSignUpPage.clickOnPakistanOption(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pay' button.");
            candidateSignUpPage.clickOnPayButton(driver);
            step++;

            testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified user  is redirected to the'Home Page'");
            step++;


            testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_26_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomepage",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: TC_ID_26_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomepage"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_26_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: TC_ID_26_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomepage"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_26_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider3SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        }
    }

    @Test
    public void TC_ID_27_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomepage(){

        WebDriver driver = null;
        ArrayList<String> testSteps = new ArrayList<>();
        CandidateSignUpPage candidateSignUpPage;
        CandidateHomeScreenPage candidateHomeScreenPage;

        driver = initConfiguration();
        candidateSignUpPage = new CandidateSignUpPage(driver);
        candidateHomeScreenPage = new CandidateHomeScreenPage(driver);
        navigateToURL(PropertiesReader.getPropertyValue(env + "_" + "AppURL"), driver);
        navigateToURL(memberurl, driver);
        Object[][] dataArr = getData("testData", "Password", driver);
        String password = dataArr[0][0].toString();
        Object[][] dataArr1 = getData("testData", "CardDetails", driver);
        String cardNumber = dataArr1[0][0].toString();
        String cardExpiryDate = dataArr1[0][1].toString();
        String cardCvc = dataArr1[0][2].toString();
        String nameOnCard = dataArr1[0][3].toString();

        try {

            int step = 1;

            testSteps.add("Step " + step + " : Verify 'Logo' on Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified  'Logo' on Home Page'");
            step++;

            testSteps.add("Step " + step + " : Verify 'Login' button");
            assertTrue(candidateHomeScreenPage.isLoginButton(driver),
                    "Verified 'Login' button");
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Four' button");
            candidateHomeScreenPage.clickOnGoToSlideFour(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Slide Join Now' button");
            candidateHomeScreenPage.clickOnSlideJoinNowButton("9",driver);

            testSteps.add("Step " + step + " : Check on 'Monthly' check box");
            candidateSignUpPage.checkEveryMonthCheckBox(driver);
            step++;

            String firstName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate First Name'" + firstName);
            candidateSignUpPage.enterFirstName(firstName, driver);
            step++;

            String lastName = getUniqueData("TestName3", driver);
            testSteps.add("Step " + step + " : Enter 'Candidate Last Name'" + lastName);
            candidateSignUpPage.enterLastName(lastName, driver);
            step++;

            String email = getUniqueEmailId("Test3", driver);
            createdUsers.add(email);
            testSteps.add("Step " + step + ": Enter Email : " + email);
            candidateSignUpPage.enterEmail(email, driver);
            step++;

            testSteps.add("Step " + step + ": Enter Confirm Email  : " + email);
            candidateSignUpPage.enterConfirmEmail(email, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Password':" + password);
            candidateSignUpPage.enterPassword(password, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Confirm Password':" + password);
            candidateSignUpPage.enterConfirmPassword(password, driver);
            step++;

            try {
                testSteps.add("Step " + step + " : Check 'Marketing Preferences' check box");
                candidateSignUpPage.checkMarketingPreferencesCheckBox(driver);
                step++;}catch (Exception e) {
                // TODO: handle exception
            }

            testSteps.add("Step " + step + " : Check 'I Have Read and Agree to the MedReps.com' check box");
            candidateSignUpPage.checkIHaveReadAndAgreeToTheMedRepscomCheckBox(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Register' button");
            candidateSignUpPage.clickOnRegisterButton(driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Number':" + cardNumber);
            candidateSignUpPage.enterCardNumber(cardNumber, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Expiry Date':" + cardExpiryDate);
            candidateSignUpPage.enterCardExpiryDate(cardExpiryDate, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Card Cvc Number':" + cardCvc);
            candidateSignUpPage.enterCardCvcNumber(cardCvc, driver);
            step++;

            testSteps.add("Step " + step + " : Enter 'Name on Card':" + nameOnCard);
            candidateSignUpPage.enterNameOnCard(nameOnCard, driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Country' dropdown.");
            candidateSignUpPage.clickOnCountryDropDown(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pakistan' option from country drop down list.");
            candidateSignUpPage.clickOnPakistanOption(driver);
            step++;

            testSteps.add("Step " + step + " : Click on 'Pay' button.");
            candidateSignUpPage.clickOnPayButton(driver);
            step++;

            testSteps.add("Step " + step + " : Verify user is redirected to the'Home Page'");
            assertTrue(candidateSignUpPage.isMedrepLogoDisplay(driver),
                    "Verified user  is redirected to the'Home Page'");
            step++;


            testSteps.add("Step " + step + " : Close the Browser");

            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_27_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomepage",
                    testSteps, driver);

        } catch (Exception e) {
            testSteps.add(
                    "Failed: TC_ID_27_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomepage"
                            + "<br><b>Exception:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_27_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        } catch (Error e) {
            testSteps
                    .add("Failed: TC_ID_27_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomepage"
                            + "<br><b>Error:</b><br> " + e.toString());
            tempSrc = getScreenshotPath();
            testSteps.add(tempSrc);
            captureCapture(driver, tempSrc);
            AddTest_IntoReport("TC_ID_27_asAGuestUserVerifyThatTheEmployerUserIsAbleToRegisterHimHerselfWithTheJoinNowButtonInTheSlider4SectionOnTheHomepage",
                    testSteps, driver);
            assertTrue(false);
        }
    }

}
