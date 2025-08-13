/*
 * Actions vs Action
 * Actions:
 * Actions is a class that provides methods to perform complex user interactions like drag and drop, mouse hover, etc.
 * It is available in org.openqa.selenium.interactions package.
 * It is used to perform actions on web elements.
 * It is used to perform actions like mouse hover, drag and drop, double click, right click, etc.
 * It is used to perform actions on web elements.
 * It is used to perform actions like mouse hover, drag and drop, double click, right click, etc.
 * It is used to perform actions on web elements.
 * 
 * Action:
 * Action is an interface that represents a single user interaction.
 * It is available in org.openqa.selenium.interactions package.
 * It is used to store created actions.
 *
 
 */

package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		// Perform right-click action on the button
	Actions action = new Actions(driver); 
	// action.contextClick(button).perform();              ---------- can be performed in this way as well
	// action.contextClick(button).build().perform();     ---------- can be performed in this way as well
	Action act= action.contextClick(button).build();  // Action interface is used to store the created action using build() method
	act.perform();    // perform() method is used to execute the action on the Action interface variable
		
	}

}
