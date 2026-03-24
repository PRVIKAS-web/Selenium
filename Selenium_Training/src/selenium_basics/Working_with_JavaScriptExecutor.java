package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_JavaScriptExecutor {

	public static void main(String[] args) 
	{
		  ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	      driver.get("https://demowebshop.tricentis.com/");
	      
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      
	     js.executeScript("document.getElementById('small-searchterms').value='mobiles'");
	     
	     WebElement searchbtn=driver.findElement(By.xpath("//input[@type='submit']"));
	     
	     js.executeScript("arguments[0].click();",searchbtn);

	}

}
