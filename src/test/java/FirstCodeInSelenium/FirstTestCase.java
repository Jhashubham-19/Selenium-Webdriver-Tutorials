package FirstCodeInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		// Initialize the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		 WebElement closeButton = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")); // Close login popup
		 closeButton.click(); // Click the close button to dismiss the login popup
		 
		 // Find the search box using its name attribute
		 WebElement searchBox = driver.findElement(By.name("q"));
		 // Enter "laptop" into the search box
		 searchBox.sendKeys("laptop");
		 driver.quit();
		;
	}

}
