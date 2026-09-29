package com.newGen.testNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyListener implements ITestListener {

	String path = System.getProperty("user.dir") + "/reports/index1.html";

	ExtentSparkReporter reporter = new ExtentSparkReporter(path);

	ExtentReports extent = new ExtentReports();

	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {

		System.out.println("=================================");
		System.out.println("Test Execution Started");
		System.out.println("Test Name: " + context.getName());
		System.out.println("=================================");
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("=================================");
		System.out.println("Test Execution Finished");
		System.out.println("=================================");
		extent.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test Started: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("PASS: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("FAIL: " + result.getMethod().getMethodName());

		System.out.println("Failure Reason: " + result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("SKIPPED: " + result.getMethod().getMethodName());
	}

}
