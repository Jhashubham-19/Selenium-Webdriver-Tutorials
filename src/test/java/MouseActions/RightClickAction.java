/*
 * Mousehover  -- moveToElement(element)
 * Right click -- contextClick(element)
 * Double click -- doubleClick(element)
 * Drag and drop -- dragAndDrop(source, target)
 * 
 */






package MouseActions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		// Right click on the button
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		//Click on copy option
		WebElement copyOption = driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-copy')]"));
		copyOption.click();
		
		Thread.sleep(2000);
		// close alert window
		// Switch to alert
		Alert alert = driver.switchTo().alert();
		// Get alert text
		String alertText = alert.getText();
		System.out.println("Alert text: " + alertText);
        alert.accept();
        
        driver.quit();
        
		
	}

}
