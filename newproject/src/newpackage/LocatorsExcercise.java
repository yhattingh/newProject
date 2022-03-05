package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class LocatorsExcercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String guruUrl = "https://demo.guru99.com/test/login.html";
		String expectedTitle = "Login Page";
		String actualTitle = "";
				
		driver.get(guruUrl);
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Page title = " + actualTitle + " " + "This means that Test 1 Passed");
		}   else {
			System.out.println("Test 1 failed");
		}
		
		driver.findElement(By.id("email")).sendKeys("yolande.hattingh@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		if(driver.getPageSource().contains("Successfully Logged in..."))
		  {
		    System.out.println("Pass");
		  }
		else
		  {
		    System.out.println("Fail");
		  }
		
		driver.close();

	}

}
