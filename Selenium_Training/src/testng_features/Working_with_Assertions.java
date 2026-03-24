package testng_features;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_with_Assertions 
{
	
	private SoftAssert SoftAssert;

	@Test
	public void assertiondemo()
	{
		 SoftAssert asrt=new SoftAssert();
		
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  String expected_title="Demo Web Shop";
		  
		  String actual_title=driver.getTitle();
		  
		  //Assert.assertEquals(actual_title, expected_title);
		  asrt.assertEquals(actual_title,expected_title );
		  
          driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      String actual_text=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
	      
	      //Assert.assertEquals(actual_text,"Search", "Given text in Computers search page was not displayed ");
	      
	      asrt.assertEquals(actual_text,"Search");
	      
	      driver.close();
	      
	      asrt.assertAll();
		  
			
	}
	
	

}
