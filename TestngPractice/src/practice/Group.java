package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Group {
	@Test(groups = "Login")
	public void Login() {
		System.out.println("Enter  logi credentials");
	}

	@Test(groups = "Login")
	public void Submit() {
		System.out.println("Submit");
	}

	@Test(groups = "Homepage")
	public void Homepage() {
		System.out.println("Homepage");
	}

	@DataProvider
	public void data() {
	}

}
