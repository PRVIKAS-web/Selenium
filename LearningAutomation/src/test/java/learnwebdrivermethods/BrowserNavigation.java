package learnwebdrivermethods;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserNavigation {

	public static void main(String[] args) throws MalformedURLException
	{
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
        
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
        driver.navigate().to(new URL("https://www.selenium.dev/"));
        
        try
        {
        	driver.navigate().to(new URL("https://www.amazon.in/"));	
        }
        catch(MalformedURLException e)
        {
        	e.printStackTrace();
        }
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().refresh();
        
        driver.close();
         
        
        
        
        
       
        
        

	}

}
