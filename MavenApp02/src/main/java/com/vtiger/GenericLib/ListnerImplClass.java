package com.vtiger.GenericLib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * This is a Listner Implementation Class used to take Snapshots of Failed Test Scripts.
 * @author Manoj
 *
 */
public class ListnerImplClass implements ITestListener {

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String current_Date = new Date().toString().replace(":", "_").replace(" ", "_");
		String testCaseName = result.getMethod().getMethodName();

		EventFiringWebDriver edr = new EventFiringWebDriver(BaseClass.dr);
		File srcFile = edr.getScreenshotAs(OutputType.FILE);
		File destFile = new File("../MavenApp02/Screenshots/" + testCaseName + "_" + current_Date + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
		}
	}
	
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
}