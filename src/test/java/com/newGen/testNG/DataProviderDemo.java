package com.newGen.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {

		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("-------------------");
	}

	@DataProvider(name = "loginData")
	public Object[][] getData() {

		Object[][] data = { { "user1", "pass123" }, 
				{ "user2", "pass456" },
				{ "user3", "pass789" } };

		return data;
	}

}
