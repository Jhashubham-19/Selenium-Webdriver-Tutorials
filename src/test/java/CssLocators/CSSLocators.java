package CssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// Tag id Css Selector combination ---- input#idValue ---- input#small-searchterms
		 driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");
		

	}

}
