package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

	WebDriver d;
	By googleLogo = By.cssSelector("#sI1XGe > div.naW5gc.uZekje > svg");

	public GooglePage(WebDriver driver) {
		this.d = driver;
	}

	public boolean checkLogo() {
		WebElement logo = d.findElement(googleLogo);
		return logo.isDisplayed();
	}
}
