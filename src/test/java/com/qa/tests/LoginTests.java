package com.qa.tests;


import org.testng.annotations.Test;

import com.acti.utils.Helper;

public class LoginTests extends BaseTest {
	
	
	@Test(dataProvider = "actiData", priority = 1)
	public void testLoginPage(String username, String password) 
	{
		LoginPage.enterUsername(username);
		LoginPage.enterPassword(password);
		LoginPage.clickLogin();
		String actual = enterTimePage.verifyUserLogged();
		System.out.println(actual);
		enterTimePage.clickLogout();
		Helper.fn_Sleep();
		
	}
	//@Test(priority = 2)
	//public void testvalidteForgotPasswordLinl() 
	//{
	//	LoginPage loginPage = new LoginPage();
	//	boolean flag = loginPage.verifylinkForgetPassword();
	//	System.out.println(flag);
		//Helper.fn_Sleep();
	//}
	
}
