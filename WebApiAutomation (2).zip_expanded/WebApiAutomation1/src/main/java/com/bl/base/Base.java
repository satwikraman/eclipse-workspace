package com.bl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.bl.utils.WebDriverUtil;

public class Base {

	protected WebDriver driver;
	@FindBy(how = How.CSS, using = "[data-za-action='Buy'] span")
	WebElement searchBox;
	@FindBy(how = How.CSS, using = "#citystatezip")
	WebElement city;
	@FindBy(how = How.CSS, using = ".zsg-searchbox-content")
	WebElement content;

	@Test(priority = 0)
	public void beforeClass() {
		driver = WebDriverUtil.getDriver("chrome");
		driver.get("https://www.zillow.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchBox.click();
		city.sendKeys("San Francisco County CA");
		content.click();
		
		driver.findElement(By.xpath(".recaptcha-checkbox-checkmark")).click();

	}

	/*@AfterSuite
	public void afterClass() {
		driver.quit();

	}*/

}
