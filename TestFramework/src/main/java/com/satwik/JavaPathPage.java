package com.satwik;

import org.openqa.selenium.By;

public class JavaPathPage extends PathPage {

	@Override
	public void goTo() {
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']//a[@href='/paths/java']/div[@class='item-each']")).click();
		
	}

	@Override
	public String pathName() {
		// TODO Auto-generated method stub
		return null;
	}

}
