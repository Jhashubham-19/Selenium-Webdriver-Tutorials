package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		
		//to perform the action on the slider using mouse action
		Actions action = new Actions(driver);
		
		//Min Slider operations ---------------------------------------------
		// Get the initial position of the slider
		System.out.println( "Location of the min slider before moving: "+ min_slider.getLocation());  // Get the location of the slider -- (59,257) --- (x,y)
		System.out.println( "Location of the max slider: "+ max_slider.getLocation());  // Get the location of the slider -- (59,257) --- (x,y)
		
		// Move the slider to the right by 100 pixels
		action.dragAndDropBy(min_slider, 100, 249).perform();
		
		// Get the new position of the slider
		System.out.println( "Location of the min slider after moving: "+ min_slider.getLocation());  // Get the location of the slider -- (59,257) --- (x,y)
		
		
		//Max Slider operations ---------------------------------------------
		max_slider.getLocation();
		System.out.println( "Location of the min slider before moving: "+ max_slider.getLocation());  // Get the location of the slider -- (59,257) --- (x,y)
		System.out.println( "Location of the max slider: "+ max_slider.getLocation());  // Get the location of the slider -- (59,257) --- (x,y)
		
		// Move the slider to the right by 100 pixels
		action.dragAndDropBy(max_slider, -67, 249).perform();
		
		// Get the new position of the slider
		System.out.println( "Location of the max slider after moving: "+ max_slider.getLocation());  // Get the location of the slider -- (59,257) --- (x,y)
		Thread.sleep(2000);
		driver.quit();
	}

}
