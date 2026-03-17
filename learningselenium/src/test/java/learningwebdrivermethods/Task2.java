package learningwebdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
        driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
        driver.get("https://www.saucedemo.com/");
	    
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    
	    driver.findElement(By.id("login-button")).click();
	    
	    driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/../../..//button[text()='Add to cart']")).click();
	    
	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	     
	    WebElement prod=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	    
	    if(prod.isDisplayed())
	    {
	    	System.out.println("Product is added sucessfully");
	    }
	    else
	    {
	    	System.out.println("Product is not added");
	    }

	}

}
