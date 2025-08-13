package ConditionalAndGetMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 driver.getTitle();
		 System.out.println(driver.getTitle());
		 driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 
		//System.out.println( driver.getPageSource());
		// String windowid= driver.getWindowHandle();
		// System.out.println(windowid);
		 Set <String> WindowIds= driver.getWindowHandles();
		 System.out.println(WindowIds);
		 
		 //driver.manage().window().maximize();
		 
		 //driver.quit();

		// WebElement element = driver.findElement(By.id("small-searchterms"));
		// System.out.println(element.isDisplayed());

		// WebElement element = driver.findElement(By.id("small-searchterms"));
		// System.out.println(element.isEnabled());

		// WebElement element = driver.findElement(By.id("small-searchterms"));
		// System.out.println(element.isSelected());

		// WebElement element = driver.findElement(By.id("small-searchterms"));
		// System.out.println(element.getText());

		// WebElement element = driver.findElement(By.id("small-searchterms"));
		// System.out.println(element.getAttribute("value"));

	}

}
