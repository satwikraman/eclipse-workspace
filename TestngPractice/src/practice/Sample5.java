package practice;

import org.testng.annotations.Test;

public class Sample5 {

	@Test(groups = { "Sanity", "Regression" }, priority = 1)
	public void login() {
		System.out.println("Login is Successful");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 6)
	public void logout() {
		System.out.println("Logout is Successful");
	}

	@Test(groups = { "Sanity" }, priority = 2)
	public void search() {
		System.out.println("Search is Successful");
	}

	@Test(groups = { "Regression" }, priority = 3)
	public void advancedsearch() {
		System.out.println("Advanced Search is successful");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 3)
	public void prepaidrecharge() {
		System.out.println("Prepaid Recharge is successful");
	}

	@Test(groups = { "Regression" }, priority = 5)
	public void billpayment() {
		System.out.println("Bill Payment is Successful");
	}
}