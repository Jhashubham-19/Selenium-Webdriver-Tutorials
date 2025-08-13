package WindowHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement> elements =driver.findElements(By.xpath("//*[@id='Wikipedia1_wikipedia-search-results']/a"));
		System.out.println("Number of search results: " + elements.size());
		for (WebElement element : elements) {
            System.out.println("Search result: " + element.getText());
        }

	}

}




