package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_with_RelativeLocators {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.manage().window().maximize();
        
        //driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("computers");
        
        //driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();
     
        //driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-2"))).click();
        
        driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
	}

}
