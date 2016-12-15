package com.npi.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import com.npi.framework.Selenium;

public class Login {

	@FindBy(how=How.ID, using="emailId")
	public static WebElement username;
	
	@FindBy(how=How.ID, using="password")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="signInBtn")
	public static WebElement Signin;

	public void signIn(String string, String string2) {
		
		Selenium.sendKeys(username,string);
		Selenium.sendKeys(password,string2);
		Selenium.click(Signin);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("Hi", "Hi");
		sa.assertAll();
	}
	
	
	
	
}
