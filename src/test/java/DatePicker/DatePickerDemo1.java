package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
	
	//Method to Future date --------------------------------------------------------------------------------------------------------------------------
	static void selectFutureDate(WebDriver driver, String month, String year ,String day) {
		
		// Method to select month and year
		// This method is not used in the main method but can be used for future reference
		//Select month and year
		
		while (true) {
        String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            
		if (currentMonth.equals(month) && currentYear.equals(year)) {
			break; // Exit the loop if the desired month and year are found
			}
		else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Click next button for next month 
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Click previous button for previous month
			}
		}
		// Select date ------------------------------
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(day)) {
			dt.click(); // Click on the desired date
			break; // Exit the loop after selecting the date
			}
		}
	} // End of selectFutureDate Method ------------------------------------------------------------------------------------------------------------
	
    //Method to Past date ----------------------------------------------------------------------------------------------------------------------------
	static void selectPastDate(WebDriver driver, String month, String year ,String day) {
			
			// Method to select month and year
			// This method is not used in the main method but can be used for future reference
			//Select month and year
			
			while (true) {
	        String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	        String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	            
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break; // Exit the loop if the desired month and year are found
				}
			else {
					//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Click next button for next month 
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Click previous button for previous month
				}
			}
			// Select date ------------------------------
			List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			for (WebElement dt : allDates) {
				if (dt.getText().equals(day)) {
				dt.click(); // Click on the desired date
				break; // Exit the loop after selecting the date
				}
			}
		} // End of selectPastdate Method --------------------------------------------------------------------------------------------------------
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// Switch to the iframe containing the date picker
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//Method 1 by using sendKeys
		//WebElement DateInput = driver.findElement(By.id("datepicker"));
		//DateInput.sendKeys("04/19/2024");  //mm/dd/yyyy
		
		//driver.switchTo().defaultContent(); // Switch back to the default content
		
		//Method 2 by using click
		WebElement DateInput = driver.findElement(By.id("datepicker"));
		DateInput.click(); // Click on the date input field it will open the date picker

		String year = "2024"; // Select year
		String month = "December"; // Select month
		String day = "19";	 // Select date
		//selectFutureDate(driver, month, year, day); // Call the method to select future date	
		selectPastDate(driver, month, year, day); // Call the method to select past date
		
		
		driver.switchTo().defaultContent(); // Switch back to the default content
		
		Thread.sleep(2000); // Wait for 2 seconds
		driver.quit(); // Close the browser
	}
	} // End of main method

