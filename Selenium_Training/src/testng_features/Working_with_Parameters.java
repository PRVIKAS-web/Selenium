package testng_features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_with_Parameters 
{ 
//	int sum;
//	@Parameters({"num1","num2"})
//	@Test
//	public void add(int num1,int num2)
//	{
//		sum=num1+num2;
//		System.out.println(sum);
	@Parameters({"URL","Search"})
	@Test
	public void searchTest(	String URL,String Search)
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get(URL);
	      
          driver.findElement(By.id("small-searchterms")).sendKeys(Search);
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      driver.close();
	}

}
