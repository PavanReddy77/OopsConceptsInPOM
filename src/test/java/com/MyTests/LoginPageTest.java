package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyPages.LoginPage;

public class LoginPageTest extends BaseTest
{
	@Test(priority=1,enabled=false)
	public void verifyLoginPageTitleTest()
	{
		String loginPageTitle = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("The Title of Login Page is :::" +loginPageTitle);
		Assert.assertEquals(loginPageTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2, enabled=false)
	public void doLoginTest() throws InterruptedException
	{
		page.getInstance(LoginPage.class).doLogin("pavanreddy", "Saibaba77");
	}
}
