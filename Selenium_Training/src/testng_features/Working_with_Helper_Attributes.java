package testng_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_Helper_Attributes 
{
	@Test(invocationCount = 2,threadPoolSize = 2)
	public void subscribetestcase()
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
          driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      driver.close();
	      
	      
	}

}
