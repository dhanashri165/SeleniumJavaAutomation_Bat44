package com.newGen.testNG;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class BasicBrowserTest {

	WebDriver driver;

	@BeforeClass

	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	}

	@Test(priority = -1, dependsOnMethods = { "verifyURL" })

	public void verifyTitle() {

		String actTitle = driver.getTitle();
		System.out.println("Actual Title :" + actTitle);

		Assert.assertEquals(actTitle, "Google");

		System.out.println(" My Title Test passed");

	}

	@Test(priority = 2)

	public void verifyURL() {

		String expURL = "https://www.google.com/";

		String actURL = driver.getCurrentUrl();
		System.out.println("Actual URl :" + actURL);

		Assert.assertEquals(actURL, expURL);
		/*
		 * SoftAssert sa=new SoftAssert(); sa.assertEquals(actURL, expURL);
		 * 
		 * System.out.println("My URL test passed"); sa.assertTrue(true);
		 * sa.assertFalse(true);
		 */

	}

	//@Test(priority = 2000)

	/*
	 * public void verifyLogo() {
	 * 
	 * WebElement googleLogo =
	 * driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']"));
	 * 
	 * Assert.assertTrue(googleLogo.isDisplayed(), "Logo ELement Not loaded");
	 * 
	 * // Assert.assertTrue(false);
	 * 
	 * System.out.println(" Google Logo displayed- Test Passed");
	 * 
	 * }
	 */
	@Test(enabled = false)
	public void myTest() {
		System.out.println(" I am in MyTest method");

		Assert.assertFalse(false);

	}

	@Test(enabled = true)
	public void testMethod() {
		System.out.println(" I am in testmethod");

		Assert.assertTrue(true);

	}

	@Test(priority = 0)
	public void verifyMethod() {
		System.out.println(" I am in verifyMethod");

		Assert.assertTrue(true);

	}

	@AfterClass

	public void tearDown() {

		driver.quit();

	}

}
