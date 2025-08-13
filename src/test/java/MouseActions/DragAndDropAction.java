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

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://www.htmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(rome, italy).perform();
		
		System.out.println("Drag and drop action performed successfully");
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
