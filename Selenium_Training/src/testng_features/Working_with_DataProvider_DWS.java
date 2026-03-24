package testng_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider_DWS 
{
	@DataProvider(name="SearchTestData")
	public Object[][]testdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="https://demowebshop.tricentis.com/";
		data[0][1]="computers";
		return data;
		
	}
	
	@Test(dataProvider="SearchTestData")
	public void searchtest(String url,String searchdata )
	{
		 ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get(url);
	      
          driver.findElement(By.id("small-searchterms")).sendKeys(searchdata);
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      driver.close();
	}

}
