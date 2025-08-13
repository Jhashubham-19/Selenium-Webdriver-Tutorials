package CssLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//Tag id CSS selector combination  ----- input#idvalue ---- input#small-searchterms
		
		//driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Laptop");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");
		
		//Tag Classname CSS selector combination
		
		//input.classnamevalue ----- input.search-box-text
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Laptop");
		
		//Tag Name CSS selector combination Tag and attribute comnbination --- tagname[attribute='value']
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Phone");
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Laptop");
		
		//Tag classname and attribute combination --- tagname.classname[attribute='value']
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Laptop");	
		//driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("Laptop");
		
		
		
		//*[@id="small-searchterms"]
		
		
	}

}
