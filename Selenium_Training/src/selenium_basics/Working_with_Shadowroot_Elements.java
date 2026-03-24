package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Shadowroot_Elements {

	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
		
	      driver.get("https://demoapps.qspiders.com/ui/shadow");
	       
	      driver.manage().window().maximize();
	      
//	      Actions action=new Actions(driver);
//	      
//	      WebElement shadowroot=driver.findElement(By.xpath("//section[text()='Shadow Root Elements']"));
//	      
//	      action.scrollToElement(shadowroot).click().perform();
//	      
//	      driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
	      
	      SearchContext shadow_host=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
	      
	      shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("vikas");
	      
	      
	      

	}

}
