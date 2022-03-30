package com.qa.tests;

import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class TasksListPage extends BaseTest {
	
	@Test(priority = 1)
	public void taskslist() 
	{
		LoginPage.enterUsername("admin");
		LoginPage.enterPassword("manager");
		LoginPage.clickLogin();
		tasklistPage.Taskclick();
		tasklistPage.AddNew();
		tasklistPage.NewCustomere();
		tasklistPage.Entername("nana");
		tasklistPage.EnterDescrip("QA");
		tasklistPage.CreateCusomer();
		Helper.fn_Sleep();
		enterTimePage.clickLogout();
	}
	
	@Test(priority = 2)
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
