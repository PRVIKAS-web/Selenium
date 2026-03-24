package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_WebElementMethods {

	public static void main(String[] args)
	{
        ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.manage().window().maximize();
        
        /*driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
        
        driver.findElement(By.id("small-searchterms")).clear();
        
        driver.findElement(By.id("small-searchterms")).sendKeys("computers");
        
        driver.findElement(By.xpath("//input[@type='submit']")).submit();*/
        
//        String text=driver.findElement(By.linkText("Register")).getText();
//        
//        System.out.println(text);
//        
//        driver.findElement(By.id("small-searchterms")).sendKeys("books");
//        
//        driver.findElement(By.xpath("//input[@type='submit']")).submit();
//        
//        String searchpage_text=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
//        
//        System.out.println(searchpage_text);
        
        
//        String value=driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("value");
//        
//        System.out.println(value);
        
//        String cssvalue=driver.findElement(By.linkText("Register")).getCssValue("color");
//         
//        System.out.println(cssvalue);
        
          if(driver.findElement(By.id("small-searchterms")).isDisplayed())
          {
        	  driver.findElement(By.id("small-searchterms")).sendKeys("books");
          }
        
          if(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled())
          {
        	  driver.findElement(By.xpath("//input[@type='submit']")).click();
          }

	}

}
