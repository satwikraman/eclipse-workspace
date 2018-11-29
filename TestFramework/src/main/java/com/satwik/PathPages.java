package com.satwik;

public class PathPages {
	
	static String url="https://www.pluralsight.com/paths ";
	static String title="Java | Pluralsight";
	public void goTo() {
	
		Browser.goTo(url);
	}
	
	public PathPage getPathpage(String page) {
		switch (page) {
		case "Java":
			return Pages.javaPathPage();
		}
		return null;
	}
	public boolean isAt() {
		return Browser.title().equals(title);
	}
}


