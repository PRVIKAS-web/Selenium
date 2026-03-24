package assignment;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlerts {

	public static void main(String[] args)
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize The Window
		driver.manage().window().maximize();

		// Creating Object for Action Class
		Actions act = new Actions(driver);

		// Navigate To URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Handling Js Alert
		act.sendKeys(Keys.TAB,Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		String Jsalert=driver.switchTo().alert().getText();
		System.out.println(Jsalert);
		driver.switchTo().alert().accept();
		
		
		
		//Handling Js Confirm
		act.sendKeys(Keys.TAB,Keys.ENTER).perform();
		
		String Jsconfirm=driver.switchTo().alert().getText();
		System.out.println(Jsconfirm);
		driver.switchTo().alert().accept();
		
		
		//Handling Js prompt
		act.sendKeys(Keys.TAB,Keys.ENTER).perform();
		String Jsprmopt=driver.switchTo().alert().getText();
		System.out.println(Jsprmopt);
		driver.switchTo().alert().sendKeys("Vicky");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
	}

}
