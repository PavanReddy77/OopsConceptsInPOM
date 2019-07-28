package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page 
{
	WebDriver driver;
	WebDriverWait wait;
	
	//Page Class Constructor to Initialize Constructor.
	//We can create Constructor of Abstract Class.
	public Page(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);
	}
	
	//Creating Abstract Methods
	public abstract String getPageTitle();
	
	public abstract String homePageUserName(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title); 
	
	//Non-Abstract Method.
	//Create a Method with Java Generics and Return a New Page.
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) 
	{
		try
		{
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}
