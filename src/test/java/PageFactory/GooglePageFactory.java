package PageFactory;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageFactory {

	WebDriver d;
	// By googleLogo = By.cssSelector("#sI1XGe > div.naW5gc.uZekje > svg");

	@FindBy(css = "#sI1XGe > div.naW5gc.uZekje > svg")
	WebElement googleLogo;

	public GooglePageFactory(WebDriver driver) {
		this.d = driver;
		PageFactory.initElements(d, this);
	}

	public boolean checkLogo() {
		// WebElement logo = d.findElement(googleLogo);
		return googleLogo.isDisplayed();
	}
}
