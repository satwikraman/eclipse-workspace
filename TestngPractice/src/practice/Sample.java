package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Google");
		driver.close();
	}
}