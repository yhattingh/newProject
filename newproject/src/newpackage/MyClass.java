package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//instantiate chrome driver class
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyClass {

	public static void main(String[] args) {
			
		//Declaration and instantiation of objects and variables
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//launch Chrome driver and direct it to the Base URL
		driver.get(baseUrl); //get = go to url
		
		// get the actual value of the title - note this it the tab's title*********
		actualTitle = driver.getTitle();
		
		//compare the actual title of the page with the expected one and print
		//the result as "passed" or "failed"
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}   else {
			System.out.println("Test failed");
		}

		//close
		driver.close();
		
		//play on https://demoqa.com/automation-practice-form
//		driver.findElement(By.id("firstName"));
//		driver.findElement(By.name("gender"));
//		driver.findElement(By.className("practice-form-wrapper"));
//		driver.findElement(By.linkText("SUPPORT")); //https://demo.guru99.com/test/newtours/ 
//		driver.findElement(By.partialLinkText("SUP"));//https://demo.guru99.com/test/newtours/
//		driver.findElement(By.tagName("a"));
//		driver.findElement(By.cssSelector("input[id='userName'][type='text']"));
//		driver.findElement(By.cssSelector("input[id='userName']")); // use css for cross browser testing
//		driver.findElement(By.xpath("//input[@id='userName']")); //use relative path and not absolute path - very precise, but slower than css - not for cross browser testing
		
		
		
		
		

	}

}
