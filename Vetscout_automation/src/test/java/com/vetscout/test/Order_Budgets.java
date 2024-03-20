package com.vetscout.test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.vetscout.base.BaseClass;
import com.vetscout.base.PropertiesReader;
import com.vetscout.errorCollectors.ErrorCollector;
import com.vetscout.pages.HomePage;
import com.vetscout.pages.LoginPage;
import com.vetscout.pages.OrdersPage;
import com.vetscout.pages.Partners_And_BudgetsPage;
import com.vetscout.pages.ProductsPage;
import com.vetscout.pages.PromotionsPage;
import com.vetscout.utilities.Waits;

public class Order_Budgets extends BaseClass  {

	@Test(priority = 26)
	public void TC_260_VerifyUserIsAbleToSeeBudgetPage() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage budgets = new Partners_And_BudgetsPage();
		int step = 5;
		
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_260 Verify user is able to see budget page from the orders tab </ b>");

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>Budgets</b> option");
		homePage.hoverOrdersAndClickByBudget();
		Waits.wait6s();


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Budgets' Page heading is displaying");
		ErrorCollector.verifyTrue(homePage.isOrdersPageByBudgetPageTitleDisplaying(),
				"Verified 'Partners'Page heading is displaying");

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_261 Verify user is able to select budget span from the budgets page </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'WEEKLY' tab is clickable");
		ErrorCollector.verifyTrue(budgets.isBtnWeeklyClickable(),
				"Verified 'WEEKLY' tab is clickable");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'MONTHLY' tab is clickable");
		ErrorCollector.verifyTrue(budgets.isBudgetTabClickable("MONTHLY"),
				"Verified 'MONTHLY' tab is clickable");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'QUARTERLY' tab is clickable");
		ErrorCollector.verifyTrue(budgets.isBudgetTabClickable("QUARTERLY"),
				"Verified 'QUARTERLY' tab is clickable");
		

		
		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_262 Verify user is able to see weekly budget data </ b>");
		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_266 Verify user is able to see 'Add budget' option on selected span </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see weekly budget data after clicking 'WEEKLY' tab");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>WEEKLY</b> Tab");
		budgets.clickOnWeeklyTab();
		Waits.wait3s();

		ErrorCollector.verifyTrue(budgets.isbudgetsRowDisplaying(),
				"Verified user is able to see weekly budget data after clicking 'WEEKLY' tab");

		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : TC-266 Verify user is able to see 'ADD WEEKLY BUDGET' option when WEEKLY span is selected</ b>");
		ErrorCollector.verifyTrue(budgets.isAddBudgetDisplaying("WEEKLY"),
				"Verified user is able to see 'ADD WEEKLY BUDGET' option when WEEKLY span is selected");

		
		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_263 Verify user is able to see MONTHLY budget data </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see weekly budget data after clicking 'MONTHLY' tab");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>MONTHLY</b> Tab");
		budgets.clickOnBudgetsRangeTab("MONTHLY");
		Waits.wait3s();

		ErrorCollector.verifyTrue(budgets.isbudgetsRowDisplaying(),
				"Verified user is able to see MONTHLY budget data after clicking 'MONTHLY' tab");

		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : TC-266 Verify user is able to see 'ADD MONTHLY BUDGET' option when MONTHLY span is selected</ b>");
		ErrorCollector.verifyTrue(budgets.isAddBudgetDisplaying("MONTHLY"),
				"Verified user is able to see 'ADD MONTHLY BUDGET' option when MONTHLY span is selected");

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_264 Verify user is able to see QUARTERLY budget data </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see weekly budget data after clicking 'QUARTERLY' tab");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>QUARTERLY</b> Tab");
		budgets.clickOnBudgetsRangeTab("QUARTERLY");
		Waits.wait3s();

		ErrorCollector.verifyTrue(budgets.isbudgetsRowDisplaying(),
				"Verified user is able to see weekly budget data after clicking 'QUARTERLY' tab");

		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : TC-266 Verify user is able to see 'ADD QUARTERLY BUDGET' option when QUARTERLY span is selected</ b>");
		ErrorCollector.verifyTrue(budgets.isAddBudgetDisplaying("QUARTERLY"),
				"Verified user is able to see 'ADD QUARTERLY BUDGET' option when QUARTERLY span is selected");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 27)
	public void TC_265_VerifyUserIsAbleToSeeAllInformationAboutBudgetSpanSelected() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage budgets = new Partners_And_BudgetsPage();
		int step = 5;
		
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>Budgets</b> option");
		homePage.hoverOrdersAndClickByBudget();
		Waits.wait6s();

		
		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_265 Verify user is able to see all information about the budget span selected</b>");

		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : Verify user is able to see weekly budget data </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>WEEKLY</b> Tab");
		budgets.clickOnWeeklyTab();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Time Period' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Time Period"),
				"Verified Column heading with text 'Time Period' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Budget"),
				"Verified Column heading with text 'Budget' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Spend' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Spend"),
				"Verified Column heading with text 'Spend' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Remaining' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Remaining"),
				"Verified Column heading with text 'Remaining' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text '% of Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("% of Budget"),
				"Verified Column heading with text '% of Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Spend vs. Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Spend vs. Budget"),
				"Verified Column heading with text 'Spend vs. Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Action' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Action"),
				"Verified Column heading with text 'Action' is displaying");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify '>' sign is displaying in column data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(1),
				"Verified '>' sign is displaying in column data");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Time Period' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(2),
				"Verified Column data with table heading 'Time Period' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(3),
				"Verified Column data with table heading 'Budget' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Spend' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(4),
				"Verified Column data with table heading 'Spend' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Remaining' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(5),
				"Verified Column data with table heading 'Remaining' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify '% of Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(6),
				"Verified Column data with table heading '% of Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Spend vs. Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(7),
				"Verified Column data with table heading 'Spend vs. Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(8),
				"Verified Column data with table heading 'Action' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying Edit Icon");
		ErrorCollector.verifyTrue(budgets.isActionColumnValueDisplaying(1),
				"Verified 'Action' column is displaying Edit Icon");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying Delete icon");
		ErrorCollector.verifyTrue(budgets.isActionColumnValueDisplaying(2),
				"Verified 'Action' column is displaying Delete icon");


		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : Verify user is able to see MONTHLY budget data </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>MONTHLY</b> Tab");
		budgets.clickOnBudgetsRangeTab("MONTHLY");
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Time Period' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Time Period"),
				"Verified Column heading with text 'Time Period' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Budget"),
				"Verified Column heading with text 'Budget' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Spend' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Spend"),
				"Verified Column heading with text 'Spend' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Remaining' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Remaining"),
				"Verified Column heading with text 'Remaining' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text '% of Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("% of Budget"),
				"Verified Column heading with text '% of Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Spend vs. Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Spend vs. Budget"),
				"Verified Column heading with text 'Spend vs. Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Action' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Action"),
				"Verified Column heading with text 'Action' is displaying");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify '>' sign is displaying in column data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(1),
				"Verified '>' sign is displaying in column data");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Time Period' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(2),
				"Verified Column data with table heading 'Time Period' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(3),
				"Verified Column data with table heading 'Budget' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Spend' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(4),
				"Verified Column data with table heading 'Spend' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Remaining' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(5),
				"Verified Column data with table heading 'Remaining' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify '% of Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(6),
				"Verified Column data with table heading '% of Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Spend vs. Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(7),
				"Verified Column data with table heading 'Spend vs. Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(8),
				"Verified Column data with table heading 'Action' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying Edit Icon");
		ErrorCollector.verifyTrue(budgets.isActionColumnValueDisplaying(1),
				"Verified 'Action' column is displaying Edit Icon");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying Delete icon");
		ErrorCollector.verifyTrue(budgets.isActionColumnValueDisplaying(2),
				"Verified 'Action' column is displaying Delete icon");

		ErrorCollector.extentLogInfo("<b> Step " + (++step) + " : Verify user is able to see QUATERLY budget data </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>QUATERLY</b> Tab");
		budgets.clickOnBudgetsRangeTab("QUARTERLY");
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Time Period' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Time Period"),
				"Verified Column heading with text 'Time Period' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Budget"),
				"Verified Column heading with text 'Budget' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Spend' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Spend"),
				"Verified Column heading with text 'Spend' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Remaining' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Remaining"),
				"Verified Column heading with text 'Remaining' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text '% of Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("% of Budget"),
				"Verified Column heading with text '% of Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Spend vs. Budget' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Spend vs. Budget"),
				"Verified Column heading with text 'Spend vs. Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify Column heading with text 'Action' is displaying");
		ErrorCollector.verifyTrue(budgets.isColumnNameDisplaying("Action"),
				"Verified Column heading with text 'Action' is displaying");
		

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify '>' sign is displaying in column data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(1),
				"Verified '>' sign is displaying in column data");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Time Period' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(2),
				"Verified Column data with table heading 'Time Period' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(3),
				"Verified Column data with table heading 'Budget' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Spend' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(4),
				"Verified Column data with table heading 'Spend' is displaying");

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Remaining' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(5),
				"Verified Column data with table heading 'Remaining' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify '% of Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(6),
				"Verified Column data with table heading '% of Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Spend vs. Budget' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(7),
				"Verified Column data with table heading 'Spend vs. Budget' is displaying");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying data");
		ErrorCollector.verifyTrue(budgets.isColumnValueDisplaying(8),
				"Verified Column data with table heading 'Action' is displaying");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying Edit Icon");
		ErrorCollector.verifyTrue(budgets.isActionColumnValueDisplaying(1),
				"Verified 'Action' column is displaying Edit Icon");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify 'Action' column is displaying Delete icon");
		ErrorCollector.verifyTrue(budgets.isActionColumnValueDisplaying(2),
				"Verified 'Action' column is displaying Delete icon");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 28)
	public void TC_295_VerifyUserIsAbleToLogout() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		int step = 5;
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_294 Verify user is able to see all announcements from the navigation panel </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Message</b> icon");
		homePage.clickOnNavigationMessageIcon();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see all announcements from the navigation panel");
		ErrorCollector.verifyTrue(homePage.isAnnouncementsPageTitleDisplaying(),
				"Verified user is able to see all announcements from the navigation panel");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see announcements section from the navigation panel");
		ErrorCollector.verifyTrue(homePage.isAnnouncementSectionDisplaying(),
				"Verified user is able to see announcements section in announcements page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home</b> button");
		homePage.clickOnNavigationHomeButton();
		
		
		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_296 Verify user is able to see the contact us page </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b> icon");
		homePage.clickOnProfileIcon();

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Contact Us</b> icon");
		homePage.clickOnUserContactUs();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see the contact us page");
		ErrorCollector.verifyTrue(homePage.isContactUsHeadingDisplaying(),
				"Verified user is able to see the contact us page");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Home</b> button");
		homePage.clickOnNavigationHomeButton();

		ErrorCollector.extentLogInfo("<b style=\"color:green;\"> Step " + (++step) + " : TC_295 Verify user is able to see logout from the site </ b>");

		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Profile</b> icon");
		homePage.clickOnProfileIcon();

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Logout</b> icon");
		homePage.clickOnLogoutBtn();
		Waits.wait3s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify user is able to see logged out of the site");
		ErrorCollector.verifyTrue(homePage.isUserSignInHeadingDisplaying(),
				"Verified user is able to see logged out of the site");
		
		Waits.wait3s();
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 29)
	public void TC_267_VerifyUserIsAbleToAddWeeklyBudget() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage budgets = new Partners_And_BudgetsPage();
		int step = 5;
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>Budgets</b> option");
		homePage.hoverOrdersAndClickByBudget();
		Waits.wait6s();

	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>WEEKLY</b> Tab");
		budgets.clickOnWeeklyTab();
		Waits.wait3s();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add WEEKLY Budget</b> Button");
		budgets.clickOnAddWeeklyBudgetBtn();
	
		Waits.wait3s();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Week Range</b> Button");
		budgets.clickOnWeekRangeBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Today Date</b> Button");
		budgets.clickOnTodayDateBtn();
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter : Budget Amount");
		budgets.enterBudgetPrice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Checkbox</b> Display Progress");
		budgets.clickOnCheckboxBudget();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		budgets.clickOnBudgetSaveBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see entered budget on weekly budget screen");
		ErrorCollector.verifyTrue(budgets.shouldBeAbleToSeeNewChanges(),
				"Verified User is able to see entered budget on weekly budget screen");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	@Test(priority = 30)
	public void TC_268_VerifyUserIsAbleToAddMonthlyBudget() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage budgets = new Partners_And_BudgetsPage();
		int step = 5;
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>Budgets</b> option");
		homePage.hoverOrdersAndClickByBudget();
		Waits.wait6s();

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>MONTHLY</b> Tab");
		budgets.clickOnMonthlyTab();
		Waits.wait3s();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add MONTHLY Budget</b> Button");
		budgets.clickOnAddMonthlyBudgetBtn();
	
		Waits.wait3s();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Year</b> Input");
		budgets.clickOnYearlyInputBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>2023</b> Option");
		budgets.clickOnYearlyInputOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Month</b> Input");
		budgets.clickOnMonthlyInputBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>MARCH</b> Option");
		budgets.clickOnMonthlyOption();
		
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter : Budget Amount");
		budgets.enterBudgetPrice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Checkbox</b> Display Progress");
		budgets.clickOnCheckboxBudget();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		budgets.clickOnBudgetSaveBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>MONTHLY</b> Tab");
		budgets.clickOnMonthlyTab();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see entered budget on monthly budget screen");
		ErrorCollector.verifyTrue(budgets.shouldBeAbleToSeeNewChanges(),
				"Verified User is able to see entered budget on monthly budget screen");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	
	@Test(priority = 30)
	public void TC_269_VerifyUserIsAbleToAddQuaterlyBudget() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage budgets = new Partners_And_BudgetsPage();
		int step = 5;
	
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>Budgets</b> option");
		homePage.hoverOrdersAndClickByBudget();
		Waits.wait6s();

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>QUATERLY</b> Tab");
		budgets.clickOnQuaterlyTab();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Add Quaterly Budget</b> Button");
		budgets.clickOnAddQuaterlyBudgetBtn();
	
		Waits.wait3s();
	
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Year</b> Input");
		budgets.clickOnYearlyInputBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>2023</b> Option");
		budgets.clickOnYearlyInputOption();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Select Quarter</b> Input");
		budgets.clickOnQuaterInputBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Quarter 1(Jan - Mar)</b> Option");
		budgets.clickOnQuaterOption();
		
			
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Enter : Budget Amount");
		budgets.enterBudgetPrice();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Checkbox</b> Display Progress");
		budgets.clickOnCheckboxBudget();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Save</b> Button");
		budgets.clickOnBudgetSaveBtn();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>QUATERLY</b> Tab");
		budgets.clickOnQuaterlyTab();
		Waits.wait3s();
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to see entered budget on quaterly budget screen");
		ErrorCollector.verifyTrue(budgets.shouldBeAbleToSeeNewChanges(),
				"Verified User is able to see entered budget on quaterly budget screen");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
	
	@Test(priority = 31)
	public void TC_271_VerifyUserIsAbleDeleteBudget() throws InterruptedException {

		login();

		HomePage homePage = new HomePage();
		Partners_And_BudgetsPage budgets = new Partners_And_BudgetsPage();
		int step = 5;
		
		Waits.wait3s();

		ErrorCollector.extentLogInfo(
				"Step " + (++step) + " : Hover on 'Orders' in navigation and Click On <b>Budgets</b> option");
		homePage.hoverOrdersAndClickByBudget();
		Waits.wait6s();

		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>WEEKLY</b> Tab");
		budgets.clickOnWeeklyTab();
		Waits.wait3s();
		
	
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Click On <b>Delete</b> Button");
		
		ErrorCollector.extentLogInfo("Step " + (++step) + " : Verify User is able to delete budget");
		ErrorCollector.verifyTrue(budgets.deleteTheBudget(),
				"Verified User is able to able to delete budget");


		ErrorCollector.extentLogInfo("Step " + (++step) + " : Close the Browser");
		closeBrowser();
	}
	
}
