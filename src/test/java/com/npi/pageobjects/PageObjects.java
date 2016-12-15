package com.npi.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	//static Logger log = Logger.getLogger(PageObjects.class);

	public static Login initializeLoginPage(WebDriver driver) {
		Login login;
		login = PageFactory.initElements(driver, Login.class);
		//log.info("Login page is initialized:" + login.toString());
		return login;
	}

}
