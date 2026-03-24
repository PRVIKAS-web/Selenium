package LearningLocator;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox {

	public static void main(String[] args) 
	{
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the Text : ");
		        String text=sc.next();
		        
		
		        //Launch The Browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize The Window
				driver.manage().window().maximize();
				
				//Navigate To URL
				driver.get("https://www.google.com/");
				
				WebElement searchbox=driver.findElement(By.tagName("textarea"));
				searchbox.sendKeys(text);
				
				driver.close();


	}

}
