package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//Number of imagees in the specific iframe
		
//		int totalBeforeSwitch = driver.findElements(By.xpath("html/body/a/img")).size();// all images are in frames and count will be 0
//		System.out.println("total images " + totalBeforeSwitch);
//		driver.switchTo().frame("a077aa5e"); //switching the frame by ID
//		int totalAfterSwitch = driver.findElements(By.xpath("html/body/a/img")).size();
//		System.out.println("total images after switch " + totalAfterSwitch);
		
	
		//Find the number of iframes on the web page:
		//Notice exception error when exe this code - the page is dynamic and the size changes all the time
		int sizeOfIframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println(sizeOfIframe);
		
		for(int i = 0; i <= sizeOfIframe; i++) {
		driver.switchTo().frame(i);
		System.out.println("index id " + i);
		int totalImages = driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println("total images " + totalImages);
		driver.switchTo().defaultContent();// switch back to the main page
		}
		
		driver.close();

	}

}
