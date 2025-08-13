package Table;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AssignmentStaticTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		// Select departure city
		  WebElement departureCity = driver.findElement(By.xpath("//select[@name='fromPort']"));
		  Select departureSelect = new Select(departureCity);
		  departureSelect.selectByVisibleText("Paris");
		  
		  // Select destination city
		  WebElement destinationCity = driver.findElement(By.xpath("//select[@name='toPort']"));
		  Select destinationSelect = new Select(destinationCity);
		  destinationSelect.selectByValue("Buenos Aires");
		  Thread.sleep(2000);
		  // Click on the Find Flights button
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
		  // Print the total rows in the table
		  int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		  System.out.println("Total rows in the table: " + rows);
		  
		  //Print the total columns in the table
		  int columns = driver.findElements(By.xpath("//table[@class='table']//tr[1]/th")).size();
		  System.out.println("Total columns in the table: " + columns);
		  
		  // Print the header of the table
			for (int i = 1; i <= columns; i++) {
				String header = driver.findElement(By.xpath("//table[@class='table']//tr[1]/th[" + i + "]")).getText();
				System.out.print(header + "\t");
			}
			System.out.println();
		// Print the Price column data of the table  
	       int PricesSize = driver.findElements(By.xpath("//table[@class='table']//tr/td[6]")).size();
	       System.out.println("Prices size" + PricesSize);
	    // Print the data of the Price column
	    List<WebElement> Prices = driver.findElements(By.xpath("//table[@class='table']//tr/td[6]"));
		//Define an ArrayList to store the price values in sorted order
	    List <String> priceValues =new ArrayList <String>();

		//Logic to store the price values in the ArrayList in sorted order
		for (WebElement price : Prices) {
			String priceText = price.getText().replace("$", "").trim(); //Remove $ symbol and trim spaces
			priceValues.add(Double.parseDouble(priceText)+ " "); //Convert to double and add to ArrayList);
		
			
			//priceValues.sort(null);	
			
		}
		
		String minPrice = Collections.min(priceValues);  // Get the minimum price from the list
		int minPriceIndex = priceValues.indexOf(minPrice); // Get the index of the minimum price
		System.out.println("Minimum Price: " + minPrice);
		System.out.println("Minimum Price Index: " + minPriceIndex);
		System.out.println("Sorted Price Values: " + priceValues);
		priceValues.get(0);
		// Print the first value of the sorted price
		System.out.println("Pricevalues index of 0: "+ priceValues.get(0));  
			List<WebElement> chooseFlight = driver.findElements(By.xpath("//input[@value='Choose This Flight']"));
			Thread.sleep(2000);
			chooseFlight.get(minPriceIndex).click(); // Click on the Choose This Flight button for the lowest price		
			
			
		
		
	
	       
	    //Sort the ArrayList in descending order
	               priceValues.sort((a, b) -> b.compareTo(a));  /// logic to sort array list in descending order
	               System.out.println("Sorted Price Values in descending order: " + priceValues);
	       
	     //choose the flight with lowest price selected......................................................................
	               
	               
	       //Fill up the form with the required details   
	               Thread.sleep(2000);
	               
	       driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("John Doe");
	       driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 Main St");
	       driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New York");
	       driver.findElement(By.xpath("//input[@id='state']")).sendKeys("NY");
	       driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("10001");
	       
	       
	       Select dropdownCard = new Select(driver.findElement(By.xpath("//select[@id='cardType']")));
	       dropdownCard.selectByVisibleText("Visa");

	       
	       driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("4111111111111111");
	       driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("12");
	       driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2025");
	       driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("John Doe");
	       driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       
	       
	       // Verify the success message
	         
	       boolean SuccessMessage = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed();
	       System.out.println("Flight is booked successfully");
	       System.out.println("Success message is displayed: " + SuccessMessage);
	       Thread.sleep(5000);       
		   driver.quit();
		  
		
		

	}

}
