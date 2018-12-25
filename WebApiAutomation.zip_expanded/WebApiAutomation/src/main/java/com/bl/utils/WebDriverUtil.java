package com.bl.utils;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;
import org.openqa.selenium.remote.http.W3CHttpResponseCodec;

public class WebDriverUtil {

	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		try {
			//factory design pattern
			if (browserName != null) {
				if (browserName == "firefox") {
					System.setProperty("webdriver.firefox.driver",
							System.getProperty("user.dir") + "\\resources\\firefoxdriver.exe");
					driver = new FirefoxDriver();
				} else if (browserName == "chrome") {
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
