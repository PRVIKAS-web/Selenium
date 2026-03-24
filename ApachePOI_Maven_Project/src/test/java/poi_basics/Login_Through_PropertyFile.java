package poi_basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Through_PropertyFile 
{
	WebDriver driver;
	
	@Test
	public void Login() throws IOException
	{
		String path="./Test_Configuration/Login.properties";
		
		FileInputStream fis=new FileInputStream(path);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("URL"));
		
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("Email"));
		
		driver.findElement(By.id("Passwordl")).sendKeys(prop.getProperty("Password"));
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		

		
		
		
		
		
	}

}
