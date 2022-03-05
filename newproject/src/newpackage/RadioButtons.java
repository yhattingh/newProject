package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//using driver
//		driver.findElement(By.id("vfb-7-1")).click();
//		driver.findElement(By.id("vfb-6-0")).click();
//		System.out.println("Radio button 1 and checkbox 1 selected");
		
		
		
		// Get the element locators for the radio buttons using WebElement
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		//select radio button 2
		radio2.click();
		System.out.println("Radio Button Option 2 selected");
		
		//toggle
		radio1.click();
		System.out.println("Radio Button Option 1 selected");
		
		// Get the element locators for the checkboxes using WebElement
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));
		WebElement option3 = driver.findElement(By.id("vfb-6-2"));
		
		//select option 1
		option1.click();
		option2.click();
		
		if(option3.isSelected()) {
			System.out.println("Option 3 toggled on");
		} else {
			System.out.println("Option 3 toggled off");
		}
		
		//driver.close();

	}

}
