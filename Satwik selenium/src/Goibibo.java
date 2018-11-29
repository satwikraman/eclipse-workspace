import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String [] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.navigate().to("https://www.goibibo.com/");		
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("8919417464");
		driver.findElement(By.id("mobileSubmitBtn")).click();
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.xpath("/html//input[@id='authCredentialPassword']"));
		pwd.sendKeys("qwertyuiop");
		pwd.clear();
		pwd.sendKeys("qwertyuiop");
		driver.findElement(By.cssSelector("#authCredentialPasswordSignInBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement from=driver.findElement(By.id("gosuggest_inputSrc"));
		WebElement to= driver.findElement(By.id("gosuggest_inputDest"));
		WebElement swap=driver.findElement(By.cssSelector(".icon-swap"));
		from.sendKeys("Hyderabad");
		from.submit();
		//Select s= 
		to.sendKeys("Delhi");
		to.submit();
		swap.click();
	
}
}
