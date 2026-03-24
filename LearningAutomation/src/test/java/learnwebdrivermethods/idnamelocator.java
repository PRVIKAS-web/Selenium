package learnwebdrivermethods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idnamelocator {

	public static void main(String[] args) 
	{
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the product:::");
		        String product=sc.next();
		
		
		        // Launch The Browser
				WebDriver driver = new ChromeDriver();

				// Maximize The Window
				driver.manage().window().maximize();
				
				// Navigate To URL
				driver.get("https://www.amazon.in/");
				
				//searchbox
				WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
				
				searchbox.sendKeys(product);

	}

}
