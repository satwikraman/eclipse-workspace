package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver_win32/chromedriver.exe");
		WebDriver xyz2 = new ChromeDriver();
		LoginPage test2 = new LoginPage(xyz2);

//Create Admin Login Test Case
		xyz2.get("http://www.gcrit.com/build3/admin/");
		test2.typeUsername("admin");
		test2.typePassword("admin@123");
		test2.clikButton();

		String url = xyz2.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin Login is Successful -Passed");
		} else {
			System.out.println("Admin Login is unsuccessful -Failed");
		}
		xyz2.close();

	}
}