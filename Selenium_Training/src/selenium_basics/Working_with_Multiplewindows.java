package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Multiplewindows {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
	      driver.get("https://demowebshop.tricentis.com/");
	       
	      driver.manage().window().maximize();
	      
	      String parentwindow=driver.getWindowHandle();
	      
	      System.out.println(parentwindow);
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	      
	      
	      Set<String>childwindows= driver.getWindowHandles();
	      
	      System.out.println(childwindows);
	     
	      
	      for(String window:childwindows)
	      {
	    	  driver.switchTo().window(window);
	    	  String title=driver.getTitle();
	    	  System.out.println(title);
	    	  
	    	  if(driver.getTitle().contains("Facebook"))
	    	  {
	    		  driver.findElement(By.name("email")).sendKeys("vickypr1998@gmail.com");
	    	  }
	      }
	       
	      driver.switchTo().window(parentwindow);
	      driver.close();
	     

	}

}
