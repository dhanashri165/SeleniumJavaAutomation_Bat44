//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	// DataProvider provides multiple sets of test data
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {

		return new Object[][] { { "admin", "admin123" },
			{ "user1", "user123" }, { "tester", "test123" } };
	}

	// Parameter comes from testng.xml
	// DataProvider comes from getLoginData()
	@Parameters("browser")
	    @Test(dataProvider = "loginData")
	    public void loginTest(String browser, String username, String password) {

	        System.out.println("Browser  : " + browser);
	        System.out.println("Username : " + username);
	        System.out.println("Password : " + password);

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.tutorialspoint.com/software_testing_dictionary/web_application_testing.htm");

	        // Example:
	        // driver.findElement(By.id("username")).sendKeys(username);
	        // driver.findElement(By.id("password")).sendKeys(password);
	        // driver.findElement(By.id("login")).click();

	        driver.quit();

	        System.out.println("---------------------------");
	    }
}
