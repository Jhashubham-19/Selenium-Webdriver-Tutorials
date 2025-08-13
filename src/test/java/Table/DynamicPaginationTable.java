package Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo3x.opencartreports.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		// Login to the application
		 WebElement username = driver.findElement(By.id("input-username"));
		 username.clear();
		 username.sendKeys("demo");
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		// Navigate to the Customers > Customers page
		//driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-customer']")));
	    driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click();
		
		Thread.sleep(1000);
		WebElement Pagination = driver.findElement(By.xpath("//div[contains(text(),'Pages')]"));
		String paginationText = Pagination.getText();
		System.out.println("Pagination Text: " + paginationText);
		// Extract the total number of pages from the pagination text and store it in an integer variable
	    int totalPages = Integer.parseInt(paginationText.substring(paginationText.indexOf("(")+1, paginationText.indexOf("Pages")-1));
	 // Get the total number of pages
	     System.out.println("Total Pages: " + totalPages);
	            
	  // For repeating pages
        for (int i = 1; i <= totalPages; i++) {
			if (i > 1) {
				  WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + i + "]"));
						activePage.click();
						System.out.println("Clicked on page: " + i);
			}
			
			//reading data from the page
			List <WebElement> table = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr"));
			
			int totalrows = table.size();
			for (int j = 1; j <= totalrows; j++) {
				WebElement Customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+j+"]//td[2]"));
				//System.out.print("Customer name " + j + ": " + Customername.getText());
				WebElement EmailId = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+j+"]//td[3]"));
				//System.out.println(" Email ID  " + j + ": " + EmailId.getText());
				System.out.println("Customer name " + j + ": " + Customername.getText() + " Email ID  " + j + ": " + EmailId.getText());
			}
			
			System.out.println("Total rows in page " + i + ": " + table.size());
        }
		
		
		
		
		
		Thread.sleep(5000);
		
		//Close the window
		driver.quit();
	}

}
