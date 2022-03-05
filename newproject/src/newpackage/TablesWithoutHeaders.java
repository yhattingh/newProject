package newpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesWithoutHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/table.html");
		
		//Table without any headers
		
		//Note index starts at 0 and html starts at 1
		

		WebElement myTable = driver.findElement(By.xpath(".//html/body/table/tbody"));
		List <WebElement> rows_table = myTable.findElements(By.tagName("tr"));
		
		// to calculate the number of rows in the table
		int row_count = rows_table.size();
		System.out.println(row_count);
		
		//Loop through to the last row
		for (int row = 0; row < row_count; row++) {
			List <WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			
			//To calculate number of columns in the specific row
			int columns_count = columns_row.size();
			System.out.println("Number of columns in row " + " " + row + " "  + "are " +  columns_count);
		
			//Loop will execute until the last cell fo the specific row
			for (int column = 0; column < columns_count; column++) {
				//retrieve the text from the specific cell
				String celtext = columns_row.get(column).getText();
				System.out.println("Cell Value of row number " + row + " and column number " + column + " is " + celtext);
		}
			
			
		}

	}

}
