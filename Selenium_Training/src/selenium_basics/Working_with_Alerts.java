package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Alerts {

	public static void main(String[] args)
	{

		  ChromeDriver driver=new ChromeDriver();
		
	      driver.get("https://demowebshop.tricentis.com/");
	       
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	      driver.switchTo().alert().accept();

	}

}
