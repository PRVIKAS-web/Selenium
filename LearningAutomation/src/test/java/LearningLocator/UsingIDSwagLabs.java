package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDSwagLabs {

	public static void main(String[] args) 
	{
		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//Navigate To URL
		driver.get("https://www.saucedemo.com/v1/");
		
		//Identify UserName Using Id Locator
		WebElement UserName=driver.findElement(By.id("user-name"));
		
		//Enter Input Into The UserName
		UserName.sendKeys("standard_user");
		
		//Identify PasswordUsing Id Locator
		WebElement Password=driver.findElement(By.id("password"));
				
		//Enter Input Into The Password
		Password.sendKeys("secret_sauce");
		
		//Click on Submit
		WebElement submit=driver.findElement(By.id("login-button"));
		submit.click();
		
		
		//
		driver.switchTo().alert().accept();
		

	}

}
