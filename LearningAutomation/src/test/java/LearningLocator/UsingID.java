package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingID {
public static void main(String[] args) 
{
	//Launch The Browser
	WebDriver driver=new ChromeDriver();
	
	//Maximize The Window
	driver.manage().window().maximize();
	
	//Navigate To URL
	driver.get("https://demowebshop.tricentis.com/");
	
	//Identify Using Id Locator
	WebElement searchbox=driver.findElement(By.id("small-searchterms"));
	
	//Enter Input Into The SearchBox
	searchbox.sendKeys("Book");
	
	
}
}
