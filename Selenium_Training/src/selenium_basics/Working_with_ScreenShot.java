package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_ScreenShot {

	public static void main(String[] args) throws IOException
	{
		 ChromeDriver driver=new ChromeDriver();
		 
		 //RemoteWebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      TakesScreenshot ts =(TakesScreenshot)driver;
	      
	      File srcfile=ts.getScreenshotAs(OutputType.FILE);
	      
	      File destfile=new File("./ScreenShots/HomePage.png");
	      
	      FileHandler.copy(srcfile, destfile);
	      
	      

	}

}
