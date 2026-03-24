package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VoteTest
{
	@Test
	public void subscribetestcase()
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      Reporter.log("Application launched sucessfully");
	      
	      driver.findElement(By.id("#pollanswers-1")).click();
	      
	      driver.findElement(By.xpath("//input[@value='Vote']")).click();
	      
	      Reporter.log("vote testcase completed");
	}
	

}
