package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Iframes {

	public static void main(String[] args) throws InterruptedException
	{
		  ChromeDriver driver=new ChromeDriver();
		
	      driver.get("file:///C:/Users/VRCR/OneDrive/Desktop/Iframes.html");
	       
	      driver.manage().window().maximize();
	      
	      Thread.sleep(2000);
	      
	      //driver.switchTo().frame(0);
	      driver.switchTo().frame("frame1");
	      
	      WebElement searchtextfield=driver.findElement(By.id("small-searchterms"));
	      
	      //driver.switchTo().frame(searchtextfield);
	      
	      searchtextfield.sendKeys("mobiles");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      driver.switchTo().defaultContent();
	      
	      driver.findElement(By.xpath("//a[text()='Google']")).click();
	      
	      
	      
	      

	}

}
