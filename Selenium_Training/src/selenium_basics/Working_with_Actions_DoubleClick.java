package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_DoubleClick {

	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
			
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        
	        driver.manage().window().maximize();
	        
	        Actions action=new Actions(driver);
	        
	        WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

	        action.doubleClick(doubleclick).build().perform();
	        
	        WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));

	        action.contextClick(rightclick).build().perform();
	}

}
