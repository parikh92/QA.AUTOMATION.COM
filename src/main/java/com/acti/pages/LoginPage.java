package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.DriverScript;

public class LoginPage extends DriverScript {
	/// page Elements//
	@FindBy(id = "username") WebElement textboxUsernamElement;
	@FindBy(name = "pwd") WebElement textboxPasswordElement;
	@FindBy(xpath = "//div[text()='Login ']") WebElement buttonLoginElement;
	@FindBy(id = "loginRecoveryLinkContainer")WebElement linkForgetPasswordElement;
	
	// page Initialization//
	
	public boolean verifylinkForgetPassword()
	{
		return linkForgetPasswordElement.isDisplayed();
	}
	
	public LoginPage ()
	{
		PageFactory.initElements(driver, this);
	}
	//page Method//
	
	public void enterUsername(String username)
	{
		textboxUsernamElement.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		textboxPasswordElement.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLoginElement.click();
	}
	

}
