package com.newGen.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class NewTest {
	@Test
	public void f() {
		System.out.println(" I am in method f()");

		Assert.assertEquals("abd", "abd");

		Assert.assertTrue(true);

		Assertion hs = new Assertion();

		hs.assertNotNull(null);

	}

	@Test(enabled = true)
	public void a() {
		System.out.println(" I am in method a()");

		SoftAssert ref = new SoftAssert();

		ref.assertEquals(true, false);

		System.out.println("done with assertion 1");

		ref.assertTrue(false);

		System.out.println("done with assertion2");

		ref.assertFalse(false);

		System.out.println("done with assertion3");

		ref.assertAll();

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println(" I am in before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" I am in after method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" I am in before Class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println(" I am in after Class");

	}

	@Test(priority = -1, dependsOnMethods = { "mymethod" })
	public void test01() {
		System.out.println(" I am in Test01");

		Assert.assertFalse(true);
	}

	@Test(priority = 10, groups = { "sanity" })
	public void test02() { // Fail
		System.out.println(" I am in Test02");

		// Assertion hs= new Assertion(); // one way
		// Assert.assertTrue(false); // false Hard Assert // step 1 failing

		Assert.assertTrue(true,"test failed with title"); // true // step 2 is passed

		SoftAssert sa = new SoftAssert();

		sa.assertTrue(true); // fail

		//sa.assertFalse(false); // pass

		System.out.println(" All steps are completed!");

		sa.assertAll();

	}

	@Test(priority = 5)
	public void mymethod() {
		System.out.println(" I am in mymethod");

	}
}
