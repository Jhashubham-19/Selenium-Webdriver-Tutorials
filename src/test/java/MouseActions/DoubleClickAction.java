/*
 * Mousehover  -- moveToElement(element)
 * Right click -- contextClick(element)
 * Double click -- doubleClick(element)
 * Drag and drop -- dragAndDrop(source, target)
 * 
 */

package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		// Switch to the iframe
		driver.switchTo().frame("iframeResult");
		
		WebElement Box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		Box1.clear(); // Clear the text field before sending keys
		Box1.sendKeys("Welcome"); // Click on the button to copy text
		
		WebElement Box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		// Perform double-click action
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		actions.doubleClick(element).perform();   //	 Double-click on the element
		// Get the text of the element
		String Box2Text = Box2.getText(); // Get the text of the Box2 ---- This will be empty as no inner text is present for box 2 in the DOM, or say Web tool
		System.out.println("Box 2 Text: " + Box2Text);  //Print empty string
		String Box2TextCopied = Box2.getAttribute("value"); // Get the value of the input field
		System.out.println("Text copied: " + element.getText());
		
		String TextCopied = element.getText();
		if(Box2TextCopied.equals("Welcome")) {
			System.out.println("Text copied successfully"); // Click on the button to copy text
		} else {
			System.out.println("Text not copied successfully");
		}
		
		
		
		Thread.sleep(2000);
		// Close the browser
		driver.quit();
		
	}

}
