package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_Synchronization {

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	      
	      WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	      
	      wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
	      
	      driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      

	}

}
