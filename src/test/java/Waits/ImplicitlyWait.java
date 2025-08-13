package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		// Set the implicit wait time for the WebDriver
		// This will wait for a maximum of 5 seconds for elements to be found
		// before throwing a NoSuchElementException.
		// This is a global wait and will apply to all elements in the script.
		// if the element is available it will proceed to the next step without waiting for 5 seconds.
        // It is a good practice to use implicit wait in Selenium WebDriver.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.close();

	}

}
