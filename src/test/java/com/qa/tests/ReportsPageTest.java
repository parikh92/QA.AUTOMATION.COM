package com.qa.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class ReportsPageTest extends BaseTest {
	@Test
	public void reportspage()
	{
		LoginPage.enterUsername("admin");
		LoginPage.enterPassword("manager");
		LoginPage.clickLogin();
		ReportsPage.click();
		ReportsPage.newreport();
		ReportsPage.configurereport();
		ReportsPage.generatehtml();
		ReportsPage.addtodasgbord();
		ReportsPage.enterreportname("KESHA");
		ReportsPage.save();
		Helper.fn_Sleep();
		enterTimePage.clickLogout();
		
	}

}
