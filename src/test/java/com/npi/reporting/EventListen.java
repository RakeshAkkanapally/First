package com.npi.reporting;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.npi.pageobjects.PageObjects;

public class EventListen implements WebDriverEventListener {
	static Logger log = Logger.getLogger(PageObjects.class);

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("afterChangeValueOf"+arg0);
		
	log.info("afterChangeValueOf"+arg0); }

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		/*System.out.println("clicked on:"+arg0.getText()+"OR"+arg0.getAttribute("value"));
		*/
	log.info("clicked on:"+arg0.getText()); }

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("afterFindBy:"+arg0);
		
	log.info("afterFindBy:"+arg0); }

	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("afterNavigateBack:"+arg0);
		
	log.info("afterNavigateBack:"+arg0); }

	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("afterNavigateForward:"+arg0);
		
	log.info("afterNavigateForward:"+arg0); }

	public void afterNavigateRefresh(WebDriver arg0) {
		System.out.println("afterNavigateRefresh:"+arg0);
		
	log.info("afterNavigateRefresh"+arg0); }

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("afterNavigateTo:"+arg0);
		
	log.info("afterNavigateTo:"+arg0); }

	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("afterScript:"+arg0);
		
	log.info("afterScript:"+arg0); }

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeChangeValueOf:"+arg0);
		
	log.info("beforeChangeValueOf:"+arg0); }

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeClickOn:"+arg0);
		
	log.info("beforeClickOn:"+arg0); }

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("beforeFindBy:"+arg1);
		
	log.info("beforeFindBy:"+arg1); }

	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("beforeNavigateBack:"+arg0);
		
	log.info("beforeNavigateBack:"+arg0); }

	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("beforeNavigateForward:"+arg0);
		
	log.info("beforeNavigateForward:"+arg0); }

	public void beforeNavigateRefresh(WebDriver arg0) {
		System.out.println("beforeNavigateRefresh:"+arg0);
		
	log.info("beforeNavigateRefresh:"+arg0); }

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("beforeNavigateTo:"+arg0);
		
	log.info("beforeNavigateTo:"+arg0); }

	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println("beforeScript:"+arg0);
		
	log.info("beforeScript:"+arg0); }

	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("onException:"+arg0);
		
	log.info("onException:"+arg0); }

 }
