package com.MyTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyPages.HomePage;
import com.MyPages.LoginPage;

public class HomePageTest extends BaseTest
{
	@Test(priority=1, enabled=false)
	public void verifyHomePageTitleTest()
	{
		page.getInstance(LoginPage.class).doLogin("pavanreddy", "Saibaba77");
		String homePageTitle = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("The Title of Home Page is :::" +homePageTitle);
		Assert.assertEquals(homePageTitle, "CRMPRO");
	}
	
	@Test(priority=2)
	public void verifyHomePageUserNameTest()
	{
		page.getInstance(LoginPage.class).doLogin("pavanreddy", "Saibaba77");
		driver.switchTo().frame("mainpanel");
		WebElement homePageUserName = page.getInstance(HomePage.class).getUserName();
		System.out.println("The Home Page UserName is ::: " +homePageUserName);
		Assert.assertEquals(homePageUserName, "[[FirefoxDriver: firefox on WINDOWS (6a7496e4-571d-489b-93eb-8d93ab663657)] -> xpath: //td[contains(text(),'User: Pavan KrishnanReddy')]]");
	}
}
