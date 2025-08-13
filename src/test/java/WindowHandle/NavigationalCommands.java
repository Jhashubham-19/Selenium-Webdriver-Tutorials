package WindowHandle;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// Navigational commands in Selenium WebDriver
		// 1. navigate().to() - to open a URL
		// 2. navigate().back() - to go back to the previous page
		// 3. navigate().forward() - to go forward to the next page
		// 4. navigate().refresh() - to refresh the current page
		// 5. navigate().to("URL") - to open a URL in a new tab
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		//driver.get("https://demo.nopcommerce.com"); // Open a URL using get() method -- only accept URL in String format
		
		//URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to(myurl);  // Open a URL using URL object
		driver.navigate().to("https://demo.nopcommerce.com"); // Open a URL using String
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.navigate().back(); // Go back to the previous page
		System.out.println(driver.getCurrentUrl()); // Print the current URL
		driver.navigate().forward(); // Go forward to the next page
		System.out.println(driver.getCurrentUrl()); // Print the current URL
		driver.navigate().refresh(); // Refresh the current page
		
	}

}
