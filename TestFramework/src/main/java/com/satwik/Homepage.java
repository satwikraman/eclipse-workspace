package com.satwik;

public class Homepage {

	static String url="https://www.pluralsight.com";
	static String title="Unlimited Online Developer, IT and Cyber Security Training | Pluralsight";
	public void goTo() {
	
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
