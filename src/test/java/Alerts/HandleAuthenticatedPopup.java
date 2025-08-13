package Alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
	//	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	mywait.until(ExpectedConditions.alertIsPresent());
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // This URL contains the username and password in the URL itself
		Thread.sleep(5000); // Wait for 5 seconds to see the authenticated popup
		driver.close();
	}

}
// This code demonstrates how to handle an authenticated popup in Selenium WebDriver using Java.
// The code uses the ChromeDriver to open a specific URL that requires authentication.
// The username and password are included in the URL itself.
// The code waits for 5 seconds to allow the authenticated popup to appear before closing the browser.


