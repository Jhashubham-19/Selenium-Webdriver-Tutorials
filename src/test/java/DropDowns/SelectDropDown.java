/*
 * Select dropdown can be used by select class
 * Select class is used to select options from dropdown
 * Select class is available in org.openqa.selenium.support.ui package
 * Select class provides methods to select options from dropdown
 * selectByVisibleText() - select option by visible text
 * selectByValue() - select option by value
 * selectByIndex() - select option by index
 * 
 * <option value="value">Visible Text</option>  // option tag 
 
 */


package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement drpdownCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
	Select drpdownCountry = new Select(drpdownCountryElement);
	//Select option from dropdown by visible text
	//drpdownCountry.selectByVisibleText("India");  // Select India from dropdown by passing the visible text
	
	//Select option from dropdown by value
	//drpdownCountry.selectByValue("france"); // Select India from dropdown by passing the value
	
	//Select option from dropdown by index
	drpdownCountry.selectByIndex(2); // Select India from dropdown by passing the index -- need to count the index from 0 from dev-tool html
	
	//get all the options from dropdown
	List <WebElement> Options = drpdownCountry.getOptions();  // Get all the options in dropdown 
	System.out.println("Total number of options in dropdown: " + Options.size());
	/*
	for (int i = 0; i < Options.size(); i++) { // Get all the options in dropdown
		System.out.println("Option: " + Options.get(i).getText());
	}
	*/

	for (WebElement op : Options) {
		System.out.println("Op: " + op.getText());
	}
	
	Thread.sleep(2000); // Wait for 2 seconds
	driver.quit(); // Close the browser
	
	}

}
