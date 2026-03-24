package LearningJavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args)
	{
		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//
		Actions act=new Actions(driver);
		
		//Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");
		
		

	}

}
