package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearch_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("bjs.com");
		driver.manage().window().maximize();
		driver.get("https://www.bjs.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("Trimmer");
		Thread.sleep(2000);

		 List<WebElement> elements = driver.findElements(By.xpath("//a[@auto-data='searchBar_searchRedirectedPage']"));

		System.out.println("Number of search results: " + elements.size());
	//	System.out.println("Number of search results: " + elements.size().get(i).getText());
		
	for (int i = 0; i < elements.size(); i++) {
		System.out.println("All Search result: " + elements.get(i).getText());
	}
		
		for(int i=0; i<elements.size();i++) {
			System.out.println("Search result: " + elements.get(i).getText());
			if (elements.get(i).getText().contains("hedge trimmer") && elements.get(i).getAttribute("href") != null ){
				elements.get(i).click();
				
				break;
			}
			

		}
		
		

		// for (WebElement element : elements) {
		// System.out.println("Search result: " + element.get(i).getlinkText());
		// }
		Thread.sleep(2000);
		 driver.quit();

	}

}
