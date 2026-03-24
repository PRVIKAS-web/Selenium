package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTest 
{
	@Test
	public void subscribetestcase()
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      Reporter.log("Application launched sucessfully");
	      
	      driver.findElement(By.id("newsletter-email")).sendKeys("vickypr1998@gmail.com");
	      
	      driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	      
	      Reporter.log("subscribe test case completed");
	      
	      
	}
	

}
