import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("get_sign_in")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.id("authMobile")).sendKeys("8919417464");
		driver.findElement(By.id("mobileSubmitBtn")).click();
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.id("authCredentialPassword"));
		pwd.sendKeys("qwertyuiop");
		pwd.clear();
		pwd.sendKeys("qwertyuiop");
		driver.findElement(By.id("authCredentialPasswordSignInBtn")).click();
		driver.switchTo().parentFrame();
		WebElement to=driver.findElement(By.id("gosuggest_inputSrc"));
		to.sendKeys("Delhi");
		WebElement from=driver.findElement(By.id("gosuggest_inputDest"));
		from.sendKeys("Hyderabad");
		WebElement swap=driver.findElement(By.cssSelector(".icon-swap"));
				swap.click();
	}

}
