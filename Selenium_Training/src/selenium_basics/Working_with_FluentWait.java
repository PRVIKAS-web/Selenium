package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_with_FluentWait {

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	      
	      
	      FluentWait wait=new FluentWait(driver);
	      
	      wait.pollingEvery(Duration.ofSeconds(1));
	      
	      wait.withTimeout(Duration.ofSeconds(1));
	      
	      wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
	      
          driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
