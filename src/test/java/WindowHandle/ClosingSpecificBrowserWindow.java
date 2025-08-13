package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set <String> windowIds=driver.getWindowHandles(); // Get all the window handles
		
		for(String winid:windowIds) {
		String Title =driver.switchTo().window(winid).getTitle(); // Switch to the window
			System.out.println(Title); // Print the title of the window
			if (Title.equals("Human Resources Management Software | OrangeHRM HR Software")|| Title.equals("Some other window title")) { // Check if the title is "OrangeHRM"
				System.out.println(driver.getTitle()); // Get the title of the window
				driver.close(); // Close the current window
			}
		}
	}

}
