package HandlingAlertPopup;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSimpleAlert {

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
		driver.get("https://demowebshop.tricentis.com/");
		
		//using Action class
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
	
		//gettext from alert
		String alerttxt=driver.switchTo().alert().getText();
		System.out.println(alerttxt);
		
		//accepting alert
		driver.switchTo().alert().accept();
		
		

	}

}
