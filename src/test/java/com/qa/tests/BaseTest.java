package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TasksList;


public class BaseTest extends DriverScript {
	LoginPage LoginPage;
	EnterTimePage enterTimePage;
	TasksList tasklistPage;
	
	
	@BeforeMethod
	public void setup()
	{
		initApplication();
		LoginPage = new LoginPage();
		enterTimePage = new EnterTimePage();
		tasklistPage = new TasksList();

		
		
	}

	@AfterMethod
	public void tearDown()
	{
		quitDriver();
	}

}
