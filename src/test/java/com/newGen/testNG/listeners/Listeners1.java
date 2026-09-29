package com.newGen.testNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners1 implements ITestListener {

	ExtentReports extent;
	ExtentTest test;

	@Override
	public void onStart(org.testng.ITestContext context) {
		String path = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);

		extent = new ExtentReports();
		extent.attachReporter(spark);
		System.out.println("Testing started .... i m in on start");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
		extent.flush();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("Test Failed But Within Success Percentage Test Method");

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :" + Result.getName());
		test.log(Status.FAIL, "Test Failed");
		test.log(Status.FAIL, Result.getThrowable());
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());

	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		extent.createTest(Result.getMethod().getMethodName());
		System.out.println(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

}
