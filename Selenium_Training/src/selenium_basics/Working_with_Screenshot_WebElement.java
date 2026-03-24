package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_Screenshot_WebElement {

	public static void main(String[] args) throws IOException 
	{
		 ChromeDriver driver=new ChromeDriver();
		 
		 //RemoteWebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      TakesScreenshot ts =(TakesScreenshot)driver;
	      
         WebElement searchtextfiled= driver.findElement(By.id("small-searchterms"));
         
         searchtextfiled.sendKeys("computers");
	      
	     // driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
          File srcfile=searchtextfiled.getScreenshotAs(OutputType.FILE);
	      
	      File destfile=new File("./ScreenShots/searchfield.png");
	      
	      FileHandler.copy(srcfile, destfile);
	      
	      

	}

}
