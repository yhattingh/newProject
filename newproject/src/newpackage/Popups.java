package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//implicit wait - wait for a certain amount of time before it throws a no such element exception
		//default = 0
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicit wait - only for specific elements - and use conditions
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//another wait option
		WebElement wait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		System.out.println(wait1);
		
		driver.findElement(By.name("cusid")).sendKeys("abcdefg");
		driver.findElement(By.name("submit")).click();
		
		//switch to the popup alert
		Alert alert = driver.switchTo().alert();
		
		// capture alert msg
		String alertMsg = driver.switchTo().alert().getText();
		
		// Display msg on console
		System.out.println(alertMsg);
		
		//accept the alert
		alert.accept();
		//alert.dismiss();
		
		
		
		//explicit wait - 
		
		

	}

}
