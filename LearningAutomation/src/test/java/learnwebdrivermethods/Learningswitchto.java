package learnwebdrivermethods;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningswitchto {

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/");
        
        //switch driver focus to new window
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
      //switch driver focus to new tab
        
        driver.switchTo().newWindow(WindowType.TAB);
        
        driver.navigate().to(new URL("https://www.selenium.dev/"));
        
        driver.quit();
        
        

	}

}
