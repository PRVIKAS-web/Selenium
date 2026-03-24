package learnlocator;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningID {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product:::");
		
		String product=sc.next();
		
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
        WebElement searchbox=driver.findElement(By.id("small-searchterms"));
        
        searchbox.sendKeys("Computer");
        
        searchbox.sendKeys(product);
        
        driver.close();

	}

}
