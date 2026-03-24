package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchTest 
{
	@Test
	public void searchtestcase()
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      Reporter.log("Application launched sucessfully");
	      
	      
          driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      Reporter.log("Application closed sucessfully");
	      
	      driver.close();
	      
	}

}
