package com.npi.reporting;

import org.apache.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener,IInvokedMethodListener{

	
	Logger log=Logger.getLogger(Listeners.class);
		
	public void onFinish(ITestContext arg0) {
		log.info(arg0.getName()+" is Finished!");
		
	}

	public void onStart(ITestContext arg0) {
		log.info(arg0.getName()+" is Starting...");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		log.info(arg0.getName()+"() method is Failed But Within Success Percentage");
		
	}

	public void onTestFailure(ITestResult arg0) {
		log.error(arg0.getName()+"() method is Failed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		log.warn(arg0.getName()+"() method is Skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
		log.info(arg0.getName()+"() method is ready");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		log.info(arg0.getName()+"() method is Successfully passed");
		
	}

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		log.info(arg0.getTestMethod().getMethodName()+"() method is completed");
		
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		log.info(arg0.getTestMethod().getMethodName()+"() method is invoked");
		
	}

	

}
