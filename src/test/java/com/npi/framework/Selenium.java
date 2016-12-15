package com.npi.framework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium {
	private static WebDriver driver;

	//static Logger log=Logger.getLogger(Selenium.class);

	private static String Browser;
	
	public static WebDriver getDriver(String Browser) throws ValueNotFound {
		driver=Driver.CreateDriver(Browser);
		if(Browser.equals("InternetExplorer")) {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		return driver;
	}

	public static void getUrl(String string) {
		Browser=Driver.getBrowserName();
		//log.info("Navigating to url:"+string);
		if(Browser.equals("InternetExplorer"))
			driver.navigate().to(string);
		else driver.get(string);
	}


	public static void sendKeys(WebElement element, String string) {
		element.sendKeys(string);
		//log.info("Entered : "+string);
		
	}

	public static void click(WebElement element) {
		if(element.getText()!=null)	;//log.info("clicking on :"+element.getText());
		element.click();
		
	}
}
