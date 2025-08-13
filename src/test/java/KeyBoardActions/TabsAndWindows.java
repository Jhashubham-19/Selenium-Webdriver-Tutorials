package KeyBoardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		//driver.switchTo().newWindow(WindowType.TAB);  // open new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // open new window
		
		driver.get("https://orangehrmlive.com");
		
		Thread.sleep(2000);
		//driver.quit(); // Close the browser
	}

}
