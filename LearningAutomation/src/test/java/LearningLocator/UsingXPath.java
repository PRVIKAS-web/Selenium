package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXPath {

	public static void main(String[] args) 
	{
		//Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//Navigate To URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify Using Id Locator
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		//Enter Input Into The SearchBox
		searchbox.sendKeys("Book");
		
		//click on search Button
		WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
		searchButton.click();
		 
		//Display Productname
		String Productname=driver.findElement(By.xpath("//a[text()='Health Book']")).getText();
		System.out.println("Product name:: "+Productname);
		
		
		

	}

}
