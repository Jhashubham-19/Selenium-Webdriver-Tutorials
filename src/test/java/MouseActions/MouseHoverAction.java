/*
 * Mousehover  -- moveToElement(element)
 * Right click -- contextClick(element)
 * Double click -- doubleClick(element)
 * Drag and drop -- dragAndDrop(source, target)
 * 
 */

package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement computersLink = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")); // Locate the "Computers" link in the main menu
		WebElement notebookLink = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")); // Locate the "Notebooks" link submenu of "Computers"
		Thread.sleep(2000); // Wait for 2 seconds to ensure the page is loaded
		// Perform mouse hover action
		// Use Actions class to perform mouse hover
		Actions act = new Actions(driver);
		act.moveToElement(computersLink).moveToElement(notebookLink).click().build().perform(); // Move to the "Desktops" link then Move to the "Mac" link

	}

}
