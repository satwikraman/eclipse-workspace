package practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class DataDriven {
	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void adminLogin(String Uname, String Pwd)
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/index.php");
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(Pwd);
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),
				"http://www.gcrit.com/build3/admin/index.php");
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@DataProvider(name = "testdata")
	public String[][] readExcel() throws Exception {
		File file = new File("C:/Users/Training/Desktop/data.xls");
		Workbook w = Workbook.getWorkbook(file);
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows();
		int columns = s.getColumns();
	//	System.out.println(rows + " " + columns);
		String inputData[][] = new String[rows][columns];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c = s.getCell(j, i);
				inputData[i][j] = c.getContents();
				System.out.println(inputData[i][j]);
			}
		}
		return inputData;
	}
}
