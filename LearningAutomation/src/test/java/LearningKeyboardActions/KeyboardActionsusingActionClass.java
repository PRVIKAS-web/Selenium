package LearningKeyboardActions;

import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsusingActionClass {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Creating Object for Action Class
		Actions act = new Actions(driver);

		// Navigate To URL
		driver.get("https://www.amazon.in/");
		
		
		//using Action class
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).perform();
		
		//input to the search box
		act.sendKeys("Tshirt").perform();
		
		//enter using 
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		

	}

}
