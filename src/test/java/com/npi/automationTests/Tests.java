package com.npi.automationTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.npi.framework.Selenium;
import com.npi.framework.ValueNotFound;
import com.npi.pageobjects.Login;
import com.npi.pageobjects.PageObjects;
import com.npi.utilities.UserValues;

public class Tests{
	
	WebDriver driver;
	String username;
	String password;
	String url;
	
	@Parameters("Browser")
	@Test(groups="group1")
	public void Login(String Browser) throws ValueNotFound{

		url=UserValues.getValue("url");
		username=UserValues.getValue("username");
		password=UserValues.getValue("password");
		
		driver=Selenium.getDriver(Browser);
		Selenium.getUrl(url);
		
		Login login;
		login=PageObjects.initializeLoginPage(driver);
		login.signIn(username,password);
				
	}
	
	@Test
	public void ntg(){
		
		
		
	}
}
