package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Helper;

public class ReportsPage extends DriverScript {
	
	//<------------------------------------------------------Page Elements -------------------------------------------------------->//
	
	@FindBy(xpath = "//div[@id='container_reports']") WebElement reportsbuttunElement;
	@FindBy(xpath = "//span[text()='New Report']") WebElement newReportElement;
	@FindBy(xpath = "//*[@id=\"createReportLightBox_content\"]/div[2]/div[1]/div/div[2]/div/div[4]") WebElement configureReportElement;
	@FindBy(xpath = "//*[@id=\"applyReportConfiguration\"]/span") WebElement generatehtmlElement;
	@FindBy(xpath = "//*[@id=\"container\"]/div[11]/div/div[1]/table/tbody/tr[5]/td/div/table/tbody/tr/td[2]/div[1]") WebElement addtodashboardElement;
	@FindBy(xpath = "//*[@id=\"container\"]/div[11]/div/div[1]/table/tbody/tr[5]/td/div/table/tbody/tr/td[2]/input") WebElement enterreportnamElement;
	@FindBy(xpath = "//*[@id=\"container\"]/div[11]/div/div[1]/table/tbody/tr[5]/td/div/table/tbody/tr/td[3]/div/span") WebElement saveElement;
	
	//<------------------------------------------------------Page Initialization -------------------------------------------------------->//
	
	public ReportsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//<------------------------------------------------------Page Method -------------------------------------------------------->//
	
	public void click()
	{
		reportsbuttunElement.click();
	}
	
	public void newreport()
	{
		newReportElement.click();
		Helper.fn_Sleep();
	}
	
	public void configurereport()
	{
		configureReportElement.click();
		Helper.fn_Sleep();
	}
	
	
	public void generatehtml()
	{
		generatehtmlElement.click();
		Helper.fn_Sleep();
	}
	
	public void addtodasgbord()
	{
		addtodashboardElement.click();
	}
	
	public void enterreportname(String name)
	{
		enterreportnamElement.sendKeys(name);
	}
	
	public void save()
	{
		saveElement.click();
	}

}
