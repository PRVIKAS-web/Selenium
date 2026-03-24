package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Autosuggestiondropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver=new ChromeDriver();
			
//	      driver.get("https://demowebshop.tricentis.com/");
	      
	      driver.get("https://www.flipkart.com/");
	        
	      driver.manage().window().maximize();
	      
//	      WebElement searchtextfiled=  driver.findElement(By.id("small-searchterms"));
//
//	      searchtextfiled.sendKeys("compu");
//	      
//	      Thread.sleep(2000);
//	      
//	      driver.findElement(By.xpath("(//a[text()='Build your own computer'])[1]")).click();
	      
	      WebElement searchtextfiled=driver.findElement(By.name("q"));
	      
	      searchtextfiled.sendKeys("puma");
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("(//span[text()='puma'])[2]")).click();
	      
	}

}
