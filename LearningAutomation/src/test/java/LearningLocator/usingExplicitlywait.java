package LearningLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usingExplicitlywait {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Explicitlywait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		

		// Navigate To URL
		driver.get("https://shoppersstack.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		loginbtn.click();

	}

}
