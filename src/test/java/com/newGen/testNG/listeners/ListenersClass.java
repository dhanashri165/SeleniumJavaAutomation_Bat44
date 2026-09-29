package com.newGen.testNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersClass implements ITestListener {

	String path = System.getProperty("user.dir") + "/reports/index.html";

	ExtentSparkReporter reporter = new ExtentSparkReporter(path);

	ExtentReports extent = new ExtentReports();

	ExtentTest test;

	public ListenersClass() {

		reporter.config().setReportName("Automation Test Report");
		reporter.config().setDocumentTitle("Test Results");

		extent.attachReporter(reporter);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");

		extent.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println(result.getName() + " test case started");

		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("The name of the testcase passed is : " + result.getName());

		test.pass("Test passed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("The name of the testcase failed is : " + result.getName());

		test.fail("Test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("The name of the testcase skipped is : " + result.getName());

		test.skip("Test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("Test Failed But Within Success Percentage Test Method");
	}
}