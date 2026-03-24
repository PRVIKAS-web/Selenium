package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingaxesmethods_Amazon {

	public static void main(String[] args) 
	{
		// Launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize The Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://www.amazon.in/");

		// searchbox

		WebElement searchbox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchbox.sendKeys("tshirts for men");
		
		WebElement searchbutton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.click();
		
		//WebElement continuebutton= driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		//continuebutton.click();
		
		WebElement firstproduct= driver.findElement(By.xpath("(//a[contains(text(), \"Max Mens Cotton Regular Fit Solid Polo T-Shirt\")])[1]"));
		firstproduct.click();
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();

		
		

		
		

		
		
		

	}

}
