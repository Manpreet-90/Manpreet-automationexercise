package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
	
	private static final Logger logger=LogManager.getLogger(TestListeners.class); 

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		logger.info("Test suite started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		logger.info("Test suite completed");
	}
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("passed" +result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("passed" +result.getMethod().getMethodName());
		logger.info("description" +result.getMethod().getDescription());
		}
		
	

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("failed" +result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("skipped" +result.getMethod().getMethodName());
	}

	

	
}
