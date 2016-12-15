package com.npi.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.npi.reporting.EventListen;
import com.npi.utilities.UserValues;

public class Driver {
	public static WebDriver driver;
	private static String Browser;
	
	static Logger log=Logger.getLogger(Driver.class);
	
	public static WebDriver CreateDriver(String Browser) throws ValueNotFound{
		Driver.Browser=Browser;
	if(Browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", UserValues.getValue("webdriver.chrome.driver"));
		driver=new ChromeDriver();
		
	}
	else if(Browser.equalsIgnoreCase("InternetExplorer")){
		System.setProperty("webdriver.ie.driver", UserValues.getValue("webdriver.ie.driver"));
		log.info("Internet Explorer driver is created");
		driver=new InternetExplorerDriver();
		
	}
	else if(Browser.equalsIgnoreCase("Firefox")){
		log.info("Firefox driver is created");
		driver=new FirefoxDriver();
		
	}
	return eventListener();
	}

	private static EventFiringWebDriver eventListener() {
		EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
		EventListen handler=new EventListen();
		eventDriver.register(handler);
		return eventDriver;
		
	}

	public static String getBrowserName() {
		
		return Browser;
	}	
}
