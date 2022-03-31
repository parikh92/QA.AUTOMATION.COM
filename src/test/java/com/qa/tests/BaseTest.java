package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TasksList;
import com.acti.utils.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseTest extends DriverScript {
	LoginPage LoginPage;
	EnterTimePage enterTimePage;
	TasksList tasklistPage;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeSuite
	public void setReport() {
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./atreports/actiindex.htm");
		 report = new ExtentReports();
		 report.attachReporter(extent);

	}
	
	
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
		Helper.fn_Sleep();
		report.flush();
	}

}
