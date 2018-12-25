package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class DataDriven {
	WebDriver driver;
	Properties prop=new Properties();
	String config=System.getProperty("user.dir");
	@Ignore
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
	@Ignore
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

	@Test(priority=2)
	public void getProperties() throws IOException {
	
		InputStream ip= new FileInputStream(config+"/config.properties ");
		prop.load(ip);
		String browser=prop.getProperty("uname");
		System.out.println(browser);
	
		return ;
	}
	@Test(priority=1)
	public void setProperties() throws IOException {
		OutputStream op=new FileOutputStream(config+"/config.properties ");
		prop.setProperty("uname","satwik");
		prop.store(op, "xyz");
	}
}
