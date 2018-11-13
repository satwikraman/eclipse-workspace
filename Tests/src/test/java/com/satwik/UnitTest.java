package com.satwik;

import org.junit.Test;
import org.junit.After;

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
		Pages.pathPages().goToJavaPath();
		Assert.assertTrue(Pages.pathPages().isAt());
	}
	@After
	public void cleanup() {
		Browser.close();
	}
}
