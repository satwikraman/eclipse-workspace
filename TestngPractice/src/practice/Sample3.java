package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3 {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority = 2)
	public void verifyGoogleTitle() {
		driver.get("https://www.google.co.in/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Google");
	}

	@Test(priority = 3)
	public void verifyYahooTitle() {
		driver.navigate().to("https://in.yahoo.com/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Yahoo");
	}

	@Test(priority = 4)
	public void verifygcrShopTitle() {
		driver.navigate().to("http://www.gcrit.com/build3/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "GCR Shop");
	}

}