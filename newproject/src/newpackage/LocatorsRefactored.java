package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRefactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String baseUrl = "https://demoqa.com/";
		String practiceUrl = "https://demoqa.com/automation-practice-form";
		String guruUrl = "https://demo.guru99.com/test/newtours/";
		
		//driver.get(baseUrl);
		
		// Locate by ID attribute
		driver.get(practiceUrl);
		WebElement firstName = driver.findElement(By.id("firstName"));
//		boolean isDisplayedStatusOfFirstName = firstName.isDisplayed();
//		boolean isEnabledStatusOfFirstName = firstName.isEnabled();
//		System.out.println(isDisplayedStatusOfFirstName + " " + isEnabledStatusOfFirstName);
		
		driver.findElement(By.id("firstName")).sendKeys("Yolande");
		driver.findElement(By.id("lastName")).sendKeys("Hattingh");
		driver.findElement(By.id("lastName")).clear();
				
		WebElement gender = driver.findElement(By.name("gender"));
		boolean isGenderSelected = gender.isSelected();
		System.out.println(isGenderSelected);
		gender.click();
		boolean isGenderSelectedAfterClick = gender.isSelected();
		System.out.println(isGenderSelectedAfterClick);
		
		
		
		// Locate by Name attribute
		driver.findElement(By.name("gender")).click();
				
		// Locate by ClassName attribute
		driver.findElement(By.className("practice-form-wrapper"));
		driver.findElement(By.className("left-pane"));
	
		
		// Locate by cssSelector attribute
		driver.findElement(By.cssSelector("input[id='firstName']"));
		driver.findElement(By.cssSelector("input[id='lastName']"));
		
		// Locate by xpath (//(because we are finding it relatively) current node + tagname (e.g. input, div, image) + selects attribute (@) + attribute name + value
		driver.findElement(By.xpath("//input[@id='firstName']"));
		driver.findElement(By.xpath("//input[@id='lastName']"));
		
	
		// Locate by Linktext and partial link text
		
		driver.get(guruUrl);
		WebElement textCheck = driver.findElement(By.linkText("SUPPORT"));
		String checkLinkText = textCheck.getText();
		System.out.println(checkLinkText);
		
//		driver.findElement(By.partialLinkText("SU"));
//		driver.findElement(By.linkText("CONTACT"));
//		driver.findElement(By.partialLinkText("CONT"));
//		driver.findElement(By.name("userName"));
	}

}
