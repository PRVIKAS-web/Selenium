package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkText {

	public static void main(String[] args)
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://www.facebook.com/");
		
		//Using LinkText
		//WebElement ForgottenPassword=driver.findElement(By.linkText("Forgotten password?"));
		//ForgottenPassword.click();
		
		WebElement ForgottenPassword1=driver.findElement(By.partialLinkText("Forgotten"));
		ForgottenPassword1.click();
		

	}

}
