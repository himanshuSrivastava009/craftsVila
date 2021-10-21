package com.craftsvilla.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ScreenShot implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	try {
		String methodName=result.getMethod().getMethodName();
		EventFiringWebDriver event = new EventFiringWebDriver(BasePage.driver);
		File src = event.getScreenshotAs(OutputType.FILE);
		String FileDestination=".//Screenshots//" +methodName+ ".png";
		FileUtils.copyFile(src, new File(FileDestination));
		
	}
	
	catch (Exception e) {
	
	}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		

	}

	@Override
	public void onStart(ITestContext context) {
		
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	
	}
	
	

}
