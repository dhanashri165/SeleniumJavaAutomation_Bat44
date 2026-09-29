package com.newGen.testNG;

//import org.openqa.selenium.By;

//import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGGroups {

	@Test(groups = { "regression" })

	public void test1() {

		System.out.println("I am in Test1");

	}

	@Test(groups = { "sanity" })

	public void test2() {

		System.out.println("I am in Test2");

	}

	@Test(groups = { "regression" })

	public void test3() {

		System.out.println("I am in Test3");

	}

	@Test(groups = { "sanity", "regression" })

	public void test4() {

		System.out.println("I am in Test4");

	}

	@Test(groups = { "sanity" })
	@Parameters({ "userid", "pass", "fname" })

	public void loginTest(String user, String pwd, String fname) {

		System.out.println(" User credentials : " + user + " : " + pwd);

		System.out.println("I am in Login Test");

		System.out.println("I am in Login Test:fname value:" + fname);

		Assert.assertEquals(user, "Krishna");
		Assert.assertEquals(pwd, "Pass@123");

		
		  if ("Krishna".equals(user) && "Pass@123".equals(pwd)) {
		  System.out.println("Login successful!"); } else {
		  System.out.println("Login failed."); }
		 

	}

	@Test(dependsOnGroups = { "sanity" }, groups = { "regression" })

	public void test5() {

		System.out.println("I am in Test5");

	}

}
