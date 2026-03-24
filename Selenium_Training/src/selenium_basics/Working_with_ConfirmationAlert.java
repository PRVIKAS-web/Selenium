package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_ConfirmationAlert {

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
		
	      driver.get("https://demo.guru99.com/test/delete_customer.php");
	       
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.name("cusid")).sendKeys("4519");
	      
	      driver.findElement(By.name("submit")).click();
	      
	      driver.switchTo().alert().dismiss();

	}

}
