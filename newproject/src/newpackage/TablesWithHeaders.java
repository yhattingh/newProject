package newpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TablesWithHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
//		WebElement baseTable = driver.findElement(By.tagName("table"));
//		WebElement tableRow = baseTable.findElement(By.xpath);
//		String rowText = tableRow = tableRow.getText();
		
		
		
		driver.manage().window().maximize();
		
		//static table and number of rows are fixed
		// html tag = <table>
		// <th> = table header
		// <tr> = table row
		// <td> = table columns
		
		// To find the third row of the table
		
		
		// Displays first column header
		//tr[1] = table row 1
		//th[1] = table heading 1
		//thead = table header
		String column1 = driver.findElement(By.xpath(".//*[@id = 'leftcontainer']/table/thead/tr[1]/th[1]")).getText();
		System.out.println(column1);
		
		// Displays second column header
		String column2 = driver.findElement(By.xpath(".//*[@id = 'leftcontainer']/table/thead/tr[1]/th[2]")).getText();
		System.out.println(column2);
		
		//Displays the number of columns in the table
		List <WebElement> columnNumber = driver.findElements(By.xpath(".//*[@id = 'leftcontainer']/table/thead/tr/th"));
		System.out.println("Number of columns are in the table are: " + columnNumber.size());
		
		//Displays the number of rows in the table
		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id = 'leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("The number of rows in the table are: " + rows.size());
		
		//Displays the value in row2, column 4
		// NOTE:  if we look for a specific cell in a table, we use tbody
		String column3 = driver.findElement(By.xpath(".//*[@id = 'leftcontainer']/table/tbody/tr[2]/td[4]")).getText();
		System.out.println(column3);
		
	}

}
