package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentAlert {

	public static void main(String[] args) {
	
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	        driver.get("https://mypage.rediff.com/login/dologin");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@value='Login']")).click();

	        // Wait for the alert to be present
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	     Alert myalert = wait.until(ExpectedConditions.alertIsPresent());

	        // Handle the alert
	    System.out.println( myalert.getText()); // Get the text of the alert
	        myalert.accept(); // Accept the alert

	        driver.quit();

	}

}
