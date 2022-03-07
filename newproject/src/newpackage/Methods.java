package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Methods and functions are the same
//can pass data and parameters in Methods
//must be declared in your class
//static means the method belongs to the main class and is not an object of the main class
//void means that the method does not return anything, it just does something - note that sysout is just printing and does not return anything

public class Methods {
	
	static void demoingMethod() {
	//code to be executed
	System.out.println("This is in the Method class");
	}
		
	public static void main(String[] args) {
		System.out.println("This is in the Main Method");
		demoingMethod();///calling and re-using the demoingMethod without re-writing it
		demoingMethod();

	}

}
