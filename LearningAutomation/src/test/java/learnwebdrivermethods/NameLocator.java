package learnwebdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
		
		// Navigate To URL
		driver.get("https://www.google.com/");
		
		//identify searchbox
		WebElement searchbox=driver.findElement(By.name("q"));
		
		//pass input
		searchbox.sendKeys("vicky");
		

	}

}
