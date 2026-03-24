package LearningLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingclassName {

	public static void main(String[] args) throws InterruptedException 
	{

		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate To URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//click on Login Button
		WebElement Loginbtn=driver.findElement(By.className("oxd-button"));
		Loginbtn.click();

	}

}
