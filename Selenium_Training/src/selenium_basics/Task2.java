package selenium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Task2 {

	public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.get("https://testautomationpractice.blogspot.com/");
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      WebElement countrydropdown=driver.findElement(By.xpath("//select[@id='country']"));
	      
	      Select sc=new Select(countrydropdown);
	      
	      List<WebElement> countryNames=sc.getOptions();
	      
	      String expected_country="Australia";
	      
	      for(int i=0;i<countryNames.size();i++)
 		 {
 			 String text = countryNames.get(i).getText();
 			 System.out.println(text);
 			 
 			 if(text.equals(expected_country))
 			 {
 				countryNames.get(i).click();
 		        String actual_country = text;
 		        Assert.assertEquals(actual_country, expected_country);

 			 }
 			 
 		 }

	}

}
