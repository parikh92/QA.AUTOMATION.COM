package com.qa.tests;


import org.testng.annotations.Test;
import com.acti.pages.LoginPage;
import com.acti.utils.Helper;

public class LoginTests extends BaseTest {
	
	
	@Test(priority = 1)
	public void testLoginPage() 
	{
		LoginPage.enterUsername("admin");
		LoginPage.enterPassword("manager");
		LoginPage.clickLogin();
		String actual = enterTimePage.verifyUserLogged();
		System.out.println(actual);
		enterTimePage.clickLogout();
		Helper.fn_Sleep();
		
	}
	@Test(priority = 2)
	public void testvalidteForgotPasswordLinl() 
	{
		LoginPage loginPage = new LoginPage();
		boolean flag = loginPage.verifylinkForgetPassword();
		System.out.println(flag);
		Helper.fn_Sleep();
	}
	
}
