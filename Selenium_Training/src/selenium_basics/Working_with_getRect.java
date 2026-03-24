package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_getRect {

	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://www.google.com");
	      
	      WebElement searchBox = driver.findElement(By.name("q"));

	        
	      Rectangle rect = searchBox.getRect();
	        
	      System.out.println(rect);
	      
	        System.out.println("X Location: " + rect.getX());
	        System.out.println("Y Location: " + rect.getY());
	        System.out.println("Width: " + rect.getWidth());
	        System.out.println("Height: " + rect.getHeight());

	}

}
