/*
 * Web Tables
 * -----------------
 * 1. Static Table
 * 2. Dynamic Table
 * 3. Table with Pagination
 * r=2
 * c=3
 * ----- Pass variables in xpath:   //table[@name='BookTable']//tr["+r+"]//td["+c+"]
 * 
 * 
 */



package Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		
		// Static Table
		// 1. Get the row count
		// 2. Get the column count
		// 3. Get the cell value
		// 4. Get the entire row
		// 5. Get the entire column

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		//1. find the number of columns
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();    //multiple table present in the webpage
		System.out.println("Number of rows: " + rows);
		
		//int rows = driver.findElements(By.tagName("tr")).size();  //single table present in the webpage	
		//System.out.println("Number of rows: " + rows);
		
		//2. find the number of columns
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size(); //multiple table present in the webpage
		System.out.println("Number of columns: " + columns);
		
		int cols = driver.findElements(By.tagName("th")).size();  //single table present in the webpage
		System.out.println("Number of columns: " + cols);
		
		//3. Read data from specific row and column (ex: 5th row and 1st column)
		
		String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText(); //multiple table present in the webpage
		System.out.println("Cell value: " + BookName);
		
		String Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText(); //multiple table present in the webpage
		System.out.println("Subject value: " + Subject);

		
		//4. Read data from all the rows and columns , started from second row because first column contains th tag, and rest other rows contains td tag
		/*
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				String cellValue = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]")).getText(); // multiple																														
				System.out.print(cellValue + "  ");
			}
			System.out.println();
		}
		*/
		
		
		//5. Print book names where author is Mukesh
		for (int i =2; i<=rows; i++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]")).getText();
			//System.out.println("Author name: " + authorName);
			if(authorName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[1]")).getText();
				System.out.println("Book name: " + bookName + "  Author name: " + authorName);
				//System.out.println("Author name: " + authorName);
			}
		}
		
		//6. Print total price of all the books
		int totalPrice = 0;
		for (int i=2; i<=rows; i++) {
			String price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText();
			totalPrice = totalPrice + Integer.parseInt(price);
		}
		System.out.println("Total Price:" + totalPrice);
		driver.quit();
	}

}
