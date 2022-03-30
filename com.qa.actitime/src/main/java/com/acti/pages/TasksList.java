package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

public class TasksList extends DriverScript {
	// page Elements
	
	@FindBy(id ="container_tasks") WebElement taskbuttunElement;
	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement addnewElement;
	@FindBy(xpath = "/html/body/div[19]/div[1]") WebElement newcustomerElement;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement entercoustomerElement;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement descriptionElement;
	@FindBy(xpath = "//*[@id=\"customerLightBox_content\"]/div[3]/div[2]/div[1]/div/div[1]") WebElement createcustomerElement;
	@FindBy(xpath = "//input[@placeholder='Start typing name ...' ]") WebElement searchElement;
	@FindBy(xpath = "//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div[3]/div[1]/span") WebElement nameclickElement;
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/div/div[2]") WebElement edditbuttenElement;
	@FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']") WebElement clickActionElement;
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[5]/div[1]/div/div[1]/div/div[4]/div/div[3]/div")WebElement deletebuttenElement;
	@FindBy(xpath = "/html[1]/body[1]/div[18]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/span[1]") WebElement deletepermanentlElement;
	
	// page Initialization
	
	public TasksList()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Method
	
	public void Taskclick()
	{
		taskbuttunElement.click();		
	}
	
	public void AddNew()
	{
		addnewElement.click();
	}
	
	public void NewCustomere()
	{
		newcustomerElement.click();
	}
	
	public void Entername(String name)
	{
		 entercoustomerElement.sendKeys(name);
	}
	 
	public void EnterDescrip(String description)
	{
		 descriptionElement.sendKeys(description);
	}
	 
	public void CreateCusomer()
	{
		 createcustomerElement.click();
	}
	 
	public String verifyNewUser ()
	{
		 return addnewElement.getText();
	}	
	
	public void search(String name)
	{
		searchElement.sendKeys(name);
	}
	
	public void name()
	{
		nameclickElement.click();
	}
	
	public void edditbutten()
	{
		edditbuttenElement.click();
	}
	
	public void actionbutten()
	{
		clickActionElement.click();
	}
	
	public void deletebutten()
	{
		deletebuttenElement.click();
	}
	
	public void deletepermanetl()
	{
		deletepermanentlElement.click();
	}
}


