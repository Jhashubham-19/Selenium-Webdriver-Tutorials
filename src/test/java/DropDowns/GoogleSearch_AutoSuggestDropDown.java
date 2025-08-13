package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//
	List <WebElement> listoptions	=driver.findElements(By.xpath("//ul[@role='listbox' ]//li//div[@role='option']")); 
	
	    System.out.println("Number of options: " + listoptions.size());
	   
		for (int i = 0; i < listoptions.size(); i++) {

			System.out.println("Option: " + listoptions.get(i).getText());
			if (listoptions.get(i).getText().equalsIgnoreCase("selenium")) {
				listoptions.get(i).click();
				
				break;
			}

		}
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
