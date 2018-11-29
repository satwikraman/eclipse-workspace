import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
		driver.findElement(By.name("j_password")).sendKeys("gld938");

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Captcha: ");
		String captcha=scan.nextLine();

		driver.findElement(By.name("j_captcha")).sendKeys(captcha);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(4000);

		if (driver.findElement(By.linkText("Sign Out")).isDisplayed()){
		System.out.println("Login is Successful -Passed");
		}
		else {
		System.out.println("Login is Unsuccessful -Failed");
		}
		driver.close();
		
	}

}
