package learnwebdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args)
	{
		 // Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
		
		// Navigate To URL
		driver.get("https://www.facebook.com/");
		
		//identify create new account button
		WebElement accountbutton=driver.findElement(By.partialLinkText("new account"));
		
		accountbutton.click();
		
		

	}

}
