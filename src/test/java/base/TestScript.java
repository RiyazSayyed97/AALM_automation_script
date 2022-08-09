package base;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import abstracted.Report;
import pages.CreateUser;
import pages.DashBoard;
import pages.Education;
import pages.Prerequisite;
import pages.Users;
import utils.ExtentReport;

public class TestScript extends Report {
	@Test(priority = 0)
	public void prerequisite() throws IOException, InterruptedException {
		report = ExtentReport.init();
		logger = report.startTest("ALM automation");

		Prerequisite.enterUsername();
		Prerequisite.enterPassword();
		Thread.sleep(10000);
		Prerequisite.login();

	}

	@Test(priority = 1, dependsOnMethods = { "prerequisite" })
	public void TC_001() {
		DashBoard.goesToEducationPage();
	}

	@Test(priority = 2,groups="sprint 1")
	public void TC_002() {
		Education.addEducationField();
	}

	@Test(priority = 3)
	public void TC_003() {
		Education.Verify_user_name_field();
	}

	@Test(priority = 4)
	public void TC_004() {
		Education.Verify_user_name_field_with_specialchar();
	}

	@Test(priority = 5)
	public void TC_005() {
		Education.SaveButton();
	}

	@Test(priority = 6)
	public void TC_006() {
		Education.Confirmation_pop_up_SaveButton();
	}

	@Test(priority = 7, enabled = false)
	public void TC_007() {
		Education.Confirmation_pop_up_CancelButton();
	}

	@Test(priority = 8, invocationCount = 4, enabled = false)
	public void TC_008() {
		Education.addEducationField();
	}

	@Test(priority = 9, enabled = false)
	public void TC_009() {
		Education.Minus_Button();
	}

//------------Save 5Records------------------------------------------------------------
	@Test(priority = 10, enabled = false)
	public void TC_0010() {
		Education.Field_1();
		Education.Field_2();
		Education.Field_3();
		Education.Field_4();
		Education.Field_5();
		Education.SaveButton();
		Education.Confirmation_pop_up_SaveButton();
	}

	@Test(priority = 11, enabled = false)
	public void TC_0011() {
		Education.CancelAddition();

	}
	@Test(priority = 12, enabled = false)
	public void TC_0012() {
		Education.Cancel_yes_button();

	}
	@Test(priority = 13, enabled = false)
	public void TC_0013() {
		Education.Cancel_No_button();

	}

}
