/*
 * 
 * driver.switchTo().alert() -- This command will switch the focus to the alert
 * driver.switchTo().alert().accept() -- This command will accept the alert
 * driver.switchTo().alert().dismiss() -- This command will dismiss the alert
 * driver.switchTo().alert().getText() -- This command will get the text of the
 * driver.switchTo().alert().sendKeys("text") -- This command will send keys to
 
 	Alert myalert = driver.switchTo().alert(); // Switch to the alert store in a variable
 	myalert.accept(); // Accept the alert
 	myalert.dismiss(); // Dismiss the alert
 	myalert.getText(); // Get the text of the alert
 	myalert.sendKeys("text"); // Send keys to the alert
*/

package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.Normal alert with ok button or say single button
		/*
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	driver.switchTo().alert().accept(); // Accept the alert	
	Alert myalert = driver.switchTo().alert();
	System.out.println(myalert.getText()); // Get the text of the alert)
	myalert.accept(); // Accept the alert
	*/
		
		//2.Confirmation alert with ok and cancel button
		
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		myalert.accept(); // This command will close the alert with ok button
		myalert.dismiss(); // This command will close the alert with cancel button
		System.out.println(myalert.getText()); // Get the text of the alert
		*/
		
		//3.Prompt alert with input field
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert mypromptAlert = driver.switchTo().alert();
		mypromptAlert.sendKeys("Hello"); // Send keys to the alert
		mypromptAlert.accept(); // Accept the alert
		
		
		
		Thread.sleep(2000);
		
		driver.close(); // Close the browser
	}

}
