package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_Keyboardactions {

	public static void main(String[] args) 
	{
      ChromeDriver driver=new ChromeDriver();
		
      driver.get("https://demowebshop.tricentis.com/");
        
      driver.manage().window().maximize();
        
      Actions action=new Actions(driver);
        
      WebElement searchtextfiled=  driver.findElement(By.id("small-searchterms"));
      
      action.moveToElement(searchtextfiled).click().sendKeys("mobiles").perform();
      
      action.moveToElement(searchtextfiled).click().keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform(); 
      
      
	}

}
