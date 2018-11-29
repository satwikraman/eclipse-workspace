import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static WebDriver driver;
	static String ErrorMessage;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

		FileReader file = new FileReader("C:\\Users\\gcreddy\\Desktop\\input.txt");
		BufferedReader br = new BufferedReader(file);

		int Iteration=0;
		String line;

		while ((line=br.readLine())!=null){
			Iteration=Iteration+1;

			if (Iteration > 0){
				String [] inputData=line.split(", ", 2);

				WebDriver driver = new ChromeDriver();
				driver.get("http://www.gcrit.com/build3/admin/");
				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.id("tdb1")).click();
				Thread.sleep(3000);

				ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

				if ((Iteration == 4) && (ErrorMessage.contains("Error: The maximum number of login attempts has been reached. Please try again in 5 minutes."))){
					System.out.println(Iteration + " Maximum invalid Login attempts are over -Passed"); 
				}
				else if (ErrorMessage.contains("Error: The maximum number of login attempts has been reached. Please try again in 5 minutes.")){
					System.out.println(Iteration + " Login attempts are Over  -Done"); 
				}

				else {
					System.out.println(Iteration + " Maximum invalid Login attempts are Not over -Done"); 
				}
				driver.close();
			}
		}
		br.close();
		file.close();
	}
}