package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); // declare Explicit wait of 10 seconds
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.Normal alert with ok button or say single button
		
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	
    Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());  // Capture alert using Explicit wait variable
	
	//driver.switchTo().alert().accept(); // Accept the alert	
	//Alert myalert = driver.switchTo().alert();
	System.out.println(myalert.getText()); // Get the text of the alert)
	myalert.accept(); // Accept the alert
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
