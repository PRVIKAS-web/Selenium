package selenium_basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Window_Popup {

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	      
	      String parentwindow=driver.getWindowHandle();
	      
	      driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
	      
	      Set<String> multiplewindows=driver.getWindowHandles();
	      
	      for(String window:multiplewindows)
	      {
	    	  if (!window.equals(parentwindow)) 
	    	  {   // if NOT parent
	                driver.switchTo().window(window);
	                driver.close();                  // close child
	           }
//    	  if(driver.getTitle().contains("Demoapps - Luxury Watch") && driver.getTitle().contains("Demoapps - Luxury Watch"))
// 	      {
//    		  driver.close();
//    	  }
	      }
	      driver.switchTo().window(parentwindow);
	      
	      
	      
	      

	}

}
