import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations {
	@Test
	public void f() {
		System.out.println("Default f method");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1. Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("2. Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("3. Before Class");
	}

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		// Setup - Open Chrome browser
		driver = new ChromeDriver();

		// Open Google
		driver.get("https://www.google.com");

		// Maximize browser
		driver.manage().window().maximize();
	}

	@Test
	public void loginTest() {
		System.out.println("5. Login Test");
	}

	@Test
	public void searchTest() {
		System.out.println("6. Search Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("7. After Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("8. After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("9. After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("10. After Suite");
	}

}
