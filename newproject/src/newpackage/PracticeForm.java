package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//validate isSelected and click
		WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));

		boolean isSelected = checkBoxSelected.isSelected();
		
		Thread.sleep(10);
		
		// perform the click operation if the element is not selected
		if(isSelected == false) {
			checkBoxSelected.click();
		}
		
		Thread.sleep(10);
		
		// validate isDisplayed and click
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();
			
		// perform the click operation if the element is displayed
		if(isDisplayed == true) {
			checkBoxDisplayed.click();	
			
		}
			
		Thread.sleep(10);
			
		// validate isEnabled and click
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
		boolean isEnabled = checkBoxEnabled.isDisplayed();
			
		// perform the click operation if the element is enabled
		if(isEnabled == true) {
			checkBoxEnabled.click();	
			
		}
		
	}

}
