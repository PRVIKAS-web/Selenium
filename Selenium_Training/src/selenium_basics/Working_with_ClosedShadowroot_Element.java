package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ClosedShadowroot_Element {

	public static void main(String[] args) throws InterruptedException 
	{
		  ChromeDriver driver=new ChromeDriver();
		
	      driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
	       
	      driver.manage().window().maximize();
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//h1[text()='Login']")).click();
	      
	      Actions action=new Actions(driver);
	       
	      
	      action.sendKeys(Keys.TAB).perform();
	      
	      action.sendKeys("vikas").perform();
	      
          action.sendKeys(Keys.TAB).perform();
	      
	      action.sendKeys("Vicky@12").perform();    
	}

}
