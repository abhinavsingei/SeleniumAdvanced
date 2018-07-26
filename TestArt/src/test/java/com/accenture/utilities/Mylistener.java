package com.accenture.utilities;

//import org.omg.CORBA.Current;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Mylistener implements ITestListener{

	ExtentReports EReport;
	ExtentTest ETest;
	
	
	public static void main(String[] args) {

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		EReport.endTest(ETest);
		EReport.flush();
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		EReport = new ExtentReports("C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\Abhinav\\TestArt\\MyReport\\Report1.html");
		EReport.addSystemInfo("User Name", "Abhinav Singh");
		EReport.addSystemInfo("Browser", "Chrome Browser");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Failure");
		ETest.log(LogStatus.FAIL, result.getMethod().getMethodName()+" has failed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test Skipped");
		
	}

	public void onTestStart(ITestResult result) {
//		ETest = EReport.startTest("My test has Started on 24th July");
		ETest = EReport.startTest(result.getMethod().getMethodName()+" has started");
		ETest.log(LogStatus.INFO, result.getMethod().getMethodName()+" has started");
		
	}

	public void onTestSuccess(ITestResult result) {
		ETest.log(LogStatus.PASS, result.getMethod().getMethodName()+" has Passed");
		
	}

}
