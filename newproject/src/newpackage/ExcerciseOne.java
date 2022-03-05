package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		//driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		//select link Flights
		driver.findElement(By.linkText("Flights")).click();
		
		//click radio button One Way
		WebElement radio1 = driver.findElement(By.cssSelector("input[value='roundtrip']"));
		WebElement radio2 = driver.findElement(By.cssSelector("input[value='oneway']"));
		
		radio2.click();
		
		// select number of passengers 
		Select select = new Select(driver.findElement(By.name("passCount")));
				
		//print the options of the drop-down
		List<WebElement>lstPassCount=select.getOptions();
				
		//looping through the options and printing dropdown options
		System.out.println("Number of passengers available: ");
		for(WebElement options:lstPassCount)
			System.out.println(options.getText());
		
		//select the option as 2 passengers by index
		select.selectByIndex(1);
		System.out.println("Selected number of passengers: " + select.getFirstSelectedOption().getText());
		
		
		// select departing from Port
		Select selectFromPort = new Select(driver.findElement(By.name("fromPort")));
		
		//print the options of the drop-down
		List<WebElement>lstFromPort=selectFromPort.getOptions();
				
		//looping through the options and printing dropdown options
		System.out.println("Departing Ports are: ");
		for(WebElement options:lstFromPort)
			System.out.println(options.getText());
		
		//select the option by index
		selectFromPort.selectByIndex(1);
		System.out.println("Selected value from port: " + select.getFirstSelectedOption().getText());
		
		// select departure date
		Select selectDepartureMonth = new Select(driver.findElement(By.name("fromMonth")));
		Select selectDepartureDay = new Select(driver.findElement(By.name("fromDay")));
		
		//print the options of the drop-down
		List<WebElement>lstDepartureMonth=selectDepartureMonth.getOptions();
		List<WebElement>lstDepartureDay=selectDepartureDay.getOptions();
				
		//looping through the options and printing dropdown options
		System.out.println("The month options are: ");
		for(WebElement options:lstDepartureMonth)
			System.out.println(options.getText());
		
		//select the option by index
		selectDepartureMonth.selectByIndex(1);
		System.out.println("Selected departure date: " + select.getFirstSelectedOption().getText());
		selectDepartureDay.selectByIndex(15);
		
		
		// select arriving Port
		Select selectToPort = new Select(driver.findElement(By.name("toPort")));
		
		//print the options of the drop-down
		List<WebElement>lstToPort=selectToPort.getOptions();
				
		//looping through the options and printing dropdown options
		System.out.println("Arriving Ports are: ");
		for(WebElement options:lstToPort)
			System.out.println(options.getText());
		
		//select the option by index
		selectToPort.selectByIndex(3);
		System.out.println("Selected value To port: " + select.getFirstSelectedOption().getText());
		
		
		// select return date
		Select selectToMonth = new Select(driver.findElement(By.name("toMonth")));
		Select selectToDay = new Select(driver.findElement(By.name("toDay")));
		
		//print the options of the drop-down
		List<WebElement>lstToMonth=selectDepartureMonth.getOptions();
		List<WebElement>lstToDay=selectDepartureDay.getOptions();
				
		//looping through the options and printing dropdown options
		System.out.println("The month options are: ");
		for(WebElement options:lstToMonth)
			System.out.println(options.getText());
		
		//select the option by index
		selectToMonth.selectByIndex(2);
		System.out.println("Selected arrival date: " + select.getFirstSelectedOption().getText());
		selectToDay.selectByIndex(15);
			
		
		// select preferred class
		
		WebElement radio3 = driver.findElement(By.cssSelector("input[value='Coach']"));
		WebElement radio4 = driver.findElement(By.cssSelector("input[value='Business']"));
		WebElement radio5 = driver.findElement(By.cssSelector("input[value='First']"));
		
		radio5.click();
		
		
		// select airline
		Select selectAirline = new Select(driver.findElement(By.name("airline")));
		
		//print the options of the drop-down
		List<WebElement>lstAirlines=selectAirline.getOptions();
				
		//looping through the options and printing dropdown options
		System.out.println("Available airlines: ");
		for(WebElement options:lstAirlines)
			System.out.println(options.getText());
		
		//select the option by index
		selectAirline.selectByIndex(1);
		System.out.println("Selected airline: " + select.getFirstSelectedOption().getText());
		
		
		// submit
		driver.findElement(By.name("findFlights")).click();
		
	}

}
