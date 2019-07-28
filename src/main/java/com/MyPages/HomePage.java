package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage
{
	//Define Page Locators:
	//Non Page Factory with the help of By Locators is Easy and Light Weight.
	private By userName = By.xpath("//td[contains(text(),'User: Pavan KrishnanReddy')]");
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public WebElement getUserName() 
	{
		return getElement(userName);
	}

	public String getHomePageTitle()
	{
		return getPageTitle();
	}
}
