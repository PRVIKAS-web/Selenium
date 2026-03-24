package selenium_basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_NewWindow {

	public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
	       
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      
	      driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	      
	      String parentwindow=driver.getWindowHandle();
	      
	      driver.findElement(By.xpath("//h2[text()='Watches']//ancestor::div[@class='bg-white shadow-md rounded-lg overflow-hidden']//button[text()='view more']")).click();
	      
	     
	      
          Set<String> multiplewindows=driver.getWindowHandles();
	      
	      for(String window:multiplewindows)
	      {
	    	  driver.switchTo().window(window);
    	  if(driver.getTitle().contains("Demoapps - Luxury Watch"))
 	      {
    		  driver.close();
    	  }
	      }
	      driver.switchTo().window(parentwindow);

	}

}
