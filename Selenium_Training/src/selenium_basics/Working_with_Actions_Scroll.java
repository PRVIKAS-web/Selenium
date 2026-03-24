package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_Scroll {

	public static void main(String[] args)
	{
		  ChromeDriver driver=new ChromeDriver();
		
	      driver.get("https://demowebshop.tricentis.com/");
	        
	      driver.manage().window().maximize();
	      
	      Actions action=new Actions(driver);
	      
	      action.scrollByAmount(0, 500).perform();
	      
	      WebElement myaccount=driver.findElement(By.xpath("//a[text()='My account']"));
	      
	      action.scrollToElement(myaccount).perform();
		

	}

}
