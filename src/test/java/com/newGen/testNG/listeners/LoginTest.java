package com.newGen.testNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners1.class)

public class LoginTest {

	@Test
	public void validLoginTest() {

		System.out.println("Executing valid login test");

		Assert.assertTrue(true);
	}

	@Test
	public void invalidLoginTest() {

		System.out.println("Executing invalid login test");

		Assert.assertTrue(false);
		/*
		 * We intentionally made invalidLoginTest() fail.
		 * 
		 * So when you run this class:
		 * 
		 * validLoginTest → PASS , invalidLoginTest → FAIL
		 */
	}
}