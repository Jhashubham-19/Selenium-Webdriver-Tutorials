package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement bankTarget= driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		WebElement bankAmount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement bankAmountTarget = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement salesTarget = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		WebElement salesAmount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement salesAmountTarget = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		// Perform drag and drop actions
		Actions action = new Actions(driver);
		action.dragAndDrop(bank, bankTarget).build().perform();
		action.dragAndDrop(bankAmount, bankAmountTarget).build().perform();
		action.dragAndDrop(sales, salesTarget).build().perform();
		action.dragAndDrop(salesAmount, salesAmountTarget).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
