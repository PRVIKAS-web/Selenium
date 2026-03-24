package learningwebdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		
	    driver = new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	    driver.findElement(By.id("login-button")).click();
	    
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    
	    
	    WebElement prod=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(prod));
	    
	    prod.click();
	    
	    
	}

}
