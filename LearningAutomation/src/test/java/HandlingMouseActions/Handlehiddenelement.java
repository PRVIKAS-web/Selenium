package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlehiddenelement {

	public static void main(String[] args) 
	{

		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//Creating Object for Action Class
		Actions act=new Actions(driver);
		
		//Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify webelement
		WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Com')]"));
		
		//mouse Hover and click action
		//without arguments
		 act.moveToElement(computer).click().perform();
		//act.moveToElement(computer).doubleClick().perform();
		//act.moveToElement(computer).contextClick().perform();
		 
		 
		 //with arguments
		
		//act.click(computer).perform();
		
		//act.doubleClick(computer).perform();
		
		//act.contextClick(computer).perform();
		
		//https://www.globalsqa.com/demo-site/draganddrop/
		 //https://demo.automationtesting.in/Static.html
		
	
		

	}

}
