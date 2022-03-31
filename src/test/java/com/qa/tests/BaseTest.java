package com.qa.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.ReportsPage;
import com.acti.pages.TasksList;
import com.acti.utils.ExcelLib;
import com.acti.utils.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseTest extends DriverScript {
	LoginPage LoginPage;
	EnterTimePage enterTimePage;
	TasksList tasklistPage;
	ExtentReports report;
	ExtentTest logger;
	ReportsPage ReportsPage;
	
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
		ReportsPage = new ReportsPage();

		
		
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			logger.fail("failed at this step", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		quitDriver();
		Helper.fn_Sleep();
		report.flush();
	}
	
	@DataProvider(name="actiData")
	public Object[][] testData()
	{
		ExcelLib xl = new ExcelLib("./atdata/actidata.xlsx");
		int rows = xl.getRowCount(0);

		Object[][] data = new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=xl.getcellData(0, i, 0);
			data[i][1]=xl.getcellData(0, i, 1);
		}
		
		return data;
	}

}
