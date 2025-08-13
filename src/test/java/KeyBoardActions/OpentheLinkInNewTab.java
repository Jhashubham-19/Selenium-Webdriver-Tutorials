package KeyBoardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Open the link in a new tab
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions actions = new Actions(driver);
		// Perform a right-click on the link
		actions.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).build().perform();
		
		// Switch to the Registration tab
		List <String> ids = new ArrayList (driver.getWindowHandles());
		driver.switchTo().window(ids.get(1)); // Switch to the new tab - by passing the new tab ID
		ids.get(1);
		
		
		// Switch to the main page
		driver.switchTo().window(ids.get(0)); // Switch to the main page - by passing the main page ID
		System.out.println(ids);
		System.out.println(ids.get(1));
		
		
		
	}

}
