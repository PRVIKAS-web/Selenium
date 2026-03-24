package HandlingMouseActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) 
	{
		//Launch The Browser
		WebDriver driver = new ChromeDriver();

		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();

	
		// Navigate To URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//identify window element and click
		WebElement window=driver.findElement(By.xpath("//button[@id='openwindow']"));
		window.click();
		
		//fetch the window address
		String parentid=driver.getWindowHandle();
		System.out.println("Parent id:: "+parentid);
		
		Set<String> allid=driver.getWindowHandles();
		System.out.println("allid: "+allid);
		
		//close all the window without using Quit
		
		for(String address:allid)
		{
			 if(!parentid.equals(address))
	    	  {
	    		  driver.switchTo().window(address).close();;
	    	  }
			
			
			
		}
		
		
		
		

	}

}
