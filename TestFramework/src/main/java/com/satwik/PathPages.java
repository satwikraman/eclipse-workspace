package com.satwik;

import org.openqa.selenium.By;

public class PathPages {
	
	static String url="https://www.pluralsight.com/paths ";
	static String title="Java | Pluralsight";
	public void goTo() {
	
		Browser.goTo(url);
	}
	public void goToJavaPath() {
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[88]/a/div/div[2]")).click();
		
	}
	public boolean isAt() {
		return Browser.title().equals(title);
	}
}


