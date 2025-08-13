package Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		// select specific checkbox
	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
		// select all checkboxes

	List <WebElement> Checkboxes	=	driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox' ]"));
	/*
	for(WebElement checkbox:Checkboxes) { // Get all the checkboxes in checkbox variable 
        checkbox.click();		
	}
	*/
	
	/*
	for(int i=0; i<3; i++) { // Get first three checkboxes
        Checkboxes.get(i).click();
	
	}
	*/
	
	// Select last three checkboxes: Total number of checkboxes-How many checkboxes you want to select == 7-3=4(starting index)
	
	for(int i=4; i<Checkboxes.size(); i++) { // Get last three checkboxes
        Checkboxes.get(i).click();
	
	}
	
	Thread.sleep(5000); // Wait for 5 seconds
	//Unselect all checkboxes
	
	for(int i=0; i<Checkboxes.size(); i++) { // Get all checkboxes
        Checkboxes.get(i).click();
	}
	driver.close(); // Close the browser
	}
}
