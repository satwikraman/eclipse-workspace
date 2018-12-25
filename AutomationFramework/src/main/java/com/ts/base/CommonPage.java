package com.ts.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CommonPage {
	public WebDriver driver;

	public CommonPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void openDriver(String name) {
		switch (name) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
		case "opera":
			driver = new OperaDriver();
		}

	}

}
