package LearningLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingImplicitlywait 
{
	public static void main(String[] args)
	{

		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();
        
		//implictlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Navigate To URL
		driver.get("https://shoppersstack.com/");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		loginbtn.click();
		

	}

}
