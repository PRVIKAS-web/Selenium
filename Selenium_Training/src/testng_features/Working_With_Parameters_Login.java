package testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_With_Parameters_Login
{
	WebDriver driver;
	
	
	@Parameters({"URL","EMAIL","PASSWORD"})
	@Test
	public void Login(String url,String email,String password)
	{
		driver=new ChromeDriver();
		 
		 driver.get(url);
		 
		 driver.findElement(By.id("Email")).sendKeys(email);
			
		 driver.findElement(By.id("Password")).sendKeys(password);
			
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); 
		
	}

}
