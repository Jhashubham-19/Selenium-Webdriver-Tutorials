package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		
		
		// //*[@id="small-searchterms"]  --- Syntax for relative xpath
		// //tagname[@attribute='value']  --- Syntax for relative xpath
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		// xpath with the single attribute
		//driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("Laptop");
		
		
		// xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@id='small-searchterms'] [@name='q']")).sendKeys("Laptop");
		
		// xpath with 'and' 'or' operators --- combination of multiple attributes
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Laptop");
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("Laptop");
		
		// xpath with inner text  -- xpath(tagname[text()='value'])
		//driver.findElement(By.xpath("//a[(text()='Computers ')]")).click();
		
		/*
		boolean displaystatus=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(displaystatus);
		
		if (displaystatus == true) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
		}
		
		String text=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(text);
		
		if (text.equals("Welcome to our store")) {
			System.out.println("Text is matched");
		} else {
			System.out.println("Text is not matched");
		}
		*/
		
		// xpath with contains() function -- xpath(tagname[contains(@attribute,'value')])
		//driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("Laptop");
		
		// xpath with starts-with() function -- xpath(tagname[starts-with(@attribute,'value')])
		//driver.findElement(By.xpath("//input[starts-with(@id,'small-searchterms')]")).sendKeys("Laptop");
		
		// chained xpath -- xpath(tagname1/tagname2) -- //div[@class='header-menu']/ul/li/a		
	}
	
	
	

}
