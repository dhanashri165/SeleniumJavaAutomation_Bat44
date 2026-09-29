package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScriptMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am in selenium now");

		// 1 way - setProperty - Traditional way
		// Driver Exe setting in path

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Selenium Setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * );
		 * 
		 * WebDriver driver = new ChromeDriver();
		 */
		
		// 3 way - Selenium Manager

		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.selenium.dev/downloads/");
		  
		  String expTitle = "Downloads | Selenium";
		  
		  String actTitle = driver.getTitle();
		  
		  System.out.println(actTitle);
		  
		  if (expTitle.equals(actTitle)) {
		  System.out.println("Test Passed- Title is correct"); } else
		  System.out.println("Test Failed- Expected and actual title is Mismatched." +
		  actTitle);
		  
		  String expUrl = "https://www.selenium.dev/downloads/";
		  
		  String actUrl = driver.getCurrentUrl();
		  
		  if (expUrl.equals(actUrl)) {
		  System.out.println("Test Passed - Url is correct"); } else {
		  System.out.println("Test Failed -  Url is incorrect"); }
		  
		  // ## Timeout - sync methods -- implicit,explicit, fluent wait
		  
		  // Thread.sleep(Duration.ofSeconds(5));
		  
		  
		  try { Thread.sleep(Duration.ofSeconds(5)); } catch (InterruptedException e) {
		  e.printStackTrace(); }
		  
		  
		  driver.navigate().to("https://sites.google.com/chromium.org/driver/downloads"
		  );
		  
		  // Thread.sleep(Duration.ofSeconds(5));
		  
		  // driver.close();
		  
		  driver.navigate().back(); // Thread.sleep(Duration.ofSeconds(5));
		  driver.navigate().forward(); // Thread.sleep(Duration.ofSeconds(5));
		  driver.navigate().refresh();
		  
		  // Thread.sleep(Duration.ofSeconds(5)); driver.navigate().back();
		 

		// 2 way - WebDriver manager code- no one use it.

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver1 = new
		 * ChromeDriver(); driver1.get("https://www.selenium.dev/");
		 * System.out.println(driver1.getTitle()); driver1.close();
		 */

	}

}
