package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//Encapsulation= data+Method

	private WebDriver driver;
	
	public HomePage(WebDriver driver) 	//base class
	
	{
		
	this.driver=driver;
	}
	
	//By Locator
	private By SignIn= By. id("SignIn");
	
	
	//method
	public String getAppUrl() 
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle()
	{
		return driver.getTitle();
		
	}
	
	public void getSignIn()
	{
		
		driver.findElement(SignIn).click();
	}
	
	
}
