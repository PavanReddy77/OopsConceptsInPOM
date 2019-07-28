package com.MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage
{
	//Define Page Locators:
	//Non Page Factory with the help of By Locators is Easy and Light Weight.
	private By emailId = By.name("username");
	private By password = By.name("password");
	private By loginButton = By.xpath("//input[@class='btn btn-small']");
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	//Public Getters for above declared Private Variables.
	//Change Return Type of Getter Methods to WebElement.
	//Pass Variables into it Accordingly.
	public WebElement getEmailId() 
	{
		return getElement(emailId);
	}

	public WebElement getPassword() 
	{
		return getElement(password);
	}

	public WebElement getLoginButton()
	{
		return getElement(loginButton);
	}
	
	public String getLoginPageTitle()
	{
		return getPageTitle();
	}
	
	public void doLogin(String username, String password)
	{
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
	}
	
	//Achieving Method Overloading
	public void doLogin()
	{
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
	}
	
	//username: pavanreddy
	public void doLogin(String userCredentials)
	{
		if(userCredentials.contains("username"))
		{
			getEmailId().sendKeys(userCredentials.split(":")[1].trim());
		}
		else if(userCredentials.contains("password"))
		{
			getEmailId().sendKeys(userCredentials.split(":")[1].trim());
		}
		getLoginButton().click();
	}
}
