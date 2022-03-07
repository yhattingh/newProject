package newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingWritingToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a file on your file system
		String TestFile = "C:\\tmp\\notes.txt";
		
		// create an object of the java file class
		File file = new File(TestFile);
		
		//Create the file
		file.createNewFile();
		
		//Write into the file
		//Create object of Java FileWriter and BufferedWriter class
		FileWriter fileWriter = new FileWriter(TestFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("This is the first line...."); //write into file
		bufferedWriter.newLine(); //go to new line
		bufferedWriter.write("This is the second line...."); // write another line
		bufferedWriter.close();
		
		//Reading from file
		//Create object of Java FileWriter and BufferedReader class
		FileReader fileReader = new FileReader(TestFile);
		
		//BufferedReader bufferedReader = new BufferedReader(fileReader);
		//String Content = "";
		//note the code above caused a leak and was replaced by the try code below
		
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String Content = "";
			
		//Loop to read all lines in the file and print it
		while((Content = bufferedReader.readLine()) != null) {
			System.out.println(Content);
			}
		}
	}
}
