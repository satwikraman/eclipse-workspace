package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver abcd;
	// Create elements using element locators
	By User = By.name("username");
	By Password = By.name("password");
	By LoginButton = By.id("tdb1");
	By ErrorMessage = By.className("messageStackError");
	By link  = By.linkText("Online Catalog");

	// this keyword is used to invoke on instantiate current class constructor
	// A Constructor in Java is a block of code similar to a method
	// that's called an instance of Object is created
	public LoginPage(WebDriver abcd) {
		this.abcd = abcd;
	}

	// Create user actions
	public void typeUsername(String Uname) {
		abcd.findElement(User).sendKeys(Uname);
	}

	public void captureUsername() {
		abcd.findElement(User).getAttribute("value");
	}

	public void clearUsername() {
		abcd.findElement(User).clear();
	}

	public void typePassword(String Pwd) {
		abcd.findElement(Password).sendKeys(Pwd);
	}

	public void clickLoginButton() {
		abcd.findElement(LoginButton).click();
	}

	public void captureError() {
		String message = abcd.findElement(ErrorMessage).getText();
	}

	public void clikButton() {
		abcd.findElement(LoginButton).click();
	}

	public void clickLink() {
		abcd.findElement(link).click();
	}
}