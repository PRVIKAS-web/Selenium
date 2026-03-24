package FileHandling;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingPopup {

	public static void main(String[] args)
	{
		        // Launch The Browser
				WebDriver driver = new ChromeDriver();

				//implicitwait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Maximize The Window
				driver.manage().window().maximize();

			
				// Navigate To URL
				driver.get("https://automationexercise.com/");
			
				//identify contactus
				WebElement contactus=driver.findElement(By.xpath("//a[@href='/contact_us']"));
				contactus.click();
				
				//Getting path
				File fileobj=new File("./Data/Notes.txt");
				String path=fileobj.getAbsolutePath();
				
				//upload file
				WebElement uploaddfile=driver.findElement(By.xpath("//input[@name='upload_file']"));
				uploaddfile.sendKeys(path);
				
				//close the browser
				driver.close();
			
				
				
				
				
				


	}

}
