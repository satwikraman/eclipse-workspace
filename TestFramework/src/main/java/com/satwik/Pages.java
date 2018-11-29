package com.satwik;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static Homepage homePage() {
		// TODO Auto-generated method stub
		return new Homepage();
	}

	public static PathPages pathPages() {
		PathPages pathPages=new PathPages();
		return pathPages;
	}

	public static PathPage javaPathPage() {
		PathPage javaPathPage= javaPathPage();
		PageFactory.initElements(Browser.driver, javaPathPage);
		return javaPathPage;
	}

}
