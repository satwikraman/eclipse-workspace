package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:C:\\Users\\Training\\Documents\\satwik practice\\Table.html");

		boolean displayStatus=driver.findElement(By.id("students")).isDisplayed();
		System.out.println(displayStatus); // True

		WebElement StudentsTable=driver.findElement(By.id("students"));

		//Introducing "find.elements"
		List <WebElement> rows = StudentsTable.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println(rowsCount);//3

		List <WebElement> cells = StudentsTable.findElements(By.tagName("td"));
		int cellsCount = cells.size();
		System.out.println(cellsCount);//9

		int columsCount = cellsCount/rowsCount;
		System.out.println(columsCount);//3
		driver.close();
	}

}
