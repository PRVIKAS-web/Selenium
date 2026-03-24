package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actionsclass {

	public static void main(String[] args)
	{
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.manage().window().maximize();
        
        Actions action=new Actions(driver);
        
        WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
        
        action.moveToElement(computers).build().perform();
        
        WebElement desktop=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
        
        action.moveToElement(desktop).click().build().perform();
        
        


        
        
        

	}

}
