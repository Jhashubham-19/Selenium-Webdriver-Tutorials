package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement checkbox =driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
	//	checkbox.click(); // Click on the checkbox
	
	for(int j=1;j<=4;j++) {
		
		driver.findElement(By.xpath("//a[normalize-space()='" + j + "']")).click();
		Thread.sleep(2000);
		for (int i=8; i<=12;i++) { // Get all the checkboxes in checkbox variable 
            WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[" +i+ "]"));
            checkbox.click();
          boolean result = checkbox.isSelected();
          System.out.println(result);
        }
	}
	
		
	
	Thread.sleep(5000);
	driver.quit();
		

	}

}
