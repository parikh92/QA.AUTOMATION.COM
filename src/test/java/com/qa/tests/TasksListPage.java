package com.qa.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class TasksListPage extends BaseTest {
	
	@Test(priority = 1)
	public void taskslist() 
	{
		logger = report.createTest("Validate Create Customer");
		LoginPage.enterUsername("admin");
		logger.pass("entered username");
		LoginPage.enterPassword("manager");
		logger.pass("entered password");
		LoginPage.clickLogin();
		logger.pass("click login butten");
		tasklistPage.Taskclick();
		logger.pass("clicked task menu");
		tasklistPage.AddNew();
		logger.pass("clicked add new butten");
		tasklistPage.NewCustomere();
		logger.pass("clicked new customer");
		tasklistPage.Entername("nana");
		logger.pass("entered coustomer name");
		tasklistPage.EnterDescrip("QA");
		logger.pass("entered coustomer descrip");
		tasklistPage.CreateCusomer();
		logger.pass("click creat coustomer");
		Helper.fn_Sleep();
		enterTimePage.clickLogout();
		logger.pass("click log out");
	}
	
	//@Test(priority = 2)
	public void testDeleteCustomer()
	{
		LoginPage.enterUsername("admin");
		LoginPage.enterPassword("manager");
		LoginPage.clickLogin();
		tasklistPage.Taskclick();
		tasklistPage.search("nana");
		tasklistPage.name();
		tasklistPage.edditbutten();
		tasklistPage.actionbutten();
		tasklistPage.deletebutten();
		tasklistPage.deletepermanetl();
		Helper.fn_Sleep();
		enterTimePage.clickLogout();
	}

}
