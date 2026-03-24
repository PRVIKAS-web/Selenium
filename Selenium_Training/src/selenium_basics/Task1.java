package selenium_basics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.get("https://testautomationpractice.blogspot.com/");
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      String parentwindow=driver.getWindowHandle();
	      
	      driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
	      
	      Set<String>childwindows= driver.getWindowHandles();
	      
	      for(String window:childwindows)
	      {
	    	  driver.switchTo().window(window);
	    	  if(driver.getTitle().contains("Selenium"))
	    	  {
	    		 List<WebElement> val=driver.findElements(By.xpath("//div[@class='row']//h4[contains(text(),'Selenium ')]"));
	    		 for(int i=0;i<val.size();i++)
	    		 {
	    			 String text = val.get(i).getText();
	    			 System.out.println(text); 
	    		 }

	    	  }
	      }
	       
	      driver.switchTo().window(parentwindow);
	      driver.close();
	     

	}

}
