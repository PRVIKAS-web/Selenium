package testng_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_with_Assertions_HardSoft
{
	WebDriver driver;
	
	
	@Test
	public void HardSoft()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//SoftAssert ass=new SoftAssert();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_title=driver.getTitle();
		
		String expected_title="Demo  Web Shop";
		
		Assert.assertEquals(actual_title, expected_title);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	    String actual_text=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
	    
	    String expected_text="Search";
	    
	    Assert.assertEquals(actual_text, expected_text);
	    
	    //ass.assertAll();
	    
	    
	      
	}

}
