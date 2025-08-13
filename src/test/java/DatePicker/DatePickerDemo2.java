package DatePicker;

import java.time.Duration;
import java.time.Month;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static Month convertToMonthObject(int monthNumber) {
	    switch (monthNumber) {
	    case 1: return Month.JANUARY;
        case 2: return Month.FEBRUARY;
        case 3: return Month.MARCH;
        case 4: return Month.APRIL;
        case 5: return Month.MAY;
        case 6: return Month.JUNE;
        case 7: return Month.JULY;
        case 8: return Month.AUGUST;
        case 9: return Month.SEPTEMBER;
        case 10: return Month.OCTOBER;
        case 11: return Month.NOVEMBER;
        case 12: return Month.DECEMBER;
	    default: throw new IllegalArgumentException("Invalid month number: " + monthNumber);
	    }
	}
	
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input dob
		String requiredyear = "1990";
		String requiredmonth = "January";
		String requiredday = "15";
		
	System.out.println(	 convertToMonthObject(1));
		
	}

}
