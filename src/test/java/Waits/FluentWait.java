package Waits;

public class FluentWait {

	public static void main(String[] args) {
		
		// Fluent wait is a type of wait in Selenium WebDriver that allows you to define
		// the maximum amount of time to wait for a condition to be met, as well as the
		// frequency with which to check for that condition.
		// It is more flexible than implicit and explicit waits, as it allows you to
		// specify the polling interval and ignore specific exceptions.
		// Fluent wait can be used when you need to wait for an element to become
		// visible or clickable, or when you need to wait for a specific condition to be
		// met.

		// Fluent wait is not available in Selenium 4.0.0 and above.
		// It is available in Selenium 3.x versions.	
		
		// Example usage:
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.pollingEvery(Duration.ofSeconds(2));
			
		// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
			
		// This will wait for a maximum of 10 seconds for the element to become
			
		// visible, checking every 2 seconds.
		// It will ignore NoSuchElementException and continue checking for the element
			
			
		// until the condition is met or the maximum wait time is reached.
			
		// Fluent wait is useful in scenarios where the element may not be immediately
			
		// available or may take some time to load, such as in AJAX applications or
		// dynamic web pages.
		// It allows you to define a custom polling interval and ignore specific
			
		// exceptions, making it more flexible than implicit and explicit waits.
			
		// Example usage:
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// wait.pollingEvery(Duration.ofSeconds(2));
		// wait.ignoring(NoSuchElementException.class);
			// WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
		

	}

}
