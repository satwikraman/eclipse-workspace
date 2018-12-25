package com.bl.base;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;
import org.openqa.selenium.remote.http.W3CHttpResponseCodec;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.bl.utils.WebDriverUtil;

public class Base {
	protected WebDriver driver;
	RemoteWebDriver driver2;
	@FindBy(how = How.CSS, using = "[data-za-action='Buy']")
	WebElement buyKey;

	@Test(priority = 0)
	public void beforeClass() {
		driver = WebDriverUtil.getDriver("chrome");
		HttpCommandExecutor executor = (HttpCommandExecutor) ((RemoteWebDriver) driver).getCommandExecutor();
		URL url = executor.getAddressOfRemoteServer();
		SessionId session_id = ((RemoteWebDriver) driver).getSessionId();

		driver2 = createDriverFromSession(session_id, url);
		driver2.get("https://www.zillow.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("[data-za-action='Buy']")).click();
		//buyKey.click();

	}

	public static RemoteWebDriver createDriverFromSession(final SessionId sessionId, URL command_executor) {
		CommandExecutor executor = new HttpCommandExecutor(command_executor) {

			@Override
			public Response execute(Command command) throws IOException {
				Response response = null;
				if (command.getName() == "newSession") {
					response = new Response();
					response.setSessionId(sessionId.toString());
					response.setStatus(0);
					response.setValue(Collections.<String, String>emptyMap());

					try {
						Field commandCodec = null;
						commandCodec = this.getClass().getSuperclass().getDeclaredField("commandCodec");
						commandCodec.setAccessible(true);
						commandCodec.set(this, new W3CHttpCommandCodec());

						Field responseCodec = null;
						responseCodec = this.getClass().getSuperclass().getDeclaredField("responseCodec");
						responseCodec.setAccessible(true);
						responseCodec.set(this, new W3CHttpResponseCodec());
					} catch (NoSuchFieldException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				} else {
					response = super.execute(command);
				}
				return response;
			}
		};

		return new RemoteWebDriver(executor, new DesiredCapabilities());
	}
	/*
	 * @AfterSuite public void afterClass() { driver.quit(); }
	 */
}
