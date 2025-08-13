/*
 * This is a Java program that demonstrates how to handle frames in Selenium WebDriver.
 * It uses the ChromeDriver to open a specific URL that contains multiple frames.
 * The program switches between different frames to interact with elements within those frames.
 * driver.switchTo().frame() method is used to switch to a specific frame.
 * driver.switchTo().defaultContent() method is used to switch back to the main content.
 * driver.switchTo().frame(WebElement) method is used to switch to a frame using a WebElement.
 * driver.switchTo().frame(index) method is used to switch to a frame using its index.
 * driver.findElement(By.xpath()) method is used to locate elements within the frames.
 * 
 * 3 types of switching commands are used:
 *
 * Browser switch commands
 * 1.driver.switchTo().window(windowId/window handle) - Switch to a specific window using its ID.)
 * 
 * Alert switch commands
 * driver.switchTo().alert() - Switch to an alert box
 * driver.switchTo().alert().accept() - Accept the alert box
 * driver.switchTo().alert().dismiss() - Dismiss the alert box
 * driver.switchTo().alert().getText() - Get the text of the alert box
 * 
 * Frame switch commands
 * driver.switchTo().frame(WebElement) - Switch to a frame using a WebElement
 * driver.switchTo().frame(index) - Switch to a frame using its index
 * driver.switchTo().defaultContent() - Switch back to the main content
 * driver.switchTo().parentFrame() - Switch back to the parent frame
 * driver.switchTo().frame(frameName) - Switch to a frame using its name
 * driver.switchTo().frame(frameId) - Switch to a frame using its ID
 * driver.switchTo().frame(frameIndex) - Switch to a frame using its index
 * driver.switchTo().frame(frameElement) - Switch to a frame using a WebElement
 */


package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	    driver.switchTo().frame(frame1);  // Switch to the first frame using WebElement 
	    Thread.sleep(1000); // Wait for 2 seconds to ensure the frame is loaded
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
	    
	    driver.switchTo().defaultContent(); // Switch back to the main content
		
	    //Frame 2
	    WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	    driver.switchTo().frame(frame2);  // Switch to the second frame using WebElement
	    Thread.sleep(1000); // Wait for 2 seconds to ensure the frame is loaded
	    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
	    
	    driver.switchTo().defaultContent(); // Switch back to the main content
	    
	    //Frame 3
	    WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    driver.switchTo().frame(frame3);  // Switch to the third frame using WebElement
	    Thread.sleep(2000); // Wait for 2 seconds to ensure the frame is loaded
	    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
	    //inner iframe part of frame 3
	    driver.switchTo().frame(0); // Switch to the first frame using index
	    
	  //  driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
	WebElement   myrdbutton= driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();",myrdbutton);
	    
	    driver.switchTo().defaultContent();
	    try {
	    //Frame 5 --- Assignment
	    WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	    driver.switchTo().frame(frame5);  // Switch to the fifth frame using WebElement
	    Thread.sleep(2000); // Wait for 2 seconds to ensure the frame is loaded
	    driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
	    Thread.sleep(2000);
	   // driver.switchTo().parentFrame(); // Switch back to the parent frame;
	   // driver.get("https://ui.vision/"); // Switch to the main content
	    // Switch to the new window
	 // WebElement  iframe_5 =driver.findElement(By.xpath("/html[1]/frameset[1]/frame[2]"));
	  //  driver.switchTo().frame(iframe_5); // Switch to the iframe using WebElement);
	   boolean imagePresent = driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp' and @class='responsive-img']")).isDisplayed();
	       System.out.println("Image present: " + imagePresent);
	    }
	    catch(Exception e) {
	    	System.out.println("Frame 5 is not present");
	    }
	    
	    Thread.sleep(1000); // Wait for 5 seconds
		driver.quit(); // Close the browser
		
		// Switch to the first frame using index
		

	}

}
