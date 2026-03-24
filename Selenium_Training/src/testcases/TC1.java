package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1
{
	public ChromeDriver driver;
	@BeforeTest
	public void launchapplication()
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	}
	
	@Test
	public void searchtestcase()
	{
		  driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Test
	public void subscribetestcase()
	{
		  driver.findElement(By.id("newsletter-email")).sendKeys("vickypr1998@gmail.com");
	      
	      driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	      
	}
	
	@AfterTest
	public void closeapplication()
	{
		driver.close();
	}

}
