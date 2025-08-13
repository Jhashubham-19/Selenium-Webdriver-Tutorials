package WindowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Handle Browser Windows in Selenium WebDriver
		// 1. getWindowHandle() - to get the current window handle
		// 2. getWindowHandles() - to get all the window handles
		// 3. switchTo().window() - to switch to a specific window
		// 4. close() - to close the current window
		// 5. quit() - to close all the windows

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set <String> windowIds=driver.getWindowHandles(); // Get all the window handles
        
		//Approach 1: Using Set<String> to ArrayList <String>
		/*
		List <String> WindowhandlesList =new ArrayList<String>(windowIds); // Convert the Set to List
		String parentWindowId=WindowhandlesList.get(0); // Get the parent window ID
		String childWindowId=WindowhandlesList.get(1); // Get the child window ID
		
		//Switch to child window
		driver.switchTo().window(childWindowId); // Switch to the child window - by passing the child window ID
		System.out.println(driver.getTitle()); // Print the title of the child window
		
		//Switch to parent window
		driver.switchTo().window(parentWindowId); // Switch to the parent window - by passing the parent window ID
		System.out.println(driver.getTitle()); // Print the title of the parent window
		*/
		
		//Approach 2: Using for-each loop
		for (String windowId : windowIds) {
			String title =driver.switchTo().window(windowId).getTitle(); // Switch to the window and get the title
			System.out.println(title); // Print the title of the window
			
			if (title.equals("OrangeHRM")) { // Check if the title is "OrangeHRM"
				System.out.println(driver.getTitle()); // Get the title of the window
			}
		}
	}

}
