package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver_win32/chromedriver.exe");
		WebDriver xyz = new ChromeDriver();
		LoginPage login = new LoginPage(xyz);

//Create Admin Login Test Case
		xyz.get("http://www.gcrit.com/build3/admin/");
		login.typeUsername("admin");
		login.typePassword("admin@123");
		login.clickLoginButton();

		String url = xyz.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Admin Login is Successful -Passed");
		} else {
			System.out.println("Admin Login is Unsuccessful -Failed");
		}
		xyz.close();
	}
}