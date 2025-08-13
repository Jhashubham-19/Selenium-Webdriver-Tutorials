package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // Click on the dropdown button
		
		
		//Select single option from bootstrap dropdown
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//Capture all the options from the dropdown and size of the dropdown
		List <WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options in the dropdown: " + options.size());
		/*
		for (WebElement option : options) {
			System.out.println("Option: " + option.getText());
			
		}	
		*/
		//Select multiple options from bootstrap dropdown
		
		for (WebElement option : options) {
			if (option.getText().equals("Java") || option.getText().equals("Python") || option.getText().equals("MySQL")) { // Check if the option is "Java" or "Python")) {
				option.click(); // Select the option
				System.out.println("Selected option: " + option.getText());
			}
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
