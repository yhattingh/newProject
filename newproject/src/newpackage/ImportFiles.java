package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ImportFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.monsterindia.com/seeker/registration";
		
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.get(baseUrl);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		//upload the file
		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		browse.sendKeys("C:\\tmp\\notes.docx");
		System.out.println("File uploaded successfully");
		
		

	}

}
