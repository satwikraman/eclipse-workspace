package com.satwik;

import org.junit.Test;
import org.junit.AfterClass;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class UnitTest {

	
	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}
	
	@Test
	public void canGoToJavaPathPage() {
		Pages.pathPages().goTo();
		PathPage pathPage=Pages.pathPages().getPathpage("Java");
		Assert.assertTrue(pathPage.isAtPathPage("Java"));
	}
	@AfterClass
	public static void cleanup() {
		Browser.close();
	}
}
