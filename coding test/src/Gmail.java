import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.chromedriver", "/C:/soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https:/www.google.com/gmail/");
		
		
		Thread.sleep(5000);
		WebElement uid=driver.findElement(By.id("identifierId"));
		uid.sendKeys("vivekwhitebox@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("qwertyuiop@1");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
		Thread.sleep(5000);
		String login= driver.getCurrentUrl();
		if(login.equals("https://mail.google.com/mail/u/0/#inbox")) {
			System.out.println("login successful");
		driver.findElement(By.cssSelector(".gb_Xg [role]")).click();
		driver.findElement(By.id("gb_71")).click();
		driver.close();
	}
		else {
			System.out.println("uid/passowd is incorrect");
			driver.close();
		}
		}
}
