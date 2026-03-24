package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingXPath {

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
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
		searchButton.click();
		
		//a[text()='Health Book']/../..//div[3]//div[1]//span[@class="price old-price"]
		
		WebElement actualPrice=driver.findElement(By.xpath("//a[text()='Health Book']/../..//div[3]//div[1]//span[@class='price old-price']"));
		System.out.println("actualPrice:"+actualPrice.getText());
		
		WebElement discountPrice=driver.findElement(By.xpath("//a[text()='Health Book']/../..//div[3]//div[1]//span[@class='price actual-price']"));
		System.out.println("discountPrice:"+discountPrice.getText());

		
		
		
		

		
		

	}

}
