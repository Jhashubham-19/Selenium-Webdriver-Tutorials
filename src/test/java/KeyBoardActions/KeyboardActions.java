/*
 * Keyboard actions 
 * keyDown(Keys.Button).sendKeys("A/B/C").perform();* 
 * keyUp(Keys.Button).perform();
 * 
 * Both these go in combined format
 */


package KeyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello");
		
		Actions act = new Actions (driver);
		
		// Ctrl + A  --- select all the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();   // Statement for ctrl + A
		
		// Ctrl + C ---- Copy the action
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();   // Statement for ctrl + C
		
		//tab -- Shift to next box
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// Ctrl + V  --- Paste action
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform(); // Statement for Ctrl + V
		
		// Ctrl+Shift+A
	//	act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();   
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
