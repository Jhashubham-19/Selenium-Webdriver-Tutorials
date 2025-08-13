package Alerts;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import java.util.List;

public class Testassignmentcheckboxes {

public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/"); // Open the URL
    driver.manage().window().maximize(); //	 Maximize the browser window

    for (int j = 1; j <= 4; j++) {
        driver.findElement(By.xpath("//a[normalize-space()='" + j + "']")).click();  // Click on the page link
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 7; i < 12; i++) { // Adjusted to match the 8th to 12th checkboxes
            WebElement checkbox = checkboxes.get(i);
            checkbox.click();
            boolean result = checkbox.isSelected();
            System.out.println(result);
        }
    }

    driver.quit();
}
}

