import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {

	public static void main(String[] args)throws Exception {
		//Instantiate the Chrome Browser Driver 
		//System.setProperty("webdriver.chrome.driver", "C:/soft/chromedriver_win32/chromedriver.exe");

		//Create Chrome Browser Driver
		WebDriver driver = new ChromeDriver(); // Launch the browser with blank URL

		 String baseUrl = "https://www.google.com/gmail/";
	        
	        driver.get(baseUrl);
	        driver. manage().window().maximize();
			

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("satwikraman5524");
		driver.findElement(By.id("identifierNext")).click();
	
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("13a51a02d9");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();
		
			Thread.sleep(2000);
		
		String login = driver.getCurrentUrl();
		if(login.equals("https://mail.google.com/mail/u/0/#inbox")) {
			System.out.println("login sucessfull");
			
				Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
			driver.close();
		}
		else {
			System.out.println("user name/password incorrect");
		driver.close();
		}
	
	}
	}