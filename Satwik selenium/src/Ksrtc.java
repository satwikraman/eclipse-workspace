import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in");
		driver.findElement(By.name("searchBtn")).click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.name("fromPlaceName")).sendKeys("benguluru");
		driver.close();
	}

}
