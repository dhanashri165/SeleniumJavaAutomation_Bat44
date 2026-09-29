package test;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GooglePage;

public class GoogleTest {

	WebDriver driver;
	GooglePage gp;

	@BeforeTest

	public void driverLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test(priority = 2000)

	public void verifyLogo() {

		gp = new GooglePage(driver);
		boolean logoPresence = gp.checkLogo();

		Assert.assertTrue(logoPresence, "Logo ELement Not loaded");

		// Assert.assertTrue(false);

		System.out.println(" Google Logo displayed- Test Passed");

	}
}
