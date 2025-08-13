package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		// Thread.sleep() is used to pause the execution of the program for a specified
		// amount of time.
		// It is generally used to wait for a certain condition to be met before
		// proceeding with the next step in the code.
		// The time is specified in milliseconds (1 second = 1000 milliseconds).
		// It is a static method of the Thread class.
		// If the time is not sufficient, then it will throw an exception.
		// It is not a good practice to use Thread.sleep() in Selenium WebDriver- It will wait for maximum time and reduce the performance of the script.
		// Need to use multiple waits in the script.- wherever required.
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// Pause the execution for 5 seconds
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.close();
	}

}
