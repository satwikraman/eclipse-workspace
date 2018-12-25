package com.bl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverUtil {

	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		try {
			// factory design pattern
			if (browserName != null) {
				if (browserName == "firefox") {
					System.setProperty("webdriver.firefox.driver",
							System.getProperty("user.dir") + "\\resources\\firefoxdriver.exe");
					driver = new FirefoxDriver();
				} 
				else if (browserName == "chrome") {
					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}

				else if (browserName == "ie") {
					System.setProperty("webdriver.ie.driver",
							System.getProperty("user.dir") + "/resources/drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}

			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		return driver;

	}
}
