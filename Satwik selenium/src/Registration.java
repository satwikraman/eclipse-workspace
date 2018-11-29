import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("/html//div[@id='bodyContent']/form[@name='create_account']/div/div[2]/table/tbody/tr[1]/td[@class='fieldValue']/input[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rahman");
		driver.findElement(By.name("lastname")).sendKeys("Mohommed");
		driver.findElement(By.name("dob")).sendKeys("10/20/1990");
		driver.findElement(By.name("email_address")).sendKeys("rahman1259@gmail.com");
		driver.findElement(By.name("company")).sendKeys("innovapath");
		driver.findElement(By.name("street_address")).sendKeys("abcd xyz");
		driver.findElement(By.name("postcode")).sendKeys("12345");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("Uganda");
		driver.findElement(By.name("telephone")).sendKeys("9234565453");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.name("confirmation")).sendKeys("abcd123");
		driver.findElement(By.id("tdb4")).click();
		String ConformationMessage = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/h1")).getText();
		if (ConformationMessage.equals("Your Account Has Been Created!")){
		System.out.println("Customer Registration Successful – Passed");
		}
		else{
		System.out.println("Customer Registration Unsuccessful – Failed");
		}
		driver.close();

	}

}
