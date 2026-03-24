package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver=new ChromeDriver();
			
	      driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	       
	      driver.manage().window().maximize();
	      
	      String parentwindow=driver.getWindowHandle();
	      
	      System.out.println(parentwindow);
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("newWindowBtn")).click();
	      
	      
	      Set<String>childwindows= driver.getWindowHandles();
	      
	      System.out.println(childwindows);
	     
	      
	      for(String window:childwindows)
	      {
	    	  driver.switchTo().window(window);
	    	  String title=driver.getTitle();
	    	  System.out.println(title);
	      }
	       
	      driver.switchTo().window(parentwindow);
	      driver.close();
	     

	}

}
