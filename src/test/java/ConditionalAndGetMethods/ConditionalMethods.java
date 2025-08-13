package ConditionalAndGetMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		// Conditional methods are used to check if an element is present or not
		// and perform actions based on that condition.

		// Example: Check if an element is displayed, enabled, or selected.

		// isDisplayed() - checks if the element is visible on the page
		// isEnabled() - checks if the element is enabled (clickable)
		// isSelected() - checks if the element is selected (for checkboxes/radio
		// buttons)

		// These methods return boolean values (true/false).

		// Example usage:
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		// Check if the "logo" is displayed
		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Logo displayed: " + logo.isDisplayed());
		
		  boolean displaystatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		 System.out.println(displaystatus);
		 
		 //isEnabled() - check if the element is enabled
		 WebElement registerButton = driver.findElement(By.id("register-button"));
		 System.out.println("Register button enabled: " + registerButton.isEnabled());
		 //isSelected() - check if the element is selected
		 WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
		 System.out.println("Newsletter checkbox selected: " + newsletterCheckbox.isSelected());
		
		driver.quit();
		}
		
	}


