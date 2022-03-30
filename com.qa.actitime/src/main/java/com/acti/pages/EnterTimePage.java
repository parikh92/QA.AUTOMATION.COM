package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterTimePage extends DriverScript {
	
	// page Elements
	@FindBy(xpath = "//a[@class='userProfileLink username ' ]")WebElement textuserLoggedElement;
	@FindBy(id = "logoutLink")WebElement linkLogoutElement;
	
	// page Initialization//
	public EnterTimePage ()
	{
		PageFactory.initElements(driver, this);
	}
	//page Method//
	
	public void clickLogout()
	{
		linkLogoutElement.click();
	}
	
	public String verifyUserLogged()
	{
		return textuserLoggedElement.getText();
	}
	

}
