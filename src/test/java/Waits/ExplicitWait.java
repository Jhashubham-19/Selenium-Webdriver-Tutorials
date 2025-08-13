package Waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {

	public static void main(String[] args) {
		
		// Explicit wait is used to wait for a specific condition to be true before
		// proceeding with the next step.
		// It is more flexible than implicit wait and can be applied to specific
		// elements or conditions.
		// Explicit wait is defined using WebDriverWait class and ExpectedConditions
		// class.
		// It is used to wait for a specific condition to be true before proceeding with
		// the next step.
		// It is used in scenarios where we need to wait for a specific element to be
		// visible, clickable, or present in the DOM.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();	

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Declare explicit wait with 10 seconds timeout

		WebElement Username_wait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		System.out.println(Username_wait); // Check if the element is present	
		Username_wait.sendKeys("Admin");

		WebElement Password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
		System.out.println(Password); // Check if the element is present
		Password.sendKeys("admin123");

		WebElement loginButton= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
		loginButton.click();

	}

}
